package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.ax0;
import defpackage.ds;
import defpackage.dx0;
import defpackage.ex0;
import defpackage.fw0;
import defpackage.fx0;
import defpackage.ge1;
import defpackage.gw0;
import defpackage.gx0;
import defpackage.hb;
import defpackage.hw0;
import defpackage.hx0;
import defpackage.i51;
import defpackage.id;
import defpackage.ie1;
import defpackage.iw0;
import defpackage.ju;
import defpackage.jx0;
import defpackage.kp0;
import defpackage.l7;
import defpackage.lk0;
import defpackage.lw0;
import defpackage.m7;
import defpackage.mv0;
import defpackage.mw0;
import defpackage.nh0;
import defpackage.nw0;
import defpackage.oe1;
import defpackage.ol;
import defpackage.ow0;
import defpackage.p60;
import defpackage.pe1;
import defpackage.q51;
import defpackage.qs;
import defpackage.r60;
import defpackage.rw0;
import defpackage.sw0;
import defpackage.te1;
import defpackage.tu0;
import defpackage.tw0;
import defpackage.ui0;
import defpackage.um;
import defpackage.uw0;
import defpackage.uy;
import defpackage.vl0;
import defpackage.vw0;
import defpackage.wf0;
import defpackage.ws0;
import defpackage.ww0;
import defpackage.xh0;
import defpackage.xw0;
import defpackage.y90;
import defpackage.yw0;
import defpackage.zw0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean C0 = false;
    public static boolean D0 = false;
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final float F0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean G0;
    public static final boolean H0;
    public static final Class[] I0;
    public static final gw0 J0;
    public static final ex0 K0;
    public boolean A;
    public final hw0 A0;
    public int B;
    public final ju B0;
    public boolean C;
    public final AccessibilityManager D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public mw0 I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public nw0 N;
    public int O;
    public int P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final int W;
    public final int a0;
    public final float b0;
    public final float c;
    public final float c0;
    public final ws0 d;
    public boolean d0;
    public final yw0 e;
    public final gx0 e0;
    public ax0 f;
    public r60 f0;
    public final m7 g;
    public final p60 g0;
    public final ol h;
    public final dx0 h0;
    public final ui0 i;
    public vw0 i0;
    public boolean j;
    public ArrayList j0;
    public final fw0 k;
    public boolean k0;
    public final Rect l;
    public boolean l0;
    public final Rect m;
    public final hw0 m0;
    public final RectF n;
    public boolean n0;
    public iw0 o;
    public jx0 o0;
    public rw0 p;
    public final int[] p0;
    public final ArrayList q;
    public kp0 q0;
    public final ArrayList r;
    public final int[] r0;
    public final ArrayList s;
    public final int[] s0;
    public uw0 t;
    public final int[] t0;
    public boolean u;
    public final ArrayList u0;
    public boolean v;
    public final fw0 v0;
    public boolean w;
    public boolean w0;
    public int x;
    public int x0;
    public boolean y;
    public int y0;
    public boolean z;
    public final boolean z0;

    static {
        G0 = Build.VERSION.SDK_INT >= 23;
        H0 = true;
        Class cls = Integer.TYPE;
        I0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        J0 = new gw0(0);
        K0 = new ex0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        float fA;
        int i2;
        Throwable th;
        char c;
        char c2;
        char c3;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        int i3 = 1;
        this.d = new ws0(i3, this);
        this.e = new yw0(this);
        this.i = new ui0(15);
        this.k = new fw0(this, 0);
        this.l = new Rect();
        this.m = new Rect();
        this.n = new RectF();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = K0;
        this.N = new qs();
        this.O = 0;
        this.P = -1;
        this.b0 = Float.MIN_VALUE;
        this.c0 = Float.MIN_VALUE;
        this.d0 = true;
        this.e0 = new gx0(this);
        this.g0 = H0 ? new p60() : null;
        dx0 dx0Var = new dx0();
        dx0Var.a = -1;
        dx0Var.b = 0;
        dx0Var.c = 0;
        dx0Var.d = 1;
        dx0Var.e = 0;
        dx0Var.f = false;
        dx0Var.g = false;
        dx0Var.h = false;
        dx0Var.i = false;
        dx0Var.j = false;
        dx0Var.k = false;
        this.h0 = dx0Var;
        this.k0 = false;
        this.l0 = false;
        hw0 hw0Var = new hw0(this);
        this.m0 = hw0Var;
        this.n0 = false;
        this.p0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new ArrayList();
        this.v0 = new fw0(this, i3);
        this.x0 = 0;
        this.y0 = 0;
        this.A0 = new hw0(this);
        this.B0 = new ju(getContext(), new hw0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = pe1.a;
            fA = hb.d(viewConfiguration);
        } else {
            fA = pe1.a(viewConfiguration, context);
        }
        this.b0 = fA;
        this.c0 = i4 >= 26 ? hb.e(viewConfiguration) : pe1.a(viewConfiguration, context);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.c = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.a = hw0Var;
        this.g = new m7(new hw0(this));
        this.h = new ol(new hw0(this));
        WeakHashMap weakHashMap = oe1.a;
        if ((i4 >= 26 ? ie1.a(this) : 0) == 0 && i4 >= 26) {
            ie1.d(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new jx0(this));
        int[] iArr = mv0.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        oe1.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                id.q("Trying to set fast scroller without both required drawables.".concat(B()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            c3 = 1;
            i2 = 4;
            th = null;
            c = 3;
            new uy(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            th = null;
            c = 3;
            c2 = 2;
            c3 = 1;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.z0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                th = null;
                                nh0.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                th = null;
                                nh0.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e3) {
                                e = e3;
                                th = null;
                                nh0.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                th = null;
                                nh0.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(rw0.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(I0);
                            objArr = new Object[i2];
                            objArr[0] = context;
                            objArr[c3] = attributeSet;
                            objArr[c2] = Integer.valueOf(i);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            try {
                                constructor = clsAsSubclass.getConstructor(th);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((rw0) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        nh0.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                        throw null;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                } catch (IllegalAccessException e9) {
                    e = e9;
                } catch (InstantiationException e10) {
                    e = e10;
                } catch (InvocationTargetException e11) {
                    e = e11;
                }
            }
        }
        int[] iArr2 = E0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        oe1.m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.anydesk.anydeskandroid.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewG = G(viewGroup.getChildAt(i));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static hx0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((sw0) view.getLayoutParams()).a;
    }

    private kp0 getScrollingChildHelper() {
        if (this.q0 == null) {
            this.q0 = new kp0(this);
        }
        return this.q0;
    }

    public static void l(hx0 hx0Var) {
        WeakReference weakReference = hx0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == hx0Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            hx0Var.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ds.r(edgeEffect) != 0.0f) {
            int iRound = Math.round(ds.x(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || ds.r(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(ds.x(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        C0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        D0 = z;
    }

    public final void A() {
        if (this.K != null) {
            return;
        }
        ((ex0) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.j) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.o + ", layout:" + this.p + ", context:" + getContext();
    }

    public final void C(dx0 dx0Var) {
        if (getScrollState() != 2) {
            dx0Var.getClass();
            return;
        }
        OverScroller overScroller = this.e0.e;
        overScroller.getFinalX();
        overScroller.getCurrX();
        dx0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            uw0 uw0Var = (uw0) arrayList.get(i);
            if (uw0Var.b(motionEvent) && action != 3) {
                this.t = uw0Var;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        ol olVar = this.h;
        int iE = olVar.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iE; i3++) {
            hx0 hx0VarM = M(olVar.d(i3));
            if (!hx0VarM.p()) {
                int iC = hx0VarM.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final hx0 H(int i) {
        hx0 hx0Var = null;
        if (this.E) {
            return null;
        }
        ol olVar = this.h;
        int iH = olVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            hx0 hx0VarM = M(olVar.g(i2));
            if (hx0VarM != null && !hx0VarM.i() && J(hx0VarM) == i) {
                if (!olVar.c.contains(hx0VarM.a)) {
                    return hx0VarM;
                }
                hx0Var = hx0VarM;
            }
        }
        return hx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean I(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.z) {
            boolean zD = rw0Var.d();
            boolean zE = this.p.e();
            if (!zD || Math.abs(i) < i3) {
                i = 0;
            }
            if (!zE || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.J;
                    if (edgeEffect == null || ds.r(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.L;
                        if (edgeEffect2 == null || ds.r(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (i0(this.L, i, getWidth())) {
                            this.L.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (i0(this.J, i6, getWidth())) {
                            this.J.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i2 == 0) {
                    i5 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.K;
                    if (edgeEffect3 == null || ds.r(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.M;
                        if (edgeEffect4 == null || ds.r(edgeEffect4) == 0.0f) {
                            i5 = i2;
                            i2 = 0;
                        } else if (i0(this.M, i2, getHeight())) {
                            this.M.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (i0(this.K, i7, getHeight())) {
                            this.K.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    i5 = 0;
                }
                gx0 gx0Var = this.e0;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i4;
                    iMax = Math.max(i8, Math.min(iMax, i4));
                    i2 = Math.max(i8, Math.min(i2, i4));
                    m0(1);
                    gx0Var.a(iMax, i2);
                }
                if (i != 0 || i5 != 0) {
                    float f = i;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = zD || zE;
                        dispatchNestedFling(f, f2, z);
                        if (z) {
                            m0(1);
                            int i9 = -i4;
                            gx0Var.a(Math.max(i9, Math.min(i, i4)), Math.max(i9, Math.min(i5, i4)));
                            return true;
                        }
                    }
                } else if (iMax != 0 || i2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int J(hx0 hx0Var) {
        if ((hx0Var.j & 524) == 0 && hx0Var.f()) {
            int i = hx0Var.c;
            ArrayList arrayList = (ArrayList) this.g.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                l7 l7Var = (l7) arrayList.get(i2);
                int i3 = l7Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = l7Var.b;
                        if (i4 <= i) {
                            int i5 = l7Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = l7Var.b;
                        if (i6 == i) {
                            i = l7Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (l7Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (l7Var.b <= i) {
                    i += l7Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long K(hx0 hx0Var) {
        return this.o.b ? hx0Var.e : hx0Var.c;
    }

    public final hx0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        nh0.k("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect N(View view) {
        sw0 sw0Var = (sw0) view.getLayoutParams();
        boolean z = sw0Var.c;
        Rect rect = sw0Var.b;
        if (!z || (this.h0.g && (sw0Var.a.l() || sw0Var.a.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.l;
            rect2.set(0, 0, 0, 0);
            ((ow0) arrayList.get(i)).c(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        sw0Var.c = false;
        return rect;
    }

    public final boolean O() {
        return !this.w || this.E || this.g.j();
    }

    public final boolean P() {
        return this.G > 0;
    }

    public final void Q(int i) {
        if (this.p == null) {
            return;
        }
        setScrollState(2);
        this.p.q0(i);
        awakenScrollBars();
    }

    public final void R() {
        ol olVar = this.h;
        int iH = olVar.h();
        for (int i = 0; i < iH; i++) {
            ((sw0) olVar.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.e.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sw0 sw0Var = (sw0) ((hx0) arrayList.get(i2)).a.getLayoutParams();
            if (sw0Var != null) {
                sw0Var.c = true;
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3 = i + i2;
        ol olVar = this.h;
        int iH = olVar.h();
        for (int i4 = 0; i4 < iH; i4++) {
            hx0 hx0VarM = M(olVar.g(i4));
            if (hx0VarM != null && !hx0VarM.p()) {
                int i5 = hx0VarM.c;
                dx0 dx0Var = this.h0;
                if (i5 >= i3) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + hx0VarM + " now at position " + (hx0VarM.c - i2));
                    }
                    hx0VarM.m(-i2, z);
                    dx0Var.f = true;
                } else if (i5 >= i) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + hx0VarM + " now REMOVED");
                    }
                    hx0VarM.a(8);
                    hx0VarM.m(-i2, z);
                    hx0VarM.c = i - 1;
                    dx0Var.f = true;
                }
            }
        }
        yw0 yw0Var = this.e;
        ArrayList arrayList = (ArrayList) yw0Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hx0 hx0Var = (hx0) arrayList.get(size);
            if (hx0Var != null) {
                int i6 = hx0Var.c;
                if (i6 >= i3) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + hx0Var + " now at position " + (hx0Var.c - i2));
                    }
                    hx0Var.m(-i2, z);
                } else if (i6 >= i) {
                    hx0Var.a(8);
                    yw0Var.l(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.G++;
    }

    public final void U(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 < 1) {
            if (C0 && i2 < 0) {
                nh0.j("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
                return;
            }
            this.G = 0;
            if (z) {
                int i3 = this.B;
                this.B = 0;
                if (i3 != 0 && (accessibilityManager = this.D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    hx0 hx0Var = (hx0) arrayList.get(size);
                    if (hx0Var.a.getParent() == this && !hx0Var.p() && (i = hx0Var.q) != -1) {
                        hx0Var.a.setImportantForAccessibility(i);
                        hx0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.T = x;
            this.R = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.U = y;
            this.S = y;
        }
    }

    public final void W() {
        if (this.n0 || !this.u) {
            return;
        }
        WeakHashMap weakHashMap = oe1.a;
        postOnAnimation(this.v0);
        this.n0 = true;
    }

    public final void X() {
        boolean z;
        boolean z2 = this.E;
        m7 m7Var = this.g;
        boolean z3 = false;
        if (z2) {
            m7Var.q((ArrayList) m7Var.c);
            m7Var.q((ArrayList) m7Var.d);
            m7Var.a = 0;
            if (this.F) {
                this.p.Z();
            }
        }
        if (this.N != null && this.p.C0()) {
            m7Var.p();
        } else {
            m7Var.d();
        }
        boolean z4 = this.k0 || this.l0;
        boolean z5 = this.w && this.N != null && ((z = this.E) || z4 || this.p.f) && (!z || this.o.b);
        dx0 dx0Var = this.h0;
        dx0Var.j = z5;
        if (z5 && z4 && !this.E && this.N != null && this.p.C0()) {
            z3 = true;
        }
        dx0Var.k = z3;
    }

    public final void Y(boolean z) {
        this.F = z | this.F;
        this.E = true;
        ol olVar = this.h;
        int iH = olVar.h();
        for (int i = 0; i < iH; i++) {
            hx0 hx0VarM = M(olVar.g(i));
            if (hx0VarM != null && !hx0VarM.p()) {
                hx0VarM.a(6);
            }
        }
        R();
        yw0 yw0Var = this.e;
        ArrayList arrayList = (ArrayList) yw0Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hx0 hx0Var = (hx0) arrayList.get(i2);
            if (hx0Var != null) {
                hx0Var.a(6);
                hx0Var.a(1024);
            }
        }
        iw0 iw0Var = ((RecyclerView) yw0Var.h).o;
        if (iw0Var == null || !iw0Var.b) {
            yw0Var.k();
        }
    }

    public final void Z(hx0 hx0Var, vl0 vl0Var) {
        hx0Var.j &= -8193;
        boolean z = this.h0.h;
        ui0 ui0Var = this.i;
        if (z && hx0Var.l() && !hx0Var.i() && !hx0Var.p()) {
            ((xh0) ui0Var.d).g(hx0Var, K(hx0Var));
        }
        i51 i51Var = (i51) ui0Var.e;
        te1 te1VarA = (te1) i51Var.get(hx0Var);
        if (te1VarA == null) {
            te1VarA = te1.a();
            i51Var.put(hx0Var, te1VarA);
        }
        te1VarA.b = vl0Var;
        te1VarA.a |= 4;
    }

    public final void a0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.J.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            rw0Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final int b0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.J;
        float f2 = 0.0f;
        if (edgeEffect == null || ds.r(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && ds.r(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.L;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fX = ds.x(edgeEffect3, width, height);
                    if (ds.r(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f2 = fX;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.J;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ds.x(edgeEffect4, -width, 1.0f - height);
                if (ds.r(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int c0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.K;
        float f2 = 0.0f;
        if (edgeEffect == null || ds.r(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && ds.r(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.M;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fX = ds.x(edgeEffect3, height, 1.0f - width);
                    if (ds.r(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f2 = fX;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.K;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ds.x(edgeEffect4, -height, width);
                if (ds.r(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof sw0) && this.p.f((sw0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.d()) {
            return this.p.j(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.d()) {
            return this.p.k(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.d()) {
            return this.p.l(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.e()) {
            return this.p.m(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.e()) {
            return this.p.n(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        rw0 rw0Var = this.p;
        if (rw0Var != null && rw0Var.e()) {
            return this.p.o(this.h0);
        }
        return 0;
    }

    public final void d0(ow0 ow0Var) {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            rw0Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.r;
        arrayList.remove(ow0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        R();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        rw0 layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        j0(0, measuredHeight, false);
                        return true;
                    }
                    j0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zL = layoutManager.L();
                    if (keyCode == 122) {
                        if (zL) {
                            iA = getAdapter().a();
                        }
                    } else if (!zL) {
                        iA = getAdapter().a();
                    }
                    k0(iA);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        j0(measuredWidth, 0, false);
                        return true;
                    }
                    j0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zL2 = layoutManager.L();
                    if (keyCode2 == 122) {
                        if (zL2) {
                            iA = getAdapter().a();
                        }
                    } else if (!zL2) {
                        iA = getAdapter().a();
                    }
                    k0(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ow0) arrayList.get(i)).d(canvas, this);
        }
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.L;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.N == null || arrayList.size() <= 0 || !this.N.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.l;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof sw0) {
            sw0 sw0Var = (sw0) layoutParams;
            if (!sw0Var.c) {
                Rect rect2 = sw0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.p.n0(this, view, this.l, !this.w, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb A[DONT_INVERT, PHI: r7
  0x00fb: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e2, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    public final boolean f0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        p();
        iw0 iw0Var = this.o;
        int[] iArr = this.t0;
        if (iw0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            g0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.r.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.r0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.T;
        int[] iArr2 = this.r0;
        int i13 = iArr2[0];
        this.T = i12 - i13;
        int i14 = this.U;
        int i15 = iArr2[1];
        this.U = i14 - i15;
        int[] iArr3 = this.s0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || y90.H(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    y();
                    z = true;
                    z2 = false;
                    ds.x(this.J, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        z();
                        ds.x(this.L, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        A();
                        ds.x(this.K, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        x();
                        ds.x(this.M, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && y90.H(motionEvent, 4194304)) {
                            a0();
                        }
                    }
                    z3 = true;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        a0();
                    }
                }
                z3 = true;
                if (f2 < 0.0f) {
                    A();
                    ds.x(this.K, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    x();
                    ds.x(this.M, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        a0();
                    }
                }
                z3 = true;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    a0();
                }
            }
            n(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:128:0x0193  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0168, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0186, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0189, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018c, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0195, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019e, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x016b, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i, int i2, int[] iArr) {
        hx0 hx0Var;
        l0();
        T();
        Trace.beginSection("RV Scroll");
        dx0 dx0Var = this.h0;
        C(dx0Var);
        yw0 yw0Var = this.e;
        int iP0 = i != 0 ? this.p.p0(i, yw0Var, dx0Var) : 0;
        int iR0 = i2 != 0 ? this.p.r0(i2, yw0Var, dx0Var) : 0;
        Trace.endSection();
        ol olVar = this.h;
        int iE = olVar.e();
        for (int i3 = 0; i3 < iE; i3++) {
            View viewD = olVar.d(i3);
            hx0 hx0VarL = L(viewD);
            if (hx0VarL != null && (hx0Var = hx0VarL.i) != null) {
                View view = hx0Var.a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = iP0;
            iArr[1] = iR0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            return rw0Var.r();
        }
        nh0.j("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            return rw0Var.s(getContext(), attributeSet);
        }
        nh0.j("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public iw0 getAdapter() {
        return this.o;
    }

    @Override // android.view.View
    public int getBaseline() {
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            return super.getBaseline();
        }
        rw0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.j;
    }

    public jx0 getCompatAccessibilityDelegate() {
        return this.o0;
    }

    public mw0 getEdgeEffectFactory() {
        return this.I;
    }

    public nw0 getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.r.size();
    }

    public rw0 getLayoutManager() {
        return this.p;
    }

    public int getMaxFlingVelocity() {
        return this.a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        if (H0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public tw0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.d0;
    }

    public xw0 getRecycledViewPool() {
        return this.e.f();
    }

    public int getScrollState() {
        return this.O;
    }

    public final void h(hx0 hx0Var) {
        View view = hx0Var.a;
        boolean z = view.getParent() == this;
        this.e.r(L(view));
        boolean zK = hx0Var.k();
        ol olVar = this.h;
        if (zK) {
            olVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            olVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = olVar.a.c.indexOfChild(view);
        if (iIndexOfChild < 0) {
            id.p(view, "view is not a child, cannot hide ");
        } else {
            olVar.b.j(iIndexOfChild);
            olVar.i(view);
        }
    }

    public final void h0(int i) {
        if (this.z) {
            return;
        }
        p0();
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            rw0Var.q0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(ow0 ow0Var) {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            rw0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.r;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(ow0Var);
        R();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fR = ds.r(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.c * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = F0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fR;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.z;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(vw0 vw0Var) {
        if (this.j0 == null) {
            this.j0 = new ArrayList();
        }
        this.j0.add(vw0Var);
    }

    public final void j0(int i, int i2, boolean z) {
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        if (!rw0Var.d()) {
            i = 0;
        }
        if (!this.p.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.e0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void k(String str) {
        if (!P()) {
            if (this.H > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B()));
            }
        } else if (str == null) {
            nh0.j("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
        } else {
            nh0.j(str);
        }
    }

    public final void k0(int i) {
        if (this.z) {
            return;
        }
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            rw0Var.A0(this, i);
        }
    }

    public final void l0() {
        int i = this.x + 1;
        this.x = i;
        if (i != 1 || this.z) {
            return;
        }
        this.y = false;
    }

    public final void m() {
        ol olVar = this.h;
        int iH = olVar.h();
        for (int i = 0; i < iH; i++) {
            hx0 hx0VarM = M(olVar.g(i));
            if (!hx0VarM.p()) {
                hx0VarM.d = -1;
                hx0VarM.g = -1;
            }
        }
        yw0 yw0Var = this.e;
        ArrayList arrayList = (ArrayList) yw0Var.c;
        ArrayList arrayList2 = (ArrayList) yw0Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            hx0 hx0Var = (hx0) arrayList2.get(i2);
            hx0Var.d = -1;
            hx0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            hx0 hx0Var2 = (hx0) arrayList.get(i3);
            hx0Var2.d = -1;
            hx0Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) yw0Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                hx0 hx0Var3 = (hx0) ((ArrayList) yw0Var.d).get(i4);
                hx0Var3.d = -1;
                hx0Var3.g = -1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(int i) {
        boolean zD = this.p.d();
        int i2 = zD;
        if (this.p.e()) {
            i2 = (zD ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.J.onRelease();
            zIsFinished = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z) {
        if (this.x < 1) {
            if (C0) {
                nh0.j("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
                return;
            }
            this.x = 1;
        }
        if (!z && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (z && this.y && !this.z && this.p != null && this.o != null) {
                r();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        this.x--;
    }

    public final void o0(int i) {
        getScrollingChildHelper().h(i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.G = 0;
        this.u = true;
        this.w = this.w && !isLayoutRequested();
        this.e.h();
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            rw0Var.g = true;
            rw0Var.R(this);
        }
        this.n0 = false;
        if (H0) {
            ThreadLocal threadLocal = r60.g;
            r60 r60Var = (r60) threadLocal.get();
            this.f0 = r60Var;
            if (r60Var == null) {
                this.f0 = new r60();
                WeakHashMap weakHashMap = oe1.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                r60 r60Var2 = this.f0;
                r60Var2.e = (long) (1.0E9f / refreshRate);
                threadLocal.set(r60Var2);
            }
            ArrayList arrayList = this.f0.c;
            if (C0 && arrayList.contains(this)) {
                nh0.j("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r60 r60Var;
        super.onDetachedFromWindow();
        nw0 nw0Var = this.N;
        if (nw0Var != null) {
            nw0Var.e();
        }
        p0();
        int i = 0;
        this.u = false;
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            rw0Var.g = false;
            rw0Var.S(this);
        }
        this.u0.clear();
        removeCallbacks(this.v0);
        this.i.getClass();
        while (te1.d.a() != null) {
        }
        yw0 yw0Var = this.e;
        ArrayList arrayList = (ArrayList) yw0Var.e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            lk0.g(((hx0) arrayList.get(i2)).a);
        }
        yw0Var.i(((RecyclerView) yw0Var.h).o, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            tu0 tu0Var = (tu0) childAt.getTag(com.anydesk.anydeskandroid.R.id.pooling_container_listener_holder_tag);
            if (tu0Var == null) {
                tu0Var = new tu0();
                childAt.setTag(com.anydesk.anydeskandroid.R.id.pooling_container_listener_holder_tag, tu0Var);
            }
            ArrayList arrayList2 = tu0Var.a;
            int iZ = um.Z(arrayList2);
            if (-1 < iZ) {
                arrayList2.get(iZ).getClass();
                id.c();
                return;
            }
            i = i3;
        }
        if (!H0 || (r60Var = this.f0) == null) {
            return;
        }
        boolean zRemove = r60Var.c.remove(this);
        if (!C0 || zRemove) {
            this.f0 = null;
        } else {
            nh0.j("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ow0) arrayList.get(i)).getClass();
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i;
        if (this.p != null && !this.z && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.p.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.p.d()) {
                    axisValue = motionEvent.getAxisValue(10);
                    i = 0;
                    z = false;
                    f = f2;
                } else {
                    f = f2;
                    axisValue = 0.0f;
                    i = 0;
                    z = false;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.p.e()) {
                    f = -axisValue;
                } else {
                    if (!this.p.d()) {
                    }
                    z = this.z0;
                    i = 26;
                }
                axisValue = 0.0f;
                z = this.z0;
                i = 26;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.c0);
            int i3 = (int) (axisValue * this.b0);
            if (z) {
                OverScroller overScroller = this.e0.e;
                j0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                rw0 rw0Var = this.p;
                if (rw0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.z) {
                    int[] iArr = this.t0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = rw0Var.d();
                    boolean zE = this.p.e();
                    int i4 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iB0 = i3 - b0(i3, y);
                    int iC0 = i2 - c0(i2, x);
                    getScrollingChildHelper().g(i4, 1);
                    if (u(zD ? iB0 : 0, zE ? iC0 : 0, 1, this.t0, this.r0)) {
                        iB0 -= iArr[0];
                        iC0 -= iArr[1];
                    }
                    f0(zD ? iB0 : 0, zE ? iC0 : 0, motionEvent, 1);
                    r60 r60Var = this.f0;
                    if (r60Var != null && (iB0 != 0 || iC0 != 0)) {
                        r60Var.a(this, iB0, iC0);
                    }
                    o0(1);
                }
            }
            if (i != 0 && !z) {
                this.B0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.z) {
            this.t = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.Q;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                a0();
                setScrollState(0);
                return true;
            }
            rw0 rw0Var = this.p;
            if (rw0Var != null) {
                boolean zD = rw0Var.d();
                boolean zE = this.p.e();
                if (this.Q == null) {
                    this.Q = VelocityTracker.obtain();
                }
                this.Q.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.A) {
                        this.A = false;
                    }
                    this.P = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.T = x;
                    this.R = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.U = y;
                    this.S = y;
                    EdgeEffect edgeEffect = this.J;
                    if (edgeEffect == null || ds.r(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        ds.x(this.J, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.L;
                    if (edgeEffect2 != null && ds.r(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        ds.x(this.L, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.K;
                    if (edgeEffect3 != null && ds.r(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        ds.x(this.K, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.M;
                    if (edgeEffect4 != null && ds.r(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        ds.x(this.M, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.O == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.s0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m0(0);
                } else if (actionMasked == 1) {
                    this.Q.clear();
                    o0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.O != 1) {
                        int i = x2 - this.R;
                        int i2 = y2 - this.S;
                        if (!zD || Math.abs(i) <= this.V) {
                            z2 = false;
                        } else {
                            this.T = x2;
                            z2 = true;
                        }
                        if (zE && Math.abs(i2) > this.V) {
                            this.U = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.Q;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    o0(0);
                    a0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.P = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.T = x3;
                    this.R = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.U = y3;
                    this.S = y3;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.O == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.w = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            q(i, i2);
            return;
        }
        boolean zK = rw0Var.K();
        boolean z = false;
        dx0 dx0Var = this.h0;
        if (zK) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.w0 = z;
            if (z || this.o == null) {
                return;
            }
            if (dx0Var.d == 1) {
                s();
            }
            this.p.t0(i, i2);
            dx0Var.i = true;
            t();
            this.p.v0(i, i2);
            if (this.p.y0()) {
                this.p.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                dx0Var.i = true;
                t();
                this.p.v0(i, i2);
            }
            this.x0 = getMeasuredWidth();
            this.y0 = getMeasuredHeight();
            return;
        }
        if (this.v) {
            this.p.b.q(i, i2);
            return;
        }
        if (this.C) {
            l0();
            T();
            X();
            U(true);
            if (dx0Var.k) {
                dx0Var.g = true;
            } else {
                this.g.d();
                dx0Var.g = false;
            }
            this.C = false;
            n0(false);
        } else if (dx0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        iw0 iw0Var = this.o;
        if (iw0Var != null) {
            dx0Var.e = iw0Var.a();
        } else {
            dx0Var.e = 0;
        }
        l0();
        this.p.b.q(i, i2);
        n0(false);
        dx0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ax0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ax0 ax0Var = (ax0) parcelable;
        this.f = ax0Var;
        super.onRestoreInstanceState(ax0Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ax0 ax0Var = new ax0(super.onSaveInstanceState());
        ax0 ax0Var2 = this.f;
        if (ax0Var2 != null) {
            ax0Var.e = ax0Var2.e;
            return ax0Var;
        }
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            ax0Var.e = rw0Var.g0();
            return ax0Var;
        }
        ax0Var.e = null;
        return ax0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE;
        boolean z;
        if (!this.z && !this.A) {
            uw0 uw0Var = this.t;
            if (uw0Var == null) {
                zE = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                uw0Var.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.t = null;
                }
                zE = true;
            }
            if (zE) {
                VelocityTracker velocityTracker = this.Q;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                a0();
                setScrollState(0);
                return true;
            }
            rw0 rw0Var = this.p;
            if (rw0Var != null) {
                boolean zD = rw0Var.d();
                boolean zE2 = this.p.e();
                if (this.Q == null) {
                    this.Q = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.s0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.Q.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.Q;
                        int i = this.a0;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zD ? -this.Q.getXVelocity(this.P) : 0.0f;
                        float f2 = zE2 ? -this.Q.getYVelocity(this.P) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !I((int) f, (int) f2, this.W, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.Q;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        o0(0);
                        a0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.T - x;
                        int iMax2 = this.U - y;
                        if (this.O != 1) {
                            if (zD) {
                                int i2 = this.V;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zE2) {
                                int i3 = this.V;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.O == 1) {
                            int[] iArr2 = this.t0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iB0 = iMax - b0(iMax, motionEvent.getY());
                            int iC0 = iMax2 - c0(iMax2, motionEvent.getX());
                            boolean zU = u(zD ? iB0 : 0, zE2 ? iC0 : 0, 0, this.t0, this.r0);
                            int[] iArr3 = this.r0;
                            if (zU) {
                                iB0 -= iArr2[0];
                                iC0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iB0;
                            int i5 = iC0;
                            this.T = x - iArr3[0];
                            this.U = y - iArr3[1];
                            if (f0(zD ? i4 : 0, zE2 ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            r60 r60Var = this.f0;
                            if (r60Var != null && (i4 != 0 || i5 != 0)) {
                                r60Var.a(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.Q;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        o0(0);
                        a0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.P = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.T = x2;
                        this.R = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.U = y2;
                        this.S = y2;
                    } else if (actionMasked == 6) {
                        V(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.P = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.T = x3;
                this.R = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.U = y3;
                this.S = y3;
                m0(0);
                this.Q.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.w || this.E) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        m7 m7Var = this.g;
        if (m7Var.j()) {
            int i = m7Var.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (m7Var.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            l0();
            T();
            m7Var.p();
            if (!this.y) {
                ol olVar = this.h;
                int iE = olVar.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    hx0 hx0VarM = M(olVar.d(i2));
                    if (hx0VarM != null && !hx0VarM.p() && hx0VarM.l()) {
                        r();
                    }
                }
                m7Var.c();
            }
            n0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void p0() {
        wf0 wf0Var;
        setScrollState(0);
        gx0 gx0Var = this.e0;
        gx0Var.i.removeCallbacks(gx0Var);
        gx0Var.e.abortAnimation();
        rw0 rw0Var = this.p;
        if (rw0Var == null || (wf0Var = rw0Var.e) == null) {
            return;
        }
        wf0Var.g();
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = oe1.a;
        setMeasuredDimension(rw0.g(i, paddingRight, getMinimumWidth()), rw0.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0274  */
    /* JADX WARN: Code duplicated, block: B:163:0x0342  */
    /* JADX WARN: Code duplicated, block: B:182:0x0380  */
    /* JADX WARN: Code duplicated, block: B:184:0x0383  */
    /* JADX WARN: Code duplicated, block: B:190:0x0396  */
    /* JADX WARN: Code duplicated, block: B:192:0x039c  */
    /* JADX WARN: Code duplicated, block: B:195:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ba A[LOOP:4: B:197:0x03a7->B:204:0x03ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d8 A[LOOP:5: B:206:0x03c5->B:213:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:243:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03db A[EDGE_INSN: B:246:0x03db->B:214:0x03db BREAK  A[LOOP:5: B:206:0x03c5->B:213:0x03d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03d6 A[SYNTHETIC] */
    public final void r() {
        long j;
        hx0 hx0Var;
        int i;
        int iB;
        int i2;
        int iMin;
        hx0 hx0VarH;
        View view;
        hx0 hx0VarH2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z;
        i51 i51Var;
        vl0 vl0Var;
        boolean zG;
        if (this.o == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.p == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        dx0 dx0Var = this.h0;
        dx0Var.i = false;
        boolean z2 = this.w0 && !(this.x0 == getWidth() && this.y0 == getHeight());
        this.x0 = 0;
        this.y0 = 0;
        this.w0 = false;
        if (dx0Var.d == 1) {
            s();
            this.p.s0(this);
            t();
        } else {
            m7 m7Var = this.g;
            if ((((ArrayList) m7Var.d).isEmpty() || ((ArrayList) m7Var.c).isEmpty()) && !z2 && this.p.n == getWidth() && this.p.o == getHeight()) {
                this.p.s0(this);
            } else {
                this.p.s0(this);
                t();
            }
        }
        dx0Var.a(4);
        l0();
        T();
        dx0Var.d = 1;
        boolean z3 = dx0Var.j;
        ol olVar = this.h;
        yw0 yw0Var = this.e;
        ui0 ui0Var = this.i;
        if (z3) {
            for (int iE = olVar.e() - 1; iE >= 0; iE--) {
                hx0 hx0VarM = M(olVar.d(iE));
                if (!hx0VarM.p()) {
                    long jK = K(hx0VarM);
                    this.N.getClass();
                    vl0 vl0Var2 = new vl0();
                    vl0Var2.a(hx0VarM);
                    xh0 xh0Var = (xh0) ui0Var.d;
                    i51 i51Var2 = (i51) ui0Var.e;
                    hx0 hx0Var2 = (hx0) xh0Var.d(jK);
                    if (hx0Var2 == null || hx0Var2.p()) {
                        ui0Var.d(hx0VarM, vl0Var2);
                    } else {
                        te1 te1Var = (te1) i51Var2.get(hx0Var2);
                        boolean z4 = (te1Var == null || (te1Var.a & 1) == 0) ? false : true;
                        te1 te1Var2 = (te1) i51Var2.get(hx0VarM);
                        boolean z5 = (te1Var2 == null || (te1Var2.a & 1) == 0) ? false : true;
                        if (z4 && hx0Var2 == hx0VarM) {
                            ui0Var.d(hx0VarM, vl0Var2);
                        } else {
                            vl0 vl0VarR = ui0Var.r(hx0Var2, 4);
                            ui0Var.d(hx0VarM, vl0Var2);
                            vl0 vl0VarR2 = ui0Var.r(hx0VarM, 8);
                            if (vl0VarR == null) {
                                int iE2 = olVar.e();
                                for (int i4 = 0; i4 < iE2; i4++) {
                                    hx0 hx0VarM2 = M(olVar.d(i4));
                                    if (hx0VarM2 != hx0VarM && K(hx0VarM2) == jK) {
                                        iw0 iw0Var = this.o;
                                        if (iw0Var == null || !iw0Var.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(hx0VarM2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(hx0VarM);
                                            nh0.s(sb, B());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(hx0VarM2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(hx0VarM);
                                        nh0.s(sb2, B());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + hx0Var2 + " cannot be found but it is necessary for " + hx0VarM + B());
                            } else {
                                hx0Var2.o(false);
                                if (z4) {
                                    h(hx0Var2);
                                }
                                if (hx0Var2 != hx0VarM) {
                                    if (z5) {
                                        h(hx0VarM);
                                    }
                                    hx0Var2.h = hx0VarM;
                                    h(hx0Var2);
                                    yw0Var.r(hx0Var2);
                                    hx0VarM.o(false);
                                    hx0VarM.i = hx0Var2;
                                }
                                if (this.N.a(hx0Var2, hx0VarM, vl0VarR, vl0VarR2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
            }
            i51 i51Var3 = (i51) ui0Var.e;
            int i5 = i51Var3.e - 1;
            while (i5 >= 0) {
                hx0 hx0Var3 = (hx0) i51Var3.f(i5);
                te1 te1Var3 = (te1) i51Var3.g(i5);
                int i6 = te1Var3.a;
                int i7 = i6 & 3;
                hw0 hw0Var = this.A0;
                if (i7 == 3) {
                    RecyclerView recyclerView = hw0Var.c;
                    recyclerView.p.l0(hx0Var3.a, recyclerView.e);
                } else if ((i6 & 1) != 0) {
                    vl0 vl0Var3 = te1Var3.b;
                    if (vl0Var3 == null) {
                        RecyclerView recyclerView2 = hw0Var.c;
                        recyclerView2.p.l0(hx0Var3.a, recyclerView2.e);
                    } else {
                        hw0Var.j(hx0Var3, vl0Var3, te1Var3.c);
                    }
                } else if ((i6 & 14) == 14) {
                    hw0Var.i(hx0Var3, te1Var3.b, te1Var3.c);
                } else {
                    if ((i6 & 12) == 12) {
                        vl0 vl0Var4 = te1Var3.b;
                        vl0 vl0Var5 = te1Var3.c;
                        hw0Var.getClass();
                        hx0Var3.o(false);
                        RecyclerView recyclerView3 = hw0Var.c;
                        boolean z6 = recyclerView3.E;
                        nw0 nw0Var = recyclerView3.N;
                        if (!z6) {
                            qs qsVar = (qs) nw0Var;
                            qsVar.getClass();
                            int i8 = vl0Var4.a;
                            int i9 = vl0Var5.a;
                            if (i8 == i9) {
                                i51Var = i51Var3;
                                if (vl0Var4.b == vl0Var5.b) {
                                    qsVar.k(hx0Var3);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView3.W();
                                }
                            } else {
                                i51Var = i51Var3;
                            }
                            zG = qsVar.g(hx0Var3, i8, vl0Var4.b, i9, vl0Var5.b);
                            if (zG) {
                                recyclerView3.W();
                            }
                        } else if (nw0Var.a(hx0Var3, hx0Var3, vl0Var4, vl0Var5)) {
                            recyclerView3.W();
                        }
                        vl0Var = null;
                    } else {
                        i51Var = i51Var3;
                        if ((i6 & 4) != 0) {
                            vl0Var = null;
                            hw0Var.j(hx0Var3, te1Var3.b, null);
                        } else {
                            vl0Var = null;
                            if ((i6 & 8) != 0) {
                                hw0Var.i(hx0Var3, te1Var3.b, te1Var3.c);
                            }
                        }
                    }
                    te1Var3.a = 0;
                    te1Var3.b = vl0Var;
                    te1Var3.c = vl0Var;
                    te1.d.c(te1Var3);
                    i5--;
                    i51Var3 = i51Var;
                }
                i51Var = i51Var3;
                vl0Var = null;
                te1Var3.a = 0;
                te1Var3.b = vl0Var;
                te1Var3.c = vl0Var;
                te1.d.c(te1Var3);
                i5--;
                i51Var3 = i51Var;
            }
        }
        View view4 = null;
        this.p.k0(yw0Var);
        dx0Var.b = dx0Var.e;
        this.E = false;
        this.F = false;
        dx0Var.j = false;
        dx0Var.k = false;
        this.p.f = false;
        ArrayList arrayList = (ArrayList) yw0Var.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        rw0 rw0Var = this.p;
        if (rw0Var.k) {
            rw0Var.j = 0;
            rw0Var.k = false;
            yw0Var.s();
        }
        this.p.e0(dx0Var);
        U(true);
        n0(false);
        ((i51) ui0Var.e).clear();
        ((xh0) ui0Var.d).b();
        int[] iArr = this.p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        F(iArr);
        if (iArr[0] != i10 || iArr[1] != i11) {
            w(0, 0);
        }
        if (this.d0 && this.o != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = dx0Var.m;
                if (j == -1) {
                    hx0Var = null;
                } else {
                    hx0Var = null;
                }
                if (hx0Var != null) {
                    view3 = hx0Var.a;
                    if (!olVar.c.contains(view3)) {
                        if (olVar.e() > 0) {
                            i = dx0Var.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = dx0Var.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    hx0VarH2 = H(i2);
                                    if (hx0VarH2 != null) {
                                        view2 = hx0VarH2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    hx0VarH = H(iMin);
                                    if (hx0VarH == null) {
                                        break;
                                        break;
                                    }
                                    view = hx0VarH.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (olVar.e() > 0) {
                        i = dx0Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = dx0Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                hx0VarH2 = H(i2);
                                if (hx0VarH2 != null) {
                                    view2 = hx0VarH2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                hx0VarH = H(iMin);
                                if (hx0VarH == null) {
                                    break;
                                    break;
                                }
                                view = hx0VarH.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (olVar.e() > 0) {
                    i = dx0Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = dx0Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            hx0VarH2 = H(i2);
                            if (hx0VarH2 != null) {
                                view2 = hx0VarH2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            hx0VarH = H(iMin);
                            if (hx0VarH == null) {
                                break;
                                break;
                            }
                            view = hx0VarH.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = dx0Var.n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (olVar.c.contains(getFocusedChild())) {
                j = dx0Var.m;
                if (j == -1 && (z = this.o.b) && z) {
                    int iH = olVar.h();
                    hx0Var = null;
                    for (int i12 = 0; i12 < iH; i12++) {
                        hx0 hx0VarM3 = M(olVar.g(i12));
                        if (hx0VarM3 != null && !hx0VarM3.i() && hx0VarM3.e == j) {
                            if (!olVar.c.contains(hx0VarM3.a)) {
                                hx0Var = hx0VarM3;
                                break;
                            }
                            hx0Var = hx0VarM3;
                        }
                    }
                } else {
                    hx0Var = null;
                }
                if (hx0Var != null) {
                    view3 = hx0Var.a;
                    if (!olVar.c.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (olVar.e() > 0) {
                        i = dx0Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = dx0Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                hx0VarH2 = H(i2);
                                if (hx0VarH2 != null) {
                                    view2 = hx0VarH2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                hx0VarH = H(iMin);
                                if (hx0VarH == null) {
                                    break;
                                }
                                view = hx0VarH.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (olVar.e() > 0) {
                    i = dx0Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = dx0Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            hx0VarH2 = H(i2);
                            if (hx0VarH2 != null) {
                                view2 = hx0VarH2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            hx0VarH = H(iMin);
                            if (hx0VarH == null) {
                                break;
                                break;
                            }
                            view = hx0VarH.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = dx0Var.n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        dx0Var.m = -1L;
        dx0Var.l = -1;
        dx0Var.n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        hx0 hx0VarM = M(view);
        if (hx0VarM != null) {
            if (hx0VarM.k()) {
                hx0VarM.j &= -257;
            } else if (!hx0VarM.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(hx0VarM);
                nh0.n(sb, B());
                return;
            }
        } else if (C0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            nh0.n(sb2, B());
            return;
        }
        view.clearAnimation();
        M(view);
        iw0 iw0Var = this.o;
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        wf0 wf0Var = this.p.e;
        if ((wf0Var == null || !wf0Var.e) && !P() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.p.n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uw0) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x != 0 || this.z) {
            this.y = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final void s() {
        int iJ;
        te1 te1Var;
        View viewD;
        dx0 dx0Var = this.h0;
        dx0Var.a(1);
        C(dx0Var);
        dx0Var.i = false;
        l0();
        ui0 ui0Var = this.i;
        i51 i51Var = (i51) ui0Var.e;
        i51 i51Var2 = (i51) ui0Var.e;
        i51Var.clear();
        xh0 xh0Var = (xh0) ui0Var.d;
        xh0Var.b();
        T();
        X();
        hx0 hx0VarL = null;
        View focusedChild = (this.d0 && hasFocus() && this.o != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewD = D(focusedChild)) != null) {
            hx0VarL = L(viewD);
        }
        if (hx0VarL == null) {
            dx0Var.m = -1L;
            dx0Var.l = -1;
            dx0Var.n = -1;
        } else {
            dx0Var.m = this.o.b ? hx0VarL.e : -1L;
            if (this.E) {
                iJ = -1;
            } else if (hx0VarL.i()) {
                iJ = hx0VarL.d;
            } else {
                RecyclerView recyclerView = hx0VarL.r;
                if (recyclerView == null) {
                    iJ = -1;
                } else {
                    iJ = recyclerView.J(hx0VarL);
                }
            }
            dx0Var.l = iJ;
            View focusedChild2 = hx0VarL.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            dx0Var.n = id;
        }
        dx0Var.h = dx0Var.j && this.l0;
        this.l0 = false;
        this.k0 = false;
        dx0Var.g = dx0Var.k;
        dx0Var.e = this.o.a();
        F(this.p0);
        boolean z = dx0Var.j;
        ol olVar = this.h;
        if (z) {
            int iE = olVar.e();
            for (int i = 0; i < iE; i++) {
                hx0 hx0VarM = M(olVar.d(i));
                if (!hx0VarM.p() && (!hx0VarM.g() || this.o.b)) {
                    nw0 nw0Var = this.N;
                    nw0.b(hx0VarM);
                    hx0VarM.d();
                    nw0Var.getClass();
                    vl0 vl0Var = new vl0();
                    vl0Var.a(hx0VarM);
                    te1 te1VarA = (te1) i51Var2.get(hx0VarM);
                    if (te1VarA == null) {
                        te1VarA = te1.a();
                        i51Var2.put(hx0VarM, te1VarA);
                    }
                    te1VarA.b = vl0Var;
                    te1VarA.a |= 4;
                    if (dx0Var.h && hx0VarM.l() && !hx0VarM.i() && !hx0VarM.p() && !hx0VarM.g()) {
                        xh0Var.g(hx0VarM, K(hx0VarM));
                    }
                }
            }
        }
        if (dx0Var.k) {
            int iH = olVar.h();
            for (int i2 = 0; i2 < iH; i2++) {
                hx0 hx0VarM2 = M(olVar.g(i2));
                if (C0 && hx0VarM2.c == -1 && !hx0VarM2.i()) {
                    nh0.j("view holder cannot have position -1 unless it is removed".concat(B()));
                    return;
                }
                if (!hx0VarM2.p() && hx0VarM2.d == -1) {
                    hx0VarM2.d = hx0VarM2.c;
                }
            }
            boolean z2 = dx0Var.f;
            dx0Var.f = false;
            this.p.d0(this.e, dx0Var);
            dx0Var.f = z2;
            for (int i3 = 0; i3 < olVar.e(); i3++) {
                hx0 hx0VarM3 = M(olVar.d(i3));
                if (!hx0VarM3.p() && ((te1Var = (te1) i51Var2.get(hx0VarM3)) == null || (te1Var.a & 4) == 0)) {
                    nw0.b(hx0VarM3);
                    boolean z3 = (hx0VarM3.j & 8192) != 0;
                    nw0 nw0Var2 = this.N;
                    hx0VarM3.d();
                    nw0Var2.getClass();
                    vl0 vl0Var2 = new vl0();
                    vl0Var2.a(hx0VarM3);
                    if (z3) {
                        Z(hx0VarM3, vl0Var2);
                    } else {
                        te1 te1VarA2 = (te1) i51Var2.get(hx0VarM3);
                        if (te1VarA2 == null) {
                            te1VarA2 = te1.a();
                            i51Var2.put(hx0VarM3, te1VarA2);
                        }
                        te1VarA2.a |= 2;
                        te1VarA2.b = vl0Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        n0(false);
        dx0Var.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        rw0 rw0Var = this.p;
        if (rw0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        boolean zD = rw0Var.d();
        boolean zE = this.p.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            f0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.B |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(jx0 jx0Var) {
        this.o0 = jx0Var;
        oe1.n(this, jx0Var);
    }

    public void setAdapter(iw0 iw0Var) {
        setLayoutFrozen(false);
        iw0 iw0Var2 = this.o;
        ws0 ws0Var = this.d;
        if (iw0Var2 != null) {
            iw0Var2.a.unregisterObserver(ws0Var);
            this.o.getClass();
        }
        nw0 nw0Var = this.N;
        if (nw0Var != null) {
            nw0Var.e();
        }
        rw0 rw0Var = this.p;
        yw0 yw0Var = this.e;
        if (rw0Var != null) {
            rw0Var.j0(yw0Var);
            this.p.k0(yw0Var);
        }
        ((ArrayList) yw0Var.c).clear();
        yw0Var.k();
        m7 m7Var = this.g;
        m7Var.q((ArrayList) m7Var.c);
        m7Var.q((ArrayList) m7Var.d);
        m7Var.a = 0;
        iw0 iw0Var3 = this.o;
        this.o = iw0Var;
        if (iw0Var != null) {
            iw0Var.a.registerObserver(ws0Var);
        }
        rw0 rw0Var2 = this.p;
        if (rw0Var2 != null) {
            rw0Var2.Q();
        }
        iw0 iw0Var4 = this.o;
        ((ArrayList) yw0Var.c).clear();
        yw0Var.k();
        yw0Var.i(iw0Var3, true);
        xw0 xw0VarF = yw0Var.f();
        if (iw0Var3 != null) {
            xw0VarF.b--;
        }
        if (xw0VarF.b == 0) {
            SparseArray sparseArray = xw0VarF.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ww0 ww0Var = (ww0) sparseArray.valueAt(i);
                ArrayList arrayList = ww0Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    lk0.g(((hx0) obj).a);
                }
                ww0Var.a.clear();
            }
        }
        if (iw0Var4 != null) {
            xw0VarF.b++;
        }
        yw0Var.h();
        this.h0.f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(lw0 lw0Var) {
        if (lw0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.j) {
            this.M = null;
            this.K = null;
            this.L = null;
            this.J = null;
        }
        this.j = z;
        super.setClipToPadding(z);
        if (this.w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(mw0 mw0Var) {
        mw0Var.getClass();
        this.I = mw0Var;
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public void setHasFixedSize(boolean z) {
        this.v = z;
    }

    public void setItemAnimator(nw0 nw0Var) {
        nw0 nw0Var2 = this.N;
        if (nw0Var2 != null) {
            nw0Var2.e();
            this.N.a = null;
        }
        this.N = nw0Var;
        if (nw0Var != null) {
            nw0Var.a = this.m0;
        }
    }

    public void setItemViewCacheSize(int i) {
        yw0 yw0Var = this.e;
        yw0Var.a = i;
        yw0Var.s();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(rw0 rw0Var) {
        RecyclerView recyclerView;
        if (rw0Var == this.p) {
            return;
        }
        p0();
        rw0 rw0Var2 = this.p;
        yw0 yw0Var = this.e;
        if (rw0Var2 != null) {
            nw0 nw0Var = this.N;
            if (nw0Var != null) {
                nw0Var.e();
            }
            this.p.j0(yw0Var);
            this.p.k0(yw0Var);
            ((ArrayList) yw0Var.c).clear();
            yw0Var.k();
            if (this.u) {
                rw0 rw0Var3 = this.p;
                rw0Var3.g = false;
                rw0Var3.S(this);
            }
            this.p.w0(null);
            this.p = null;
        } else {
            ((ArrayList) yw0Var.c).clear();
            yw0Var.k();
        }
        ol olVar = this.h;
        olVar.b.i();
        ArrayList arrayList = olVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = olVar.a.c;
            if (size < 0) {
                break;
            }
            hx0 hx0VarM = M((View) arrayList.get(size));
            if (hx0VarM != null) {
                int i = hx0VarM.p;
                if (recyclerView.P()) {
                    hx0VarM.q = i;
                    recyclerView.u0.add(hx0VarM);
                } else {
                    hx0VarM.a.setImportantForAccessibility(i);
                }
                hx0VarM.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            M(childAt);
            iw0 iw0Var = recyclerView.o;
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.p = rw0Var;
        if (rw0Var != null) {
            if (rw0Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(rw0Var);
                String strB = rw0Var.b.B();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strB);
                throw new IllegalArgumentException(sb.toString());
            }
            rw0Var.w0(this);
            if (this.u) {
                rw0 rw0Var4 = this.p;
                rw0Var4.g = true;
                rw0Var4.R(this);
            }
        }
        yw0Var.s();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            id.q("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        kp0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = oe1.a;
            ge1.l(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(vw0 vw0Var) {
        this.i0 = vw0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.d0 = z;
    }

    public void setRecycledViewPool(xw0 xw0Var) {
        yw0 yw0Var = this.e;
        RecyclerView recyclerView = (RecyclerView) yw0Var.h;
        yw0Var.i(recyclerView.o, false);
        xw0 xw0Var2 = (xw0) yw0Var.g;
        if (xw0Var2 != null) {
            xw0Var2.b--;
        }
        yw0Var.g = xw0Var;
        if (xw0Var != null && recyclerView.getAdapter() != null) {
            ((xw0) yw0Var.g).b++;
        }
        yw0Var.h();
    }

    public void setScrollState(int i) {
        wf0 wf0Var;
        if (i == this.O) {
            return;
        }
        if (D0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.O, new Exception());
        }
        this.O = i;
        if (i != 2) {
            gx0 gx0Var = this.e0;
            gx0Var.i.removeCallbacks(gx0Var);
            gx0Var.e.abortAnimation();
            rw0 rw0Var = this.p;
            if (rw0Var != null && (wf0Var = rw0Var.e) != null) {
                wf0Var.g();
            }
        }
        rw0 rw0Var2 = this.p;
        if (rw0Var2 != null) {
            rw0Var2.h0(i);
        }
        vw0 vw0Var = this.i0;
        if (vw0Var != null) {
            vw0Var.a(i);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vw0) this.j0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(fx0 fx0Var) {
        this.e.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.z) {
            k("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.z = true;
                this.A = true;
                p0();
                return;
            }
            this.z = false;
            if (this.y && this.p != null && this.o != null) {
                requestLayout();
            }
            this.y = false;
        }
    }

    public final void t() {
        l0();
        T();
        dx0 dx0Var = this.h0;
        dx0Var.a(6);
        this.g.d();
        dx0Var.e = this.o.a();
        dx0Var.c = 0;
        if (this.f != null) {
            iw0 iw0Var = this.o;
            int iR = q51.r(iw0Var.c);
            if (iR == 1 ? iw0Var.a() > 0 : iR != 2) {
                Parcelable parcelable = this.f.e;
                if (parcelable != null) {
                    this.p.f0(parcelable);
                }
                this.f = null;
            }
        }
        dx0Var.g = false;
        this.p.d0(this.e, dx0Var);
        dx0Var.f = false;
        dx0Var.j = dx0Var.j && this.N != null;
        dx0Var.d = 4;
        U(true);
        n0(false);
    }

    public final boolean u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        vw0 vw0Var = this.i0;
        if (vw0Var != null) {
            vw0Var.b(this, i2);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vw0) this.j0.get(size)).b(this, i2);
            }
        }
        this.H--;
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        ((ex0) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.j) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.J != null) {
            return;
        }
        ((ex0) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.j) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.L != null) {
            return;
        }
        ((ex0) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.j) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        rw0 rw0Var = this.p;
        if (rw0Var != null) {
            return rw0Var.t(layoutParams);
        }
        nh0.j("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    public void setOnFlingListener(tw0 tw0Var) {
    }

    @Deprecated
    public void setRecyclerListener(zw0 zw0Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
