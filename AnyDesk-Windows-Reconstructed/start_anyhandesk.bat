@echo off
setlocal
echo ========================================================
echo   AnyHandesk (Standard Tailscale + LAN P2P Host)
echo ========================================================
echo.
echo Binding UDP 21118 across all interfaces...
start "" "%~dp0release\AnyHandesk.exe"
echo.
echo AnyHandesk Host started successfully!
echo.
echo Detected Network Endpoints:
echo  - Tailscale Mesh : 100.76.1.80:21118
echo  - Local LAN      : 10.145.162.181:21118 (or 192.168.56.1:21118)
echo.
pause
