package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zr extends hk0 {
    public static final /* synthetic */ int A = 0;
    public xr z;

    @Override // defpackage.hk0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.z = new xr(this.z);
        return this;
    }

    public final void s(float f, float f2, float f3, float f4) {
        RectF rectF = this.z.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
