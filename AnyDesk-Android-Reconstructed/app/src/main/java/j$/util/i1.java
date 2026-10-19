package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements f0, DoubleConsumer, y {
    public boolean a = false;
    public double b;
    public final /* synthetic */ s0 c;

    public i1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.f0, java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.a) {
            u1.a(i1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new c0(consumer, 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!u1.a) {
            return Double.valueOf(nextDouble());
        }
        u1.a(i1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.f0
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.o0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }
}
