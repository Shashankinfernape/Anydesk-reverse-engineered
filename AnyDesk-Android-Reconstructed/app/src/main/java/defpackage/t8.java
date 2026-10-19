package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public t8(mh mhVar) {
        this.b = mhVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                u8 u8Var = new u8(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                u8Var.c = drawableNewDrawable;
                drawableNewDrawable.setCallback(u8Var.h);
                return u8Var;
            default:
                return super.newDrawable(resources);
        }
    }

    public t8(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u8 u8Var = new u8(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) obj).newDrawable();
                u8Var.c = drawableNewDrawable;
                drawableNewDrawable.setCallback(u8Var.h);
                return u8Var;
            default:
                return (mh) obj;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                u8 u8Var = new u8(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                u8Var.c = drawableNewDrawable;
                drawableNewDrawable.setCallback(u8Var.h);
                return u8Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
