package defpackage;

import android.os.PowerManager;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class r90 implements ad0 {
    public final ad0 c;
    public final PowerManager.WakeLock d;
    public long e = 0;

    public r90(ad0 ad0Var, PowerManager powerManager) {
        this.c = ad0Var;
        this.d = powerManager.newWakeLock(268435462, "AnyDesk:injector");
    }

    public final void a() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.e > 1000) {
                this.e = jUptimeMillis;
                this.d.acquire();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.ad0
    public final boolean b(int i, int i2, nm0 nm0Var, int i3) {
        a();
        try {
            return this.c.b(i, i2, nm0Var, i3);
        } finally {
            d();
        }
    }

    @Override // defpackage.ad0
    public final boolean c(String str) {
        a();
        try {
            return this.c.c(str);
        } finally {
            d();
        }
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.ad0
    public final boolean o(byte b, int i, de0 de0Var, int i2) {
        a();
        try {
            return this.c.o(b, i, de0Var, i2);
        } finally {
            d();
        }
    }

    @Override // defpackage.ad0
    public final void t() {
        a();
        try {
            this.c.t();
        } finally {
            d();
        }
    }

    @Override // defpackage.ad0
    public final boolean u(e7 e7Var) {
        a();
        try {
            return this.c.u(e7Var);
        } finally {
            d();
        }
    }

    @Override // defpackage.ad0
    public final void x() {
        this.c.x();
    }
}
