package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class zx extends wx {
    public final Logging b;
    public final q90 c;
    public final p90 d;
    public final uq e;
    public final uq f;
    public final i8 g;
    public final i8 h;
    public final dj i;
    public final k80 j;
    public final k11 k;
    public final j11 l;
    public final ah m;
    public final ah n;
    public final yx o;

    public zx(ev evVar, Context context) {
        i8 i8Var;
        Logging logging = new Logging("EventInjectorManagerPluginFallback");
        this.b = logging;
        yx yxVar = new yx(this);
        this.o = new yx(this);
        this.j = evVar;
        k11 k11VarA = tq.a();
        this.k = k11VarA;
        j11 j11VarB = tq.b(context.getPackageManager());
        this.l = j11VarB;
        this.m = new ah(context, k11VarA);
        this.n = new ah(context, j11VarB);
        logging.e("setting up event injection (p1=" + (k11VarA == null ? "null" : k11VarA.a()) + ", p2=" + (j11VarB != null ? j11VarB.a() : "null") + ")");
        if (k11VarA == null && j11VarB == null) {
            logging.a("no control service available");
            this.e = null;
            this.g = null;
            this.f = null;
            this.h = null;
            this.c = null;
            this.d = null;
            this.i = null;
            return;
        }
        if (k11VarA != null) {
            uq uqVar = new uq(context, k11VarA, yxVar);
            this.e = uqVar;
            this.g = new i8(uqVar, k11VarA.e);
        } else {
            this.e = null;
            this.g = null;
        }
        if (j11VarB != null) {
            uq uqVar2 = new uq(context, j11VarB, yxVar);
            this.f = uqVar2;
            this.h = new i8(uqVar2, j11VarB.e);
        } else {
            this.f = null;
            this.h = null;
        }
        q90 q90Var = new q90();
        this.c = q90Var;
        i8 i8Var2 = this.g;
        if (i8Var2 != null && (i8Var = this.h) != null) {
            q90Var.e = new d8(i8Var2, i8Var, true, true);
        } else if (i8Var2 != null) {
            q90Var.e = i8Var2;
        } else {
            q90Var.e = this.h;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.d = new p90(new bc(new r90(q90Var, powerManager)));
        } else {
            this.d = new p90(new bc(q90Var));
        }
        this.i = new dj((Object) this.d, false);
        t();
    }

    @Override // defpackage.wx
    public final void a(Context context) {
        this.m.a(context);
    }

    @Override // defpackage.wx
    public final void b() {
        uq uqVar = this.e;
        if (uqVar != null) {
            uqVar.a();
        }
        uq uqVar2 = this.f;
        if (uqVar2 != null) {
            uqVar2.a();
        }
    }

    @Override // defpackage.wx
    public final p90 c() {
        return this.d;
    }

    @Override // defpackage.wx
    public final q90 d() {
        return this.c;
    }

    @Override // defpackage.wx
    public final o80 e() {
        return this.o;
    }

    @Override // defpackage.wx
    public final void f(Context context) {
        ah ahVar = this.m;
        if (ahVar.r() != null) {
            ahVar.j(context);
        }
    }

    @Override // defpackage.wx
    public final void g(Context context) {
        ah ahVar = this.n;
        if (ahVar.r() != null) {
            ahVar.j(context);
        }
    }

    @Override // defpackage.wx
    public final j11 h() {
        return this.m.l();
    }

    @Override // defpackage.wx
    public final j11 i() {
        return this.n.l();
    }

    @Override // defpackage.wx
    public final void j() {
        this.m.q();
    }

    @Override // defpackage.wx
    public final j11 k() {
        return this.m.r();
    }

    @Override // defpackage.wx
    public final j11 l() {
        return this.m.s();
    }

    @Override // defpackage.wx
    public final void m() {
        this.n.q();
    }

    @Override // defpackage.wx
    public final j11 n() {
        return this.n.r();
    }

    @Override // defpackage.wx
    public final j11 o() {
        return this.n.s();
    }

    @Override // defpackage.wx
    public final boolean p() {
        return this.m.p();
    }

    @Override // defpackage.wx
    public final j11 q() {
        j11 j11VarR = this.m.r();
        j11 j11VarR2 = this.n.r();
        if (j11VarR == null || j11VarR2 == null) {
            return null;
        }
        return j11VarR != null ? j11VarR : j11VarR2;
    }

    @Override // defpackage.wx
    public final void r(Context context) {
        ah ahVar = this.m;
        if (ahVar.s() == null || ahVar.s() == null) {
            return;
        }
        ah.k(context, (PackageManager) ahVar.d, (j11) ahVar.c, true);
    }

    @Override // defpackage.wx
    public final void s() {
        boolean z = this.a.get();
        dj djVar = this.i;
        if (djVar != null) {
            djVar.l(z);
        }
    }

    @Override // defpackage.wx
    public final void t() {
        s();
        boolean z = this.m.m(this.e) || this.n.m(this.f);
        JniAdExt.N = z ? this.i : null;
        JniAdExt.G4(z);
    }

    @Override // defpackage.wx
    public final void u(Context context) {
        ah ahVar = this.n;
        if (ahVar.s() == null || ahVar.s() == null) {
            return;
        }
        ah.k(context, (PackageManager) ahVar.d, (j11) ahVar.c, true);
    }
}
