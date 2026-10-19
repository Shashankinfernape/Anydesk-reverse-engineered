package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r60 implements Runnable {
    public static final ThreadLocal g = new ThreadLocal();
    public static final he h = new he(5);
    public long d;
    public long e;
    public final ArrayList c = new ArrayList();
    public final ArrayList f = new ArrayList();

    public static hx0 c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.h.h();
        for (int i2 = 0; i2 < iH; i2++) {
            hx0 hx0VarM = RecyclerView.M(recyclerView.h.g(i2));
            if (hx0VarM.c == i && !hx0VarM.g()) {
                return null;
            }
        }
        yw0 yw0Var = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (bb1.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.U(false);
                Trace.endSection();
            }
        }
        recyclerView.T();
        hx0 hx0VarQ = yw0Var.q(i, j);
        if (hx0VarQ != null) {
            if (!hx0VarQ.f() || hx0VarQ.g()) {
                yw0Var.c(hx0VarQ, false);
            } else {
                yw0Var.m(hx0VarQ.a);
            }
        }
        return hx0VarQ;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.u) {
            if (RecyclerView.C0 && !this.c.contains(recyclerView)) {
                nh0.j("attempting to post unregistered view!");
                return;
            } else if (this.d == 0) {
                this.d = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        p60 p60Var = recyclerView.g0;
        p60Var.a = i;
        p60Var.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    public final void b(long j) {
        q60 q60Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        q60 q60Var2;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            p60 p60Var = recyclerView3.g0;
            if (windowVisibility == 0) {
                p60Var.b(recyclerView3, false);
                i += p60Var.d;
            }
        }
        ArrayList arrayList2 = this.f;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                p60 p60Var2 = recyclerView4.g0;
                int iAbs = Math.abs(p60Var2.b) + Math.abs(p60Var2.a);
                for (int i5 = 0; i5 < p60Var2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        q60Var2 = new q60();
                        arrayList2.add(q60Var2);
                    } else {
                        q60Var2 = (q60) arrayList2.get(i3);
                    }
                    int[] iArr = p60Var2.c;
                    int i6 = iArr[i5 + 1];
                    q60Var2.a = i6 <= iAbs;
                    q60Var2.b = iAbs;
                    q60Var2.c = i6;
                    q60Var2.d = recyclerView4;
                    q60Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, h);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (q60Var = (q60) arrayList2.get(i7)).d) != null; i7++) {
            hx0 hx0VarC = c(recyclerView, q60Var.e, q60Var.a ? Long.MAX_VALUE : j);
            if (hx0VarC != null && hx0VarC.b != null && hx0VarC.f() && !hx0VarC.g() && (recyclerView2 = (RecyclerView) hx0VarC.b.get()) != null) {
                if (recyclerView2.E && recyclerView2.h.h() != 0) {
                    yw0 yw0Var = recyclerView2.e;
                    nw0 nw0Var = recyclerView2.N;
                    if (nw0Var != null) {
                        nw0Var.e();
                    }
                    rw0 rw0Var = recyclerView2.p;
                    if (rw0Var != null) {
                        rw0Var.j0(yw0Var);
                        recyclerView2.p.k0(yw0Var);
                    }
                    ((ArrayList) yw0Var.c).clear();
                    yw0Var.k();
                }
                p60 p60Var3 = recyclerView2.g0;
                p60Var3.b(recyclerView2, true);
                if (p60Var3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        dx0 dx0Var = recyclerView2.h0;
                        iw0 iw0Var = recyclerView2.o;
                        dx0Var.d = 1;
                        dx0Var.e = iw0Var.a();
                        dx0Var.g = false;
                        dx0Var.h = false;
                        dx0Var.i = false;
                        for (int i8 = 0; i8 < p60Var3.d * 2; i8 += 2) {
                            c(recyclerView2, p60Var3.c[i8], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            q60Var.a = false;
            q60Var.b = 0;
            q60Var.c = 0;
            q60Var.d = null;
            q60Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.c;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.e);
                }
            }
        } finally {
            this.d = 0L;
            Trace.endSection();
        }
    }
}
