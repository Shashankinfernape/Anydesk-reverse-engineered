#include "relay_hook.h"
#include <windows.h>
#include <cstdint>
#include <cstring>
#include <iostream>

std::string RelayHook::s_customRelay = "";

void RelayHook::setCustomRelay(const std::string& host) {
    s_customRelay = host;
}

void RelayHook::applyInMemoryPatches(void* imageBase, size_t imageSize) {
    if (s_customRelay.empty() || !imageBase) return;

    const char* targetRelay = "boot.net.anydesk.com";
    size_t targetLen = strlen(targetRelay);

    if (s_customRelay.length() > targetLen) {
        std::cerr << "[RelayHook] Custom relay hostname too long! Max: " << targetLen << " chars." << std::endl;
        return;
    }

    uint8_t* base = reinterpret_cast<uint8_t*>(imageBase);
    size_t replacedCount = 0;

    for (size_t i = 0; i <= imageSize - targetLen; ++i) {
        if (memcmp(base + i, targetRelay, targetLen) == 0) {
            DWORD oldProtect;
            if (VirtualProtect(base + i, targetLen, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                memset(base + i, 0, targetLen);
                memcpy(base + i, s_customRelay.c_str(), s_customRelay.length());
                VirtualProtect(base + i, targetLen, oldProtect, &oldProtect);
                replacedCount++;
            }
        }
    }

    if (replacedCount > 0) {
        std::cout << "[RelayHook] Patched " << replacedCount << " occurrence(s) of relay to: " << s_customRelay << std::endl;
    }
}
