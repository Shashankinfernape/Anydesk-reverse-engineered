package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class lc0 extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zIsConnected;
        if (intent == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String str = "none";
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    zIsConnected = activeNetworkInfo.isConnected();
                    try {
                        int type = activeNetworkInfo.getType();
                        if (type == 1) {
                            str = "wifi";
                        } else if (type == 0) {
                            str = "mobile";
                        } else {
                            str = "" + type;
                        }
                    } catch (Throwable th) {
                        th = th;
                        JniAdExt.b.h("failed to get connectivity state: " + th.getMessage());
                    }
                } else {
                    zIsConnected = false;
                }
            } catch (Throwable th2) {
                th = th2;
                zIsConnected = false;
            }
        } else {
            zIsConnected = false;
        }
        boolean z = intent.getBooleanExtra("noConnectivity", false) ? false : zIsConnected;
        JniAdExt.b.e("connectivity changed: isConnected=" + z + " type=" + str);
        if (!z || JniAdExt.l == 2) {
            return;
        }
        JniAdExt.Q3();
    }
}
