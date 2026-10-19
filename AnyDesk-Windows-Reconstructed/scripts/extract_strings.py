import struct, sys, re

PATH = r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_unpacked_core.dll'

with open(PATH, 'rb') as f:
    data = f.read()

# Parse sections for RVA->offset
pe_off = struct.unpack_from('<I', data, 0x3C)[0]
num_sections = struct.unpack_from('<H', data, pe_off+6)[0]
opt_hdr_size = struct.unpack_from('<H', data, pe_off+20)[0]
sec_off = pe_off + 24 + opt_hdr_size
image_base = struct.unpack_from('<I', data, pe_off+24+28)[0]

sections = []
for i in range(num_sections):
    s = sec_off + i*40
    name = data[s:s+8].rstrip(b'\x00').decode('ascii', errors='replace')
    vsize, vaddr, raw_sz, raw_off = struct.unpack_from('<IIII', data, s+8)
    sections.append((name, vaddr, vsize, raw_off, raw_sz))

def rva_to_off(rva):
    for name, vaddr, vsize, raw_off, raw_sz in sections:
        if vaddr <= rva < vaddr + vsize:
            return raw_off + (rva - vaddr)
    return None

def off_to_rva(off):
    for name, vaddr, vsize, raw_off, raw_sz in sections:
        if raw_off <= off < raw_off + raw_sz:
            return vaddr + (off - raw_off)
    return None

# Search for interesting strings in the binary
TARGETS = [
    b'deskrt', b'DeskRT', b'DESKRT',
    b'IDXGIOutputDuplication', b'AcquireNextFrame', b'GetFrameDirtyRects',
    b'BitBlt', b'GetDC',
    b'ad.anynet', b'relay_connect', b'relay_server',
    b'WSAStartup', b'SSL_connect', b'SSL_write', b'SSL_read',
    b'ad.anynet.id', b'ad.anynet.boot_addrs', b'ad.anynet.cert',
    b'password', b'auth_token', b'two_factor',
    b'loader_entry', b'loader_main',
    b'AnyDesk', b'anydesk',
    b'SYSTEM\\', b'SOFTWARE\\AnyDesk',
    b'MediaProjection', b'AccessibilityService',
    b'connect failed', b'relay failed', b'connection established',
    b'encode', b'decode', b'compress', b'tile',
    b'session_id', b'peer_id', b'client_id',
]

print("=== KEY STRING FINDINGS IN UNPACKED CORE ===\n")
found = {}
for target in TARGETS:
    positions = []
    start = 0
    while True:
        idx = data.find(target, start)
        if idx == -1:
            break
        rva = off_to_rva(idx)
        # Get surrounding context (null-terminated string)
        end = data.find(b'\x00', idx)
        ctx = data[idx:min(idx+80, end if end != -1 else idx+80)].decode('ascii', errors='replace')
        positions.append((idx, rva, ctx))
        start = idx + 1
        if len(positions) >= 5:  # max 5 hits per target
            break
    if positions:
        found[target.decode('ascii', errors='replace')] = positions
        print(f"[{target.decode('ascii', errors='replace')}]  ({len(positions)} hits)")
        for off, rva, ctx in positions:
            rva_str = f"RVA 0x{rva:08X}" if rva else f"file@0x{off:08X}"
            print(f"  {rva_str}  \"{ctx[:60]}\"")
        print()

print(f"\nTotal unique string types found: {len(found)}")

# Also extract ALL printable strings >= 8 chars from .rdata section
print("\n=== SAMPLE .rdata STRINGS (first 100 strings >= 12 chars) ===")
rdata = next(((n,v,vs,ro,rs) for n,v,vs,ro,rs in sections if n=='.rdata'), None)
if rdata:
    name, vaddr, vsize, raw_off, raw_sz = rdata
    seg = data[raw_off:raw_off+raw_sz]
    strings = re.findall(rb'[\x20-\x7E]{12,}', seg)
    for i, s in enumerate(strings[:100]):
        try:
            decoded = s.decode('ascii')
            print(f"  {decoded}")
        except:
            pass
