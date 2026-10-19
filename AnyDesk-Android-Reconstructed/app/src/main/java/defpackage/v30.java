package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class v30 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float c;
    public final int d;
    public final int e;
    public final View f;
    public u30 g;
    public u30 h;
    public boolean i;
    public int j;
    public final int[] k = new int[2];

    public v30(View view) {
        this.f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u30 u30Var = this.h;
        View view = this.f;
        if (u30Var != null) {
            view.removeCallbacks(u30Var);
        }
        u30 u30Var2 = this.g;
        if (u30Var2 != null) {
            view.removeCallbacks(u30Var2);
        }
    }

    public abstract b51 b();

    public abstract boolean c();

    public boolean d() {
        b51 b51VarB = b();
        if (b51VarB == null || !b51VarB.b()) {
            return true;
        }
        b51VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        uv uvVarI;
        boolean z2 = this.i;
        View view2 = this.f;
        if (z2) {
            b51 b51VarB = b();
            if (b51VarB != null && b51VarB.b() && (uvVarI = b51VarB.i()) != null && uvVarI.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.k;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                uvVarI.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = uvVarI.b(motionEventObtainNoHistory, this.j);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.j = motionEvent.getPointerId(0);
                    if (this.g == null) {
                        this.g = new u30(this, 0);
                    }
                    view2.postDelayed(this.g, this.d);
                    if (this.h == null) {
                        this.h = new u30(this, 1);
                    }
                    view2.postDelayed(this.h, this.e);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.j);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.c;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.i = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i = false;
        this.j = -1;
        u30 u30Var = this.g;
        if (u30Var != null) {
            this.f.removeCallbacks(u30Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
