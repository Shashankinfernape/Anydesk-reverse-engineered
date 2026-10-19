#include "lcg_cipher.h"

LcgCipher::LcgCipher(uint32_t seed) : state(seed) {}

void LcgCipher::reset(uint32_t seed) {
    state = seed;
}

uint8_t LcgCipher::nextByte() {
    state = state * MULTIPLIER + INCREMENT;
    return static_cast<uint8_t>((state >> 12) & 0xFF);
}

void LcgCipher::crypt(uint8_t* data, size_t length) {
    for (size_t i = 0; i < length; ++i) {
        data[i] ^= nextByte();
    }
}
