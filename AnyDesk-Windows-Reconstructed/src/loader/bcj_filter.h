#pragma once
#include <cstdint>
#include <cstddef>

class BcjFilter {
public:
    // Decodes x86 BCJ branch filter (turns relative calls into absolute VAs)
    static void decode(uint8_t* data, size_t size, uint32_t ip = 0);

    // Encodes x86 BCJ branch filter (turns absolute VAs back into relative offsets)
    static void encode(uint8_t* data, size_t size, uint32_t ip = 0);
};
