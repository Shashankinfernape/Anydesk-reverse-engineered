package defpackage;

import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class uh0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ n4 d;

    public /* synthetic */ uh0(n4 n4Var, int i) {
        this.c = i;
        this.d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        n4 n4Var = this.d;
        switch (i) {
            case 0:
                vh0 vh0Var = (vh0) n4Var.b;
                String strT2 = JniAdExt.t2(3);
                if (TextUtils.isEmpty(strT2)) {
                    String strO1 = JniAdExt.o1("ad.subscribe.button.href");
                    if (!TextUtils.isEmpty(strO1)) {
                        t70.U(vh0Var.a0(), strO1);
                    }
                } else if (!t70.R(vh0Var.G0(), strT2, false)) {
                    t70.Q(vh0Var.a0(), strT2, true);
                }
                break;
            default:
                vh0 vh0Var2 = (vh0) n4Var.b;
                vh0Var2.q0 = 10000L;
                r3.C(vh0Var2.t0, false);
                CountDownTimer countDownTimer = vh0Var2.s0;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                vh0Var2.s0 = new c9(vh0Var2, vh0Var2.q0, 1).start();
                JniAdExt.I0.post(new tb0(20));
                break;
        }
    }
}
