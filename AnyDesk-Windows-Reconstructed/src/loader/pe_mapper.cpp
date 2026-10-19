#include "pe_mapper.h"
#include <fstream>
#include <iostream>

PeMapper::PeMapper()
    : m_rawData(nullptr), m_rawSize(0), m_ownsRaw(false),
      m_imageBase(nullptr), m_imageSize(0), m_ntHeaders(nullptr) {}

PeMapper::~PeMapper() {
    if (m_imageBase) {
        VirtualFree(m_imageBase, 0, MEM_RELEASE);
    }
    if (m_ownsRaw && m_rawData) {
        delete[] m_rawData;
    }
}

bool PeMapper::loadFromFile(const std::wstring& path) {
    std::ifstream file(path.c_str(), std::ios::binary | std::ios::ate);
    if (!file.is_open()) return false;

    m_rawSize = static_cast<size_t>(file.tellg());
    file.seekg(0, std::ios::beg);

    m_rawData = new uint8_t[m_rawSize];
    m_ownsRaw = true;

    file.read(reinterpret_cast<char*>(m_rawData), m_rawSize);
    return loadFromMemory(m_rawData, m_rawSize);
}

bool PeMapper::loadFromMemory(const uint8_t* rawData, size_t size) {
    if (!rawData || size < sizeof(IMAGE_DOS_HEADER)) return false;

    auto dosHeader = reinterpret_cast<const IMAGE_DOS_HEADER*>(rawData);
    if (dosHeader->e_magic != IMAGE_DOS_SIGNATURE) return false;

    m_ntHeaders = const_cast<IMAGE_NT_HEADERS*>(
        reinterpret_cast<const IMAGE_NT_HEADERS*>(rawData + dosHeader->e_lfanew)
    );

    if (m_ntHeaders->Signature != IMAGE_NT_SIGNATURE) return false;
    return mapImage();
}

bool PeMapper::mapImage() {
    m_imageSize = m_ntHeaders->OptionalHeader.SizeOfImage;

    // Allocate memory at preferred ImageBase, fallback to anywhere
    m_imageBase = reinterpret_cast<uint8_t*>(
        VirtualAlloc(reinterpret_cast<void*>(m_ntHeaders->OptionalHeader.ImageBase),
                     m_imageSize, MEM_COMMIT | MEM_RESERVE, PAGE_EXECUTE_READWRITE)
    );

    if (!m_imageBase) {
        m_imageBase = reinterpret_cast<uint8_t*>(
            VirtualAlloc(nullptr, m_imageSize, MEM_COMMIT | MEM_RESERVE, PAGE_EXECUTE_READWRITE)
        );
    }

    if (!m_imageBase) return false;

    // Copy PE headers
    memcpy(m_imageBase, m_rawData, m_ntHeaders->OptionalHeader.SizeOfHeaders);

    // Copy PE sections
    auto section = IMAGE_FIRST_SECTION(m_ntHeaders);
    for (WORD i = 0; i < m_ntHeaders->FileHeader.NumberOfSections; ++i, ++section) {
        if (section->SizeOfRawData > 0) {
            uint8_t* dest = m_imageBase + section->VirtualAddress;
            const uint8_t* src = m_rawData + section->PointerToRawData;
            memcpy(dest, src, section->SizeOfRawData);
        }
    }

    resolveImports();
    applyRelocations();
    return true;
}

