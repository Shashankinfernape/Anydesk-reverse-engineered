package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class l3 implements d2 {
    public final long[] a;
    public int b;

    public l3(long j) {
        if (j >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.e2
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.s(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.v(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final j$.util.b1 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        j$.util.s1.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.r1(jArr, 0, i, 1040);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        j$.util.s1.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.r1(jArr, 0, i, 1040);
    }

    public l3(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
