package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class uq implements ServiceConnection {
    public final Logging a = new Logging("ControlServiceConnection");
    public final Context b;
    public final j11 c;
    public final k80 d;
    public volatile c80 e;

    public uq(Context context, j11 j11Var, yx yxVar) {
        this.b = context;
        this.c = j11Var;
        this.d = yxVar;
    }

    public final void a() {
        if (this.e == null && c()) {
            this.a.e("binding to control service: ".concat(this.c.a));
            Intent intent = new Intent();
            intent.setClassName(this.c.a, "com.anydesk.adcontrol.ControlService");
            if (this.b.bindService(intent, this, 1)) {
                return;
            }
            this.a.a("cannot bind to control service");
        }
    }

    public final void b() {
        try {
            this.b.unbindService(this);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot unbind service: "), this.a);
        }
    }

    public final boolean c() {
        PackageManager packageManager = this.b.getPackageManager();
        if (packageManager != null) {
            j11[] j11VarArr = tq.a;
            j11 j11Var = this.c;
            Signature signatureC = j11Var != null ? d51.c(packageManager, j11Var.a) : null;
            Logging logging = this.a;
            if (signatureC != null) {
                if (j11Var == null ? false : j11Var.b(signatureC)) {
                    return true;
                }
                logging.a("control service verification failed: ".concat(j11Var.a));
                return false;
            }
            logging.e("control service not installed: ".concat(j11Var.a));
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c80 c80Var;
        int iC;
        String packageName = componentName.getPackageName();
        if (!this.c.a.equals(packageName) || !c()) {
            this.a.a("rejected control connection to " + packageName);
            b();
            return;
        }
        int i = b80.d;
        if (iBinder == null) {
            c80Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.anydesk.adcontrol.IControlService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c80)) {
                a80 a80Var = new a80();
                a80Var.d = iBinder;
                c80Var = a80Var;
            } else {
                c80Var = (c80) iInterfaceQueryLocalInterface;
            }
        }
        this.e = c80Var;
        try {
            iC = ((a80) this.e).c();
        } catch (RemoteException unused) {
            iC = 0;
        }
        this.a.e("connected to control service " + packageName + " " + iC);
        k80 k80Var = this.d;
        if (k80Var != null) {
            k80Var.e(this.c, true);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.h("disconnected from control service " + componentName.getPackageName());
        this.e = null;
        k80 k80Var = this.d;
        if (k80Var != null) {
            k80Var.e(this.c, false);
        }
        b();
    }
}
