package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h8 implements j$.util.v0 {
    public int a;
    public final int b;
    public int c;

    public h8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + ((long) this.c);
    }

    @Override // j$.util.b1
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        this.a = i3;
        this.c = 0;
        while (i < i3) {
            intConsumer.accept(i);
            i++;
        }
        if (i2 > 0) {
            intConsumer.accept(i);
        }
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        return null;
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
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            intConsumer.accept(i);
            return true;
        }
        if (this.c <= 0) {
            return false;
        }
        this.c = 0;
        intConsumer.accept(i);
        return true;
    }

    @Override // j$.util.e1
    public final j$.util.v0 trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new h8(i, i2, 0);
    }

    @Override // j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
