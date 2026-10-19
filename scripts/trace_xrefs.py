import struct

ELF_PATH = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\extracted\lib\arm64-v8a\libadext.so"

with open(ELF_PATH, "rb") as f:
    elf = f.read()

targets = [b'relay_connect_msg_t', b'relay_connector', b'ad.anynet.direct', b'ad.anynet.boot_addrs', b'deskrt']
string_addrs = {}
for t in targets:
    pos = 0
    addrs = []
    while True:
        idx = elf.find(t + b'\x00', pos)
        if idx == -1:
            idx2 = elf.find(t, pos)
            if idx2 == -1:
                break
            addrs.append(idx2)
            pos = idx2 + len(t)
        else:
            addrs.append(idx)
            pos = idx + len(t) + 1
    string_addrs[t.decode()] = addrs
    print(f'{t.decode()}: found at {[hex(a) for a in addrs]}')

text_start = 0x00EBC000
text_end = 0x01E962F0

print('\nScanning ARM64 .text (16 MB) for ADRP + ADD / LDR references...')
refs = []
for i in range(text_start, text_end - 4, 4):
    insn = struct.unpack_from('<I', elf, i)[0]
    if (insn & 0x9F000000) == 0x90000000: # ADRP
        immlo = (insn >> 29) & 3
        immhi = (insn >> 5) & 0x7FFFF
        imm = (immhi << 2) | immlo
        if imm & 0x100000:
            imm -= 0x200000
        page = (i & ~0xFFF) + (imm << 12)
        rd = insn & 0x1F
        
        # Check next instruction for ADD (0x91000000)
        next_insn = struct.unpack_from('<I', elf, i + 4)[0]
        if (next_insn & 0xFF800000) == 0x91000000:
            rn = (next_insn >> 5) & 0x1F
            if rn == rd:
                imm12 = (next_insn >> 10) & 0xFFF
                target_addr = page + imm12
                for s_name, s_addrs in string_addrs.items():
                    if target_addr in s_addrs:
                        refs.append((s_name, target_addr, i))
                        print(f'Match! \"{s_name}\" (0x{target_addr:08X}) referenced at 0x{i:08X}')

print(f'\nTotal references found: {len(refs)}')
