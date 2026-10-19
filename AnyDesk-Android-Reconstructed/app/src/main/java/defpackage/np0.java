package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class np0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ y6 a;

    public np0(y6 y6Var) {
        this.a = y6Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (this.a) {
            this.a.G();
            ((ArrayList) this.a.f).add(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.a) {
            this.a.G();
            ((ArrayList) this.a.f).remove(network);
        }
    }
}