bool PeMapper::resolveImports() {
    auto& importDir = m_ntHeaders->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_IMPORT];
    if (importDir.Size == 0) return true;

    auto importDesc = reinterpret_cast<IMAGE_IMPORT_DESCRIPTOR*>(m_imageBase + importDir.VirtualAddress);

    while (importDesc->Name != 0) {
        const char* dllName = reinterpret_cast<const char*>(m_imageBase + importDesc->Name);
        HMODULE hModule = LoadLibraryA(dllName);
        if (!hModule) {
            importDesc++;
            continue;
        }

        auto thunkRef = reinterpret_cast<IMAGE_THUNK_DATA*>(m_imageBase +
            (importDesc->OriginalFirstThunk ? importDesc->OriginalFirstThunk : importDesc->FirstThunk));
        auto funcRef = reinterpret_cast<IMAGE_THUNK_DATA*>(m_imageBase + importDesc->FirstThunk);

        while (thunkRef->u1.AddressOfData != 0) {
            FARPROC proc = nullptr;
            if (IMAGE_SNAP_BY_ORDINAL(thunkRef->u1.Ordinal)) {
                proc = GetProcAddress(hModule, reinterpret_cast<LPCSTR>(IMAGE_ORDINAL(thunkRef->u1.Ordinal)));
            } else {
                auto byName = reinterpret_cast<IMAGE_IMPORT_BY_NAME*>(m_imageBase + thunkRef->u1.AddressOfData);
                proc = GetProcAddress(hModule, byName->Name);
            }

            if (proc) {
                funcRef->u1.Function = reinterpret_cast<DWORD_PTR>(proc);
            }

            thunkRef++;
            funcRef++;
        }
        importDesc++;
    }
    return true;
}

bool PeMapper::applyRelocations() {
    auto& relocDir = m_ntHeaders->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_BASERELOC];
    if (relocDir.Size == 0) return true;

    DWORD_PTR delta = reinterpret_cast<DWORD_PTR>(m_imageBase) - m_ntHeaders->OptionalHeader.ImageBase;
    if (delta == 0) return true;

    auto reloc = reinterpret_cast<IMAGE_BASE_RELOCATION*>(m_imageBase + relocDir.VirtualAddress);

    while (reloc->VirtualAddress != 0) {
        DWORD count = (reloc->SizeOfBlock - sizeof(IMAGE_BASE_RELOCATION)) / sizeof(WORD);
        auto entry = reinterpret_cast<WORD*>(reinterpret_cast<uint8_t*>(reloc) + sizeof(IMAGE_BASE_RELOCATION));

        for (DWORD i = 0; i < count; ++i, ++entry) {
            WORD type = (*entry) >> 12;
            WORD offset = (*entry) & 0x0FFF;

            if (type == IMAGE_REL_BASED_HIGHLOW) {
                auto patchAddress = reinterpret_cast<DWORD*>(m_imageBase + reloc->VirtualAddress + offset);
                *patchAddress += static_cast<DWORD>(delta);
            }
        }
        reloc = reinterpret_cast<IMAGE_BASE_RELOCATION*>(reinterpret_cast<uint8_t*>(reloc) + reloc->SizeOfBlock);
    }
    return true;
}

FARPROC PeMapper::getExport(const char* funcName) {
    auto& exportDir = m_ntHeaders->OptionalHeader.DataDirectory[IMAGE_DIRECTORY_ENTRY_EXPORT];
    if (exportDir.Size == 0) return nullptr;

    auto exp = reinterpret_cast<IMAGE_EXPORT_DIRECTORY*>(m_imageBase + exportDir.VirtualAddress);
    auto names = reinterpret_cast<DWORD*>(m_imageBase + exp->AddressOfNames);
    auto ordinals = reinterpret_cast<WORD*>(m_imageBase + exp->AddressOfNameOrdinals);
    auto functions = reinterpret_cast<DWORD*>(m_imageBase + exp->AddressOfFunctions);

    for (DWORD i = 0; i < exp->NumberOfNames; ++i) {
        const char* name = reinterpret_cast<const char*>(m_imageBase + names[i]);
        if (strcmp(name, funcName) == 0) {
            WORD ordinal = ordinals[i];
            return reinterpret_cast<FARPROC>(m_imageBase + functions[ordinal]);
        }
    }
    return nullptr;
}

void* PeMapper::getEntryPoint() const {
    if (!m_imageBase || !m_ntHeaders) return nullptr;
    return m_imageBase + m_ntHeaders->OptionalHeader.AddressOfEntryPoint;
}

void* PeMapper::getBaseAddress() const {
    return m_imageBase;
}
