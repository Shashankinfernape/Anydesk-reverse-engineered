@echo off
setlocal enabledelayedexpansion

echo ========================================================
echo  AnyDesk Windows Executable Builder and Repacker
echo ========================================================

set SCRIPT_DIR=%~dp0
set PYTHON=python

echo [1/3] Repacking standalone AnyDesk executable...
%PYTHON% "%SCRIPT_DIR%scripts\repack_anydesk.py" --exe "C:\Users\user\Desktop\El projecto\Git-repos\AnyDesk.exe" --raw "C:\Users\user\Desktop\El projecto\Git-repos\Anydesking\reverse-eng\windows\unpacked_raw.bin" --out "%SCRIPT_DIR%AnyDesk.exe"
if errorlevel 1 (
    echo [ERROR] Repack failed!
    exit /b 1
)

echo [2/3] Copying core library...
if not exist "%SCRIPT_DIR%win_app.dll" (
    copy /y "%SCRIPT_DIR%src\core\win_app.dll" "%SCRIPT_DIR%win_app.dll"
)

echo [3/3] Copying to release folder...
if not exist "%SCRIPT_DIR%release" mkdir "%SCRIPT_DIR%release"
copy /y "%SCRIPT_DIR%AnyDesk.exe" "%SCRIPT_DIR%release\AnyDesk.exe"
copy /y "%SCRIPT_DIR%win_app.dll" "%SCRIPT_DIR%release\win_app.dll"

echo ========================================================
echo  SUCCESS: AnyDesk.exe generated and verified!
echo  Release: %SCRIPT_DIR%release\AnyDesk.exe
echo ========================================================
