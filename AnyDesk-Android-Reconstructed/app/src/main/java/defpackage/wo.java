package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wo implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public wo(nu0 nu0Var, int i, int i2) {
        this.f = nu0Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[LOOP:2: B:67:0x0160->B:68:0x0162, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        lu0 lu0Var;
        s7 s7Var;
        ArrayList arrayList;
        int size;
        int i2;
        lu0 lu0Var2;
        byte b;
        int i3 = this.c;
        Object obj = this.f;
        int i4 = 0;
        int i5 = 2;
        int i6 = this.d;
        switch (i3) {
            case 0:
                nu0 nu0Var = (nu0) obj;
                ArrayList arrayList2 = nu0Var.k;
                int[] iArr = new int[2];
                nu0Var.getLocationInWindow(iArr);
                int i7 = i6 - iArr[0];
                int i8 = this.e - iArr[1];
                if (nu0Var.i) {
                    PointF pointF = nu0Var.n;
                    Point point = nu0Var.c;
                    float f = point.x - i7;
                    pointF.x = f;
                    float f2 = point.y - i8;
                    pointF.y = f2;
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    pointF.y = fSqrt;
                    if (f2 > 0.0f) {
                        pointF.x = (float) Math.asin(f / fSqrt);
                    } else if (f2 < 0.0f) {
                        pointF.x = (float) (3.141592653589793d - Math.asin(f / fSqrt));
                    } else {
                        pointF.x = 1.5707964f;
                    }
                    lu0 lu0Var3 = nu0Var.l;
                    PointF pointF2 = nu0Var.n;
                    int i9 = 0;
                    while (true) {
                        if (i9 < i5) {
                            ArrayList arrayList3 = (ArrayList) arrayList2.get(i9);
                            if (arrayList3 != null) {
                                int size2 = arrayList3.size();
                                if (size2 > 0) {
                                    lu0 lu0Var4 = (lu0) arrayList3.get(i4);
                                    float f3 = lu0Var4.m;
                                    float f4 = pointF2.y;
                                    if (f3 < f4 && lu0Var4.n > f4) {
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < size2) {
                                                lu0Var = (lu0) arrayList3.get(i10);
                                                float f5 = lu0Var.k;
                                                float f6 = lu0Var.l;
                                                i = 1;
                                                float f7 = (float) (((double) f5) % 6.283185307179586d);
                                                float f8 = (float) (((double) pointF2.x) % 6.283185307179586d);
                                                if (f7 < 0.0f) {
                                                    f7 = (float) (((double) f7) + 6.283185307179586d);
                                                }
                                                if (f8 < 0.0f) {
                                                    f8 = (float) (((double) f8) + 6.283185307179586d);
                                                }
                                                if (f7 >= f8 || f7 + f6 <= f8) {
                                                    int i11 = size2;
                                                    double d = ((double) f8) + 6.283185307179586d;
                                                    if (f7 >= d || f7 + f6 <= d) {
                                                        i10++;
                                                        size2 = i11;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i9++;
                                i4 = 0;
                                i5 = 2;
                            }
                            if ((lu0Var == lu0Var3 || (lu0Var3 != null && !lu0Var3.i)) && lu0Var != nu0Var.m) {
                                nu0Var.m = lu0Var;
                                s7Var = nu0Var.u;
                                if (s7Var != null) {
                                    s7Var.removeMessages(q51.d(i));
                                    s7Var.sendEmptyMessageDelayed(q51.d(i), 100L);
                                }
                            }
                            if (nu0Var.n.y < nu0Var.d) {
                                arrayList = nu0Var.j;
                                size = arrayList.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    ((lu0) obj2).f(false);
                                }
                                arrayList2.set(1, null);
                                lu0Var2 = nu0Var.l;
                                nu0Var.l = null;
                                if (lu0Var2 != null && lu0Var2.i) {
                                    lu0Var2.a();
                                }
                                nu0Var.m = null;
                                nu0Var.invalidate();
                                return;
                            }
                            return;
                        }
                        i = 1;
                        lu0Var = null;
                        if (lu0Var == lu0Var3) {
                            nu0Var.m = lu0Var;
                            s7Var = nu0Var.u;
                            if (s7Var != null) {
                                s7Var.removeMessages(q51.d(i));
                                s7Var.sendEmptyMessageDelayed(q51.d(i), 100L);
                            }
                        } else {
                            nu0Var.m = lu0Var;
                            s7Var = nu0Var.u;
                            if (s7Var != null) {
                                s7Var.removeMessages(q51.d(i));
                                s7Var.sendEmptyMessageDelayed(q51.d(i), 100L);
                            }
                        }
                        if (nu0Var.n.y < nu0Var.d) {
                            arrayList = nu0Var.j;
                            size = arrayList.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                ((lu0) obj3).f(false);
                            }
                            arrayList2.set(1, null);
                            lu0Var2 = nu0Var.l;
                            nu0Var.l = null;
                            if (lu0Var2 != null) {
                                lu0Var2.a();
                            }
                            nu0Var.m = null;
                            nu0Var.invalidate();
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (i6 == 1) {
                    b = 0;
                } else if (i6 == 2) {
                    b = 1;
                } else {
                    if (i6 != 3) {
                        throw null;
                    }
                    b = 2;
                }
                zl0 zl0Var = (zl0) obj;
                JniAdExt.jniReportMotdEvent(b, zl0Var.c.c, this.e, nd0.T(zl0Var.d), nd0.T(zl0Var.e), nd0.T(zl0Var.f));
                return;
        }
    }

    public wo(int i, zl0 zl0Var, int i2) {
        this.d = i;
        this.f = zl0Var;
        this.e = i2;
    }
}
