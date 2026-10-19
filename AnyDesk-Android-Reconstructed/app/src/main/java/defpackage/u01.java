package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class u01 implements View.OnGenericMotionListener, View.OnTouchListener {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public v01 g;

    public final void a(View view, MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(1048584) && !motionEvent.isFromSource(4098)) {
            this.c = 0;
            this.d = false;
            float x = motionEvent.getX();
            motionEvent.getY();
            int buttonState = motionEvent.getButtonState();
            int i = (~this.f) & buttonState;
            this.f = buttonState;
            if ((i & 1) != 0) {
                c(view, x);
                return;
            }
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.d) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            if (motionEvent.getPointerId(i2) == this.e) {
                                float x2 = motionEvent.getX(i2);
                                motionEvent.getY(i2);
                                c(view, x2);
                            }
                        }
                        return;
                    }
                    return;
                }
                if (actionMasked == 3) {
                    b(motionEvent);
                    return;
                } else if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            b(motionEvent);
            return;
        }
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 == 1) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            float x3 = motionEvent.getX(actionIndex);
            motionEvent.getY(actionIndex);
            this.e = pointerId;
            this.d = true;
            c(view, x3);
        }
    }

    public final void b(MotionEvent motionEvent) {
        int i = this.c - 1;
        this.c = i;
        if (i < 0) {
            this.c = 0;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (this.d && pointerId == this.e) {
            this.d = false;
        }
    }

    public final void c(View view, double d) {
        v01 v01Var;
        int width;
        if (view == null || (v01Var = this.g) == null || (width = view.getWidth()) <= 0) {
            return;
        }
        double d2 = d / ((double) width);
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        synchronized (v01Var) {
            try {
                Looper looper = t70.a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                boolean z = jUptimeMillis - v01Var.e > 100;
                v01Var.d = d2;
                if (z) {
                    ConnectionFragment connectionFragment = v01Var.a;
                    if (connectionFragment != null) {
                        connectionFragment.g1(d2);
                    }
                    v01Var.e = jUptimeMillis;
                } else {
                    vy0 vy0Var = v01Var.c;
                    if (vy0Var != null && !vy0Var.a()) {
                        vy0Var.b(100L);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View.OnGenericMotionListener
    public final synchronized boolean onGenericMotion(View view, MotionEvent motionEvent) {
        a(view, motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        a(view, motionEvent);
        return true;
    }
}
