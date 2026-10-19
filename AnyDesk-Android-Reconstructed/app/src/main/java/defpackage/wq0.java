package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wq0 {
    public final Runnable a;
    public final qd b = new qd();
    public l40 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public wq0(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = sq0.a.a(new oq0(this, 0), new oq0(this, 1), new pq0(this, 0), new pq0(this, 1));
            } else {
                onBackInvokedCallbackA = qq0.a.a(new pq0(this, 2));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(gf0 gf0Var, l40 l40Var) {
        l40Var.getClass();
        if0 if0VarR = gf0Var.R();
        if (if0VarR.d == af0.c) {
            return;
        }
        l40Var.b.add(new tq0(this, if0VarR, l40Var));
        e();
        l40Var.c = new vq0(0, this, wq0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object objPrevious;
        if (this.c == null) {
            qd qdVar = this.b;
            ListIterator<E> listIterator = qdVar.listIterator(qdVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((l40) objPrevious).a);
        }
        this.c = null;
    }

    public final void c() {
        Object objPrevious;
        l40 l40Var = this.c;
        if (l40Var == null) {
            qd qdVar = this.b;
            ListIterator listIterator = qdVar.listIterator(qdVar.e);
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((l40) objPrevious).a);
            l40Var = (l40) objPrevious;
        }
        this.c = null;
        if (l40Var != null) {
            l40Var.a();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        qq0 qq0Var = qq0.a;
        if (z && !this.f) {
            qq0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            qq0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        qd qdVar = this.b;
        if (qdVar == null || !qdVar.isEmpty()) {
            Iterator it = qdVar.iterator();
            while (it.hasNext()) {
                if (((l40) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
