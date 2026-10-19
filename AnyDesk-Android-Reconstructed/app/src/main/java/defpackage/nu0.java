package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends FrameLayout {
    public final Point c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public lu0 l;
    public lu0 m;
    public PointF n;
    public Paint o;
    public Paint p;
    public Paint q;
    public Paint r;
    public Paint s;
    public Paint t;
    public s7 u;

    public nu0(Context context) {
        super(context);
        this.j = new ArrayList();
        this.k = new ArrayList(2);
        this.u = new s7(this, Looper.getMainLooper(), 5);
        for (int i = 0; i < 2; i++) {
            this.k.add(null);
        }
        setDpi(er0.b());
        this.f = 0;
        this.h = 0.1f;
        this.g = 2;
        this.i = false;
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(false);
        }
        this.c = new Point(0, 0);
        this.n = new PointF(0.0f, 0.0f);
        Paint paint = new Paint();
        this.o = paint;
        paint.setColor(Color.rgb(42, 150, 188));
        this.o.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setColor(Color.rgb(224, 96, 64));
        this.p.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.q = paint3;
        paint3.setColor(Color.rgb(96, 188, 120));
        this.q.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.r = paint4;
        paint4.setColor(Color.rgb(235, 167, 30));
        this.r.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.s = paint5;
        paint5.setColor(Color.rgb(150, 150, 150));
        this.s.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.t = paint6;
        paint6.setColor(Color.rgb(120, 120, 120));
        this.t.setAntiAlias(true);
    }

    public final void a(lu0 lu0Var) {
        lu0Var.e = 0;
        this.j.add(lu0Var);
    }

    public final void b(lu0 lu0Var, lu0 lu0Var2) {
        ArrayList arrayList;
        int i;
        s7 s7Var = this.u;
        if (s7Var != null) {
            s7Var.removeMessages(q51.d(1));
        }
        if (lu0Var != null && lu0Var.i) {
            lu0Var.a();
        }
        if (lu0Var2 != null) {
            ArrayList arrayList2 = lu0Var2.d;
            if (!lu0Var2.i) {
                lu0Var2.b();
            }
            int i2 = lu0Var2.e + 1;
            while (true) {
                arrayList = this.k;
                if (i2 >= 2) {
                    break;
                }
                arrayList.set(i2, null);
                i2++;
            }
            if (lu0Var != null && lu0Var2.e <= lu0Var.e) {
                lu0Var.f(false);
            }
            List list = (List) arrayList.get(lu0Var2.e);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lu0) it.next()).f(false);
                }
            }
            lu0Var2.f(true);
            if (arrayList2.size() > 0 && (i = lu0Var2.e + 1) >= 0 && i < 2) {
                arrayList.set(i, arrayList2);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    ((lu0) obj).f(false);
                }
                if (this.i) {
                    c(i, arrayList2);
                }
            }
            this.l = lu0Var2;
        } else if (lu0Var != null && lu0Var.d.size() > 0) {
            this.l = null;
            this.m = null;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0240  */
    /* JADX WARN: Code duplicated, block: B:88:0x024d  */
    public final void c(int i, List list) {
        double d;
        double d2;
        float f;
        double dAcos;
        float f2;
        float fAcos;
        float fAcos2;
        double dAcos2;
        int i2;
        double dAcos3;
        double dAcos4;
        float f3;
        float f4;
        float f5;
        float f6;
        float size;
        Iterator it;
        lu0 lu0Var;
        View view;
        float f7;
        Path path;
        double dAcos5;
        double dAcos6;
        if (list == null) {
            return;
        }
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.g;
        int i6 = (i4 * i) + i3 + i5;
        int i7 = (((i + 1) * i4) + i3) - i5;
        int i8 = ((i4 * 2) + i3) - i5;
        int width = getWidth();
        int height = getHeight();
        Point point = this.c;
        int i9 = point.y;
        int i10 = height - i9;
        int i11 = point.x;
        int i12 = width - i11;
        if (i12 > i11 || i12 > i9 || i12 > i10) {
            d = 6.283185307179586d;
            if (i10 <= i9 && i10 <= i11 && i10 <= i12) {
                if (i8 > i11) {
                    dAcos3 = 1.5707963267948966d - Math.acos(((double) i11) / ((double) i8));
                } else {
                    if (i8 > i10) {
                        dAcos3 = 3.141592653589793d - Math.acos(((double) i10) / ((double) i8));
                    } else {
                        f2 = 1.5707964f;
                    }
                    if (i8 > i12) {
                        dAcos4 = Math.acos(((double) i12) / ((double) i8)) + 4.71238898038469d;
                    } else if (i8 > i10) {
                        dAcos4 = Math.acos(((double) i10) / ((double) i8)) + 3.141592653589793d;
                    } else {
                        d2 = 3.141592653589793d;
                        fAcos = 4.712389f;
                    }
                    fAcos = (float) dAcos4;
                    d2 = 3.141592653589793d;
                }
                f2 = (float) dAcos3;
                if (i8 > i12) {
                    dAcos4 = Math.acos(((double) i12) / ((double) i8)) + 4.71238898038469d;
                } else if (i8 > i10) {
                    dAcos4 = Math.acos(((double) i10) / ((double) i8)) + 3.141592653589793d;
                } else {
                    d2 = 3.141592653589793d;
                    fAcos = 4.712389f;
                }
                fAcos = (float) dAcos4;
                d2 = 3.141592653589793d;
            } else if (i11 > i12 || i11 > i9 || i11 > i10) {
                d2 = 3.141592653589793d;
                if (i8 > i11) {
                    dAcos = Math.acos(((double) i11) / ((double) i8)) + 1.5707963267948966d;
                } else {
                    if (i8 > i9) {
                        dAcos = Math.acos(((double) i9) / ((double) i8));
                    } else {
                        f = 1.5707964f;
                    }
                    if (i8 > i12) {
                        fAcos = (float) (4.71238898038469d - Math.acos(((double) i12) / ((double) i8)));
                    } else if (i8 > i9) {
                        fAcos = (float) (6.283185307179586d - Math.acos(((double) i9) / ((double) i8)));
                    } else {
                        f2 = f;
                        fAcos = 4.712389f;
                    }
                    f2 = f;
                }
                f = (float) dAcos;
                if (i8 > i12) {
                    fAcos = (float) (4.71238898038469d - Math.acos(((double) i12) / ((double) i8)));
                } else if (i8 > i9) {
                    fAcos = (float) (6.283185307179586d - Math.acos(((double) i9) / ((double) i8)));
                } else {
                    f2 = f;
                    fAcos = 4.712389f;
                }
                f2 = f;
            } else {
                if (i8 > i9) {
                    d2 = 3.141592653589793d;
                    fAcos2 = (float) (6.283185307179586d - Math.acos(((double) i9) / ((double) i8)));
                } else {
                    d2 = 3.141592653589793d;
                    if (i8 > i11) {
                        fAcos2 = (float) (1.5707963267948966d - Math.acos(((double) i11) / ((double) i8)));
                    } else {
                        f2 = 0.0f;
                    }
                    if (i8 > i10) {
                        dAcos2 = Math.acos(((double) i10) / ((double) i8)) + d2;
                    } else if (i8 > i11) {
                        dAcos2 = Math.acos(((double) i11) / ((double) i8)) + 1.5707963267948966d;
                    } else {
                        fAcos = 3.1415927f;
                    }
                    fAcos = (float) dAcos2;
                }
                f2 = fAcos2;
                if (i8 > i10) {
                    dAcos2 = Math.acos(((double) i10) / ((double) i8)) + d2;
                } else if (i8 > i11) {
                    dAcos2 = Math.acos(((double) i11) / ((double) i8)) + 1.5707963267948966d;
                } else {
                    fAcos = 3.1415927f;
                }
                fAcos = (float) dAcos2;
            }
            i2 = -1;
            f3 = i2;
            f4 = (float) (((double) (f2 * f3)) % d);
            f5 = (float) (((double) (fAcos * f3)) % d);
            if (f4 < 0.0f) {
                f4 = (float) (((double) f4) + d);
            }
            if (f5 < 0.0f) {
                f5 = (float) (((double) f5) + d);
            }
            f6 = f5 - f4;
            if (f6 < 0.0f) {
                f6 = (float) (((double) f6) + d);
            }
            size = (f6 * f3) / list.size();
            it = list.iterator();
            while (it.hasNext()) {
                lu0Var = (lu0) it.next();
                view = lu0Var.a;
                if (view != null) {
                    view.measure(0, 0);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    double d3 = ((i7 - i6) / 2) + i6;
                    double d4 = (size / 2.0f) + f2;
                    int iSin = (point.x - ((int) (Math.sin(d4) * d3))) - (measuredWidth / 2);
                    int iCos = (point.y - ((int) (d3 * Math.cos(d4)))) - (measuredHeight / 2);
                    view.layout(iSin, iCos, measuredWidth + iSin, measuredHeight + iCos);
                }
                int i13 = this.f;
                float f8 = ((float) (270.0d - ((((double) f2) * 180.0d) / d2))) - (i2 * i13);
                f7 = f2 + size;
                float f9 = ((this.h + i13) * f3) + ((float) (270.0d - ((((double) f7) * 180.0d) / d2)));
                int i14 = point.x;
                int i15 = point.y;
                RectF rectF = new RectF(i14 - i7, i15 - i7, i14 + i7, i15 + i7);
                int i16 = point.x;
                int i17 = point.y;
                RectF rectF2 = new RectF(i16 - i6, i17 - i6, i16 + i6, i17 + i6);
                path = new Path();
                path.arcTo(rectF, f8, f9 - f8, true);
                path.arcTo(rectF2, f9, f8 - f9);
                path.close();
                if (size > 0.0f) {
                    lu0Var.k = f2;
                    lu0Var.l = size;
                    lu0Var.m = i6;
                    i7 = i7;
                    lu0Var.n = i7;
                    lu0Var.o = path;
                } else {
                    i7 = i7;
                    lu0Var.k = f7;
                    lu0Var.l = -size;
                    lu0Var.m = i6;
                    lu0Var.n = i7;
                    lu0Var.o = path;
                }
                it = it;
                f2 = f7;
                f3 = f3;
            }
        }
        if (i8 > i9) {
            d = 6.283185307179586d;
            dAcos5 = Math.acos(((double) i9) / ((double) i8));
        } else {
            d = 6.283185307179586d;
            if (i8 > i12) {
                dAcos5 = Math.acos(((double) i12) / ((double) i8)) + 4.71238898038469d;
            } else {
                f2 = 0.0f;
            }
            if (i8 > i10) {
                dAcos6 = 3.141592653589793d - Math.acos(((double) i10) / ((double) i8));
            } else if (i8 > i12) {
                dAcos6 = 4.71238898038469d - Math.acos(((double) i12) / ((double) i8));
            } else {
                d2 = 3.141592653589793d;
                fAcos = 3.1415927f;
            }
            fAcos = (float) dAcos6;
            d2 = 3.141592653589793d;
        }
        f2 = (float) dAcos5;
        if (i8 > i10) {
            dAcos6 = 3.141592653589793d - Math.acos(((double) i10) / ((double) i8));
        } else if (i8 > i12) {
            dAcos6 = 4.71238898038469d - Math.acos(((double) i12) / ((double) i8));
        } else {
            d2 = 3.141592653589793d;
            fAcos = 3.1415927f;
        }
        fAcos = (float) dAcos6;
        d2 = 3.141592653589793d;
        i2 = 1;
        f3 = i2;
        f4 = (float) (((double) (f2 * f3)) % d);
        f5 = (float) (((double) (fAcos * f3)) % d);
        if (f4 < 0.0f) {
            f4 = (float) (((double) f4) + d);
        }
        if (f5 < 0.0f) {
            f5 = (float) (((double) f5) + d);
        }
        f6 = f5 - f4;
        if (f6 < 0.0f) {
            f6 = (float) (((double) f6) + d);
        }
        size = (f6 * f3) / list.size();
        it = list.iterator();
        while (it.hasNext()) {
            lu0Var = (lu0) it.next();
            view = lu0Var.a;
            if (view != null) {
                view.measure(0, 0);
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                double d5 = ((i7 - i6) / 2) + i6;
                double d6 = (size / 2.0f) + f2;
                int iSin2 = (point.x - ((int) (Math.sin(d6) * d5))) - (measuredWidth2 / 2);
                int iCos2 = (point.y - ((int) (d5 * Math.cos(d6)))) - (measuredHeight2 / 2);
                view.layout(iSin2, iCos2, measuredWidth2 + iSin2, measuredHeight2 + iCos2);
            }
            int i18 = this.f;
            float f10 = ((float) (270.0d - ((((double) f2) * 180.0d) / d2))) - (i2 * i18);
            f7 = f2 + size;
            float f11 = ((this.h + i18) * f3) + ((float) (270.0d - ((((double) f7) * 180.0d) / d2)));
            int i19 = point.x;
            int i110 = point.y;
            RectF rectF3 = new RectF(i19 - i7, i110 - i7, i19 + i7, i110 + i7);
            int i111 = point.x;
            int i112 = point.y;
            RectF rectF4 = new RectF(i111 - i6, i112 - i6, i111 + i6, i112 + i6);
            path = new Path();
            path.arcTo(rectF3, f10, f11 - f10, true);
            path.arcTo(rectF4, f11, f10 - f11);
            path.close();
            if (size > 0.0f) {
                lu0Var.k = f2;
                lu0Var.l = size;
                lu0Var.m = i6;
                i7 = i7;
                lu0Var.n = i7;
                lu0Var.o = path;
            } else {
                i7 = i7;
                lu0Var.k = f7;
                lu0Var.l = -size;
                lu0Var.m = i6;
                lu0Var.n = i7;
                lu0Var.o = path;
            }
            it = it;
            f2 = f7;
            f3 = f3;
        }
    }

    public Point getPosition() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i) {
            for (int i = 0; i < 2; i++) {
                ArrayList arrayList = (ArrayList) this.k.get(i);
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        lu0 lu0Var = (lu0) arrayList.get(i2);
                        View view = lu0Var.a;
                        if (view != null) {
                            Paint paint = this.o;
                            if (lu0Var.j) {
                                paint = this.p;
                            }
                            if (lu0Var.g) {
                                paint = this.q;
                            }
                            boolean z = lu0Var.f;
                            if (!z) {
                                paint = this.s;
                            }
                            if (lu0Var.h) {
                                paint = z ? this.r : this.t;
                            }
                            if (paint != null) {
                                canvas.drawPath(lu0Var.o, paint);
                                int iSave = canvas.save();
                                canvas.translate(view.getX(), view.getY());
                                view.draw(canvas);
                                canvas.restoreToCount(iSave);
                            }
                        }
                    }
                }
            }
        }
    }

    public void setDpi(float f) {
        double d = f;
        this.d = (int) (0.4d * d);
        this.e = (int) (d * 0.6d);
    }

    public void setItemRadius(int i) {
        this.e = i;
    }

    public void setStartRadius(int i) {
        this.d = i;
    }

    public void setmRadialGap(int i) {
        this.g = i;
    }

    public void setmSliceGap(int i) {
        this.f = i;
        this.h = i > 0 ? 0.0f : 0.1f;
    }
}
