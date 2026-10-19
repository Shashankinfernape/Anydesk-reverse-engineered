package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class ih0 extends yt implements ng0 {
    public boolean A0;
    public final gh0 B0 = new gh0(this, 0);
    public final gh0 C0 = new gh0(this, 1);
    public hh0 q0;
    public int r0;
    public long s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public View w0;
    public CountDownTimer x0;
    public ListenerScrollView y0;
    public Button z0;

    public static void S0(ih0 ih0Var) {
        Button button = ih0Var.z0;
        View view = ih0Var.w0;
        CheckBox checkBox = (CheckBox) (view != null ? view.findViewById(R.id.local_scam_warning_dialog_agree_checkbox) : null);
        boolean zIsChecked = checkBox != null ? checkBox.isChecked() : false;
        if (button != null) {
            if (zIsChecked && ih0Var.A0) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.accept.warn.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.c = R.drawable.ic_dialog_alert;
        this.v0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_local_scam_warning_dialog, (ViewGroup) null);
        this.w0 = viewInflate;
        int i = 1;
        if (viewInflate != null) {
            ListenerScrollView listenerScrollView = (ListenerScrollView) viewInflate.findViewById(R.id.local_scam_warning_dialog_scroll_view);
            this.y0 = listenerScrollView;
            if (listenerScrollView != null) {
                listenerScrollView.setListener(this);
            }
            r3.F((TextView) viewInflate.findViewById(R.id.local_scam_warning_dialog_message), t70.F(JniAdExt.n1("ad.accept.warn.scam.msg").replace("\n", "<br>")));
            TextView textView = (TextView) viewInflate.findViewById(R.id.local_scam_warning_dialog_link);
            if (textView != null) {
                textView.setText(t70.F("<u>" + JniAdExt.n1("ad.accept.warn.scam.link.text") + "</u>"));
                textView.setOnClickListener(new b(17, this));
            }
            r3.F((TextView) viewInflate.findViewById(R.id.local_scam_warning_dialog_agree_checkbox_description), JniAdExt.n1("ad.accept.warn.scam.agreement.msg"));
            CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.local_scam_warning_dialog_disable_checkbox);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.local_scam_warning_dialog_disable_checkbox_description);
            r3.F(textView2, JniAdExt.n1("ad.accept.warn.scam.disable.msg"));
            boolean z = !JniAdExt.p3(io.KEY_UI_ENABLE_DIALOG_LOCAL_SCAM_WARNING);
            r3.C(checkBox, z);
            r3.C(textView2, z);
            viewInflate.postDelayed(this.C0, 1000L);
        }
        View view = this.w0;
        CheckBox checkBox2 = (CheckBox) (view != null ? view.findViewById(R.id.local_scam_warning_dialog_agree_checkbox) : null);
        checkBox2.setChecked(this.t0);
        checkBox2.setOnCheckedChangeListener(new c3(7, this));
        View view2 = this.w0;
        CheckBox checkBox3 = (CheckBox) (view2 != null ? view2.findViewById(R.id.local_scam_warning_dialog_disable_checkbox) : null);
        checkBox3.setChecked(this.u0);
        View view3 = this.w0;
        int i2 = 0;
        (view3 != null ? view3.findViewById(R.id.local_scam_warning_dialog_agree_checkbox_description) : null).setOnClickListener(new ch0(checkBox2, 0));
        View view4 = this.w0;
        (view4 != null ? view4.findViewById(R.id.local_scam_warning_dialog_disable_checkbox_description) : null).setOnClickListener(new ch0(checkBox3, 1));
        r7Var.q = this.w0;
        v7Var.d(JniAdExt.n1("ad.accept.warn.scam.btn.accept"), new dh0(this, i2));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new dh0(this, i));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 8));
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
        View view = this.w0;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.local_scam_warning_dialog_scroll_hint_top);
            View viewFindViewById2 = view.findViewById(R.id.local_scam_warning_dialog_scroll_hint_bottom);
            if (viewFindViewById != null) {
                if (scrollY < this.v0) {
                    viewFindViewById.setVisibility(4);
                } else {
                    viewFindViewById.setVisibility(0);
                }
            }
            if (viewFindViewById2 != null) {
                if (bottom < this.v0) {
                    viewFindViewById2.setVisibility(4);
                } else {
                    viewFindViewById2.setVisibility(0);
                }
            }
        }
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.q0 != null) {
            JniAdExt.I0.post(new cp(this.r0, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        this.q0 = (hh0) context;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getInt("skey_scam_local_session_idx");
        this.s0 = bundle.getLong("skey_scam_local_timer_millis");
        this.t0 = bundle.getBoolean("skey_scam_local_agree");
        this.u0 = bundle.getBoolean("skey_scam_local_disable");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        CountDownTimer countDownTimer = this.x0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ListenerScrollView listenerScrollView = this.y0;
        this.y0 = null;
        if (listenerScrollView != null) {
            listenerScrollView.setListener(null);
        }
        this.w0.removeCallbacks(this.C0);
        this.w0.removeCallbacks(this.B0);
        this.w0 = null;
    }

    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void u0() {
        super.u0();
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_scam_local_session_idx", this.r0);
        bundle.putLong("skey_scam_local_timer_millis", this.s0);
        View view = this.w0;
        CheckBox checkBox = (CheckBox) (view != null ? view.findViewById(R.id.local_scam_warning_dialog_agree_checkbox) : null);
        bundle.putBoolean("skey_scam_local_agree", checkBox != null ? checkBox.isChecked() : false);
        View view2 = this.w0;
        CheckBox checkBox2 = (CheckBox) (view2 != null ? view2.findViewById(R.id.local_scam_warning_dialog_disable_checkbox) : null);
        bundle.putBoolean("skey_scam_local_disable", checkBox2 != null ? checkBox2.isChecked() : false);
    }
}
