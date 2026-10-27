cmake_minimum_required(VERSION 3.20)
project(AnyHandeskHost LANGUAGES C CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Configure output directories
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)

# Windows subsystem: Win32 GUI application
if (MSVC)
    add_compile_options(/W3 /O2 /GS- /sdl-)
    add_link_options(/SUBSYSTEM:WINDOWS /ENTRY:mainCRTStartup /MANIFEST:NO)
else()
    add_compile_options(-O2 -mwindows)
endif()

# Include directories
include_directories(
    ${CMAKE_CURRENT_SOURCE_DIR}/src/loader
    ${CMAKE_CURRENT_SOURCE_DIR}/src/hooks
    ${CMAKE_CURRENT_SOURCE_DIR}/include          # deskrt_codec.h
)

# Source files
set(SOURCES
    src/loader/main.cpp
    src/loader/lcg_cipher.cpp
    src/loader/bcj_filter.cpp
    src/loader/pe_mapper.cpp
    src/hooks/relay_hook.cpp
    src/hooks/deskrt_hook.cpp                   # DeskRT video codec hooks
    src/hooks/tailscale_hook.cpp                # Tailscale + LAN P2P direct hooks
)

if (MSVC)
    list(APPEND SOURCES resources/AnyDesk.rc)
endif()

# CLI flags supported:
#   --port <n>        override direct P2P listening port (default 7070)
#   --console         display live P2P network status console
#   --p2p-info        display detected Tailscale & LAN addresses
#   --relay <host>    redirect AnyNet relay server
#   --lossless        force DeskRT capability bit 33 (lossless RLE+LZ codec)
#   --fps <n>         cap captured FPS before encoding

add_executable(AnyHandesk ${SOURCES})

# Required Windows system libraries
target_link_libraries(AnyHandesk PRIVATE
    kernel32
    user32
    gdi32
    shell32
    advapi32
    ws2_32
    crypt32
    version
    iphlpapi
)

# Post-build: copy core DLL next to executable
add_custom_command(TARGET AnyHandesk POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E copy_if_different
    ${CMAKE_CURRENT_SOURCE_DIR}/src/core/win_app.dll
    $<TARGET_FILE_DIR:AnyHandesk>/win_app.dll
)