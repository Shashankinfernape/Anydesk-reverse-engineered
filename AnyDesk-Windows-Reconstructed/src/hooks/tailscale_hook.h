#pragma once
#include <string>
#include <vector>
#include <cstdint>

class TailscaleHook {
public:
    // Auto-detect local Tailscale IPv4 address (100.64.0.0/10) and LAN IPv4 address (192.168.x.x / 10.x.x.x)
    static bool detectNetworkAddresses();

    // Get detected Tailscale IP
    static std::string getTailscaleIp();

    // Get detected Local LAN IP
    static std::string getLanIp();

    // Neutralize official AnyDesk server domains in mapped win_app.dll image
    static void applyCloudNeutralization(void* imageBase, size_t imageSize);

    // Neutralize and hide red Free License banner at runtime
    static void applyLicenseBannerRemoval(void* imageBase, size_t imageSize);

    // Get / Set configured direct listening port (default 7070)
    static uint16_t getDirectPort();
    static void setDirectPort(uint16_t port);

    // Print the AnyHandesk P2P status banner to console
    static void printStatusBanner();

private:
    static std::string s_tailscaleIp;
    static std::string s_lanIp;
    static uint16_t    s_directPort;
    static bool        s_neutralized;
};
