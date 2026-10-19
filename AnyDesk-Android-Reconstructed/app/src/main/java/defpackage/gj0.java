package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends ij0 implements Iterator, yd0 {
    public final /* synthetic */ int g;

    public gj0(jj0 jj0Var, int i) {
        this.g = i;
        jj0Var.getClass();
        this.f = jj0Var;
        this.d = -1;
        this.e = jj0Var.j;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                b();
                int i = this.c;
                jj0 jj0Var = (jj0) this.f;
                if (i >= jj0Var.h) {
                    throw new NoSuchElementException();
                }
                this.c = i + 1;
                this.d = i;
                hj0 hj0Var = new hj0(jj0Var, i);
                e();
                return hj0Var;
            case 1:
                b();
                int i2 = this.c;
                jj0 jj0Var2 = (jj0) this.f;
                if (i2 >= jj0Var2.h) {
                    throw new NoSuchElementException();
                }
                this.c = i2 + 1;
                this.d = i2;
                Object obj = jj0Var2.c[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.c;
                jj0 jj0Var3 = (jj0) this.f;
                if (i3 >= jj0Var3.h) {
                    throw new NoSuchElementException();
                }
                this.c = i3 + 1;
                this.d = i3;
                Object[] objArr = jj0Var3.d;
                objArr.getClass();
                Object obj2 = objArr[this.d];
                e();
                return obj2;
        }
    }
}
