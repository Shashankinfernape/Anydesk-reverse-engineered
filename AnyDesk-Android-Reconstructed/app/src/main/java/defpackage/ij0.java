package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ij0 {
    public int c;
    public int d;
    public int e;
    public Object f;

    public ij0() {
        if (us0.d == null) {
            us0.d = new us0(20);
        }
    }

    public int a(int i) {
        if (i < this.e) {
            return ((ByteBuffer) this.f).getShort(this.d + i);
        }
        return 0;
    }

    public void b() {
        if (((jj0) this.f).j != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.c;
            jj0 jj0Var = (jj0) this.f;
            if (i >= jj0Var.h || jj0Var.e[i] >= 0) {
                return;
            } else {
                this.c = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.d) {
            d(view, obj);
            return;
        }
        o3 o3Var = null;
        if (Build.VERSION.SDK_INT >= this.d) {
            tag = c(view);
        } else {
            tag = view.getTag(this.c);
            if (!((Class) this.f).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = oe1.d(view);
            if (accessibilityDelegateD != null) {
                o3Var = accessibilityDelegateD instanceof n3 ? ((n3) accessibilityDelegateD).a : new o3(accessibilityDelegateD);
            }
            if (o3Var == null) {
                o3Var = new o3();
            }
            oe1.n(view, o3Var);
            view.setTag(this.c, obj);
            oe1.h(view, this.e);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.c < ((jj0) this.f).h;
    }

    public void remove() {
        jj0 jj0Var = (jj0) this.f;
        b();
        if (this.d == -1) {
            nh0.j("Call next() before removing element from the iterator.");
            return;
        }
        jj0Var.b();
        jj0Var.j(this.d);
        this.d = -1;
        this.e = jj0Var.j;
    }
}
