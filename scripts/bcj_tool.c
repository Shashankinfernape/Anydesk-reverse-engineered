#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>

static const uint8_t kMaskToAllowedStatus[8] = {1, 1, 1, 0, 1, 0, 0, 0};
static const uint8_t kMaskToBitNumber[8] = {0, 1, 2, 2, 3, 3, 3, 3};

size_t x86_convert(uint8_t *data, size_t size, uint32_t ip, uint32_t *state, int encoding) {
    uint8_t prevMask = *state & 7;
    if (size < 5) return 0;
    ip += 5;
    size_t bufferPos = 0;
    size_t limit = size - 4;
    int64_t prevPos = -1;

    for (;;) {
        uint8_t *p = data + bufferPos;
        uint8_t *limitP = data + limit;
        while (p < limitP && (*p & 0xFE) != 0xE8) p++;
        bufferPos = p - data;
        if (p >= limitP) break;

        size_t offset = bufferPos - prevPos;
        prevPos = bufferPos;

        if (offset < 4) {
            prevMask = (prevMask << (offset - 1)) & 7;
            if (prevMask != 0) {
                uint8_t b = data[bufferPos + 4 - kMaskToBitNumber[prevMask]];
                if (!kMaskToAllowedStatus[prevMask] || b == 0 || b == 0xFF) {
                    prevMask = ((prevMask & 3) << 1) | 1;
                    bufferPos++;
                    continue;
                }
            }
        } else {
            prevMask = 0;
        }

        uint8_t b = data[bufferPos + 4];
        if (b == 0 || b == 0xFF) {
            uint32_t src = ((uint32_t)b << 24) |
                           ((uint32_t)data[bufferPos + 3] << 16) |
                           ((uint32_t)data[bufferPos + 2] << 8) |
                           (data[bufferPos + 1]);
            uint32_t dest;
            if (encoding) {
                dest = src + (ip + (uint32_t)bufferPos);
            } else {
                dest = src - (ip + (uint32_t)bufferPos);
            }

            if (prevMask != 0) {
                unsigned index = kMaskToBitNumber[prevMask] * 8;
                uint8_t b2 = (uint8_t)(dest >> (24 - index));
                if (b2 == 0 || b2 == 0xFF) {
                    dest ^= (((uint32_t)1 << (32 - index)) - 1);
                }
            }

            data[bufferPos + 1] = (uint8_t)dest;
            data[bufferPos + 2] = (uint8_t)(dest >> 8);
            data[bufferPos + 3] = (uint8_t)(dest >> 16);
            data[bufferPos + 4] = (uint8_t)(0 - ((dest >> 24) & 1));
            bufferPos += 5;
        } else {
            prevMask = ((prevMask & 3) << 1) | 1;
            bufferPos++;
        }
    }
    size_t d = bufferPos - prevPos;
    *state = ((d > 3) ? 0 : ((prevMask << (d - 1)) & 7));
    return bufferPos;
}

int main(int argc, char **argv) {
    if (argc < 4) {
        printf("Usage: %s <enc|dec> <in> <out>\n", argv[0]);
        return 1;
    }
    int enc = (strcmp(argv[1], "enc") == 0) ? 1 : 0;
    const char *in_path = argv[2];
    const char *out_path = argv[3];

    FILE *f = fopen(in_path, "rb");
    if (!f) { printf("Cannot open %s\n", in_path); return 1; }
    fseek(f, 0, SEEK_END);
    size_t sz = ftell(f);
    fseek(f, 0, SEEK_SET);

    uint8_t *buf = (uint8_t *)malloc(sz);
    fread(buf, 1, sz, f);
    fclose(f);

    uint32_t state = 0;
    printf("Running BCJ %s on %zu bytes...\n", enc ? "encode" : "decode", sz);
    x86_convert(buf, sz, 0, &state, enc);

    FILE *out = fopen(out_path, "wb");
    if (!out) { printf("Cannot open %s\n", out_path); return 1; }
    fwrite(buf, 1, sz, out);
    fclose(out);
    free(buf);

    printf("Done: %s\n", out_path);
    return 0;
}
