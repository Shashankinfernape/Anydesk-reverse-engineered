package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu0 {
    public static int a = 4238;
    public static final y6 d;
    public static y6 e;
    public static Field g;
    public static boolean h;
    public static Method i;
    public static boolean j;
    public static Field k;
    public static boolean l;
    public static final Object b = new Object();
    public static final hg c = new hg();
    public static final bx f = new bx("NO_VALUE", 2);

    static {
        Object obj = null;
        d = new y6(obj, obj, obj, 17);
    }

    public static void C(ac acVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            nd0.N(acVar, z);
            return;
        }
        if (!l) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            l = true;
        }
        Field field = k;
        if (field != null) {
            try {
                field.set(acVar, Boolean.valueOf(z));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void D(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            wa1.a(view, charSequence);
            return;
        }
        ya1 ya1Var = ya1.m;
        if (ya1Var != null && ya1Var.c == view) {
            ya1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ya1(view, charSequence);
            return;
        }
        ya1 ya1Var2 = ya1.n;
        if (ya1Var2 != null && ya1Var2.c == view) {
            ya1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void E(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            nd0.P(popupWindow, i2);
            return;
        }
        if (!j) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            j = true;
        }
        Method method = i;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void F(ByteBuffer byteBuffer, long j2) {
        e(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j2 >= 0 && j2 <= 4294967295L) {
            byteBuffer.putInt(iPosition, (int) j2);
        } else {
            throw new IllegalArgumentException("uint32 value of out range: " + j2);
        }
    }

    public static final boolean G(vf1 vf1Var, vf1 vf1Var2, xg0 xg0Var) {
        vf1Var.getClass();
        if (vf1Var2 == null) {
            return true;
        }
        if ((vf1Var2 instanceof uf1) && (vf1Var instanceof tf1)) {
            return true;
        }
        if ((vf1Var instanceof uf1) && (vf1Var2 instanceof tf1)) {
            return false;
        }
        return (vf1Var.c == vf1Var2.c && vf1Var.d == vf1Var2.d && vf1Var2.a(xg0Var) <= vf1Var.a(xg0Var)) ? false : true;
    }

    public static void H(int i2, sp spVar, bq bqVar, boolean z) {
        float f2 = bqVar.d0;
        np npVar = bqVar.I;
        int iD = npVar.f.d();
        np npVar2 = bqVar.K;
        int iD2 = npVar2.f.d();
        int iE = npVar.e() + iD;
        int iE2 = iD2 - npVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = bqVar.q();
        int i3 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i3 = (iD - iD2) - iQ;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iQ;
        if (iD > iD2) {
            i5 = i4 - iQ;
        }
        bqVar.J(i4, i5);
        t(i2 + 1, spVar, bqVar, z);
    }

    public static void I(int i2, bq bqVar, sp spVar, bq bqVar2, boolean z) {
        float f2 = bqVar2.d0;
        np npVar = bqVar2.I;
        int iE = npVar.e() + npVar.f.d();
        np npVar2 = bqVar2.K;
        int iD = npVar2.f.d() - npVar2.e();
        if (iD >= iE) {
            int iQ = bqVar2.q();
            if (bqVar2.g0 != 8) {
                int i3 = bqVar2.r;
                if (i3 == 2) {
                    iQ = (int) (bqVar2.d0 * 0.5f * (bqVar instanceof cq ? bqVar.q() : bqVar.T.q()));
                } else if (i3 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(bqVar2.u, iQ);
                int i4 = bqVar2.v;
                if (i4 > 0) {
                    iQ = Math.min(i4, iQ);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            bqVar2.J(i5, iQ + i5);
            t(i2 + 1, spVar, bqVar2, z);
        }
    }

    public static void J(int i2, sp spVar, bq bqVar) {
        float f2 = bqVar.e0;
        np npVar = bqVar.J;
        int iD = npVar.f.d();
        np npVar2 = bqVar.L;
        int iD2 = npVar2.f.d();
        int iE = npVar.e() + iD;
        int iE2 = iD2 - npVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = bqVar.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        bqVar.K(i5, i6);
        N(i2 + 1, spVar, bqVar);
    }

    public static void K(int i2, bq bqVar, sp spVar, bq bqVar2) {
        float f2 = bqVar2.e0;
        np npVar = bqVar2.J;
        int iE = npVar.e() + npVar.f.d();
        np npVar2 = bqVar2.L;
        int iD = npVar2.f.d() - npVar2.e();
        if (iD >= iE) {
            int iK = bqVar2.k();
            if (bqVar2.g0 != 8) {
                int i3 = bqVar2.s;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (bqVar instanceof cq ? bqVar.k() : bqVar.T.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(bqVar2.x, iK);
                int i4 = bqVar2.y;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            bqVar2.K(i5, iK + i5);
            N(i2 + 1, spVar, bqVar2);
        }
    }

    public static final Object L(m01 m01Var, boolean z, m01 m01Var2, d60 d60Var) throws Throwable {
        Object onVar;
        Object objE0;
        Object objQ;
        try {
            ec1.g(2, d60Var);
            onVar = d60Var.f(m01Var2, m01Var);
        } catch (ou e2) {
            Throwable th = e2.c;
            on onVar2 = new on(th, false);
            do {
                objE0 = m01Var.e0(m01Var.J(), onVar2);
                if (objE0 == ds.c || objE0 == ds.d) {
                }
                throw th;
            } while (objE0 == ds.e);
            m01Var.u(objE0);
            throw th;
        } catch (Throwable th2) {
            onVar = new on(th2, false);
        }
        lr lrVar = lr.c;
        if (onVar == lrVar || (objQ = m01Var.Q(onVar)) == ds.d) {
            return lrVar;
        }
        m01Var.j0();
        if (!(objQ instanceof on)) {
            return ds.G(objQ);
        }
        if (!z) {
            Throwable th3 = ((on) objQ).a;
            if ((th3 instanceof ba1) && ((ba1) th3).c == m01Var) {
                if (onVar instanceof on) {
                    throw ((on) onVar).a;
                }
                return onVar;
            }
        }
        throw ((on) objQ).a;
    }

    public static final long M(long j2) {
        int i2 = yv.e;
        boolean z = j2 > 0;
        if (!z) {
            if (z) {
                throw new pn();
            }
            return 0L;
        }
        long jV = hq.V(999999L, aw.NANOSECONDS);
        if (yv.c(j2)) {
            if (yv.c(jV) && (jV ^ j2) < 0) {
                id.q("Summing infinite durations of different signs yields an undefined result.");
                return 0L;
            }
        } else if (yv.c(jV)) {
            j2 = jV;
        } else {
            int i3 = ((int) j2) & 1;
            if (i3 == (((int) jV) & 1)) {
                long j3 = (j2 >> 1) + (jV >> 1);
                if (i3 == 0) {
                    if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                        j2 = hq.o(j3 / 1000000);
                    } else {
                        j2 = j3 << 1;
                        int i4 = zv.a;
                    }
                } else if (-4611686018426L > j3 || j3 >= 4611686018427L) {
                    j2 = hq.o(th1.i(j3));
                } else {
                    j2 = (j3 * 1000000) << 1;
                    int i5 = zv.a;
                }
            } else {
                j2 = i3 == 1 ? yv.a(j2 >> 1, jV >> 1) : yv.a(jV >> 1, j2 >> 1);
            }
        }
        return ((((int) j2) & 1) != 1 || yv.c(j2)) ? yv.d(j2, aw.MILLISECONDS) : j2 >> 1;
    }

    public static void N(int i2, sp spVar, bq bqVar) {
        np npVar;
        np npVar2;
        np npVar3;
        np npVar4;
        if (bqVar.n) {
            return;
        }
        if (!(bqVar instanceof cq) && bqVar.z() && f(bqVar)) {
            cq.V(bqVar, spVar, new hg());
        }
        np npVarI = bqVar.i(3);
        np npVarI2 = bqVar.i(5);
        int iD = npVarI.d();
        int iD2 = npVarI2.d();
        HashSet<np> hashSet = npVarI.a;
        if (hashSet != null && npVarI.c) {
            for (np npVar5 : hashSet) {
                bq bqVar2 = npVar5.d;
                int i3 = i2 + 1;
                boolean zF = f(bqVar2);
                np npVar6 = bqVar2.J;
                np npVar7 = bqVar2.L;
                if (bqVar2.z() && zF) {
                    cq.V(bqVar2, spVar, new hg());
                }
                boolean z = (npVar5 == npVar6 && (npVar4 = npVar7.f) != null && npVar4.c) || (npVar5 == npVar7 && (npVar3 = npVar6.f) != null && npVar3.c);
                int i4 = bqVar2.p0[1];
                if (i4 != 3 || zF) {
                    if (!bqVar2.z()) {
                        if (npVar5 == npVar6 && npVar7.f == null) {
                            int iE = npVar6.e() + iD;
                            bqVar2.K(iE, bqVar2.k() + iE);
                            N(i3, spVar, bqVar2);
                        } else if (npVar5 == npVar7 && npVar6.f == null) {
                            int iE2 = iD - npVar7.e();
                            bqVar2.K(iE2 - bqVar2.k(), iE2);
                            N(i3, spVar, bqVar2);
                        } else if (z && !bqVar2.y()) {
                            J(i3, spVar, bqVar2);
                        }
                    }
                } else if (i4 == 3 && bqVar2.y >= 0 && bqVar2.x >= 0 && (bqVar2.g0 == 8 || (bqVar2.s == 0 && bqVar2.W == 0.0f))) {
                    if (!bqVar2.y() && !bqVar2.F && z && !bqVar2.y()) {
                        K(i3, bqVar, spVar, bqVar2);
                    }
                }
            }
        }
        char c2 = 1;
        if (bqVar instanceof k70) {
            return;
        }
        HashSet<np> hashSet2 = npVarI2.a;
        if (hashSet2 != null && npVarI2.c) {
            for (np npVar8 : hashSet2) {
                bq bqVar3 = npVar8.d;
                int i5 = i2 + 1;
                boolean zF2 = f(bqVar3);
                np npVar9 = bqVar3.J;
                np npVar10 = bqVar3.L;
                if (bqVar3.z() && zF2) {
                    cq.V(bqVar3, spVar, new hg());
                }
                boolean z2 = (npVar8 == npVar9 && (npVar2 = npVar10.f) != null && npVar2.c) || (npVar8 == npVar10 && (npVar = npVar9.f) != null && npVar.c);
                int i6 = bqVar3.p0[1];
                if (i6 != 3 || zF2) {
                    if (!bqVar3.z()) {
                        if (npVar8 == npVar9 && npVar10.f == null) {
                            int iE3 = npVar9.e() + iD2;
                            bqVar3.K(iE3, bqVar3.k() + iE3);
                            N(i5, spVar, bqVar3);
                        } else if (npVar8 == npVar10 && npVar9.f == null) {
                            int iE4 = iD2 - npVar10.e();
                            bqVar3.K(iE4 - bqVar3.k(), iE4);
                            N(i5, spVar, bqVar3);
                        } else if (z2 && !bqVar3.y()) {
                            J(i5, spVar, bqVar3);
                        }
                    }
                } else if (i6 == 3 && bqVar3.y >= 0 && bqVar3.x >= 0 && (bqVar3.g0 == 8 || (bqVar3.s == 0 && bqVar3.W == 0.0f))) {
                    if (!bqVar3.y() && !bqVar3.F && z2 && !bqVar3.y()) {
                        K(i5, bqVar, spVar, bqVar3);
                    }
                }
            }
        }
        np npVarI3 = bqVar.i(6);
        if (npVarI3.a != null && npVarI3.c) {
            int iD3 = npVarI3.d();
            for (np npVar11 : npVarI3.a) {
                bq bqVar4 = npVar11.d;
                int i7 = i2 + 1;
                boolean zF3 = f(bqVar4);
                np npVar12 = bqVar4.M;
                if (bqVar4.z() && zF3) {
                    cq.V(bqVar4, spVar, new hg());
                }
                if (bqVar4.p0[c2] != 3 || zF3) {
                    if (bqVar4.z()) {
                        continue;
                    } else if (npVar11 == npVar12) {
                        int iE5 = npVar11.e() + iD3;
                        if (bqVar4.E) {
                            int i8 = iE5 - bqVar4.a0;
                            int i9 = bqVar4.V + i8;
                            bqVar4.Z = i8;
                            bqVar4.J.l(i8);
                            bqVar4.L.l(i9);
                            npVar12.l(iE5);
                            bqVar4.l = true;
                        }
                        N(i7, spVar, bqVar4);
                    }
                }
                c2 = 1;
            }
        }
        bqVar.n = true;
    }

    public static final v41 a(int i2, int i3, oh ohVar) {
        if (i2 < 0) {
            nh0.e(gr0.e(i2, "replay cannot be negative, but was "));
            return null;
        }
        if (i3 < 0) {
            nh0.e(gr0.e(i3, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i2 <= 0 && i3 <= 0 && ohVar != oh.c) {
            nh0.i(ohVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new v41(i2, i4, ohVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(aa1 aa1Var, e60 e60Var, Throwable th, sq sqVar) {
        e20 e20Var;
        if (sqVar instanceof e20) {
            e20Var = (e20) sqVar;
            int i2 = e20Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e20Var.h = i2 - Integer.MIN_VALUE;
            } else {
                e20Var = new e20(sqVar);
            }
        } else {
            e20Var = new e20(sqVar);
        }
        Object obj = e20Var.g;
        int i3 = e20Var.h;
        try {
            if (i3 == 0) {
                y90.V(obj);
                e20Var.f = th;
                e20Var.h = 1;
                Object objC = e60Var.c(aa1Var, th, e20Var);
                Object obj2 = lr.c;
                if (objC == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = e20Var.f;
                y90.V(obj);
            }
            return uc1.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                th1.a(th2, th);
            }
            throw th2;
        }
    }

    public static final void c(Object[] objArr, long j2, Object obj) {
        objArr[(objArr.length - 1) & ((int) j2)] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028a  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x036d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0387  */
    /* JADX WARN: Code duplicated, block: B:237:0x038c  */
    /* JADX WARN: Code duplicated, block: B:241:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:251:0x041c  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:408:0x0687  */
    /* JADX WARN: Code duplicated, block: B:411:0x0692  */
    /* JADX WARN: Code duplicated, block: B:412:0x0695  */
    /* JADX WARN: Code duplicated, block: B:415:0x069b  */
    /* JADX WARN: Code duplicated, block: B:416:0x069e  */
    /* JADX WARN: Code duplicated, block: B:418:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:420:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:423:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:425:0x06b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:435:0x06d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    public static void d(cq cqVar, xf0 xf0Var, ArrayList arrayList, int i2) {
        int i3;
        vj[] vjVarArr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        bq bqVar;
        xf0 xf0Var2;
        bq bqVar2;
        r51 r51Var;
        np npVar;
        r51 r51Var2;
        bq bqVar3;
        np[] npVarArr;
        np npVar2;
        r51 r51Var3;
        int i7;
        np[] npVarArr2;
        int i8;
        np npVar3;
        np npVar4;
        r51 r51Var4;
        np npVar5;
        r51 r51Var5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        r51 r51Var6;
        r51 r51Var7;
        r51 r51Var8;
        r51 r51Var9;
        yd ydVarL;
        np npVar6;
        bq bqVar4;
        int i12;
        int i13;
        bq bqVar5;
        cq cqVar2 = cqVar;
        if (i2 == 0) {
            i3 = cqVar2.z0;
            vjVarArr = cqVar2.C0;
            i4 = 0;
        } else {
            i3 = cqVar2.A0;
            vjVarArr = cqVar2.B0;
            i4 = 2;
        }
        int i14 = i3;
        vj[] vjVarArr2 = vjVarArr;
        int i15 = 0;
        while (i15 < i14) {
            vj vjVar = vjVarArr2[i15];
            boolean z4 = vjVar.q;
            bq bqVar6 = vjVar.a;
            np[] npVarArr3 = bqVar6.Q;
            int i16 = 3;
            int i17 = 8;
            float f2 = 0.0f;
            if (z4) {
                i5 = i15;
            } else {
                int i18 = vjVar.l;
                int i19 = i18 * 2;
                bq bqVar7 = bqVar6;
                bq bqVar8 = bqVar7;
                boolean z5 = false;
                while (!z5) {
                    vjVar.i++;
                    bq[] bqVarArr = bqVar7.m0;
                    np[] npVarArr4 = bqVar7.Q;
                    bqVarArr[i18] = null;
                    bqVar7.l0[i18] = null;
                    if (bqVar7.g0 != i17) {
                        bqVar7.j(i18);
                        npVarArr4[i19].e();
                        int i20 = i19 + 1;
                        npVarArr4[i20].e();
                        npVarArr4[i19].e();
                        npVarArr4[i20].e();
                        if (vjVar.b == null) {
                            vjVar.b = bqVar7;
                        }
                        vjVar.d = bqVar7;
                        int i21 = bqVar7.p0[i18];
                        if (i21 == i16) {
                            int i22 = bqVar7.t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                vjVar.j++;
                                float f3 = bqVar7.k0[i18];
                                if (f3 > 0.0f) {
                                    vjVar.k += f3;
                                }
                                i13 = i18;
                                if (bqVar7.g0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f3 < 0.0f) {
                                        vjVar.n = true;
                                    } else {
                                        vjVar.o = true;
                                    }
                                    if (vjVar.h == null) {
                                        vjVar.h = new ArrayList();
                                    }
                                    vjVar.h.add(bqVar7);
                                }
                                if (vjVar.f == null) {
                                    vjVar.f = bqVar7;
                                }
                                bq bqVar9 = vjVar.g;
                                if (bqVar9 != null) {
                                    bqVar9.l0[i13] = bqVar7;
                                }
                                vjVar.g = bqVar7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (bqVar7.r == 0 && bqVar7.u == 0) {
                                    int i23 = bqVar7.v;
                                }
                            } else if (bqVar7.s == 0 && bqVar7.x == 0) {
                                int i24 = bqVar7.y;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    bq bqVar10 = bqVar8;
                    if (bqVar10 != bqVar7) {
                        bqVar10.m0[i13] = bqVar7;
                    }
                    np npVar7 = npVarArr4[i19 + 1].f;
                    if (npVar7 != null) {
                        bqVar5 = npVar7.d;
                        np npVar8 = bqVar5.Q[i19].f;
                        if (npVar8 == null || npVar8.d != bqVar7) {
                            bqVar5 = null;
                        }
                    } else {
                        bqVar5 = null;
                    }
                    if (bqVar5 == null) {
                        bqVar5 = bqVar7;
                        z5 = true;
                    }
                    bqVar8 = bqVar7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    bqVar7 = bqVar5;
                    i15 = i15;
                }
                i5 = i15;
                int i25 = i18;
                bq bqVar11 = vjVar.b;
                if (bqVar11 != null) {
                    bqVar11.Q[i19].e();
                }
                bq bqVar12 = vjVar.d;
                if (bqVar12 != null) {
                    bqVar12.Q[i19 + 1].e();
                }
                vjVar.c = bqVar7;
                if (i25 == 0 && vjVar.m) {
                    vjVar.e = bqVar7;
                } else {
                    vjVar.e = bqVar6;
                }
                vjVar.p = vjVar.o && vjVar.n;
            }
            vjVar.q = true;
            if (arrayList == 0 || arrayList.contains(bqVar6)) {
                bq bqVar13 = vjVar.c;
                bq bqVar14 = vjVar.b;
                bq bqVar15 = vjVar.d;
                bq bqVar16 = vjVar.e;
                float f4 = vjVar.k;
                int[] iArr = cqVar2.p0;
                np[] npVarArr5 = cqVar2.Q;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i26 = bqVar16.i0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = bqVar16.j0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    np[] npVarArr6 = bqVar6.Q;
                    int[] iArr2 = bqVar6.p0;
                    np npVar9 = npVarArr6[i4];
                    int i28 = z ? 1 : 4;
                    int iE = npVar9.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && bqVar6.t[i2] == 0;
                    np npVar10 = npVar9.f;
                    if (npVar10 != null && bqVar6 != bqVar6) {
                        iE = npVar10.e() + iE;
                    }
                    int i29 = iE;
                    if (z13 && bqVar6 != bqVar6 && bqVar6 != bqVar14) {
                        i28 = 8;
                    }
                    bq bqVar17 = bqVar6;
                    np npVar11 = npVar9.f;
                    if (npVar11 != null) {
                        boolean z15 = z14;
                        r51 r51Var10 = npVar9.i;
                        r51 r51Var11 = npVar11.i;
                        if (bqVar6 == bqVar14) {
                            xf0Var.f(r51Var10, r51Var11, i29, 6);
                        } else {
                            xf0Var.f(r51Var10, r51Var11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        xf0Var.e(npVar9.i, npVar9.f.i, i29, (bqVar6 == bqVar14 && z13 && bqVar6.S[i2]) ? 5 : i28);
                    }
                    if (z12) {
                        if (bqVar6.g0 == 8 || iArr2[i2] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            xf0Var.f(npVarArr6[i4 + 1].i, npVarArr6[i4].i, 0, 5);
                        }
                        xf0Var.f(npVarArr6[i4].i, npVarArr5[i4].i, i12, 8);
                    }
                    np npVar12 = npVarArr6[i4 + 1].f;
                    if (npVar12 != null) {
                        bqVar4 = npVar12.d;
                        np npVar13 = bqVar4.Q[i4].f;
                        if (npVar13 == null || npVar13.d != bqVar6) {
                            bqVar4 = null;
                        }
                    } else {
                        bqVar4 = null;
                    }
                    if (bqVar4 != null) {
                        bqVar6 = bqVar4;
                    } else {
                        z11 = true;
                    }
                    bqVar6 = bqVar17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (bqVar15 != null) {
                    int i30 = i4 + 1;
                    if (bqVar13.Q[i30].f != null) {
                        np npVar14 = bqVar15.Q[i30];
                        if (bqVar15.p0[i2] == 3 && bqVar15.t[i2] == 0 && !z17) {
                            np npVar15 = npVar14.f;
                            if (npVar15.d == cqVar2) {
                                xf0Var.e(npVar14.i, npVar15.i, -npVar14.e(), 5);
                            } else if (z17) {
                                npVar6 = npVar14.f;
                                if (npVar6.d == cqVar2) {
                                    xf0Var.e(npVar14.i, npVar6.i, -npVar14.e(), 4);
                                }
                            }
                        } else if (z17) {
                            npVar6 = npVar14.f;
                            if (npVar6.d == cqVar2) {
                                xf0Var.e(npVar14.i, npVar6.i, -npVar14.e(), 4);
                            }
                        }
                        xf0Var.g(npVar14.i, bqVar13.Q[i30].f.i, -npVar14.e(), 6);
                    }
                }
                if (z16) {
                    int i31 = i4 + 1;
                    r51 r51Var12 = npVarArr5[i31].i;
                    np npVar16 = bqVar13.Q[i31];
                    xf0Var.f(r51Var12, npVar16.i, npVar16.e(), 8);
                }
                ArrayList arrayList3 = vjVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (vjVar.n && !vjVar.p) {
                        f4 = vjVar.j;
                    }
                    bq bqVar18 = null;
                    int i32 = 0;
                    float f5 = 0.0f;
                    while (i32 < size) {
                        bq bqVar19 = (bq) arrayList3.get(i32);
                        float[] fArr = bqVar19.k0;
                        np[] npVarArr7 = bqVar19.Q;
                        float f6 = fArr[i2];
                        if (f6 >= f2) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f6 == f2) {
                                xf0Var.e(npVarArr7[i4 + 1].i, npVarArr7[i4].i, 0, 8);
                                i10 = i32;
                                i11 = i14;
                                f5 = f5;
                            } else {
                                float f7 = f5;
                                if (bqVar18 != null) {
                                    np[] npVarArr8 = bqVar18.Q;
                                    r51Var6 = npVarArr8[i4].i;
                                    int i33 = i4 + 1;
                                    r51Var7 = npVarArr8[i33].i;
                                    r51Var8 = npVarArr7[i4].i;
                                    r51Var9 = npVarArr7[i33].i;
                                    ydVarL = xf0Var.l();
                                    ydVarL.b = 0.0f;
                                    f2 = 0.0f;
                                    if (f4 != 0.0f || f7 == f6) {
                                        i10 = i32;
                                        i11 = i14;
                                        ydVarL.d.g(r51Var6, 1.0f);
                                        ydVarL.d.g(r51Var7, -1.0f);
                                        ydVarL.d.g(r51Var9, 1.0f);
                                        ydVarL.d.g(r51Var8, -1.0f);
                                    } else {
                                        rd rdVar = ydVarL.d;
                                        if (f7 == 0.0f) {
                                            i10 = i32;
                                            rdVar.g(r51Var6, 1.0f);
                                            ydVarL.d.g(r51Var7, -1.0f);
                                            i11 = i14;
                                        } else {
                                            i10 = i32;
                                            i11 = i14;
                                            if (f6 == f2) {
                                                rdVar.g(r51Var8, 1.0f);
                                                ydVarL.d.g(r51Var9, -1.0f);
                                            } else {
                                                float f8 = (f7 / f4) / (f6 / f4);
                                                rdVar.g(r51Var6, 1.0f);
                                                ydVarL.d.g(r51Var7, -1.0f);
                                                ydVarL.d.g(r51Var9, f8);
                                                ydVarL.d.g(r51Var8, -f8);
                                            }
                                        }
                                    }
                                    xf0Var.c(ydVarL);
                                } else {
                                    i10 = i32;
                                    i11 = i14;
                                }
                                f5 = f6;
                                bqVar18 = bqVar19;
                            }
                        } else {
                            if (vjVar.p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                xf0Var.e(npVarArr7[i4 + 1].i, npVarArr7[i4].i, 0, 4);
                            } else {
                                f6 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f6 == f2) {
                                    xf0Var.e(npVarArr7[i4 + 1].i, npVarArr7[i4].i, 0, 8);
                                } else {
                                    float f9 = f5;
                                    if (bqVar18 != null) {
                                        np[] npVarArr9 = bqVar18.Q;
                                        r51Var6 = npVarArr9[i4].i;
                                        int i34 = i4 + 1;
                                        r51Var7 = npVarArr9[i34].i;
                                        r51Var8 = npVarArr7[i4].i;
                                        r51Var9 = npVarArr7[i34].i;
                                        ydVarL = xf0Var.l();
                                        ydVarL.b = 0.0f;
                                        f2 = 0.0f;
                                        if (f4 != 0.0f) {
                                            i10 = i32;
                                            i11 = i14;
                                            ydVarL.d.g(r51Var6, 1.0f);
                                            ydVarL.d.g(r51Var7, -1.0f);
                                            ydVarL.d.g(r51Var9, 1.0f);
                                            ydVarL.d.g(r51Var8, -1.0f);
                                        } else {
                                            i10 = i32;
                                            i11 = i14;
                                            ydVarL.d.g(r51Var6, 1.0f);
                                            ydVarL.d.g(r51Var7, -1.0f);
                                            ydVarL.d.g(r51Var9, 1.0f);
                                            ydVarL.d.g(r51Var8, -1.0f);
                                        }
                                        xf0Var.c(ydVarL);
                                    } else {
                                        i10 = i32;
                                        i11 = i14;
                                    }
                                    f5 = f6;
                                    bqVar18 = bqVar19;
                                }
                            }
                            i10 = i32;
                            i11 = i14;
                            f5 = f5;
                        }
                        i32 = i10 + 1;
                        i14 = i11;
                        arrayList3 = arrayList2;
                        size = i9;
                    }
                }
                i6 = i14;
                if (bqVar14 == null || !(bqVar14 == bqVar15 || z17)) {
                    bqVar = bqVar15;
                    if (z2 && bqVar14 != null) {
                        int i35 = vjVar.j;
                        boolean z18 = i35 > 0 && vjVar.i == i35;
                        bq bqVar20 = bqVar14;
                        bq bqVar21 = bqVar20;
                        while (true) {
                            np[] npVarArr10 = bqVar21.Q;
                            if (bqVar20 == null) {
                                break;
                            }
                            np[] npVarArr11 = bqVar20.Q;
                            bq bqVar22 = bqVar20.m0[i2];
                            while (bqVar22 != null && bqVar22.g0 == 8) {
                                bqVar22 = bqVar22.m0[i2];
                            }
                            if (bqVar22 != null || bqVar20 == bqVar) {
                                np npVar17 = npVarArr11[i4];
                                r51 r51Var13 = npVar17.i;
                                np npVar18 = npVar17.f;
                                r51 r51Var14 = npVar18 != null ? npVar18.i : null;
                                if (bqVar21 != bqVar20) {
                                    r51Var14 = npVarArr10[i4 + 1].i;
                                } else if (bqVar20 == bqVar14) {
                                    np npVar19 = npVarArr3[i4].f;
                                    r51Var14 = npVar19 != null ? npVar19.i : null;
                                }
                                int iE2 = npVar17.e();
                                int i36 = i4 + 1;
                                int iE3 = npVarArr11[i36].e();
                                if (bqVar22 != null) {
                                    npVar2 = bqVar22.Q[i4];
                                    npVarArr = npVarArr10;
                                    r51Var3 = npVar2.i;
                                } else {
                                    npVarArr = npVarArr10;
                                    npVar2 = bqVar13.Q[i36].f;
                                    r51Var3 = npVar2 != null ? npVar2.i : null;
                                }
                                r51 r51Var15 = npVarArr11[i36].i;
                                if (npVar2 != null) {
                                    iE3 += npVar2.e();
                                }
                                int iE4 = npVarArr[i36].e() + iE2;
                                if (r51Var13 == null || r51Var14 == null || r51Var3 == null || r51Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (bqVar20 == bqVar14) {
                                        iE4 = bqVar14.Q[i4].e();
                                    }
                                    int i37 = iE4;
                                    if (bqVar20 == bqVar) {
                                        iE3 = bqVar.Q[i36].e();
                                    }
                                    i7 = 8;
                                    xf0Var.b(r51Var13, r51Var14, i37, 0.5f, r51Var3, r51Var15, iE3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = 8;
                            }
                            if (bqVar20.g0 != i7) {
                                bqVar21 = bqVar20;
                            }
                            bqVar20 = bqVar22;
                            bqVar21 = bqVar21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && bqVar14 != null) {
                            int i39 = vjVar.j;
                            boolean z19 = i39 > 0 && vjVar.i == i39;
                            bq bqVar23 = bqVar14;
                            bq bqVar24 = bqVar23;
                            while (true) {
                                np[] npVarArr12 = bqVar23.Q;
                                if (bqVar24 == null) {
                                    break;
                                }
                                np[] npVarArr13 = bqVar24.Q;
                                bq bqVar25 = bqVar24.m0[i2];
                                while (bqVar25 != null && bqVar25.g0 == i38) {
                                    bqVar25 = bqVar25.m0[i2];
                                }
                                if (bqVar24 == bqVar14 || bqVar24 == bqVar || bqVar25 == null) {
                                    bqVar2 = bqVar23;
                                } else {
                                    if (bqVar25 == bqVar) {
                                        bqVar25 = null;
                                    }
                                    np npVar20 = npVarArr13[i4];
                                    r51 r51Var16 = npVar20.i;
                                    int i40 = i4 + 1;
                                    r51 r51Var17 = npVarArr12[i40].i;
                                    int iE5 = npVar20.e();
                                    int iE6 = npVarArr13[i40].e();
                                    if (bqVar25 != null) {
                                        npVar = bqVar25.Q[i4];
                                        r51Var = npVar.i;
                                        bqVar2 = bqVar23;
                                        np npVar21 = npVar.f;
                                        r51Var2 = npVar21 != null ? npVar21.i : null;
                                    } else {
                                        bqVar2 = bqVar23;
                                        np npVar22 = bqVar.Q[i4];
                                        r51Var = npVar22 != null ? npVar22.i : null;
                                        r51 r51Var18 = npVarArr13[i40].i;
                                        npVar = npVar22;
                                        r51Var2 = r51Var18;
                                    }
                                    if (npVar != null) {
                                        iE6 += npVar.e();
                                    }
                                    int iE7 = npVarArr12[i40].e() + iE5;
                                    bq bqVar26 = bqVar25;
                                    int i41 = iE6;
                                    int i42 = z19 ? 8 : 4;
                                    if (r51Var16 == null || r51Var17 == null || r51Var == null || r51Var2 == null) {
                                        bqVar3 = bqVar26;
                                    } else {
                                        r51 r51Var19 = r51Var;
                                        bqVar3 = bqVar26;
                                        xf0Var.b(r51Var16, r51Var17, iE7, 0.5f, r51Var19, r51Var2, i41, i42);
                                    }
                                    bqVar25 = bqVar3;
                                }
                                if (bqVar24.g0 != 8) {
                                    bqVar2 = bqVar24;
                                }
                                bqVar24 = bqVar25;
                                bqVar23 = bqVar2;
                                i38 = 8;
                            }
                            xf0Var2 = xf0Var;
                            np npVar23 = bqVar14.Q[i4];
                            np npVar24 = npVarArr3[i4].f;
                            int i43 = i4 + 1;
                            np npVar25 = bqVar.Q[i43];
                            np npVar26 = bqVar13.Q[i43].f;
                            if (npVar24 != null) {
                                if (bqVar14 != bqVar) {
                                    xf0Var2.e(npVar23.i, npVar24.i, npVar23.e(), 5);
                                } else if (npVar26 != null) {
                                    xf0Var2.b(npVar23.i, npVar24.i, npVar23.e(), 0.5f, npVar25.i, npVar26.i, npVar25.e(), 5);
                                }
                            }
                            if (npVar26 != null && bqVar14 != bqVar) {
                                xf0Var2.e(npVar25.i, npVar26.i, -npVar25.e(), 5);
                            }
                        }
                        if ((z2 || z3) && bqVar14 != null && bqVar14 != bqVar) {
                            npVarArr2 = bqVar14.Q;
                            np npVar27 = npVarArr2[i4];
                            if (bqVar == null) {
                                bqVar = bqVar14;
                            }
                            np[] npVarArr14 = bqVar.Q;
                            i8 = i4 + 1;
                            npVar3 = npVarArr14[i8];
                            npVar4 = npVar27.f;
                            if (npVar4 != null) {
                                r51Var4 = npVar4.i;
                            } else {
                                r51Var4 = null;
                            }
                            npVar5 = npVar3.f;
                            if (npVar5 != null) {
                                r51Var5 = npVar5.i;
                            } else {
                                r51Var5 = null;
                            }
                            if (bqVar13 != bqVar) {
                                np npVar28 = bqVar13.Q[i8].f;
                                r51Var5 = npVar28 != null ? npVar28.i : null;
                            }
                            if (bqVar14 == bqVar) {
                                npVar3 = npVarArr2[i8];
                            }
                            if (r51Var4 == null && r51Var5 != null) {
                                xf0Var2.b(npVar27.i, r51Var4, npVar27.e(), 0.5f, r51Var5, npVar3.i, npVarArr14[i8].e(), 5);
                            }
                        }
                    }
                } else {
                    np npVar29 = npVarArr3[i4];
                    int i44 = i4 + 1;
                    np npVar30 = bqVar13.Q[i44];
                    np npVar31 = npVar29.f;
                    r51 r51Var20 = npVar31 != null ? npVar31.i : null;
                    np npVar32 = npVar30.f;
                    r51 r51Var21 = npVar32 != null ? npVar32.i : null;
                    np npVar33 = bqVar14.Q[i4];
                    if (bqVar15 != null) {
                        npVar30 = bqVar15.Q[i44];
                    }
                    if (r51Var20 == null || r51Var21 == null) {
                        bqVar = bqVar15;
                    } else {
                        float f10 = i2 == 0 ? bqVar16.d0 : bqVar16.e0;
                        int iE8 = npVar33.e();
                        int iE9 = npVar30.e();
                        r51 r51Var22 = npVar33.i;
                        r51 r51Var23 = npVar30.i;
                        r51 r51Var24 = r51Var20;
                        bqVar = bqVar15;
                        xf0Var.b(r51Var22, r51Var24, iE8, f10, r51Var21, r51Var23, iE9, 7);
                    }
                }
                xf0Var2 = xf0Var;
                if (z2) {
                    npVarArr2 = bqVar14.Q;
                    np npVar210 = npVarArr2[i4];
                    if (bqVar == null) {
                        bqVar = bqVar14;
                    }
                    np[] npVarArr15 = bqVar.Q;
                    i8 = i4 + 1;
                    npVar3 = npVarArr15[i8];
                    npVar4 = npVar210.f;
                    if (npVar4 != null) {
                        r51Var4 = npVar4.i;
                    } else {
                        r51Var4 = null;
                    }
                    npVar5 = npVar3.f;
                    if (npVar5 != null) {
                        r51Var5 = npVar5.i;
                    } else {
                        r51Var5 = null;
                    }
                    if (bqVar13 != bqVar) {
                        np npVar211 = bqVar13.Q[i8].f;
                        r51Var5 = npVar211 != null ? npVar211.i : null;
                    }
                    if (bqVar14 == bqVar) {
                        npVar3 = npVarArr2[i8];
                    }
                    if (r51Var4 == null) {
                    }
                } else {
                    npVarArr2 = bqVar14.Q;
                    np npVar212 = npVarArr2[i4];
                    if (bqVar == null) {
                        bqVar = bqVar14;
                    }
                    np[] npVarArr16 = bqVar.Q;
                    i8 = i4 + 1;
                    npVar3 = npVarArr16[i8];
                    npVar4 = npVar212.f;
                    if (npVar4 != null) {
                        r51Var4 = npVar4.i;
                    } else {
                        r51Var4 = null;
                    }
                    npVar5 = npVar3.f;
                    if (npVar5 != null) {
                        r51Var5 = npVar5.i;
                    } else {
                        r51Var5 = null;
                    }
                    if (bqVar13 != bqVar) {
                        np npVar213 = bqVar13.Q[i8].f;
                        r51Var5 = npVar213 != null ? npVar213.i : null;
                    }
                    if (bqVar14 == bqVar) {
                        npVar3 = npVarArr2[i8];
                    }
                    if (r51Var4 == null) {
                    }
                }
            } else {
                i6 = i14;
            }
            i15 = i5 + 1;
            cqVar2 = cqVar;
            i14 = i6;
        }
    }

    public static void e(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        id.q("ByteBuffer byte order must be little endian");
    }

    public static boolean f(bq bqVar) {
        int[] iArr = bqVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        bq bqVar2 = bqVar.T;
        cq cqVar = bqVar2 != null ? (cq) bqVar2 : null;
        if (cqVar != null) {
            int i4 = cqVar.p0[0];
        }
        if (cqVar != null) {
            int i5 = cqVar.p0[1];
        }
        boolean z = i2 == 1 || bqVar.A() || i2 == 2 || (i2 == 3 && bqVar.r == 0 && bqVar.W == 0.0f && bqVar.t(0)) || (i2 == 3 && bqVar.r == 1 && bqVar.u(0, bqVar.q()));
        boolean z2 = i3 == 1 || bqVar.B() || i3 == 2 || (i3 == 3 && bqVar.s == 0 && bqVar.W == 0.0f && bqVar.t(1)) || (i3 == 3 && bqVar.s == 1 && bqVar.u(1, bqVar.k()));
        return (bqVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static void g(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            v.f("fromIndex: ", i2, " > toIndex: ", i3);
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static ve1 h(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                nh0.p(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (ve1) objNewInstance;
            } catch (IllegalAccessException e2) {
                nh0.m("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                nh0.m("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            nh0.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final Object i(long j2, f81 f81Var) {
        if (j2 > 0) {
            xi xiVar = new xi(1, ds.u(f81Var));
            xiVar.v();
            if (j2 < Long.MAX_VALUE) {
                p(xiVar.g).d(j2, xiVar);
            }
            Object objS = xiVar.s();
            if (objS == lr.c) {
                return objS;
            }
        }
        return uc1.a;
    }

    public static boolean j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = j(file2) && z;
        }
        return z;
    }

    public static aa k(vy vyVar, z9 z9Var) {
        long j2 = z9Var.a;
        long j3 = z9Var.b + j2;
        long j4 = z9Var.d;
        if (j3 != j4) {
            throw new k9("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + j3 + ", EoCD start: " + j4);
        }
        if (j2 < 32) {
            throw new k9("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
        }
        ByteBuffer byteBufferA = vyVar.a(24, j2 - 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferA.order(byteOrder);
        if (byteBufferA.getLong(8) != 2334950737559900225L || byteBufferA.getLong(16) != 3617552046287187010L) {
            throw new k9("No APK Signing Block before ZIP Central Directory");
        }
        long j5 = byteBufferA.getLong(0);
        if (j5 < byteBufferA.capacity() || j5 > 2147483639) {
            throw new k9("APK Signing Block size out of range: " + j5);
        }
        long j6 = (int) (8 + j5);
        long j7 = j2 - j6;
        if (j7 < 0) {
            throw new k9("APK Signing Block offset out of range: " + j7);
        }
        ByteBuffer byteBufferA2 = vyVar.a(8, j7);
        byteBufferA2.order(byteOrder);
        long j8 = byteBufferA2.getLong(0);
        if (j8 == j5) {
            return new aa(j7, vyVar.e(j7, j6));
        }
        throw new k9("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j5);
    }

    public static rt0 l(vy vyVar, int i2) {
        int i3;
        if (i2 < 0 || i2 > 65535) {
            id.q(gr0.e(i2, "maxCommentSize: "));
            return null;
        }
        long size = vyVar.size();
        if (size >= 22) {
            int iMin = ((int) Math.min(i2, size - 22)) + 22;
            long j2 = size - ((long) iMin);
            ByteBuffer byteBufferA = vyVar.a(iMin, j2);
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            e(byteBufferA);
            int iCapacity = byteBufferA.capacity();
            if (iCapacity >= 22) {
                int i4 = iCapacity - 22;
                int iMin2 = Math.min(i4, 65535);
                int i5 = 0;
                while (true) {
                    if (i5 > iMin2) {
                        i3 = -1;
                        break;
                    }
                    i3 = i4 - i5;
                    if (byteBufferA.getInt(i3) == 101010256 && (byteBufferA.getShort(i3 + 20) & 65535) == i5) {
                        break;
                    }
                    i5++;
                }
            } else {
                i3 = -1;
                break;
            }
            if (i3 != -1) {
                byteBufferA.position(i3);
                ByteBuffer byteBufferSlice = byteBufferA.slice();
                byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
                return new rt0(byteBufferSlice, Long.valueOf(j2 + ((long) i3)));
            }
        }
        return null;
    }

    public static int m(int i2) {
        for (int i3 : q51.s(3)) {
            if (gr0.d(i3) == i2) {
                return i3;
            }
        }
        return 3;
    }

    public static final t10 n(s41 s41Var, br brVar, int i2, oh ohVar) {
        return ((i2 == 0 || i2 == -3) && ohVar == oh.c) ? s41Var : new jk(i2, ohVar, brVar, s41Var);
    }

    public static Drawable o(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return nd0.g(compoundButton);
        }
        if (!h) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                g = null;
            }
        }
        return null;
    }

    public static final ft p(br brVar) {
        zq zqVarL = brVar.l(fw.d);
        ft ftVar = zqVarL instanceof ft ? (ft) zqVarL : null;
        return ftVar == null ? hs.a : ftVar;
    }

    public static String r(Class cls) {
        LinkedHashMap linkedHashMap = gp0.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            ep0 ep0Var = (ep0) cls.getAnnotation(ep0.class);
            strValue = ep0Var != null ? ep0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                nh0.e("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static synchronized int s() {
        try {
            int i2 = a + 1;
            a = i2;
            if (i2 < 4238) {
                a = 4238;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static void t(int i2, sp spVar, bq bqVar, boolean z) {
        np npVar;
        np npVar2;
        np npVar3;
        np npVar4;
        if (bqVar.m) {
            return;
        }
        if (!(bqVar instanceof cq) && bqVar.z() && f(bqVar)) {
            cq.V(bqVar, spVar, new hg());
        }
        np npVarI = bqVar.i(2);
        np npVarI2 = bqVar.i(4);
        int iD = npVarI.d();
        int iD2 = npVarI2.d();
        HashSet<np> hashSet = npVarI.a;
        if (hashSet != null && npVarI.c) {
            for (np npVar5 : hashSet) {
                bq bqVar2 = npVar5.d;
                int i3 = i2 + 1;
                boolean zF = f(bqVar2);
                np npVar6 = bqVar2.I;
                np npVar7 = bqVar2.K;
                if (bqVar2.z() && zF) {
                    cq.V(bqVar2, spVar, new hg());
                }
                boolean z2 = (npVar5 == npVar6 && (npVar4 = npVar7.f) != null && npVar4.c) || (npVar5 == npVar7 && (npVar3 = npVar6.f) != null && npVar3.c);
                int i4 = bqVar2.p0[0];
                if (i4 != 3 || zF) {
                    if (!bqVar2.z()) {
                        if (npVar5 == npVar6 && npVar7.f == null) {
                            int iE = npVar6.e() + iD;
                            bqVar2.J(iE, bqVar2.q() + iE);
                            t(i3, spVar, bqVar2, z);
                        } else if (npVar5 == npVar7 && npVar6.f == null) {
                            int iE2 = iD - npVar7.e();
                            bqVar2.J(iE2 - bqVar2.q(), iE2);
                            t(i3, spVar, bqVar2, z);
                        } else if (z2 && !bqVar2.x()) {
                            H(i3, spVar, bqVar2, z);
                        }
                    }
                } else if (i4 == 3 && bqVar2.v >= 0 && bqVar2.u >= 0 && (bqVar2.g0 == 8 || (bqVar2.r == 0 && bqVar2.W == 0.0f))) {
                    if (!bqVar2.x() && !bqVar2.F && z2 && !bqVar2.x()) {
                        I(i3, bqVar, spVar, bqVar2, z);
                    }
                }
            }
        }
        if (bqVar instanceof k70) {
            return;
        }
        HashSet<np> hashSet2 = npVarI2.a;
        if (hashSet2 != null && npVarI2.c) {
            for (np npVar8 : hashSet2) {
                bq bqVar3 = npVar8.d;
                int i5 = i2 + 1;
                boolean zF2 = f(bqVar3);
                np npVar9 = bqVar3.I;
                np npVar10 = bqVar3.K;
                if (bqVar3.z() && zF2) {
                    cq.V(bqVar3, spVar, new hg());
                }
                boolean z3 = (npVar8 == npVar9 && (npVar2 = npVar10.f) != null && npVar2.c) || (npVar8 == npVar10 && (npVar = npVar9.f) != null && npVar.c);
                int i6 = bqVar3.p0[0];
                if (i6 != 3 || zF2) {
                    if (!bqVar3.z()) {
                        if (npVar8 == npVar9 && npVar10.f == null) {
                            int iE3 = npVar9.e() + iD2;
                            bqVar3.J(iE3, bqVar3.q() + iE3);
                            t(i5, spVar, bqVar3, z);
                        } else if (npVar8 == npVar10 && npVar9.f == null) {
                            int iE4 = iD2 - npVar10.e();
                            bqVar3.J(iE4 - bqVar3.q(), iE4);
                            t(i5, spVar, bqVar3, z);
                        } else if (z3 && !bqVar3.x()) {
                            H(i5, spVar, bqVar3, z);
                        }
                    }
                } else if (i6 == 3 && bqVar3.v >= 0 && bqVar3.u >= 0) {
                    if (bqVar3.g0 == 8 || (bqVar3.r == 0 && bqVar3.W == 0.0f)) {
                        if (!bqVar3.x() && !bqVar3.F && z3 && !bqVar3.x()) {
                            I(i5, bqVar, spVar, bqVar3, z);
                        }
                    }
                }
            }
        }
        bqVar.m = true;
    }

    public static final void u(String str) {
        str.getClass();
        throw new IllegalArgumentException(gr0.f("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final ArrayList v(Map map, z50 z50Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            zm0 zm0Var = (zm0) entry.getValue();
            Boolean boolValueOf = zm0Var != null ? Boolean.valueOf(zm0Var.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !zm0Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) z50Var.h((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void w(Context context, String str) {
        synchronized (b) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String x(Context context) {
        String attributeValue;
        synchronized (b) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static TypedValue y(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean z(Context context, int i2, boolean z) {
        TypedValue typedValueY = y(context, i2);
        if (typedValueY == null || typedValueY.type != 18) {
            return z;
        }
        return typedValueY.data != 0;
    }

    public abstract void A(boolean z);

    public abstract void B(boolean z);

    public abstract InputFilter[] q(InputFilter[] inputFilterArr);
}
