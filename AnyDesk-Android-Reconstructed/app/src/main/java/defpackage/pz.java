package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pz extends rz {
    public final /* synthetic */ tz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(uz uzVar, tz tzVar) {
        super(uzVar);
        this.b = tzVar;
    }

    @Override // defpackage.rz, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.u.onTouchEvent(motionEvent);
    }

    @Override // defpackage.rz, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = this.b.u;
        if (view != null) {
            view.setPressed(true);
            view.postOnAnimationDelayed(new qz(view, 0), 100L);
        }
        view.performClick();
        return false;
    }
}
