package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class h9 {
    public static final h9 a = new h9();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}
