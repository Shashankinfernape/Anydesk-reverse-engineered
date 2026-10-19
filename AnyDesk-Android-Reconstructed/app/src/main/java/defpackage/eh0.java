package defpackage;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ CountDownTimer e;

    public /* synthetic */ eh0(CountDownTimer countDownTimer, long j, int i) {
        this.c = i;
        this.e = countDownTimer;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        CountDownTimer countDownTimer = this.e;
        long j = this.d;
        switch (i) {
            case 0:
                fh0 fh0Var = (fh0) countDownTimer;
                fh0Var.a.setText(((Object) fh0Var.b) + " (" + ((j + 999) / 1000) + ")");
                break;
            case 1:
                vh0 vh0Var = (vh0) ((c9) countDownTimer).b;
                vh0Var.q0 = j;
                r3.F(vh0Var.t0, ((Object) vh0Var.r0) + " (" + ((j + 999) / 1000) + ")");
                break;
            default:
                j01 j01Var = (j01) countDownTimer;
                j01Var.a.setText(((Object) j01Var.b) + " (" + ((j + 999) / 1000) + ")");
                break;
        }
    }
}
