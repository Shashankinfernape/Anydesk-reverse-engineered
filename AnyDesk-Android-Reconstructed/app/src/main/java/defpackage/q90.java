package defpackage;

import android.graphics.PointF;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class q90 implements ad0 {
    public int s;
    public final e7 t;
    public final Logging c = new Logging("InputInjectorTranslator");
    public final vx d = new vx();
    public z70 e = null;
    public final zd f = new zd(0);
    public final ArrayList g = new ArrayList();
    public final PointF h = new PointF();
    public final PointF i = new PointF();
    public final PointF j = new PointF();
    public int k = 0;
    public int l = 0;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public final ui0 q = new ui0(2);
    public final boolean r = er0.d;
    public boolean u = false;

    public q90() {
        int i = 1;
        this.s = 1;
        this.t = new e7(km0.msrcc_pointer, jm0.msrc_touchscreen, 0, hm0.mop_none, 0, 0, (byte) 1, 0, cm0.maf_axis_x.c | cm0.maf_axis_y.c, 0.0f, 0.0f, em0.mbtn_none, new int[]{0}, new float[1], new float[1]);
        int iH2 = JniAdExt.h2(io.KEY_INJECT_MOUSE_AS_TOUCH);
        for (int i2 : q51.s(2)) {
            if (q51.r(i2) == iH2) {
                i = i2;
                break;
            }
        }
        this.s = i;
    }

    public final boolean a(z70 z70Var, int i, int i2) {
        int i3;
        int i4;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i5 = this.l;
        this.d.getClass();
        if (i2 != 63) {
            i3 = 16;
            if (i2 != 78) {
                if (i2 == 113) {
                    i3 = 8192;
                } else if (i2 != 114) {
                    switch (i2) {
                        case 57:
                            break;
                        case 58:
                            i3 = 32;
                            break;
                        case 59:
                            i3 = 64;
                            break;
                        case 60:
                            i3 = 128;
                            break;
                        default:
                            switch (i2) {
                                case 117:
                                    i3 = 131072;
                                    break;
                                case 118:
                                    i3 = 262144;
                                    break;
                                case 119:
                                    i3 = 8;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i3 = 16384;
                }
            }
        } else {
            i3 = 4;
        }
        if (i == 0) {
            i5 |= i3;
        } else if (i == 1) {
            i5 &= ~i3;
            if (i2 == 115) {
                i4 = 1048576;
            } else if (i2 == 116) {
                i4 = 4194304;
            } else if (i2 == 143) {
                i4 = 2097152;
            }
            i5 ^= i4;
        }
        int i6 = (i5 & 192) != 0 ? i5 | 1 : i5 & (-2);
        int i7 = (i6 & 48) != 0 ? i6 | 2 : i6 & (-3);
        int i8 = (i7 & 24576) != 0 ? i7 | 4096 : i7 & (-4097);
        KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, i, i2, 0, (393216 & i8) != 0 ? i8 | 65536 : i8 & (-65537));
        boolean zA = z70Var.a(keyEvent);
        if (zA) {
            this.l = keyEvent.getMetaState();
            zd zdVar = this.f;
            if (i == 0) {
                zdVar.add(Integer.valueOf(i2));
                return zA;
            }
            zdVar.remove(Integer.valueOf(i2));
        }
        return zA;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x04dd A[LOOP:0: B:178:0x04db->B:179:0x04dd, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.ArrayList] */
    @Override // defpackage.ad0
    public final boolean b(int i, int i2, nm0 nm0Var, int i3) {
        char c;
        long j;
        int i4;
        String str;
        long j2;
        int i5;
        long j3;
        int i6;
        Object obj;
        hm0 hm0Var;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j4;
        String str3;
        int i13;
        String str4;
        ?? F;
        ?? r2;
        boolean z;
        int i14;
        boolean zF;
        ArrayList arrayList;
        int size;
        String str5 = "inject exception: ";
        z70 z70Var = this.e;
        if (z70Var == null) {
            return false;
        }
        float f = i;
        float f2 = i2;
        this.h.set(f, f2);
        MainApplication.v().S(this.h);
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j5 = this.m;
        if (j5 == 0) {
            j5 = jUptimeMillis;
        }
        this.g.clear();
        if (!nm0Var.equals(nm0.d)) {
            c = 0;
            int i15 = nm0Var.c;
            if ((i15 & 1) == 1) {
                this.n = jUptimeMillis;
                j = 0;
                if (this.m == 0) {
                    this.m = jUptimeMillis;
                }
                i4 = 1;
            } else {
                j = 0;
                i4 = 0;
            }
            int i16 = this.s;
            if (i16 == 1) {
                if ((i15 & 4) == 4) {
                    i4 |= 2;
                    this.o = jUptimeMillis;
                    if (this.m == j) {
                        this.m = jUptimeMillis;
                    }
                }
                if ((i15 & 16) == 16) {
                    i4 |= 4;
                    this.p = jUptimeMillis;
                    if (this.m == j) {
                        this.m = jUptimeMillis;
                    }
                }
            }
            int i17 = this.k;
            int i18 = i17 | i4;
            if (i18 != i17) {
                if (i16 == 2) {
                    if (i17 == 0) {
                        if (!this.h.equals(this.i)) {
                            d(hm0.mop_hover_move, f, f2);
                        }
                        d(hm0.mop_hover_exit, f, f2);
                        d(hm0.mop_start, f, f2);
                    } else {
                        d(hm0.mop_move, f, f2);
                    }
                    str3 = "inject exception: ";
                    z70Var = z70Var;
                    j2 = j5;
                    i10 = i18;
                    i13 = 4;
                } else {
                    if (i17 == 0) {
                        if (this.h.equals(this.i)) {
                            i11 = i18;
                            i12 = 4;
                            j4 = j5;
                            i9 = 23;
                        } else {
                            ArrayList arrayList2 = this.g;
                            j4 = j5;
                            vx vxVar = this.d;
                            boolean z2 = this.r;
                            PointF pointF = this.h;
                            i11 = i18;
                            i12 = 4;
                            i9 = 23;
                            arrayList2.add(vxVar.d(z2, j4, jUptimeMillis, pointF.x, pointF.y, 7, this.k));
                        }
                        ArrayList arrayList3 = this.g;
                        vx vxVar2 = this.d;
                        boolean z3 = this.r;
                        PointF pointF2 = this.h;
                        i7 = i11;
                        arrayList3.add(vxVar2.d(z3, j4, jUptimeMillis, pointF2.x, pointF2.y, 10, i7));
                        ArrayList arrayList4 = this.g;
                        vx vxVar3 = this.d;
                        boolean z4 = this.r;
                        PointF pointF3 = this.h;
                        arrayList4.add(vxVar3.d(z4, j4, jUptimeMillis, pointF3.x, pointF3.y, 0, i7));
                        j2 = j4;
                        i8 = i12;
                        str2 = str5;
                    } else {
                        str2 = "inject exception: ";
                        z70Var = z70Var;
                        i7 = i18;
                        i8 = 4;
                        long j6 = j5;
                        i9 = 23;
                        ArrayList arrayList5 = this.g;
                        vx vxVar4 = this.d;
                        boolean z5 = this.r;
                        PointF pointF4 = this.h;
                        j2 = j6;
                        arrayList5.add(vxVar4.d(z5, j6, jUptimeMillis, pointF4.x, pointF4.y, 2, i7));
                    }
                    if (Build.VERSION.SDK_INT >= i9) {
                        int i19 = this.k;
                        if (t70.e(i4, 1)) {
                            int i20 = i19 | 1;
                            ArrayList arrayList6 = this.g;
                            vx vxVar5 = this.d;
                            boolean z6 = this.r;
                            long j7 = this.n;
                            PointF pointF5 = this.h;
                            float f3 = pointF5.x;
                            float f4 = pointF5.y;
                            i10 = i7;
                            arrayList6.add(vxVar5.e(z6, j7, jUptimeMillis, f3, f4, 11, 1, i20));
                            i19 = i20;
                        } else {
                            i10 = i7;
                        }
                        if (t70.e(i4, 2)) {
                            int i21 = i19 | 2;
                            ArrayList arrayList7 = this.g;
                            vx vxVar6 = this.d;
                            boolean z7 = this.r;
                            long j8 = this.o;
                            PointF pointF6 = this.h;
                            arrayList7.add(vxVar6.e(z7, j8, jUptimeMillis, pointF6.x, pointF6.y, 11, 2, i21));
                            i19 = i21;
                        }
                        boolean zE = t70.e(i4, i8);
                        i13 = i8;
                        str3 = str2;
                        if (zE) {
                            int i22 = i19 | 4;
                            ArrayList arrayList8 = this.g;
                            vx vxVar7 = this.d;
                            boolean z8 = this.r;
                            long j9 = this.p;
                            PointF pointF7 = this.h;
                            arrayList8.add(vxVar7.e(z8, j9, jUptimeMillis, pointF7.x, pointF7.y, 11, 4, i22));
                            i13 = i8;
                            str3 = str2;
                        }
                    } else {
                        i10 = i7;
                        i13 = i8;
                        str3 = str2;
                    }
                }
                this.k = i10;
                i5 = i13;
                str = str3;
            } else {
                str = "inject exception: ";
                z70Var = z70Var;
                j2 = j5;
                i5 = 4;
            }
            int i23 = nm0Var.c;
            int i24 = (i23 & 2) == 2 ? 1 : 0;
            int i25 = this.s;
            if (i25 == 1) {
                if ((i23 & 8) == 8) {
                    i24 |= 2;
                }
                if ((i23 & 32) == 32) {
                    i24 |= 4;
                }
            }
            int i26 = i24;
            int i27 = this.k;
            int i28 = (~i26) & i27;
            if (i28 == 0) {
                this.m = 0L;
            }
            if (i28 != i27) {
                PointF pointF8 = this.h;
                PointF pointF9 = this.i;
                if (i25 == 2) {
                    if (!pointF8.equals(pointF9)) {
                        d(hm0.mop_move, f, f2);
                    }
                    if (i28 == 0) {
                        d(hm0.mop_finish, f, f2);
                        d(hm0.mop_hover_enter, f, f2);
                        hm0 hm0Var2 = hm0.mop_hover_move;
                        d(hm0Var2, f, f2);
                        this.u = true;
                        hm0Var = hm0Var2;
                    } else {
                        hm0 hm0Var3 = hm0.mop_move;
                        d(hm0Var3, f, f2);
                        hm0Var = hm0Var3;
                    }
                    i6 = i28;
                    j3 = j2;
                    obj = hm0Var;
                } else {
                    if (!pointF8.equals(pointF9)) {
                        ArrayList arrayList9 = this.g;
                        vx vxVar8 = this.d;
                        boolean z9 = this.r;
                        PointF pointF10 = this.h;
                        arrayList9.add(vxVar8.d(z9, j2, jUptimeMillis, pointF10.x, pointF10.y, 2, this.k));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        int i29 = this.k;
                        if (t70.e(i26, 1)) {
                            int i30 = i29 | 1;
                            ArrayList arrayList10 = this.g;
                            vx vxVar9 = this.d;
                            boolean z10 = this.r;
                            long j10 = this.n;
                            PointF pointF11 = this.h;
                            arrayList10.add(vxVar9.e(z10, j10, jUptimeMillis, pointF11.x, pointF11.y, 12, 1, i30));
                            i29 = i30;
                        }
                        if (t70.e(i26, 2)) {
                            int i31 = i29 | 2;
                            ArrayList arrayList11 = this.g;
                            vx vxVar10 = this.d;
                            boolean z11 = this.r;
                            long j11 = this.o;
                            PointF pointF12 = this.h;
                            arrayList11.add(vxVar10.e(z11, j11, jUptimeMillis, pointF12.x, pointF12.y, 12, 2, i31));
                            i29 = i31;
                        }
                        if (t70.e(i26, i5)) {
                            ArrayList arrayList12 = this.g;
                            vx vxVar11 = this.d;
                            boolean z12 = this.r;
                            long j12 = this.p;
                            PointF pointF13 = this.h;
                            arrayList12.add(vxVar11.e(z12, j12, jUptimeMillis, pointF13.x, pointF13.y, 12, 4, i29 | 4));
                        }
                    }
                    ArrayList arrayList13 = this.g;
                    vx vxVar12 = this.d;
                    if (i28 == 0) {
                        boolean z13 = this.r;
                        PointF pointF14 = this.h;
                        j3 = j2;
                        arrayList13.add(vxVar12.d(z13, j3, jUptimeMillis, pointF14.x, pointF14.y, 1, i28));
                        ArrayList arrayList14 = this.g;
                        vx vxVar13 = this.d;
                        boolean z14 = this.r;
                        PointF pointF15 = this.h;
                        arrayList14.add(vxVar13.d(z14, j3, jUptimeMillis, pointF15.x, pointF15.y, 9, i28));
                        ArrayList arrayList15 = this.g;
                        vx vxVar14 = this.d;
                        boolean z15 = this.r;
                        PointF pointF16 = this.h;
                        arrayList15.add(vxVar14.d(z15, j3, jUptimeMillis, pointF16.x, pointF16.y, 7, i28));
                        this.u = true;
                        i6 = i28;
                        obj = arrayList15;
                    } else {
                        j3 = j2;
                        boolean z16 = this.r;
                        PointF pointF17 = this.h;
                        i6 = i28;
                        arrayList13.add(vxVar12.d(z16, j3, jUptimeMillis, pointF17.x, pointF17.y, 2, i28));
                        obj = arrayList13;
                    }
                }
                this.k = i6;
                F = obj;
                str4 = str;
            } else {
                j3 = j2;
            }
        } else if (i3 == 0) {
            int i32 = this.s;
            int i33 = this.k;
            if (i32 == 2) {
                if (i33 == 0) {
                    if (!this.u) {
                        d(hm0.mop_hover_enter, f, f2);
                        this.u = true;
                    }
                    d(hm0.mop_hover_move, f, f2);
                } else {
                    d(hm0.mop_move, f, f2);
                }
                str4 = "inject exception: ";
                z70Var = z70Var;
                j3 = j5;
                c = 0;
                F = str5;
            } else {
                if (i33 == 0) {
                    if (this.u) {
                        j3 = j5;
                        c = 0;
                    } else {
                        ArrayList arrayList16 = this.g;
                        j3 = j5;
                        vx vxVar15 = this.d;
                        boolean z17 = this.r;
                        PointF pointF18 = this.h;
                        c = 0;
                        arrayList16.add(vxVar15.d(z17, j3, jUptimeMillis, pointF18.x, pointF18.y, 9, i33));
                        this.u = true;
                    }
                    ArrayList arrayList17 = this.g;
                    vx vxVar16 = this.d;
                    boolean z18 = this.r;
                    PointF pointF19 = this.h;
                    arrayList17.add(vxVar16.d(z18, j3, jUptimeMillis, pointF19.x, pointF19.y, 7, this.k));
                } else {
                    j3 = j5;
                    c = 0;
                    ArrayList arrayList18 = this.g;
                    vx vxVar17 = this.d;
                    boolean z19 = this.r;
                    PointF pointF20 = this.h;
                    arrayList18.add(vxVar17.d(z19, j3, jUptimeMillis, pointF20.x, pointF20.y, 2, i33));
                }
                str4 = "inject exception: ";
                z70Var = z70Var;
                F = str5;
            }
        } else {
            c = 0;
            str4 = "inject exception: ";
            z70Var = z70Var;
            j3 = j5;
        }
        if (i3 != 0) {
            F = i5;
            str4 = str;
            F = str5;
            int i34 = this.s;
            int i35 = this.k;
            if (i34 != 2) {
                ArrayList arrayList19 = this.g;
                vx vxVar18 = this.d;
                if (i35 == 0) {
                    boolean z20 = this.r;
                    PointF pointF21 = this.h;
                    arrayList19.add(vxVar18.d(z20, j3, jUptimeMillis, pointF21.x, pointF21.y, 7, i35));
                } else {
                    boolean z21 = this.r;
                    PointF pointF22 = this.h;
                    arrayList19.add(vxVar18.d(z21, j3, jUptimeMillis, pointF22.x, pointF22.y, 2, i35));
                }
            } else if (i35 == 0) {
                d(hm0.mop_hover_move, f, f2);
            } else {
                d(hm0.mop_move, f, f2);
            }
            byte b = i3 > 0 ? (byte) 1065353216 : (byte) -1082130432;
            float f5 = 0.0f;
            F = b;
            if ((nm0Var.c & 1024) != 1024) {
                f5 = b == true ? 1 : 0;
                F = 0;
            }
            if (this.s == 2) {
                hm0 hm0Var4 = hm0.mop_scroll;
                e7 e7Var = this.t;
                e7Var.d = hm0Var4;
                e7Var.n[c] = f;
                e7Var.o[c] = f2;
                e7Var.j = F == true ? 1.0f : 0.0f;
                e7Var.k = f5;
                u(e7Var);
            } else {
                ArrayList arrayList20 = this.g;
                vx vxVar19 = this.d;
                boolean z22 = this.r;
                PointF pointF23 = this.h;
                float f6 = pointF23.x;
                float f7 = pointF23.y;
                long j13 = j3;
                int i36 = this.k;
                synchronized (vxVar19) {
                    MotionEvent.PointerCoords pointerCoords = vxVar19.c;
                    MotionEvent.PointerProperties pointerProperties = vxVar19.a;
                    try {
                        if (z22) {
                            vx.i(pointerCoords, pointerProperties, 0, 1, f6, f7, 1.0f);
                            vx.a(vxVar19.c, F == true ? 1.0f : 0.0f, f5);
                            F = vxVar19.g(8, i36, j13, jUptimeMillis);
                        } else {
                            vx.h(pointerCoords, pointerProperties, 8, f6, f7);
                            vx.a(vxVar19.c, F == true ? 1.0f : 0.0f, f5);
                            F = vxVar19.f(8, i36, j13, jUptimeMillis);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList20.add(F);
            }
        }
        try {
            F = i5;
            str4 = str;
            F = str5;
            int size2 = this.g.size();
            try {
                if (size2 != 1) {
                    z70 z70Var2 = z70Var;
                    i14 = 0;
                    if (size2 > 1) {
                        MotionEvent[] motionEventArr = new MotionEvent[size2];
                        this.g.toArray(motionEventArr);
                        zF = z70Var2.f(motionEventArr);
                    }
                    arrayList = this.g;
                    size = arrayList.size();
                    while (i14 < size) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        ((MotionEvent) obj2).recycle();
                    }
                    z = zF;
                    this.i.set(this.h);
                    return z;
                }
                i14 = 0;
                z70Var.c((MotionEvent) this.g.get(0));
                zF = false;
                arrayList = this.g;
                size = arrayList.size();
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    ((MotionEvent) obj3).recycle();
                }
                z = zF;
            } catch (Throwable th2) {
                th = th2;
                r2 = F;
                try {
                    this.c.a(str4 + th.getMessage());
                    ArrayList arrayList21 = this.g;
                    int size3 = arrayList21.size();
                    int i37 = 0;
                    while (i37 < size3) {
                        Object obj4 = arrayList21.get(i37);
                        i37++;
                        ((MotionEvent) obj4).recycle();
                    }
                    z = false;
                } catch (Throwable th3) {
                    ?? r3 = this.g;
                    int size4 = r3.size();
                    for (?? r4 = r2; r4 < size4; r4++) {
                        ((MotionEvent) r3.get(r4)).recycle();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            r2 = 0;
        }
        this.i.set(this.h);
        return z;
    }

    @Override // defpackage.ad0
    public final boolean c(String str) {
        z70 z70Var = this.e;
        if (z70Var == null) {
            return false;
        }
        return z70Var.e(str);
    }

    public final void d(hm0 hm0Var, float f, float f2) {
        e7 e7Var = this.t;
        e7Var.d = hm0Var;
        e7Var.n[0] = f;
        e7Var.o[0] = f2;
        e7Var.j = 0.0f;
        e7Var.k = 0.0f;
        u(e7Var);
    }

    @Override // defpackage.ad0
    public final boolean o(byte b, int i, de0 de0Var, int i2) {
        int i3;
        KeyCharacterMap keyCharacterMapLoad;
        z70 z70Var = this.e;
        if (z70Var != null) {
            int[] iArrS = q51.s(3);
            int length = iArrS.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i3 = 0;
                    break;
                }
                i3 = iArrS[i4];
                if (q51.r(i3) == b) {
                    break;
                }
                i4++;
            }
            if (i3 != 0) {
                int iR = q51.r(i3);
                if (iR == 0) {
                    int i5 = be0.a.b.get(i, 0);
                    if (i5 != 0) {
                        return a(z70Var, (de0Var.c & 8) == 8 ? 1 : 0, i5);
                    }
                } else {
                    if (iR != 1) {
                        if (iR == 2 && (de0Var.c & 8) != 8) {
                            return z70Var.i(i2);
                        }
                        return false;
                    }
                    String strI = ec1.i(i2);
                    if (!strI.isEmpty()) {
                        Method method = vx.g;
                        try {
                            keyCharacterMapLoad = KeyCharacterMap.load(-1);
                        } catch (Throwable unused) {
                            keyCharacterMapLoad = null;
                        }
                        KeyEvent[] events = keyCharacterMapLoad != null ? keyCharacterMapLoad.getEvents(strI.toCharArray()) : null;
                        if (events != null) {
                            ArrayList arrayList = new ArrayList();
                            for (KeyEvent keyEvent : events) {
                                int action = keyEvent.getAction();
                                int keyCode = keyEvent.getKeyCode();
                                if (action == 0 || action == 1) {
                                    if (keyCode == 59 || keyCode == 60) {
                                        if ((this.l & 1048769) == 0) {
                                            arrayList.add(keyEvent);
                                        }
                                    } else if (keyCode == 57 || keyCode == 58) {
                                        if ((this.l & 50) == 0) {
                                            arrayList.add(keyEvent);
                                        }
                                    } else if (keyCode != 117 && keyCode != 118) {
                                        arrayList.add(keyEvent);
                                    } else if ((this.l & 458752) == 0) {
                                        arrayList.add(keyEvent);
                                    }
                                }
                            }
                            if (arrayList.size() == 2) {
                                KeyEvent keyEvent2 = (KeyEvent) arrayList.get(0);
                                KeyEvent keyEvent3 = (KeyEvent) arrayList.get(1);
                                if (keyEvent2.getKeyCode() == keyEvent3.getKeyCode() && keyEvent2.getAction() == 0 && keyEvent3.getAction() == 1 && keyEvent2.isPrintingKey()) {
                                    return (de0Var.c & 8) == 8 ? a(z70Var, keyEvent3.getAction(), keyEvent3.getKeyCode()) : a(z70Var, keyEvent2.getAction(), keyEvent2.getKeyCode());
                                }
                            }
                        }
                        if ((de0Var.c & 8) == 8) {
                            return false;
                        }
                        return z70Var.i(i2);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ad0
    public final void t() {
        z70 z70Var = this.e;
        if (z70Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a(z70Var, 1, ((Integer) obj).intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    @Override // defpackage.ad0
    public final boolean u(e7 e7Var) {
        boolean z;
        long j;
        int i;
        boolean z2;
        String str;
        MotionEvent motionEventC;
        String str2;
        z70 z70Var = this.e;
        if (z70Var != null) {
            hm0 hm0Var = e7Var.d;
            int i2 = e7Var.l.d;
            float[] fArr = e7Var.o;
            float[] fArr2 = e7Var.n;
            byte b = e7Var.g;
            int i3 = e7Var.i;
            km0 km0Var = e7Var.a;
            if (hm0Var != hm0.mop_none) {
                if (km0Var == km0.msrcc_pointer && t70.e(i3, cm0.maf_axis_x.c) && t70.e(i3, cm0.maf_axis_y.c)) {
                    for (int i4 = 0; i4 < b; i4++) {
                        float f = fArr2[i4];
                        float f2 = fArr[i4];
                        PointF pointF = this.j;
                        pointF.set(f, f2);
                        MainApplication.v().S(pointF);
                        fArr2[i4] = pointF.x;
                        fArr[i4] = pointF.y;
                    }
                }
                if (e7Var.d == hm0.mop_hover_enter) {
                    this.u = true;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iOrdinal = e7Var.d.ordinal();
                if (iOrdinal == 1) {
                    z = false;
                    this.m = jUptimeMillis;
                    j = jUptimeMillis;
                } else if (iOrdinal == 2 || iOrdinal == 3) {
                    z = false;
                    j = this.m;
                    this.m = 0L;
                } else if (iOrdinal == 7) {
                    z = false;
                    this.m = jUptimeMillis;
                    j = jUptimeMillis;
                } else if (iOrdinal == 8) {
                    z = false;
                    j = this.m;
                    this.m = 0L;
                } else if (iOrdinal == 11) {
                    z = false;
                    this.m = jUptimeMillis;
                    j = jUptimeMillis;
                } else if (iOrdinal != 12) {
                    z = false;
                    j = this.m;
                } else {
                    z = false;
                    j = this.m;
                    this.m = 0L;
                }
                hm0 hm0Var2 = e7Var.d;
                if (hm0Var2 == hm0.mop_btn_press) {
                    this.k = i2 | this.k;
                } else if (hm0Var2 == hm0.mop_btn_release) {
                    this.k = (~i2) & this.k;
                }
                if (j == 0) {
                    j = jUptimeMillis;
                }
                int i5 = km0Var.d | e7Var.b.d;
                int i6 = hm0Var2.d;
                ui0 ui0Var = this.q;
                Hashtable hashtable = (Hashtable) ui0Var.d;
                lm0 lm0Var = (lm0) hashtable.get(Integer.valueOf(i5));
                if (lm0Var == null) {
                    lm0Var = new lm0(i5);
                    hashtable.put(Integer.valueOf(i5), lm0Var);
                }
                int i7 = lm0Var.b;
                int i8 = lm0Var.c;
                String str3 = "";
                switch (hm0Var2.ordinal()) {
                    case 0:
                        j = j;
                        i = i7;
                        i8 = i8;
                        z2 = true;
                        break;
                    case 1:
                        j = j;
                        i = i7;
                        z2 = false;
                        i7 = 1;
                        i8 = 1;
                        i8 = 3;
                        break;
                    case 2:
                        if (i7 != 1) {
                            str3 = "unexpected op";
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i = i7;
                        i8 = 3;
                        i8 = 1;
                        break;
                    case 3:
                        i = 1;
                        z2 = false;
                        i8 = 3;
                        i8 = 1;
                        break;
                    case 4:
                    case 11:
                    case 12:
                        i = i7;
                        z2 = false;
                        i8 = 3;
                        break;
                    case 5:
                        i7++;
                        i = i7;
                        z2 = false;
                        i8 = 3;
                        break;
                    case 6:
                        j = j;
                        i = i7 - 1;
                        if (i < 1) {
                            str3 = "unexpected op";
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i8 = 3;
                        break;
                    case 7:
                        j = j;
                        i = i7;
                        z2 = false;
                        i7 = 1;
                        i8 = 1;
                        i8 = 2;
                        break;
                    case 8:
                        j = j;
                        i = i7;
                        z2 = false;
                        i7 = 1;
                        i8 = 2;
                        i8 = 1;
                        break;
                    case 9:
                        j = j;
                        i = i7;
                        i8 = i8;
                        z2 = false;
                        i7 = 1;
                        i8 = 2;
                        break;
                    case 10:
                    default:
                        j = j;
                        i = i7;
                        i8 = i8;
                        z2 = false;
                        break;
                }
                if (!z2 && b != i7) {
                    str3 = "unexpected pointer count";
                    z2 = true;
                }
                if (z2 || lm0Var.c == i8) {
                    str = str3;
                } else {
                    str = "unexpected op";
                    z2 = true;
                }
                if (z2) {
                    Logging logging = (Logging) ui0Var.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" src=");
                    sb.append(lm0Var.a);
                    sb.append(" state=");
                    int i9 = lm0Var.c;
                    if (i9 == 1) {
                        str2 = "msNone";
                    } else if (i9 != 2) {
                        str2 = i9 != 3 ? "null" : "msGesture";
                    } else {
                        str2 = "msHovering";
                    }
                    sb.append(str2);
                    sb.append(" op=");
                    sb.append(hm0Var2);
                    sb.append(" pc=");
                    sb.append((int) b);
                    sb.append(" expectedPC=");
                    sb.append(i7);
                    logging.a(sb.toString());
                    lm0Var.b = 1;
                    lm0Var.c = 1;
                    lm0 lm0Var2 = (lm0) ((Hashtable) ui0Var.d).get(Integer.valueOf(i5));
                    int i10 = lm0Var2 == null ? 1 : lm0Var2.c;
                    if (i10 == 2) {
                        motionEventC = this.d.c(j, jUptimeMillis, i5, 10, e7Var.e, e7Var.g, e7Var.j, e7Var.k, this.k, e7Var.m, e7Var.n, e7Var.o);
                    } else {
                        motionEventC = i10 == 3 ? this.d.c(j, jUptimeMillis, i5, 3, e7Var.e, e7Var.g, e7Var.j, e7Var.k, this.k, e7Var.m, e7Var.n, e7Var.o) : null;
                    }
                } else {
                    lm0Var.b = i;
                    lm0Var.c = i8;
                    motionEventC = this.d.c(j, jUptimeMillis, i5, i6, e7Var.e, e7Var.g, e7Var.j, e7Var.k, this.k, e7Var.m, e7Var.n, e7Var.o);
                }
                MotionEvent motionEvent = motionEventC;
                if (motionEvent == null) {
                    return z;
                }
                try {
                    z70Var.c(motionEvent);
                    motionEvent.recycle();
                    return z;
                } catch (Throwable th) {
                    try {
                        this.c.a("inject exception: " + th.getMessage());
                        return z;
                    } finally {
                        motionEvent.recycle();
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ad0
    public final void x() {
        this.h.set(0.0f, 0.0f);
        this.i.set(0.0f, 0.0f);
        this.k = 0;
        this.l = 0;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
        this.u = false;
        ((Hashtable) this.q.d).clear();
    }
}
