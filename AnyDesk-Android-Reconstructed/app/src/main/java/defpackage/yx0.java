package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class yx0 extends yt implements ng0 {
    public int A0;
    public final xt0 B0;
    public final q4 C0;
    public ListenerScrollView q0;
    public View r0;
    public View s0;
    public View t0;
    public AdEditTextSecure u0;
    public AdEditTextSecure v0;
    public int w0;
    public String x0;
    public t01 y0;
    public t01 z0;

    public yx0() {
        t01 t01Var = t01.e;
        this.y0 = t01Var;
        this.z0 = t01Var;
        this.B0 = new xt0(5, this);
        this.C0 = new q4(this, 12);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        AdEditTextSecure adEditTextSecure = this.u0;
        if (adEditTextSecure != null) {
            adEditTextSecure.l(this.y0, false);
        }
        AdEditTextSecure adEditTextSecure2 = this.v0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.l(this.z0, false);
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.dlg.restart.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.c = R.drawable.ic_dialog_restart;
        this.A0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_remote_restart_with_credentials, (ViewGroup) null);
        if (viewInflate != null) {
            this.q0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_scroll_view);
            this.r0 = viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_layout);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_msg);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_hint);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_user_title);
            this.u0 = (AdEditTextSecure) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_user);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_passwd_title);
            this.v0 = (AdEditTextSecure) viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_passwd);
            this.s0 = viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_scroll_hint_top);
            this.t0 = viewInflate.findViewById(R.id.dialog_remote_restart_with_credentials_scroll_hint_bottom);
            textView.setText(String.format(JniAdExt.n1("ad.dlg.restart.warning_text"), this.x0));
            textView2.setText(t70.F("<u>" + JniAdExt.n1("ad.dlg.elevation.request.auth_now") + "</u>"));
            textView3.setText(JniAdExt.n1("ad.dlg.elevation.request.name"));
            textView4.setText(JniAdExt.n1("ad.dlg.elevation.request.password"));
            this.u0.setFilter("[\r\n\t]");
            this.v0.setFilter("[\r\n\t]");
            this.v0.setTextListener(this.B0);
            this.q0.setListener(this);
            this.r0.addOnLayoutChangeListener(this.C0);
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new xx0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new xx0(this, 1));
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
        r3.I(this.s0, scrollY < this.A0 ? 4 : 0);
        r3.I(this.t0, bottom < this.A0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        Bundle bundleH0 = bundle != null ? bundle : H0();
        this.w0 = bundleH0.getInt("skey_session_idx");
        this.x0 = bundleH0.getString("skey_remote_addr");
        this.y0.b();
        t01 t01Var = (t01) t70.A(bundleH0, "skey_username", t01.class);
        this.y0 = t01Var;
        if (t01Var == null) {
            this.y0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_username");
        }
        this.z0.b();
        t01 t01Var2 = (t01) t70.A(bundleH0, "skey_password", t01.class);
        this.z0 = t01Var2;
        if (t01Var2 == null) {
            this.z0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_password");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.y0.b();
        this.z0.b();
        AdEditTextSecure adEditTextSecure = this.u0;
        if (adEditTextSecure != null) {
            adEditTextSecure.b();
            this.u0 = null;
        }
        AdEditTextSecure adEditTextSecure2 = this.v0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.b();
            this.v0 = null;
        }
        ListenerScrollView listenerScrollView = this.q0;
        if (listenerScrollView != null) {
            listenerScrollView.setListener(null);
            this.q0 = null;
        }
        View view = this.r0;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.C0);
            this.r0 = null;
        }
        this.s0 = null;
        this.t0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_session_idx", this.w0);
        bundle.putString("skey_remote_addr", this.x0);
        AdEditTextSecure adEditTextSecure = this.u0;
        bundle.putSerializable("skey_username", adEditTextSecure == null ? t01.e : adEditTextSecure.getText());
        AdEditTextSecure adEditTextSecure2 = this.v0;
        bundle.putSerializable("skey_password", adEditTextSecure2 == null ? t01.e : adEditTextSecure2.getText());
    }
}
