@echo off
setlocal enabledelayedexpansion

echo ========================================================
echo  AnyHandesk Android APK Builder (Tailscale + LAN)
echo ========================================================

set SCRIPT_DIR=%~dp0
set APKTOOL_JAR=%SCRIPT_DIR%..\..\Git-repos\tools\apktool.jar
if not exist "%APKTOOL_JAR%" (
    set APKTOOL_JAR=C:\Users\user\Desktop\El projecto\Git-repos\tools\apktool.jar
)

set KEYSTORE=%SCRIPT_DIR%debug.keystore
set APKSIGNER=C:\Users\user\AppData\Local\Android\Sdk\build-tools\35.0.0\apksigner.bat
if not exist "%APKSIGNER%" (
    for /d %%D in ("C:\Users\user\AppData\Local\Android\Sdk\build-tools\*") do (
        if exist "%%D\apksigner.bat" set APKSIGNER=%%D\apksigner.bat
    )
)

echo [1/3] Building APK with Apktool (Clean and Force Rebuild)...
if exist "%SCRIPT_DIR%apktool_src\build" rd /s /q "%SCRIPT_DIR%apktool_src\build"
java -jar "%APKTOOL_JAR%" b -f "%SCRIPT_DIR%apktool_src" -o "%SCRIPT_DIR%AnyHandesk_unsigned.apk"
if errorlevel 1 (
    echo [ERROR] Apktool build failed!
    exit /b 1
)

echo [2/3] Signing APK with debug keystore...
call "%APKSIGNER%" sign --ks "%KEYSTORE%" --ks-pass pass:android --key-pass pass:android --out "%SCRIPT_DIR%AnyHandesk.apk" "%SCRIPT_DIR%AnyHandesk_unsigned.apk"
if errorlevel 1 (
    echo [ERROR] Signing failed!
    exit /b 1
)

if exist "%SCRIPT_DIR%AnyHandesk_unsigned.apk" del "%SCRIPT_DIR%AnyHandesk_unsigned.apk"

echo [3/3] Copying to release folder...
if not exist "%SCRIPT_DIR%release" mkdir "%SCRIPT_DIR%release"
copy /y "%SCRIPT_DIR%AnyHandesk.apk" "%SCRIPT_DIR%release\AnyHandesk.apk"
if exist "%SCRIPT_DIR%AnyHandesk.apk.idsig" copy /y "%SCRIPT_DIR%AnyHandesk.apk.idsig" "%SCRIPT_DIR%release\AnyHandesk.apk.idsig"

echo ========================================================
echo  SUCCESS: AnyHandesk.apk generated and signed!
echo  Release: %SCRIPT_DIR%release\AnyHandesk.apk
echo ========================================================
