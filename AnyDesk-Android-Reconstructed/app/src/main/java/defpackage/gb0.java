package defpackage;

import android.os.Build;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ gb0(int i, int i2, int i3, int i4) {
        this.c = i4;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iB;
        vl0 vl0VarF;
        switch (this.c) {
            case 0:
                ConnectionFragment connectionFragment = JniAdExt.x;
                if (connectionFragment != null) {
                    int i = this.d;
                    int i2 = this.e;
                    int i3 = this.f;
                    lp lpVar = connectionFragment.d0;
                    if (lpVar == null) {
                        return;
                    }
                    boolean z = Build.VERSION.SDK_INT >= 26 && i == (iB = lpVar.b()) && !((vl0VarF = lpVar.f(iB)) != null && vl0VarF.a == i2 && vl0VarF.b == i3);
                    synchronized (lpVar) {
                        if (i >= 0) {
                            try {
                                if (i >= lpVar.p.length) {
                                    int iX2 = JniAdExt.x2();
                                    vl0[] vl0VarArr = new vl0[iX2];
                                    for (int i4 = 0; i4 < iX2; i4++) {
                                        vl0[] vl0VarArr2 = lpVar.p;
                                        if (i4 < vl0VarArr2.length) {
                                            vl0VarArr[i4] = vl0VarArr2[i4];
                                        } else {
                                            vl0 vl0Var = new vl0();
                                            vl0Var.a = 0;
                                            vl0Var.b = 0;
                                            vl0VarArr[i4] = vl0Var;
                                        }
                                    }
                                    lpVar.p = vl0VarArr;
                                }
                                vl0[] vl0VarArr3 = lpVar.p;
                                if (i < vl0VarArr3.length) {
                                    vl0 vl0Var2 = vl0VarArr3[i];
                                    vl0Var2.a = i2;
                                    vl0Var2.b = i3;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                    if (z) {
                        t70.Y(new uo(connectionFragment, 7));
                        return;
                    }
                    return;
                }
                return;
            default:
                JniAdExt.m0.x(this.d, this.e, this.f);
                return;
        }
    }
}
