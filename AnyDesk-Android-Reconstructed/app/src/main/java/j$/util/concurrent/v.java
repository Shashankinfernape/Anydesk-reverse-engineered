package j$.util.concurrent;

import j$.util.s0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements s0 {
    public long a;
    public final long b;
    public final double c;
    public final double d;

    public v(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // j$.util.s0, j$.util.b1, j$.util.e1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new v(j, j2, this.c, this.d);
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.b1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.i(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }
}
