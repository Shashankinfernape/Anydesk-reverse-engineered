package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class l61 implements View.OnGenericMotionListener, View.OnTouchListener {
    public int c;
    public float d;
    public float e;
    public final double f;
    public final double g;
    public final VelocityTracker h = VelocityTracker.obtain();
    public MainFragment i;

    public l61(MainFragment mainFragment, double d, double d2) {
        this.i = mainFragment;
        this.f = d;
        this.g = d2;
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        VelocityTracker velocityTracker = this.h;
        if (actionMasked == 0) {
            this.c = pointerId;
            this.d = x;
            this.e = y;
            velocityTracker.clear();
            velocityTracker.addMovement(motionEvent);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2 && this.c == pointerId) {
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                return;
            }
            return;
        }
        if (this.c == pointerId) {
            double d = x - this.d;
            double d2 = this.f;
            double d3 = d / d2;
            if (Math.abs(d3) > Math.abs(((double) (y - this.e)) / this.g) && Math.abs(d3) > 0.1d && ((double) Math.abs(velocityTracker.getXVelocity())) / d2 > 1.0d) {
                this.i.j1(!(d3 > 0.0d));
            }
        }
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        a(motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a(motionEvent);
        return true;
    }
}
