#include <windows.h>
#include <string>
#include <vector>
#include <iostream>
#include "pe_mapper.h"
#include "relay_hook.h"
#include "deskrt_hook.h"     // DeskRT video codec hooks
#include "deskrt_codec.h"    // DeskRT tile / packet / capability definitions

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

    for (int i = 1; i < argc; ++i) {
        if (wcscmp(argv[i], L"--relay") == 0 && i + 1 < argc) {
            char relayHost[256] = {0};
            WideCharToMultiByte(CP_ACP, 0, argv[++i], -1, relayHost, sizeof(relayHost) - 1, nullptr, nullptr);
            RelayHook::setCustomRelay(relayHost);
        }
        else if (wcscmp(argv[i], L"--lossless") == 0) {
            // Force DeskRT capability bit 33: disables DCT, uses RLE+LZ
            forceLossless = true;
        }
        else if (wcscmp(argv[i], L"--fps") == 0 && i + 1 < argc) {
            // Cap outgoing FPS (e.g. --fps 15)
            fpsCap = _wtoi(argv[++i]);
        }
    }

    if (argv) LocalFree(argv);

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
                L"AnyDesk Reconstructed Loader Error",
                MB_ICONERROR | MB_OK);
            return 1;
        }
    }

    // 3. Apply Relay Redirect Hooks (if configured)
    RelayHook::applyInMemoryPatches(mapper.getBaseAddress(), 30901248);

    // 4. Install DeskRT codec hooks (only if requested)
    if (forceLossless || fpsCap > 0) {
        DeskRTHook::install(mapper.getBaseAddress(), 30901248);
        if (forceLossless) {
            DeskRTHook::forceLossless(true);
        }
        if (fpsCap > 0) {
            DeskRTHook::setMaxFps(fpsCap);
        }
    }

    // Optional: register a frame callback for watermarking or logging
    // DeskRTHook::setFrameCallback([](uint8_t* px, int w, int h, int stride) -> bool {
    //     // stamp bottom-right corner white
    //     for (int y = h - 8; y < h; ++y)
    //         for (int x = w - 8; x < w; ++x)
    //             *(uint32_t*)(px + y * stride + x * 4) = 0xFFFFFFFF;
    //     return true;
    // });

    // 5. Resolve exported thunks
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