def lcg_decrypt(seed, ciphertext_bytes):
    state = seed & 0xFFFFFFFF
    out = bytearray()
    for b in ciphertext_bytes:
        state = (state * 0x19660D + 0x3C6EF35F) & 0xFFFFFFFF
        k = (state >> 12) & 0xFF
        out.append(b ^ k)
    return out

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\AnyDesk.exe", "rb") as f:
    exe_data = f.read()

# .rdata is at raw offset 0x2e00, VA 0x219d000
# Offset from VA to raw offset: 0x219d000 - 0x2e00 = 0x219a200
def va_to_file(va):
    return va - 0x219a200

# Kernel32 APIs from FUN_00401620:
apis = [
    (0x40704011, 0x0219d10c, 0x16),
    (0x29a1a909, 0x0219d124, 10),
    (0x13cbcee9, 0x0219d130, 0xc),
    (0x17ce53be, 0x0219d140, 0x18),
    (0x26b30b69, 0x0219d15c, 0xf),
    (0x3d924530, 0x0219d16c, 0x12),
    (0x2236409a, 0x0219d180, 7),
    (0x149ccd04, 0x0219d188, 0x14),
    (0x673ebfe9, 0x0219d1a0, 0x11),
    (0x68d29b96, 0x0219d1b4, 0x11),
    (0x7db65c79, 0x0219d1c8, 0x16),
    (0x65fa79df, 0x0219d1e0, 0x13),
    # And FUN_00401409:
    (0x6860b00b, 0x0219d05c, 9),
    (0x541a054f, 0x0219d068, 0xb),
    (0x799e20ac, 0x0219d074, 8),
    (0x5e66895c, 0x0219d080, 0xe),
    (0x1d26fff7, 0x0219d090, 0xb),
    (0x2fe25153, 0x0219d09c, 0xf),
    (0x65ccfb09, 0x0219d0ac, 0xe),
    (0x4bda2160, 0x0219d0bc, 0x10),
    (0x0569fe49, 0x0219d0ec, 0x12),
]

print("=== ASCII APIs ===")
for seed, va, length in apis:
    foffset = va_to_file(va)
    raw = exe_data[foffset:foffset+length]
    dec = lcg_decrypt(seed, raw)
    try:
        s = dec.decode('ascii')
    except:
        s = repr(dec)
    print(f"Seed: 0x{seed:08X} VA: 0x{va:08X} Len: {length:2d} -> '{s}'")

print("\n=== WIDE STRINGS ===")
wide_apis = [
    (0x3114b604, 0x0219d100, 10),
    (0x0dbf6838, 0x0219d048, 0x10),
]
for seed, va, length in wide_apis:
    foffset = va_to_file(va)
    raw = exe_data[foffset:foffset+length]
    dec = lcg_decrypt(seed, raw)
    try:
        s = dec.decode('utf-16le', errors='replace')
    except:
        s = repr(dec)
    print(f"WIDE Seed: 0x{seed:08X} VA: 0x{va:08X} Len: {length:2d} -> '{s}'")
