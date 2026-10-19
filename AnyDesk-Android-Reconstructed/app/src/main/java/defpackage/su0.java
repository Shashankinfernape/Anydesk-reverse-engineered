package defpackage;

import android.animation.TimeAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import com.anydesk.anydeskandroid.IncomingConnectionService;

/* JADX INFO: loaded from: classes.dex */
public final class su0 extends View implements TimeAnimator.TimeListener {
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public TimeAnimator f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public int m;
    public Runnable n;

    public su0(IncomingConnectionService incomingConnectionService) {
        super(incomingConnectionService);
        Paint paint = new Paint();
        this.c = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        Paint paint3 = new Paint();
        this.e = paint3;
        this.f = null;
        this.g = 0L;
        this.h = 0L;
        this.i = false;
        this.j = true;
        this.k = 5.0f;
        this.l = 1.5f;
        this.m = 0;
        this.n = null;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f = timeAnimator;
        timeAnimator.setTimeListener(this);
        paint.setColor(-16776961);
        paint.setAlpha(200);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setColor(-1);
        paint2.setAlpha(200);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint3.setColor(-16777216);
        paint3.setAlpha(200);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        b();
    }

    public final void a() {
        this.h = SystemClock.uptimeMillis();
        if (getVisibility() != 0) {
            this.i = true;
            this.j = true;
            TimeAnimator timeAnimator = this.f;
            if (timeAnimator != null) {
                timeAnimator.cancel();
            }
            b();
            this.g = 0L;
            setVisibility(0);
            TimeAnimator timeAnimator2 = this.f;
            if (timeAnimator2 != null) {
                timeAnimator2.setCurrentPlayTime(0L);
                timeAnimator2.start();
            }
        }
    }

    public final void b() {
        int iB = er0.b();
        if (iB != this.m) {
            this.m = iB;
            float f = iB;
            float f2 = (5.0f * f) / 160.0f;
            this.k = f2;
            this.l = (f * 1.5f) / 160.0f;
            this.c.setStrokeWidth(f2);
            this.d.setStrokeWidth(this.l);
            this.e.setStrokeWidth(this.l);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = canvas.getWidth();
        float f = width / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        float f2 = ((width - this.k) - (this.l * 4.0f)) / 2.0f;
        float f3 = this.g / 300.0f;
        if (this.j && f3 > 0.5f && SystemClock.uptimeMillis() - this.h < 150) {
            TimeAnimator timeAnimator = this.f;
            if (timeAnimator != null) {
                timeAnimator.setCurrentPlayTime(150L);
            }
            f3 = 0.5f;
        }
        float f4 = f3 * f3;
        float f5 = (((f3 * f4) * 2.0f) - (f4 * 3.0f)) + 1.0f;
        if ((this.i && f5 > 0.5f) || !this.j) {
            f5 = 1.0f - f5;
        }
        float f6 = f2 * f5;
        canvas.drawCircle(f, height, f6, this.c);
        float f7 = (this.k / 2.0f) + f6;
        float f8 = this.l + f7;
        Paint paint = this.d;
        canvas.drawCircle(f, height, f7, paint);
        Paint paint2 = this.e;
        canvas.drawCircle(f, height, f8, paint2);
        float f9 = f6 - (this.k / 2.0f);
        float f10 = f9 - this.l;
        if (f9 > 0.0f) {
            canvas.drawCircle(f, height, f9, paint);
        }
        if (f10 > 0.0f) {
            canvas.drawCircle(f, height, f10, paint2);
        }
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (j >= 300) {
            this.g = 300L;
            TimeAnimator timeAnimator2 = this.f;
            if (timeAnimator2 != null) {
                timeAnimator2.cancel();
            }
            if (this.j) {
                setVisibility(4);
                Runnable runnable = this.n;
                if (runnable != null) {
                    runnable.run();
                }
            }
        } else {
            this.g = j;
        }
        invalidate();
    }

    public void setHideCallback(Runnable runnable) {
        this.n = runnable;
    }
}
