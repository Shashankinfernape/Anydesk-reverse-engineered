import struct, sys

IN  = r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\unpacked_raw.bin'
OUT = r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_unpacked_core.dll'

print('Loading unpacked_raw.bin ...')
with open(IN, 'rb') as f:
    data = bytearray(f.read())

sz = len(data)
print(f'Loaded {sz:,} bytes. Applying x86 BCJ inverse filter...')

# x86 BCJ inverse filter (encoding=0, decoding pass)
MASK_ALLOWED = [1,1,1,0,1,0,0,0]
MASK_BITNUM  = [0,1,2,2,3,3,3,3]

limit = sz - 4
prev_mask = 0
prev_pos = -1
pos = 0

while pos < limit:
    b = data[pos]
    if (b & 0xFE) != 0xE8:
        pos += 1
        continue

    offset = pos - prev_pos
    prev_pos = pos

    if offset < 4:
        prev_mask = (prev_mask << (offset - 1)) & 7
        if prev_mask != 0:
            bc = data[pos + 4 - MASK_BITNUM[prev_mask]]
            if not (MASK_ALLOWED[prev_mask] and bc != 0 and bc != 0xFF):
                prev_mask = ((prev_mask & 3) << 1) | 1
                pos += 1
                continue
    else:
        prev_mask = 0

    b4 = data[pos + 4]
    if b4 == 0 or b4 == 0xFF:
        src = struct.unpack_from('<I', data, pos + 1)[0]
        dest = (src - (pos + 5)) & 0xFFFFFFFF

        if prev_mask == 0:
            struct.pack_into('<I', data, pos + 1, dest)
            pos += 5
            continue

        shift = (3 - MASK_BITNUM[prev_mask]) * 8
        bs = (dest >> shift) & 0xFF
        if bs != 0 and bs != 0xFF:
            struct.pack_into('<I', data, pos + 1, dest)
            pos += 5
            continue

        dest ^= ((1 << (shift + 8)) - 1)
        struct.pack_into('<I', data, pos + 1, dest)
        pos += 5
    else:
        prev_mask = ((prev_mask & 3) << 1) | 1
        pos += 1

print(f'BCJ filter done. Writing {sz:,} bytes...')
with open(OUT, 'wb') as f:
    f.write(data)
print('Written:', OUT)

# Verify PE header
with open(OUT, 'rb') as f:
    hdr = f.read(512)

assert hdr[:2] == b'MZ', 'NOT an MZ header!'
pe_off = struct.unpack_from('<I', hdr, 0x3C)[0]
sig = hdr[pe_off:pe_off+4]
machine = struct.unpack_from('<H', hdr, pe_off + 4)[0]
arch = 'x86' if machine == 0x14c else 'x64' if machine == 0x8664 else hex(machine)
print(f'PE sig: {sig} | Machine: 0x{machine:04X} ({arch})')
print('SUCCESS: AnyDesk_unpacked_core.dll is a valid PE!')
