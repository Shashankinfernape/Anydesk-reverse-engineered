package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class s6 extends w6 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        v();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.c.b((r6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.v0 v0VarSpliterator = spliterator();
        Objects.requireNonNull(v0VarSpliterator);
        return new j$.util.g1(v0VarSpliterator);
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.w6
    public final void q(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.w6
    public final int r(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.w6
    public final Object[] u() {
        return new int[8][];
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j$.util.v0 spliterator() {
        return new r6(this, 0, this.c, 0, this.b);
    }
}
