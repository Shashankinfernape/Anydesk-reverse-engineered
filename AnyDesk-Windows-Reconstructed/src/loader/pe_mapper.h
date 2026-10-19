#pragma once
#include <windows.h>
#include <cstdint>
#include <cstddef>
#include <string>
#include <vector>

class PeMapper {
public:
    PeMapper();
    ~PeMapper();

    bool loadFromFile(const std::wstring& path);
    bool loadFromMemory(const uint8_t* rawData, size_t size);
    bool mapImage();
    bool resolveImports();
    bool applyRelocations();

    FARPROC getExport(const char* funcName);
    void* getEntryPoint() const;
    void* getBaseAddress() const;

    int execute(int argc, wchar_t** argv);

private:
    uint8_t* m_rawData;
    size_t   m_rawSize;
    bool     m_ownsRaw;

    uint8_t* m_imageBase;
    size_t   m_imageSize;
    IMAGE_NT_HEADERS* m_ntHeaders;
};