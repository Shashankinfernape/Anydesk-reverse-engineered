package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.anydesk.anydeskandroid.ConnectionService;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class qb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;

    public qb0(int i, long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, long j2) {
        this.c = i;
        this.d = j;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = bArr4;
        this.i = z;
        this.j = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainApplication mainApplication = JniAdExt.n;
        if (mainApplication != null) {
            int i = this.c;
            long j = this.d;
            String strT = nd0.t(this.e);
            String strT2 = nd0.t(this.f);
            String strT3 = nd0.t(this.g);
            byte[] bArr = this.h;
            boolean z = this.i;
            int i2 = (int) this.j;
            gi giVar = mainApplication.v;
            if (JniAdExt.h2(io.KEY_UI_NOTIFICATION_SOUND_SESS_CREATE) == 1 && giVar != null) {
                r71.D(mainApplication.getApplicationContext(), giVar.e());
            }
            Looper looper = t70.a;
            mainApplication.P = SystemClock.uptimeMillis();
            boolean z2 = (i2 & 128) == 128;
            int i3 = 2;
            boolean z3 = (i2 & 2) == 2;
            boolean z4 = (i2 & 1) == 1;
            if (z3 && !z4) {
                i3 = 4;
            } else if (z2 && !z4) {
                i3 = 5;
            }
            mainApplication.n0 = i3;
            mainApplication.i = bArr;
            mainApplication.k = i;
            mainApplication.m = j;
            mainApplication.l = z;
            mainApplication.n = strT;
            mainApplication.o = strT2;
            mainApplication.j = strT3;
            m11 m11Var = mainApplication.Z;
            m11Var.getClass();
            Intent intent = new Intent(m11Var.b, (Class<?>) ConnectionService.class);
            intent.putExtra("name", strT3);
            intent.putExtra("cid", j);
            intent.putExtra("alias", strT);
            intent.putExtra("verified", z);
            intent.putExtra("addr", strT2);
            intent.putExtra("imgdata", bArr);
            mainApplication.Z.b(ConnectionService.class, intent);
            mainApplication.r.s();
            mainApplication.r.t();
            mainApplication.s.C(true);
            mainApplication.s.F(JniAdExt.J2());
            synchronized (mainApplication.V) {
                try {
                    zd zdVar = mainApplication.V;
                    zdVar.getClass();
                    td tdVar = new td(zdVar);
                    while (tdVar.hasNext()) {
                        ki0 ki0Var = (ki0) tdVar.next();
                        if (ki0Var != null) {
                            ki0Var.z();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
