package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class c3 implements b2 {
    public final int[] a;
    public int b;

    public c3(long j) {
        if (j >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.e2
    public final void f(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.r(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.u(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.o(this, (Integer[]) objArr, i);
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
        int[] iArr = this.a;
        j$.util.s1.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i);
        return new j$.util.p1(iArr, 0, i, 1040);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        int i = this.b;
        int[] iArr = this.a;
        j$.util.s1.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i);
        return new j$.util.p1(iArr, 0, i, 1040);
    }

    public c3(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
