package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public qb1 c;
    public ViewGroup d;

    /* JADX WARN: Code duplicated, block: B:100:0x021b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0229  */
    /* JADX WARN: Code duplicated, block: B:103:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f3 A[EDGE_INSN: B:134:0x01f3->B:90:0x01f3 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        ah ahVar;
        ah ahVar2;
        xd xdVar;
        xd xdVar2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        xd xdVarP;
        int i4;
        Animator animator;
        ob1 ob1Var;
        yb1 yb1Var;
        yb1 yb1Var2;
        int i5;
        ah ahVar3;
        int i6;
        View view;
        yb1 yb1Var3;
        xd xdVar3;
        int i7;
        int i8;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i9;
        View view4;
        View view5;
        xh0 xh0Var;
        int iH;
        int i10;
        View view6;
        ah ahVar4;
        int size2;
        int i11;
        qb1 qb1Var = this.c;
        ViewGroup viewGroup = this.d;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        int i12 = 1;
        if (!ub1.c.remove(viewGroup)) {
            return true;
        }
        xd xdVarB = ub1.b();
        ArrayList arrayList2 = (ArrayList) xdVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(qb1Var);
            qb1Var.a(new sb1(this, xdVarB));
            qb1Var.h(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((qb1) obj).y(viewGroup);
                }
            }
            qb1Var.m = new ArrayList();
            qb1Var.n = new ArrayList();
            ahVar = qb1Var.i;
            ahVar2 = qb1Var.j;
            xdVar = new xd((xd) ahVar.a);
            xdVar2 = new xd((xd) ahVar2.a);
            i = 0;
            while (true) {
                iArr = qb1Var.l;
                if (i < iArr.length) {
                    break;
                }
                i5 = iArr[i];
                if (i5 != i12) {
                    ahVar3 = ahVar2;
                    for (i6 = xdVar.e - 1; i6 >= 0; i6--) {
                        view = (View) xdVar.f(i6);
                        if (view == null && qb1Var.t(view) && (yb1Var3 = (yb1) xdVar2.remove(view)) != null && qb1Var.t(yb1Var3.b)) {
                            qb1Var.m.add((yb1) xdVar.g(i6));
                            qb1Var.n.add(yb1Var3);
                        }
                    }
                } else if (i5 != 2) {
                    ahVar3 = ahVar2;
                    xdVar3 = (xd) ahVar.d;
                    xd xdVar4 = (xd) ahVar3.d;
                    i7 = xdVar3.e;
                    for (i8 = 0; i8 < i7; i8++) {
                        view2 = (View) xdVar3.i(i8);
                        if (view2 == null && qb1Var.t(view2) && (view3 = (View) xdVar4.get(xdVar3.f(i8))) != null && qb1Var.t(view3)) {
                            yb1 yb1Var4 = (yb1) xdVar.get(view2);
                            yb1 yb1Var5 = (yb1) xdVar2.get(view3);
                            if (yb1Var4 != null && yb1Var5 != null) {
                                qb1Var.m.add(yb1Var4);
                                qb1Var.n.add(yb1Var5);
                                xdVar.remove(view2);
                                xdVar2.remove(view3);
                            }
                        }
                    }
                } else if (i5 != 3) {
                    sparseArray = (SparseArray) ahVar.b;
                    ahVar3 = ahVar2;
                    SparseArray sparseArray2 = (SparseArray) ahVar3.b;
                    size = sparseArray.size();
                    for (i9 = 0; i9 < size; i9++) {
                        view4 = (View) sparseArray.valueAt(i9);
                        if (view4 == null && qb1Var.t(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i9))) != null && qb1Var.t(view5)) {
                            yb1 yb1Var6 = (yb1) xdVar.get(view4);
                            yb1 yb1Var7 = (yb1) xdVar2.get(view5);
                            if (yb1Var6 != null && yb1Var7 != null) {
                                qb1Var.m.add(yb1Var6);
                                qb1Var.n.add(yb1Var7);
                                xdVar.remove(view4);
                                xdVar2.remove(view5);
                            }
                        }
                    }
                } else if (i5 != 4) {
                    ahVar3 = ahVar2;
                } else {
                    xh0Var = (xh0) ahVar.c;
                    xh0 xh0Var2 = (xh0) ahVar2.c;
                    iH = xh0Var.h();
                    i10 = 0;
                    while (i10 < iH) {
                        view6 = (View) xh0Var.i(i10);
                        if (view6 == null && qb1Var.t(view6)) {
                            ahVar4 = ahVar2;
                            View view7 = (View) xh0Var2.d(xh0Var.f(i10));
                            if (view7 != null && qb1Var.t(view7)) {
                                yb1 yb1Var8 = (yb1) xdVar.get(view6);
                                yb1 yb1Var9 = (yb1) xdVar2.get(view7);
                                if (yb1Var8 != null && yb1Var9 != null) {
                                    qb1Var.m.add(yb1Var8);
                                    qb1Var.n.add(yb1Var9);
                                    xdVar.remove(view6);
                                    xdVar2.remove(view7);
                                }
                            }
                            i10++;
                            ahVar2 = ahVar4;
                        } else {
                            ahVar4 = ahVar2;
                        }
                        i10++;
                        ahVar2 = ahVar4;
                    }
                    ahVar3 = ahVar2;
                }
                i++;
                ahVar2 = ahVar3;
                i12 = 1;
            }
            for (i2 = 0; i2 < xdVar.e; i2++) {
                yb1Var2 = (yb1) xdVar.i(i2);
                if (qb1Var.t(yb1Var2.b)) {
                    qb1Var.m.add(yb1Var2);
                    qb1Var.n.add(null);
                }
            }
            for (i3 = 0; i3 < xdVar2.e; i3++) {
                yb1Var = (yb1) xdVar2.i(i3);
                if (qb1Var.t(yb1Var.b)) {
                    qb1Var.n.add(yb1Var);
                    qb1Var.m.add(null);
                }
            }
            xdVarP = qb1.p();
            int i13 = xdVarP.e;
            WindowId windowId = viewGroup.getWindowId();
            for (i4 = i13 - 1; i4 >= 0; i4--) {
                animator = (Animator) xdVarP.f(i4);
                if (animator == null && (ob1Var = (ob1) xdVarP.get(animator)) != null) {
                    qb1 qb1Var2 = ob1Var.e;
                    View view8 = ob1Var.a;
                    if (view8 != null && windowId.equals(ob1Var.d)) {
                        yb1 yb1Var10 = ob1Var.c;
                        yb1 yb1VarR = qb1Var.r(view8, true);
                        yb1 yb1VarN = qb1Var.n(view8, true);
                        if (yb1VarR == null && yb1VarN == null) {
                            yb1VarN = (yb1) ((xd) qb1Var.j.a).get(view8);
                        }
                        if ((yb1VarR != null || yb1VarN != null) && qb1Var2.s(yb1Var10, yb1VarN)) {
                            qb1Var2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                xdVarP.remove(animator);
                            }
                        }
                    }
                }
            }
            qb1Var.l(viewGroup, qb1Var.i, qb1Var.j, qb1Var.m, qb1Var.n);
            qb1Var.z();
            return true;
        }
        arrayList2 = new ArrayList();
        xdVarB.put(viewGroup, arrayList2);
        arrayList2.add(qb1Var);
        qb1Var.a(new sb1(this, xdVarB));
        qb1Var.h(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                ((qb1) obj2).y(viewGroup);
            }
        }
        qb1Var.m = new ArrayList();
        qb1Var.n = new ArrayList();
        ahVar = qb1Var.i;
        ahVar2 = qb1Var.j;
        xdVar = new xd((xd) ahVar.a);
        xdVar2 = new xd((xd) ahVar2.a);
        i = 0;
        while (true) {
            iArr = qb1Var.l;
            if (i < iArr.length) {
                break;
                break;
            }
            i5 = iArr[i];
            if (i5 != i12) {
                ahVar3 = ahVar2;
                while (i6 >= 0) {
                    view = (View) xdVar.f(i6);
                    if (view == null) {
                    }
                }
            } else if (i5 != 2) {
                ahVar3 = ahVar2;
                xdVar3 = (xd) ahVar.d;
                xd xdVar5 = (xd) ahVar3.d;
                i7 = xdVar3.e;
                while (i8 < i7) {
                    view2 = (View) xdVar3.i(i8);
                    if (view2 == null) {
                    }
                }
            } else if (i5 != 3) {
                sparseArray = (SparseArray) ahVar.b;
                ahVar3 = ahVar2;
                SparseArray sparseArray3 = (SparseArray) ahVar3.b;
                size = sparseArray.size();
                while (i9 < size) {
                    view4 = (View) sparseArray.valueAt(i9);
                    if (view4 == null) {
                    }
                }
            } else if (i5 != 4) {
                ahVar3 = ahVar2;
            } else {
                xh0Var = (xh0) ahVar.c;
                xh0 xh0Var3 = (xh0) ahVar2.c;
                iH = xh0Var.h();
                i10 = 0;
                while (i10 < iH) {
                    view6 = (View) xh0Var.i(i10);
                    if (view6 == null) {
                        ahVar4 = ahVar2;
                    } else {
                        ahVar4 = ahVar2;
                    }
                    i10++;
                    ahVar2 = ahVar4;
                }
                ahVar3 = ahVar2;
            }
            i++;
            ahVar2 = ahVar3;
            i12 = 1;
        }
        while (i2 < xdVar.e) {
            yb1Var2 = (yb1) xdVar.i(i2);
            if (qb1Var.t(yb1Var2.b)) {
                qb1Var.m.add(yb1Var2);
                qb1Var.n.add(null);
            }
        }
        while (i3 < xdVar2.e) {
            yb1Var = (yb1) xdVar2.i(i3);
            if (qb1Var.t(yb1Var.b)) {
                qb1Var.n.add(yb1Var);
                qb1Var.m.add(null);
            }
        }
        xdVarP = qb1.p();
        int i14 = xdVarP.e;
        WindowId windowId2 = viewGroup.getWindowId();
        while (i4 >= 0) {
            animator = (Animator) xdVarP.f(i4);
            if (animator == null) {
            }
        }
        qb1Var.l(viewGroup, qb1Var.i, qb1Var.j, qb1Var.m, qb1Var.n);
        qb1Var.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.d;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ub1.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) ub1.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qb1) obj).y(viewGroup);
            }
        }
        this.c.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
