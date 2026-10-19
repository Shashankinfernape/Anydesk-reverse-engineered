package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends x6 implements f2, x1 {
    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        clear();
        q(j);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void k(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.f2
    public final Object[] n(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void m() {
    }
}
