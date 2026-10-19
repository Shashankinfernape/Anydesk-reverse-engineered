package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class pd1 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public pd1(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        qd1 qd1Var = new qd1();
        qd1Var.c = (VectorDrawable) this.a.newDrawable();
        return qd1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        qd1 qd1Var = new qd1();
        qd1Var.c = (VectorDrawable) this.a.newDrawable(resources);
        return qd1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        qd1 qd1Var = new qd1();
        qd1Var.c = (VectorDrawable) this.a.newDrawable(resources, theme);
        return qd1Var;
    }
}
