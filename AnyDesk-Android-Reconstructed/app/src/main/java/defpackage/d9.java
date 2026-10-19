package defpackage;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ e9 d;

    public /* synthetic */ d9(e9 e9Var, int i) {
        this.c = i;
        this.d = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        e9 e9Var = this.d;
        switch (i) {
            case 0:
                ProgressBar progressBar = e9Var.y0;
                if (progressBar != null) {
                    long j = e9Var.t0;
                    progressBar.setProgress((int) (((j - e9Var.s0) * 100.0d) / j));
                    break;
                }
                break;
            default:
                ProgressBar progressBar2 = e9Var.y0;
                if (progressBar2 != null) {
                    progressBar2.setProgress(100);
                    e9Var.u0 = true;
                    e9.S0(e9Var);
                    break;
                }
                break;
        }
    }
}
