package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ kb0(long j, int i, int i2) {
        this.c = i2;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.c) {
            case 0:
                Hashtable hashtable = JniAdExt.C0;
                int i2 = this.d;
                z80 z80Var = (z80) hashtable.get(Integer.valueOf(i2));
                if (z80Var == null || z80Var.b == this.e) {
                    return;
                }
                JniAdExt.n0.n(i2);
                return;
            default:
                ConnectionFragment connectionFragment = JniAdExt.I;
                lp lpVar = MainApplication.v().r;
                if (lpVar != null) {
                    int i3 = this.d;
                    int[] iArrS = q51.s(4);
                    int length = iArrS.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            i = iArrS[i4];
                            if (q51.r(i) != i3) {
                                i4++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        return;
                    }
                    int iR = q51.r(i);
                    if (iR == 0) {
                        lpVar.F(this.e);
                        if (connectionFragment != null) {
                            t70.Y(new uo(connectionFragment, 8));
                            return;
                        }
                        return;
                    }
                    int i5 = 9;
                    if (iR == 1) {
                        lpVar.E(this.e);
                        if (lpVar.k() == lpVar.l()) {
                            lpVar.B(true);
                        }
                        if (connectionFragment != null) {
                            t70.Y(new uo(connectionFragment, i5));
                            return;
                        }
                        return;
                    }
                    if (iR == 2) {
                        lpVar.C(this.e);
                        if (connectionFragment != null) {
                            t70.Y(new uo(connectionFragment, i5));
                            return;
                        }
                        return;
                    }
                    if (iR != 3) {
                        return;
                    }
                    boolean z = this.e != 0;
                    synchronized (lpVar) {
                        lpVar.h = z;
                    }
                    if (connectionFragment != null) {
                        t70.Y(new uo(connectionFragment, i5));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
