package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class lc implements PopupWindow.OnDismissListener {
    public final /* synthetic */ b3 c;
    public final /* synthetic */ mc d;

    public lc(mc mcVar, b3 b3Var) {
        this.d = mcVar;
        this.c = b3Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.d.J.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.c);
        }
    }
}
