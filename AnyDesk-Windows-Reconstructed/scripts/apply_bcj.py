import struct

def x86_convert(data: bytearray, ip: int = 0, encoding: int = 0):
    kMaskToAllowedStatus = [1, 1, 1, 0, 1, 0, 0, 0]
    kMaskToBitNumber = [0, 1, 2, 2, 3, 3, 3, 3]
    
    size = len(data)
    if size < 5:
        return data
    
    buffer_pos = 0
    prev_mask = 0
    prev_pos = -1
    limit = size - 4
    
    while buffer_pos < limit:
        # Search for 0xE8 (CALL) or 0xE9 (JMP)
        b = data[buffer_pos]
        if (b & 0xFE) != 0xE8:
            buffer_pos += 1
            continue
            
        offset = buffer_pos - prev_pos
        prev_pos = buffer_pos
        
        if offset < 4:
            prev_mask = (prev_mask << (offset - 1)) & 7
            if prev_mask != 0:
                b_check = data[buffer_pos + 4 - kMaskToBitNumber[prev_mask]]
                if kMaskToAllowedStatus[prev_mask] and b_check != 0 and b_check != 0xFF:
                    pass
                else:
                    prev_mask = ((prev_mask & 3) << 1) | 1
                    buffer_pos += 1
                    continue
        else:
            prev_mask = 0
            
        b4 = data[buffer_pos + 4]
        if b4 == 0 or b4 == 0xFF:
            src = struct.unpack_from('<i', data, buffer_pos + 1)[0]
            while True:
                if encoding == 0:
                    dest = src - (ip + buffer_pos + 5)
                else:
                    dest = src + (ip + buffer_pos + 5)
                dest &= 0xFFFFFFFF
                
                if prev_mask == 0:
                    break
                shift = (3 - kMaskToBitNumber[prev_mask]) * 8
                b_shift = (dest >> shift) & 0xFF
                if b_shift != 0 and b_shift != 0xFF:
                    break
                dest ^= (1 << (shift + 8)) - 1
                
            struct.pack_into('<I', data, buffer_pos + 1, dest)
            buffer_pos += 5
        else:
            prev_mask = ((prev_mask & 3) << 1) | 1
            buffer_pos += 1
            
    return data

with open(r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\unpacked_raw.bin', 'rb') as f:
    raw = bytearray(f.read())

print("Applying x86 BCJ reverse filter...")
converted = x86_convert(raw, ip=0, encoding=0)

out_path = r'C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_core_unpacked.dll'
with open(out_path, 'wb') as f:
    f.write(converted)

print(f"Successfully unpacked clean core binary: {out_path} ({len(converted):,} bytes)")
