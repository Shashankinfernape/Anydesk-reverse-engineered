package defpackage;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.PowerManager;
import android.view.InputEvent;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class xx extends wx {
    public final q90 b;
    public final p90 c;
    public final us0 d;
    public final dj e;

    public xx(Context context) {
        Method declaredMethod;
        new Logging("EventInjectorManagerInternal").e("setting up event injection");
        this.d = new us0(2);
        q90 q90Var = new q90();
        this.b = q90Var;
        InputManager inputManager = (InputManager) context.getSystemService("input");
        try {
            declaredMethod = InputManager.class.getDeclaredMethod("injectInputEvent", InputEvent.class, Integer.TYPE);
        } catch (Throwable unused) {
            declaredMethod = null;
        }
        q90Var.e = (inputManager == null || declaredMethod == null) ? new g8() : new f8(inputManager, declaredMethod);
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        q90 q90Var2 = this.b;
        if (powerManager != null) {
            this.c = new p90(new bc(new r90(q90Var2, powerManager)));
        } else {
            this.c = new p90(new bc(q90Var2));
        }
        dj djVar = new dj((Object) this.c, true);
        this.e = djVar;
        JniAdExt.N = djVar;
        JniAdExt.G4(true);
    }

    @Override // defpackage.wx
    public final p90 c() {
        return this.c;
    }

    @Override // defpackage.wx
    public final q90 d() {
        return this.b;
    }

    @Override // defpackage.wx
    public final o80 e() {
        return this.d;
    }

    @Override // defpackage.wx
    public final j11 h() {
        return null;
    }

    @Override // defpackage.wx
    public final j11 i() {
        return null;
    }

    @Override // defpackage.wx
    public final j11 k() {
        return null;
    }

    @Override // defpackage.wx
    public final j11 l() {
        return null;
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
        return false;
    }

    @Override // defpackage.wx
    public final j11 q() {
        return null;
    }

    @Override // defpackage.wx
    public final void s() {
        dj djVar = this.e;
        if (djVar != null) {
            djVar.l(this.a.get());
        }
    }

    @Override // defpackage.wx
    public final void a(Context context) {
    }

    @Override // defpackage.wx
    public final void f(Context context) {
    }

    @Override // defpackage.wx
    public final void g(Context context) {
    }

    @Override // defpackage.wx
    public final void r(Context context) {
    }

    @Override // defpackage.wx
    public final void u(Context context) {
    }

    @Override // defpackage.wx
    public final void b() {
    }

    @Override // defpackage.wx
    public final void j() {
    }

    @Override // defpackage.wx
    public final void m() {
    }

    @Override // defpackage.wx
    public final void t() {
    }
}
