import re

PLAN_FILE = r"C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\ANYDESK_REPLICATION_MASTER_PLAN.md"

with open(PLAN_FILE, "r", encoding="utf-8") as f:
    text = f.read()

# Update Section 2.1: Replace speculative hash matching with verified LCG + LZMA + BCJ
old_sec2_1 = """### 2.1 PE Container & Unpacker Structure
- **Sections:**
  - `.text`: VirtualSize `0x2370` (10 KB), RawSize `10,752`, Entropy `6.53`. Contains the initial unpacker / PEB loader stub.
  - `.data`: VirtualSize `0x81B2B8` (8.5 MB), RawSize `8,500,224`, Entropy `8.00` (max compressed/encrypted). Holds the compressed native AnyDesk runtime payload.
  - `.rsrc`: Resource tree with application manifest, version tables, and icon bundles.
- **Dynamic Resolution Stub:**
  - Data Directory Import Table: `RVA = 0x0, Size = 0x0`.
  - The unpacker parses the `PEB_LDR_DATA` structure at runtime to find `kernel32.dll`, resolves `VirtualAlloc`, `VirtualProtect`, `LoadLibraryA`, and `GetProcAddress` via ROR13/Murmur hash matching, decompresses the payload into freshly allocated executable pages, and jumps to the real `WinMain`."""

new_sec2_1 = """### 2.1 PE Container & Verified Unpacker Engine (Task 1 Verified)
- **Verified Binary Architecture:** x86 32-bit PE (`AnyDesk.exe`), ImageBase `0x00400000`, Entry Point `0x0040335f`.
- **Sections Layout:**
  - `.text`: `0x00401000` (10.35 KB, 54 functions). Unpacker bootstrapping stub.
  - `.itext`: `0x00404000` (31.03 MB BSS buffer). Pre-reserved memory buffer for unpacked core execution.
  - `.rdata`: `0x0219D000` (1.05 KB). Encrypted API strings and LCG seeds.
  - `.data`: `0x0219E000` (8.50 MB, raw offset `0x3400`). Compressed LZMA + BCJ payload (`0x0081B2DC` bytes).
- **Dynamic PEB Walk & LCG API Unmasking:**
  - Zero static imports (`ImportDirectory.RVA = 0`).
  - PEB lookup via `FS:[0x30]`; iterates `PEB->Ldr->InLoadOrderModuleList`.
  - Module/API names decrypted via 32-bit LCG stream cipher:
    $$\\text{state}_{n+1} = (\\text{state}_n \\times \\text{0x19660D} + \\text{0x3C6EF35F}) \\pmod{2^{32}}, \\quad K_n = (\\text{state}_{n+1} \\gg 12) \\ \\& \\ \\text{0xFF}$$
  - Seed `0x3114B604` -> `L"ntdll"`; parses export table and decrypts seed `0x40704011` -> `"LdrGetProcedureAddress"`.
  - Resolves 11 native NT system calls (`LdrLoadDll`, `LdrUnloadDll`, `NtQuerySystemInformation`, `NtCreateSection`, `NtMapViewOfSection`, `NtClose`, `NtUnmapViewOfSection`, `NtDuplicateObject`, `NtTerminateThread`, `NtProtectVirtualMemory`, `RtlCreateUserThread`).
  - Loads `L"kernel32"` (seed `0x0DBF6838`) and resolves 9 Win32 memory/process APIs (`HeapAlloc`, `HeapReAlloc`, `HeapFree`, `GetProcessHeap`, `ExitProcess`, `GetCommandLineW`, `VirtualProtect`, `GetModuleHandleW`, `SetSearchPathMode`).
- **Decompression & Relocation Pipeline:**
  - **Cipher Pre-pass (`FUN_004033f4`):** Decrypts 8.5 MB payload using LCG seed `0x24BA`.
  - **LZMA Decompression (`FUN_00403225`):** Properties byte `0x5D` (lc=3, lp=0, pb=2), 64 MB dictionary size. Expands `0x0081B2DC` (8.5 MB) to `0x01D78400` bytes (30.9 MB).
  - **x86 BCJ Branch Filter (`FUN_00401947`):** Inverse relative call/jump filter restoring `0xE8`/`0xE9` displacement targets.
  - **Section Mapper (`FUN_00401000`):** Maps headers and sections (`.text` 17.6 MB, `.rdata` 11.4 MB, `.data` 1 MB, `.reloc`) into memory at `.itext` (`0x00404000`), sets `PAGE_EXECUTE_READWRITE`, and executes `"loader_entry_thread_thunk"` (seed `0x32334148`).
  - **Embedded Core Stamps:** Official AnyDesk release tag `release/win_9.8.2`, Git commit `3b03e00b75d7e6610856bf54ff3e505886c0425e`, Build digest `796d925bcc94b911e23f418307fd5c11`."""

