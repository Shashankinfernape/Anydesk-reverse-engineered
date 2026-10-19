package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class t81 extends View {
    public static final /* synthetic */ int q0 = 0;
    public StaticLayout A;
    public final CharSequence B;
    public StaticLayout C;
    public final boolean D;
    public boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public boolean I;
    public SpannableStringBuilder J;
    public DynamicLayout K;
    public TextPaint L;
    public Paint M;
    public final Rect N;
    public Rect O;
    public final Path P;
    public float Q;
    public int R;
    public int[] S;
    public int T;
    public float U;
    public int V;
    public float W;
    public int a0;
    public int b0;
    public boolean c;
    public final int c0;
    public boolean d;
    public float d0;
    public boolean e;
    public float e0;
    public final int f;
    public int f0;
    public final int g;
    public Bitmap g0;
    public final int h;
    public final xt0 h0;
    public final int i;
    public final r81 i0;
    public final int j;
    public final s81 j0;
    public final int k;
    public final ValueAnimator k0;
    public final int l;
    public final ValueAnimator l0;
    public final int m;
    public final ValueAnimator m0;
    public final int n;
    public final ValueAnimator n0;
    public final int o;
    public final ValueAnimator[] o0;
    public final int p;
    public final b9 p0;
    public ViewGroup q;
    public final p81 r;
    public final Rect s;
    public final TextPaint t;
    public final TextPaint u;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final Paint y;
    public final String z;

    public t81(qa qaVar, ViewGroup viewGroup, p81 p81Var, xt0 xt0Var) {
        super(qaVar);
        this.c = false;
        this.d = false;
        int i = 1;
        this.e = true;
        this.j0 = new s81(this, 0);
        bc bcVar = new bc(false);
        ValueAnimator valueAnimator = (ValueAnimator) bcVar.d;
        valueAnimator.setDuration(250L);
        valueAnimator.setStartDelay(250L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        int i2 = 3;
        valueAnimator.addUpdateListener(new nh(i2, new s81(this, 2)));
        bcVar.e = new s81(this, 1);
        ValueAnimator valueAnimatorC = bcVar.C();
        this.k0 = valueAnimatorC;
        bc bcVar2 = new bc(false);
        ValueAnimator valueAnimator2 = (ValueAnimator) bcVar2.d;
        valueAnimator2.setDuration(1000L);
        valueAnimator2.setRepeatCount(-1);
        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator2.addUpdateListener(new nh(i2, new s81(this, 3)));
        ValueAnimator valueAnimatorC2 = bcVar2.C();
        this.l0 = valueAnimatorC2;
        bc bcVar3 = new bc(true);
        ValueAnimator valueAnimator3 = (ValueAnimator) bcVar3.d;
        valueAnimator3.setDuration(250L);
        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator3.addUpdateListener(new nh(i2, new s81(this, 5)));
        bcVar3.e = new s81(this, 4);
        ValueAnimator valueAnimatorC3 = bcVar3.C();
        this.m0 = valueAnimatorC3;
        bc bcVar4 = new bc(false);
        ValueAnimator valueAnimator4 = (ValueAnimator) bcVar4.d;
        valueAnimator4.setDuration(250L);
        valueAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator4.addUpdateListener(new nh(i2, new s81(this, 7)));
        int i3 = 6;
        bcVar4.e = new s81(this, 6);
        ValueAnimator valueAnimatorC4 = bcVar4.C();
        this.n0 = valueAnimatorC4;
        this.o0 = new ValueAnimator[]{valueAnimatorC, valueAnimatorC2, valueAnimatorC4, valueAnimatorC3};
        this.r = p81Var;
        this.q = viewGroup;
        this.h0 = xt0Var;
        this.z = p81Var.a;
        this.B = p81Var.b;
        this.f = lk0.k(qaVar, 20);
        this.m = lk0.k(qaVar, 40);
        int iK = lk0.k(qaVar, p81Var.d);
        this.g = iK;
        this.i = lk0.k(qaVar, 20);
        this.j = lk0.k(qaVar, 8);
        this.k = lk0.k(qaVar, 750);
        this.l = lk0.k(qaVar, 20);
        this.n = lk0.k(qaVar, 88);
        int iK2 = lk0.k(qaVar, 8);
        this.o = iK2;
        int iK3 = lk0.k(qaVar, 1);
        this.p = iK3;
        this.h = (int) (iK * 0.1f);
        this.P = new Path();
        this.s = new Rect();
        this.N = new Rect();
        TextPaint textPaint = new TextPaint();
        this.t = textPaint;
        int i4 = p81Var.r;
        int i5 = p81Var.p;
        textPaint.setTextSize(i5 != -1 ? qaVar.getResources().getDimensionPixelSize(i5) : (int) TypedValue.applyDimension(2, i4, qaVar.getResources().getDisplayMetrics()));
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.u = textPaint2;
        int i6 = p81Var.s;
        int i7 = p81Var.q;
        textPaint2.setTextSize(i7 != -1 ? qaVar.getResources().getDimensionPixelSize(i7) : (int) TypedValue.applyDimension(2, i6, qaVar.getResources().getDisplayMetrics()));
        textPaint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        textPaint2.setAntiAlias(true);
        textPaint2.setAlpha(137);
        Paint paint = new Paint();
        this.v = paint;
        paint.setAntiAlias(true);
        paint.setAlpha((int) (p81Var.c * 255.0f));
        Paint paint2 = new Paint();
        this.w = paint2;
        paint2.setAntiAlias(true);
        paint2.setAlpha(50);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(iK3);
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.x = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.y = paint4;
        paint4.setAntiAlias(true);
        boolean z = p81Var.w;
        this.F = !z && p81Var.v;
        boolean z2 = p81Var.t;
        this.G = z2;
        this.H = p81Var.u;
        if (z2 && !z) {
            r81 r81Var = new r81(this);
            this.i0 = r81Var;
            setOutlineProvider(r81Var);
            setElevation(iK2);
        }
        setLayerType(2, null);
        Resources.Theme theme = qaVar.getTheme();
        this.D = lk0.K(qaVar, "isLightTheme") == 0;
        Integer numA = p81.a(qaVar, p81Var.l, p81Var.g);
        if (numA != null) {
            paint.setColor(numA.intValue());
        } else if (theme != null) {
            paint.setColor(lk0.K(qaVar, "colorPrimary"));
        } else {
            paint.setColor(-1);
        }
        Integer numA2 = p81.a(qaVar, null, p81Var.h);
        if (numA2 != null) {
            paint3.setColor(numA2.intValue());
        } else {
            paint3.setColor(this.D ? -16777216 : -1);
        }
        if (p81Var.w) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        paint4.setColor(paint3.getColor());
        Integer numA3 = p81.a(qaVar, p81Var.m, p81Var.i);
        if (numA3 != null) {
            int iIntValue = numA3.intValue();
            this.c0 = (iIntValue & 16777215) | (((int) ((iIntValue >>> 24) * 0.3f)) << 24);
        } else {
            this.c0 = -1;
        }
        Integer numA4 = p81.a(qaVar, p81Var.n, p81Var.j);
        if (numA4 != null) {
            textPaint.setColor(numA4.intValue());
        } else {
            textPaint.setColor(this.D ? -16777216 : -1);
        }
        Integer numA5 = p81.a(qaVar, p81Var.o, p81Var.k);
        if (numA5 != null) {
            textPaint2.setColor(numA5.intValue());
        } else {
            textPaint2.setColor(textPaint.getColor());
        }
        int i8 = qaVar.getWindow().getAttributes().flags;
        this.p0 = new b9(this, p81Var, viewGroup, i);
        setFocusableInTouchMode(true);
        setClickable(true);
        setOnKeyListener(new q81(this));
        setOnClickListener(new b(27, this));
        setOnLongClickListener(new s0(i3, this));
    }

    public static double c(int i, int i2, int i3, int i4) {
        return Math.sqrt(Math.pow(i4 - i2, 2.0d) + Math.pow(i3 - i, 2.0d));
    }

    public static int e(int i, int i2, Rect rect) {
        return (int) Math.max(c(i, i2, rect.left, rect.top), Math.max(c(i, i2, rect.right, rect.top), Math.max(c(i, i2, rect.left, rect.bottom), c(i, i2, rect.right, rect.bottom))));
    }

    public final void a() {
        int[] iArr = this.S;
        if (iArr == null) {
            return;
        }
        int iMax = (int) Math.max(0.0f, iArr[0] - this.Q);
        Rect rect = this.N;
        rect.left = iMax;
        rect.top = (int) Math.min(0.0f, this.S[1] - this.Q);
        float width = getWidth();
        float f = this.S[0] + this.Q;
        int i = this.m;
        rect.right = (int) Math.min(width, f + i);
        rect.bottom = (int) Math.min(getHeight(), this.S[1] + this.Q + i);
    }

    public final void b(boolean z) {
        this.d = true;
        this.l0.cancel();
        this.k0.cancel();
        if (this.I && this.S != null) {
            if (z) {
                this.n0.start();
                return;
            } else {
                this.m0.start();
                return;
            }
        }
        f();
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            try {
                viewGroup.removeView(this);
            } catch (Exception unused) {
            }
        }
    }

    public final void d(Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            invalidate();
        } else {
            invalidate(rect);
        }
        if (this.i0 != null) {
            invalidateOutline();
        }
    }

    public final void f() {
        if (this.c) {
            return;
        }
        this.d = false;
        this.c = true;
        for (ValueAnimator valueAnimator : this.o0) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        this.I = false;
    }

    public int[] getOuterCircleCenterPoint() {
        Rect rect = this.s;
        int iCenterY = rect.centerY();
        int i = this.f0;
        int i2 = this.n;
        if (i <= 0 ? iCenterY < i2 || iCenterY > getHeight() - i2 : iCenterY < i2 || iCenterY > i - i2) {
            return new int[]{rect.centerX(), rect.centerY()};
        }
        int iMax = Math.max(rect.width(), rect.height()) / 2;
        int i3 = this.f;
        int i4 = iMax + i3;
        int totalTextHeight = getTotalTextHeight();
        int iCenterY2 = rect.centerY();
        int i5 = this.g;
        boolean z = ((iCenterY2 - i5) - i3) - totalTextHeight > 0;
        int iMin = Math.min(this.O.left, rect.left - i4);
        int iMax2 = Math.max(this.O.right, rect.right + i4);
        StaticLayout staticLayout = this.A;
        return new int[]{(iMin + iMax2) / 2, (z ? ((rect.centerY() - i5) - i3) - totalTextHeight : rect.centerY() + i5 + i3) + (staticLayout != null ? staticLayout.getHeight() : 0)};
    }

    public Rect getTextBounds() {
        int totalTextHeight = getTotalTextHeight();
        int totalTextWidth = getTotalTextWidth();
        Rect rect = this.s;
        int iCenterY = rect.centerY();
        int i = this.g;
        int i2 = this.f;
        int iCenterY2 = ((iCenterY - i) - i2) - totalTextHeight;
        if (iCenterY2 <= 0) {
            iCenterY2 = rect.centerY() + i + i2;
        }
        int width = (getWidth() / 2) - rect.centerX();
        int i3 = this.l;
        if (width < 0) {
            i3 = -i3;
        }
        int iCenterX = (rect.centerX() - i3) - totalTextWidth;
        int i4 = this.i;
        int iMax = Math.max(i4, iCenterX);
        return new Rect(iMax, iCenterY2, Math.min(getWidth() - i4, totalTextWidth + iMax), totalTextHeight + iCenterY2);
    }

    public int getTotalTextHeight() {
        StaticLayout staticLayout = this.A;
        if (staticLayout == null) {
            return 0;
        }
        StaticLayout staticLayout2 = this.C;
        int i = this.j;
        if (staticLayout2 == null) {
            return staticLayout.getHeight() + i;
        }
        return this.C.getHeight() + staticLayout.getHeight() + i;
    }

    public int getTotalTextWidth() {
        StaticLayout staticLayout = this.A;
        if (staticLayout == null) {
            return 0;
        }
        return this.C == null ? staticLayout.getWidth() : Math.max(staticLayout.getWidth(), this.C.getWidth());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.p0);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.p0);
        f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        if (this.c || this.S == null) {
            return;
        }
        int i = this.c0;
        if (i != -1) {
            canvas.drawColor(i);
        }
        int i2 = this.T;
        Paint paint = this.v;
        paint.setAlpha(i2);
        if (this.G && this.i0 == null) {
            int iSave = canvas.save();
            d6.b(canvas, this.P);
            float f = this.T * 0.2f;
            Paint.Style style = Paint.Style.FILL_AND_STROKE;
            Paint paint2 = this.w;
            paint2.setStyle(style);
            paint2.setAlpha((int) f);
            int[] iArr = this.S;
            float f2 = iArr[0];
            int i3 = iArr[1];
            int i4 = this.o;
            canvas.drawCircle(f2, i3 + i4, this.Q, paint2);
            paint2.setStyle(Paint.Style.STROKE);
            for (int i5 = 6; i5 > 0; i5--) {
                paint2.setAlpha((int) ((i5 / 7.0f) * f));
                int[] iArr2 = this.S;
                canvas.drawCircle(iArr2[0], iArr2[1] + i4, this.Q + ((7 - i5) * this.p), paint2);
            }
            canvas.restoreToCount(iSave);
        }
        int[] iArr3 = this.S;
        canvas.drawCircle(iArr3[0], iArr3[1], this.Q, paint);
        int i6 = this.a0;
        Paint paint3 = this.x;
        paint3.setAlpha(i6);
        int i7 = this.V;
        Rect rect = this.s;
        if (i7 > 0) {
            Paint paint4 = this.y;
            paint4.setAlpha(i7);
            canvas.drawCircle(rect.centerX(), rect.centerY(), this.U, paint4);
        }
        canvas.drawCircle(rect.centerX(), rect.centerY(), this.W, paint3);
        int iSave2 = canvas.save();
        Rect rect2 = this.O;
        canvas.translate(rect2.left, rect2.top);
        this.t.setAlpha(this.b0);
        StaticLayout staticLayout2 = this.A;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        StaticLayout staticLayout3 = this.C;
        p81 p81Var = this.r;
        if (staticLayout3 != null && (staticLayout = this.A) != null) {
            canvas.translate(0.0f, staticLayout.getHeight() + this.j);
            this.u.setAlpha((int) (p81Var.x * this.b0));
            this.C.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        if (this.g0 != null) {
            canvas.translate(rect.centerX() - (this.g0.getWidth() / 2), rect.centerY() - (this.g0.getHeight() / 2));
            canvas.drawBitmap(this.g0, 0.0f, 0.0f, paint3);
        } else if (p81Var.f != null) {
            canvas.translate(rect.centerX() - (p81Var.f.getBounds().width() / 2), rect.centerY() - (p81Var.f.getBounds().height() / 2));
            p81Var.f.setAlpha(paint3.getAlpha());
            p81Var.f.draw(canvas);
        }
        canvas.restoreToCount(iSave3);
        if (this.E) {
            if (this.M == null) {
                Paint paint5 = new Paint();
                this.M = paint5;
                paint5.setARGB(255, 255, 0, 0);
                this.M.setStyle(Paint.Style.STROKE);
                this.M.setStrokeWidth(lk0.k(getContext(), 1));
            }
            if (this.L == null) {
                TextPaint textPaint = new TextPaint();
                this.L = textPaint;
                textPaint.setColor(-65536);
                this.L.setTextSize((int) TypedValue.applyDimension(2, 16.0f, getContext().getResources().getDisplayMetrics()));
            }
            this.M.setStyle(Paint.Style.STROKE);
            canvas.drawRect(this.O, this.M);
            canvas.drawRect(rect, this.M);
            int[] iArr4 = this.S;
            canvas.drawCircle(iArr4[0], iArr4[1], 10.0f, this.M);
            int[] iArr5 = this.S;
            canvas.drawCircle(iArr5[0], iArr5[1], this.R - this.m, this.M);
            canvas.drawCircle(rect.centerX(), rect.centerY(), this.g + this.f, this.M);
            this.M.setStyle(Paint.Style.FILL);
            String str = "Text bounds: " + this.O.toShortString() + "\nTarget bounds: " + rect.toShortString() + "\nCenter: " + this.S[0] + " " + this.S[1] + "\nView size: " + getWidth() + " " + getHeight() + "\nTarget bounds: " + rect.toShortString();
            SpannableStringBuilder spannableStringBuilder = this.J;
            if (spannableStringBuilder == null) {
                this.J = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.clear();
                this.J.append((CharSequence) str);
            }
            if (this.K == null) {
                TextPaint textPaint2 = this.L;
                int width = getWidth();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.K = d6.e(str, textPaint2, width);
            }
            int iSave4 = canvas.save();
            this.M.setARGB(220, 0, 0, 0);
            canvas.translate(0.0f, 0.0f);
            canvas.drawRect(0.0f, 0.0f, this.K.getWidth(), this.K.getHeight(), this.M);
            this.M.setARGB(255, 255, 0, 0);
            this.K.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c || !this.I || !this.H) {
            return false;
        }
        if (i != 4 && i != 111) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.c || !this.I || !this.e || !this.H || !keyEvent.isTracking() || keyEvent.isCanceled() || (i != 4 && i != 111)) {
            return false;
        }
        this.e = false;
        xt0 xt0Var = this.h0;
        if (xt0Var != null) {
            xt0Var.d(this);
            return true;
        }
        b(false);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d0 = motionEvent.getX();
        this.e0 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setDrawDebug(boolean z) {
        if (this.E != z) {
            this.E = z;
            postInvalidate();
        }
    }
}
