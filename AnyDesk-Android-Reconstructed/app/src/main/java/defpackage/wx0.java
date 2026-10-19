package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class wx0 extends yt implements ng0 {
    public int A0;
    public final q4 B0 = new q4(this, 11);
    public int q0;
    public String r0;
    public boolean s0;
    public View t0;
    public ListenerScrollView u0;
    public View v0;
    public RadioButton w0;
    public RadioButton x0;
    public View y0;
    public View z0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.A0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarY = Y();
        if (qaVarY == null) {
            return super.P0(bundle);
        }
        v7 v7Var = new v7(qaVarY);
        r7 r7Var = (r7) v7Var.d;
        View viewInflate = qaVarY.getLayoutInflater().inflate(R.layout.fragment_dialog_remote_restart, (ViewGroup) null);
        this.t0 = viewInflate;
        this.u0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_remote_restart_scroll_view);
        this.v0 = viewInflate.findViewById(R.id.dialog_remote_restart_layout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_msg);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_remote_restart_radio_title);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.dialog_remote_restart_radio_group);
        this.w0 = (RadioButton) viewInflate.findViewById(R.id.dialog_remote_restart_radio_button_normal);
        this.x0 = (RadioButton) viewInflate.findViewById(R.id.dialog_remote_restart_radio_button_safe);
        this.y0 = viewInflate.findViewById(R.id.dialog_remote_restart_scroll_hint_top);
        this.z0 = viewInflate.findViewById(R.id.dialog_remote_restart_scroll_hint_bottom);
        textView.setText(String.format(JniAdExt.n1("ad.dlg.restart.warning_text"), this.r0));
        if (this.s0) {
            textView2.setText(JniAdExt.n1("ad.dlg.restart.message_text"));
            this.w0.setText(JniAdExt.n1("ad.dlg.restart.normal"));
            this.x0.setText(JniAdExt.n1("ad.dlg.restart.safemode"));
        } else {
            textView2.setText(JniAdExt.n1("ad.dlg.restart.normal"));
            radioGroup.setVisibility(8);
        }
        this.u0.setListener(this);
        this.v0.addOnLayoutChangeListener(this.B0);
        this.w0.setChecked(true);
        r7Var.q = this.t0;
        r7Var.e = JniAdExt.n1("ad.dlg.restart.title");
        r7Var.c = R.drawable.ic_dialog_restart;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new vx0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new vx0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(true);
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
        r3.I(this.y0, scrollY < this.A0 ? 4 : 0);
        r3.I(this.z0, bottom < this.A0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getInt("skey_session_idx");
        this.r0 = bundle.getString("skey_remote_addr");
        this.s0 = bundle.getBoolean("skey_is_safemode_possible");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.u0.setListener(null);
        this.v0.removeOnLayoutChangeListener(this.B0);
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_session_idx", this.q0);
        bundle.putString("skey_remote_addr", this.r0);
        bundle.putBoolean("skey_is_safemode_possible", this.s0);
    }
}
