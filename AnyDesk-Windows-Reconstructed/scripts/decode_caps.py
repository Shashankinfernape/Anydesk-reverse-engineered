import json

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\extracted\lib\arm64-v8a\libadext.so", "rb") as f:
    elf = f.read()

addrs = [
    0x0054d41e, 0x00530600, 0x0050e73f, 0x0053edee, 0x00505d4c, 0x0053935c,
    0x0051155b, 0x0053936e, 0x0055331a, 0x00527c51, 0x00511570, 0x0052a8b1
]
for i, a in enumerate(addrs):
    raw_addr = a - 0x100000
    s = elf[raw_addr:].split(b"\x00", 1)[0].decode("latin1", errors="replace")
    print(f"Bit {i:2d} (mask 0x{1<<i:04X}): \"{s}\"")
