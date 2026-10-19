package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends qf1 {
    @Override // defpackage.us0
    public final float o(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.of1, defpackage.us0
    public final void s(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.us0
    public final void t(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.qf1, defpackage.us0
    public final void u(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.us0
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.us0
    public final void w(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
