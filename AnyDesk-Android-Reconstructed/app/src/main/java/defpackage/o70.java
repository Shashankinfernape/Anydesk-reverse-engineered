package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends dr implements ft {
    public final Handler e;
    public final boolean f;
    public final o70 g;

    public o70(Handler handler, boolean z) {
        this.e = handler;
        this.f = z;
        this.g = z ? this : new o70(handler, true);
    }

    @Override // defpackage.ft
    public final uu c(long j, final ca1 ca1Var, br brVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.e.postDelayed(ca1Var, j)) {
            return new uu() { // from class: n70
                @Override // defpackage.uu
                public final void b() {
                    this.c.e.removeCallbacks(ca1Var);
                }
            };
        }
        o(brVar, ca1Var);
        return xp0.c;
    }

    @Override // defpackage.ft
    public final void d(long j, xi xiVar) {
        c0 c0Var = new c0(xiVar, 7, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.e.postDelayed(c0Var, j)) {
            xiVar.x(new m70(this, 0, c0Var));
        } else {
            o(xiVar.g, c0Var);
        }
    }

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        if (this.e.post(runnable)) {
            return;
        }
        o(brVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return o70Var.e == this.e && o70Var.f == this.f;
    }

    @Override // defpackage.dr
    public final boolean g(br brVar) {
        return (this.f && y90.e(Looper.myLooper(), this.e.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.e) ^ (this.f ? 1231 : 1237);
    }

    public final void o(br brVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        pd0 pd0Var = (pd0) brVar.l(fw.f);
        if (pd0Var != null) {
            pd0Var.b(cancellationException);
        }
        us usVar = su.a;
        js.e.e(brVar, runnable);
    }

    @Override // defpackage.dr
    public final String toString() {
        o70 o70Var;
        String str;
        us usVar = su.a;
        o70 o70Var2 = li0.a;
        if (this == o70Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                o70Var = o70Var2.g;
            } catch (UnsupportedOperationException unused) {
                o70Var = null;
            }
            str = this == o70Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.e.toString();
        if (!this.f) {
            return string;
        }
        return string + ".immediate";
    }
}
