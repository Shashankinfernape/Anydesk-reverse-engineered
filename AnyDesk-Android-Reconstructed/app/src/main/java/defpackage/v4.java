package defpackage;

import android.view.View;
import android.widget.CheckBox;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class v4 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountRegistrationFragment d;

    public /* synthetic */ v4(AccountRegistrationFragment accountRegistrationFragment, int i) {
        this.c = i;
        this.d = accountRegistrationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AdCountryCode adCountryCodeJ;
        String strB1;
        String strB2;
        g5 g5VarX;
        switch (this.c) {
            case 0:
                f5 f5Var = f5.s;
                AccountRegistrationFragment accountRegistrationFragment = this.d;
                h5 h5Var = accountRegistrationFragment.d0;
                if (h5Var != null) {
                    h5Var.E(f5Var);
                }
                accountRegistrationFragment.U0(f5Var);
                return;
            case 1:
                AccountRegistrationFragment.R0(this.d);
                return;
            default:
                AccountRegistrationFragment accountRegistrationFragment2 = this.d;
                h5 h5Var2 = accountRegistrationFragment2.d0;
                if (h5Var2 == null) {
                    return;
                }
                synchronized (h5Var2) {
                    h5Var2.o.clear();
                }
                f9 f9VarQ = h5Var2.q();
                String strB3 = AccountRegistrationFragment.b1(accountRegistrationFragment2.A0);
                String strB4 = AccountRegistrationFragment.b1(accountRegistrationFragment2.D0);
                t01 t01VarA1 = AccountRegistrationFragment.a1(accountRegistrationFragment2.G0, true);
                t01 t01VarA2 = AccountRegistrationFragment.a1(accountRegistrationFragment2.J0, false);
                t01 t01VarA3 = AccountRegistrationFragment.a1(accountRegistrationFragment2.L0, false);
                CheckBox checkBox = accountRegistrationFragment2.Q0;
                boolean z = checkBox != null && checkBox.isChecked();
                boolean z2 = (f9VarQ.c & 60) != 0;
                if (z2) {
                    strB1 = AccountRegistrationFragment.b1(accountRegistrationFragment2.o0);
                    adCountryCodeJ = h5Var2.j();
                    strB2 = AccountRegistrationFragment.b1(accountRegistrationFragment2.t0);
                    g5VarX = h5Var2.x();
                } else {
                    adCountryCodeJ = null;
                    strB1 = null;
                    strB2 = null;
                    g5VarX = null;
                }
                String str = strB1;
                String str2 = strB2;
                g5 g5Var = g5VarX;
                if (accountRegistrationFragment2.W0(f9VarQ, strB1, adCountryCodeJ, strB2, g5VarX, strB3, strB4, t01VarA1, t01VarA2, t01VarA3, z)) {
                    accountRegistrationFragment2.T0();
                    h5Var2.W(true);
                    accountRegistrationFragment2.c1();
                    h5Var2.I(t01.a(t01VarA1));
                    CheckBox checkBox2 = accountRegistrationFragment2.N0;
                    boolean z3 = checkBox2 != null && checkBox2.isChecked();
                    if (z2) {
                        String strB5 = AccountRegistrationFragment.b1(accountRegistrationFragment2.y0);
                        String str3 = adCountryCodeJ.mCode;
                        if (strB5 == null) {
                            strB5 = "";
                        }
                        JniAdExt.I0.post(new vc0(t01VarA1, t01VarA2, strB3, strB4, z3, f9VarQ, str3, str, str2, strB5, g5Var.c));
                    } else {
                        JniAdExt.I0.post(new uc0(t01VarA1, t01VarA2, strB3, strB4, z3, f9VarQ));
                    }
                } else {
                    t01VarA1.b();
                    t01VarA2.b();
                    accountRegistrationFragment2.V0();
                    accountRegistrationFragment2.T0();
                    accountRegistrationFragment2.g1();
                }
                t01VarA3.b();
                return;
        }
    }
}
