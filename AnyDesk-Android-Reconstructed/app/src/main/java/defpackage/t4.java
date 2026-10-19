package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.jni.JniAdExt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountRegistrationFragment d;

    public /* synthetic */ t4(AccountRegistrationFragment accountRegistrationFragment, int i) {
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
                t70.U(accountRegistrationFragment.a0(), JniAdExt.o1("ad.inst.eula.href"));
                break;
            case 1:
                List list2 = AccountRegistrationFragment.h1;
                h5 h5Var = accountRegistrationFragment.d0;
                if (h5Var != null && h5Var.C()) {
                    accountRegistrationFragment.Z0();
                }
                break;
            case 2:
                List list3 = AccountRegistrationFragment.h1;
                if (!JniAdExt.q3() && !JniAdExt.Y1()) {
                    accountRegistrationFragment.Z0();
                    break;
                }
                break;
            default:
                List list4 = AccountRegistrationFragment.h1;
                t70.U(accountRegistrationFragment.a0(), JniAdExt.o1("ad.register.privacy_policy.href"));
                break;
        }
    }
}
