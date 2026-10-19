package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ tp0 d;

    public /* synthetic */ pp0(tp0 tp0Var, int i) {
        this.c = i;
        this.d = tp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        final tp0 tp0Var = this.d;
        switch (i) {
            case 0:
                final int i2 = 0;
                t70.V(new Runnable() { // from class: op0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        tp0 tp0Var2 = tp0Var;
                        switch (i3) {
                            case 0:
                                r3.C(tp0Var2.r0, !tp0Var2.I0.a());
                                tp0Var2.H0.d();
                                break;
                            default:
                                ArrayDeque arrayDeque = tp0Var2.G0;
                                if (!arrayDeque.isEmpty()) {
                                    tp0Var2.S0((sx0) arrayDeque.removeFirst());
                                } else {
                                    r3.C(tp0Var2.r0, !tp0Var2.H0.a());
                                    tp0Var2.I0.d();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i3 = 1;
                t70.V(new Runnable() { // from class: op0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        tp0 tp0Var2 = tp0Var;
                        switch (i4) {
                            case 0:
                                r3.C(tp0Var2.r0, !tp0Var2.I0.a());
                                tp0Var2.H0.d();
                                break;
                            default:
                                ArrayDeque arrayDeque = tp0Var2.G0;
                                if (!arrayDeque.isEmpty()) {
                                    tp0Var2.S0((sx0) arrayDeque.removeFirst());
                                } else {
                                    r3.C(tp0Var2.r0, !tp0Var2.H0.a());
                                    tp0Var2.I0.d();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
