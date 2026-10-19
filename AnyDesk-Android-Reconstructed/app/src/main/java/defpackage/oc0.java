package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ConnectivityManager connectivityManager = (ConnectivityManager) JniAdExt.d.getSystemService("connectivity");
        String str = "error";
        if (connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    str = "inet=" + networkCapabilities.hasCapability(12) + " mobile=" + networkCapabilities.hasTransport(0) + " wifi=" + networkCapabilities.hasTransport(1) + " eth=" + networkCapabilities.hasTransport(3);
                }
            } catch (Throwable th) {
                JniAdExt.b.h("failed to get connectivity state: " + th.getMessage());
            }
        }
        JniAdExt.b.e("connectivity changed: network available (" + str + ")");
        if (JniAdExt.l != 2) {
            JniAdExt.Q3();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
    }
}
