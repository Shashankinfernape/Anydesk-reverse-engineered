package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class qc1 extends yt implements ng0 {
    public int q0;
    public ListenerScrollView r0;
    public View s0;
    public View t0;
    public View u0;
    public boolean v0;
    public bc w0;
    public final q4 x0 = new q4(this, 16);

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        this.w0 = new bc(Z(), 19);
        this.q0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_unattended_access_dialog, (ViewGroup) null);
        this.r0 = (ListenerScrollView) viewInflate.findViewById(R.id.unattended_access_dialog_scroll_view);
        this.s0 = viewInflate.findViewById(R.id.unattended_access_dialog_content);
        this.t0 = viewInflate.findViewById(R.id.unattended_access_dialog_scroll_hint_top);
        this.u0 = viewInflate.findViewById(R.id.unattended_access_dialog_scroll_hint_bottom);
        TextView textView = (TextView) viewInflate.findViewById(R.id.unattended_access_dialog_message);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.unattended_access_dialog_help_center_link);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.unattended_access_info_dialog_disable_checkbox);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.unattended_access_info_dialog_disable_checkbox_description);
        r3.F(textView, JniAdExt.n1("ad.cfg.sec.access.info"));
        r3.F(textView2, t70.F("<u>" + JniAdExt.n1("ad.cfg.sec.access.info_link") + "</u>"));
        r3.F(textView3, JniAdExt.n1("ad.gen.dont_show_again"));
        int i = 1;
        boolean zP3 = JniAdExt.p3(io.KEY_UI_ENABLE_DIALOG_UNATTENDED_ACCESS_INFO) ^ true;
        r3.C(checkBox, zP3);
        r3.C(textView3, zP3);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.unattended_access_dialog_message_secondary);
        int i2 = 0;
        textView4.setVisibility(this.v0 ? 0 : 8);
        if (this.v0) {
            textView4.setText(JniAdExt.n1("ad.msg.permission_overlay.uaccess.android"));
        }
        r3.E(textView2, new b(29, this));
        this.r0.setListener(this);
        this.s0.addOnLayoutChangeListener(this.x0);
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.cfg.sec.access");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.q = viewInflate;
        v7Var.c(JniAdExt.n1("ad.cfg.close"), new pc1(this, i2));
        if (this.v0) {
            v7Var.d(JniAdExt.n1("ad.dlg.grant_permission"), new pc1(this, i));
        }
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

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.k0;
        if (dialog != null) {
            CheckBox checkBox = (CheckBox) dialog.findViewById(R.id.unattended_access_info_dialog_disable_checkbox);
            MainApplication mainApplicationV = MainApplication.v();
            boolean zIsChecked = checkBox.isChecked();
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_UNATTENDED_ACCESS_INFO, !zIsChecked ? 1 : 0);
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.v0 = bundle.getBoolean("skey_unattended_access_should_request_overlay_permission");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        bc bcVar = this.w0;
        if (bcVar != null) {
            bcVar.e = null;
            this.w0 = null;
        }
        this.r0.setListener(null);
        this.s0.removeOnLayoutChangeListener(this.x0);
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
    }
}
