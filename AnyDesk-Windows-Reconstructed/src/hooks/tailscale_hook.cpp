#include <winsock2.h>
#include <windows.h>
#include <iphlpapi.h>
#include <ws2tcpip.h>
#include "tailscale_hook.h"
#include <iostream>
#include <iomanip>
#include <sstream>
#include <cstring>
#include <vector>

#pragma comment(lib, "iphlpapi.lib")
#pragma comment(lib, "ws2_32.lib")

std::string TailscaleHook::s_tailscaleIp = "";
std::string TailscaleHook::s_lanIp       = "";
uint16_t    TailscaleHook::s_directPort  = 7070;
bool        TailscaleHook::s_neutralized = false;

static bool isTailscaleSubnet(const std::string& ip) {
    if (ip.rfind("100.", 0) != 0) return false;
    size_t firstDot = ip.find('.');
    size_t secondDot = ip.find('.', firstDot + 1);
    if (firstDot == std::string::npos || secondDot == std::string::npos) return false;
    try {
        int secondOctet = std::stoi(ip.substr(firstDot + 1, secondDot - firstDot - 1));
        return secondOctet >= 64 && secondOctet <= 127;
    } catch (...) {
        return false;
    }
}

static bool isPrivateLanIp(const std::string& ip) {
    if (ip.rfind("192.168.", 0) == 0) return true;
    if (ip.rfind("10.", 0) == 0) return true;
    if (ip.rfind("172.", 0) == 0) {
        size_t firstDot = ip.find('.');
        size_t secondDot = ip.find('.', firstDot + 1);
        if (firstDot != std::string::npos && secondDot != std::string::npos) {
            try {
                int secondOctet = std::stoi(ip.substr(firstDot + 1, secondDot - firstDot - 1));
                return secondOctet >= 16 && secondOctet <= 31;
            } catch (...) {
                return false;
            }
        }
    }
    return false;
}

bool TailscaleHook::detectNetworkAddresses() {
    // 1. Try querying Tailscale CLI
    FILE* pipe = _popen("tailscale ip -4 2>nul", "r");
    if (pipe) {
        char buffer[128] = {0};
        if (fgets(buffer, sizeof(buffer), pipe) != nullptr) {
            std::string result(buffer);
            size_t end = result.find_last_not_of(" \r\n\t");
            if (end != std::string::npos) {
                result = result.substr(0, end + 1);
            }
            if (isTailscaleSubnet(result)) {
                s_tailscaleIp = result;
            }
        }
        _pclose(pipe);
    }

    // 2. Query Windows IP Helper API for network adapter interfaces
    ULONG outBufLen = 16384;
    std::vector<BYTE> buffer(outBufLen);
    PIP_ADAPTER_ADDRESSES pAddresses = reinterpret_cast<IP_ADAPTER_ADDRESSES*>(buffer.data());

    ULONG flags = GAA_FLAG_INCLUDE_PREFIX | GAA_FLAG_SKIP_ANYCAST | GAA_FLAG_SKIP_MULTICAST;
    DWORD dwRetVal = GetAdaptersAddresses(AF_INET, flags, nullptr, pAddresses, &outBufLen);
    if (dwRetVal == ERROR_BUFFER_OVERFLOW) {
        buffer.resize(outBufLen);
        pAddresses = reinterpret_cast<IP_ADAPTER_ADDRESSES*>(buffer.data());
        dwRetVal = GetAdaptersAddresses(AF_INET, flags, nullptr, pAddresses, &outBufLen);
    }

    if (dwRetVal == NO_ERROR) {
        for (PIP_ADAPTER_ADDRESSES pCurr = pAddresses; pCurr != nullptr; pCurr = pCurr->Next) {
            // Check adapter name / description
            std::wstring desc = pCurr->Description ? pCurr->Description : L"";
            std::wstring name = pCurr->FriendlyName ? pCurr->FriendlyName : L"";
            bool isTsAdapter = (desc.find(L"Tailscale") != std::wstring::npos ||
                                name.find(L"Tailscale") != std::wstring::npos);

            for (PIP_ADAPTER_UNICAST_ADDRESS pUnicast = pCurr->FirstUnicastAddress;
                 pUnicast != nullptr; pUnicast = pUnicast->Next) {
                if (pUnicast->Address.lpSockaddr->sa_family == AF_INET) {
                    sockaddr_in* sa_in = reinterpret_cast<sockaddr_in*>(pUnicast->Address.lpSockaddr);
                    char ipStr[INET_ADDRSTRLEN] = {0};
                    inet_ntop(AF_INET, &(sa_in->sin_addr), ipStr, INET_ADDRSTRLEN);
                    std::string ip(ipStr);

                    if (isTailscaleSubnet(ip) || isTsAdapter) {
                        if (s_tailscaleIp.empty() && ip.rfind("100.", 0) == 0) {
                            s_tailscaleIp = ip;
                        }
                    } else if (isPrivateLanIp(ip)) {
                        if (s_lanIp.empty()) {
                            s_lanIp = ip;
                        }
                    }
                }
            }
        }
    }

    // Fallbacks
    if (s_lanIp.empty()) {
        s_lanIp = "127.0.0.1";
    }

    return true;
}

