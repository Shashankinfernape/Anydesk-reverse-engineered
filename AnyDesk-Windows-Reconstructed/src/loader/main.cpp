#include <windows.h>
#include <string>
#include <vector>
#include <iostream>
#include "pe_mapper.h"
#include "relay_hook.h"
#include "deskrt_hook.h"      // DeskRT video codec hooks
#include "deskrt_codec.h"     // DeskRT tile / packet / capability definitions
#include "tailscale_hook.h"   // Tailscale + LAN P2P direct hooks

// AnyDesk entry point typedef
typedef int (WINAPI* LoaderEntryThunkFn)(void* ldrThunkData);

// Function to find path of win_app.dll relative to executable
std::wstring getCoreDllPath() {
    wchar_t exePath[MAX_PATH];
    GetModuleFileNameW(nullptr, exePath, MAX_PATH);

    std::wstring path(exePath);
    size_t lastSlash = path.find_last_of(L"\\/");
    if (lastSlash != std::wstring::npos) {
        path = path.substr(0, lastSlash + 1);
    }
    return path + L"win_app.dll";
}

int WINAPI wWinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, LPWSTR lpCmdLine, int nCmdShow) {
    // 1. Parse command line options
    int argc = 0;
    LPWSTR* argv = CommandLineToArgvW(GetCommandLineW(), &argc);

    bool forceLossless = false;
    int  fpsCap        = 0;
    bool showConsole   = false;
    bool infoOnly      = false;
    bool offlineMode   = false;

    for (int i = 1; i < argc; ++i) {
        if (wcscmp(argv[i], L"--relay") == 0 && i + 1 < argc) {
            char relayHost[256] = {0};
            WideCharToMultiByte(CP_ACP, 0, argv[++i], -1, relayHost, sizeof(relayHost) - 1, nullptr, nullptr);
            RelayHook::setCustomRelay(relayHost);
        }
        else if (wcscmp(argv[i], L"--port") == 0 && i + 1 < argc) {
            int port = _wtoi(argv[++i]);
            if (port > 0 && port <= 65535) {
                TailscaleHook::setDirectPort(static_cast<uint16_t>(port));
            }
        }
        else if (wcscmp(argv[i], L"--lossless") == 0) {
            // Force DeskRT capability bit 33: disables DCT, uses RLE+LZ
            forceLossless = true;
        }
        else if (wcscmp(argv[i], L"--fps") == 0 && i + 1 < argc) {
            // Cap outgoing FPS (e.g. --fps 15)
            fpsCap = _wtoi(argv[++i]);
        }
        else if (wcscmp(argv[i], L"--offline") == 0 || wcscmp(argv[i], L"--neutralize") == 0) {
            offlineMode = true;
        }
        else if (wcscmp(argv[i], L"--console") == 0) {
            showConsole = true;
        }
        else if (wcscmp(argv[i], L"--p2p-info") == 0) {
            showConsole = true;
            infoOnly = true;
        }
    }

    if (argv) LocalFree(argv);

    if (showConsole) {
        HANDLE hStdOut = GetStdHandle(STD_OUTPUT_HANDLE);
        if (hStdOut == nullptr || hStdOut == INVALID_HANDLE_VALUE || GetFileType(hStdOut) == FILE_TYPE_UNKNOWN) {
            if (!AttachConsole(ATTACH_PARENT_PROCESS)) {
                AllocConsole();
            }
            FILE* fDummy;
            freopen_s(&fDummy, "CONOUT$", "w", stdout);
            freopen_s(&fDummy, "CONOUT$", "w", stderr);
            std::cout.clear();
            std::cerr.clear();
        }
    }

    if (infoOnly) {
        TailscaleHook::printStatusBanner();
        return 0;
    }

    // 2. Locate and map win_app.dll
    std::wstring dllPath = getCoreDllPath();
    PeMapper mapper;

    if (!mapper.loadFromFile(dllPath)) {
        // Fallback: check ../src/core/win_app.dll (development path)
        wchar_t devPath[MAX_PATH];
        GetModuleFileNameW(nullptr, devPath, MAX_PATH);
        std::wstring fallback = std::wstring(devPath);
        size_t pos = fallback.find_last_of(L"\\/");
        fallback = fallback.substr(0, pos) + L"\\..\\src\\core\\win_app.dll";

        if (!mapper.loadFromFile(fallback)) {
            MessageBoxW(nullptr,
                L"Failed to load core library 'win_app.dll'.\nPlease ensure it exists next to the executable.",
                L"AnyHandesk Loader Error",
                MB_ICONERROR | MB_OK);
            return 1;
        }
    }

    // 3. Apply Tailscale & LAN P2P Hooks (Neutralize AnyDesk cloud servers only if --offline flag is set)
    if (offlineMode) {
        TailscaleHook::applyCloudNeutralization(mapper.getBaseAddress(), 30901248);
    }

    // Always neutralize and strip Free License banner
    TailscaleHook::applyLicenseBannerRemoval(mapper.getBaseAddress(), 30901248);

    // 4. Apply custom relay if configured
    RelayHook::applyInMemoryPatches(mapper.getBaseAddress(), 30901248);

    // 5. Install DeskRT codec hooks (only if lossless or fps cap is active)
    if (forceLossless || fpsCap > 0) {
        DeskRTHook::install(mapper.getBaseAddress(), 30901248);
        if (forceLossless) {
            DeskRTHook::forceLossless(true);
        }
        if (fpsCap > 0) {
            DeskRTHook::setMaxFps(fpsCap);
        }
    }

    if (showConsole) {
        TailscaleHook::printStatusBanner();
    }

    // 6. Resolve exported thunks
    FARPROC entryThunk = mapper.getExport("loader_entry_thread_thunk");
    FARPROC thunkData  = mapper.getExport("ldr_thunk_data");

    if (entryThunk) {
        auto thunk = reinterpret_cast<LoaderEntryThunkFn>(entryThunk);
        return thunk(reinterpret_cast<void*>(thunkData));
    }

    // Fallback: jump to PE AddressOfEntryPoint
    void* ep = mapper.getEntryPoint();
    if (ep) {
        typedef int (WINAPI* EntryPointFn)();
        auto start = reinterpret_cast<EntryPointFn>(ep);
        return start();
    }

    MessageBoxW(nullptr, L"Could not resolve entry point in win_app.dll", L"Error", MB_ICONERROR | MB_OK);
    return 1;
}

int main() {
    return wWinMain(GetModuleHandle(nullptr), nullptr, GetCommandLineW(), SW_SHOW);
}
