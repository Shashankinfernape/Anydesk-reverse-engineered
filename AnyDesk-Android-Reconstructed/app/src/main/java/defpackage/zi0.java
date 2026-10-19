package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ aj0 a;

    public zi0(aj0 aj0Var) {
        this.a = aj0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MainFragment mainFragment = this.a.b;
        if (motionEvent != null && !mainFragment.D1.c) {
            float x = (motionEvent2.getX() - motionEvent.getX()) / er0.c();
            if (Math.abs(x) > Math.abs((motionEvent2.getY() - motionEvent.getY()) / er0.d())) {
                if (Math.abs(x) > 0.1d && Math.abs(f) / er0.c() > 1.0f) {
                    mainFragment.j1(x < 0.0f);
                }
                return true;
            }
        }
        return false;
    }
}
