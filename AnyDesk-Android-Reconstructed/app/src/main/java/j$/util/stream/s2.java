package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends j2 {
    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.f2
    public final f2 j(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.j(j - jCount, j2 - jCount, intFunction);
        }
        f2 f2Var = this.a;
        if (j2 <= jCount) {
            return f2Var.j(j, j2, intFunction);
        }
        return w3.F(c7.REFERENCE, f2Var.j(j, jCount, intFunction), this.b.j(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.f2
    public final void k(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        f2 f2Var = this.a;
        f2Var.k(objArr, i);
        this.b.k(objArr, i + ((int) f2Var.count()));
    }

    @Override // j$.util.stream.f2
    public final Object[] n(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        return new j3(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
