#include "bcj_filter.h"

static inline bool test86(uint8_t b) {
    return b == 0x00 || b == 0xFF;
}

void BcjFilter::decode(uint8_t* data, size_t size, uint32_t ip) {
    if (size < 5) return;
    size_t limit = size - 5;
    size_t i = 0;

    while (i <= limit) {
        uint8_t b = data[i];
        if (b != 0xE8 && b != 0xE9) {
            i++;
            continue;
        }

        uint8_t b4 = data[i + 4];
        if (!test86(b4)) {
            i++;
            continue;
        }

        uint32_t src = static_cast<uint32_t>(data[i + 1]) |
                      (static_cast<uint32_t>(data[i + 2]) << 8) |
                      (static_cast<uint32_t>(data[i + 3]) << 16) |
                      (static_cast<uint32_t>(b4) << 24);

        uint32_t dest = src + (ip + static_cast<uint32_t>(i) + 5);

        data[i + 1] = static_cast<uint8_t>(dest);
        data[i + 2] = static_cast<uint8_t>(dest >> 8);
        data[i + 3] = static_cast<uint8_t>(dest >> 16);
        data[i + 4] = static_cast<uint8_t>(~(((dest >> 24) & 1) - 1));

        i += 5;
    }
}

void BcjFilter::encode(uint8_t* data, size_t size, uint32_t ip) {
    if (size < 5) return;
    size_t limit = size - 5;
    size_t i = 0;

    while (i <= limit) {
        uint8_t b = data[i];
        if (b != 0xE8 && b != 0xE9) {
            i++;
            continue;
        }

        uint8_t b4 = data[i + 4];
        if (!test86(b4)) {
            i++;
            continue;
        }

        uint32_t dest = static_cast<uint32_t>(data[i + 1]) |
                       (static_cast<uint32_t>(data[i + 2]) << 8) |
                       (static_cast<uint32_t>(data[i + 3]) << 16) |
                       (static_cast<uint32_t>(b4) << 24);

        uint32_t src = dest - (ip + static_cast<uint32_t>(i) + 5);

        data[i + 1] = static_cast<uint8_t>(src);
        data[i + 2] = static_cast<uint8_t>(src >> 8);
        data[i + 3] = static_cast<uint8_t>(src >> 16);
        data[i + 4] = static_cast<uint8_t>(~(((src >> 24) & 1) - 1));

        i += 5;
    }
}
