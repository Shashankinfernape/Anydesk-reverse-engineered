package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public class d8 implements z70 {
    public final i8 c;
    public final z70 d;
    public boolean e;
    public final boolean f;
    public boolean g = false;
    public long h = 0;

    public d8(i8 i8Var, z70 z70Var, boolean z, boolean z2) {
        this.c = i8Var;
        this.d = z70Var;
        this.e = z2;
        this.f = z;
    }

    @Override // defpackage.z70
    public final boolean a(KeyEvent keyEvent) {
        z70 z70VarB;
        z70 z70VarD = d();
        boolean zA = z70VarD != null ? z70VarD.a(keyEvent) : false;
        return (zA || (z70VarB = b()) == null) ? zA : z70VarB.a(keyEvent);
    }

    public final z70 b() {
        int iR = q51.r(1);
        if (iR != 0) {
            if (iR != 1) {
                if (iR == 2) {
                    return this.d;
                }
                new Logging("AndroidEventInjectorFallback").c("unhandled fallback mode: ".concat("pfm_auto"));
                return null;
            }
            if (!this.e) {
                return null;
            }
        } else if (!this.e) {
            return null;
        }
        return this.c;
    }

    @Override // defpackage.z70
    public boolean c(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f;
        z70 z70Var = this.d;
        boolean zC = false;
        if (!z2) {
            z = false;
        } else {
            if (z70Var.c(motionEvent)) {
                return true;
            }
            z = true;
        }
        if (this.e && (zC = this.c.c(motionEvent))) {
            this.g = true;
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 5 || actionMasked == 6) {
                this.h = SystemClock.uptimeMillis();
            }
        }
        return (zC || z || (this.g && SystemClock.uptimeMillis() < this.h + 200 && (actionMasked == 11 || actionMasked == 12 || actionMasked == 7 || actionMasked == 9 || actionMasked == 10))) ? zC : z70Var.c(motionEvent);
    }

    public final z70 d() {
        int iR = q51.r(1);
        if (iR == 0 || iR == 1) {
            return this.d;
        }
        if (iR != 2) {
            new Logging("AndroidEventInjectorFallback").c("unhandled fallback mode: ".concat("pfm_auto"));
            return null;
        }
        if (this.e) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.z70
    public final boolean e(String str) {
        z70 z70VarD;
        z70 z70VarB = b();
        boolean zE = z70VarB != null ? z70VarB.e(str) : false;
        return (zE || (z70VarD = d()) == null) ? zE : z70VarD.e(str);
    }

    @Override // defpackage.z70
    public boolean f(MotionEvent[] motionEventArr) {
        z70 z70VarB = b();
        z70 z70VarD = d();
        if (z70VarB == null || z70VarD == null) {
            if (z70VarB == null) {
                z70VarB = z70VarD;
            }
            if (z70VarB != null) {
                return z70VarB.f(motionEventArr);
            }
            return false;
        }
        boolean zC = true;
        for (MotionEvent motionEvent : motionEventArr) {
            zC &= c(motionEvent);
        }
        return zC;
    }

    @Override // defpackage.z70
    public final boolean i(int i) {
        z70 z70VarD;
        z70 z70VarB = b();
        boolean zI = z70VarB != null ? z70VarB.i(i) : false;
        return (zI || (z70VarD = d()) == null) ? zI : z70VarD.i(i);
    }
}
