package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ty extends ow0 implements uw0 {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public final ValueAnimator A;
    public int B;
    public final c C;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public final int d;
    public final int e;
    public final StateListDrawable f;
    public final Drawable g;
    public final int h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public ArrayList x;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] y = new int[2];
    public final int[] z = new int[2];

    public ty(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = valueAnimatorOfFloat;
        this.B = 0;
        c cVar = new c(19, this);
        this.C = cVar;
        g0 g0Var = new g0(2, this);
        this.b = stateListDrawable;
        this.c = drawable;
        this.f = stateListDrawable2;
        this.g = drawable2;
        this.d = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.e = Math.max(i, drawable.getIntrinsicWidth());
        this.h = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.i = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.j = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new sy(this, 0));
        valueAnimatorOfFloat.addUpdateListener(new nh(1, this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.d0(this);
            RecyclerView recyclerView3 = this.s;
            recyclerView3.s.remove(this);
            if (recyclerView3.t == this) {
                recyclerView3.t = null;
            }
            ArrayList arrayList = this.s.j0;
            if (arrayList != null) {
                arrayList.remove(g0Var);
            }
            this.s.removeCallbacks(cVar);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.s.s.add(this);
            this.s.j(g0Var);
        }
    }

    public static int g(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // defpackage.uw0
    public final void a(MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    h(1);
                    this.p = (int) motionEvent.getX();
                } else if (zF) {
                    h(2);
                    this.m = (int) motionEvent.getY();
                }
                i(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            i(1);
            h(0);
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            j();
            int i = this.w;
            RecyclerView recyclerView = this.s;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.z;
                iArr[0] = 0;
                int i2 = this.q;
                iArr[1] = i2;
                float fMax = Math.max(0.0f, Math.min(i2, x));
                int iG = g(this.p, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.q);
                if (iG != 0) {
                    recyclerView.scrollBy(iG, 0);
                }
                this.p = fMax;
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.y;
                iArr2[0] = 0;
                int i3 = this.r;
                iArr2[1] = i3;
                float fMax2 = Math.max(0.0f, Math.min(i3, y));
                int iG2 = g(this.m, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.r);
                if (iG2 != 0) {
                    recyclerView.scrollBy(0, iG2);
                }
                this.m = fMax2;
            }
        }
    }

    @Override // defpackage.uw0
    public final boolean b(MotionEvent motionEvent) {
        int i = this.v;
        if (i != 1) {
            return i == 2;
        }
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zF && !zE) {
            return false;
        }
        if (zE) {
            h(1);
            this.p = (int) motionEvent.getX();
        } else if (zF) {
            h(2);
            this.m = (int) motionEvent.getY();
        }
        i(2);
        return true;
    }

    @Override // defpackage.ow0
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int i = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            i(0);
            return;
        }
        if (this.B != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.d;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i7 = this.e;
                int i8 = this.r;
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, i7, i8);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i5);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i5);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i5);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i5);
                }
            }
            if (this.u) {
                int i9 = this.r;
                int i10 = this.h;
                int i11 = i9 - i10;
                int i12 = this.o;
                int i13 = this.n;
                StateListDrawable stateListDrawable2 = this.f;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i14 = this.q;
                int i15 = this.i;
                Drawable drawable2 = this.g;
                drawable2.setBounds(0, 0, i14, i15);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i12, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i12, -i11);
            }
        }
    }

    public final boolean e(float f, float f2) {
        if (f2 < this.r - this.h) {
            return false;
        }
        int i = this.o;
        return f >= ((float) i) && f <= ((float) (i + this.n));
    }

    public final boolean f(float f, float f2) {
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.d;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        return f2 >= ((float) i2) && f2 <= ((float) (i2 + this.k));
    }

    public final void h(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbookRosterFragment abookRosterFragment = ((x) this.x.get(size)).a;
                if (i == 0) {
                    abookRosterFragment.O0();
                }
            }
        }
    }

    public final void i(int i) {
        RecyclerView recyclerView = this.s;
        c cVar = this.C;
        StateListDrawable stateListDrawable = this.b;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(cVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            j();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(E);
            recyclerView.removeCallbacks(cVar);
            recyclerView.postDelayed(cVar, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(cVar);
            recyclerView.postDelayed(cVar, 1500L);
        }
        this.v = i;
    }

    public final void j() {
        int i = this.B;
        ValueAnimator valueAnimator = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.B = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
