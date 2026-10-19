package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 implements ku {
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ hw0(RecyclerView recyclerView) {
        this.c = recyclerView;
    }

    public void a(l7 l7Var) {
        int i = l7Var.a;
        RecyclerView recyclerView = this.c;
        if (i == 1) {
            recyclerView.p.Y(l7Var.b, l7Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.p.b0(l7Var.b, l7Var.d);
        } else if (i == 4) {
            recyclerView.p.c0(l7Var.b, l7Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.p.a0(l7Var.b, l7Var.d);
        }
    }

    @Override // defpackage.ku
    public boolean b(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.c;
        if (recyclerView.p.e()) {
            i2 = (int) f;
            i = 0;
        } else {
            i = recyclerView.p.d() ? (int) f : 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.p0();
        return recyclerView.I(i, i2, 0, Integer.MAX_VALUE);
    }

    public hx0 c(int i) {
        RecyclerView recyclerView = this.c;
        int iH = recyclerView.h.h();
        hx0 hx0Var = null;
        for (int i2 = 0; i2 < iH; i2++) {
            hx0 hx0VarM = RecyclerView.M(recyclerView.h.g(i2));
            if (hx0VarM != null && !hx0VarM.i() && hx0VarM.c == i) {
                if (!recyclerView.h.c.contains(hx0VarM.a)) {
                    hx0Var = hx0VarM;
                    break;
                }
                hx0Var = hx0VarM;
            }
        }
        if (hx0Var != null) {
            if (!recyclerView.h.c.contains(hx0Var.a)) {
                return hx0Var;
            }
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void d(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.c;
        int iH = recyclerView.h.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.h.g(i6);
            hx0 hx0VarM = RecyclerView.M(viewG);
            if (hx0VarM != null && !hx0VarM.p() && (i4 = hx0VarM.c) >= i && i4 < i5) {
                hx0VarM.a(2);
                if (obj == null) {
                    hx0VarM.a(1024);
                } else if ((1024 & hx0VarM.j) == 0) {
                    if (hx0VarM.k == null) {
                        ArrayList arrayList = new ArrayList();
                        hx0VarM.k = arrayList;
                        hx0VarM.l = DesugarCollections.unmodifiableList(arrayList);
                    }
                    hx0VarM.k.add(obj);
                }
                ((sw0) viewG.getLayoutParams()).c = true;
            }
        }
        yw0 yw0Var = recyclerView.e;
        ArrayList arrayList2 = (ArrayList) yw0Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            hx0 hx0Var = (hx0) arrayList2.get(size);
            if (hx0Var != null && (i3 = hx0Var.c) >= i && i3 < i5) {
                hx0Var.a(2);
                yw0Var.l(size);
            }
        }
        recyclerView.l0 = true;
    }

    public void e(int i, int i2) {
        RecyclerView recyclerView = this.c;
        int iH = recyclerView.h.h();
        for (int i3 = 0; i3 < iH; i3++) {
            hx0 hx0VarM = RecyclerView.M(recyclerView.h.g(i3));
            if (hx0VarM != null && !hx0VarM.p() && hx0VarM.c >= i) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + hx0VarM + " now at position " + (hx0VarM.c + i2));
                }
                hx0VarM.m(i2, false);
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.e.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            hx0 hx0Var = (hx0) arrayList.get(i4);
            if (hx0Var != null && hx0Var.c >= i) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + hx0Var + " now at position " + (hx0Var.c + i2));
                }
                hx0Var.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.k0 = true;
    }

    @Override // defpackage.ku
    public float f() {
        float f;
        RecyclerView recyclerView = this.c;
        if (recyclerView.p.e()) {
            f = recyclerView.c0;
        } else {
            if (!recyclerView.p.d()) {
                return 0.0f;
            }
            f = recyclerView.b0;
        }
        return -f;
    }

    @Override // defpackage.ku
    public void g() {
        this.c.p0();
    }

    public void h(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.c;
        int iH = recyclerView.h.h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iH; i11++) {
            hx0 hx0VarM = RecyclerView.M(recyclerView.h.g(i11));
            if (hx0VarM != null && (i10 = hx0VarM.c) >= i4 && i10 <= i3) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + hx0VarM);
                }
                if (hx0VarM.c == i) {
                    hx0VarM.m(i2 - i, false);
                } else {
                    hx0VarM.m(i5, false);
                }
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.e.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            hx0 hx0Var = (hx0) arrayList.get(i12);
            if (hx0Var != null && (i9 = hx0Var.c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    hx0Var.m(i2 - i, z);
                } else {
                    hx0Var.m(i8, z);
                }
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + hx0Var);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.k0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void i(hx0 hx0Var, vl0 vl0Var, vl0 vl0Var2) {
        boolean zG;
        hx0Var.o(false);
        RecyclerView recyclerView = this.c;
        qs qsVar = (qs) recyclerView.N;
        if (vl0Var != null) {
            qsVar.getClass();
            int i = vl0Var.a;
            int i2 = vl0Var2.a;
            if (i == i2 && vl0Var.b == vl0Var2.b) {
                qsVar.q(hx0Var);
                hx0Var.a.setAlpha(0.0f);
                qsVar.i.add(hx0Var);
                zG = true;
            } else {
                zG = qsVar.g(hx0Var, i, vl0Var.b, i2, vl0Var2.b);
            }
        } else {
            qsVar.q(hx0Var);
            hx0Var.a.setAlpha(0.0f);
            qsVar.i.add(hx0Var);
            zG = true;
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void j(hx0 hx0Var, vl0 vl0Var, vl0 vl0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.c;
        recyclerView.e.r(hx0Var);
        recyclerView.h(hx0Var);
        hx0Var.o(false);
        qs qsVar = (qs) recyclerView.N;
        qsVar.getClass();
        int i = vl0Var.a;
        int i2 = vl0Var.b;
        View view = hx0Var.a;
        int left = vl0Var2 == null ? view.getLeft() : vl0Var2.a;
        int top = vl0Var2 == null ? view.getTop() : vl0Var2.b;
        if (hx0Var.i() || (i == left && i2 == top)) {
            qsVar.q(hx0Var);
            qsVar.h.add(hx0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = qsVar.g(hx0Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void k(int i) {
        RecyclerView recyclerView = this.c;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.M(childAt);
            iw0 iw0Var = recyclerView.o;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
