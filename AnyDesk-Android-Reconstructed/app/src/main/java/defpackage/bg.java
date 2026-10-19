package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class bg implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ dg d;

    public /* synthetic */ bg(dg dgVar, int i) {
        this.c = i;
        this.d = dgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        dg dgVar = this.d;
        switch (i) {
            case 0:
                if (dgVar.f > 0) {
                    SystemClock.uptimeMillis();
                }
                dgVar.setVisibility(0);
                break;
            default:
                ((cv) dgVar.getCurrentDrawable()).c(false, false, true);
                if (dgVar.getProgressDrawable() == null || !dgVar.getProgressDrawable().isVisible()) {
                    if (dgVar.getIndeterminateDrawable() == null || !dgVar.getIndeterminateDrawable().isVisible()) {
                        dgVar.setVisibility(4);
                    }
                }
                break;
        }
    }
}
