import re

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\android\extracted\lib\arm64-v8a\libadext.so", "rb") as f:
    elf = f.read()

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\android\arm64_decompiled_results.json", "r") as f:
    import json
    data = json.load(f)

c_code = data["deskrt_codec_capability_dispatch"]["c_code"]

matches = re.findall(r"uVar6\s*==\s*(0x[0-9a-fA-F]+|\d+).*?puVar5\s*=\s*&UNK_([0-9a-fA-F]+)", c_code, re.DOTALL)
print(f"Total capability mappings found: {len(matches)}")
for val_str, addr_str in matches:
    val = int(val_str, 0)
    addr = int(addr_str, 16) - 0x100000
    s = elf[addr:].split(b"\x00", 1)[0].decode("latin1", errors="replace")
    bit_idx = val.bit_length() - 1
    print(f"Bit {bit_idx:2d} (mask 0x{val:016X}): \"{s}\"")
