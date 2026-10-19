package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb1 implements Cloneable {
    public ArrayList m;
    public ArrayList n;
    public pb1[] o;
    public static final Animator[] y = new Animator[0];
    public static final int[] z = {2, 1, 3, 4};
    public static final us0 A = new us0(18);
    public static final ThreadLocal B = new ThreadLocal();
    public final String c = getClass().getName();
    public long d = -1;
    public long e = -1;
    public TimeInterpolator f = null;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public ah i = new ah(7);
    public ah j = new ah(7);
    public pf k = null;
    public final int[] l = z;
    public final ArrayList p = new ArrayList();
    public Animator[] q = y;
    public int r = 0;
    public boolean s = false;
    public boolean t = false;
    public qb1 u = null;
    public ArrayList v = null;
    public ArrayList w = new ArrayList();
    public us0 x = A;

    public static void b(ah ahVar, View view, yb1 yb1Var) {
        xd xdVar = (xd) ahVar.a;
        xd xdVar2 = (xd) ahVar.d;
        SparseArray sparseArray = (SparseArray) ahVar.b;
        xh0 xh0Var = (xh0) ahVar.c;
        xdVar.put(view, yb1Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = oe1.a;
        String strG = ge1.g(view);
        if (strG != null) {
            if (xdVar2.containsKey(strG)) {
                xdVar2.put(strG, null);
            } else {
                xdVar2.put(strG, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (xh0Var.c) {
                    int i = xh0Var.f;
                    long[] jArr = xh0Var.d;
                    Object[] objArr = xh0Var.e;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != y90.d) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    xh0Var.c = false;
                    xh0Var.f = i2;
                }
                if (y90.g(xh0Var.d, xh0Var.f, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    xh0Var.g(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) xh0Var.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    xh0Var.g(null, itemIdAtPosition);
                }
            }
        }
    }

    public static xd p() {
        ThreadLocal threadLocal = B;
        xd xdVar = (xd) threadLocal.get();
        if (xdVar != null) {
            return xdVar;
        }
        xd xdVar2 = new xd(0);
        threadLocal.set(xdVar2);
        return xdVar2;
    }

    public static boolean u(yb1 yb1Var, yb1 yb1Var2, String str) {
        Object obj = yb1Var.a.get(str);
        Object obj2 = yb1Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.e = j;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f = timeInterpolator;
    }

    public void D(us0 us0Var) {
        if (us0Var == null) {
            this.x = A;
        } else {
            this.x = us0Var;
        }
    }

    public void F(long j) {
        this.d = j;
    }

    public final void G() {
        if (this.r == 0) {
            v(this, cb1.b);
            this.t = false;
        }
        this.r++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.e != -1) {
            sb.append("dur(");
            sb.append(this.e);
            sb.append(") ");
        }
        if (this.d != -1) {
            sb.append("dly(");
            sb.append(this.d);
            sb.append(") ");
        }
        if (this.f != null) {
            sb.append("interp(");
            sb.append(this.f);
            sb.append(") ");
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(pb1 pb1Var) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(pb1Var);
    }

    public void c() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.q = animatorArr;
        v(this, cb1.d);
    }

    public abstract void d(yb1 yb1Var);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            yb1 yb1Var = new yb1(view);
            if (z2) {
                g(yb1Var);
            } else {
                d(yb1Var);
            }
            yb1Var.c.add(this);
            f(yb1Var);
            if (z2) {
                b(this.i, view, yb1Var);
            } else {
                b(this.j, view, yb1Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public abstract void g(yb1 yb1Var);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                yb1 yb1Var = new yb1(viewFindViewById);
                if (z2) {
                    g(yb1Var);
                } else {
                    d(yb1Var);
                }
                yb1Var.c.add(this);
                f(yb1Var);
                if (z2) {
                    b(this.i, viewFindViewById, yb1Var);
                } else {
                    b(this.j, viewFindViewById, yb1Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            yb1 yb1Var2 = new yb1(view);
            if (z2) {
                g(yb1Var2);
            } else {
                d(yb1Var2);
            }
            yb1Var2.c.add(this);
            f(yb1Var2);
            if (z2) {
                b(this.i, view, yb1Var2);
            } else {
                b(this.j, view, yb1Var2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((xd) this.i.a).clear();
            ((SparseArray) this.i.b).clear();
            ((xh0) this.i.c).b();
        } else {
            ((xd) this.j.a).clear();
            ((SparseArray) this.j.b).clear();
            ((xh0) this.j.c).b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public qb1 clone() {
        try {
            qb1 qb1Var = (qb1) super.clone();
            qb1Var.w = new ArrayList();
            qb1Var.i = new ah(7);
            qb1Var.j = new ah(7);
            qb1Var.m = null;
            qb1Var.n = null;
            qb1Var.u = this;
            qb1Var.v = null;
            return qb1Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, yb1 yb1Var, yb1 yb1Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, ah ahVar, ah ahVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        yb1 yb1Var;
        Animator animator;
        yb1 yb1Var2;
        xd xdVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            yb1 yb1Var3 = (yb1) arrayList.get(i3);
            yb1 yb1Var4 = (yb1) arrayList2.get(i3);
            if (yb1Var3 != null && !yb1Var3.c.contains(this)) {
                yb1Var3 = null;
            }
            if (yb1Var4 != null && !yb1Var4.c.contains(this)) {
                yb1Var4 = null;
            }
            if ((yb1Var3 != null || yb1Var4 != null) && (yb1Var3 == null || yb1Var4 == null || s(yb1Var3, yb1Var4))) {
                Animator animatorK = k(viewGroup, yb1Var3, yb1Var4);
                if (animatorK != null) {
                    String str = this.c;
                    if (yb1Var4 != null) {
                        view = yb1Var4.b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            yb1Var2 = new yb1(view);
                            yb1 yb1Var5 = (yb1) ((xd) ahVar2.a).get(view);
                            i = size;
                            if (yb1Var5 != null) {
                                int i4 = 0;
                                while (i4 < strArrQ.length) {
                                    String str2 = strArrQ[i4];
                                    int i5 = i3;
                                    yb1Var2.a.put(str2, yb1Var5.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    yb1Var5 = yb1Var5;
                                }
                            }
                            i2 = i3;
                            int i6 = xdVarP.e;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorK;
                                    break;
                                }
                                ob1 ob1Var = (ob1) xdVarP.get((Animator) xdVarP.f(i7));
                                if (ob1Var.c != null && ob1Var.a == view && ob1Var.b.equals(str) && ob1Var.c.equals(yb1Var2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorK;
                            yb1Var2 = null;
                        }
                        animatorK = animator;
                        yb1Var = yb1Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = yb1Var3.b;
                        yb1Var = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ob1 ob1Var2 = new ob1();
                        ob1Var2.a = view;
                        ob1Var2.b = str;
                        ob1Var2.c = yb1Var;
                        ob1Var2.d = windowId;
                        ob1Var2.e = this;
                        ob1Var2.f = animatorK;
                        xdVarP.put(animatorK, ob1Var2);
                        this.w.add(animatorK);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                ob1 ob1Var3 = (ob1) xdVarP.get((Animator) this.w.get(sparseIntArray.keyAt(i8)));
                ob1Var3.f.setStartDelay(ob1Var3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            v(this, cb1.c);
            for (int i2 = 0; i2 < ((xh0) this.i.c).h(); i2++) {
                View view = (View) ((xh0) this.i.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((xh0) this.j.c).h(); i3++) {
                View view2 = (View) ((xh0) this.j.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.t = true;
        }
    }

    public final yb1 n(View view, boolean z2) {
        pf pfVar = this.k;
        if (pfVar != null) {
            return pfVar.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.m : this.n;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            yb1 yb1Var = (yb1) arrayList.get(i);
            if (yb1Var == null) {
                return null;
            }
            if (yb1Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (yb1) (z2 ? this.n : this.m).get(i);
        }
        return null;
    }

    public final qb1 o() {
        pf pfVar = this.k;
        return pfVar != null ? pfVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final yb1 r(View view, boolean z2) {
        pf pfVar = this.k;
        if (pfVar != null) {
            return pfVar.r(view, z2);
        }
        return (yb1) ((xd) (z2 ? this.i : this.j).a).get(view);
    }

    public boolean s(yb1 yb1Var, yb1 yb1Var2) {
        if (yb1Var != null && yb1Var2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(yb1Var, yb1Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = yb1Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(yb1Var, yb1Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(qb1 qb1Var, cb1 cb1Var) {
        qb1 qb1Var2 = this.u;
        if (qb1Var2 != null) {
            qb1Var2.v(qb1Var, cb1Var);
        }
        ArrayList arrayList = this.v;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.v.size();
        pb1[] pb1VarArr = this.o;
        if (pb1VarArr == null) {
            pb1VarArr = new pb1[size];
        }
        this.o = null;
        pb1[] pb1VarArr2 = (pb1[]) this.v.toArray(pb1VarArr);
        for (int i = 0; i < size; i++) {
            pb1 pb1Var = pb1VarArr2[i];
            switch (cb1Var.a) {
                case 1:
                    pb1Var.f(qb1Var);
                    break;
                case 2:
                    pb1Var.a(qb1Var);
                    break;
                case 3:
                    pb1Var.g(qb1Var);
                    break;
                case 4:
                    pb1Var.c();
                    break;
                default:
                    pb1Var.d();
                    break;
            }
            pb1VarArr2[i] = null;
        }
        this.o = pb1VarArr2;
    }

    public void w(View view) {
        if (this.t) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.q = animatorArr;
        v(this, cb1.e);
        this.s = true;
    }

    public qb1 x(pb1 pb1Var) {
        qb1 qb1Var;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            if (!arrayList.remove(pb1Var) && (qb1Var = this.u) != null) {
                qb1Var.x(pb1Var);
            }
            if (this.v.size() == 0) {
                this.v = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.s) {
            if (!this.t) {
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
                this.q = y;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.q = animatorArr;
                v(this, cb1.f);
            }
            this.s = false;
        }
    }

    public void z() {
        G();
        xd xdVarP = p();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (xdVarP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new lv(this, xdVarP));
                    long j = this.e;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.d;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new h0(6, this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        m();
    }

    public void B(uj ujVar) {
    }

    public void f(yb1 yb1Var) {
    }

    public void E() {
    }
}
