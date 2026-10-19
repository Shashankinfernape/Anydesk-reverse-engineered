#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

void x86_convert(uint8_t *data, size_t size, uint32_t ip, int encoding) {
    static const int kMaskToAllowedStatus[8] = {1, 1, 1, 0, 1, 0, 0, 0};
    static const int kMaskToBitNumber[8] = {0, 1, 2, 2, 3, 3, 3, 3};

    if (size < 5) return;

    size_t buffer_pos = 0;
    int prev_mask = 0;
    int64_t prev_pos = -1;
    size_t limit = size - 4;

    while (buffer_pos < limit) {
        uint8_t b = data[buffer_pos];
        if ((b & 0xFE) != 0xE8) {
            buffer_pos++;
            continue;
        }

        int64_t offset = (int64_t)buffer_pos - prev_pos;
        prev_pos = buffer_pos;

        if (offset < 4) {
            prev_mask = (prev_mask << (offset - 1)) & 7;
            if (prev_mask != 0) {
                uint8_t b_check = data[buffer_pos + 4 - kMaskToBitNumber[prev_mask]];
                if (!(kMaskToAllowedStatus[prev_mask] && b_check != 0 && b_check != 0xFF)) {
                    prev_mask = ((prev_mask & 3) << 1) | 1;
                    buffer_pos++;
                    continue;
                }
            }
        } else {
            prev_mask = 0;
        }

        uint8_t b4 = data[buffer_pos + 4];
        if (b4 == 0 || b4 == 0xFF) {
            uint32_t src = *(uint32_t *)(data + buffer_pos + 1);
            uint32_t dest;
            while (1) {
                if (encoding == 0) {
                    dest = src - (ip + (uint32_t)buffer_pos + 5);
                } else {
                    dest = src + (ip + (uint32_t)buffer_pos + 5);
                }

                if (prev_mask == 0) break;
                int shift = (3 - kMaskToBitNumber[prev_mask]) * 8;
                uint8_t b_shift = (dest >> shift) & 0xFF;
                if (b_shift != 0 && b_shift != 0xFF) break;
                dest ^= (1 << (shift + 8)) - 1;
            }
            *(uint32_t *)(data + buffer_pos + 1) = dest;
            buffer_pos += 5;
        } else {
            prev_mask = ((prev_mask & 3) << 1) | 1;
            buffer_pos++;
        }
    }
}

int main(int argc, char **argv) {
    const char *in_path = "C:\\Users\\user\\Desktop\\El projecto\\Git-repos\\Anydesking\\unpacked_raw.bin";
    const char *out_path = "C:\\Users\\user\\Desktop\\El projecto\\Git-repos\\Anydesking\\AnyDesk_unpacked_core.dll";

    FILE *f = fopen(in_path, "rb");
    if (!f) { printf("Cannot open %s\n", in_path); return 1; }
    fseek(f, 0, SEEK_END);
    size_t sz = ftell(f);
    fseek(f, 0, SEEK_SET);

    uint8_t *buf = (uint8_t *)malloc(sz);
    fread(buf, 1, sz, f);
    fclose(f);

    printf("Loaded %zu bytes, applying x86 BCJ filter...\n", sz);
    x86_convert(buf, sz, 0, 0);

    FILE *out = fopen(out_path, "wb");
    if (!out) { printf("Cannot open %s\n", out_path); return 1; }
    fwrite(buf, 1, sz, out);
    fclose(out);
    free(buf);

    printf("Successfully wrote unpacked core binary: %s (%zu bytes)\n", out_path, sz);
    return 0;
}
