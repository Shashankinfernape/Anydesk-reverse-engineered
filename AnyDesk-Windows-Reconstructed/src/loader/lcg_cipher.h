#pragma once
#include <cstdint>
#include <cstddef>

class LcgCipher {
public:
    static constexpr uint32_t MULTIPLIER = 0x0019660D;
    static constexpr uint32_t INCREMENT  = 0x3C6EF35F;
    static constexpr uint32_t DEFAULT_SEED = 0x000024BA;

    explicit LcgCipher(uint32_t seed = DEFAULT_SEED);

    void reset(uint32_t seed = DEFAULT_SEED);
    uint8_t nextByte();
    void crypt(uint8_t* data, size_t length);

private:
    uint32_t state;
};
