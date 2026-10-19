package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class u6 extends w6 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        v();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.c.c((t6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.y0 y0VarSpliterator = spliterator();
        Objects.requireNonNull(y0VarSpliterator);
        return new j$.util.h1(y0VarSpliterator);
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.w6
    public final void q(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.w6
    public final int r(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.w6
    public final Object[] u() {
        return new long[8][];
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j$.util.y0 spliterator() {
        return new t6(this, 0, this.c, 0, this.b);
    }
}
