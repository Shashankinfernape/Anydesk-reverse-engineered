package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class q6 extends w6 implements DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        v();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.c.a((p6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.s0 s0VarSpliterator = spliterator();
        Objects.requireNonNull(s0VarSpliterator);
        return new j$.util.i1(s0VarSpliterator);
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.w6
    public final void q(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.w6
    public final int r(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.w6
    public final Object[] u() {
        return new double[8][];
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j$.util.s0 spliterator() {
        return new p6(this, 0, this.c, 0, this.b);
    }
}
