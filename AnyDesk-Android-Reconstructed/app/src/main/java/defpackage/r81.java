package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class r81 extends ViewOutlineProvider {
    public final /* synthetic */ t81 a;

    public r81(t81 t81Var) {
        this.a = t81Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        t81 t81Var = this.a;
        int[] iArr = t81Var.S;
        if (iArr == null) {
            return;
        }
        float f = iArr[0];
        float f2 = t81Var.Q;
        float f3 = iArr[1];
        outline.setOval((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
        outline.setAlpha(t81Var.T / 255.0f);
        if (Build.VERSION.SDK_INT >= 22) {
            outline.offset(0, t81Var.o);
        }
    }
}
