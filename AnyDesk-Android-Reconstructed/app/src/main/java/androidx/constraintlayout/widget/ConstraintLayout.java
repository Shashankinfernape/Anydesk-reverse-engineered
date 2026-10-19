package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.accounts.Account;
import defpackage.aq;
import defpackage.bc;
import defpackage.bq;
import defpackage.cq;
import defpackage.dq;
import defpackage.hg1;
import defpackage.j70;
import defpackage.jt;
import defpackage.k70;
import defpackage.l70;
import defpackage.n9;
import defpackage.op;
import defpackage.pp;
import defpackage.q51;
import defpackage.qp;
import defpackage.rp;
import defpackage.rv0;
import defpackage.sp;
import defpackage.th1;
import defpackage.tp;
import defpackage.u10;
import defpackage.v70;
import defpackage.vp;
import defpackage.wj;
import defpackage.wp;
import defpackage.x41;
import defpackage.xf0;
import defpackage.y6;
import defpackage.y70;
import defpackage.yf;
import defpackage.yp;
import defpackage.zd1;
import defpackage.zf;
import defpackage.zp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static x41 r;
    public final SparseArray c;
    public final ArrayList d;
    public final cq e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public aq l;
    public bc m;
    public int n;
    public HashMap o;
    public final SparseArray p;
    public final sp q;

    public ConstraintLayout(Context context) {
        super(context);
        this.c = new SparseArray();
        this.d = new ArrayList(4);
        this.e = new cq();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new sp(this, this);
        i(null, 0, 0);
    }

    public static rp g() {
        rp rpVar = new rp(-2, -2);
        rpVar.a = -1;
        rpVar.b = -1;
        rpVar.c = -1.0f;
        rpVar.d = true;
        rpVar.e = -1;
        rpVar.f = -1;
        rpVar.g = -1;
        rpVar.h = -1;
        rpVar.i = -1;
        rpVar.j = -1;
        rpVar.k = -1;
        rpVar.l = -1;
        rpVar.m = -1;
        rpVar.n = -1;
        rpVar.o = -1;
        rpVar.p = -1;
        rpVar.q = 0;
        rpVar.r = 0.0f;
        rpVar.s = -1;
        rpVar.t = -1;
        rpVar.u = -1;
        rpVar.v = -1;
        rpVar.w = Integer.MIN_VALUE;
        rpVar.x = Integer.MIN_VALUE;
        rpVar.y = Integer.MIN_VALUE;
        rpVar.z = Integer.MIN_VALUE;
        rpVar.A = Integer.MIN_VALUE;
        rpVar.B = Integer.MIN_VALUE;
        rpVar.C = Integer.MIN_VALUE;
        rpVar.D = 0;
        rpVar.E = 0.5f;
        rpVar.F = 0.5f;
        rpVar.G = null;
        rpVar.H = -1.0f;
        rpVar.I = -1.0f;
        rpVar.J = 0;
        rpVar.K = 0;
        rpVar.L = 0;
        rpVar.M = 0;
        rpVar.N = 0;
        rpVar.O = 0;
        rpVar.P = 0;
        rpVar.Q = 0;
        rpVar.R = 1.0f;
        rpVar.S = 1.0f;
        rpVar.T = -1;
        rpVar.U = -1;
        rpVar.V = -1;
        rpVar.W = false;
        rpVar.X = false;
        rpVar.Y = null;
        rpVar.Z = 0;
        rpVar.a0 = true;
        rpVar.b0 = true;
        rpVar.c0 = false;
        rpVar.d0 = false;
        rpVar.e0 = false;
        rpVar.f0 = -1;
        rpVar.g0 = -1;
        rpVar.h0 = -1;
        rpVar.i0 = -1;
        rpVar.j0 = Integer.MIN_VALUE;
        rpVar.k0 = Integer.MIN_VALUE;
        rpVar.l0 = 0.5f;
        rpVar.p0 = new bq();
        return rpVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static x41 getSharedValues() {
        if (r == null) {
            x41 x41Var = new x41();
            new SparseIntArray();
            new HashMap();
            r = x41Var;
        }
        return r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rp;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((pp) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.j = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        rp rpVar = new rp(context, attributeSet);
        rpVar.a = -1;
        rpVar.b = -1;
        rpVar.c = -1.0f;
        rpVar.d = true;
        rpVar.e = -1;
        rpVar.f = -1;
        rpVar.g = -1;
        rpVar.h = -1;
        rpVar.i = -1;
        rpVar.j = -1;
        rpVar.k = -1;
        rpVar.l = -1;
        rpVar.m = -1;
        rpVar.n = -1;
        rpVar.o = -1;
        rpVar.p = -1;
        rpVar.q = 0;
        rpVar.r = 0.0f;
        rpVar.s = -1;
        rpVar.t = -1;
        rpVar.u = -1;
        rpVar.v = -1;
        rpVar.w = Integer.MIN_VALUE;
        rpVar.x = Integer.MIN_VALUE;
        rpVar.y = Integer.MIN_VALUE;
        rpVar.z = Integer.MIN_VALUE;
        rpVar.A = Integer.MIN_VALUE;
        rpVar.B = Integer.MIN_VALUE;
        rpVar.C = Integer.MIN_VALUE;
        rpVar.D = 0;
        rpVar.E = 0.5f;
        rpVar.F = 0.5f;
        rpVar.G = null;
        rpVar.H = -1.0f;
        rpVar.I = -1.0f;
        rpVar.J = 0;
        rpVar.K = 0;
        rpVar.L = 0;
        rpVar.M = 0;
        rpVar.N = 0;
        rpVar.O = 0;
        rpVar.P = 0;
        rpVar.Q = 0;
        rpVar.R = 1.0f;
        rpVar.S = 1.0f;
        rpVar.T = -1;
        rpVar.U = -1;
        rpVar.V = -1;
        rpVar.W = false;
        rpVar.X = false;
        rpVar.Y = null;
        rpVar.Z = 0;
        rpVar.a0 = true;
        rpVar.b0 = true;
        rpVar.c0 = false;
        rpVar.d0 = false;
        rpVar.e0 = false;
        rpVar.f0 = -1;
        rpVar.g0 = -1;
        rpVar.h0 = -1;
        rpVar.i0 = -1;
        rpVar.j0 = Integer.MIN_VALUE;
        rpVar.k0 = Integer.MIN_VALUE;
        rpVar.l0 = 0.5f;
        rpVar.p0 = new bq();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rv0.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = qp.a.get(index);
            switch (i2) {
                case 1:
                    rpVar.V = typedArrayObtainStyledAttributes.getInt(index, rpVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.p);
                    rpVar.p = resourceId;
                    if (resourceId == -1) {
                        rpVar.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    rpVar.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, rpVar.r) % 360.0f;
                    rpVar.r = f;
                    if (f < 0.0f) {
                        rpVar.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    rpVar.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, rpVar.a);
                    break;
                case 6:
                    rpVar.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, rpVar.b);
                    break;
                case 7:
                    rpVar.c = typedArrayObtainStyledAttributes.getFloat(index, rpVar.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.e);
                    rpVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        rpVar.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.f);
                    rpVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        rpVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.g);
                    rpVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        rpVar.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.h);
                    rpVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        rpVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.i);
                    rpVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        rpVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.j);
                    rpVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        rpVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.k);
                    rpVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        rpVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.l);
                    rpVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        rpVar.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.m);
                    rpVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        rpVar.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.s);
                    rpVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        rpVar.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.t);
                    rpVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        rpVar.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.u);
                    rpVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        rpVar.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.v);
                    rpVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        rpVar.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    rpVar.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.w);
                    break;
                case 22:
                    rpVar.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.x);
                    break;
                case 23:
                    rpVar.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.y);
                    break;
                case 24:
                    rpVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.z);
                    break;
                case 25:
                    rpVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.A);
                    break;
                case 26:
                    rpVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.B);
                    break;
                case 27:
                    rpVar.W = typedArrayObtainStyledAttributes.getBoolean(index, rpVar.W);
                    break;
                case 28:
                    rpVar.X = typedArrayObtainStyledAttributes.getBoolean(index, rpVar.X);
                    break;
                case 29:
                    rpVar.E = typedArrayObtainStyledAttributes.getFloat(index, rpVar.E);
                    break;
                case 30:
                    rpVar.F = typedArrayObtainStyledAttributes.getFloat(index, rpVar.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    rpVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    rpVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        rpVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, rpVar.N) == -2) {
                            rpVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        rpVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, rpVar.P) == -2) {
                            rpVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    rpVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, rpVar.R));
                    rpVar.L = 2;
                    break;
                case 36:
                    try {
                        rpVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, rpVar.O) == -2) {
                            rpVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        rpVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, rpVar.Q) == -2) {
                            rpVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    rpVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, rpVar.S));
                    rpVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            aq.g(rpVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            rpVar.H = typedArrayObtainStyledAttributes.getFloat(index, rpVar.H);
                            break;
                        case 46:
                            rpVar.I = typedArrayObtainStyledAttributes.getFloat(index, rpVar.I);
                            break;
                        case 47:
                            rpVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            rpVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            rpVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, rpVar.T);
                            break;
                        case 50:
                            rpVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, rpVar.U);
                            break;
                        case 51:
                            rpVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.n);
                            rpVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                rpVar.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, rpVar.o);
                            rpVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                rpVar.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            rpVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.D);
                            break;
                        case 55:
                            rpVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, rpVar.C);
                            break;
                        default:
                            switch (i2) {
                                case Account.FLAGS_VIBRATE_WHEN_SILENT /* 64 */:
                                    aq.f(rpVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    aq.f(rpVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    rpVar.Z = typedArrayObtainStyledAttributes.getInt(index, rpVar.Z);
                                    break;
                                case 67:
                                    rpVar.d = typedArrayObtainStyledAttributes.getBoolean(index, rpVar.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        rpVar.a();
        return rpVar;
    }

    public int getMaxHeight() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    public int getMinHeight() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f;
    }

    public int getOptimizationLevel() {
        return this.e.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        cq cqVar = this.e;
        if (cqVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                cqVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                cqVar.j = "parent";
            }
        }
        if (cqVar.h0 == null) {
            cqVar.h0 = cqVar.j;
            Log.v("ConstraintLayout", " setDebugName " + cqVar.h0);
        }
        ArrayList arrayList = cqVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bq bqVar = (bq) obj;
            View view = bqVar.f0;
            if (view != null) {
                if (bqVar.j == null && (id = view.getId()) != -1) {
                    bqVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (bqVar.h0 == null) {
                    bqVar.h0 = bqVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + bqVar.h0);
                }
            }
        }
        cqVar.n(sb);
        return sb.toString();
    }

    public final bq h(View view) {
        if (view == this) {
            return this.e;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof rp) {
            return ((rp) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof rp) {
            return ((rp) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i, int i2) {
        cq cqVar = this.e;
        cqVar.f0 = this;
        sp spVar = this.q;
        cqVar.u0 = spVar;
        cqVar.s0.f = spVar;
        this.c.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rv0.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 17) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 14) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 15) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 113) {
                    this.k = typedArrayObtainStyledAttributes.getInt(index, this.k);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.m = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        aq aqVar = new aq();
                        this.l = aqVar;
                        aqVar.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.n = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        cqVar.D0 = this.k;
        xf0.q = cqVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        bc bcVar = new bc(15, false);
        bcVar.d = new SparseArray();
        bcVar.e = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            n9 n9Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                bcVar.e0(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                n9 n9Var2 = new n9(context, xml);
                                ((SparseArray) bcVar.d).put(n9Var2.a, n9Var2);
                                n9Var = n9Var2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                tp tpVar = new tp(context, xml);
                                if (n9Var != null) {
                                    ((ArrayList) n9Var.c).add(tpVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.m = bcVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:113:0x0204  */
    /* JADX WARN: Code duplicated, block: B:117:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0309  */
    /* JADX WARN: Code duplicated, block: B:161:0x0327  */
    /* JADX WARN: Code duplicated, block: B:163:0x032a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0349  */
    /* JADX WARN: Code duplicated, block: B:175:0x0365  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b7 A[LOOP:11: B:200:0x03b5->B:201:0x03b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0400  */
    /* JADX WARN: Code duplicated, block: B:206:0x041c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0423  */
    /* JADX WARN: Code duplicated, block: B:209:0x0427  */
    /* JADX WARN: Code duplicated, block: B:211:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0433  */
    /* JADX WARN: Code duplicated, block: B:213:0x0435  */
    /* JADX WARN: Code duplicated, block: B:215:0x0438  */
    /* JADX WARN: Code duplicated, block: B:216:0x043a  */
    /* JADX WARN: Code duplicated, block: B:218:0x043f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0449  */
    /* JADX WARN: Code duplicated, block: B:226:0x0452  */
    /* JADX WARN: Code duplicated, block: B:228:0x0463  */
    /* JADX WARN: Code duplicated, block: B:230:0x046f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0472  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:257:0x04af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:288:0x04fb A[LOOP:4: B:287:0x04f9->B:288:0x04fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x0507  */
    /* JADX WARN: Code duplicated, block: B:293:0x050a A[LOOP:5: B:292:0x0508->B:293:0x050a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x0520  */
    /* JADX WARN: Code duplicated, block: B:298:0x0525  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:300:0x052c  */
    /* JADX WARN: Code duplicated, block: B:302:0x052f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0535  */
    /* JADX WARN: Code duplicated, block: B:306:0x0537  */
    /* JADX WARN: Code duplicated, block: B:309:0x0550  */
    /* JADX WARN: Code duplicated, block: B:311:0x055c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0564  */
    /* JADX WARN: Code duplicated, block: B:314:0x0585  */
    /* JADX WARN: Code duplicated, block: B:316:0x058a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:321:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:323:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:334:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:336:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:340:0x0602  */
    /* JADX WARN: Code duplicated, block: B:346:0x0610 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x0627 A[PHI: r17
  0x0627: PHI (r17v8 int) = (r17v6 int), (r17v6 int), (r17v6 int), (r17v9 int) binds: [B:344:0x060d, B:353:0x0625, B:350:0x0620, B:339:0x05ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:357:0x0642  */
    /* JADX WARN: Code duplicated, block: B:360:0x0657  */
    /* JADX WARN: Code duplicated, block: B:362:0x065c  */
    /* JADX WARN: Code duplicated, block: B:365:0x067b  */
    /* JADX WARN: Code duplicated, block: B:367:0x067e  */
    /* JADX WARN: Code duplicated, block: B:369:0x0681  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:371:0x0686  */
    /* JADX WARN: Code duplicated, block: B:374:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:379:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:385:0x06c9 A[LOOP:7: B:330:0x05e8->B:385:0x06c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:388:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:402:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x06d4 A[EDGE_INSN: B:422:0x06d4->B:386:0x06d4 BREAK  A[LOOP:7: B:330:0x05e8->B:385:0x06c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x06d4 A[EDGE_INSN: B:423:0x06d4->B:386:0x06d4 BREAK  A[LOOP:7: B:330:0x05e8->B:385:0x06c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x06b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf A[PHI: r2 r12
  0x01cf: PHI (r2v3 boolean) = (r2v2 boolean), (r2v57 boolean) binds: [B:63:0x0166, B:388:0x01cf] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r12v9 int) = (r12v8 int), (r12v27 int) binds: [B:63:0x0166, B:388:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    public final void k(cq cqVar, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        int iQ;
        jt jtVar;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        y6 y6Var;
        cq cqVar2;
        ArrayList arrayList;
        sp spVar;
        int size;
        int iQ2;
        int iK;
        boolean zP;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        ArrayList arrayList2;
        sp spVar2;
        int i10;
        boolean zT;
        int size2;
        int[] iArr2;
        boolean z4;
        boolean z5;
        int iMax3;
        int iMax4;
        int i11;
        boolean zA;
        boolean z6;
        ArrayList arrayList3;
        int i12;
        sp spVar3;
        int i13;
        int i14;
        int i15;
        bq bqVar;
        int i16;
        int iQ3;
        int iK2;
        int i17;
        sp spVar4;
        int iQ4;
        int i18;
        int iK3;
        bq bqVar2;
        int iQ5;
        int iK4;
        boolean z7;
        sp spVar5;
        int iQ6;
        boolean z8;
        int iK5;
        int size3;
        sp spVar6;
        int i19;
        ConstraintLayout constraintLayout;
        int childCount;
        ArrayList arrayList4;
        int i20;
        int size4;
        int i21;
        bq bqVar3;
        int iJ;
        boolean z9;
        y70 y70Var;
        zd1 zd1Var;
        int iMin3;
        int iMin4;
        int i22;
        cq cqVar3;
        int i23;
        int i24;
        ArrayList arrayList5;
        int size5;
        int i25;
        boolean z10;
        boolean z11;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z12;
        int size6;
        int i31;
        int size7;
        int i32;
        hg1 hg1Var;
        hg1 hg1Var2;
        int i33;
        boolean z13;
        bq bqVar4;
        int i34;
        int[] iArr3;
        boolean z14;
        boolean z15;
        boolean z16;
        int mode = View.MeasureSpec.getMode(i2);
        int size8 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size9 = View.MeasureSpec.getSize(i3);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i35 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        sp spVar7 = this.q;
        spVar7.b = iMax5;
        spVar7.c = iMax6;
        spVar7.d = paddingWidth;
        spVar7.e = i35;
        spVar7.f = i2;
        spVar7.g = i3;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        int i36 = 1;
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax7 = iMax8;
        }
        int i37 = size8 - paddingWidth;
        int i38 = size9 - i35;
        int i39 = spVar7.e;
        int i40 = spVar7.d;
        int childCount2 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax = Math.max(0, this.f);
            } else {
                iMin = i37;
            }
            i36 = 2;
            if (mode2 != Integer.MIN_VALUE) {
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.g);
                } else {
                    iMin2 = i38;
                }
                i4 = 2;
                iQ = cqVar.q();
                jtVar = cqVar.s0;
                iArr = cqVar.C;
                i5 = iMin;
                if (i5 == iQ) {
                    jtVar.c = true;
                } else {
                    jtVar.c = true;
                }
                cqVar.Y = 0;
                cqVar.Z = 0;
                iArr[0] = this.h - i40;
                iArr[1] = this.i - i39;
                cqVar.b0 = 0;
                cqVar.c0 = 0;
                cqVar.M(i36);
                cqVar.O(i5);
                cqVar.N(i4);
                cqVar.L(iMin2);
                i6 = this.f - i40;
                if (i6 < 0) {
                    cqVar.b0 = 0;
                } else {
                    cqVar.b0 = i6;
                }
                i7 = this.g - i39;
                if (i7 < 0) {
                    cqVar.c0 = 0;
                } else {
                    cqVar.c0 = i7;
                }
                cqVar.x0 = iMax7;
                cqVar.y0 = iMax5;
                y6Var = cqVar.r0;
                cqVar2 = (cq) y6Var.f;
                arrayList = (ArrayList) y6Var.d;
                spVar = cqVar.u0;
                size = cqVar.q0.size();
                iQ2 = cqVar.q();
                iK = cqVar.k();
                zP = th1.p(i, 128);
                if (zP) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            z13 = z;
                            bqVar4 = (bq) cqVar.q0.get(i33);
                            i34 = i33;
                            iArr3 = bqVar4.p0;
                            i8 = size;
                            if (iArr3[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr3[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (bqVar4.x()) {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            } else {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            }
                            i9 = 1073741824;
                            z2 = false;
                        } else {
                            z2 = z;
                            i8 = size;
                            i9 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
                z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
                if (z3) {
                    iMin3 = Math.min(iArr[0], i37);
                    iMin4 = Math.min(iArr[1], i38);
                    i22 = 1073741824;
                    if (mode == 1073741824) {
                        if (cqVar.q() != iMin3) {
                            cqVar.O(iMin3);
                            jtVar.b = true;
                        }
                        i22 = 1073741824;
                    }
                    if (mode2 == i22) {
                        cqVar.L(iMin4);
                        jtVar.b = true;
                    }
                    if (mode == i22) {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj = arrayList5.get(i25);
                                i25++;
                                bq bqVar5 = (bq) obj;
                                bqVar5.h();
                                bqVar5.a = false;
                                y70 y70Var2 = bqVar5.d;
                                ArrayList arrayList6 = arrayList5;
                                y70Var2.e.j = false;
                                y70Var2.g = false;
                                y70Var2.n();
                                zd1 zd1Var2 = bqVar5.e;
                                zd1Var2.e.j = false;
                                zd1Var2.g = false;
                                zd1Var2.m();
                                arrayList5 = arrayList6;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var3 = cqVar3.d;
                            y70Var3.e.j = false;
                            y70Var3.g = false;
                            y70Var3.n();
                            zd1 zd1Var3 = cqVar3.e;
                            zd1Var3.e.j = false;
                            zd1Var3.g = false;
                            zd1Var3.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    } else {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj2 = arrayList5.get(i25);
                                i25++;
                                bq bqVar6 = (bq) obj2;
                                bqVar6.h();
                                bqVar6.a = false;
                                y70 y70Var4 = bqVar6.d;
                                ArrayList arrayList7 = arrayList5;
                                y70Var4.e.j = false;
                                y70Var4.g = false;
                                y70Var4.n();
                                zd1 zd1Var4 = bqVar6.e;
                                zd1Var4.e.j = false;
                                zd1Var4.g = false;
                                zd1Var4.m();
                                arrayList5 = arrayList7;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var5 = cqVar3.d;
                            y70Var5.e.j = false;
                            y70Var5.g = false;
                            y70Var5.n();
                            zd1 zd1Var5 = cqVar3.e;
                            zd1Var5.e.j = false;
                            zd1Var5.g = false;
                            zd1Var5.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    }
                    if (zT) {
                        if (mode == i24) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i24) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cqVar.P(z10, z11);
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                int i41 = cqVar.D0;
                if (i8 > 0) {
                    size3 = cqVar.q0.size();
                    boolean zW = cqVar.W(64);
                    spVar6 = cqVar.u0;
                    for (i19 = 0; i19 < size3; i19++) {
                        bqVar3 = (bq) cqVar.q0.get(i19);
                        if (!(bqVar3 instanceof k70)) {
                            iJ = bqVar3.j(0);
                            int iJ2 = bqVar3.j(1);
                            if (iJ == 3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                            }
                            if (z9) {
                                y6Var.A(0, spVar6, bqVar3);
                            }
                        }
                    }
                    constraintLayout = spVar6.a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.d;
                    for (i20 = 0; i20 < childCount; i20++) {
                        constraintLayout.getChildAt(i20);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        for (i21 = 0; i21 < size4; i21++) {
                            ((pp) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                y6Var.P(cqVar);
                size2 = arrayList2.size();
                if (i8 > 0) {
                    y6Var.N(cqVar, 0, iQ2, iK);
                }
                if (size2 > 0) {
                    iArr2 = cqVar.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                    iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                    i11 = 0;
                    zA = false;
                    while (i11 < size2) {
                        ArrayList arrayList8 = arrayList2;
                        bqVar2 = (bq) arrayList8.get(i11);
                        if (bqVar2 instanceof u10) {
                            iQ5 = bqVar2.q();
                            iK4 = bqVar2.k();
                            z7 = z5;
                            spVar5 = spVar2;
                            boolean zA2 = zA | y6Var.A(1, spVar5, bqVar2);
                            iQ6 = bqVar2.q();
                            z8 = zA2;
                            iK5 = bqVar2.k();
                            if (iQ6 != iQ5) {
                                bqVar2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                                }
                                z8 = true;
                            }
                            if (iK5 != iK4) {
                                bqVar2.L(iK5);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                                }
                                z8 = true;
                            }
                            zA = z8 | ((u10) bqVar2).y0;
                        } else {
                            z7 = z5;
                            spVar5 = spVar2;
                        }
                        i11++;
                        spVar2 = spVar5;
                        arrayList2 = arrayList8;
                        z5 = z7;
                    }
                    z6 = z5;
                    arrayList3 = arrayList2;
                    i12 = 0;
                    while (true) {
                        spVar3 = spVar2;
                        if (i12 < 2) {
                            break;
                            break;
                        }
                        i13 = 0;
                        while (i13 < size2) {
                            bqVar = (bq) arrayList3.get(i13);
                            if (bqVar instanceof v70) {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i42 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            } else {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i43 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            }
                            i13 = i17 + 1;
                            size2 = i16;
                            spVar3 = spVar4;
                            i12 = i18;
                        }
                        i14 = size2;
                        spVar2 = spVar3;
                        i15 = i12;
                        if (zA) {
                            break;
                            break;
                        }
                        int i44 = i15 + 1;
                        y6Var.N(cqVar, i44, iQ2, iK);
                        i12 = i44;
                        size2 = i14;
                        zA = false;
                    }
                }
                cqVar.D0 = i41;
                xf0.q = cqVar.W(512);
            }
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i4 = 1;
                } else {
                    iMin2 = Math.min(this.i - i39, i38);
                    i4 = 1;
                }
                iQ = cqVar.q();
                jtVar = cqVar.s0;
                iArr = cqVar.C;
                i5 = iMin;
                if (i5 == iQ) {
                    jtVar.c = true;
                } else {
                    jtVar.c = true;
                }
                cqVar.Y = 0;
                cqVar.Z = 0;
                iArr[0] = this.h - i40;
                iArr[1] = this.i - i39;
                cqVar.b0 = 0;
                cqVar.c0 = 0;
                cqVar.M(i36);
                cqVar.O(i5);
                cqVar.N(i4);
                cqVar.L(iMin2);
                i6 = this.f - i40;
                if (i6 < 0) {
                    cqVar.b0 = 0;
                } else {
                    cqVar.b0 = i6;
                }
                i7 = this.g - i39;
                if (i7 < 0) {
                    cqVar.c0 = 0;
                } else {
                    cqVar.c0 = i7;
                }
                cqVar.x0 = iMax7;
                cqVar.y0 = iMax5;
                y6Var = cqVar.r0;
                cqVar2 = (cq) y6Var.f;
                arrayList = (ArrayList) y6Var.d;
                spVar = cqVar.u0;
                size = cqVar.q0.size();
                iQ2 = cqVar.q();
                iK = cqVar.k();
                zP = th1.p(i, 128);
                if (zP) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            z13 = z;
                            bqVar4 = (bq) cqVar.q0.get(i33);
                            i34 = i33;
                            iArr3 = bqVar4.p0;
                            i8 = size;
                            if (iArr3[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr3[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (bqVar4.x()) {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            } else {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            }
                            i9 = 1073741824;
                            z2 = false;
                        } else {
                            z2 = z;
                            i8 = size;
                            i9 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
                z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
                if (z3) {
                    iMin3 = Math.min(iArr[0], i37);
                    iMin4 = Math.min(iArr[1], i38);
                    i22 = 1073741824;
                    if (mode == 1073741824) {
                        if (cqVar.q() != iMin3) {
                            cqVar.O(iMin3);
                            jtVar.b = true;
                        }
                        i22 = 1073741824;
                    }
                    if (mode2 == i22) {
                        cqVar.L(iMin4);
                        jtVar.b = true;
                    }
                    if (mode == i22) {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj3 = arrayList5.get(i25);
                                i25++;
                                bq bqVar7 = (bq) obj3;
                                bqVar7.h();
                                bqVar7.a = false;
                                y70 y70Var6 = bqVar7.d;
                                ArrayList arrayList9 = arrayList5;
                                y70Var6.e.j = false;
                                y70Var6.g = false;
                                y70Var6.n();
                                zd1 zd1Var6 = bqVar7.e;
                                zd1Var6.e.j = false;
                                zd1Var6.g = false;
                                zd1Var6.m();
                                arrayList5 = arrayList9;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var7 = cqVar3.d;
                            y70Var7.e.j = false;
                            y70Var7.g = false;
                            y70Var7.n();
                            zd1 zd1Var7 = cqVar3.e;
                            zd1Var7.e.j = false;
                            zd1Var7.g = false;
                            zd1Var7.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    } else {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj4 = arrayList5.get(i25);
                                i25++;
                                bq bqVar8 = (bq) obj4;
                                bqVar8.h();
                                bqVar8.a = false;
                                y70 y70Var8 = bqVar8.d;
                                ArrayList arrayList10 = arrayList5;
                                y70Var8.e.j = false;
                                y70Var8.g = false;
                                y70Var8.n();
                                zd1 zd1Var8 = bqVar8.e;
                                zd1Var8.e.j = false;
                                zd1Var8.g = false;
                                zd1Var8.m();
                                arrayList5 = arrayList10;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var9 = cqVar3.d;
                            y70Var9.e.j = false;
                            y70Var9.g = false;
                            y70Var9.n();
                            zd1 zd1Var9 = cqVar3.e;
                            zd1Var9.e.j = false;
                            zd1Var9.g = false;
                            zd1Var9.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    }
                    if (zT) {
                        if (mode == i24) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i24) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cqVar.P(z10, z11);
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                int i45 = cqVar.D0;
                if (i8 > 0) {
                    size3 = cqVar.q0.size();
                    boolean zW2 = cqVar.W(64);
                    spVar6 = cqVar.u0;
                    while (i19 < size3) {
                        bqVar3 = (bq) cqVar.q0.get(i19);
                        if (!(bqVar3 instanceof k70)) {
                            iJ = bqVar3.j(0);
                            int iJ3 = bqVar3.j(1);
                            if (iJ == 3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                            }
                            if (z9) {
                                y6Var.A(0, spVar6, bqVar3);
                            }
                        }
                    }
                    constraintLayout = spVar6.a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.d;
                    while (i20 < childCount) {
                        constraintLayout.getChildAt(i20);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i21 < size4) {
                            ((pp) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                y6Var.P(cqVar);
                size2 = arrayList2.size();
                if (i8 > 0) {
                    y6Var.N(cqVar, 0, iQ2, iK);
                }
                if (size2 > 0) {
                    iArr2 = cqVar.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                    iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                    i11 = 0;
                    zA = false;
                    while (i11 < size2) {
                        ArrayList arrayList11 = arrayList2;
                        bqVar2 = (bq) arrayList11.get(i11);
                        if (bqVar2 instanceof u10) {
                            z7 = z5;
                            spVar5 = spVar2;
                        } else {
                            iQ5 = bqVar2.q();
                            iK4 = bqVar2.k();
                            z7 = z5;
                            spVar5 = spVar2;
                            boolean zA3 = zA | y6Var.A(1, spVar5, bqVar2);
                            iQ6 = bqVar2.q();
                            z8 = zA3;
                            iK5 = bqVar2.k();
                            if (iQ6 != iQ5) {
                                bqVar2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                                }
                                z8 = true;
                            }
                            if (iK5 != iK4) {
                                bqVar2.L(iK5);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                                }
                                z8 = true;
                            }
                            zA = z8 | ((u10) bqVar2).y0;
                        }
                        i11++;
                        spVar2 = spVar5;
                        arrayList2 = arrayList11;
                        z5 = z7;
                    }
                    z6 = z5;
                    arrayList3 = arrayList2;
                    i12 = 0;
                    while (true) {
                        spVar3 = spVar2;
                        if (i12 < 2) {
                            break;
                            break;
                        }
                        i13 = 0;
                        while (i13 < size2) {
                            bqVar = (bq) arrayList3.get(i13);
                            if (bqVar instanceof v70) {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i46 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            } else {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i47 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            }
                            i13 = i17 + 1;
                            size2 = i16;
                            spVar3 = spVar4;
                            i12 = i18;
                        }
                        i14 = size2;
                        spVar2 = spVar3;
                        i15 = i12;
                        if (zA) {
                            break;
                            break;
                        }
                        int i48 = i15 + 1;
                        y6Var.N(cqVar, i48, iQ2, iK);
                        i12 = i48;
                        size2 = i14;
                        zA = false;
                    }
                }
                cqVar.D0 = i45;
                xf0.q = cqVar.W(512);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.g);
            } else {
                i4 = 2;
            }
            iMin2 = 0;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj5 = arrayList5.get(i25);
                            i25++;
                            bq bqVar9 = (bq) obj5;
                            bqVar9.h();
                            bqVar9.a = false;
                            y70 y70Var10 = bqVar9.d;
                            ArrayList arrayList12 = arrayList5;
                            y70Var10.e.j = false;
                            y70Var10.g = false;
                            y70Var10.n();
                            zd1 zd1Var10 = bqVar9.e;
                            zd1Var10.e.j = false;
                            zd1Var10.g = false;
                            zd1Var10.m();
                            arrayList5 = arrayList12;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var11 = cqVar3.d;
                        y70Var11.e.j = false;
                        y70Var11.g = false;
                        y70Var11.n();
                        zd1 zd1Var11 = cqVar3.e;
                        zd1Var11.e.j = false;
                        zd1Var11.g = false;
                        zd1Var11.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj6 = arrayList5.get(i25);
                            i25++;
                            bq bqVar10 = (bq) obj6;
                            bqVar10.h();
                            bqVar10.a = false;
                            y70 y70Var12 = bqVar10.d;
                            ArrayList arrayList13 = arrayList5;
                            y70Var12.e.j = false;
                            y70Var12.g = false;
                            y70Var12.n();
                            zd1 zd1Var12 = bqVar10.e;
                            zd1Var12.e.j = false;
                            zd1Var12.g = false;
                            zd1Var12.m();
                            arrayList5 = arrayList13;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var13 = cqVar3.d;
                        y70Var13.e.j = false;
                        y70Var13.g = false;
                        y70Var13.n();
                        zd1 zd1Var13 = cqVar3.e;
                        zd1Var13.e.j = false;
                        zd1Var13.g = false;
                        zd1Var13.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i49 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW3 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ4 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList14 = arrayList2;
                    bqVar2 = (bq) arrayList14.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA4 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA4;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList14;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i410 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i411 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i412 = i15 + 1;
                    y6Var.N(cqVar, i412, iQ2, iK);
                    i12 = i412;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i49;
            xf0.q = cqVar.W(512);
            iMin2 = iMax2;
            i4 = 2;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj7 = arrayList5.get(i25);
                            i25++;
                            bq bqVar11 = (bq) obj7;
                            bqVar11.h();
                            bqVar11.a = false;
                            y70 y70Var14 = bqVar11.d;
                            ArrayList arrayList15 = arrayList5;
                            y70Var14.e.j = false;
                            y70Var14.g = false;
                            y70Var14.n();
                            zd1 zd1Var14 = bqVar11.e;
                            zd1Var14.e.j = false;
                            zd1Var14.g = false;
                            zd1Var14.m();
                            arrayList5 = arrayList15;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var15 = cqVar3.d;
                        y70Var15.e.j = false;
                        y70Var15.g = false;
                        y70Var15.n();
                        zd1 zd1Var15 = cqVar3.e;
                        zd1Var15.e.j = false;
                        zd1Var15.g = false;
                        zd1Var15.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj8 = arrayList5.get(i25);
                            i25++;
                            bq bqVar12 = (bq) obj8;
                            bqVar12.h();
                            bqVar12.a = false;
                            y70 y70Var16 = bqVar12.d;
                            ArrayList arrayList16 = arrayList5;
                            y70Var16.e.j = false;
                            y70Var16.g = false;
                            y70Var16.n();
                            zd1 zd1Var16 = bqVar12.e;
                            zd1Var16.e.j = false;
                            zd1Var16.g = false;
                            zd1Var16.m();
                            arrayList5 = arrayList16;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var17 = cqVar3.d;
                        y70Var17.e.j = false;
                        y70Var17.g = false;
                        y70Var17.n();
                        zd1 zd1Var17 = cqVar3.e;
                        zd1Var17.e.j = false;
                        zd1Var17.g = false;
                        zd1Var17.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i413 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW4 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ5 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList17 = arrayList2;
                    bqVar2 = (bq) arrayList17.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA5 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA5;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList17;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i414 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i415 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i416 = i15 + 1;
                    y6Var.N(cqVar, i416, iQ2, iK);
                    i12 = i416;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i413;
            xf0.q = cqVar.W(512);
        }
        if (mode != 0) {
            if (mode == 1073741824) {
                iMin = Math.min(this.h - i40, i37);
                i36 = 1;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.g);
                } else {
                    iMin2 = i38;
                }
                i4 = 2;
                iQ = cqVar.q();
                jtVar = cqVar.s0;
                iArr = cqVar.C;
                i5 = iMin;
                if (i5 == iQ) {
                    jtVar.c = true;
                } else {
                    jtVar.c = true;
                }
                cqVar.Y = 0;
                cqVar.Z = 0;
                iArr[0] = this.h - i40;
                iArr[1] = this.i - i39;
                cqVar.b0 = 0;
                cqVar.c0 = 0;
                cqVar.M(i36);
                cqVar.O(i5);
                cqVar.N(i4);
                cqVar.L(iMin2);
                i6 = this.f - i40;
                if (i6 < 0) {
                    cqVar.b0 = 0;
                } else {
                    cqVar.b0 = i6;
                }
                i7 = this.g - i39;
                if (i7 < 0) {
                    cqVar.c0 = 0;
                } else {
                    cqVar.c0 = i7;
                }
                cqVar.x0 = iMax7;
                cqVar.y0 = iMax5;
                y6Var = cqVar.r0;
                cqVar2 = (cq) y6Var.f;
                arrayList = (ArrayList) y6Var.d;
                spVar = cqVar.u0;
                size = cqVar.q0.size();
                iQ2 = cqVar.q();
                iK = cqVar.k();
                zP = th1.p(i, 128);
                if (zP) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            z13 = z;
                            bqVar4 = (bq) cqVar.q0.get(i33);
                            i34 = i33;
                            iArr3 = bqVar4.p0;
                            i8 = size;
                            if (iArr3[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr3[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (bqVar4.x()) {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            } else {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            }
                            i9 = 1073741824;
                            z2 = false;
                        } else {
                            z2 = z;
                            i8 = size;
                            i9 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
                z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
                if (z3) {
                    iMin3 = Math.min(iArr[0], i37);
                    iMin4 = Math.min(iArr[1], i38);
                    i22 = 1073741824;
                    if (mode == 1073741824) {
                        if (cqVar.q() != iMin3) {
                            cqVar.O(iMin3);
                            jtVar.b = true;
                        }
                        i22 = 1073741824;
                    }
                    if (mode2 == i22) {
                        cqVar.L(iMin4);
                        jtVar.b = true;
                    }
                    if (mode == i22) {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj9 = arrayList5.get(i25);
                                i25++;
                                bq bqVar13 = (bq) obj9;
                                bqVar13.h();
                                bqVar13.a = false;
                                y70 y70Var18 = bqVar13.d;
                                ArrayList arrayList18 = arrayList5;
                                y70Var18.e.j = false;
                                y70Var18.g = false;
                                y70Var18.n();
                                zd1 zd1Var18 = bqVar13.e;
                                zd1Var18.e.j = false;
                                zd1Var18.g = false;
                                zd1Var18.m();
                                arrayList5 = arrayList18;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var19 = cqVar3.d;
                            y70Var19.e.j = false;
                            y70Var19.g = false;
                            y70Var19.n();
                            zd1 zd1Var19 = cqVar3.e;
                            zd1Var19.e.j = false;
                            zd1Var19.g = false;
                            zd1Var19.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    } else {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj10 = arrayList5.get(i25);
                                i25++;
                                bq bqVar14 = (bq) obj10;
                                bqVar14.h();
                                bqVar14.a = false;
                                y70 y70Var110 = bqVar14.d;
                                ArrayList arrayList19 = arrayList5;
                                y70Var110.e.j = false;
                                y70Var110.g = false;
                                y70Var110.n();
                                zd1 zd1Var110 = bqVar14.e;
                                zd1Var110.e.j = false;
                                zd1Var110.g = false;
                                zd1Var110.m();
                                arrayList5 = arrayList19;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var111 = cqVar3.d;
                            y70Var111.e.j = false;
                            y70Var111.g = false;
                            y70Var111.n();
                            zd1 zd1Var111 = cqVar3.e;
                            zd1Var111.e.j = false;
                            zd1Var111.g = false;
                            zd1Var111.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    }
                    if (zT) {
                        if (mode == i24) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i24) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cqVar.P(z10, z11);
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                int i417 = cqVar.D0;
                if (i8 > 0) {
                    size3 = cqVar.q0.size();
                    boolean zW5 = cqVar.W(64);
                    spVar6 = cqVar.u0;
                    while (i19 < size3) {
                        bqVar3 = (bq) cqVar.q0.get(i19);
                        if (!(bqVar3 instanceof k70)) {
                            iJ = bqVar3.j(0);
                            int iJ6 = bqVar3.j(1);
                            if (iJ == 3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                            }
                            if (z9) {
                                y6Var.A(0, spVar6, bqVar3);
                            }
                        }
                    }
                    constraintLayout = spVar6.a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.d;
                    while (i20 < childCount) {
                        constraintLayout.getChildAt(i20);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i21 < size4) {
                            ((pp) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                y6Var.P(cqVar);
                size2 = arrayList2.size();
                if (i8 > 0) {
                    y6Var.N(cqVar, 0, iQ2, iK);
                }
                if (size2 > 0) {
                    iArr2 = cqVar.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                    iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                    i11 = 0;
                    zA = false;
                    while (i11 < size2) {
                        ArrayList arrayList110 = arrayList2;
                        bqVar2 = (bq) arrayList110.get(i11);
                        if (bqVar2 instanceof u10) {
                            z7 = z5;
                            spVar5 = spVar2;
                        } else {
                            iQ5 = bqVar2.q();
                            iK4 = bqVar2.k();
                            z7 = z5;
                            spVar5 = spVar2;
                            boolean zA6 = zA | y6Var.A(1, spVar5, bqVar2);
                            iQ6 = bqVar2.q();
                            z8 = zA6;
                            iK5 = bqVar2.k();
                            if (iQ6 != iQ5) {
                                bqVar2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                                }
                                z8 = true;
                            }
                            if (iK5 != iK4) {
                                bqVar2.L(iK5);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                                }
                                z8 = true;
                            }
                            zA = z8 | ((u10) bqVar2).y0;
                        }
                        i11++;
                        spVar2 = spVar5;
                        arrayList2 = arrayList110;
                        z5 = z7;
                    }
                    z6 = z5;
                    arrayList3 = arrayList2;
                    i12 = 0;
                    while (true) {
                        spVar3 = spVar2;
                        if (i12 < 2) {
                            break;
                            break;
                        }
                        i13 = 0;
                        while (i13 < size2) {
                            bqVar = (bq) arrayList3.get(i13);
                            if (bqVar instanceof v70) {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i418 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            } else {
                                i16 = size2;
                                if (bqVar.g0 == 8) {
                                    spVar4 = spVar3;
                                    i18 = i12;
                                    i17 = i13;
                                } else {
                                    iQ3 = bqVar.q();
                                    iK2 = bqVar.k();
                                    i17 = i13;
                                    int i419 = bqVar.a0;
                                    zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                    spVar4 = spVar3;
                                    iQ4 = bqVar.q();
                                    i18 = i12;
                                    iK3 = bqVar.k();
                                    if (iQ4 != iQ3) {
                                        bqVar.O(iQ4);
                                        if (!z4) {
                                        }
                                        zA = true;
                                    }
                                    if (iK3 != iK2) {
                                        bqVar.L(iK3);
                                        if (!z6) {
                                        }
                                        zA = true;
                                    }
                                    if (!bqVar.E) {
                                    }
                                }
                            }
                            i13 = i17 + 1;
                            size2 = i16;
                            spVar3 = spVar4;
                            i12 = i18;
                        }
                        i14 = size2;
                        spVar2 = spVar3;
                        i15 = i12;
                        if (zA) {
                            break;
                            break;
                        }
                        int i4110 = i15 + 1;
                        y6Var.N(cqVar, i4110, iQ2, iK);
                        i12 = i4110;
                        size2 = i14;
                        zA = false;
                    }
                }
                cqVar.D0 = i417;
                xf0.q = cqVar.W(512);
            }
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i4 = 1;
                } else {
                    iMin2 = Math.min(this.i - i39, i38);
                    i4 = 1;
                }
                iQ = cqVar.q();
                jtVar = cqVar.s0;
                iArr = cqVar.C;
                i5 = iMin;
                if (i5 == iQ || iMin2 != cqVar.k()) {
                    jtVar.c = true;
                }
                cqVar.Y = 0;
                cqVar.Z = 0;
                iArr[0] = this.h - i40;
                iArr[1] = this.i - i39;
                cqVar.b0 = 0;
                cqVar.c0 = 0;
                cqVar.M(i36);
                cqVar.O(i5);
                cqVar.N(i4);
                cqVar.L(iMin2);
                i6 = this.f - i40;
                if (i6 < 0) {
                    cqVar.b0 = 0;
                } else {
                    cqVar.b0 = i6;
                }
                i7 = this.g - i39;
                if (i7 < 0) {
                    cqVar.c0 = 0;
                } else {
                    cqVar.c0 = i7;
                }
                cqVar.x0 = iMax7;
                cqVar.y0 = iMax5;
                y6Var = cqVar.r0;
                cqVar2 = (cq) y6Var.f;
                arrayList = (ArrayList) y6Var.d;
                spVar = cqVar.u0;
                size = cqVar.q0.size();
                iQ2 = cqVar.q();
                iK = cqVar.k();
                zP = th1.p(i, 128);
                if (zP || th1.p(i, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            z13 = z;
                            bqVar4 = (bq) cqVar.q0.get(i33);
                            i34 = i33;
                            iArr3 = bqVar4.p0;
                            i8 = size;
                            if (iArr3[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr3[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14 || !z15 || bqVar4.W <= 0.0f) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if ((bqVar4.x() || !z16) && !((bqVar4.y() && z16) || (bqVar4 instanceof u10) || bqVar4.x() || bqVar4.y())) {
                                i33 = i34 + 1;
                                z = z13;
                                size = i8;
                            } else {
                                i9 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            i8 = size;
                            i9 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
                z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
                if (z3) {
                    iMin3 = Math.min(iArr[0], i37);
                    iMin4 = Math.min(iArr[1], i38);
                    i22 = 1073741824;
                    if (mode == 1073741824) {
                        if (cqVar.q() != iMin3) {
                            cqVar.O(iMin3);
                            jtVar.b = true;
                        }
                        i22 = 1073741824;
                    }
                    if (mode2 == i22 && cqVar.k() != iMin4) {
                        cqVar.L(iMin4);
                        jtVar.b = true;
                    }
                    if (mode == i22 || mode2 != i22) {
                        z3 = z3;
                        arrayList2 = arrayList;
                        spVar2 = spVar;
                        cqVar3 = jtVar.a;
                        if (jtVar.b) {
                            arrayList5 = cqVar3.q0;
                            size5 = arrayList5.size();
                            i25 = 0;
                            while (i25 < size5) {
                                Object obj11 = arrayList5.get(i25);
                                i25++;
                                bq bqVar15 = (bq) obj11;
                                bqVar15.h();
                                bqVar15.a = false;
                                y70 y70Var112 = bqVar15.d;
                                ArrayList arrayList111 = arrayList5;
                                y70Var112.e.j = false;
                                y70Var112.g = false;
                                y70Var112.n();
                                zd1 zd1Var112 = bqVar15.e;
                                zd1Var112.e.j = false;
                                zd1Var112.g = false;
                                zd1Var112.m();
                                arrayList5 = arrayList111;
                            }
                            i23 = 0;
                            cqVar3.h();
                            cqVar3.a = false;
                            y70 y70Var113 = cqVar3.d;
                            y70Var113.e.j = false;
                            y70Var113.g = false;
                            y70Var113.n();
                            zd1 zd1Var113 = cqVar3.e;
                            zd1Var113.e.j = false;
                            zd1Var113.g = false;
                            zd1Var113.m();
                            jtVar.c();
                        } else {
                            i23 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar3.Y = i23;
                        cqVar3.Z = i23;
                        cqVar3.d.h.d(i23);
                        cqVar3.e.h.d(i23);
                        i24 = 1073741824;
                        if (mode == 1073741824) {
                            zT = cqVar.T(i23, zP);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            zT = true;
                        }
                        if (mode2 == 1073741824) {
                            zT &= cqVar.T(1, zP);
                            i10++;
                        }
                    } else {
                        ArrayList arrayList20 = jtVar.e;
                        cq cqVar4 = jtVar.a;
                        if (jtVar.b || jtVar.c) {
                            ArrayList arrayList21 = cqVar4.q0;
                            int size10 = arrayList21.size();
                            int i50 = 0;
                            while (i50 < size10) {
                                Object obj12 = arrayList21.get(i50);
                                int i51 = i50 + 1;
                                bq bqVar16 = (bq) obj12;
                                bqVar16.h();
                                bqVar16.a = false;
                                bqVar16.d.n();
                                bqVar16.e.m();
                                arrayList21 = arrayList21;
                                i50 = i51;
                            }
                            cqVar4.h();
                            i26 = 0;
                            cqVar4.a = false;
                            cqVar4.d.n();
                            cqVar4.e.m();
                            jtVar.c = false;
                        } else {
                            i26 = 0;
                        }
                        jtVar.b(jtVar.d);
                        cqVar4.Y = i26;
                        int[] iArr4 = cqVar4.p0;
                        cqVar4.Z = i26;
                        int iJ7 = cqVar4.j(i26);
                        int iJ8 = cqVar4.j(1);
                        if (jtVar.b) {
                            jtVar.c();
                        }
                        int iR = cqVar4.r();
                        spVar2 = spVar;
                        int iS = cqVar4.s();
                        arrayList2 = arrayList;
                        cqVar4.d.h.d(iR);
                        cqVar4.e.h.d(iS);
                        jtVar.g();
                        if (iJ7 == 2 || iJ8 == 2) {
                            if (zP) {
                                int size11 = arrayList20.size();
                                i27 = iR;
                                int i52 = 0;
                                while (i52 < size11) {
                                    Object obj13 = arrayList20.get(i52);
                                    i52++;
                                    if (!((hg1) obj13).k()) {
                                        zP = false;
                                        break;
                                    }
                                }
                            } else {
                                i27 = iR;
                            }
                            if (zP && iJ7 == 2) {
                                cqVar4.M(1);
                                cqVar4.O(jtVar.d(cqVar4, 0));
                                cqVar4.d.e.d(cqVar4.q());
                            }
                            if (zP && iJ8 == 2) {
                                i28 = 1;
                                cqVar4.N(1);
                                cqVar4.L(jtVar.d(cqVar4, 1));
                                cqVar4.e.e.d(cqVar4.k());
                            }
                            i29 = iArr4[0];
                            if (i29 != i28 || i29 == 4) {
                                int iQ7 = cqVar4.q() + i27;
                                cqVar4.d.i.d(iQ7);
                                cqVar4.d.e.d(iQ7 - i27);
                                jtVar.g();
                                i30 = iArr4[1];
                                if (i30 != 1 || i30 == 4) {
                                    int iK6 = cqVar4.k() + iS;
                                    cqVar4.e.i.d(iK6);
                                    cqVar4.e.e.d(iK6 - iS);
                                }
                                jtVar.g();
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            size6 = arrayList20.size();
                            i31 = 0;
                            while (i31 < size6) {
                                Object obj14 = arrayList20.get(i31);
                                i31++;
                                hg1Var2 = (hg1) obj14;
                                if (hg1Var2.b == cqVar4 || hg1Var2.g) {
                                    hg1Var2.e();
                                }
                            }
                            size7 = arrayList20.size();
                            i32 = 0;
                            while (true) {
                                if (i32 < size7) {
                                    zT = true;
                                    break;
                                }
                                Object obj15 = arrayList20.get(i32);
                                i32++;
                                hg1Var = (hg1) obj15;
                                if (!z12 || hg1Var.b != cqVar4) {
                                    if (hg1Var.h.j || ((!hg1Var.i.j && !(hg1Var instanceof l70)) || (!hg1Var.e.j && !(hg1Var instanceof wj) && !(hg1Var instanceof l70)))) {
                                        zT = false;
                                        break;
                                    }
                                }
                            }
                            cqVar4.M(iJ7);
                            cqVar4.N(iJ8);
                            i10 = 2;
                            i24 = 1073741824;
                        } else {
                            i27 = iR;
                        }
                        i28 = 1;
                        i29 = iArr4[0];
                        if (i29 != i28) {
                            int iQ8 = cqVar4.q() + i27;
                            cqVar4.d.i.d(iQ8);
                            cqVar4.d.e.d(iQ8 - i27);
                            jtVar.g();
                            i30 = iArr4[1];
                            if (i30 != 1) {
                                int iK7 = cqVar4.k() + iS;
                                cqVar4.e.i.d(iK7);
                                cqVar4.e.e.d(iK7 - iS);
                            } else {
                                int iK8 = cqVar4.k() + iS;
                                cqVar4.e.i.d(iK8);
                                cqVar4.e.e.d(iK8 - iS);
                            }
                            jtVar.g();
                            z12 = true;
                        } else {
                            int iQ9 = cqVar4.q() + i27;
                            cqVar4.d.i.d(iQ9);
                            cqVar4.d.e.d(iQ9 - i27);
                            jtVar.g();
                            i30 = iArr4[1];
                            if (i30 != 1) {
                                int iK9 = cqVar4.k() + iS;
                                cqVar4.e.i.d(iK9);
                                cqVar4.e.e.d(iK9 - iS);
                            } else {
                                int iK10 = cqVar4.k() + iS;
                                cqVar4.e.i.d(iK10);
                                cqVar4.e.e.d(iK10 - iS);
                            }
                            jtVar.g();
                            z12 = true;
                        }
                        size6 = arrayList20.size();
                        i31 = 0;
                        while (i31 < size6) {
                            Object obj16 = arrayList20.get(i31);
                            i31++;
                            hg1Var2 = (hg1) obj16;
                            if (hg1Var2.b == cqVar4) {
                            }
                            hg1Var2.e();
                        }
                        size7 = arrayList20.size();
                        i32 = 0;
                        while (true) {
                            if (i32 < size7) {
                                zT = true;
                                break;
                            }
                            Object obj17 = arrayList20.get(i32);
                            i32++;
                            hg1Var = (hg1) obj17;
                            if (!z12) {
                            }
                            if (hg1Var.h.j) {
                            }
                            zT = false;
                            break;
                        }
                        cqVar4.M(iJ7);
                        cqVar4.N(iJ8);
                        i10 = 2;
                        i24 = 1073741824;
                    }
                    if (zT) {
                        if (mode == i24) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i24) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cqVar.P(z10, z11);
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    i10 = 0;
                    zT = false;
                }
                if (zT || i10 != 2) {
                    int i4111 = cqVar.D0;
                    if (i8 > 0) {
                        size3 = cqVar.q0.size();
                        boolean zW6 = cqVar.W(64);
                        spVar6 = cqVar.u0;
                        while (i19 < size3) {
                            bqVar3 = (bq) cqVar.q0.get(i19);
                            if (!(bqVar3 instanceof k70) && !(bqVar3 instanceof zf) && !bqVar3.F && (!zW6 || (y70Var = bqVar3.d) == null || (zd1Var = bqVar3.e) == null || !y70Var.e.j || !zd1Var.e.j)) {
                                iJ = bqVar3.j(0);
                                int iJ9 = bqVar3.j(1);
                                if (iJ == 3 || bqVar3.r == 1 || iJ9 != 3 || bqVar3.s == 1) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (z9 && cqVar.W(1) && !(bqVar3 instanceof u10)) {
                                    if (iJ == 3 && bqVar3.r == 0 && iJ9 != 3 && !bqVar3.x()) {
                                        z9 = true;
                                    }
                                    if (iJ9 == 3 && bqVar3.s == 0 && iJ != 3 && !bqVar3.x()) {
                                        z9 = true;
                                    }
                                    if ((iJ == 3 || iJ9 == 3) && bqVar3.W > 0.0f) {
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    y6Var.A(0, spVar6, bqVar3);
                                }
                            }
                        }
                        constraintLayout = spVar6.a;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.d;
                        while (i20 < childCount) {
                            constraintLayout.getChildAt(i20);
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i21 < size4) {
                                ((pp) arrayList4.get(i21)).getClass();
                            }
                        }
                    }
                    y6Var.P(cqVar);
                    size2 = arrayList2.size();
                    if (i8 > 0) {
                        y6Var.N(cqVar, 0, iQ2, iK);
                    }
                    if (size2 > 0) {
                        iArr2 = cqVar.p0;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                        iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                        i11 = 0;
                        zA = false;
                        while (i11 < size2) {
                            ArrayList arrayList112 = arrayList2;
                            bqVar2 = (bq) arrayList112.get(i11);
                            if (bqVar2 instanceof u10) {
                                z7 = z5;
                                spVar5 = spVar2;
                            } else {
                                iQ5 = bqVar2.q();
                                iK4 = bqVar2.k();
                                z7 = z5;
                                spVar5 = spVar2;
                                boolean zA7 = zA | y6Var.A(1, spVar5, bqVar2);
                                iQ6 = bqVar2.q();
                                z8 = zA7;
                                iK5 = bqVar2.k();
                                if (iQ6 != iQ5) {
                                    bqVar2.O(iQ6);
                                    if (z4 && bqVar2.r() + bqVar2.U > iMax3) {
                                        iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                                    }
                                    z8 = true;
                                }
                                if (iK5 != iK4) {
                                    bqVar2.L(iK5);
                                    if (z7 && bqVar2.s() + bqVar2.V > iMax4) {
                                        iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                                    }
                                    z8 = true;
                                }
                                zA = z8 | ((u10) bqVar2).y0;
                            }
                            i11++;
                            spVar2 = spVar5;
                            arrayList2 = arrayList112;
                            z5 = z7;
                        }
                        z6 = z5;
                        arrayList3 = arrayList2;
                        i12 = 0;
                        while (true) {
                            spVar3 = spVar2;
                            if (i12 < 2) {
                                break;
                            }
                            i13 = 0;
                            while (i13 < size2) {
                                bqVar = (bq) arrayList3.get(i13);
                                if (((bqVar instanceof v70) || (bqVar instanceof u10)) && !(bqVar instanceof k70)) {
                                    i16 = size2;
                                    if (bqVar.g0 == 8 && ((!z3 || !bqVar.d.e.j || !bqVar.e.e.j) && !(bqVar instanceof u10))) {
                                        iQ3 = bqVar.q();
                                        iK2 = bqVar.k();
                                        i17 = i13;
                                        int i4112 = bqVar.a0;
                                        zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                        spVar4 = spVar3;
                                        iQ4 = bqVar.q();
                                        i18 = i12;
                                        iK3 = bqVar.k();
                                        if (iQ4 != iQ3) {
                                            bqVar.O(iQ4);
                                            if (!z4 && bqVar.r() + bqVar.U > iMax3) {
                                                iMax3 = Math.max(iMax3, bqVar.i(4).e() + bqVar.r() + bqVar.U);
                                            }
                                            zA = true;
                                        }
                                        if (iK3 != iK2) {
                                            bqVar.L(iK3);
                                            if (!z6 && bqVar.s() + bqVar.V > iMax4) {
                                                iMax4 = Math.max(iMax4, bqVar.i(5).e() + bqVar.s() + bqVar.V);
                                            }
                                            zA = true;
                                        }
                                        if (!bqVar.E && i4112 != bqVar.a0) {
                                            zA = true;
                                        }
                                    }
                                    i13 = i17 + 1;
                                    size2 = i16;
                                    spVar3 = spVar4;
                                    i12 = i18;
                                } else {
                                    i16 = size2;
                                }
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                                i13 = i17 + 1;
                                size2 = i16;
                                spVar3 = spVar4;
                                i12 = i18;
                            }
                            i14 = size2;
                            spVar2 = spVar3;
                            i15 = i12;
                            if (zA) {
                                break;
                            }
                            int i4113 = i15 + 1;
                            y6Var.N(cqVar, i4113, iQ2, iK);
                            i12 = i4113;
                            size2 = i14;
                            zA = false;
                        }
                    }
                    cqVar.D0 = i4111;
                    xf0.q = cqVar.W(512);
                }
                return;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.g);
            } else {
                i4 = 2;
            }
            iMin2 = 0;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj18 = arrayList5.get(i25);
                            i25++;
                            bq bqVar17 = (bq) obj18;
                            bqVar17.h();
                            bqVar17.a = false;
                            y70 y70Var114 = bqVar17.d;
                            ArrayList arrayList113 = arrayList5;
                            y70Var114.e.j = false;
                            y70Var114.g = false;
                            y70Var114.n();
                            zd1 zd1Var114 = bqVar17.e;
                            zd1Var114.e.j = false;
                            zd1Var114.g = false;
                            zd1Var114.m();
                            arrayList5 = arrayList113;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var115 = cqVar3.d;
                        y70Var115.e.j = false;
                        y70Var115.g = false;
                        y70Var115.n();
                        zd1 zd1Var115 = cqVar3.e;
                        zd1Var115.e.j = false;
                        zd1Var115.g = false;
                        zd1Var115.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj19 = arrayList5.get(i25);
                            i25++;
                            bq bqVar18 = (bq) obj19;
                            bqVar18.h();
                            bqVar18.a = false;
                            y70 y70Var116 = bqVar18.d;
                            ArrayList arrayList114 = arrayList5;
                            y70Var116.e.j = false;
                            y70Var116.g = false;
                            y70Var116.n();
                            zd1 zd1Var116 = bqVar18.e;
                            zd1Var116.e.j = false;
                            zd1Var116.g = false;
                            zd1Var116.m();
                            arrayList5 = arrayList114;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var117 = cqVar3.d;
                        y70Var117.e.j = false;
                        y70Var117.g = false;
                        y70Var117.n();
                        zd1 zd1Var117 = cqVar3.e;
                        zd1Var117.e.j = false;
                        zd1Var117.g = false;
                        zd1Var117.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i4114 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW7 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ10 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList115 = arrayList2;
                    bqVar2 = (bq) arrayList115.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA8 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA8;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList115;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4115 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4116 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i4117 = i15 + 1;
                    y6Var.N(cqVar, i4117, iQ2, iK);
                    i12 = i4117;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i4114;
            xf0.q = cqVar.W(512);
            iMin2 = iMax2;
            i4 = 2;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj110 = arrayList5.get(i25);
                            i25++;
                            bq bqVar19 = (bq) obj110;
                            bqVar19.h();
                            bqVar19.a = false;
                            y70 y70Var118 = bqVar19.d;
                            ArrayList arrayList116 = arrayList5;
                            y70Var118.e.j = false;
                            y70Var118.g = false;
                            y70Var118.n();
                            zd1 zd1Var118 = bqVar19.e;
                            zd1Var118.e.j = false;
                            zd1Var118.g = false;
                            zd1Var118.m();
                            arrayList5 = arrayList116;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var119 = cqVar3.d;
                        y70Var119.e.j = false;
                        y70Var119.g = false;
                        y70Var119.n();
                        zd1 zd1Var119 = cqVar3.e;
                        zd1Var119.e.j = false;
                        zd1Var119.g = false;
                        zd1Var119.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj111 = arrayList5.get(i25);
                            i25++;
                            bq bqVar110 = (bq) obj111;
                            bqVar110.h();
                            bqVar110.a = false;
                            y70 y70Var1110 = bqVar110.d;
                            ArrayList arrayList117 = arrayList5;
                            y70Var1110.e.j = false;
                            y70Var1110.g = false;
                            y70Var1110.n();
                            zd1 zd1Var1110 = bqVar110.e;
                            zd1Var1110.e.j = false;
                            zd1Var1110.g = false;
                            zd1Var1110.m();
                            arrayList5 = arrayList117;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var1111 = cqVar3.d;
                        y70Var1111.e.j = false;
                        y70Var1111.g = false;
                        y70Var1111.n();
                        zd1 zd1Var1111 = cqVar3.e;
                        zd1Var1111.e.j = false;
                        zd1Var1111.g = false;
                        zd1Var1111.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i4118 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW8 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ11 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList118 = arrayList2;
                    bqVar2 = (bq) arrayList118.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA9 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA9;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList118;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4119 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i41110 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i41111 = i15 + 1;
                    y6Var.N(cqVar, i41111, iQ2, iK);
                    i12 = i41111;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i4118;
            xf0.q = cqVar.W(512);
        }
        if (childCount2 == 0) {
            iMax = Math.max(0, this.f);
        } else {
            i36 = 2;
        }
        iMin = 0;
        if (mode2 != Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.g);
            } else {
                iMin2 = i38;
            }
            i4 = 2;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj112 = arrayList5.get(i25);
                            i25++;
                            bq bqVar111 = (bq) obj112;
                            bqVar111.h();
                            bqVar111.a = false;
                            y70 y70Var1112 = bqVar111.d;
                            ArrayList arrayList119 = arrayList5;
                            y70Var1112.e.j = false;
                            y70Var1112.g = false;
                            y70Var1112.n();
                            zd1 zd1Var1112 = bqVar111.e;
                            zd1Var1112.e.j = false;
                            zd1Var1112.g = false;
                            zd1Var1112.m();
                            arrayList5 = arrayList119;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var1113 = cqVar3.d;
                        y70Var1113.e.j = false;
                        y70Var1113.g = false;
                        y70Var1113.n();
                        zd1 zd1Var1113 = cqVar3.e;
                        zd1Var1113.e.j = false;
                        zd1Var1113.g = false;
                        zd1Var1113.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj113 = arrayList5.get(i25);
                            i25++;
                            bq bqVar112 = (bq) obj113;
                            bqVar112.h();
                            bqVar112.a = false;
                            y70 y70Var1114 = bqVar112.d;
                            ArrayList arrayList1110 = arrayList5;
                            y70Var1114.e.j = false;
                            y70Var1114.g = false;
                            y70Var1114.n();
                            zd1 zd1Var1114 = bqVar112.e;
                            zd1Var1114.e.j = false;
                            zd1Var1114.g = false;
                            zd1Var1114.m();
                            arrayList5 = arrayList1110;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var1115 = cqVar3.d;
                        y70Var1115.e.j = false;
                        y70Var1115.g = false;
                        y70Var1115.n();
                        zd1 zd1Var1115 = cqVar3.e;
                        zd1Var1115.e.j = false;
                        zd1Var1115.g = false;
                        zd1Var1115.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i41112 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW9 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ12 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList1111 = arrayList2;
                    bqVar2 = (bq) arrayList1111.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA10 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA10;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList1111;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i41113 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i41114 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i41115 = i15 + 1;
                    y6Var.N(cqVar, i41115, iQ2, iK);
                    i12 = i41115;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i41112;
            xf0.q = cqVar.W(512);
        }
        if (mode2 != 0) {
            if (mode2 != 1073741824) {
                i4 = 1;
            } else {
                iMin2 = Math.min(this.i - i39, i38);
                i4 = 1;
            }
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj114 = arrayList5.get(i25);
                            i25++;
                            bq bqVar113 = (bq) obj114;
                            bqVar113.h();
                            bqVar113.a = false;
                            y70 y70Var1116 = bqVar113.d;
                            ArrayList arrayList1112 = arrayList5;
                            y70Var1116.e.j = false;
                            y70Var1116.g = false;
                            y70Var1116.n();
                            zd1 zd1Var1116 = bqVar113.e;
                            zd1Var1116.e.j = false;
                            zd1Var1116.g = false;
                            zd1Var1116.m();
                            arrayList5 = arrayList1112;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var1117 = cqVar3.d;
                        y70Var1117.e.j = false;
                        y70Var1117.g = false;
                        y70Var1117.n();
                        zd1 zd1Var1117 = cqVar3.e;
                        zd1Var1117.e.j = false;
                        zd1Var1117.g = false;
                        zd1Var1117.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj115 = arrayList5.get(i25);
                            i25++;
                            bq bqVar114 = (bq) obj115;
                            bqVar114.h();
                            bqVar114.a = false;
                            y70 y70Var1118 = bqVar114.d;
                            ArrayList arrayList1113 = arrayList5;
                            y70Var1118.e.j = false;
                            y70Var1118.g = false;
                            y70Var1118.n();
                            zd1 zd1Var1118 = bqVar114.e;
                            zd1Var1118.e.j = false;
                            zd1Var1118.g = false;
                            zd1Var1118.m();
                            arrayList5 = arrayList1113;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var1119 = cqVar3.d;
                        y70Var1119.e.j = false;
                        y70Var1119.g = false;
                        y70Var1119.n();
                        zd1 zd1Var1119 = cqVar3.e;
                        zd1Var1119.e.j = false;
                        zd1Var1119.g = false;
                        zd1Var1119.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i41116 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW10 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ13 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList1114 = arrayList2;
                    bqVar2 = (bq) arrayList1114.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA11 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA11;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList1114;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i41117 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i41118 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i41119 = i15 + 1;
                    y6Var.N(cqVar, i41119, iQ2, iK);
                    i12 = i41119;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i41116;
            xf0.q = cqVar.W(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.g);
        } else {
            i4 = 2;
        }
        iMin2 = 0;
        iQ = cqVar.q();
        jtVar = cqVar.s0;
        iArr = cqVar.C;
        i5 = iMin;
        if (i5 == iQ) {
            jtVar.c = true;
        } else {
            jtVar.c = true;
        }
        cqVar.Y = 0;
        cqVar.Z = 0;
        iArr[0] = this.h - i40;
        iArr[1] = this.i - i39;
        cqVar.b0 = 0;
        cqVar.c0 = 0;
        cqVar.M(i36);
        cqVar.O(i5);
        cqVar.N(i4);
        cqVar.L(iMin2);
        i6 = this.f - i40;
        if (i6 < 0) {
            cqVar.b0 = 0;
        } else {
            cqVar.b0 = i6;
        }
        i7 = this.g - i39;
        if (i7 < 0) {
            cqVar.c0 = 0;
        } else {
            cqVar.c0 = i7;
        }
        cqVar.x0 = iMax7;
        cqVar.y0 = iMax5;
        y6Var = cqVar.r0;
        cqVar2 = (cq) y6Var.f;
        arrayList = (ArrayList) y6Var.d;
        spVar = cqVar.u0;
        size = cqVar.q0.size();
        iQ2 = cqVar.q();
        iK = cqVar.k();
        zP = th1.p(i, 128);
        if (zP) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i33 = 0;
            while (true) {
                if (i33 < size) {
                    z13 = z;
                    bqVar4 = (bq) cqVar.q0.get(i33);
                    i34 = i33;
                    iArr3 = bqVar4.p0;
                    i8 = size;
                    if (iArr3[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr3[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (bqVar4.x()) {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    } else {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    }
                    i9 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i8 = size;
            i9 = 1073741824;
        }
        z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
        if (z3) {
            iMin3 = Math.min(iArr[0], i37);
            iMin4 = Math.min(iArr[1], i38);
            i22 = 1073741824;
            if (mode == 1073741824) {
                if (cqVar.q() != iMin3) {
                    cqVar.O(iMin3);
                    jtVar.b = true;
                }
                i22 = 1073741824;
            }
            if (mode2 == i22) {
                cqVar.L(iMin4);
                jtVar.b = true;
            }
            if (mode == i22) {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj116 = arrayList5.get(i25);
                        i25++;
                        bq bqVar115 = (bq) obj116;
                        bqVar115.h();
                        bqVar115.a = false;
                        y70 y70Var11110 = bqVar115.d;
                        ArrayList arrayList1115 = arrayList5;
                        y70Var11110.e.j = false;
                        y70Var11110.g = false;
                        y70Var11110.n();
                        zd1 zd1Var11110 = bqVar115.e;
                        zd1Var11110.e.j = false;
                        zd1Var11110.g = false;
                        zd1Var11110.m();
                        arrayList5 = arrayList1115;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var11111 = cqVar3.d;
                    y70Var11111.e.j = false;
                    y70Var11111.g = false;
                    y70Var11111.n();
                    zd1 zd1Var11111 = cqVar3.e;
                    zd1Var11111.e.j = false;
                    zd1Var11111.g = false;
                    zd1Var11111.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj117 = arrayList5.get(i25);
                        i25++;
                        bq bqVar116 = (bq) obj117;
                        bqVar116.h();
                        bqVar116.a = false;
                        y70 y70Var11112 = bqVar116.d;
                        ArrayList arrayList1116 = arrayList5;
                        y70Var11112.e.j = false;
                        y70Var11112.g = false;
                        y70Var11112.n();
                        zd1 zd1Var11112 = bqVar116.e;
                        zd1Var11112.e.j = false;
                        zd1Var11112.g = false;
                        zd1Var11112.m();
                        arrayList5 = arrayList1116;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var11113 = cqVar3.d;
                    y70Var11113.e.j = false;
                    y70Var11113.g = false;
                    y70Var11113.n();
                    zd1 zd1Var11113 = cqVar3.e;
                    zd1Var11113.e.j = false;
                    zd1Var11113.g = false;
                    zd1Var11113.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            }
            if (zT) {
                if (mode == i24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i24) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cqVar.P(z10, z11);
            }
        } else {
            z3 = z3;
            arrayList2 = arrayList;
            spVar2 = spVar;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        int i411110 = cqVar.D0;
        if (i8 > 0) {
            size3 = cqVar.q0.size();
            boolean zW11 = cqVar.W(64);
            spVar6 = cqVar.u0;
            while (i19 < size3) {
                bqVar3 = (bq) cqVar.q0.get(i19);
                if (!(bqVar3 instanceof k70)) {
                    iJ = bqVar3.j(0);
                    int iJ14 = bqVar3.j(1);
                    if (iJ == 3) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    if (z9) {
                        y6Var.A(0, spVar6, bqVar3);
                    }
                }
            }
            constraintLayout = spVar6.a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.d;
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((pp) arrayList4.get(i21)).getClass();
                }
            }
        }
        y6Var.P(cqVar);
        size2 = arrayList2.size();
        if (i8 > 0) {
            y6Var.N(cqVar, 0, iQ2, iK);
        }
        if (size2 > 0) {
            iArr2 = cqVar.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            iMax3 = Math.max(cqVar.q(), cqVar2.b0);
            iMax4 = Math.max(cqVar.k(), cqVar2.c0);
            i11 = 0;
            zA = false;
            while (i11 < size2) {
                ArrayList arrayList1117 = arrayList2;
                bqVar2 = (bq) arrayList1117.get(i11);
                if (bqVar2 instanceof u10) {
                    z7 = z5;
                    spVar5 = spVar2;
                } else {
                    iQ5 = bqVar2.q();
                    iK4 = bqVar2.k();
                    z7 = z5;
                    spVar5 = spVar2;
                    boolean zA12 = zA | y6Var.A(1, spVar5, bqVar2);
                    iQ6 = bqVar2.q();
                    z8 = zA12;
                    iK5 = bqVar2.k();
                    if (iQ6 != iQ5) {
                        bqVar2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                        }
                        z8 = true;
                    }
                    if (iK5 != iK4) {
                        bqVar2.L(iK5);
                        if (z7) {
                            iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                        }
                        z8 = true;
                    }
                    zA = z8 | ((u10) bqVar2).y0;
                }
                i11++;
                spVar2 = spVar5;
                arrayList2 = arrayList1117;
                z5 = z7;
            }
            z6 = z5;
            arrayList3 = arrayList2;
            i12 = 0;
            while (true) {
                spVar3 = spVar2;
                if (i12 < 2) {
                    break;
                    break;
                }
                i13 = 0;
                while (i13 < size2) {
                    bqVar = (bq) arrayList3.get(i13);
                    if (bqVar instanceof v70) {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i411111 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    } else {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i411112 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    }
                    i13 = i17 + 1;
                    size2 = i16;
                    spVar3 = spVar4;
                    i12 = i18;
                }
                i14 = size2;
                spVar2 = spVar3;
                i15 = i12;
                if (zA) {
                    break;
                    break;
                }
                int i411113 = i15 + 1;
                y6Var.N(cqVar, i411113, iQ2, iK);
                i12 = i411113;
                size2 = i14;
                zA = false;
            }
        }
        cqVar.D0 = i411110;
        xf0.q = cqVar.W(512);
        iMin2 = iMax2;
        i4 = 2;
        iQ = cqVar.q();
        jtVar = cqVar.s0;
        iArr = cqVar.C;
        i5 = iMin;
        if (i5 == iQ) {
            jtVar.c = true;
        } else {
            jtVar.c = true;
        }
        cqVar.Y = 0;
        cqVar.Z = 0;
        iArr[0] = this.h - i40;
        iArr[1] = this.i - i39;
        cqVar.b0 = 0;
        cqVar.c0 = 0;
        cqVar.M(i36);
        cqVar.O(i5);
        cqVar.N(i4);
        cqVar.L(iMin2);
        i6 = this.f - i40;
        if (i6 < 0) {
            cqVar.b0 = 0;
        } else {
            cqVar.b0 = i6;
        }
        i7 = this.g - i39;
        if (i7 < 0) {
            cqVar.c0 = 0;
        } else {
            cqVar.c0 = i7;
        }
        cqVar.x0 = iMax7;
        cqVar.y0 = iMax5;
        y6Var = cqVar.r0;
        cqVar2 = (cq) y6Var.f;
        arrayList = (ArrayList) y6Var.d;
        spVar = cqVar.u0;
        size = cqVar.q0.size();
        iQ2 = cqVar.q();
        iK = cqVar.k();
        zP = th1.p(i, 128);
        if (zP) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i33 = 0;
            while (true) {
                if (i33 < size) {
                    z13 = z;
                    bqVar4 = (bq) cqVar.q0.get(i33);
                    i34 = i33;
                    iArr3 = bqVar4.p0;
                    i8 = size;
                    if (iArr3[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr3[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (bqVar4.x()) {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    } else {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    }
                    i9 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i8 = size;
            i9 = 1073741824;
        }
        z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
        if (z3) {
            iMin3 = Math.min(iArr[0], i37);
            iMin4 = Math.min(iArr[1], i38);
            i22 = 1073741824;
            if (mode == 1073741824) {
                if (cqVar.q() != iMin3) {
                    cqVar.O(iMin3);
                    jtVar.b = true;
                }
                i22 = 1073741824;
            }
            if (mode2 == i22) {
                cqVar.L(iMin4);
                jtVar.b = true;
            }
            if (mode == i22) {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj118 = arrayList5.get(i25);
                        i25++;
                        bq bqVar117 = (bq) obj118;
                        bqVar117.h();
                        bqVar117.a = false;
                        y70 y70Var11114 = bqVar117.d;
                        ArrayList arrayList1118 = arrayList5;
                        y70Var11114.e.j = false;
                        y70Var11114.g = false;
                        y70Var11114.n();
                        zd1 zd1Var11114 = bqVar117.e;
                        zd1Var11114.e.j = false;
                        zd1Var11114.g = false;
                        zd1Var11114.m();
                        arrayList5 = arrayList1118;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var11115 = cqVar3.d;
                    y70Var11115.e.j = false;
                    y70Var11115.g = false;
                    y70Var11115.n();
                    zd1 zd1Var11115 = cqVar3.e;
                    zd1Var11115.e.j = false;
                    zd1Var11115.g = false;
                    zd1Var11115.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj119 = arrayList5.get(i25);
                        i25++;
                        bq bqVar118 = (bq) obj119;
                        bqVar118.h();
                        bqVar118.a = false;
                        y70 y70Var11116 = bqVar118.d;
                        ArrayList arrayList1119 = arrayList5;
                        y70Var11116.e.j = false;
                        y70Var11116.g = false;
                        y70Var11116.n();
                        zd1 zd1Var11116 = bqVar118.e;
                        zd1Var11116.e.j = false;
                        zd1Var11116.g = false;
                        zd1Var11116.m();
                        arrayList5 = arrayList1119;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var11117 = cqVar3.d;
                    y70Var11117.e.j = false;
                    y70Var11117.g = false;
                    y70Var11117.n();
                    zd1 zd1Var11117 = cqVar3.e;
                    zd1Var11117.e.j = false;
                    zd1Var11117.g = false;
                    zd1Var11117.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            }
            if (zT) {
                if (mode == i24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i24) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cqVar.P(z10, z11);
            }
        } else {
            z3 = z3;
            arrayList2 = arrayList;
            spVar2 = spVar;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        int i411114 = cqVar.D0;
        if (i8 > 0) {
            size3 = cqVar.q0.size();
            boolean zW12 = cqVar.W(64);
            spVar6 = cqVar.u0;
            while (i19 < size3) {
                bqVar3 = (bq) cqVar.q0.get(i19);
                if (!(bqVar3 instanceof k70)) {
                    iJ = bqVar3.j(0);
                    int iJ15 = bqVar3.j(1);
                    if (iJ == 3) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    if (z9) {
                        y6Var.A(0, spVar6, bqVar3);
                    }
                }
            }
            constraintLayout = spVar6.a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.d;
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((pp) arrayList4.get(i21)).getClass();
                }
            }
        }
        y6Var.P(cqVar);
        size2 = arrayList2.size();
        if (i8 > 0) {
            y6Var.N(cqVar, 0, iQ2, iK);
        }
        if (size2 > 0) {
            iArr2 = cqVar.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            iMax3 = Math.max(cqVar.q(), cqVar2.b0);
            iMax4 = Math.max(cqVar.k(), cqVar2.c0);
            i11 = 0;
            zA = false;
            while (i11 < size2) {
                ArrayList arrayList11110 = arrayList2;
                bqVar2 = (bq) arrayList11110.get(i11);
                if (bqVar2 instanceof u10) {
                    z7 = z5;
                    spVar5 = spVar2;
                } else {
                    iQ5 = bqVar2.q();
                    iK4 = bqVar2.k();
                    z7 = z5;
                    spVar5 = spVar2;
                    boolean zA13 = zA | y6Var.A(1, spVar5, bqVar2);
                    iQ6 = bqVar2.q();
                    z8 = zA13;
                    iK5 = bqVar2.k();
                    if (iQ6 != iQ5) {
                        bqVar2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                        }
                        z8 = true;
                    }
                    if (iK5 != iK4) {
                        bqVar2.L(iK5);
                        if (z7) {
                            iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                        }
                        z8 = true;
                    }
                    zA = z8 | ((u10) bqVar2).y0;
                }
                i11++;
                spVar2 = spVar5;
                arrayList2 = arrayList11110;
                z5 = z7;
            }
            z6 = z5;
            arrayList3 = arrayList2;
            i12 = 0;
            while (true) {
                spVar3 = spVar2;
                if (i12 < 2) {
                    break;
                    break;
                }
                i13 = 0;
                while (i13 < size2) {
                    bqVar = (bq) arrayList3.get(i13);
                    if (bqVar instanceof v70) {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i411115 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    } else {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i411116 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    }
                    i13 = i17 + 1;
                    size2 = i16;
                    spVar3 = spVar4;
                    i12 = i18;
                }
                i14 = size2;
                spVar2 = spVar3;
                i15 = i12;
                if (zA) {
                    break;
                    break;
                }
                int i411117 = i15 + 1;
                y6Var.N(cqVar, i411117, iQ2, iK);
                i12 = i411117;
                size2 = i14;
                zA = false;
            }
        }
        cqVar.D0 = i411114;
        xf0.q = cqVar.W(512);
        iMin = iMax;
        i36 = 2;
        if (mode2 != Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.g);
            } else {
                iMin2 = i38;
            }
            i4 = 2;
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj1110 = arrayList5.get(i25);
                            i25++;
                            bq bqVar119 = (bq) obj1110;
                            bqVar119.h();
                            bqVar119.a = false;
                            y70 y70Var11118 = bqVar119.d;
                            ArrayList arrayList11111 = arrayList5;
                            y70Var11118.e.j = false;
                            y70Var11118.g = false;
                            y70Var11118.n();
                            zd1 zd1Var11118 = bqVar119.e;
                            zd1Var11118.e.j = false;
                            zd1Var11118.g = false;
                            zd1Var11118.m();
                            arrayList5 = arrayList11111;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var11119 = cqVar3.d;
                        y70Var11119.e.j = false;
                        y70Var11119.g = false;
                        y70Var11119.n();
                        zd1 zd1Var11119 = cqVar3.e;
                        zd1Var11119.e.j = false;
                        zd1Var11119.g = false;
                        zd1Var11119.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj1111 = arrayList5.get(i25);
                            i25++;
                            bq bqVar1110 = (bq) obj1111;
                            bqVar1110.h();
                            bqVar1110.a = false;
                            y70 y70Var111110 = bqVar1110.d;
                            ArrayList arrayList11112 = arrayList5;
                            y70Var111110.e.j = false;
                            y70Var111110.g = false;
                            y70Var111110.n();
                            zd1 zd1Var111110 = bqVar1110.e;
                            zd1Var111110.e.j = false;
                            zd1Var111110.g = false;
                            zd1Var111110.m();
                            arrayList5 = arrayList11112;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var111111 = cqVar3.d;
                        y70Var111111.e.j = false;
                        y70Var111111.g = false;
                        y70Var111111.n();
                        zd1 zd1Var111111 = cqVar3.e;
                        zd1Var111111.e.j = false;
                        zd1Var111111.g = false;
                        zd1Var111111.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i411118 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW13 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ16 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList11113 = arrayList2;
                    bqVar2 = (bq) arrayList11113.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA14 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA14;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList11113;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i411119 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4111110 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i4111111 = i15 + 1;
                    y6Var.N(cqVar, i4111111, iQ2, iK);
                    i12 = i4111111;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i411118;
            xf0.q = cqVar.W(512);
        }
        if (mode2 != 0) {
            if (mode2 != 1073741824) {
                i4 = 1;
            } else {
                iMin2 = Math.min(this.i - i39, i38);
                i4 = 1;
            }
            iQ = cqVar.q();
            jtVar = cqVar.s0;
            iArr = cqVar.C;
            i5 = iMin;
            if (i5 == iQ) {
                jtVar.c = true;
            } else {
                jtVar.c = true;
            }
            cqVar.Y = 0;
            cqVar.Z = 0;
            iArr[0] = this.h - i40;
            iArr[1] = this.i - i39;
            cqVar.b0 = 0;
            cqVar.c0 = 0;
            cqVar.M(i36);
            cqVar.O(i5);
            cqVar.N(i4);
            cqVar.L(iMin2);
            i6 = this.f - i40;
            if (i6 < 0) {
                cqVar.b0 = 0;
            } else {
                cqVar.b0 = i6;
            }
            i7 = this.g - i39;
            if (i7 < 0) {
                cqVar.c0 = 0;
            } else {
                cqVar.c0 = i7;
            }
            cqVar.x0 = iMax7;
            cqVar.y0 = iMax5;
            y6Var = cqVar.r0;
            cqVar2 = (cq) y6Var.f;
            arrayList = (ArrayList) y6Var.d;
            spVar = cqVar.u0;
            size = cqVar.q0.size();
            iQ2 = cqVar.q();
            iK = cqVar.k();
            zP = th1.p(i, 128);
            if (zP) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        z13 = z;
                        bqVar4 = (bq) cqVar.q0.get(i33);
                        i34 = i33;
                        iArr3 = bqVar4.p0;
                        i8 = size;
                        if (iArr3[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr3[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (bqVar4.x()) {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        } else {
                            i33 = i34 + 1;
                            z = z13;
                            size = i8;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i8 = size;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i8 = size;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
            if (z3) {
                iMin3 = Math.min(iArr[0], i37);
                iMin4 = Math.min(iArr[1], i38);
                i22 = 1073741824;
                if (mode == 1073741824) {
                    if (cqVar.q() != iMin3) {
                        cqVar.O(iMin3);
                        jtVar.b = true;
                    }
                    i22 = 1073741824;
                }
                if (mode2 == i22) {
                    cqVar.L(iMin4);
                    jtVar.b = true;
                }
                if (mode == i22) {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj1112 = arrayList5.get(i25);
                            i25++;
                            bq bqVar1111 = (bq) obj1112;
                            bqVar1111.h();
                            bqVar1111.a = false;
                            y70 y70Var111112 = bqVar1111.d;
                            ArrayList arrayList11114 = arrayList5;
                            y70Var111112.e.j = false;
                            y70Var111112.g = false;
                            y70Var111112.n();
                            zd1 zd1Var111112 = bqVar1111.e;
                            zd1Var111112.e.j = false;
                            zd1Var111112.g = false;
                            zd1Var111112.m();
                            arrayList5 = arrayList11114;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var111113 = cqVar3.d;
                        y70Var111113.e.j = false;
                        y70Var111113.g = false;
                        y70Var111113.n();
                        zd1 zd1Var111113 = cqVar3.e;
                        zd1Var111113.e.j = false;
                        zd1Var111113.g = false;
                        zd1Var111113.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                } else {
                    z3 = z3;
                    arrayList2 = arrayList;
                    spVar2 = spVar;
                    cqVar3 = jtVar.a;
                    if (jtVar.b) {
                        arrayList5 = cqVar3.q0;
                        size5 = arrayList5.size();
                        i25 = 0;
                        while (i25 < size5) {
                            Object obj1113 = arrayList5.get(i25);
                            i25++;
                            bq bqVar1112 = (bq) obj1113;
                            bqVar1112.h();
                            bqVar1112.a = false;
                            y70 y70Var111114 = bqVar1112.d;
                            ArrayList arrayList11115 = arrayList5;
                            y70Var111114.e.j = false;
                            y70Var111114.g = false;
                            y70Var111114.n();
                            zd1 zd1Var111114 = bqVar1112.e;
                            zd1Var111114.e.j = false;
                            zd1Var111114.g = false;
                            zd1Var111114.m();
                            arrayList5 = arrayList11115;
                        }
                        i23 = 0;
                        cqVar3.h();
                        cqVar3.a = false;
                        y70 y70Var111115 = cqVar3.d;
                        y70Var111115.e.j = false;
                        y70Var111115.g = false;
                        y70Var111115.n();
                        zd1 zd1Var111115 = cqVar3.e;
                        zd1Var111115.e.j = false;
                        zd1Var111115.g = false;
                        zd1Var111115.m();
                        jtVar.c();
                    } else {
                        i23 = 0;
                    }
                    jtVar.b(jtVar.d);
                    cqVar3.Y = i23;
                    cqVar3.Z = i23;
                    cqVar3.d.h.d(i23);
                    cqVar3.e.h.d(i23);
                    i24 = 1073741824;
                    if (mode == 1073741824) {
                        zT = cqVar.T(i23, zP);
                        i10 = 1;
                    } else {
                        i10 = 0;
                        zT = true;
                    }
                    if (mode2 == 1073741824) {
                        zT &= cqVar.T(1, zP);
                        i10++;
                    }
                }
                if (zT) {
                    if (mode == i24) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cqVar.P(z10, z11);
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            int i4111112 = cqVar.D0;
            if (i8 > 0) {
                size3 = cqVar.q0.size();
                boolean zW14 = cqVar.W(64);
                spVar6 = cqVar.u0;
                while (i19 < size3) {
                    bqVar3 = (bq) cqVar.q0.get(i19);
                    if (!(bqVar3 instanceof k70)) {
                        iJ = bqVar3.j(0);
                        int iJ17 = bqVar3.j(1);
                        if (iJ == 3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            y6Var.A(0, spVar6, bqVar3);
                        }
                    }
                }
                constraintLayout = spVar6.a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.d;
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((pp) arrayList4.get(i21)).getClass();
                    }
                }
            }
            y6Var.P(cqVar);
            size2 = arrayList2.size();
            if (i8 > 0) {
                y6Var.N(cqVar, 0, iQ2, iK);
            }
            if (size2 > 0) {
                iArr2 = cqVar.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMax3 = Math.max(cqVar.q(), cqVar2.b0);
                iMax4 = Math.max(cqVar.k(), cqVar2.c0);
                i11 = 0;
                zA = false;
                while (i11 < size2) {
                    ArrayList arrayList11116 = arrayList2;
                    bqVar2 = (bq) arrayList11116.get(i11);
                    if (bqVar2 instanceof u10) {
                        z7 = z5;
                        spVar5 = spVar2;
                    } else {
                        iQ5 = bqVar2.q();
                        iK4 = bqVar2.k();
                        z7 = z5;
                        spVar5 = spVar2;
                        boolean zA15 = zA | y6Var.A(1, spVar5, bqVar2);
                        iQ6 = bqVar2.q();
                        z8 = zA15;
                        iK5 = bqVar2.k();
                        if (iQ6 != iQ5) {
                            bqVar2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                            }
                            z8 = true;
                        }
                        if (iK5 != iK4) {
                            bqVar2.L(iK5);
                            if (z7) {
                                iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                            }
                            z8 = true;
                        }
                        zA = z8 | ((u10) bqVar2).y0;
                    }
                    i11++;
                    spVar2 = spVar5;
                    arrayList2 = arrayList11116;
                    z5 = z7;
                }
                z6 = z5;
                arrayList3 = arrayList2;
                i12 = 0;
                while (true) {
                    spVar3 = spVar2;
                    if (i12 < 2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (i13 < size2) {
                        bqVar = (bq) arrayList3.get(i13);
                        if (bqVar instanceof v70) {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4111113 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        } else {
                            i16 = size2;
                            if (bqVar.g0 == 8) {
                                spVar4 = spVar3;
                                i18 = i12;
                                i17 = i13;
                            } else {
                                iQ3 = bqVar.q();
                                iK2 = bqVar.k();
                                i17 = i13;
                                int i4111114 = bqVar.a0;
                                zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                                spVar4 = spVar3;
                                iQ4 = bqVar.q();
                                i18 = i12;
                                iK3 = bqVar.k();
                                if (iQ4 != iQ3) {
                                    bqVar.O(iQ4);
                                    if (!z4) {
                                    }
                                    zA = true;
                                }
                                if (iK3 != iK2) {
                                    bqVar.L(iK3);
                                    if (!z6) {
                                    }
                                    zA = true;
                                }
                                if (!bqVar.E) {
                                }
                            }
                        }
                        i13 = i17 + 1;
                        size2 = i16;
                        spVar3 = spVar4;
                        i12 = i18;
                    }
                    i14 = size2;
                    spVar2 = spVar3;
                    i15 = i12;
                    if (zA) {
                        break;
                        break;
                    }
                    int i4111115 = i15 + 1;
                    y6Var.N(cqVar, i4111115, iQ2, iK);
                    i12 = i4111115;
                    size2 = i14;
                    zA = false;
                }
            }
            cqVar.D0 = i4111112;
            xf0.q = cqVar.W(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.g);
        } else {
            i4 = 2;
        }
        iMin2 = 0;
        iQ = cqVar.q();
        jtVar = cqVar.s0;
        iArr = cqVar.C;
        i5 = iMin;
        if (i5 == iQ) {
            jtVar.c = true;
        } else {
            jtVar.c = true;
        }
        cqVar.Y = 0;
        cqVar.Z = 0;
        iArr[0] = this.h - i40;
        iArr[1] = this.i - i39;
        cqVar.b0 = 0;
        cqVar.c0 = 0;
        cqVar.M(i36);
        cqVar.O(i5);
        cqVar.N(i4);
        cqVar.L(iMin2);
        i6 = this.f - i40;
        if (i6 < 0) {
            cqVar.b0 = 0;
        } else {
            cqVar.b0 = i6;
        }
        i7 = this.g - i39;
        if (i7 < 0) {
            cqVar.c0 = 0;
        } else {
            cqVar.c0 = i7;
        }
        cqVar.x0 = iMax7;
        cqVar.y0 = iMax5;
        y6Var = cqVar.r0;
        cqVar2 = (cq) y6Var.f;
        arrayList = (ArrayList) y6Var.d;
        spVar = cqVar.u0;
        size = cqVar.q0.size();
        iQ2 = cqVar.q();
        iK = cqVar.k();
        zP = th1.p(i, 128);
        if (zP) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i33 = 0;
            while (true) {
                if (i33 < size) {
                    z13 = z;
                    bqVar4 = (bq) cqVar.q0.get(i33);
                    i34 = i33;
                    iArr3 = bqVar4.p0;
                    i8 = size;
                    if (iArr3[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr3[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (bqVar4.x()) {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    } else {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    }
                    i9 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i8 = size;
            i9 = 1073741824;
        }
        z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
        if (z3) {
            iMin3 = Math.min(iArr[0], i37);
            iMin4 = Math.min(iArr[1], i38);
            i22 = 1073741824;
            if (mode == 1073741824) {
                if (cqVar.q() != iMin3) {
                    cqVar.O(iMin3);
                    jtVar.b = true;
                }
                i22 = 1073741824;
            }
            if (mode2 == i22) {
                cqVar.L(iMin4);
                jtVar.b = true;
            }
            if (mode == i22) {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj1114 = arrayList5.get(i25);
                        i25++;
                        bq bqVar1113 = (bq) obj1114;
                        bqVar1113.h();
                        bqVar1113.a = false;
                        y70 y70Var111116 = bqVar1113.d;
                        ArrayList arrayList11117 = arrayList5;
                        y70Var111116.e.j = false;
                        y70Var111116.g = false;
                        y70Var111116.n();
                        zd1 zd1Var111116 = bqVar1113.e;
                        zd1Var111116.e.j = false;
                        zd1Var111116.g = false;
                        zd1Var111116.m();
                        arrayList5 = arrayList11117;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var111117 = cqVar3.d;
                    y70Var111117.e.j = false;
                    y70Var111117.g = false;
                    y70Var111117.n();
                    zd1 zd1Var111117 = cqVar3.e;
                    zd1Var111117.e.j = false;
                    zd1Var111117.g = false;
                    zd1Var111117.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj1115 = arrayList5.get(i25);
                        i25++;
                        bq bqVar1114 = (bq) obj1115;
                        bqVar1114.h();
                        bqVar1114.a = false;
                        y70 y70Var111118 = bqVar1114.d;
                        ArrayList arrayList11118 = arrayList5;
                        y70Var111118.e.j = false;
                        y70Var111118.g = false;
                        y70Var111118.n();
                        zd1 zd1Var111118 = bqVar1114.e;
                        zd1Var111118.e.j = false;
                        zd1Var111118.g = false;
                        zd1Var111118.m();
                        arrayList5 = arrayList11118;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var111119 = cqVar3.d;
                    y70Var111119.e.j = false;
                    y70Var111119.g = false;
                    y70Var111119.n();
                    zd1 zd1Var111119 = cqVar3.e;
                    zd1Var111119.e.j = false;
                    zd1Var111119.g = false;
                    zd1Var111119.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            }
            if (zT) {
                if (mode == i24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i24) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cqVar.P(z10, z11);
            }
        } else {
            z3 = z3;
            arrayList2 = arrayList;
            spVar2 = spVar;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        int i4111116 = cqVar.D0;
        if (i8 > 0) {
            size3 = cqVar.q0.size();
            boolean zW15 = cqVar.W(64);
            spVar6 = cqVar.u0;
            while (i19 < size3) {
                bqVar3 = (bq) cqVar.q0.get(i19);
                if (!(bqVar3 instanceof k70)) {
                    iJ = bqVar3.j(0);
                    int iJ18 = bqVar3.j(1);
                    if (iJ == 3) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    if (z9) {
                        y6Var.A(0, spVar6, bqVar3);
                    }
                }
            }
            constraintLayout = spVar6.a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.d;
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((pp) arrayList4.get(i21)).getClass();
                }
            }
        }
        y6Var.P(cqVar);
        size2 = arrayList2.size();
        if (i8 > 0) {
            y6Var.N(cqVar, 0, iQ2, iK);
        }
        if (size2 > 0) {
            iArr2 = cqVar.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            iMax3 = Math.max(cqVar.q(), cqVar2.b0);
            iMax4 = Math.max(cqVar.k(), cqVar2.c0);
            i11 = 0;
            zA = false;
            while (i11 < size2) {
                ArrayList arrayList11119 = arrayList2;
                bqVar2 = (bq) arrayList11119.get(i11);
                if (bqVar2 instanceof u10) {
                    z7 = z5;
                    spVar5 = spVar2;
                } else {
                    iQ5 = bqVar2.q();
                    iK4 = bqVar2.k();
                    z7 = z5;
                    spVar5 = spVar2;
                    boolean zA16 = zA | y6Var.A(1, spVar5, bqVar2);
                    iQ6 = bqVar2.q();
                    z8 = zA16;
                    iK5 = bqVar2.k();
                    if (iQ6 != iQ5) {
                        bqVar2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                        }
                        z8 = true;
                    }
                    if (iK5 != iK4) {
                        bqVar2.L(iK5);
                        if (z7) {
                            iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                        }
                        z8 = true;
                    }
                    zA = z8 | ((u10) bqVar2).y0;
                }
                i11++;
                spVar2 = spVar5;
                arrayList2 = arrayList11119;
                z5 = z7;
            }
            z6 = z5;
            arrayList3 = arrayList2;
            i12 = 0;
            while (true) {
                spVar3 = spVar2;
                if (i12 < 2) {
                    break;
                    break;
                }
                i13 = 0;
                while (i13 < size2) {
                    bqVar = (bq) arrayList3.get(i13);
                    if (bqVar instanceof v70) {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i4111117 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    } else {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i4111118 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    }
                    i13 = i17 + 1;
                    size2 = i16;
                    spVar3 = spVar4;
                    i12 = i18;
                }
                i14 = size2;
                spVar2 = spVar3;
                i15 = i12;
                if (zA) {
                    break;
                    break;
                }
                int i4111119 = i15 + 1;
                y6Var.N(cqVar, i4111119, iQ2, iK);
                i12 = i4111119;
                size2 = i14;
                zA = false;
            }
        }
        cqVar.D0 = i4111116;
        xf0.q = cqVar.W(512);
        iMin2 = iMax2;
        i4 = 2;
        iQ = cqVar.q();
        jtVar = cqVar.s0;
        iArr = cqVar.C;
        i5 = iMin;
        if (i5 == iQ) {
            jtVar.c = true;
        } else {
            jtVar.c = true;
        }
        cqVar.Y = 0;
        cqVar.Z = 0;
        iArr[0] = this.h - i40;
        iArr[1] = this.i - i39;
        cqVar.b0 = 0;
        cqVar.c0 = 0;
        cqVar.M(i36);
        cqVar.O(i5);
        cqVar.N(i4);
        cqVar.L(iMin2);
        i6 = this.f - i40;
        if (i6 < 0) {
            cqVar.b0 = 0;
        } else {
            cqVar.b0 = i6;
        }
        i7 = this.g - i39;
        if (i7 < 0) {
            cqVar.c0 = 0;
        } else {
            cqVar.c0 = i7;
        }
        cqVar.x0 = iMax7;
        cqVar.y0 = iMax5;
        y6Var = cqVar.r0;
        cqVar2 = (cq) y6Var.f;
        arrayList = (ArrayList) y6Var.d;
        spVar = cqVar.u0;
        size = cqVar.q0.size();
        iQ2 = cqVar.q();
        iK = cqVar.k();
        zP = th1.p(i, 128);
        if (zP) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i33 = 0;
            while (true) {
                if (i33 < size) {
                    z13 = z;
                    bqVar4 = (bq) cqVar.q0.get(i33);
                    i34 = i33;
                    iArr3 = bqVar4.p0;
                    i8 = size;
                    if (iArr3[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr3[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (bqVar4.x()) {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    } else {
                        i33 = i34 + 1;
                        z = z13;
                        size = i8;
                    }
                    i9 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i8 = size;
                    i9 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i8 = size;
            i9 = 1073741824;
        }
        z3 = z2 & ((mode != i9 && mode2 == i9) || zP);
        if (z3) {
            iMin3 = Math.min(iArr[0], i37);
            iMin4 = Math.min(iArr[1], i38);
            i22 = 1073741824;
            if (mode == 1073741824) {
                if (cqVar.q() != iMin3) {
                    cqVar.O(iMin3);
                    jtVar.b = true;
                }
                i22 = 1073741824;
            }
            if (mode2 == i22) {
                cqVar.L(iMin4);
                jtVar.b = true;
            }
            if (mode == i22) {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj1116 = arrayList5.get(i25);
                        i25++;
                        bq bqVar1115 = (bq) obj1116;
                        bqVar1115.h();
                        bqVar1115.a = false;
                        y70 y70Var1111110 = bqVar1115.d;
                        ArrayList arrayList111110 = arrayList5;
                        y70Var1111110.e.j = false;
                        y70Var1111110.g = false;
                        y70Var1111110.n();
                        zd1 zd1Var1111110 = bqVar1115.e;
                        zd1Var1111110.e.j = false;
                        zd1Var1111110.g = false;
                        zd1Var1111110.m();
                        arrayList5 = arrayList111110;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var1111111 = cqVar3.d;
                    y70Var1111111.e.j = false;
                    y70Var1111111.g = false;
                    y70Var1111111.n();
                    zd1 zd1Var1111111 = cqVar3.e;
                    zd1Var1111111.e.j = false;
                    zd1Var1111111.g = false;
                    zd1Var1111111.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            } else {
                z3 = z3;
                arrayList2 = arrayList;
                spVar2 = spVar;
                cqVar3 = jtVar.a;
                if (jtVar.b) {
                    arrayList5 = cqVar3.q0;
                    size5 = arrayList5.size();
                    i25 = 0;
                    while (i25 < size5) {
                        Object obj1117 = arrayList5.get(i25);
                        i25++;
                        bq bqVar1116 = (bq) obj1117;
                        bqVar1116.h();
                        bqVar1116.a = false;
                        y70 y70Var1111112 = bqVar1116.d;
                        ArrayList arrayList111111 = arrayList5;
                        y70Var1111112.e.j = false;
                        y70Var1111112.g = false;
                        y70Var1111112.n();
                        zd1 zd1Var1111112 = bqVar1116.e;
                        zd1Var1111112.e.j = false;
                        zd1Var1111112.g = false;
                        zd1Var1111112.m();
                        arrayList5 = arrayList111111;
                    }
                    i23 = 0;
                    cqVar3.h();
                    cqVar3.a = false;
                    y70 y70Var1111113 = cqVar3.d;
                    y70Var1111113.e.j = false;
                    y70Var1111113.g = false;
                    y70Var1111113.n();
                    zd1 zd1Var1111113 = cqVar3.e;
                    zd1Var1111113.e.j = false;
                    zd1Var1111113.g = false;
                    zd1Var1111113.m();
                    jtVar.c();
                } else {
                    i23 = 0;
                }
                jtVar.b(jtVar.d);
                cqVar3.Y = i23;
                cqVar3.Z = i23;
                cqVar3.d.h.d(i23);
                cqVar3.e.h.d(i23);
                i24 = 1073741824;
                if (mode == 1073741824) {
                    zT = cqVar.T(i23, zP);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= cqVar.T(1, zP);
                    i10++;
                }
            }
            if (zT) {
                if (mode == i24) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i24) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cqVar.P(z10, z11);
            }
        } else {
            z3 = z3;
            arrayList2 = arrayList;
            spVar2 = spVar;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        int i41111110 = cqVar.D0;
        if (i8 > 0) {
            size3 = cqVar.q0.size();
            boolean zW16 = cqVar.W(64);
            spVar6 = cqVar.u0;
            while (i19 < size3) {
                bqVar3 = (bq) cqVar.q0.get(i19);
                if (!(bqVar3 instanceof k70)) {
                    iJ = bqVar3.j(0);
                    int iJ19 = bqVar3.j(1);
                    if (iJ == 3) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    if (z9) {
                        y6Var.A(0, spVar6, bqVar3);
                    }
                }
            }
            constraintLayout = spVar6.a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.d;
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((pp) arrayList4.get(i21)).getClass();
                }
            }
        }
        y6Var.P(cqVar);
        size2 = arrayList2.size();
        if (i8 > 0) {
            y6Var.N(cqVar, 0, iQ2, iK);
        }
        if (size2 > 0) {
            iArr2 = cqVar.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            iMax3 = Math.max(cqVar.q(), cqVar2.b0);
            iMax4 = Math.max(cqVar.k(), cqVar2.c0);
            i11 = 0;
            zA = false;
            while (i11 < size2) {
                ArrayList arrayList111112 = arrayList2;
                bqVar2 = (bq) arrayList111112.get(i11);
                if (bqVar2 instanceof u10) {
                    z7 = z5;
                    spVar5 = spVar2;
                } else {
                    iQ5 = bqVar2.q();
                    iK4 = bqVar2.k();
                    z7 = z5;
                    spVar5 = spVar2;
                    boolean zA17 = zA | y6Var.A(1, spVar5, bqVar2);
                    iQ6 = bqVar2.q();
                    z8 = zA17;
                    iK5 = bqVar2.k();
                    if (iQ6 != iQ5) {
                        bqVar2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, bqVar2.i(4).e() + bqVar2.r() + bqVar2.U);
                        }
                        z8 = true;
                    }
                    if (iK5 != iK4) {
                        bqVar2.L(iK5);
                        if (z7) {
                            iMax4 = Math.max(iMax4, bqVar2.i(5).e() + bqVar2.s() + bqVar2.V);
                        }
                        z8 = true;
                    }
                    zA = z8 | ((u10) bqVar2).y0;
                }
                i11++;
                spVar2 = spVar5;
                arrayList2 = arrayList111112;
                z5 = z7;
            }
            z6 = z5;
            arrayList3 = arrayList2;
            i12 = 0;
            while (true) {
                spVar3 = spVar2;
                if (i12 < 2) {
                    break;
                    break;
                }
                i13 = 0;
                while (i13 < size2) {
                    bqVar = (bq) arrayList3.get(i13);
                    if (bqVar instanceof v70) {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i41111111 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    } else {
                        i16 = size2;
                        if (bqVar.g0 == 8) {
                            spVar4 = spVar3;
                            i18 = i12;
                            i17 = i13;
                        } else {
                            iQ3 = bqVar.q();
                            iK2 = bqVar.k();
                            i17 = i13;
                            int i41111112 = bqVar.a0;
                            zA |= y6Var.A(i12 == 1 ? 2 : 1, spVar3, bqVar);
                            spVar4 = spVar3;
                            iQ4 = bqVar.q();
                            i18 = i12;
                            iK3 = bqVar.k();
                            if (iQ4 != iQ3) {
                                bqVar.O(iQ4);
                                if (!z4) {
                                }
                                zA = true;
                            }
                            if (iK3 != iK2) {
                                bqVar.L(iK3);
                                if (!z6) {
                                }
                                zA = true;
                            }
                            if (!bqVar.E) {
                            }
                        }
                    }
                    i13 = i17 + 1;
                    size2 = i16;
                    spVar3 = spVar4;
                    i12 = i18;
                }
                i14 = size2;
                spVar2 = spVar3;
                i15 = i12;
                if (zA) {
                    break;
                    break;
                }
                int i41111113 = i15 + 1;
                y6Var.N(cqVar, i41111113, iQ2, iK);
                i12 = i41111113;
                size2 = i14;
                zA = false;
            }
        }
        cqVar.D0 = i41111110;
        xf0.q = cqVar.W(512);
    }

    public final void l(bq bqVar, rp rpVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.c.get(i);
        bq bqVar2 = (bq) sparseArray.get(i);
        if (bqVar2 == null || view == null || !(view.getLayoutParams() instanceof rp)) {
            return;
        }
        rpVar.c0 = true;
        if (i2 == 6) {
            rp rpVar2 = (rp) view.getLayoutParams();
            rpVar2.c0 = true;
            rpVar2.p0.E = true;
        }
        bqVar.i(6).b(bqVar2.i(i2), rpVar.D, rpVar.C, true);
        bqVar.E = true;
        bqVar.i(3).j();
        bqVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            rp rpVar = (rp) childAt.getLayoutParams();
            bq bqVar = rpVar.p0;
            if (childAt.getVisibility() != 8 || rpVar.d0 || rpVar.e0 || zIsInEditMode) {
                int iR = bqVar.r();
                int iS = bqVar.s();
                childAt.layout(iR, iS, bqVar.q() + iR, bqVar.k() + iS);
            }
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((pp) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:241:0x061d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0761  */
    /* JADX WARN: Code duplicated, block: B:309:0x076a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0775  */
    /* JADX WARN: Code duplicated, block: B:319:0x0792  */
    /* JADX WARN: Code duplicated, block: B:321:0x079e  */
    /* JADX WARN: Code duplicated, block: B:323:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:324:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:326:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:329:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:332:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:405:0x08e5  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        cq cqVar;
        boolean z;
        boolean z2;
        SparseArray sparseArray;
        boolean z3;
        int i3;
        int i4;
        int i5;
        float f;
        bq bqVar;
        bq bqVar2;
        bq bqVar3;
        int i6;
        int i7;
        int i8;
        int i9;
        bq bqVar4;
        float f2;
        int i10;
        bq bqVar5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f3;
        bq bqVar6;
        int i16;
        int i17;
        float fAbs;
        int i18;
        SparseArray sparseArray2;
        String str;
        int iF;
        int i19;
        SparseArray sparseArray3;
        aq aqVar;
        HashSet hashSet;
        cq cqVar2;
        boolean z4;
        boolean z5;
        int i20;
        cq cqVar3;
        String resourceEntryName;
        bq bqVar7;
        ConstraintLayout constraintLayout = this;
        boolean z6 = constraintLayout.j;
        constraintLayout.j = z6;
        if (!z6) {
            int childCount = constraintLayout.getChildCount();
            for (int i21 = 0; i21 < childCount; i21++) {
                if (constraintLayout.getChildAt(i21).isLayoutRequested()) {
                    constraintLayout.j = true;
                    break;
                }
            }
        }
        boolean z7 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        cq cqVar4 = constraintLayout.e;
        cqVar4.v0 = z7;
        if (constraintLayout.j) {
            constraintLayout.j = false;
            int childCount2 = constraintLayout.getChildCount();
            int i22 = 0;
            while (true) {
                if (i22 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i22).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i22++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i23 = 0; i23 < childCount3; i23++) {
                    bq bqVarH = constraintLayout.h(constraintLayout.getChildAt(i23));
                    if (bqVarH != null) {
                        bqVarH.C();
                    }
                }
                SparseArray sparseArray4 = constraintLayout.c;
                if (zIsInEditMode) {
                    for (int i24 = 0; i24 < childCount3; i24++) {
                        View childAt = constraintLayout.getChildAt(i24);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.o == null) {
                                    constraintLayout.o = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                try {
                                    constraintLayout.o.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray4.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                bqVar7 = viewFindViewById == constraintLayout ? cqVar4 : viewFindViewById == null ? null : ((rp) viewFindViewById.getLayoutParams()).p0;
                            }
                            bqVar7.h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                        }
                    }
                }
                if (constraintLayout.n != -1) {
                    for (int i25 = 0; i25 < childCount3; i25++) {
                        constraintLayout.getChildAt(i25).getId();
                    }
                }
                aq aqVar2 = constraintLayout.l;
                if (aqVar2 != null) {
                    int childCount4 = constraintLayout.getChildCount();
                    HashMap map = aqVar2.c;
                    HashSet<Integer> hashSet2 = new HashSet(map.keySet());
                    int i26 = 0;
                    while (i26 < childCount4) {
                        View childAt2 = constraintLayout.getChildAt(i26);
                        int id2 = childAt2.getId();
                        int i27 = i26;
                        if (map.containsKey(Integer.valueOf(id2))) {
                            if (aqVar2.b) {
                                i19 = -1;
                                if (id2 == -1) {
                                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                }
                            } else {
                                i19 = -1;
                            }
                            if (id2 != i19) {
                                if (map.containsKey(Integer.valueOf(id2))) {
                                    hashSet2.remove(Integer.valueOf(id2));
                                    vp vpVar = (vp) map.get(Integer.valueOf(id2));
                                    if (vpVar != null) {
                                        yp ypVar = vpVar.b;
                                        aqVar = aqVar2;
                                        wp wpVar = vpVar.d;
                                        hashSet = hashSet2;
                                        zp zpVar = vpVar.e;
                                        z4 = z;
                                        if (childAt2 instanceof yf) {
                                            wpVar.h0 = 1;
                                            yf yfVar = (yf) childAt2;
                                            yfVar.setId(id2);
                                            yfVar.setType(wpVar.f0);
                                            yfVar.setMargin(wpVar.g0);
                                            yfVar.setAllowsGoneWidget(wpVar.n0);
                                            int[] iArr = wpVar.i0;
                                            if (iArr != null) {
                                                yfVar.setReferencedIds(iArr);
                                            } else {
                                                String str2 = wpVar.j0;
                                                if (str2 != null) {
                                                    int[] iArrB = aq.b(yfVar, str2);
                                                    wpVar.i0 = iArrB;
                                                    yfVar.setReferencedIds(iArrB);
                                                }
                                            }
                                        }
                                        rp rpVar = (rp) childAt2.getLayoutParams();
                                        rpVar.a();
                                        vpVar.a(rpVar);
                                        HashMap map2 = vpVar.f;
                                        z5 = zIsInEditMode;
                                        Class<?> cls = childAt2.getClass();
                                        for (String str3 : map2.keySet()) {
                                            int i28 = childCount3;
                                            op opVar = (op) map2.get(str3);
                                            HashMap map3 = map2;
                                            String str4 = opVar.a ? str3 : "set" + str3;
                                            try {
                                                int iR = q51.r(opVar.b);
                                                Class<?> cls2 = Float.TYPE;
                                                Class<?> cls3 = Integer.TYPE;
                                                switch (iR) {
                                                    case 0:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, cls3).invoke(childAt2, Integer.valueOf(opVar.c));
                                                        break;
                                                    case 1:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, cls2).invoke(childAt2, Float.valueOf(opVar.d));
                                                        break;
                                                    case 2:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, cls3).invoke(childAt2, Integer.valueOf(opVar.g));
                                                        break;
                                                    case 3:
                                                        cqVar3 = cqVar4;
                                                        Method method = cls.getMethod(str4, Drawable.class);
                                                        ColorDrawable colorDrawable = new ColorDrawable();
                                                        colorDrawable.setColor(opVar.g);
                                                        method.invoke(childAt2, colorDrawable);
                                                        break;
                                                    case 4:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, CharSequence.class).invoke(childAt2, opVar.e);
                                                        break;
                                                    case 5:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(opVar.f));
                                                        break;
                                                    case 6:
                                                        cqVar3 = cqVar4;
                                                        cls.getMethod(str4, cls2).invoke(childAt2, Float.valueOf(opVar.d));
                                                        break;
                                                    case 7:
                                                        cqVar3 = cqVar4;
                                                        try {
                                                            cls.getMethod(str4, cls3).invoke(childAt2, Integer.valueOf(opVar.c));
                                                        } catch (IllegalAccessException e) {
                                                            e = e;
                                                            StringBuilder sbN = q51.n(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbN.append(cls.getName());
                                                            Log.e("TransitionLayout", sbN.toString(), e);
                                                        } catch (NoSuchMethodException e2) {
                                                            e = e2;
                                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4, e);
                                                        } catch (InvocationTargetException e3) {
                                                            e = e3;
                                                            StringBuilder sbN2 = q51.n(" Custom Attribute \"", str3, "\" not found on ");
                                                            sbN2.append(cls.getName());
                                                            Log.e("TransitionLayout", sbN2.toString(), e);
                                                        }
                                                        break;
                                                    default:
                                                        cqVar3 = cqVar4;
                                                        break;
                                                }
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                cqVar3 = cqVar4;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                cqVar3 = cqVar4;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                cqVar3 = cqVar4;
                                            }
                                            childCount3 = i28;
                                            map2 = map3;
                                            sparseArray4 = sparseArray4;
                                            cqVar4 = cqVar3;
                                        }
                                        sparseArray3 = sparseArray4;
                                        cqVar2 = cqVar4;
                                        i20 = childCount3;
                                        childAt2.setLayoutParams(rpVar);
                                        if (ypVar.b == 0) {
                                            childAt2.setVisibility(ypVar.a);
                                        }
                                        childAt2.setAlpha(ypVar.c);
                                        childAt2.setRotation(zpVar.a);
                                        childAt2.setRotationX(zpVar.b);
                                        childAt2.setRotationY(zpVar.c);
                                        childAt2.setScaleX(zpVar.d);
                                        childAt2.setScaleY(zpVar.e);
                                        if (zpVar.h != -1) {
                                            View viewFindViewById2 = ((View) childAt2.getParent()).findViewById(zpVar.h);
                                            if (viewFindViewById2 != null) {
                                                float bottom = (viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f;
                                                float right = (viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f;
                                                if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                    float left = right - childAt2.getLeft();
                                                    float top = bottom - childAt2.getTop();
                                                    childAt2.setPivotX(left);
                                                    childAt2.setPivotY(top);
                                                }
                                            }
                                        } else {
                                            if (!Float.isNaN(zpVar.f)) {
                                                childAt2.setPivotX(zpVar.f);
                                            }
                                            if (!Float.isNaN(zpVar.g)) {
                                                childAt2.setPivotY(zpVar.g);
                                            }
                                        }
                                        childAt2.setTranslationX(zpVar.i);
                                        childAt2.setTranslationY(zpVar.j);
                                        childAt2.setTranslationZ(zpVar.k);
                                        if (zpVar.l) {
                                            childAt2.setElevation(zpVar.m);
                                        }
                                    }
                                } else {
                                    sparseArray3 = sparseArray4;
                                    aqVar = aqVar2;
                                    hashSet = hashSet2;
                                    cqVar2 = cqVar4;
                                    z4 = z;
                                    z5 = zIsInEditMode;
                                    i20 = childCount3;
                                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                                }
                            }
                            i26 = i27 + 1;
                            aqVar2 = aqVar;
                            hashSet2 = hashSet;
                            z = z4;
                            zIsInEditMode = z5;
                            childCount3 = i20;
                            sparseArray4 = sparseArray3;
                            cqVar4 = cqVar2;
                        } else {
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused3) {
                                resourceEntryName = "UNKNOWN";
                            }
                            sb.append(resourceEntryName);
                            Log.w("ConstraintSet", sb.toString());
                        }
                        sparseArray3 = sparseArray4;
                        aqVar = aqVar2;
                        hashSet = hashSet2;
                        cqVar2 = cqVar4;
                        z4 = z;
                        z5 = zIsInEditMode;
                        i20 = childCount3;
                        i26 = i27 + 1;
                        aqVar2 = aqVar;
                        hashSet2 = hashSet;
                        z = z4;
                        zIsInEditMode = z5;
                        childCount3 = i20;
                        sparseArray4 = sparseArray3;
                        cqVar4 = cqVar2;
                    }
                    sparseArray = sparseArray4;
                    cq cqVar5 = cqVar4;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    for (Integer num : hashSet2) {
                        vp vpVar2 = (vp) map.get(num);
                        if (vpVar2 != null) {
                            wp wpVar2 = vpVar2.d;
                            if (wpVar2.h0 == 1) {
                                yf yfVar2 = new yf(constraintLayout.getContext());
                                yfVar2.setVisibility(8);
                                yfVar2.setId(num.intValue());
                                int[] iArr2 = wpVar2.i0;
                                if (iArr2 != null) {
                                    yfVar2.setReferencedIds(iArr2);
                                } else {
                                    String str5 = wpVar2.j0;
                                    if (str5 != null) {
                                        int[] iArrB2 = aq.b(yfVar2, str5);
                                        wpVar2.i0 = iArrB2;
                                        yfVar2.setReferencedIds(iArrB2);
                                    }
                                }
                                yfVar2.setType(wpVar2.f0);
                                yfVar2.setMargin(wpVar2.g0);
                                rp rpVarG = g();
                                yfVar2.i();
                                vpVar2.a(rpVarG);
                                constraintLayout.addView(yfVar2, rpVarG);
                            }
                            if (wpVar2.a) {
                                j70 j70Var = new j70(constraintLayout.getContext());
                                j70Var.setId(num.intValue());
                                rp rpVarG2 = g();
                                vpVar2.a(rpVarG2);
                                constraintLayout.addView(j70Var, rpVarG2);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < childCount4; i29++) {
                        View childAt3 = constraintLayout.getChildAt(i29);
                        if (childAt3 instanceof pp) {
                            ((pp) childAt3).e(constraintLayout);
                        }
                    }
                    cqVar = cqVar5;
                } else {
                    sparseArray = sparseArray4;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    cqVar = cqVar4;
                }
                cqVar.q0.clear();
                ArrayList arrayList = constraintLayout.d;
                int size = arrayList.size();
                if (size > 0) {
                    int i30 = 0;
                    while (i30 < size) {
                        pp ppVar = (pp) arrayList.get(i30);
                        HashMap map4 = ppVar.i;
                        if (ppVar.isInEditMode()) {
                            ppVar.setIds(ppVar.g);
                        }
                        v70 v70Var = ppVar.f;
                        if (v70Var == null) {
                            sparseArray2 = sparseArray;
                        } else {
                            v70Var.r0 = 0;
                            Arrays.fill(v70Var.q0, (Object) null);
                            int i31 = 0;
                            while (i31 < ppVar.d) {
                                int i32 = ppVar.c[i31];
                                SparseArray sparseArray5 = sparseArray;
                                View view = (View) sparseArray5.get(i32);
                                if (view == null && (iF = ppVar.f(constraintLayout, (str = (String) map4.get(Integer.valueOf(i32))))) != 0) {
                                    ppVar.c[i31] = iF;
                                    map4.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray5.get(iF);
                                }
                                if (view != null) {
                                    v70 v70Var2 = ppVar.f;
                                    bq bqVarH2 = constraintLayout.h(view);
                                    v70Var2.getClass();
                                    if (bqVarH2 != v70Var2 && bqVarH2 != null) {
                                        int i33 = v70Var2.r0 + 1;
                                        bq[] bqVarArr = v70Var2.q0;
                                        if (i33 > bqVarArr.length) {
                                            v70Var2.q0 = (bq[]) Arrays.copyOf(bqVarArr, bqVarArr.length * 2);
                                        }
                                        bq[] bqVarArr2 = v70Var2.q0;
                                        int i34 = v70Var2.r0;
                                        bqVarArr2[i34] = bqVarH2;
                                        v70Var2.r0 = i34 + 1;
                                    }
                                }
                                i31++;
                                sparseArray = sparseArray5;
                            }
                            sparseArray2 = sparseArray;
                            ppVar.f.S();
                        }
                        i30++;
                        sparseArray = sparseArray2;
                    }
                }
                int i35 = i3;
                for (int i36 = 0; i36 < i35; i36++) {
                    constraintLayout.getChildAt(i36);
                }
                SparseArray sparseArray6 = constraintLayout.p;
                sparseArray6.clear();
                sparseArray6.put(0, cqVar);
                sparseArray6.put(constraintLayout.getId(), cqVar);
                for (int i37 = 0; i37 < i35; i37++) {
                    View childAt4 = constraintLayout.getChildAt(i37);
                    sparseArray6.put(childAt4.getId(), constraintLayout.h(childAt4));
                }
                for (int i38 = 0; i38 < i35; i38++) {
                    View childAt5 = constraintLayout.getChildAt(i38);
                    bq bqVarH3 = constraintLayout.h(childAt5);
                    if (bqVarH3 != null) {
                        rp rpVar2 = (rp) childAt5.getLayoutParams();
                        cqVar.q0.add(bqVarH3);
                        bq bqVar8 = bqVarH3.T;
                        if (bqVar8 != null) {
                            ((cq) bqVar8).q0.remove(bqVarH3);
                            bqVarH3.C();
                        }
                        bqVarH3.T = cqVar;
                        rpVar2.a();
                        bqVarH3.g0 = childAt5.getVisibility();
                        bqVarH3.f0 = childAt5;
                        if (childAt5 instanceof pp) {
                            ((pp) childAt5).h(bqVarH3, cqVar.v0);
                        }
                        if (rpVar2.d0) {
                            k70 k70Var = (k70) bqVarH3;
                            int i39 = rpVar2.m0;
                            int i40 = rpVar2.n0;
                            float f4 = rpVar2.o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    k70Var.q0 = f4;
                                    k70Var.r0 = -1;
                                    k70Var.s0 = -1;
                                }
                            } else if (i39 != -1) {
                                if (i39 > -1) {
                                    k70Var.q0 = -1.0f;
                                    k70Var.r0 = i39;
                                    k70Var.s0 = -1;
                                }
                            } else if (i40 != -1 && i40 > -1) {
                                k70Var.q0 = -1.0f;
                                k70Var.r0 = -1;
                                k70Var.s0 = i40;
                            }
                        } else {
                            int i41 = rpVar2.f0;
                            int i42 = rpVar2.g0;
                            int i43 = rpVar2.h0;
                            int i44 = rpVar2.i0;
                            int i45 = rpVar2.j0;
                            int i46 = rpVar2.k0;
                            float f5 = rpVar2.l0;
                            int i47 = rpVar2.p;
                            if (i47 != -1) {
                                bq bqVar9 = (bq) sparseArray6.get(i47);
                                if (bqVar9 != null) {
                                    float f6 = rpVar2.r;
                                    bqVarH3.v(7, 7, rpVar2.q, 0, bqVar9);
                                    bqVarH3.D = f6;
                                }
                                bqVar5 = bqVarH3;
                                i11 = 4;
                                i12 = 2;
                                i7 = 5;
                                i14 = 3;
                            } else {
                                if (i41 != -1) {
                                    bq bqVar10 = (bq) sparseArray6.get(i41);
                                    if (bqVar10 != null) {
                                        i5 = i46;
                                        f = f5;
                                        i4 = i44;
                                        bqVarH3.v(2, 2, ((ViewGroup.MarginLayoutParams) rpVar2).leftMargin, i45, bqVar10);
                                    } else {
                                        i4 = i44;
                                        i5 = i46;
                                        f = f5;
                                    }
                                } else {
                                    i4 = i44;
                                    i5 = i46;
                                    if (i42 == -1 || (bqVar = (bq) sparseArray6.get(i42)) == null) {
                                        f = f5;
                                    } else {
                                        f = f5;
                                        bqVarH3.v(2, 4, ((ViewGroup.MarginLayoutParams) rpVar2).leftMargin, i45, bqVar);
                                    }
                                }
                                if (i43 != -1) {
                                    bq bqVar11 = (bq) sparseArray6.get(i43);
                                    if (bqVar11 != null) {
                                        bqVarH3.v(4, 2, ((ViewGroup.MarginLayoutParams) rpVar2).rightMargin, i5, bqVar11);
                                    }
                                } else {
                                    int i48 = i5;
                                    if (i4 != -1 && (bqVar2 = (bq) sparseArray6.get(i4)) != null) {
                                        bqVarH3.v(4, 4, ((ViewGroup.MarginLayoutParams) rpVar2).rightMargin, i48, bqVar2);
                                    }
                                }
                                int i49 = rpVar2.i;
                                if (i49 != -1) {
                                    bq bqVar12 = (bq) sparseArray6.get(i49);
                                    if (bqVar12 != null) {
                                        bqVarH3.v(3, 3, ((ViewGroup.MarginLayoutParams) rpVar2).topMargin, rpVar2.x, bqVar12);
                                    }
                                } else {
                                    int i50 = rpVar2.j;
                                    if (i50 != -1 && (bqVar3 = (bq) sparseArray6.get(i50)) != null) {
                                        i6 = -1;
                                        bqVarH3.v(3, 5, ((ViewGroup.MarginLayoutParams) rpVar2).topMargin, rpVar2.x, bqVar3);
                                    }
                                    i7 = 5;
                                    i8 = rpVar2.k;
                                    if (i8 != i6) {
                                        bqVar6 = (bq) sparseArray6.get(i8);
                                        if (bqVar6 != null) {
                                            bqVarH3.v(5, 3, ((ViewGroup.MarginLayoutParams) rpVar2).bottomMargin, rpVar2.z, bqVar6);
                                        }
                                    } else {
                                        i9 = rpVar2.l;
                                        if (i9 != i6 && (bqVar4 = (bq) sparseArray6.get(i9)) != null) {
                                            bqVarH3.v(5, 5, ((ViewGroup.MarginLayoutParams) rpVar2).bottomMargin, rpVar2.z, bqVar4);
                                        }
                                    }
                                    f2 = f;
                                    i10 = rpVar2.m;
                                    if (i10 != -1) {
                                        bqVar5 = bqVarH3;
                                        i11 = 4;
                                        i12 = 2;
                                        constraintLayout.l(bqVar5, rpVar2, sparseArray6, i10, 6);
                                        i14 = 3;
                                    } else {
                                        bqVar5 = bqVarH3;
                                        i11 = 4;
                                        i12 = 2;
                                        i13 = rpVar2.n;
                                        if (i13 != -1) {
                                            constraintLayout = this;
                                            constraintLayout.l(bqVar5, rpVar2, sparseArray6, i13, 3);
                                            i14 = 3;
                                        } else {
                                            i14 = 3;
                                            i15 = rpVar2.o;
                                            if (i15 != -1) {
                                                constraintLayout = this;
                                                constraintLayout.l(bqVar5, rpVar2, sparseArray6, i15, 5);
                                                i7 = 5;
                                            }
                                        }
                                        if (f2 >= 0.0f) {
                                            bqVar5.d0 = f2;
                                        }
                                        f3 = rpVar2.F;
                                        if (f3 >= 0.0f) {
                                            bqVar5.e0 = f3;
                                        }
                                    }
                                    constraintLayout = this;
                                    if (f2 >= 0.0f) {
                                        bqVar5.d0 = f2;
                                    }
                                    f3 = rpVar2.F;
                                    if (f3 >= 0.0f) {
                                        bqVar5.e0 = f3;
                                    }
                                }
                                i6 = -1;
                                i7 = 5;
                                i8 = rpVar2.k;
                                if (i8 != i6) {
                                    bqVar6 = (bq) sparseArray6.get(i8);
                                    if (bqVar6 != null) {
                                        bqVarH3.v(5, 3, ((ViewGroup.MarginLayoutParams) rpVar2).bottomMargin, rpVar2.z, bqVar6);
                                    }
                                } else {
                                    i9 = rpVar2.l;
                                    if (i9 != i6) {
                                        bqVarH3.v(5, 5, ((ViewGroup.MarginLayoutParams) rpVar2).bottomMargin, rpVar2.z, bqVar4);
                                    }
                                }
                                f2 = f;
                                i10 = rpVar2.m;
                                if (i10 != -1) {
                                    bqVar5 = bqVarH3;
                                    i11 = 4;
                                    i12 = 2;
                                    constraintLayout.l(bqVar5, rpVar2, sparseArray6, i10, 6);
                                    i14 = 3;
                                } else {
                                    bqVar5 = bqVarH3;
                                    i11 = 4;
                                    i12 = 2;
                                    i13 = rpVar2.n;
                                    if (i13 != -1) {
                                        constraintLayout = this;
                                        constraintLayout.l(bqVar5, rpVar2, sparseArray6, i13, 3);
                                        i14 = 3;
                                    } else {
                                        i14 = 3;
                                        i15 = rpVar2.o;
                                        if (i15 != -1) {
                                            constraintLayout = this;
                                            constraintLayout.l(bqVar5, rpVar2, sparseArray6, i15, 5);
                                            i7 = 5;
                                        }
                                    }
                                    if (f2 >= 0.0f) {
                                        bqVar5.d0 = f2;
                                    }
                                    f3 = rpVar2.F;
                                    if (f3 >= 0.0f) {
                                        bqVar5.e0 = f3;
                                    }
                                }
                                constraintLayout = this;
                                if (f2 >= 0.0f) {
                                    bqVar5.d0 = f2;
                                }
                                f3 = rpVar2.F;
                                if (f3 >= 0.0f) {
                                    bqVar5.e0 = f3;
                                }
                            }
                            if (z3 && ((i18 = rpVar2.T) != -1 || rpVar2.U != -1)) {
                                int i51 = rpVar2.U;
                                bqVar5.Y = i18;
                                bqVar5.Z = i51;
                            }
                            if (rpVar2.a0) {
                                bqVar5.M(1);
                                bqVar5.O(((ViewGroup.MarginLayoutParams) rpVar2).width);
                                if (((ViewGroup.MarginLayoutParams) rpVar2).width == -2) {
                                    bqVar5.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) rpVar2).width == -1) {
                                if (rpVar2.W) {
                                    bqVar5.M(3);
                                } else {
                                    bqVar5.M(4);
                                }
                                bqVar5.i(i12).g = ((ViewGroup.MarginLayoutParams) rpVar2).leftMargin;
                                bqVar5.i(i11).g = ((ViewGroup.MarginLayoutParams) rpVar2).rightMargin;
                            } else {
                                bqVar5.M(3);
                                bqVar5.O(0);
                            }
                            if (rpVar2.b0) {
                                bqVar5.N(1);
                                bqVar5.L(((ViewGroup.MarginLayoutParams) rpVar2).height);
                                if (((ViewGroup.MarginLayoutParams) rpVar2).height == -2) {
                                    bqVar5.N(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) rpVar2).height == -1) {
                                if (rpVar2.X) {
                                    bqVar5.N(3);
                                } else {
                                    bqVar5.N(4);
                                }
                                bqVar5.i(i14).g = ((ViewGroup.MarginLayoutParams) rpVar2).topMargin;
                                bqVar5.i(i7).g = ((ViewGroup.MarginLayoutParams) rpVar2).bottomMargin;
                            } else {
                                bqVar5.N(3);
                                bqVar5.L(0);
                            }
                            String str6 = rpVar2.G;
                            if (str6 == null || str6.length() == 0) {
                                bqVar5.W = 0.0f;
                            } else {
                                int length = str6.length();
                                int iIndexOf3 = str6.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i16 = 0;
                                    i17 = -1;
                                } else {
                                    String strSubstring = str6.substring(0, iIndexOf3);
                                    i17 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i16 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str6.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str6.substring(i16);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str6.substring(i16, iIndexOf4);
                                    String strSubstring4 = str6.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= 0.0f || f8 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i17 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused4) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    bqVar5.W = fAbs;
                                    bqVar5.X = i17;
                                }
                            }
                            float f9 = rpVar2.H;
                            float[] fArr = bqVar5.k0;
                            fArr[0] = f9;
                            fArr[1] = rpVar2.I;
                            bqVar5.i0 = rpVar2.J;
                            bqVar5.j0 = rpVar2.K;
                            int i52 = rpVar2.Z;
                            if (i52 >= 0 && i52 <= 3) {
                                bqVar5.q = i52;
                            }
                            int i53 = rpVar2.L;
                            int i54 = rpVar2.N;
                            int i55 = rpVar2.P;
                            float f10 = rpVar2.R;
                            bqVar5.r = i53;
                            bqVar5.u = i54;
                            if (i55 == Integer.MAX_VALUE) {
                                i55 = 0;
                            }
                            bqVar5.v = i55;
                            bqVar5.w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i53 == 0) {
                                bqVar5.r = 2;
                            }
                            int i56 = rpVar2.M;
                            int i57 = rpVar2.O;
                            int i58 = rpVar2.Q;
                            float f11 = rpVar2.S;
                            bqVar5.s = i56;
                            bqVar5.x = i57;
                            if (i58 == Integer.MAX_VALUE) {
                                i58 = 0;
                            }
                            bqVar5.y = i58;
                            bqVar5.z = f11;
                            if (f11 > 0.0f && f11 < 1.0f && i56 == 0) {
                                bqVar5.s = 2;
                            }
                        }
                    }
                }
            } else {
                cqVar = cqVar4;
                z2 = z;
            }
            if (z2) {
                cqVar.r0.P(cqVar);
            }
        } else {
            cqVar = cqVar4;
        }
        cqVar.w0.getClass();
        constraintLayout.k(cqVar, constraintLayout.k, i, i2);
        int iQ = cqVar.q();
        int iK = cqVar.k();
        boolean z8 = cqVar.E0;
        boolean z9 = cqVar.F0;
        sp spVar = constraintLayout.q;
        int i59 = spVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + spVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i59, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.h, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.i, iResolveSizeAndState2);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bq bqVarH = h(view);
        if ((view instanceof j70) && !(bqVarH instanceof k70)) {
            rp rpVar = (rp) view.getLayoutParams();
            k70 k70Var = new k70();
            rpVar.p0 = k70Var;
            rpVar.d0 = true;
            k70Var.S(rpVar.V);
        }
        if (view instanceof pp) {
            pp ppVar = (pp) view;
            ppVar.i();
            ((rp) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.d;
            if (!arrayList.contains(ppVar)) {
                arrayList.add(ppVar);
            }
        }
        this.c.put(view.getId(), view);
        this.j = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view.getId());
        bq bqVarH = h(view);
        this.e.q0.remove(bqVarH);
        bqVarH.C();
        this.d.remove(view);
        this.j = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    public void setConstraintSet(aq aqVar) {
        this.l = aqVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.c;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(dq dqVar) {
        bc bcVar = this.m;
        if (bcVar != null) {
            bcVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.k = i;
        cq cqVar = this.e;
        cqVar.D0 = i;
        xf0.q = cqVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new SparseArray();
        this.d = new ArrayList(4);
        this.e = new cq();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new sp(this, this);
        i(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new SparseArray();
        this.d = new ArrayList(4);
        this.e = new cq();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new sp(this, this);
        i(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new SparseArray();
        this.d = new ArrayList(4);
        this.e = new cq();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new sp(this, this);
        i(attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        rp rpVar = new rp(layoutParams);
        rpVar.a = -1;
        rpVar.b = -1;
        rpVar.c = -1.0f;
        rpVar.d = true;
        rpVar.e = -1;
        rpVar.f = -1;
        rpVar.g = -1;
        rpVar.h = -1;
        rpVar.i = -1;
        rpVar.j = -1;
        rpVar.k = -1;
        rpVar.l = -1;
        rpVar.m = -1;
        rpVar.n = -1;
        rpVar.o = -1;
        rpVar.p = -1;
        rpVar.q = 0;
        rpVar.r = 0.0f;
        rpVar.s = -1;
        rpVar.t = -1;
        rpVar.u = -1;
        rpVar.v = -1;
        rpVar.w = Integer.MIN_VALUE;
        rpVar.x = Integer.MIN_VALUE;
        rpVar.y = Integer.MIN_VALUE;
        rpVar.z = Integer.MIN_VALUE;
        rpVar.A = Integer.MIN_VALUE;
        rpVar.B = Integer.MIN_VALUE;
        rpVar.C = Integer.MIN_VALUE;
        rpVar.D = 0;
        rpVar.E = 0.5f;
        rpVar.F = 0.5f;
        rpVar.G = null;
        rpVar.H = -1.0f;
        rpVar.I = -1.0f;
        rpVar.J = 0;
        rpVar.K = 0;
        rpVar.L = 0;
        rpVar.M = 0;
        rpVar.N = 0;
        rpVar.O = 0;
        rpVar.P = 0;
        rpVar.Q = 0;
        rpVar.R = 1.0f;
        rpVar.S = 1.0f;
        rpVar.T = -1;
        rpVar.U = -1;
        rpVar.V = -1;
        rpVar.W = false;
        rpVar.X = false;
        rpVar.Y = null;
        rpVar.Z = 0;
        rpVar.a0 = true;
        rpVar.b0 = true;
        rpVar.c0 = false;
        rpVar.d0 = false;
        rpVar.e0 = false;
        rpVar.f0 = -1;
        rpVar.g0 = -1;
        rpVar.h0 = -1;
        rpVar.i0 = -1;
        rpVar.j0 = Integer.MIN_VALUE;
        rpVar.k0 = Integer.MIN_VALUE;
        rpVar.l0 = 0.5f;
        rpVar.p0 = new bq();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) rpVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) rpVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) rpVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) rpVar).bottomMargin = marginLayoutParams.bottomMargin;
            rpVar.setMarginStart(marginLayoutParams.getMarginStart());
            rpVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof rp)) {
            return rpVar;
        }
        rp rpVar2 = (rp) layoutParams;
        rpVar.a = rpVar2.a;
        rpVar.b = rpVar2.b;
        rpVar.c = rpVar2.c;
        rpVar.d = rpVar2.d;
        rpVar.e = rpVar2.e;
        rpVar.f = rpVar2.f;
        rpVar.g = rpVar2.g;
        rpVar.h = rpVar2.h;
        rpVar.i = rpVar2.i;
        rpVar.j = rpVar2.j;
        rpVar.k = rpVar2.k;
        rpVar.l = rpVar2.l;
        rpVar.m = rpVar2.m;
        rpVar.n = rpVar2.n;
        rpVar.o = rpVar2.o;
        rpVar.p = rpVar2.p;
        rpVar.q = rpVar2.q;
        rpVar.r = rpVar2.r;
        rpVar.s = rpVar2.s;
        rpVar.t = rpVar2.t;
        rpVar.u = rpVar2.u;
        rpVar.v = rpVar2.v;
        rpVar.w = rpVar2.w;
        rpVar.x = rpVar2.x;
        rpVar.y = rpVar2.y;
        rpVar.z = rpVar2.z;
        rpVar.A = rpVar2.A;
        rpVar.B = rpVar2.B;
        rpVar.C = rpVar2.C;
        rpVar.D = rpVar2.D;
        rpVar.E = rpVar2.E;
        rpVar.F = rpVar2.F;
        rpVar.G = rpVar2.G;
        rpVar.H = rpVar2.H;
        rpVar.I = rpVar2.I;
        rpVar.J = rpVar2.J;
        rpVar.K = rpVar2.K;
        rpVar.W = rpVar2.W;
        rpVar.X = rpVar2.X;
        rpVar.L = rpVar2.L;
        rpVar.M = rpVar2.M;
        rpVar.N = rpVar2.N;
        rpVar.P = rpVar2.P;
        rpVar.O = rpVar2.O;
        rpVar.Q = rpVar2.Q;
        rpVar.R = rpVar2.R;
        rpVar.S = rpVar2.S;
        rpVar.T = rpVar2.T;
        rpVar.U = rpVar2.U;
        rpVar.V = rpVar2.V;
        rpVar.a0 = rpVar2.a0;
        rpVar.b0 = rpVar2.b0;
        rpVar.c0 = rpVar2.c0;
        rpVar.d0 = rpVar2.d0;
        rpVar.f0 = rpVar2.f0;
        rpVar.g0 = rpVar2.g0;
        rpVar.h0 = rpVar2.h0;
        rpVar.i0 = rpVar2.i0;
        rpVar.j0 = rpVar2.j0;
        rpVar.k0 = rpVar2.k0;
        rpVar.l0 = rpVar2.l0;
        rpVar.Y = rpVar2.Y;
        rpVar.Z = rpVar2.Z;
        rpVar.p0 = rpVar2.p0;
        return rpVar;
    }
}
