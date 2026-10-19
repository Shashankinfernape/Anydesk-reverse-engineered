import struct, sys

PATH = r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_unpacked_core.dll'

with open(PATH, 'rb') as f:
    data = f.read()

# Parse DOS + PE header
pe_off = struct.unpack_from('<I', data, 0x3C)[0]
sig = data[pe_off:pe_off+4]
machine = struct.unpack_from('<H', data, pe_off+4)[0]
num_sections = struct.unpack_from('<H', data, pe_off+6)[0]
opt_hdr_size = struct.unpack_from('<H', data, pe_off+20)[0]
magic = struct.unpack_from('<H', data, pe_off+24)[0]

print(f"=== PE HEADER ===")
print(f"Signature:      {sig}")
print(f"Machine:        0x{machine:04X} ({'x86' if machine==0x14c else 'x64'})")
print(f"Sections:       {num_sections}")
print(f"OptHdr Size:    {opt_hdr_size}")
print(f"Magic:          0x{magic:04X} ({'PE32' if magic==0x10b else 'PE32+'})")

# Optional header (PE32)
oh = pe_off + 24
image_base = struct.unpack_from('<I', data, oh+28)[0]
entry_point = struct.unpack_from('<I', data, oh+16)[0]
size_of_image = struct.unpack_from('<I', data, oh+56)[0]

print(f"\n=== OPTIONAL HEADER ===")
print(f"ImageBase:      0x{image_base:08X}")
print(f"EntryPoint RVA: 0x{entry_point:08X}  (VA: 0x{image_base+entry_point:08X})")
print(f"SizeOfImage:    0x{size_of_image:08X} ({size_of_image/1024/1024:.1f} MB)")

# Data directories
dd_off = oh + 96
exports_rva, exports_sz = struct.unpack_from('<II', data, dd_off)
imports_rva, imports_sz = struct.unpack_from('<II', data, dd_off+8)
print(f"\n=== DATA DIRECTORIES ===")
print(f"Export Dir RVA: 0x{exports_rva:08X}  Size: {exports_sz}")
print(f"Import Dir RVA: 0x{imports_rva:08X}  Size: {imports_sz}")

# Section headers
sec_off = pe_off + 24 + opt_hdr_size
print(f"\n=== SECTIONS ({num_sections}) ===")
print(f"{'Name':<10} {'VirtAddr':>10} {'VirtSize':>10} {'RawOff':>10} {'RawSize':>10} {'Chars':>10}")
for i in range(num_sections):
    s = sec_off + i*40
    name = data[s:s+8].rstrip(b'\x00').decode('ascii', errors='replace')
    vsize, vaddr, raw_sz, raw_off = struct.unpack_from('<IIII', data, s+8)
    chars = struct.unpack_from('<I', data, s+36)[0]
    print(f"{name:<10} 0x{vaddr:08X} 0x{vsize:08X} 0x{raw_off:08X} 0x{raw_sz:08X} 0x{chars:08X}")

# Parse exports
if exports_rva and exports_sz:
    def rva_to_offset(rva):
        # Walk sections
        for i in range(num_sections):
            s = sec_off + i*40
            vsize, vaddr, raw_sz, raw_off = struct.unpack_from('<IIII', data, s+8)
            if vaddr <= rva < vaddr + vsize:
                return raw_off + (rva - vaddr)
        return None
    
    eoff = rva_to_offset(exports_rva)
    if eoff:
        num_funcs = struct.unpack_from('<I', data, eoff+20)[0]
        num_names = struct.unpack_from('<I', data, eoff+24)[0]
        addr_table_rva = struct.unpack_from('<I', data, eoff+28)[0]
        name_table_rva = struct.unpack_from('<I', data, eoff+32)[0]
        ordinal_table_rva = struct.unpack_from('<I', data, eoff+36)[0]
        name_rva = struct.unpack_from('<I', data, eoff+12)[0]
        dll_name_off = rva_to_offset(name_rva)
        dll_name = data[dll_name_off:dll_name_off+64].split(b'\x00')[0].decode('ascii', errors='replace') if dll_name_off else '?'
        
        print(f"\n=== EXPORTS (DLL: {dll_name}) ===")
        print(f"Functions: {num_funcs}, Named: {num_names}")
        
        name_table_off = rva_to_offset(name_table_rva)
        addr_table_off = rva_to_offset(addr_table_rva)
        ord_table_off  = rva_to_offset(ordinal_table_rva)
        
        for i in range(min(num_names, 50)):
            name_rva_i = struct.unpack_from('<I', data, name_table_off + i*4)[0]
            name_off = rva_to_offset(name_rva_i)
            name = data[name_off:name_off+128].split(b'\x00')[0].decode('ascii', errors='replace') if name_off else '?'
            ordinal = struct.unpack_from('<H', data, ord_table_off + i*2)[0]
            func_rva = struct.unpack_from('<I', data, addr_table_off + ordinal*4)[0]
            print(f"  [{i:3d}] 0x{func_rva:08X}  {name}")
        if num_names > 50:
            print(f"  ... and {num_names-50} more exports")

# Parse imports
if imports_rva and imports_sz:
    def rva_to_offset(rva):
        for i in range(num_sections):
            s = sec_off + i*40
            vsize, vaddr, raw_sz, raw_off = struct.unpack_from('<IIII', data, s+8)
            if vaddr <= rva < vaddr + vsize:
                return raw_off + (rva - vaddr)
        return None
    
    print(f"\n=== IMPORTS ===")
    idir = rva_to_offset(imports_rva)
    idx = 0
    while True:
        entry = data[idir + idx*20 : idir + idx*20 + 20]
        if entry == b'\x00'*20:
            break
        orig_thunk, ts, fwd, name_rva_i, thunk = struct.unpack_from('<IIIII', data, idir + idx*20)
        name_off = rva_to_offset(name_rva_i)
        dll = data[name_off:name_off+64].split(b'\x00')[0].decode('ascii', errors='replace') if name_off else '?'
        # Count imports from this DLL
        thunk_off = rva_to_offset(orig_thunk or thunk)
        count = 0
        if thunk_off:
            while True:
                th = struct.unpack_from('<I', data, thunk_off + count*4)[0]
                if th == 0: break
                count += 1
        print(f"  {dll:<40}  ({count} imports)")
        idx += 1

print("\nDone.")
