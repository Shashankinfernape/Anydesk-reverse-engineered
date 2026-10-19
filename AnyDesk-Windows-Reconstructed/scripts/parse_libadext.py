import struct

ELF_PATH = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\extracted\lib\arm64-v8a\libadext.so"

with open(ELF_PATH, "rb") as f:
    elf = f.read()

assert elf[:4] == b'\x7fELF', "Not an ELF file"
ei_class = elf[4] # 2 = 64-bit
ei_data = elf[5]  # 1 = little-endian

e_shoff = struct.unpack_from("<Q", elf, 0x28)[0]
e_shentsize = struct.unpack_from("<H", elf, 0x3a)[0]
e_shnum = struct.unpack_from("<H", elf, 0x3c)[0]
e_shstrndx = struct.unpack_from("<H", elf, 0x3e)[0]

# Read section header string table
shstr_hdr = e_shoff + (e_shstrndx * e_shentsize)
shstr_offset = struct.unpack_from("<Q", elf, shstr_hdr + 0x18)[0]
shstr_size = struct.unpack_from("<Q", elf, shstr_hdr + 0x20)[0]
shstrtab = elf[shstr_offset : shstr_offset + shstr_size]

sections = []
for i in range(e_shnum):
    hdr = e_shoff + (i * e_shentsize)
    sh_name_idx = struct.unpack_from("<I", elf, hdr)[0]
    sh_type = struct.unpack_from("<I", elf, hdr + 0x04)[0]
    sh_flags = struct.unpack_from("<Q", elf, hdr + 0x08)[0]
    sh_addr = struct.unpack_from("<Q", elf, hdr + 0x10)[0]
    sh_offset = struct.unpack_from("<Q", elf, hdr + 0x18)[0]
    sh_size = struct.unpack_from("<Q", elf, hdr + 0x20)[0]
    sh_link = struct.unpack_from("<I", elf, hdr + 0x28)[0]
    sh_info = struct.unpack_from("<I", elf, hdr + 0x2c)[0]
    sh_entsize = struct.unpack_from("<Q", elf, hdr + 0x38)[0]
    
    name = shstrtab[sh_name_idx:].split(b'\x00', 1)[0].decode('latin1')
    sections.append({
        'idx': i, 'name': name, 'type': sh_type, 'flags': sh_flags,
        'addr': sh_addr, 'offset': sh_offset, 'size': sh_size,
        'link': sh_link, 'info': sh_info, 'entsize': sh_entsize
    })

print(f"Total sections: {len(sections)}")
for s in sections:
    if s['flags'] & 4 or s['name'] in ('.text', '.rodata', '.data', '.bss', '.dynsym', '.dynstr'):
        print(f"  {s['name']:<16} Addr: 0x{s['addr']:08X} Size: 0x{s['size']:08X} Offset: 0x{s['offset']:08X}")

# Find dynsym and dynstr
dynsym_sec = next((s for s in sections if s['type'] == 11), None) # SHT_DYNSYM
dynstr_sec = sections[dynsym_sec['link']] if dynsym_sec else None

if dynsym_sec and dynstr_sec:
    dynstr = elf[dynstr_sec['offset'] : dynstr_sec['offset'] + dynstr_sec['size']]
    sym_count = dynsym_sec['size'] // dynsym_sec['entsize']
    print(f"\nParsing {sym_count} dynamic symbols...")
    
    jni_methods = []
    for i in range(sym_count):
        sym_off = dynsym_sec['offset'] + (i * dynsym_sec['entsize'])
        st_name = struct.unpack_from("<I", elf, sym_off)[0]
        st_info = elf[sym_off + 4]
        st_other = elf[sym_off + 5]
        st_shndx = struct.unpack_from("<H", elf, sym_off + 6)[0]
        st_value = struct.unpack_from("<Q", elf, sym_off + 8)[0]
        st_size = struct.unpack_from("<Q", elf, sym_off + 16)[0]
        
        sym_name = dynstr[st_name:].split(b'\x00', 1)[0].decode('latin1', errors='replace')
        if "Java_com_anydesk" in sym_name or sym_name == "JNI_OnLoad":
            jni_methods.append({
                'name': sym_name, 'addr': st_value, 'size': st_size,
                'shndx': st_shndx, 'type': st_info & 0xf
            })
            
    print(f"Total JNI Methods exported: {len(jni_methods)}")
    jni_methods.sort(key=lambda x: x['addr'])
    for m in jni_methods[:25]:
        print(f"  0x{m['addr']:08X} (size {m['size']:4d}): {m['name']}")
