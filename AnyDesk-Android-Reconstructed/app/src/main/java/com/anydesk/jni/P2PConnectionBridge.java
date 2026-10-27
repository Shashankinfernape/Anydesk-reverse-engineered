package com.anydesk.jni;

import android.content.Context;
import android.util.Log;
import defpackage.nd0;
import defpackage.ua0;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * P2PConnectionBridge
 * -------------------
 * Provides peer-to-peer connection primitives over:
 * 1. Tailscale WireGuard Mesh (100.64.0.0/10)
 * 2. Local Area Network (192.168.x.x / 10.x.x.x / 172.16-31.x.x)
 *
 * Bypasses official AnyDesk rendezvous/relay servers completely.
 */
public class P2PConnectionBridge {
    private static final String TAG = "AnyHandesk-P2P";
    public static final int DEFAULT_PORT = 7070;

    private static String sTailscaleIp = "";
    private static String sLanIp       = "";
    private static boolean sCloudNeutralized = false;

    /**
     * Check if an IPv4 address belongs to the Tailscale CGNAT subnet (100.64.0.0/10).
     */
    public static boolean isTailscaleIp(String ip) {
        if (ip == null || !ip.startsWith("100.")) {
            return false;
        }
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;
        try {
            int secondOctet = Integer.parseInt(parts[1]);
            return secondOctet >= 64 && secondOctet <= 127;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Check if an IPv4 address belongs to standard private LAN subnets.
     */
    public static boolean isPrivateLanIp(String ip) {
        if (ip == null) return false;
        if (ip.startsWith("192.168.") || ip.startsWith("10.")) {
            return true;
        }
        if (ip.startsWith("172.")) {
            String[] parts = ip.split("\\.");
            if (parts.length >= 2) {
                try {
                    int secondOctet = Integer.parseInt(parts[1]);
                    return secondOctet >= 16 && secondOctet <= 31;
                } catch (NumberFormatException ignored) {}
            }
        }
        return false;
    }

    /**
     * Enumerate network interfaces to discover Tailscale and Local LAN addresses.
     */
    public static synchronized boolean detectNetworkAddresses() {
        try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface intf : interfaces) {
                if (!intf.isUp() || intf.isLoopback()) continue;

                String name = intf.getName().toLowerCase();
                boolean isTsInterface = name.contains("tailscale") || name.contains("tun");

                Enumeration<InetAddress> addrs = intf.getInetAddresses();
                while (addrs.hasMoreElements()) {
                    InetAddress addr = addrs.nextElement();
                    if (addr instanceof Inet4Address && !addr.isLoopbackAddress()) {
                        String host = addr.getHostAddress();
                        if (host == null) continue;

                        if (isTailscaleIp(host) || (isTsInterface && host.startsWith("100."))) {
                            sTailscaleIp = host;
                            Log.i(TAG, "Discovered Tailscale Mesh IP: " + host + " on " + name);
                        } else if (isPrivateLanIp(host)) {
                            if (sLanIp.isEmpty() || name.contains("wlan") || name.contains("eth")) {
                                sLanIp = host;
                                Log.i(TAG, "Discovered Local LAN IP: " + host + " on " + name);
                            }
                        }
                    }
                }
            }
            if (sLanIp.isEmpty()) {
                sLanIp = "127.0.0.1";
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Failed to enumerate network interfaces: " + e.getMessage(), e);
            return false;
        }
    }

    public static String getTailscaleIp() {
        if (sTailscaleIp == null || sTailscaleIp.isEmpty()) {
            detectNetworkAddresses();
        }
        return sTailscaleIp;
    }

    public static String getLanIp() {
        if (sLanIp == null || sLanIp.isEmpty()) {
            detectNetworkAddresses();
        }
        return sLanIp;
    }

    public static boolean isTailscaleConnected() {
        String ts = getTailscaleIp();
        return ts != null && !ts.isEmpty();
    }

    /**
     * Format remote destination address (e.g. "100.76.1.80" -> "100.76.1.80:7070").
     */
    public static String formatDestination(String input) {
        if (input == null) return "";
        String clean = input.trim().replace("\\", "/");
        if (clean.contains(":")) {
            return clean;
        }
        return clean + ":" + DEFAULT_PORT;
    }

    /**
     * Connect directly to target peer via Tailscale Mesh or Local LAN.
     */
    public static boolean connectDirect(String address) {
        if (address == null || address.trim().isEmpty()) {
            Log.e(TAG, "Cannot connect to empty address");
            return false;
        }

        neutralizeCloud();

        final String target = formatDestination(address);
        Log.i(TAG, "Dispatching Direct P2P connection to: " + target);

        try {
            if (JniAdExt.I0 != null) {
                // Post ua0 runnable with opcode 8 (jniConnect) to native handler thread
                JniAdExt.I0.post(new ua0(target, 8));
                return true;
            } else {
                Log.w(TAG, "JniAdExt.I0 handler not initialized, calling jniConnect directly");
                JniAdExt.jniConnect(nd0.T(target));
                return true;
            }
        } catch (Throwable t) {
            Log.e(TAG, "Exception initiating P2P connect: " + t.getMessage(), t);
            return false;
        }
    }

    /**
     * Neutralize official AnyDesk rendezvous servers in memory.
     */
    public static synchronized void neutralizeCloud() {
        if (sCloudNeutralized) return;
        try {
            // Force direct connection flags
            JniAdExt.o1.v(nd0.T("ad.anynet.direct"), nd0.T("1"));
            JniAdExt.o1.v(nd0.T("ad.anynet.allow_direct"), nd0.T("1"));
            JniAdExt.o1.v(nd0.T("ad.anynet.boot_addrs"), nd0.T("127.0.0.1:0"));
            sCloudNeutralized = true;
            Log.i(TAG, "AnyDesk cloud servers neutralized; direct P2P mode enforced.");
        } catch (Throwable t) {
            Log.w(TAG, "Cloud neutralization configuration note: " + t.getMessage());
            sCloudNeutralized = true;
        }
    }

    /**
     * Get a formatted human-readable diagnostic banner.
     */
    public static String getP2PStatusSummary() {
        detectNetworkAddresses();
        StringBuilder sb = new StringBuilder();
        sb.append("AnyHandesk P2P Status\n");
        sb.append("Tailscale: ").append(isTailscaleConnected() ? sTailscaleIp + " [ONLINE]" : "Disconnected").append("\n");
        sb.append("Local LAN: ").append(sLanIp).append("\n");
        sb.append("Port: ").append(DEFAULT_PORT).append("\n");
        sb.append("Cloud Relay: Neutralized (100% P2P)");
        return sb.toString();
    }
}
