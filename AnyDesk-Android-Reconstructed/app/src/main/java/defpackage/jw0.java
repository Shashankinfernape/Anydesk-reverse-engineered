package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jw0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    recyclerView.k(null);
                    recyclerView.h0.f = true;
                    recyclerView.Y(true);
                    if (!recyclerView.g.j()) {
                        recyclerView.requestLayout();
                    }
                    break;
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    recyclerView.k(null);
                    m7 m7Var = recyclerView.g;
                    ArrayList arrayList = (ArrayList) m7Var.c;
                    if (i != i2) {
                        arrayList.add(m7Var.l(null, 8, i, i2));
                        m7Var.a |= 8;
                        if (arrayList.size() == 1) {
                            ws0Var.f();
                        }
                    }
                    break;
            }
        }
    }

    public final void d(Object obj, int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    recyclerView.k(null);
                    m7 m7Var = recyclerView.g;
                    ArrayList arrayList = (ArrayList) m7Var.c;
                    if (i2 >= 1) {
                        arrayList.add(m7Var.l(obj, 4, i, i2));
                        m7Var.a = 4 | m7Var.a;
                        if (arrayList.size() == 1) {
                            ws0Var.f();
                        }
                    }
                    break;
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 0:
                    m0 m0Var = (m0) ws0Var.b;
                    if (m0Var.c == 3 && !m0Var.d) {
                        m0Var.k(1);
                    }
                    m0Var.a.unregisterObserver(ws0Var);
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    recyclerView.k(null);
                    m7 m7Var = recyclerView.g;
                    ArrayList arrayList = (ArrayList) m7Var.c;
                    if (i2 >= 1) {
                        arrayList.add(m7Var.l(null, 1, i, i2));
                        m7Var.a |= 1;
                        if (arrayList.size() == 1) {
                            ws0Var.f();
                        }
                    }
                    break;
            }
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    recyclerView.k(null);
                    m7 m7Var = recyclerView.g;
                    ArrayList arrayList = (ArrayList) m7Var.c;
                    if (i2 >= 1) {
                        arrayList.add(m7Var.l(null, 2, i, i2));
                        m7Var.a |= 2;
                        if (arrayList.size() == 1) {
                            ws0Var.f();
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public final void g() {
        iw0 iw0Var;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ws0 ws0Var = (ws0) ((Observable) this).mObservers.get(size);
            switch (ws0Var.a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) ws0Var.b;
                    if (recyclerView.f != null && (iw0Var = recyclerView.o) != null) {
                        int iR = q51.r(iw0Var.c);
                        if (iR != 1) {
                            if (iR != 2) {
                                recyclerView.requestLayout();
                            }
                        } else if (iw0Var.a() > 0) {
                            recyclerView.requestLayout();
                        }
                    }
                    break;
            }
        }
    }
}
