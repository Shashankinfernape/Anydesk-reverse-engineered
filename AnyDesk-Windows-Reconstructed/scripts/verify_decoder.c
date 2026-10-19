#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "7zTypes.h"
#include "LzmaDec.h"

static void *SzAlloc(ISzAllocPtr p, size_t size) { (void)p; return malloc(size); }
static void SzFree(ISzAllocPtr p, void *address) { (void)p; free(address); }
static ISzAlloc g_Alloc = { SzAlloc, SzFree };

int test_file(const char *name, const char *exe_path, size_t src_len_offset, size_t enc_len_offset) {
    printf("--- Testing %s ---\n", name);
    FILE *f = fopen(exe_path, "rb");
    if (!f) { printf("Cannot open %s\n", exe_path); return 1; }

    fseek(f, src_len_offset, SEEK_SET);
    uint32_t src_len = 0;
    fread(&src_len, 1, 4, f);

    fseek(f, enc_len_offset, SEEK_SET);
    uint32_t enc_len = 0;
    fread(&enc_len, 1, 4, f);

    printf("Read from stub: src_len=%u (0x%X), enc_len=%u (0x%X)\n", src_len, src_len, enc_len, enc_len);

    fseek(f, 0x3400, SEEK_SET);
    uint8_t *enc_data = (uint8_t *)malloc(enc_len);
    fread(enc_data, 1, enc_len, f);
    fclose(f);

    // Decrypt LCG
    uint32_t state = 0x24ba;
    for (size_t i = 0; i < enc_len; i++) {
        state = state * 0x19660D + 0x3C6EF35F;
        enc_data[i] ^= (uint8_t)(state >> 12);
    }

    uint8_t *props = enc_data;
    uint8_t *src = enc_data + 5;

    size_t dest_len = 0x01D78400; // 30,901,248 bytes
    uint8_t *dest = (uint8_t *)malloc(dest_len);
    memset(dest, 0, dest_len);

    SizeT out_proc = dest_len;
    SizeT in_proc = src_len;
    ELzmaStatus status = LZMA_STATUS_NOT_SPECIFIED;

    SRes res = LzmaDecode(dest, &out_proc, src, &in_proc, props, 5, LZMA_FINISH_END, &status, &g_Alloc);
    printf("LzmaDecode result: %d (SZ_OK=%d)\n", res, SZ_OK);
    printf("Status: %d (1=FINISHED_WITH_MARK, 2=NOT_FINISHED, 3=NEEDS_MORE_INPUT, 4=MAYBE_FINISHED)\n", status);
    printf("In processed: %zu / %u, Out processed: %zu / %zu\n", in_proc, src_len, out_proc, dest_len);

    if (res == SZ_OK && status != LZMA_STATUS_NEEDS_MORE_INPUT) {
        printf("SUCCESS! Valid PE header in dest? %s\n", (dest[0]=='M' && dest[1]=='Z') ? "YES (MZ)" : "NO");
    } else {
        printf("FAILURE!\n");
    }

    free(dest);
    free(enc_data);
    printf("\n");
    return 0;
}

int main() {
    test_file("ORIGINAL AnyDesk.exe", "C:\\Users\\user\\Desktop\\El projecto\\Git-repos\\AnyDesk.exe", 0x2AC9, 0x2800);
    test_file("REBUILT AnyDesk_rebuilt.exe", "C:\\Users\\user\\Desktop\\El projecto\\Git-repos\\Anydesking\\AnyDesk_rebuilt.exe", 0x2AC9, 0x2800);
    return 0;
}
