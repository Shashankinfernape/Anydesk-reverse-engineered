package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements Runnable {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ z6 g;

    public g4(AccountLoggedInFragment accountLoggedInFragment, int i, int i2, String str) {
        this.g = accountLoggedInFragment;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.e;
        int i3 = this.d;
        Object obj = this.f;
        z6 z6Var = this.g;
        switch (i) {
            case 0:
                AccountLoggedInFragment accountLoggedInFragment = (AccountLoggedInFragment) z6Var;
                if (i3 != 1 && i2 != 1) {
                    String strM2 = JniAdExt.M2(i3, i2);
                    t70.g0(accountLoggedInFragment.Y(), String.format(JniAdExt.n1("ad.account.er.generic"), strM2), 0);
                    accountLoggedInFragment.b0.a("Logout failed for " + ((String) obj) + ": " + strM2);
                }
                accountLoggedInFragment.T0();
                break;
            default:
                View view = (View) obj;
                ConnectionFragment.o1(view, i3, i2);
                m80 m80Var = ((ConnectionFragment) z6Var).a0;
                if (m80Var != null) {
                    ((MainActivity) m80Var).u0(i3, i2, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                break;
        }
    }

    public g4(ConnectionFragment connectionFragment, View view, int i, int i2) {
        this.g = connectionFragment;
        this.f = view;
        this.d = i;
        this.e = i2;
    }
}
