package defpackage;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class lt {
    public static final ThreadLocal a = new ThreadLocal();
    public static final ThreadLocal b = new ThreadLocal();

    public static void a(TextInputLayout textInputLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != textInputLayout) {
            View view2 = (View) parent;
            a(textInputLayout, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
