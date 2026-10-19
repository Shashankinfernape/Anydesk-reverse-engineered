package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements n0, LongConsumer, y {
    public boolean a = false;
    public long b;
    public final /* synthetic */ y0 c;

    public h1(y0 y0Var) {
        this.c = y0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.n0, java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.a) {
            u1.a(h1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new k0(consumer, 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!u1.a) {
            return Long.valueOf(nextLong());
        }
        u1.a(h1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.n0
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.o0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }
}
