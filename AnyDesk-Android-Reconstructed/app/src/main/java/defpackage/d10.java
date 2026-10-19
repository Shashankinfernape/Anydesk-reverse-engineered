package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d10 {
    public static void a(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }
}
