#pragma once
#include <string>

class RelayHook {
public:
    static void setCustomRelay(const std::string& host);
    static void applyInMemoryPatches(void* imageBase, size_t imageSize);

private:
    static std::string s_customRelay;
};
