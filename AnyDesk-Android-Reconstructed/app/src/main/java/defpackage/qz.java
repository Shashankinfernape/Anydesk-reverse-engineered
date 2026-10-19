package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qz implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ qz(View view, int i) {
        this.c = i;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        View view = this.d;
        switch (i) {
            case 0:
                view.setPressed(false);
                break;
            default:
                Drawable background = view.getBackground();
                if (background instanceof StateListDrawable) {
                    Drawable current = background.getCurrent();
                    if (current instanceof AnimationDrawable) {
                        ((AnimationDrawable) current).start();
                    }
                }
                break;
        }
    }
}
