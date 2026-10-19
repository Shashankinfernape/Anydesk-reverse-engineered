package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bl0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((cl0) obj).c();
                break;
            default:
                vu0 vu0Var = (vu0) ((gi) obj).e;
                if (vu0Var != null) {
                    vu0Var.onDismiss();
                }
                break;
        }
    }
}