text = text.replace(old_sec2_1, new_sec2_1)

# Update Subsystem 4 & Subsystem 6 with verified findings
old_sub4 = """### Subsystem 4: Networking, Transport & Relay Racing (AnyNet)
- **Observed AnyDesk Mechanism:**
  - Gathers local interface IPs (`GetAdaptersAddresses`) and reflexive STUN endpoints.
  - Concurrently races:
    1. Direct UDP hole-punching (STUN NAT traversal).
    2. Direct LAN TCP socket connection.
    3. Relay server fallback (routed over port 443/80).
  - Relay connection starts after a 300–500 ms staggered timer if direct probing hasn't finished, migrating transparently to direct UDP if direct connection succeeds.
- **DirectLink Engine Design:**
  - Implement a modern **QUIC / UDP primary + TLS / TCP relay fallback** racer using `quinn` or custom UDP socket framing.
  - Custom wire packet framing header (16 bytes):
    ```
    [0..4]   Magic Header (0x444C494E 'DLIN')
    [4..6]   Channel ID (0=Input, 1=Control, 2=Audio, 3=Video, 4=File)
    [6..8]   Packet Flags (SYN, ACK, FIN, KEYFRAME, COMPRESSED)
    [8..12]  Sequence Number (uint32)
    [12..16] Payload Length (uint32)
    ```"""

new_sub4 = """### Subsystem 4: Networking, Transport & Relay Racing (AnyNet — Task 2 Verified)
- **Observed AnyDesk Mechanism (Verified from Decompiled C++ Engine):**
  - **Candidate Racing Routine (`ad_anynet_direct_connect_racer` @ `0x00F05670`):** Concurrently dispatches direct endpoint probes (UDP/TCP hole-punching via `ad.anynet.direct`) and relay tunnels via `relay_connector_connect` (`0x00F87158`).
  - **Finite State Machine (`ad_anynet_direct_state_handler` @ `0x011E3614`):** Transitions state between Candidate Discovery, Direct Probing, Relay Fallback, and Handshake Completion.
  - **Verified Wire Message Descriptors (from `.rodata`):**
    - `blob_msg_t` (`0x004218FE`): Raw binary payload transport.
    - `relay_connect_msg_t` (`0x004220C8`, ctor @ `0x00F3805C`): Relay tunnel connection handshake packet.
    - `resume_connections_msg_t` (`0x00422055`) & `suspend_connections_msg_t` (`0x0042211C`): State synchronization across network handoffs.
    - `request_send_msg_t` (`0x00422170`): Windowed flow control acknowledgement.
    - `fragment_data_t` (`0x00422262`): Sub-MTU packet fragmentation header.
    - `reroute_msg_t` (`0x004221A3`): Dynamic relay rerouting to optimal geographically distributed node.
- **DirectLink Engine Design:**
  - Implement modern asynchronous **QUIC / UDP primary + TLS / TCP relay fallback** racer matching `ad_anynet_direct_connect_racer` logic.
  - Custom wire packet framing header (16 bytes) matching AnyNet channel classification:
    ```
    [0..4]   Magic Header (0x444C494E 'DLIN')
    [4..6]   Channel ID (0=Input Priority, 1=Control, 2=Audio, 3=Video Frames, 4=File Transfer)
    [6..8]   Packet Flags (SYN, ACK, FIN, KEYFRAME, COMPRESSED, FRAGMENT)
    [8..12]  Sequence Number (uint32)
    [12..16] Payload Length (uint32)
    ```"""

text = text.replace(old_sub4, new_sub4)

