import struct

dll_path = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\windows\AnyDesk_unpacked_core.dll"
with open(dll_path, "rb") as f:
    dll = f.read()

targets = [
    b"desk_rt.area_tracker",
    b"capture.hash_map",
    b"base.change_map",
    b"base.fps_map",
    b"lossless_codec",
    b"deskrt",
    b"capture_pool",
    b"DeskRT"
]

image_base = 0x10000000

print(f"Total DLL size: {len(dll):,} bytes")
for target in targets:
    pos = 0
    found = False
    while True:
        pos = dll.find(target, pos)
        if pos == -1:
            break
        found = True
        str_va = image_base + pos
        print(f"\n[+] Found \"{target.decode(errors='ignore')}\" at offset 0x{pos:08X} (VA 0x{str_va:08X})")
        
        # Search for direct pointer references
        ptr_bytes = struct.pack("<I", str_va)
        xref_pos = 0
        xrefs = []
        while True:
            xref_pos = dll.find(ptr_bytes, xref_pos)
            if xref_pos == -1:
                break
            xrefs.append((xref_pos, image_base + xref_pos))
            xref_pos += 1
            if len(xrefs) >= 10:
                break
        
        if xrefs:
            for off, va in xrefs:
                print(f"    Direct Xref @ offset 0x{off:08X} (VA 0x{va:08X})")
        else:
            print("    No direct 32-bit pointer xrefs found.")
        pos += len(target)
    if not found:
        print(f"[-] \"{target.decode(errors='ignore')}\" not found.")
