package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class f8 extends d7 {
    @Override // j$.util.stream.d7
    public final void d() {
        x6 x6Var = new x6();
        this.h = x6Var;
        Objects.requireNonNull(x6Var);
        this.e = this.b.O(new e8(x6Var, 0));
        this.f = new j$.util.p(15, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(j$.util.e1 e1Var) {
        return new f8(this.b, e1Var, this.a);
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        e8 e8Var = new e8(consumer, 1);
        this.b.N(this.d, e8Var);
        this.i = true;
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        x6 x6Var = (x6) this.h;
        long j = this.g;
        if (x6Var.c != 0) {
            if (j >= x6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= x6Var.c; i++) {
                long j2 = x6Var.d[i];
                Object[] objArr = x6Var.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= x6Var.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = x6Var.e[(int) j];
        consumer.o(obj);
        return zA;
    }
}