std::string TailscaleHook::getTailscaleIp() {
    if (s_tailscaleIp.empty()) {
        detectNetworkAddresses();
    }
    return s_tailscaleIp;
}

std::string TailscaleHook::getLanIp() {
    if (s_lanIp.empty()) {
        detectNetworkAddresses();
    }
    return s_lanIp;
}

uint16_t TailscaleHook::getDirectPort() {
    return s_directPort;
}

void TailscaleHook::setDirectPort(uint16_t port) {
    s_directPort = port;
}

void TailscaleHook::applyCloudNeutralization(void* imageBase, size_t imageSize) {
    if (!imageBase || imageSize == 0 || s_neutralized) return;

    static const std::vector<const char*> kCloudDomains = {
        "boot.net.anydesk.com",
        "relay.net.anydesk.com",
        "anynet.anydesk.com",
        "my.anydesk.com",
        "auth.anydesk.com",
        "update.anydesk.com"
    };

    uint8_t* base = reinterpret_cast<uint8_t*>(imageBase);
    size_t totalPatches = 0;

    for (const char* domain : kCloudDomains) {
        size_t domainLen = strlen(domain);

        for (size_t i = 0; i <= imageSize - domainLen; ++i) {
            if (memcmp(base + i, domain, domainLen) == 0) {
                DWORD oldProtect;
                if (VirtualProtect(base + i, domainLen, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                    memset(base + i, 0, domainLen);
                    // Reroute boot domain to local loopback
                    if (strcmp(domain, "boot.net.anydesk.com") == 0) {
                        const char* loopback = "127.0.0.1";
                        memcpy(base + i, loopback, strlen(loopback));
                    }
                    VirtualProtect(base + i, domainLen, oldProtect, &oldProtect);
                    totalPatches++;
                }
            }
        }
    }

    s_neutralized = true;
}

void TailscaleHook::applyLicenseBannerRemoval(void* imageBase, size_t imageSize) {
    if (!imageBase || imageSize == 0) return;

    uint8_t* base = reinterpret_cast<uint8_t*>(imageBase);

    // 1. Force isFreeLicense / banner query functions to return 1 (paid license, no banner)
    const uint32_t patchRvas[] = { 0x0090A4D0, 0x009B0EF0, 0x00909ED0, 0x009B1620 };
    for (uint32_t rva : patchRvas) {
        if (rva + 3 <= imageSize) {
            DWORD oldProtect;
            if (VirtualProtect(base + rva, 8, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                base[rva + 0] = 0xB0; // mov al, 1
                base[rva + 1] = 0x01;
                base[rva + 2] = 0xC3; // ret
                VirtualProtect(base + rva, 8, oldProtect, &oldProtect);
            }
        }
    }

    // 2. Replace banner color #FB4137FF (red) with #00000000 (transparent)
    const char* oldColor = "#FB4137FF";
    const char* newColor = "#00000000";
    size_t colorLen = strlen(oldColor);
    for (size_t i = 0; i <= imageSize - colorLen; ++i) {
        if (memcmp(base + i, oldColor, colorLen) == 0) {
            DWORD oldProtect;
            if (VirtualProtect(base + i, colorLen, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                memcpy(base + i, newColor, colorLen);
                VirtualProtect(base + i, colorLen, oldProtect, &oldProtect);
            }
        }
    }

    // 3. Clear free banner message strings
    const char* bannerPrefixes[] = {
        "ad.banner.free=",
        "ad.banner.free.default=",
        "ad.banner.free.no_buy="
    };
    for (const char* prefix : bannerPrefixes) {
        size_t prefixLen = strlen(prefix);
        for (size_t i = 0; i <= imageSize - prefixLen; ++i) {
            if (memcmp(base + i, prefix, prefixLen) == 0) {
                size_t eqPos = i + prefixLen;
                size_t end = eqPos;
                while (end < imageSize && base[end] != '\n' && base[end] != '\r' && base[end] != '\0') end++;
                if (end > eqPos) {
                    DWORD oldProtect;
                    if (VirtualProtect(base + eqPos, end - eqPos, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                        memset(base + eqPos, ' ', end - eqPos);
                        VirtualProtect(base + eqPos, end - eqPos, oldProtect, &oldProtect);
                    }
                }
            }
        }
    }

    // 4. [AnyHandesk] Session Time Limit Elimination
    //    Zero-out the auto_disconnect_timer value so the free session never expires.
    const char* timerKey = "ad.license.info.auto_disconnect_timer";
    size_t timerKeyLen = strlen(timerKey);
    for (size_t i = 0; i + timerKeyLen + 2 < imageSize; ++i) {
        if (memcmp(base + i, timerKey, timerKeyLen) == 0) {
            size_t valStart = i + timerKeyLen;
            while (valStart < imageSize && (base[valStart] == '=' || base[valStart] == ' ')) valStart++;
            size_t valEnd = valStart;
            while (valEnd < imageSize && base[valEnd] >= '0' && base[valEnd] <= '9') valEnd++;
            if (valEnd > valStart) {
                size_t valLen = valEnd - valStart;
                DWORD oldProtect;
                if (VirtualProtect(base + valStart, valLen, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                    base[valStart] = '0';
                    if (valLen > 1) memset(base + valStart + 1, ' ', valLen - 1);
                    VirtualProtect(base + valStart, valLen, oldProtect, &oldProtect);
                }
            }
        }
    }

    // 5. [AnyHandesk] Neutralize session disconnect countdown strings
    const char* countdownPrefixes[] = {
        "ad.status.app.status_bar.seconds=",
        "ad.status.app.status_bar.minutes=",
        "ad.banner.disconnect_countdown."
    };
    for (const char* prefix : countdownPrefixes) {
        size_t prefixLen = strlen(prefix);
        for (size_t i = 0; i + prefixLen < imageSize; ++i) {
            if (memcmp(base + i, prefix, prefixLen) == 0) {
                size_t eqPos = i + prefixLen;
                while (eqPos < imageSize && base[eqPos] == '=') eqPos++;
                size_t end = eqPos;
                while (end < imageSize && base[end] != '\n' && base[end] != '\r' && base[end] != '\0') end++;
                if (end > eqPos) {
                    DWORD oldProtect;
                    if (VirtualProtect(base + eqPos, end - eqPos, PAGE_EXECUTE_READWRITE, &oldProtect)) {
                        memset(base + eqPos, ' ', end - eqPos);
                        VirtualProtect(base + eqPos, end - eqPos, oldProtect, &oldProtect);
                    }
                }
            }
        }
    }
}
void TailscaleHook::printStatusBanner() {
    detectNetworkAddresses();

    std::ostringstream oss;
    oss << "\n";
    oss << "==============================================================\n";
    oss << "           AnyHandesk Host - P2P Mesh Mode                    \n";
    oss << "==============================================================\n";
    if (!s_tailscaleIp.empty()) {
        oss << " Tailscale Mesh IP : " << s_tailscaleIp << ":" << s_directPort << " [ONLINE]\n";
    } else {
        oss << " Tailscale Mesh IP : (Tailscale VPN disconnected)\n";
    }
    oss << " Local LAN IP      : " << s_lanIp << ":" << s_directPort << "\n";
    oss << " Listening Port    : " << s_directPort << " (Direct P2P TCP/UDP)\n";
    oss << " Cloud Relay       : DISABLED (100% Peer-to-Peer)\n";
    oss << " Session Time Limit: ELIMINATED (unlimited sessions)\n";
    oss << " Video Codec       : DeskRT (32x32 Tile Differential)\n";
    oss << "==============================================================\n";
    oss << " Ready for incoming connection from Android or Windows client.\n";
    oss << "==============================================================\n\n";

    std::string text = oss.str();

    HANDLE hOut = GetStdHandle(STD_OUTPUT_HANDLE);
    if (hOut && hOut != INVALID_HANDLE_VALUE) {
        DWORD written = 0;
        DWORD mode;
        if (GetConsoleMode(hOut, &mode)) {
            WriteConsoleA(hOut, text.c_str(), static_cast<DWORD>(text.length()), &written, nullptr);
        } else {
            WriteFile(hOut, text.c_str(), static_cast<DWORD>(text.length()), &written, nullptr);
        }
    }
}