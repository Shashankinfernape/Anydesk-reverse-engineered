package defpackage;

import android.widget.ScrollView;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w4 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountRegistrationFragment d;

    public /* synthetic */ w4(AccountRegistrationFragment accountRegistrationFragment, int i) {
        this.c = i;
        this.d = accountRegistrationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        AccountRegistrationFragment accountRegistrationFragment = this.d;
        switch (i) {
            case 0:
                List list = AccountRegistrationFragment.h1;
                if (!accountRegistrationFragment.X0()) {
                    if (accountRegistrationFragment.T0()) {
                        h5 h5Var = accountRegistrationFragment.d0;
                        if (h5Var == null) {
                            ScrollView scrollView = accountRegistrationFragment.f0;
                            if (scrollView != null) {
                                scrollView.smoothScrollTo(0, 0);
                            }
                        } else if (h5Var.y(e5.e)) {
                            AccountRegistrationFragment.e1(accountRegistrationFragment.G0);
                        } else if (h5Var.y(e5.g)) {
                            AccountRegistrationFragment.e1(accountRegistrationFragment.J0);
                        } else {
                            ScrollView scrollView2 = accountRegistrationFragment.f0;
                            if (scrollView2 != null) {
                                scrollView2.smoothScrollTo(0, 0);
                            }
                        }
                    }
                    accountRegistrationFragment.c1();
                    break;
                }
                break;
            case 1:
                m80 m80Var = accountRegistrationFragment.c0;
                if (m80Var != null) {
                    ((MainActivity) m80Var).p0();
                }
                AccountRegistrationFragment.d1(accountRegistrationFragment.r0);
                break;
            case 2:
                m80 m80Var2 = accountRegistrationFragment.c0;
                if (m80Var2 != null) {
                    ((MainActivity) m80Var2).p0();
                }
                AccountRegistrationFragment.d1(accountRegistrationFragment.w0);
                break;
            case 3:
                m80 m80Var3 = accountRegistrationFragment.c0;
                if (m80Var3 != null) {
                    ((MainActivity) m80Var3).p0();
                }
                t70.V(new c(8, accountRegistrationFragment.N0));
                break;
            case 4:
                AccountRegistrationFragment.e1(accountRegistrationFragment.A0);
                break;
            case 5:
                AccountRegistrationFragment.e1(accountRegistrationFragment.D0);
                break;
            case 6:
                AccountRegistrationFragment.e1(accountRegistrationFragment.G0);
                break;
            case 7:
                AccountRegistrationFragment.e1(accountRegistrationFragment.J0);
                break;
            default:
                AccountRegistrationFragment.e1(accountRegistrationFragment.L0);
                break;
        }
    }
}
