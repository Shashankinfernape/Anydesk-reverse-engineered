package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class r8 implements Drawable.Callback {
    public final /* synthetic */ int c = 1;
    public Object d;

    public r8(u8 u8Var) {
        this.d = u8Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.c) {
            case 0:
                ((u8) this.d).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.c) {
            case 0:
                ((u8) this.d).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.d;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.c) {
            case 0:
                ((u8) this.d).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.d;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public /* synthetic */ r8() {
    }

    private final void a(Drawable drawable) {
    }
}
