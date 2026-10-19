package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.PowerManager;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.adcontrol.AdDeviceAdminReceiver;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class cy extends wx {
    public final Logging b;
    public final q90 c;
    public final p90 d;
    public final us0 e;
    public final uq f;
    public final e8 g;
    public final dj h;
    public final yw0 i;
    public final Context j;
    public final ah k;

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public cy(Context context, yw0 yw0Var) {
        Logging logging = new Logging("EventInjectorManagerSamsung");
        this.b = logging;
        ay ayVar = new ay(this);
        this.j = context;
        this.i = yw0Var;
        k11 k11VarA = tq.a();
        this.k = new ah(context, k11VarA);
        this.e = new us0(2);
        logging.e("setting up event injection (p1=" + (k11VarA == null ? "null" : k11VarA.a()) + ")");
        AdDeviceAdminReceiver.b.add(ayVar);
        if (yw0Var.a >= 11) {
            yw0Var.a();
        } else {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) yw0Var.f;
            if (devicePolicyManager != null ? devicePolicyManager.isAdminActive((ComponentName) yw0Var.e) : false) {
                yw0Var.a();
            } else {
                yw0Var.e();
            }
        }
        try {
            EnterpriseDeviceManager enterpriseDeviceManager = EnterpriseDeviceManager.getInstance(context);
            Logging logging2 = er0.a;
            q90 q90Var = new q90();
            this.c = q90Var;
            if (k11VarA != null) {
                uq uqVar = new uq(context, k11VarA, null);
                this.f = uqVar;
                e8 e8Var = new e8(new i8(uqVar, k11VarA.e), new h8(enterpriseDeviceManager.getRemoteInjection(), yw0Var), false, false);
                this.g = e8Var;
                q90Var.e = e8Var;
            } else {
                q90Var.e = new h8(enterpriseDeviceManager.getRemoteInjection(), yw0Var);
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                this.d = new p90(new bc(new r90(q90Var, powerManager)));
            } else {
                this.d = new p90(new bc(q90Var));
            }
            dj djVar = new dj((Object) this.d, true);
            this.h = djVar;
            t();
            JniAdExt.N = djVar;
            JniAdExt.G4(true);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot setup samsung event injection: "), this.b);
        }
    }

    @Override // defpackage.wx
    public final void a(Context context) {
        ah ahVar = this.k;
        if (ahVar.p()) {
            ahVar.a(context);
            return;
        }
        ComponentName componentName = (ComponentName) this.i.e;
        String string = this.j.getString(R.string.device_admin_description);
        Logging logging = this.b;
        Looper looper = t70.a;
        Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
        intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
        intent.putExtra("android.app.extra.ADD_EXPLANATION", string);
        intent.addFlags(268435456);
        try {
            if (t70.d(context, intent)) {
                context.startActivity(intent);
                return;
            }
            if (logging != null) {
                logging.a("cannot open device admin settings: no handler found");
            }
            t70.g0(context, JniAdExt.n1("ad.menu.install.android.device_admin.error"), 1);
            t70.T(context, logging, new Intent("android.settings.SETTINGS").addFlags(268435456));
        } catch (Throwable th) {
            if (logging != null) {
                q51.o(th, new StringBuilder("cannot open device admin settings: "), logging);
            }
        }
    }

    @Override // defpackage.wx
    public final void b() {
        uq uqVar = this.f;
        if (uqVar != null) {
            uqVar.a();
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
        return this.e;
    }

    @Override // defpackage.wx
    public final void f(Context context) {
        ah ahVar = this.k;
        if (ahVar.r() != null) {
            ahVar.j(context);
        }
    }

    @Override // defpackage.wx
    public final j11 h() {
        return this.k.l();
    }

    @Override // defpackage.wx
    public final j11 i() {
        return null;
    }

    @Override // defpackage.wx
    public final void j() {
        this.k.q();
    }

    @Override // defpackage.wx
    public final j11 k() {
        return this.k.r();
    }

    @Override // defpackage.wx
    public final j11 l() {
        return this.k.s();
    }

    @Override // defpackage.wx
    public final j11 n() {
        return null;
    }

    @Override // defpackage.wx
    public final j11 o() {
        return null;
    }

    @Override // defpackage.wx
    public final boolean p() {
        if (this.k.p()) {
            return true;
        }
        yw0 yw0Var = this.i;
        if (yw0Var.a < 11) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) yw0Var.f;
            if (!(devicePolicyManager != null ? devicePolicyManager.isAdminActive((ComponentName) yw0Var.e) : false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wx
    public final j11 q() {
        return this.k.r();
    }

    @Override // defpackage.wx
    public final void r(Context context) {
        ah ahVar = this.k;
        if (ahVar.s() == null || ahVar.s() == null) {
            return;
        }
        ah.k(context, (PackageManager) ahVar.d, (j11) ahVar.c, true);
    }

    @Override // defpackage.wx
    public final void s() {
        t();
    }

    @Override // defpackage.wx
    public final void t() {
        e8 e8Var;
        boolean z = this.a.get();
        dj djVar = this.h;
        if (djVar != null) {
            djVar.l(z);
        }
        if (z && (e8Var = this.g) != null) {
            e8Var.e = true;
        }
        this.k.m(this.f);
    }

    @Override // defpackage.wx
    public final void g(Context context) {
    }

    @Override // defpackage.wx
    public final void u(Context context) {
    }

    @Override // defpackage.wx
    public final void m() {
    }
}
