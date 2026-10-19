package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends Animatable2.AnimationCallback {
    public final /* synthetic */ cg a;

    public l8(cg cgVar) {
        this.a = cgVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
