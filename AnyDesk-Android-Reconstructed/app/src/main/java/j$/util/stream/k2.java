package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class k2 implements f2 {
    public final Object[] a;
    public int b;

    public k2(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.o(this.a[i]);
        }
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void k(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.f2
    public final Object[] n(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        return DesugarArrays.a(this.a, 0, this.b);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    public k2(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
