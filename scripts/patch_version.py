#!/usr/bin/env python3
"""
AnyDesk Version String Patcher
-------------------------------
Patches '9.8.2' -> '9.7.6' and 'release/win_9.8.2' -> 'release/win_9.7.6'
in unpacked_raw.bin, then fully repacks into AnyDesk_version_patched.exe
using the same LCG+LZMA pipeline as repack_anydesk.py.

Key fix over previous attempt: use lzma.FORMAT_RAW with explicit filters dict
and skip the props header when feeding to decompressor (AnyDesk stub reads
its own hardcoded props, does NOT read them from the stream).
"""

import os, sys, struct, lzma, shutil, re

ORIG_EXE   = r"C:\Users\user\Desktop\El projecto\Git-repos\AnyDesk.exe"
RAW_BIN    = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\unpacked_raw.bin"
OUT_EXE    = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_version_patched.exe"

DATA_OFFSET   = 0x3400
TRUNCATE_SIZE = 0x00823400
DATA_RAW_SIZE = 0x0081B400

LCG_SEED  = 0x24BA
LCG_MUL   = 0x19660D
LCG_ADD   = 0x3C6EF35F

LZMA_FILTERS = [{"id": lzma.FILTER_LZMA1, "lc": 3, "lp": 0, "pb": 2, "dict_size": 64*1024*1024}]
LZMA_PROPS   = b"\x5d\x00\x00\x00\x04"  # prepended before encrypted stream

def lcg_crypt(data: bytearray, seed: int) -> bytearray:
    s = seed
    out = bytearray(len(data))
    for i in range(len(data)):
        s = (s * LCG_MUL + LCG_ADD) & 0xFFFFFFFF
        out[i] = data[i] ^ ((s >> 12) & 0xFF)
    return out

def main():
    print("=" * 60)
    print(" AnyDesk Version String Patcher")
    print("=" * 60)

    # ── Step 1: Patch unpacked_raw.bin in memory ─────────────────
    print("\n[1/5] Loading unpacked_raw.bin...")
    raw = bytearray(open(RAW_BIN, "rb").read())
    print(f"      {len(raw):,} bytes loaded")

    patches = [
        (b"release/win_9.8.2", b"release/win_9.7.6"),
        (b"AnyDesk/9.8.2",     b"AnyDesk/9.7.6"),   # User-Agent header string
        (b"9.8.2\x00",         b"9.7.6\x00"),        # Null-terminated UI label
    ]

    for old, new in patches:
        assert len(old) == len(new), "patch lengths must match"
        count = 0
        idx = 0
        while True:
            pos = raw.find(old, idx)
            if pos == -1:
                break
            raw[pos:pos+len(old)] = new
            print(f"      Patched '{old.decode()}' -> '{new.decode()}' at raw offset 0x{pos:08X}")
            count += 1
            idx = pos + len(old)
        if count == 0:
            print(f"      WARNING: '{old.decode()}' not found in raw binary")

    # Verify no more 9.8.2 left
    remaining = [m.start() for m in re.finditer(b"9\\.8\\.2", bytes(raw))]
    if remaining:
        print(f"      WARNING: {len(remaining)} occurrences of '9.8.2' remain at: {[hex(x) for x in remaining]}")
    else:
        print("      All '9.8.2' occurrences patched — clean!")

    # ── Step 2: LZMA compress ────────────────────────────────────
    print("\n[2/5] LZMA compressing patched payload...")
    comp = lzma.compress(bytes(raw), format=lzma.FORMAT_RAW, filters=LZMA_FILTERS)
    print(f"      Compressed: {len(comp):,} bytes (0x{len(comp):08X})")

    # Verify Python can roundtrip it
    dec_check = lzma.decompress(comp, format=lzma.FORMAT_RAW, filters=LZMA_FILTERS)
    assert dec_check == bytes(raw), "LZMA roundtrip FAILED"
    print("      LZMA roundtrip self-test: PASSED")

    # ── Step 3: LCG encrypt (props + compressed stream) ──────────
    print("\n[3/5] LCG encrypting...")
    enc_payload = lcg_crypt(bytearray(LZMA_PROPS + comp), LCG_SEED)
    enc_len  = len(enc_payload)
    comp_len = len(comp)
    print(f"      Encrypted payload: {enc_len:,} bytes")

    if enc_len > DATA_RAW_SIZE:
        raise ValueError(f"Encrypted payload ({enc_len}) > .data raw size ({DATA_RAW_SIZE})")

    padded = enc_payload + b"\x00" * (DATA_RAW_SIZE - enc_len)

    # ── Step 4: Inject into original stub ───────────────────────
    print(f"\n[4/5] Injecting into stub from: {ORIG_EXE}")
    exe = bytearray(open(ORIG_EXE, "rb").read())

    exe[DATA_OFFSET : DATA_OFFSET + DATA_RAW_SIZE] = padded

    # Fix size constants in stub
    struct.pack_into("<I", exe, 0x002AC9, comp_len)   # LZMA stream length
    struct.pack_into("<I", exe, 0x002800, enc_len)    # LCG encrypted length
    print(f"      Stub: LZMA len @ 0x2AC9 = 0x{comp_len:08X}, Enc len @ 0x2800 = 0x{enc_len:08X}")

    # Patch stub version strings (belt-and-suspenders)
    for old, new in [(b"release/win_9.8.2", b"release/win_9.7.6")]:
        idx = 0
        while True:
            pos = exe.find(old, idx)
            if pos == -1: break
            exe[pos:pos+len(old)] = new
            print(f"      Stub patch: '{old.decode()}' at 0x{pos:08X}")
            idx = pos + len(old)

    # Clear Authenticode Security Directory
    pe_off = struct.unpack_from("<I", exe, 0x3C)[0]
    sec_dir_off = pe_off + 24 + 96 + 32
    struct.pack_into("<II", exe, sec_dir_off, 0, 0)
    print(f"      Cleared PE Security Directory at 0x{sec_dir_off:08X}")

    # Truncate signature trailer
    exe = exe[:TRUNCATE_SIZE]
    print(f"      Truncated to 0x{TRUNCATE_SIZE:08X} = {len(exe):,} bytes")

    # ── Step 5: Write output ─────────────────────────────────────
    print(f"\n[5/5] Writing: {OUT_EXE}")
    open(OUT_EXE, "wb").write(exe)
    print(f"      Written: {os.path.getsize(OUT_EXE):,} bytes")

    print("\n" + "=" * 60)
    print(" DONE — version string patched exe ready!")
    print(f" Output: {OUT_EXE}")
    print("=" * 60)

if __name__ == "__main__":
    main()
