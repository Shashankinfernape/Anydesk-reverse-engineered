package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m7 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public m7(hw0 hw0Var) {
        this.b = new uu0(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = hw0Var;
        this.f = new ev(28, this);
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((fa1) this.d) != null) {
                if (((fa1) this.f) == null) {
                    this.f = new fa1();
                }
                fa1 fa1Var = (fa1) this.f;
                fa1Var.a = null;
                fa1Var.d = false;
                fa1Var.b = null;
                fa1Var.c = false;
                WeakHashMap weakHashMap = oe1.a;
                ColorStateList colorStateListC = ge1.c(view);
                if (colorStateListC != null) {
                    fa1Var.d = true;
                    fa1Var.a = colorStateListC;
                }
                PorterDuff.Mode modeD = ge1.d(view);
                if (modeD != null) {
                    fa1Var.c = true;
                    fa1Var.b = modeD;
                }
                if (fa1Var.d || fa1Var.c) {
                    tb.e(background, fa1Var, view.getDrawableState());
                    return;
                }
            }
            fa1 fa1Var2 = (fa1) this.e;
            if (fa1Var2 != null) {
                tb.e(background, fa1Var2, view.getDrawableState());
                return;
            }
            fa1 fa1Var3 = (fa1) this.d;
            if (fa1Var3 != null) {
                tb.e(background, fa1Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l7 l7Var = (l7) arrayList.get(i2);
            int i3 = l7Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = l7Var.b;
                    int i5 = l7Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(l7Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hw0) this.e).a((l7) arrayList.get(i));
        }
        q(arrayList);
        this.a = 0;
    }

    public void d() {
        hw0 hw0Var = (hw0) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l7 l7Var = (l7) arrayList.get(i);
            int i2 = l7Var.a;
            if (i2 == 1) {
                hw0Var.a(l7Var);
                hw0Var.e(l7Var.b, l7Var.d);
            } else if (i2 == 2) {
                hw0Var.a(l7Var);
                int i3 = l7Var.b;
                int i4 = l7Var.d;
                RecyclerView recyclerView = hw0Var.c;
                recyclerView.S(i3, i4, true);
                recyclerView.k0 = true;
                recyclerView.h0.c += i4;
            } else if (i2 == 4) {
                hw0Var.a(l7Var);
                hw0Var.d(l7Var.c, l7Var.b, l7Var.d);
            } else if (i2 == 8) {
                hw0Var.a(l7Var);
                hw0Var.h(l7Var.b, l7Var.d);
            }
        }
        q(arrayList);
        this.a = 0;
    }

    public void e(l7 l7Var) {
        int i;
        uu0 uu0Var = (uu0) this.b;
        int i2 = l7Var.a;
        if (i2 == 1 || i2 == 8) {
            id.q("should not dispatch add or move for pre layout");
            return;
        }
        int iU = u(l7Var.b, i2);
        int i3 = l7Var.b;
        int i4 = l7Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                id.p(l7Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < l7Var.d; i6++) {
            int iU2 = u((i * i6) + l7Var.b, l7Var.a);
            int i7 = l7Var.a;
            if (i7 == 2 ? iU2 != iU : !(i7 == 4 && iU2 == iU + 1)) {
                l7 l7VarL = l(l7Var.c, i7, iU, i5);
                f(l7VarL, i3);
                l7VarL.c = null;
                uu0Var.c(l7VarL);
                if (l7Var.a == 4) {
                    i3 += i5;
                }
                iU = iU2;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = l7Var.c;
        l7Var.c = null;
        uu0Var.c(l7Var);
        if (i5 > 0) {
            l7 l7VarL2 = l(obj, l7Var.a, iU, i5);
            f(l7VarL2, i3);
            l7VarL2.c = null;
            uu0Var.c(l7VarL2);
        }
    }

    public void f(l7 l7Var, int i) {
        hw0 hw0Var = (hw0) this.e;
        hw0Var.a(l7Var);
        int i2 = l7Var.a;
        if (i2 != 2) {
            if (i2 != 4) {
                id.q("only remove and update ops can be dispatched in first pass");
                return;
            } else {
                hw0Var.d(l7Var.c, i, l7Var.d);
                return;
            }
        }
        int i3 = l7Var.d;
        RecyclerView recyclerView = hw0Var.c;
        recyclerView.S(i, i3, true);
        recyclerView.k0 = true;
        recyclerView.h0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            l7 l7Var = (l7) arrayList.get(i2);
            int i3 = l7Var.a;
            int i4 = l7Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = l7Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (l7Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = l7Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += l7Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        fa1 fa1Var = (fa1) this.e;
        if (fa1Var != null) {
            return fa1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        fa1 fa1Var = (fa1) this.e;
        if (fa1Var != null) {
            return fa1Var.b;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = yv0.z;
        y6 y6VarC = y6.C(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        View view2 = (View) this.b;
        oe1.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                tb tbVar = (tb) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (tbVar) {
                    colorStateListI = tbVar.a.i(context2, i2);
                }
                if (colorStateListI != null) {
                    r(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ge1.h(view, y6VarC.s(1));
                if (Build.VERSION.SDK_INT == 21) {
                    Drawable background = view.getBackground();
                    boolean z = (ge1.c(view) == null && ge1.d(view) == null) ? false : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                ge1.i(view, av.b(typedArray.getInt(2, -1), null));
                if (Build.VERSION.SDK_INT == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z2 = (ge1.c(view) == null && ge1.d(view) == null) ? false : true;
                    if (background2 != null && z2) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            y6VarC.F();
        } catch (Throwable th) {
            y6VarC.F();
            throw th;
        }
    }

    public l7 l(Object obj, int i, int i2, int i3) {
        l7 l7Var = (l7) ((uu0) this.b).a();
        if (l7Var != null) {
            l7Var.a = i;
            l7Var.b = i2;
            l7Var.d = i3;
            l7Var.c = obj;
            return l7Var;
        }
        l7 l7Var2 = new l7();
        l7Var2.a = i;
        l7Var2.b = i2;
        l7Var2.d = i3;
        l7Var2.c = obj;
        return l7Var2;
    }

    public void m() {
        this.a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateListI;
        this.a = i;
        tb tbVar = (tb) this.c;
        if (tbVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (tbVar) {
                colorStateListI = tbVar.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        r(colorStateListI);
        a();
    }

    public void o(l7 l7Var) {
        hw0 hw0Var = (hw0) this.e;
        ((ArrayList) this.d).add(l7Var);
        int i = l7Var.a;
        if (i == 1) {
            hw0Var.e(l7Var.b, l7Var.d);
            return;
        }
        if (i == 2) {
            int i2 = l7Var.b;
            int i3 = l7Var.d;
            RecyclerView recyclerView = hw0Var.c;
            recyclerView.S(i2, i3, false);
            recyclerView.k0 = true;
            return;
        }
        if (i == 4) {
            hw0Var.d(l7Var.c, l7Var.b, l7Var.d);
        } else if (i == 8) {
            hw0Var.h(l7Var.b, l7Var.d);
        } else {
            id.p(l7Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    public void p() {
        boolean z;
        byte b;
        l7 l7VarL;
        int i;
        int i2;
        int i3;
        l7 l7VarL2;
        boolean z2;
        boolean z3;
        Object obj;
        l7 l7Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        uu0 uu0Var = (uu0) this.b;
        hw0 hw0Var = (hw0) this.e;
        ev evVar = (ev) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        evVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((l7) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            m7 m7Var = (m7) evVar.d;
            uu0 uu0Var2 = (uu0) m7Var.b;
            l7 l7Var2 = (l7) arrayList.get(size);
            l7 l7Var3 = (l7) arrayList.get(i12);
            int i13 = l7Var3.a;
            if (i13 == 1) {
                int i14 = l7Var2.d;
                int i15 = l7Var3.b;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = l7Var2.b;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    l7Var2.b = i17 + l7Var3.d;
                }
                int i18 = l7Var3.b;
                if (i18 <= i14) {
                    l7Var2.d = i14 + l7Var3.d;
                }
                l7Var3.b = i18 + i16;
                arrayList.set(size, l7Var3);
                arrayList.set(i12, l7Var2);
            } else if (i13 == 2) {
                int i19 = l7Var2.b;
                int i20 = l7Var2.d;
                int i21 = l7Var3.b;
                if (i19 < i20) {
                    if (i21 == i19 && l7Var3.d == i20 - i19) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i21 == i20 + 1 && l7Var3.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i20 < i21) {
                    l7Var3.b = i21 - 1;
                } else {
                    int i22 = l7Var3.d;
                    if (i20 < i21 + i22) {
                        l7Var3.d = i22 - 1;
                        l7Var2.a = 2;
                        l7Var2.d = 1;
                        if (l7Var3.d == 0) {
                            arrayList.remove(i12);
                            l7Var3.c = null;
                            uu0Var2.c(l7Var3);
                        }
                    }
                }
                int i23 = l7Var2.b;
                int i24 = l7Var3.b;
                if (i23 <= i24) {
                    l7Var3.b = i24 + 1;
                } else {
                    int i25 = i24 + l7Var3.d;
                    if (i23 < i25) {
                        obj = null;
                        l7 l7VarL3 = m7Var.l(null, 2, i23 + 1, i25 - i23);
                        l7Var3.d = l7Var2.b - l7Var3.b;
                        l7Var = l7VarL3;
                    }
                    if (z3) {
                        arrayList.set(size, l7Var3);
                        arrayList.remove(i12);
                        l7Var2.c = obj;
                        uu0Var2.c(l7Var2);
                    } else {
                        if (z2) {
                            if (l7Var != null) {
                                i10 = l7Var2.b;
                                if (i10 > l7Var.b) {
                                    l7Var2.b = i10 - l7Var.d;
                                }
                                i11 = l7Var2.d;
                                if (i11 > l7Var.b) {
                                    l7Var2.d = i11 - l7Var.d;
                                }
                            }
                            i8 = l7Var2.b;
                            if (i8 > l7Var3.b) {
                                l7Var2.b = i8 - l7Var3.d;
                            }
                            i9 = l7Var2.d;
                            if (i9 > l7Var3.b) {
                                l7Var2.d = i9 - l7Var3.d;
                            }
                        } else {
                            if (l7Var != null) {
                                i6 = l7Var2.b;
                                if (i6 >= l7Var.b) {
                                    l7Var2.b = i6 - l7Var.d;
                                }
                                i7 = l7Var2.d;
                                if (i7 >= l7Var.b) {
                                    l7Var2.d = i7 - l7Var.d;
                                }
                            }
                            i4 = l7Var2.b;
                            if (i4 >= l7Var3.b) {
                                l7Var2.b = i4 - l7Var3.d;
                            }
                            i5 = l7Var2.d;
                            if (i5 >= l7Var3.b) {
                                l7Var2.d = i5 - l7Var3.d;
                            }
                        }
                        arrayList.set(size, l7Var3);
                        if (l7Var2.b != l7Var2.d) {
                            arrayList.set(i12, l7Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (l7Var != null) {
                            arrayList.add(size, l7Var);
                        }
                    }
                }
                obj = null;
                l7Var = null;
                if (z3) {
                    arrayList.set(size, l7Var3);
                    arrayList.remove(i12);
                    l7Var2.c = obj;
                    uu0Var2.c(l7Var2);
                } else {
                    if (z2) {
                        if (l7Var != null) {
                            i10 = l7Var2.b;
                            if (i10 > l7Var.b) {
                                l7Var2.b = i10 - l7Var.d;
                            }
                            i11 = l7Var2.d;
                            if (i11 > l7Var.b) {
                                l7Var2.d = i11 - l7Var.d;
                            }
                        }
                        i8 = l7Var2.b;
                        if (i8 > l7Var3.b) {
                            l7Var2.b = i8 - l7Var3.d;
                        }
                        i9 = l7Var2.d;
                        if (i9 > l7Var3.b) {
                            l7Var2.d = i9 - l7Var3.d;
                        }
                    } else {
                        if (l7Var != null) {
                            i6 = l7Var2.b;
                            if (i6 >= l7Var.b) {
                                l7Var2.b = i6 - l7Var.d;
                            }
                            i7 = l7Var2.d;
                            if (i7 >= l7Var.b) {
                                l7Var2.d = i7 - l7Var.d;
                            }
                        }
                        i4 = l7Var2.b;
                        if (i4 >= l7Var3.b) {
                            l7Var2.b = i4 - l7Var3.d;
                        }
                        i5 = l7Var2.d;
                        if (i5 >= l7Var3.b) {
                            l7Var2.d = i5 - l7Var3.d;
                        }
                    }
                    arrayList.set(size, l7Var3);
                    if (l7Var2.b != l7Var2.d) {
                        arrayList.set(i12, l7Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (l7Var != null) {
                        arrayList.add(size, l7Var);
                    }
                }
            } else if (i13 == 4) {
                int i26 = l7Var2.d;
                int i27 = l7Var3.b;
                if (i26 < i27) {
                    l7Var3.b = i27 - 1;
                } else {
                    int i28 = l7Var3.d;
                    if (i26 < i27 + i28) {
                        l7Var3.d = i28 - 1;
                        l7VarL = m7Var.l(l7Var3.c, 4, l7Var2.b, 1);
                    }
                    i = l7Var2.b;
                    i2 = l7Var3.b;
                    if (i <= i2) {
                        l7Var3.b = i2 + 1;
                    } else {
                        i3 = i2 + l7Var3.d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            l7VarL2 = m7Var.l(l7Var3.c, 4, i + 1, i29);
                            l7Var3.d -= i29;
                        }
                        arrayList.set(i12, l7Var2);
                        if (l7Var3.d > 0) {
                            arrayList.set(size, l7Var3);
                        } else {
                            arrayList.remove(size);
                            l7Var3.c = null;
                            uu0Var2.c(l7Var3);
                        }
                        if (l7VarL != null) {
                            arrayList.add(size, l7VarL);
                        }
                        if (l7VarL2 != null) {
                            arrayList.add(size, l7VarL2);
                        }
                    }
                    l7VarL2 = null;
                    arrayList.set(i12, l7Var2);
                    if (l7Var3.d > 0) {
                        arrayList.set(size, l7Var3);
                    } else {
                        arrayList.remove(size);
                        l7Var3.c = null;
                        uu0Var2.c(l7Var3);
                    }
                    if (l7VarL != null) {
                        arrayList.add(size, l7VarL);
                    }
                    if (l7VarL2 != null) {
                        arrayList.add(size, l7VarL2);
                    }
                }
                l7VarL = null;
                i = l7Var2.b;
                i2 = l7Var3.b;
                if (i <= i2) {
                    l7Var3.b = i2 + 1;
                } else {
                    i3 = i2 + l7Var3.d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        l7VarL2 = m7Var.l(l7Var3.c, 4, i + 1, i210);
                        l7Var3.d -= i210;
                    }
                    arrayList.set(i12, l7Var2);
                    if (l7Var3.d > 0) {
                        arrayList.set(size, l7Var3);
                    } else {
                        arrayList.remove(size);
                        l7Var3.c = null;
                        uu0Var2.c(l7Var3);
                    }
                    if (l7VarL != null) {
                        arrayList.add(size, l7VarL);
                    }
                    if (l7VarL2 != null) {
                        arrayList.add(size, l7VarL2);
                    }
                }
                l7VarL2 = null;
                arrayList.set(i12, l7Var2);
                if (l7Var3.d > 0) {
                    arrayList.set(size, l7Var3);
                } else {
                    arrayList.remove(size);
                    l7Var3.c = null;
                    uu0Var2.c(l7Var3);
                }
                if (l7VarL != null) {
                    arrayList.add(size, l7VarL);
                }
                if (l7VarL2 != null) {
                    arrayList.add(size, l7VarL2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            l7 l7VarL4 = (l7) arrayList.get(i30);
            int i31 = l7VarL4.a;
            if (i31 == 1) {
                o(l7VarL4);
            } else if (i31 == 2) {
                int i32 = l7VarL4.b;
                int i33 = l7VarL4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (hw0Var.c(i34) != null || b(i34)) {
                        if (b2 == 0) {
                            e(l(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            o(l(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != l7VarL4.d) {
                    l7VarL4.c = null;
                    uu0Var.c(l7VarL4);
                    l7VarL4 = l(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    e(l7VarL4);
                } else {
                    o(l7VarL4);
                }
            } else if (i31 == 4) {
                int i36 = l7VarL4.b;
                int i37 = l7VarL4.d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (hw0Var.c(i36) != null || b(i36)) {
                        if (b3 == 0) {
                            e(l(l7VarL4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            o(l(l7VarL4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != l7VarL4.d) {
                    Object obj2 = l7VarL4.c;
                    l7VarL4.c = null;
                    uu0Var.c(l7VarL4);
                    l7VarL4 = l(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    e(l7VarL4);
                } else {
                    o(l7VarL4);
                }
            } else if (i31 == 8) {
                o(l7VarL4);
            }
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l7 l7Var = (l7) arrayList.get(i);
            l7Var.c = null;
            ((uu0) this.b).c(l7Var);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((fa1) this.d) == null) {
                this.d = new fa1();
            }
            fa1 fa1Var = (fa1) this.d;
            fa1Var.a = colorStateList;
            fa1Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((fa1) this.e) == null) {
            this.e = new fa1();
        }
        fa1 fa1Var = (fa1) this.e;
        fa1Var.a = colorStateList;
        fa1Var.d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((fa1) this.e) == null) {
            this.e = new fa1();
        }
        fa1 fa1Var = (fa1) this.e;
        fa1Var.b = mode;
        fa1Var.c = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        uu0 uu0Var = (uu0) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l7 l7Var = (l7) arrayList.get(size);
            int i5 = l7Var.a;
            int i6 = l7Var.b;
            if (i5 == 8) {
                int i7 = l7Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            l7Var.b = i6 + 1;
                            l7Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            l7Var.b = i6 - 1;
                            l7Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        l7Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        l7Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        l7Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        l7Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= l7Var.d;
                } else if (i5 == 2) {
                    i += l7Var.d;
                }
            } else if (i2 == 1) {
                l7Var.b = i6 + 1;
            } else if (i2 == 2) {
                l7Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            l7 l7Var2 = (l7) arrayList.get(size2);
            int i8 = l7Var2.a;
            int i9 = l7Var2.d;
            if (i8 == 8) {
                if (i9 == l7Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    l7Var2.c = null;
                    uu0Var.c(l7Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                l7Var2.c = null;
                uu0Var.c(l7Var2);
            }
        }
        return i;
    }

    public m7(View view) {
        this.a = -1;
        this.b = view;
        this.c = tb.a();
    }

    public m7(vn0 vn0Var) {
        this.b = vn0Var;
        this.c = new ArrayList();
        this.e = new LinkedHashMap();
    }
}
