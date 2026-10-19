package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class l01 extends yt {
    public k01 q0;
    public int r0;
    public long s0;
    public View t0;
    public CountDownTimer u0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0, R.style.ScamWarningDialogTheme);
        String strN1 = JniAdExt.n1("ad.accept.warn.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_scam_warning_dialog, (ViewGroup) null);
        this.t0 = viewInflate;
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.scam_warning_dialog_message);
            if (textView != null) {
                textView.setText(JniAdExt.n1("ad.accept.warn.msg"));
            }
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.scam_warning_dialog_link);
            if (textView2 != null) {
                textView2.setText(t70.F("<u>" + JniAdExt.n1("ad.accept.warn.link") + "</u>"));
                textView2.setOnClickListener(new b(20, this));
            }
        }
        r7Var.q = this.t0;
        v7Var.d(JniAdExt.n1("ad.accept.warn.btn"), new k4(3));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new a(this, 9));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 11));
        return w7VarA;
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
        this.q0 = (k01) context;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getInt("skey_scam_session_idx");
        this.s0 = bundle.getLong("skey_scam_timer_millis");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        CountDownTimer countDownTimer = this.u0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void u0() {
        super.u0();
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_scam_session_idx", this.r0);
        bundle.putLong("skey_scam_timer_millis", this.s0);
    }
}
