import json

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\android\deskrt_codec_decompiled.json", "r") as f:
    data = json.load(f)

for k, v in data.items():
    code = v["c_code"]
    print(f"==================================================")
    print(f"ROUTINE: {k}")
    print(f"ELF VA:  {v['elf_address']} | Ghidra VA: {v['ghidra_address']}")
    print(f"Size:    {len(code):,} characters")
    print(f"--------------------------------------------------")
    lines = [line.rstrip() for line in code.split("\n") if line.strip() and not line.strip().startswith("/*") and not line.strip().startswith("*")]
    print("\n".join(lines[:12]))
    print()
