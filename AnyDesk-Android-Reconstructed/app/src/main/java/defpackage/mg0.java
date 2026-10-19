package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements View.OnTouchListener {
    public static final int t = ViewConfiguration.getTapTimeout();
    public final of c;
    public final AccelerateInterpolator d;
    public final uv e;
    public c f;
    public final float[] g;
    public final float[] h;
    public final int i;
    public final int j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final uv s;

    public mg0(uv uvVar) {
        of ofVar = new of();
        ofVar.e = Long.MIN_VALUE;
        ofVar.g = -1L;
        ofVar.f = 0L;
        this.c = ofVar;
        this.d = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.g = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.h = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.k = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.l = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = fArr5;
        this.e = uvVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.j = t;
        ofVar.a = 500;
        ofVar.b = 500;
        this.s = uvVar;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.g[i] * f2, 0.0f, this.h[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.d;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.k[i];
            float f5 = this.l[i];
            float f6 = this.m[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.k[i];
        float f9 = this.l[i];
        float f10 = this.m[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.i;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.q && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.o) {
            this.q = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        of ofVar = this.c;
        int i2 = (int) (jCurrentAnimationTimeMillis - ofVar.e);
        int i3 = ofVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        ofVar.i = i;
        ofVar.h = ofVar.a(jCurrentAnimationTimeMillis);
        ofVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        uv uvVar;
        int count;
        of ofVar = this.c;
        float f = ofVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(ofVar.c);
        if (iAbs != 0 && (count = (uvVar = this.s).getCount()) != 0) {
            int childCount = uvVar.getChildCount();
            int firstVisiblePosition = uvVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && uvVar.getChildAt(0).getTop() >= 0)) : !(i >= count && uvVar.getChildAt(childCount - 1).getBottom() <= uvVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.r
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.p = r2
            r7.n = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            uv r4 = r7.e
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            of r9 = r7.c
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.q
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            c r8 = r7.f
            if (r8 != 0) goto L62
            c r8 = new c
            r9 = 11
            r8.<init>(r9, r7)
            r7.f = r8
        L62:
            r7.q = r2
            r7.o = r2
            boolean r8 = r7.n
            if (r8 != 0) goto L77
            int r8 = r7.j
            if (r8 <= 0) goto L77
            c r9 = r7.f
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.oe1.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            c r8 = r7.f
            r8.run()
        L7c:
            r7.n = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
