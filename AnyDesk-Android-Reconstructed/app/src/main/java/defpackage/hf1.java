package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public class hf1 extends p81 {
    public final View y;

    public hf1(View view, String str, String str2) {
        super(str, str2);
        if (view != null) {
            this.y = view;
        } else {
            id.q("Given null view to target");
            throw null;
        }
    }

    @Override // defpackage.p81
    public final void c(bc0 bc0Var) {
        v31 v31Var = new v31(this, 1, bc0Var);
        View view = this.y;
        if (view != null && view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            v31Var.run();
        } else {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new b9(viewTreeObserver, view, v31Var));
        }
    }
}
