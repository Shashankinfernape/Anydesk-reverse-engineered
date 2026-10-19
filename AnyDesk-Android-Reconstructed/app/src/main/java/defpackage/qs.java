package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class qs extends nw0 {
    public static TimeInterpolator s;
    public boolean g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public qs() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = true;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((hx0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.nw0
    public final boolean a(hx0 hx0Var, hx0 hx0Var2, vl0 vl0Var, vl0 vl0Var2) {
        int i;
        int i2;
        int i3 = vl0Var.a;
        int i4 = vl0Var.b;
        if (hx0Var2.p()) {
            int i5 = vl0Var.a;
            i2 = vl0Var.b;
            i = i5;
        } else {
            i = vl0Var2.a;
            i2 = vl0Var2.b;
        }
        if (hx0Var == hx0Var2) {
            return g(hx0Var, i3, i4, i, i2);
        }
        View view = hx0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        q(hx0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = hx0Var2.a;
        q(hx0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        os osVar = new os();
        osVar.a = hx0Var;
        osVar.b = hx0Var2;
        osVar.c = i3;
        osVar.d = i4;
        osVar.e = i;
        osVar.f = i2;
        this.k.add(osVar);
        return true;
    }

    @Override // defpackage.nw0
    public final void d(hx0 hx0Var) {
        View view = hx0Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ps) arrayList.get(size)).a == hx0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                k(hx0Var);
                arrayList.remove(size);
            }
        }
        l(this.k, hx0Var);
        if (this.h.remove(hx0Var)) {
            view.setAlpha(1.0f);
            c(hx0Var);
        }
        if (this.i.remove(hx0Var)) {
            view.setAlpha(1.0f);
            i(hx0Var);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            l(arrayList3, hx0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((ps) arrayList5.get(size4)).a == hx0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    k(hx0Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(hx0Var)) {
                view.setAlpha(1.0f);
                i(hx0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(hx0Var);
        this.o.remove(hx0Var);
        this.r.remove(hx0Var);
        this.p.remove(hx0Var);
        j();
    }

    @Override // defpackage.nw0
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ps psVar = (ps) arrayList.get(size);
            View view = psVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            k(psVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((hx0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            hx0 hx0Var = (hx0) arrayList3.get(size3);
            hx0Var.a.setAlpha(1.0f);
            i(hx0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            os osVar = (os) arrayList4.get(size4);
            hx0 hx0Var2 = osVar.a;
            if (hx0Var2 != null) {
                m(osVar, hx0Var2);
            }
            hx0 hx0Var3 = osVar.b;
            if (hx0Var3 != null) {
                m(osVar, hx0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    ps psVar2 = (ps) arrayList6.get(size6);
                    View view2 = psVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    k(psVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    hx0 hx0Var4 = (hx0) arrayList8.get(size8);
                    hx0Var4.a.setAlpha(1.0f);
                    i(hx0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    os osVar2 = (os) arrayList10.get(size10);
                    hx0 hx0Var5 = osVar2.a;
                    if (hx0Var5 != null) {
                        m(osVar2, hx0Var5);
                    }
                    hx0 hx0Var6 = osVar2.b;
                    if (hx0Var6 != null) {
                        m(osVar2, hx0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                id.c();
            }
        }
    }

    @Override // defpackage.nw0
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(hx0 hx0Var, int i, int i2, int i3, int i4) {
        View view = hx0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) hx0Var.a.getTranslationY());
        q(hx0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            k(hx0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ps psVar = new ps();
        psVar.a = hx0Var;
        psVar.b = translationX;
        psVar.c = translationY;
        psVar.d = i3;
        psVar.e = i4;
        this.j.add(psVar);
        return true;
    }

    public final void i(hx0 hx0Var) {
        n();
        c(hx0Var);
    }

    public final void j() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            id.c();
        }
    }

    public final void k(hx0 hx0Var) {
        o();
        c(hx0Var);
    }

    public final void l(ArrayList arrayList, hx0 hx0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            os osVar = (os) arrayList.get(size);
            if (m(osVar, hx0Var) && osVar.a == null && osVar.b == null) {
                arrayList.remove(osVar);
            }
        }
    }

    public final boolean m(os osVar, hx0 hx0Var) {
        if (osVar.b == hx0Var) {
            osVar.b = null;
        } else {
            if (osVar.a != hx0Var) {
                return false;
            }
            osVar.a = null;
        }
        View view = hx0Var.a;
        View view2 = hx0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(hx0Var);
        return true;
    }

    public final void q(hx0 hx0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        hx0Var.a.animate().setInterpolator(s);
        d(hx0Var);
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }
}
