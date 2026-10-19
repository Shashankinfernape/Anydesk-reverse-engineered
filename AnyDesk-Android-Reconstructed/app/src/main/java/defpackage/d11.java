package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d11 {
    public final Bundle a;
    public final le0 b;

    public d11(Bundle bundle, le0 le0Var) {
        this.a = bundle;
        this.b = le0Var;
    }

    public final void a(int i, RemoteException remoteException) {
        le0 le0Var = this.b;
        if (le0Var != null) {
            le0Var.u(i, remoteException);
            return;
        }
        Log.e("SendableMessage", "Error sending message. error: " + i, remoteException);
    }
}
