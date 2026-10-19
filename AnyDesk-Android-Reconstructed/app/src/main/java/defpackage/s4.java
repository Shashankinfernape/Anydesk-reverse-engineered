package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class s4 extends yt implements hd0, ng0 {
    public int q0;
    public ListenerScrollView r0;
    public View s0;
    public View t0;
    public View u0;
    public final q4 v0 = new q4(this, 1);

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        Dialog dialog;
        super.A0();
        JniAdExt.z1(this);
        if ((JniAdExt.q3() || JniAdExt.Y1()) && (dialog = this.k0) != null) {
            dialog.dismiss();
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.X3(this);
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new l(1, this));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.account.register.register");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.q0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_account_registration_disallowed, (ViewGroup) null);
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_account_registration_disallowed_message);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_account_registration_disallowed_help_link);
            this.r0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_account_registration_disallowed_scroll_view);
            this.s0 = viewInflate.findViewById(R.id.dialog_account_registration_disallowed_layout);
            this.t0 = viewInflate.findViewById(R.id.dialog_account_registration_disallowed_scroll_hint_top);
            this.u0 = viewInflate.findViewById(R.id.dialog_account_registration_disallowed_scroll_hint_bottom);
            r3.F(textView, JniAdExt.n1("ad.account.register.not_possible_text"));
            r3.F(textView2, t70.F("<u>" + JniAdExt.n1("ad.connect.webhelp") + "</u>"));
            r3.E(textView2, new b(5, this));
            this.r0.setListener(this);
            this.s0.addOnLayoutChangeListener(this.v0);
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.account.register.login"), new k4(1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.t0, scrollY < this.q0 ? 4 : 0);
        r3.I(this.u0, bottom < this.q0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.r0.setListener(null);
        this.s0.removeOnLayoutChangeListener(this.v0);
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
    }
}
