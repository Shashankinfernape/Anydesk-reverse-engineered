package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        nh1 nh1Var = new nh1();
        nh1Var.f = this;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            nh1Var.h(constantState.newDrawable(resources));
        }
        nh1.a();
        return nh1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }
}
