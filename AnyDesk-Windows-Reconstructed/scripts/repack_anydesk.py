#!/usr/bin/env python3
"""
AnyDesk Windows Executable Repacker & Patcher
---------------------------------------------
Reconstructs, patches, and repacks AnyDesk.exe using its native:
1. x86 BCJ branch filter / raw core injection
2. LZMA raw stream compression (lc=3, lp=0, pb=2, dict=64MB)
3. 32-bit LCG stream cipher (seed 0x24BA, poly 0x19660D / 0x3C6EF35F)
4. PE section header & unpacker stub size fixups
5. PE Authenticode Security Directory clearance
"""

import os
import sys
import struct
import lzma
import argparse

DEFAULT_EXE  = r"C:\Users\user\Desktop\El projecto\Git-repos\AnyDesk.exe"
DEFAULT_RAW  = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\unpacked_raw.bin"
DEFAULT_OUT  = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\AnyDesk_rebuilt.exe"

def repack_anydesk(orig_exe_path, raw_core_path, out_exe_path, patch_relay=None, verify=True):
    print("=" * 60)
    print(" AnyDesk Windows Executable Repacker")
    print("=" * 60)

    # 1. Load unpacked core raw payload
    print(f"\n[1/5] Loading raw core binary: {raw_core_path}")
    if not os.path.exists(raw_core_path):
        raise FileNotFoundError(f"Missing core raw binary: {raw_core_path}")

    with open(raw_core_path, "rb") as f:
        core_data = bytearray(f.read())
    print(f"      Loaded {len(core_data):,} bytes (0x{len(core_data):08X})")

    # 2. Apply patches if requested
    if patch_relay:
        old_str = b"boot.net.anydesk.com"
        new_str = patch_relay.encode("ascii")
        if len(new_str) > len(old_str):
            raise ValueError(f"Relay hostname too long! Max {len(old_str)} characters: '{patch_relay}'")
        # Pad with null bytes if shorter
        new_str = new_str.ljust(len(old_str), b"\x00")

        patches_count = 0
        idx = 0
        while True:
            pos = core_data.find(old_str, idx)
            if pos == -1:
                break
            core_data[pos : pos + len(new_str)] = new_str
            print(f"      [PATCH] Replaced '{old_str.decode()}' -> '{patch_relay}' at offset 0x{pos:08X}")
            patches_count += 1
            idx = pos + len(new_str)
        print(f"      Total relay string occurrences patched: {patches_count}")
    else:
        print("      No relay patch requested (using original configuration)")

    # 3. Compress with LZMA RAW stream (same parameters as original AnyDesk stub)
    print("\n[2/5] Compressing core payload with LZMA raw stream...")
    print("      Filters: LZMA1, lc=3, lp=0, pb=2, dict_size=64MB")
    filters = [{
        "id": lzma.FILTER_LZMA1,
        "lc": 3,
        "lp": 0,
        "pb": 2,
        "dict_size": 64 * 1024 * 1024
    }]
    compressor = lzma.LZMACompressor(format=lzma.FORMAT_RAW, filters=filters)
    compressed = compressor.compress(core_data) + compressor.flush()
    comp_len = len(compressed)
    print(f"      Compressed size: {comp_len:,} bytes (0x{comp_len:08X})")

    # Prepend 5-byte LZMA properties header (5d 00 00 00 04)
    props = b"\x5d\x00\x00\x00\x04"
    enc_payload = bytearray(props + compressed)
    enc_len = len(enc_payload)

    # 4. Encrypt with LCG cipher (seed 0x24ba)
    print(f"\n[3/5] Encrypting {enc_len:,} bytes with 32-bit LCG stream cipher (seed 0x24BA)...")
    state = 0x24BA
    for i in range(enc_len):
        state = (state * 0x19660D + 0x3C6EF35F) & 0xFFFFFFFF
        enc_payload[i] ^= (state >> 12) & 0xFF

    # Pad .data section to match original raw section size (0x0081B400 = 8,500,224 bytes)
    DATA_RAW_SIZE = 0x0081B400
    if enc_len > DATA_RAW_SIZE:
        raise ValueError(f"Compressed payload ({enc_len} bytes) exceeds .data section raw capacity ({DATA_RAW_SIZE} bytes)")
    
    padded_data = enc_payload + b"\x00" * (DATA_RAW_SIZE - enc_len)
    print(f"      Padded payload to .data raw size: {len(padded_data):,} bytes")

    # 5. Inject into original AnyDesk executable stub and fix headers
    print(f"\n[4/5] Reading unpacker stub from: {orig_exe_path}")
    with open(orig_exe_path, "rb") as f:
        exe = bytearray(f.read())

    # Write encrypted .data section starting at offset 0x3400
    DATA_OFFSET = 0x3400
    exe[DATA_OFFSET : DATA_OFFSET + DATA_RAW_SIZE] = padded_data
    print(f"      Injected payload at file offset 0x{DATA_OFFSET:04X}..0x{DATA_OFFSET + DATA_RAW_SIZE:06X}")

    # Fix stub size constants:
    # 0x002AC9: Compressed LZMA stream size
    struct.pack_into("<I", exe, 0x002AC9, comp_len)
    print(f"      Fixed stub LZMA decompressor size at 0x002AC9 -> {comp_len:,} (0x{comp_len:08X})")

    # 0x002800: LCG encrypted payload size
    struct.pack_into("<I", exe, 0x002800, enc_len)
    print(f"      Fixed stub LCG decryptor size at 0x002800 -> {enc_len:,} (0x{enc_len:08X})")

    # Clear Authenticode Security Directory entry in PE Optional Header
    pe_off = struct.unpack_from("<I", exe, 0x3C)[0]
    sec_dir_offset = pe_off + 24 + 96 + 32
    struct.pack_into("<II", exe, sec_dir_offset, 0, 0)
    print(f"      Cleared PE Security Directory (RVA=0, Size=0) to prevent signature error")

    # Truncate old signature trailer (file ends at 0x00823400)
    TRUNCATE_SIZE = 0x00823400
    exe = exe[:TRUNCATE_SIZE]
    print(f"      Cleaned executable size: {len(exe):,} bytes (0x{len(exe):08X})")

    # Write output executable
    with open(out_exe_path, "wb") as f:
        f.write(exe)
    print(f"      Successfully written rebuilt executable: {out_exe_path}")

    # 6. Verification self-test
    if verify:
        print("\n[5/5] Running self-test validation on rebuilt executable...")
        with open(out_exe_path, "rb") as f:
            v_exe = f.read()

        v_enc_len = struct.unpack_from("<I", v_exe, 0x002800)[0]
        v_comp_len = struct.unpack_from("<I", v_exe, 0x002AC9)[0]
        v_enc_data = bytearray(v_exe[DATA_OFFSET : DATA_OFFSET + v_enc_len])

        # Decrypt
        v_state = 0x24BA
        for i in range(v_enc_len):
            v_state = (v_state * 0x19660D + 0x3C6EF35F) & 0xFFFFFFFF
            v_enc_data[i] ^= (v_state >> 12) & 0xFF

        v_stream = v_enc_data[5 : 5 + v_comp_len]
        decompressor = lzma.LZMADecompressor(format=lzma.FORMAT_RAW, filters=filters)
        unpacked_data = decompressor.decompress(v_stream)

        if unpacked_data == core_data:
            print(f"      [OK] Bit-for-bit verification PASSED: {len(unpacked_data):,} bytes decompressed accurately!")
        else:
            print("      [FAIL] Decompressed data does not match core!")
            return False

    print("\n" + "=" * 60)
    print(" REPACK COMPLETED SUCCESSFULLY")
    print(f" Output: {out_exe_path}")
    print("=" * 60)
    return True

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="AnyDesk Windows Executable Repacker")
    parser.add_argument("--exe", default=DEFAULT_EXE, help="Path to original AnyDesk.exe")
    parser.add_argument("--raw", default=DEFAULT_RAW, help="Path to unpacked_raw.bin")
    parser.add_argument("--out", default=DEFAULT_OUT, help="Path for output AnyDesk_rebuilt.exe")
    parser.add_argument("--relay", default=None, help="Custom relay host (e.g. boot.net.customad.com, max 20 chars)")
    parser.add_argument("--no-verify", action="store_true", help="Skip self-test verification")

    args = parser.parse_args()
    repack_anydesk(args.exe, args.raw, args.out, patch_relay=args.relay, verify=not args.no_verify)
