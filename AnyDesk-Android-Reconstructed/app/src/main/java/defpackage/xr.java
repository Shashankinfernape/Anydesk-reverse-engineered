package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class xr extends gk0 {
    public final RectF q;

    public xr(xr xrVar) {
        super(xrVar);
        this.q = xrVar.q;
    }

    @Override // defpackage.gk0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        yr yrVar = new yr(this);
        yrVar.z = this;
        yrVar.invalidateSelf();
        return yrVar;
    }

    public xr(d41 d41Var, RectF rectF) {
        super(d41Var);
        this.q = rectF;
    }
}
