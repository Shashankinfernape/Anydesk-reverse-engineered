package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoginFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class j4 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountLoginFragment d;

    public /* synthetic */ j4(AccountLoginFragment accountLoginFragment, int i) {
        this.c = i;
        this.d = accountLoginFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                AccountLoginFragment accountLoginFragment = this.d;
                bc bcVar = accountLoginFragment.d0;
                if (bcVar == null) {
                    return;
                }
                r4 r4Var = new r4();
                Bundle bundle = new Bundle();
                bundle.putString("skey_email", "");
                bundle.putBoolean("skey_is_email_sent", false);
                r4Var.N0(bundle);
                bcVar.p0(r4Var, "AccountPasswordResetDialog", true);
                AdEditTextSecure adEditTextSecure = accountLoginFragment.j0;
                if (adEditTextSecure != null) {
                    adEditTextSecure.l(t01.e, false);
                    return;
                }
                return;
            case 1:
                AccountLoginFragment.R0(this.d);
                return;
            case 2:
                AccountLoginFragment accountLoginFragment2 = this.d;
                if (!JniAdExt.q3() && !JniAdExt.Y1()) {
                    bc bcVar2 = accountLoginFragment2.d0;
                    if (bcVar2 != null) {
                        bcVar2.p0(new s4(), "AccountRegistrationDisallowedDialog", true);
                        return;
                    }
                    return;
                }
                AdEditTextSecure adEditTextSecure2 = accountLoginFragment2.j0;
                if (adEditTextSecure2 != null) {
                    adEditTextSecure2.l(t01.e, false);
                }
                h5 h5Var = accountLoginFragment2.c0;
                CardView cardView = accountLoginFragment2.f0;
                if (h5Var != null && cardView != null && cardView.getVisibility() == 0) {
                    h5Var.J(null);
                }
                uj.v(accountLoginFragment2.Y(), R.id.accountRegistrationFragment);
                return;
            case 3:
                AccountLoginFragment accountLoginFragment3 = this.d;
                accountLoginFragment3.a1();
                bc bcVar3 = accountLoginFragment3.d0;
                if (bcVar3 != null) {
                    c5 c5Var = new c5();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("skey_orga_name", "");
                    bundle2.putBoolean("skey_is_in_wait_state", false);
                    c5Var.N0(bundle2);
                    bcVar3.p0(c5Var, "AccountSsoOrganizationDialog", true);
                    return;
                }
                return;
            default:
                AccountLoginFragment accountLoginFragment4 = this.d;
                h5 h5Var2 = accountLoginFragment4.c0;
                if (h5Var2 == null) {
                    return;
                }
                synchronized (h5Var2) {
                    h5Var2.f = false;
                }
                h5Var2.R("");
                h5Var2.L(t01.e);
                h5Var2.J(null);
                accountLoginFragment4.Y0(false);
                return;
        }
    }
}
