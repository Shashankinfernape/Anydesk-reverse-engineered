package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements ServiceConnection {
    public Context a;
    public final /* synthetic */ MainApplication b;

    public hi0(MainApplication mainApplication) {
        this.b = mainApplication;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h80 h80Var;
        if (this.a == null) {
            nh0.j("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = g80.d;
        bc bcVar = null;
        if (iBinder == null) {
            h80Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(h80.b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h80)) {
                f80 f80Var = new f80();
                f80Var.d = iBinder;
                h80Var = f80Var;
            } else {
                h80Var = (h80) iInterfaceQueryLocalInterface;
            }
        }
        vr vrVar = new vr();
        vrVar.attachInterface(vrVar, e80.a);
        new Handler(Looper.getMainLooper());
        try {
            if (((f80) h80Var).a(vrVar)) {
                bcVar = new bc(vrVar, componentName, 17, false);
            }
        } catch (RemoteException unused) {
        }
        MainApplication mainApplication = this.b;
        mainApplication.h0 = bcVar;
        mainApplication.d.e("custom tabs service connected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        MainApplication mainApplication = this.b;
        mainApplication.h0 = null;
        mainApplication.d.e("custom tabs service disconnected");
    }
}
