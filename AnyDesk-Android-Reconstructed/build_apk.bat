@echo off
setlocal enabledelayedexpansion

echo ========================================================
echo  AnyDesk Android APK Rebuilder and Signer
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

echo [1/3] Building APK with Apktool...
java -jar "%APKTOOL_JAR%" b "%SCRIPT_DIR%apktool_src" -o "%SCRIPT_DIR%AnyDesk_unsigned.apk"
if errorlevel 1 (
    echo [ERROR] Apktool build failed!
    exit /b 1
)

echo [2/3] Signing APK with debug keystore...
cmd /c "%APKSIGNER% sign --ks \"%KEYSTORE%\" --ks-pass pass:android --key-pass pass:android --out \"%SCRIPT_DIR%AnyDesk.apk\" \"%SCRIPT_DIR%AnyDesk_unsigned.apk\""
if errorlevel 1 (
    echo [ERROR] Signing failed!
    exit /b 1
)

if exist "%SCRIPT_DIR%AnyDesk_unsigned.apk" del "%SCRIPT_DIR%AnyDesk_unsigned.apk"

echo [3/3] Copying to release folder...
if not exist "%SCRIPT_DIR%release" mkdir "%SCRIPT_DIR%release"
copy /y "%SCRIPT_DIR%AnyDesk.apk" "%SCRIPT_DIR%release\AnyDesk.apk"
if exist "%SCRIPT_DIR%AnyDesk.apk.idsig" copy /y "%SCRIPT_DIR%AnyDesk.apk.idsig" "%SCRIPT_DIR%release\AnyDesk.apk.idsig"

echo ========================================================
echo  SUCCESS: AnyDesk.apk generated and signed!
echo  Release: %SCRIPT_DIR%release\AnyDesk.apk
echo ========================================================
