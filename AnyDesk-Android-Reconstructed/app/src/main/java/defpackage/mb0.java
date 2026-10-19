package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ mb0(int i, int i2, int i3) {
        this.c = i3;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0042  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = 0;
        switch (this.c) {
            case 0:
                if (this.d == 0) {
                    int i3 = this.e;
                    int[] iArrS = q51.s(36);
                    int length = iArrS.length;
                    while (true) {
                        if (i2 < length) {
                            i = iArrS[i2];
                            if (q51.r(i) != i3) {
                                i2++;
                            }
                        } else {
                            i = 1;
                        }
                    }
                    if (i == 16) {
                        t70.g0(JniAdExt.d, JniAdExt.n1("ad.connect.proxy_auth_req.message"), 1);
                        return;
                    } else {
                        if (i == 17) {
                            t70.g0(JniAdExt.d, JniAdExt.n1("ad.connect.proxy_auth_fail.message"), 1);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                JniAdExt.k1(this.d, this.e);
                zd zdVar = JniAdExt.X;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            xc0 xc0Var = (xc0) tdVar.next();
                            if (xc0Var != null) {
                                xc0Var.s();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                int i4 = this.d;
                int i5 = this.e;
                e5 e5Var = null;
                if (i4 == 1) {
                    if (i5 == 8) {
                        e5Var = e5.e;
                    } else if (i5 == 39) {
                        e5Var = e5.g;
                    } else if (i5 == 7) {
                        e5Var = e5.h;
                    } else if (i5 == 36) {
                        e5Var = e5.i;
                    } else if (i5 == 16) {
                        e5Var = e5.f;
                    } else if (i5 != 1) {
                        e5Var = e5.j;
                        String str = String.format(JniAdExt.n1("ad.account.er.generic"), JniAdExt.M2(i4, i5));
                        e5Var.getClass();
                        e5Var.c = str;
                    }
                } else if (i4 != 0) {
                    e5Var = e5.j;
                    String str2 = String.format(JniAdExt.n1("ad.account.er.generic"), JniAdExt.M2(i4, i5));
                    e5Var.getClass();
                    e5Var.c = str2;
                } else if (i5 == 2 || i5 == 4) {
                    e5Var = e5.f;
                } else if (i5 != 1) {
                    e5Var = e5.j;
                    String str3 = String.format(JniAdExt.n1("ad.account.er.generic"), JniAdExt.M2(i4, i5));
                    e5Var.getClass();
                    e5Var.c = str3;
                }
                h5 h5Var = MainApplication.v().w;
                if (h5Var != null) {
                    if (e5Var != null) {
                        h5Var.a(e5Var);
                    }
                    if (JniAdExt.D1().mStatus == g9.as_verification_pending) {
                        h5Var.g();
                    } else {
                        h5Var.W(false);
                    }
                }
                AccountRegistrationFragment accountRegistrationFragment = JniAdExt.a0;
                if (accountRegistrationFragment != null) {
                    t70.Y(new w4(accountRegistrationFragment, i2));
                    return;
                }
                return;
        }
    }
}
