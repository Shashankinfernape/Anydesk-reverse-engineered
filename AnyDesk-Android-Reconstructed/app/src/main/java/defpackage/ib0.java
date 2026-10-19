package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.DismissIncomingRequestReceiver;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;
    public final /* synthetic */ byte[] k;
    public final /* synthetic */ long l;

    public ib0(int i, long j, byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3, byte[] bArr4, long j2, int i2, long j3) {
        this.c = 0;
        this.j = j;
        this.h = i;
        this.e = bArr;
        this.f = bArr2;
        this.d = z;
        this.g = bArr3;
        this.k = bArr4;
        this.l = j2;
        this.i = i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    private final void a() {
        boolean z;
        Context context;
        MainApplication mainApplicationV = MainApplication.v();
        if (this.j == JniAdExt.D2() || JniAdExt.h2(io.KEY_INTERACTIVE_ACCESS) == 2) {
            z = false;
        } else {
            mainApplicationV.getClass();
            if (JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_LOCAL_SCAM_WARNING) == 0) {
                z = false;
            } else {
                long j = this.j;
                HashSet hashSet = mainApplicationV.R;
                if (j == 0 ? !hashSet.isEmpty() : hashSet.contains(Long.valueOf(j))) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        int i = this.h;
        long j2 = this.j;
        String strT = nd0.t(this.e);
        String strT2 = nd0.t(this.f);
        boolean z2 = this.d;
        String strT3 = nd0.t(this.g);
        byte[] bArr = this.k;
        n11 n11Var = new n11((int) this.l);
        z80 z80Var = new z80(i, j2, strT, strT2, z2, strT3, bArr, n11Var, new lo((byte) this.i), z);
        JniAdExt.C0.put(Integer.valueOf(this.h), z80Var);
        boolean zM3 = JniAdExt.m3();
        if (!JniAdExt.i3() && !zM3) {
            JniAdExt.jniCloseIncomingConnection(this.h);
            return;
        }
        if (!zM3) {
            gq0 gq0Var = new gq0(JniAdExt.d);
            if (gq0Var.c != null && (context = gq0Var.b) != null) {
                dq0 dq0Var = new dq0(context, "anydesk_headsup");
                dq0Var.o = "anydesk_headsup";
                dq0Var.h(t70.E(gq0Var.b, bArr, z2, true, gq0Var.a));
                dq0Var.w.icon = R.drawable.ic_notify_connecting;
                dq0Var.q = uj.l(gq0Var.b, R.color.colorPrimary);
                dq0Var.f(JniAdExt.n1("ad.accept.title.android"));
                dq0Var.e(t70.r(q51.c(n11Var), t70.c(j2, strT3, strT, strT2, z2)));
                dq0Var.d(true);
                dq0Var.i = 1;
                dq0Var.r = 1;
                Intent intent = new Intent(gq0Var.b, (Class<?>) MainActivity.class);
                int iS = bu0.s();
                Context context2 = gq0Var.b;
                int i2 = gq0.d;
                PendingIntent activity = PendingIntent.getActivity(context2, iS, intent, i2);
                dq0Var.g = activity;
                dq0Var.a(new aq0(IconCompat.b(gq0Var.b, R.drawable.ic_notify_action_ok), JniAdExt.n1("ad.dlg.session_invitation.open_anydesk"), activity).a());
                Intent intent2 = new Intent(gq0Var.b, (Class<?>) DismissIncomingRequestReceiver.class);
                intent2.putExtra("session_idx", i);
                dq0Var.a(new aq0(IconCompat.b(gq0Var.b, R.drawable.ic_notify_action_disconnect), JniAdExt.n1("ad.accept.btn.dismiss"), PendingIntent.getBroadcast(gq0Var.b, bu0.s(), intent2, i2)).a());
                gq0Var.c.notify(600, dq0Var.b());
            }
        }
        JniAdExt.n0.e(z80Var);
        zd zdVar = JniAdExt.B;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    ed0 ed0Var = (ed0) tdVar.next();
                    if (ed0Var != null) {
                        ((MainApplication) ed0Var).G(z80Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                a();
                return;
            case 1:
                x00 x00Var = MainApplication.v().s;
                if (x00Var == null) {
                    return;
                }
                boolean z = this.d;
                if (z && x00Var.j) {
                    return;
                }
                JniAdExt.u1(x00Var, new mz(z, nd0.t(this.e), nd0.t(this.f), nd0.t(this.g), new xy(this.h), new wy(this.i), this.j, nd0.t(this.k), this.l));
                return;
            default:
                x00 x00Var2 = MainApplication.v().s;
                if (x00Var2 == null) {
                    return;
                }
                boolean z2 = this.d;
                if (z2 && x00Var2.j) {
                    return;
                }
                x00Var2.K(new mz(z2, nd0.t(this.e), nd0.t(this.f), nd0.t(this.g), new xy(this.h), new wy(this.i), this.j, nd0.t(this.k), this.l));
                x00Var2.z(1, this.d);
                zd zdVar = JniAdExt.f0;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                            if (fileManagerFileListFragment != null) {
                                t70.Y(new b00(fileManagerFileListFragment, this.d, 4));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ ib0(boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, long j, byte[] bArr4, long j2, int i3) {
        this.c = i3;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = bArr4;
        this.l = j2;
    }
}
