package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja1 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Toolbar d;

    public /* synthetic */ ja1(Toolbar toolbar, int i) {
        this.c = i;
        this.d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Toolbar toolbar = this.d;
        switch (i) {
            case 0:
                ma1 ma1Var = toolbar.O;
                vk0 vk0Var = ma1Var == null ? null : ma1Var.d;
                if (vk0Var != null) {
                    vk0Var.collapseActionView();
                }
                break;
            default:
                toolbar.n();
                break;
        }
    }
}
