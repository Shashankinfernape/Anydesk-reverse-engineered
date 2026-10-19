package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoginFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends yt implements ng0 {
    public CardView A0;
    public TextView B0;
    public AdEditText C0;
    public View D0;
    public View E0;
    public Button F0;
    public AccountLoginFragment r0;
    public String s0;
    public boolean t0;
    public h5 u0;
    public int v0;
    public ListenerScrollView w0;
    public View x0;
    public CircularProgressIndicator y0;
    public LinearLayout z0;
    public final Logging q0 = new Logging("AccountSsoOrganizationDialogFragment");
    public final y6 G0 = new y6(this, new f(6, this));
    public final af1 H0 = new af1(12, this);
    public final q4 I0 = new q4(this, 2);

    public static void S0(c5 c5Var) {
        String text;
        h5 h5Var = c5Var.u0;
        AdEditText adEditText = c5Var.C0;
        if (h5Var == null || adEditText == null || (text = adEditText.getText()) == null) {
            return;
        }
        h5Var.Z(null);
        c5Var.t0 = true;
        c5Var.V0();
        h5Var.X(false);
        h5Var.Y(true);
        JniAdExt.I0.post(new ua0(text.trim(), 14));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.Z = this;
        U0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.Z = null;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.account.sso.title_generic");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.v0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_account_sso_organization, (ViewGroup) null);
        if (viewInflate != null) {
            this.w0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_account_sso_orga_scroll_view);
            this.x0 = viewInflate.findViewById(R.id.dialog_account_sso_orga_layout_container);
            this.y0 = (CircularProgressIndicator) viewInflate.findViewById(R.id.dialog_account_sso_orga_progressindicator);
            this.z0 = (LinearLayout) viewInflate.findViewById(R.id.dialog_account_sso_orga_layout);
            this.A0 = (CardView) viewInflate.findViewById(R.id.dialog_account_sso_orga_error_card);
            this.B0 = (TextView) viewInflate.findViewById(R.id.dialog_account_sso_orga_error_text);
            this.D0 = viewInflate.findViewById(R.id.dialog_account_sso_orga_scroll_hint_top);
            this.E0 = viewInflate.findViewById(R.id.dialog_account_sso_orga_scroll_hint_bottom);
            AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.dialog_account_sso_orga_error_input);
            this.C0 = adEditText;
            adEditText.setHint(JniAdExt.n1("ad.account.sso.organization"));
            this.C0.l(this.s0, true);
            this.C0.setFilter("[;,\r\n]");
            this.C0.setTextListener(this.H0);
            this.G0.g();
            this.w0.setListener(this);
            this.x0.addOnLayoutChangeListener(this.I0);
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.account.login.next"), null);
        int i = 2;
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new a(this, i));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, i));
        return w7VarA;
    }

    public final void T0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.D0, scrollY < this.v0 ? 4 : 0);
        r3.I(this.E0, bottom < this.v0 ? 4 : 0);
    }

    public final void U0() {
        boolean z;
        h5 h5Var = this.u0;
        if (h5Var != null && h5Var.D()) {
            synchronized (h5Var) {
                z = h5Var.l;
            }
            if (z) {
                h5Var.Y(false);
                h5Var.X(false);
                if (TextUtils.isEmpty(h5Var.v())) {
                    AccountLoginFragment accountLoginFragment = this.r0;
                    int iR = q51.r(h5Var.u());
                    if (iR == 6) {
                        Dialog dialog = this.k0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        if (accountLoginFragment != null) {
                            accountLoginFragment.U0(true);
                            return;
                        }
                        return;
                    }
                    if (iR == 7) {
                        Dialog dialog2 = this.k0;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        if (accountLoginFragment != null) {
                            accountLoginFragment.U0(false);
                            h5 h5Var2 = accountLoginFragment.c0;
                            if (h5Var2 != null) {
                                h5Var2.N(true);
                                accountLoginFragment.Z0(true);
                                h5Var2.h();
                                h5Var2.K(false);
                                String strO = h5Var2.o();
                                String strN = h5Var2.n();
                                t01 t01Var = t01.e;
                                JniAdExt.I0.post(new tc0(t01Var, t01Var, false, strO == null ? "" : strO, strN != null ? strN.toLowerCase() : ""));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    h5Var.Z(h5.i(1, 18));
                }
                this.t0 = false;
            }
        }
        V0();
    }

    public final void V0() {
        h5 h5Var = this.u0;
        boolean z = false;
        if (h5Var != null) {
            String strV = h5Var.v();
            boolean zIsEmpty = TextUtils.isEmpty(strV);
            TextView textView = this.B0;
            if (zIsEmpty) {
                strV = "";
            }
            r3.F(textView, strV);
            r3.I(this.A0, zIsEmpty ? 8 : 0);
        }
        r3.C(this.C0, !this.t0);
        r3.I(this.y0, this.t0 ? 0 : 8);
        r3.A(this.z0, this.t0 ? 0.5f : 1.0f);
        AdEditText adEditText = this.C0;
        if (adEditText != null) {
            String text = adEditText.getText();
            Button button = this.F0;
            if (!this.t0 && text != null && !text.trim().isEmpty()) {
                z = true;
            }
            r3.C(button, z);
        }
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        h5 h5Var = this.u0;
        if (h5Var != null) {
            h5Var.Y(false);
            h5Var.Z(null);
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.r0 = (AccountLoginFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_orga_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
        this.t0 = bundle.getBoolean("skey_is_in_wait_state");
        h5 h5Var = MainApplication.v().w;
        this.u0 = h5Var;
        if (h5Var == null) {
            this.q0.c("no view model");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.w0.setListener(null);
        this.x0.removeOnLayoutChangeListener(this.I0);
        AdEditText adEditText = this.C0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.u0 = null;
        this.r0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.C0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_orga_name", text);
        bundle.putBoolean("skey_is_in_wait_state", this.t0);
    }
}
