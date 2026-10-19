package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class vh0 extends yt {
    public long q0;
    public CharSequence r0;
    public CountDownTimer s0;
    public Button t0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0, R.style.LockdownDialogStyle);
        r7 r7Var = (r7) v7Var.d;
        String strT2 = JniAdExt.t2(5);
        String strT3 = JniAdExt.t2(6);
        String strT4 = JniAdExt.t2(7);
        String strT5 = JniAdExt.t2(4);
        if (TextUtils.isEmpty(strT2) || TextUtils.isEmpty(strT3) || TextUtils.isEmpty(strT4)) {
            strT2 = JniAdExt.n1("ad.dlg.closed.lockdown.title.needs_review_by_legal.android");
            strT3 = JniAdExt.n1("ad.dlg.closed.lockdown.message.needs_review_by_legal.android");
            strT4 = JniAdExt.n1("ad.dlg.reactivate_license.needs_review_by_legal.android");
        }
        if (TextUtils.isEmpty(strT5)) {
            strT5 = JniAdExt.o1("ad.license_expired_error.href");
        }
        r7Var.e = strT2;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_lockdown, (ViewGroup) null);
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_lockdown_message);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_status_message_text);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.dialog_status_message_icon);
            r3.F(textView, strT3);
            r3.F(textView2, String.format(JniAdExt.n1("ad.dlg.closed.status_message"), strT2));
            r3.H(imageView, strT5);
            r3.E(imageView, new p(this, 8, strT5));
        }
        r7Var.q = viewInflate;
        v7Var.d(strT4, null);
        v7Var.c(JniAdExt.n1("ad.dlg.refresh"), null);
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 9));
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getLong("skey_lockdown_timer_millis");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        CountDownTimer countDownTimer = this.s0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.t0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putLong("skey_lockdown_timer_millis", this.q0);
    }
}
