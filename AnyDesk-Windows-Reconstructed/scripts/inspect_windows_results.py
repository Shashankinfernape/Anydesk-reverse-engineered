import json

with open(r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\windows\windows_deskrt_decompiled.json", "r") as f:
    data = json.load(f)

for k, v in data.items():
    code = v["c_code"]
    addr = v["address"]
    print(f"=== {k} (VA {addr}) [{len(code):,} chars] ===")
    lines = [line.strip() for line in code.split("\n") if line.strip() and not line.strip().startswith("/*") and not line.strip().startswith("*")]
    print("\n".join(lines[:10]))
    print()