# Update Subsystem 6: Video/Screen Compression (DeskRT)
old_sub6 = """### Subsystem 6: Video/Screen Compression (DeskRT Replication)
- **Observed AnyDesk Mechanism:**
  - 16×16 tile partitioning.
  - Tile diffing against reference frame: only modified tiles are processed.
  - Classification:
    - Lossless solid color / run-length encoding for text and UI elements.
    - Lossy discrete cosine transform (DCT) / wavelet quantization for continuous-tone photographic areas.
  - Chroma subsampling: YUV420 with SIMD color-space conversion routines.
- **DirectLink Engine Design:**
  - Implement **DirectLink Tile Codec (DL-RT)**:
    - 32×32 pixel blocks.
    - Fast 64-bit SIMD hash check per block: identical blocks require 1 bit in block mask.
    - Changed blocks compressed with LZ4 or Zstandard for synthetic UI, or NVENC / MediaCodec H.264/H.265 hardware video streams for high-motion fullscreen updates."""

new_sub6 = """### Subsystem 6: Video/Screen Compression (DeskRT Codec & Capabilities — Task 2 Verified)
- **Observed AnyDesk Mechanism (Verified from Decompiled C++ Engine):**
  - **Zero-Copy Frame Intake (`Java_com_anydesk_jni_JniAdExt_jniCaptureFrame` @ `0x00EBE2AC`):** Queries native direct memory pointer via `(*env)->GetDirectBufferAddress(env, byteBuffer)` (`+0x730`), passes `(width, height, stride, format, is_dirty)` directly to DeskRT compressor `func_0x00fd7634`.
  - **Verified 64-Bit Session Capability Bitmask (`deskrt_codec_capability_dispatch` @ `0x00FDAA44`):**
    - Bit 0 (`0x01`): `sound_src` · Bit 1 (`0x02`): `sound_sink`
    - Bit 2 (`0x04`): `keyboard_sink` · Bit 3 (`0x08`): `keyboard2` (modern packetizer)
    - Bit 4 (`0x10`): `switch_sides` · Bit 7 (`0x80`): `clip_paste_files`
    - Bit 12 (`0x1000`): `keyboard_unicode` · Bit 18 (`0x40000`): `filetransfer_server`
    - Bit 27 (`0x08000000`): `motion_input` · Bit 33 (`0x0200000000`): `lossless_codec`
    - Bit 36 (`0x1000000000`): `string_input` · Bit 37 (`0x2000000000`): `quality_adaptive`
    - Bit 41 (`0x020000000000`): `relative_mouse_input` · Bit 42 (`0x040000000000`): `video_mode`
  - **Channel Priority Multiplexing:** Input packets (`jniOnKey`, `jniOnMouse`, `jniOnMotion`) write to Priority 0 queue (`0x1b00` category), bypassing bulk video tile queues (`0x1200` category, fragmented under MTU via `fragment_data_t`).
- **DirectLink Engine Design:**
  - Implement **DirectLink Tile Codec (DL-RT)**:
    - 16×16 and 32×32 pixel differential block encoding.
    - Zero-copy buffer ingestion matching `jniCaptureFrame`.
    - Capability negotiation matching the 64-bit AnyDesk bitmask for feature parity (audio, clipboard, input priority, lossless codec toggle)."""

text = text.replace(old_sub6, new_sub6)

# Update Section 6: Inventory
text = text.replace(
    "7. `ANYDESK_REPLICATION_MASTER_PLAN.md`: This comprehensive specification and roadmap document.",
    "7. `DECOMPILED_CORE_EVIDENCE.md`: 48 KB empirical evidence record containing decompiled C pseudocode, exact function VAs, and struct definitions for Task 1 (x86 unpacker) and Task 2 (ARM64 shared C++ core).\n8. `arm64_decompiled_results.json`: Full JSON output from headless Ghidra 12.1.4 decompiling all 21 core ARM64 functions.\n9. `ANYDESK_REPLICATION_MASTER_PLAN.md`: This comprehensive specification and roadmap document."
)

with open(PLAN_FILE, "w", encoding="utf-8") as f:
    f.write(text)

print(f"Successfully updated {PLAN_FILE} ({len(text):,} bytes)")
