package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements View.OnTouchListener {
    public int e;
    public final jq0 g;
    public int c = 0;
    public boolean d = false;
    public final VelocityTracker f = VelocityTracker.obtain();

    public iq0(jq0 jq0Var) {
        this.g = jq0Var;
    }

    public final synchronized void a(MotionEvent motionEvent, int i, int i2) {
        try {
            int i3 = this.c + 1;
            this.c = i3;
            if (i3 == 1) {
                float x = motionEvent.getX() + i;
                float y = motionEvent.getY() + i2;
                this.f.clear();
                this.f.addMovement(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), x, y, motionEvent.getMetaState()));
                this.e = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g.c(x, y);
                this.d = true;
            } else {
                this.g.a(0.0f, 0.0f);
                this.d = false;
                this.c = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(MotionEvent motionEvent, int i, int i2) {
        if (this.d) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (motionEvent.getPointerId(i3) == this.e) {
                    float x = motionEvent.getX() + i;
                    float y = motionEvent.getY() + i2;
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), x, y, motionEvent.getMetaState());
                    this.f.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    this.g.b(x, y);
                }
            }
        }
    }

    public final synchronized void c(MotionEvent motionEvent) {
        try {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                this.c = 0;
            } else if (pointerId == this.e && this.d) {
                this.f.computeCurrentVelocity(1000);
                this.g.a(this.f.getXVelocity(pointerId), this.f.getYVelocity(pointerId));
                this.d = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    b(motionEvent, iArr[0], iArr[1]);
                    return true;
                }
                if (actionMasked == 3) {
                    synchronized (this) {
                        try {
                            if (this.d) {
                                kq0 kq0Var = this.g.e;
                                if (kq0Var.g) {
                                    kq0Var.f.a(kq0Var.j, kq0Var.k, kq0Var.h, kq0Var.i, 0.0f, 0.0f);
                                    kq0Var.g = false;
                                } else {
                                    ConnectionFragment connectionFragment = kq0Var.d;
                                    connectionFragment.v1(0);
                                    nu0 nu0Var = connectionFragment.F0;
                                    if (nu0Var != null) {
                                        t70.Y(new xo(nu0Var, 1));
                                    }
                                    connectionFragment.b1();
                                }
                            }
                            this.d = false;
                            this.c = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return true;
                    }
                }
            }
            c(motionEvent);
            return true;
        }
        a(motionEvent, iArr[0], iArr[1]);
        return true;
    }
}
