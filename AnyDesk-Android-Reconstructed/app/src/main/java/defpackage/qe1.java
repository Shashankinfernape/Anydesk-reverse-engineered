package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qe1 {
    public static final gw0 x = new gw0(1);
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final xb s;
    public View t;
    public boolean u;
    public final DrawerLayout v;
    public int c = -1;
    public final bc0 w = new bc0(23, this);

    public qe1(Context context, DrawerLayout drawerLayout, xb xbVar) {
        this.v = drawerLayout;
        this.s = xbVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, x);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        DrawerLayout drawerLayout = this.v;
        if (parent != drawerLayout) {
            cb1.e(drawerLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return;
        }
        this.t = view;
        this.c = i;
        ((iv) view.getLayoutParams()).c = false;
        xb xbVar = this.s;
        DrawerLayout drawerLayout2 = (DrawerLayout) xbVar.f;
        View viewF = drawerLayout2.f(xbVar.c == 3 ? 5 : 3);
        if (viewF != null) {
            drawerLayout2.c(viewF, true);
        }
        q(1);
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.i[i];
        if ((i3 & i2) == i2) {
            return false;
        }
        int i4 = this.b;
        float f3 = i4;
        return (fAbs > f3 || fAbs2 > f3) && (i3 & i2) == 0 && fAbs > ((float) i4);
    }

    public final boolean d(View view, float f) {
        if (view != null) {
            if ((DrawerLayout.m(view) ? view.getWidth() : 0) > 0 && Math.abs(f) > this.b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                oe1.i(this.t, left);
            }
            if (top != 0) {
                oe1.j(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.f(this.t, currX);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }

    public final void h(float f) {
        int i;
        this.u = true;
        View view = this.t;
        xb xbVar = this.s;
        DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
        int[] iArr = DrawerLayout.E;
        float f2 = ((iv) view.getLayoutParams()).b;
        int width = view.getWidth();
        if (drawerLayout.b(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f2 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f2 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        qe1 qe1Var = (qe1) xbVar.d;
        int top = view.getTop();
        if (!qe1Var.u) {
            nh0.j("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            return;
        }
        qe1Var.j(i, top, (int) qe1Var.l.getXVelocity(qe1Var.c), (int) qe1Var.l.getYVelocity(qe1Var.c));
        drawerLayout.invalidate();
        this.u = false;
        if (this.a == 1) {
            q(0);
        }
    }

    public final View i(int i, int i2) {
        DrawerLayout drawerLayout = this.v;
        for (int childCount = drawerLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = drawerLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.r;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.t;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        overScroller.startScroll(left, top, i5, i6, (int) ((f(i6, i4, 0) * (f3 / f4)) + (f(i5, i3, DrawerLayout.m(view) ? view.getWidth() : 0) * f5)));
        q(2);
        return true;
    }

    public final boolean k(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void l(MotionEvent motionEvent) {
        int i;
        xb xbVar = this.s;
        c cVar = (c) xbVar.e;
        DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewI = i((int) x2, (int) y);
            o(x2, y, pointerId);
            t(viewI, pointerId);
            if ((this.h[pointerId] & this.q) != 0) {
                drawerLayout.postDelayed(cVar, 160L);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                m();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (k(pointerId2)) {
                        float x3 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x3 - this.d[pointerId2];
                        n(f, y2 - this.e[pointerId2], pointerId2);
                        if (this.a != 1) {
                            View viewI2 = i((int) x3, (int) y2);
                            if (d(viewI2, f) && t(viewI2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                p(motionEvent);
                return;
            }
            if (k(this.c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i3 = this.c;
                int i4 = (int) (x4 - fArr[i3]);
                int i5 = (int) (y3 - this.g[i3]);
                int left = this.t.getLeft() + i4;
                this.t.getTop();
                int left2 = this.t.getLeft();
                int top = this.t.getTop();
                if (i4 != 0) {
                    left = xbVar.b(this.t, left);
                    oe1.i(this.t, left - left2);
                }
                if (i5 != 0) {
                    oe1.j(this.t, this.t.getTop() - top);
                }
                if (i4 != 0 || i5 != 0) {
                    xbVar.f(this.t, left);
                }
                p(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                h(0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            o(x5, y4, pointerId3);
            if (this.a == 0) {
                t(i((int) x5, (int) y4), pointerId3);
                if ((this.h[pointerId3] & this.q) != 0) {
                    drawerLayout.postDelayed(cVar, 160L);
                    return;
                }
                return;
            }
            int i6 = (int) x5;
            int i7 = (int) y4;
            View view = this.t;
            if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                t(this.t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.a == 1 && pointerId4 == this.c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.c) {
                    View viewI3 = i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view2 = this.t;
                    if (viewI3 == view2 && t(view2, pointerId5)) {
                        i = this.c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m();
            }
        }
        e(pointerId4);
    }

    public final void m() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            f = 0.0f;
        } else if (fAbs <= f) {
            f = xVelocity;
        } else if (xVelocity <= 0.0f) {
            f = -f;
        }
        Math.abs(this.l.getYVelocity(this.c));
        h(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void n(float f, float f2, int i) {
        int i2;
        boolean zC = c(f, f2, i, 1);
        ?? r1 = zC;
        if (c(f2, f, i, 4)) {
            r1 = (zC ? 1 : 0) | 4;
        }
        ?? r2 = r1;
        if (c(f, f2, i, 2)) {
            r2 = (r1 == true ? 1 : 0) | 2;
        }
        ?? r3 = r2;
        if (c(f2, f, i, 8)) {
            i2 = (r2 == true ? 1 : 0) | 8;
        }
        if (r3 == 0) {
            r3 = i2;
            return;
        }
        int[] iArr = this.i;
        iArr[i] = (iArr[i] | r3) == true ? 1 : 0;
        int i3 = r3 & 1;
        xb xbVar = this.s;
        DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
        View viewF = i3 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
        if (viewF == null) {
            r3 = i2;
            r3 = i2;
            return;
        }
        r3 = i2;
        if (drawerLayout.h(viewF) != 0) {
            r3 = i2;
            return;
        } else {
            r3 = i2;
            ((qe1) xbVar.d).b(viewF, i);
        }
    }

    public final void o(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        DrawerLayout drawerLayout = this.v;
        int i5 = i3 < drawerLayout.getLeft() + this.o ? 1 : 0;
        if (i4 < drawerLayout.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > drawerLayout.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > drawerLayout.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (k(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public final void q(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            xb xbVar = this.s;
            ((DrawerLayout) xbVar.f).t(((qe1) xbVar.d).t, i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean r(MotionEvent motionEvent) {
        View viewI;
        xb xbVar = this.s;
        c cVar = (c) xbVar.e;
        DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            o(x2, y, pointerId);
            View viewI2 = i((int) x2, (int) y);
            if (viewI2 == this.t && this.a == 2) {
                t(viewI2, pointerId);
            }
            if ((this.h[pointerId] & this.q) != 0) {
                drawerLayout.postDelayed(cVar, 160L);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                o(x3, y2, pointerId2);
                int i = this.a;
                if (i == 0) {
                    if ((this.h[pointerId2] & this.q) != 0) {
                        drawerLayout.postDelayed(cVar, 160L);
                    }
                } else if (i == 2 && (viewI = i((int) x3, (int) y2)) == this.t) {
                    t(viewI, pointerId2);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.d != null && this.e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId3 = motionEvent.getPointerId(i2);
                if (k(pointerId3)) {
                    float x4 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x4 - this.d[pointerId3];
                    float f2 = y3 - this.e[pointerId3];
                    View viewI3 = i((int) x4, (int) y3);
                    boolean z = viewI3 != null && d(viewI3, f);
                    if (!z) {
                        n(f, f2, pointerId3);
                        if (this.a != 1) {
                            break;
                        }
                    } else {
                        int left = viewI3.getLeft();
                        int iB = xbVar.b(viewI3, ((int) f) + left);
                        viewI3.getTop();
                        viewI3.getTop();
                        int width = DrawerLayout.m(viewI3) ? viewI3.getWidth() : 0;
                        if (width == 0 || (width > 0 && iB == left)) {
                            break;
                        }
                        n(f, f2, pointerId3);
                        if (this.a != 1 || (z && t(viewI3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            p(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean s(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean zJ = j(i, i2, 0, 0);
        if (!zJ && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return zJ;
    }

    public final boolean t(View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        xb xbVar = this.s;
        DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
        if (!DrawerLayout.m(view) || !drawerLayout.b(view, xbVar.c) || drawerLayout.h(view) != 0) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }
}
