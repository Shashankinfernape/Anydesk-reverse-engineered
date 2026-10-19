package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class kw extends yt implements ng0 {
    public RadioButton A0;
    public RadioButton B0;
    public View C0;
    public View D0;
    public int E0;
    public final ev F0;
    public final q4 G0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public t01 u0;
    public t01 v0;
    public ListenerScrollView w0;
    public View x0;
    public AdEditTextSecure y0;
    public AdEditTextSecure z0;

    public kw() {
        t01 t01Var = t01.e;
        this.u0 = t01Var;
        this.v0 = t01Var;
        this.F0 = new ev(1, this);
        this.G0 = new q4(this, 4);
    }

    public static void S0(kw kwVar) {
        AdEditTextSecure adEditTextSecure;
        RadioButton radioButton;
        RadioButton radioButton2;
        AdEditTextSecure adEditTextSecure2 = kwVar.y0;
        if (adEditTextSecure2 == null || (adEditTextSecure = kwVar.z0) == null || (radioButton = kwVar.A0) == null || (radioButton2 = kwVar.B0) == null) {
            return;
        }
        if (radioButton.isChecked()) {
            JniAdExt.I0.post(new tb0(26));
        } else if (radioButton2.isChecked()) {
            JniAdExt.I0.post(new rc0(adEditTextSecure2.getText(), adEditTextSecure.getText(), 1));
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.E0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.dlg.elevation.request.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.c = R.drawable.ic_dialog_elevate;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_elevate, (ViewGroup) null);
        this.w0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_elevate_scroll_view);
        this.x0 = viewInflate.findViewById(R.id.dialog_elevate_layout);
        this.y0 = (AdEditTextSecure) viewInflate.findViewById(R.id.dialog_elevate_user);
        this.z0 = (AdEditTextSecure) viewInflate.findViewById(R.id.dialog_elevate_passwd);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_elevate_user_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_elevate_passwd_title);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.dialog_elevate_radio_group);
        this.A0 = (RadioButton) viewInflate.findViewById(R.id.dialog_elevate_radio_button_ask);
        this.B0 = (RadioButton) viewInflate.findViewById(R.id.dialog_elevate_radio_button_now);
        this.C0 = viewInflate.findViewById(R.id.dialog_elevate_scroll_hint_top);
        this.D0 = viewInflate.findViewById(R.id.dialog_elevate_scroll_hint_bottom);
        this.w0.setListener(this);
        this.x0.addOnLayoutChangeListener(this.G0);
        this.z0.setTextListener(this.F0);
        this.A0.setChecked(this.s0);
        this.B0.setChecked(this.t0);
        if (this.q0 && this.r0) {
            radioGroup.setVisibility(0);
            this.A0.setText(JniAdExt.n1("ad.dlg.elevation.request.auth_ask"));
            this.B0.setText(JniAdExt.n1("ad.dlg.elevation.request.auth_now"));
        } else {
            radioGroup.setVisibility(8);
        }
        boolean z = this.r0;
        AdEditTextSecure adEditTextSecure = this.y0;
        if (z) {
            adEditTextSecure.l(this.u0, false);
            this.y0.setVisibility(this.t0 ? 0 : 8);
            this.z0.l(this.v0, false);
            this.z0.setVisibility(this.t0 ? 0 : 8);
            textView.setText(JniAdExt.n1("ad.dlg.elevation.request.name"));
            textView.setVisibility(this.t0 ? 0 : 8);
            textView2.setText(JniAdExt.n1("ad.dlg.elevation.request.password"));
            textView2.setVisibility(this.t0 ? 0 : 8);
        } else {
            adEditTextSecure.setVisibility(8);
            this.z0.setVisibility(8);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        this.A0.setOnClickListener(new iw(this, textView, textView2, 0));
        this.B0.setOnClickListener(new iw(this, textView, textView2, 1));
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new jw(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new jw(this, 1));
        w7 w7VarA = v7Var.a();
        R0(w7VarA);
        w7VarA.setCanceledOnTouchOutside(false);
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
        r3.I(this.C0, scrollY < this.E0 ? 4 : 0);
        r3.I(this.D0, bottom < this.E0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        t01 t01Var;
        t01 t01Var2;
        super.q0(bundle);
        Bundle bundleH0 = bundle != null ? bundle : H0();
        this.q0 = bundleH0.getBoolean("skey_elevate_show_direct");
        boolean z = bundleH0.getBoolean("skey_elevate_show_with_credentials");
        this.r0 = z;
        boolean z2 = this.q0;
        boolean z3 = false;
        boolean z4 = true;
        if ((!z2 || !z) && !z2) {
            if (!z) {
            }
            this.s0 = bundleH0.getBoolean("skey_elevate_radio_button_ask", z3);
            this.t0 = bundleH0.getBoolean("skey_elevate_radio_button_now", z4);
            this.u0.b();
            t01Var = (t01) t70.A(bundleH0, "skey_elevate_user", t01.class);
            this.u0 = t01Var;
            if (t01Var == null) {
                this.u0 = t01.e;
            }
            if (bundle != null) {
                bundle.remove("skey_elevate_user");
            }
            this.v0.b();
            t01Var2 = (t01) t70.A(bundleH0, "skey_elevate_passwd", t01.class);
            this.v0 = t01Var2;
            if (t01Var2 == null) {
                this.v0 = t01.e;
            }
            if (bundle != null) {
                bundle.remove("skey_elevate_passwd");
            }
        }
        z3 = true;
        z4 = false;
        this.s0 = bundleH0.getBoolean("skey_elevate_radio_button_ask", z3);
        this.t0 = bundleH0.getBoolean("skey_elevate_radio_button_now", z4);
        this.u0.b();
        t01Var = (t01) t70.A(bundleH0, "skey_elevate_user", t01.class);
        this.u0 = t01Var;
        if (t01Var == null) {
            this.u0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_elevate_user");
        }
        this.v0.b();
        t01Var2 = (t01) t70.A(bundleH0, "skey_elevate_passwd", t01.class);
        this.v0 = t01Var2;
        if (t01Var2 == null) {
            this.v0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_elevate_passwd");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.u0.b();
        this.v0.b();
        this.w0.setListener(null);
        this.x0.removeOnLayoutChangeListener(this.G0);
        this.y0.b();
        this.z0.b();
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_elevate_show_direct", this.q0);
        bundle.putBoolean("skey_elevate_show_with_credentials", this.r0);
        bundle.putBoolean("skey_elevate_radio_button_ask", this.A0.isChecked());
        bundle.putBoolean("skey_elevate_radio_button_now", this.B0.isChecked());
        bundle.putSerializable("skey_elevate_user", this.y0.getText());
        bundle.putSerializable("skey_elevate_passwd", this.z0.getText());
    }
}
