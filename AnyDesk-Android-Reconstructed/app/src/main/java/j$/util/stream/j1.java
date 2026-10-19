package j$.util.stream;

import j$.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 extends a implements LongStream {
    public static j$.util.y0 Q(j$.util.e1 e1Var) {
        if (e1Var instanceof j$.util.y0) {
            return (j$.util.y0) e1Var;
        }
        if (!l8.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        l8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        return w3.E(aVar, e1Var, z);
    }

    @Override // j$.util.stream.a
    public final boolean D(j$.util.e1 e1Var, n5 n5Var) {
        LongConsumer k0Var;
        boolean zE;
        j$.util.y0 y0VarQ = Q(e1Var);
        if (n5Var instanceof LongConsumer) {
            k0Var = (LongConsumer) n5Var;
        } else {
            if (l8.a) {
                l8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            k0Var = new j$.util.k0(n5Var, 1);
        }
        do {
            zE = n5Var.e();
            if (zE) {
                break;
            }
        } while (y0VarQ.tryAdvance(k0Var));
        return zE;
    }

    @Override // j$.util.stream.a
    public final c7 E() {
        return c7.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final x1 F(long j, IntFunction intFunction) {
        return w3.R(j);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 M(a aVar, Supplier supplier, boolean z) {
        return new q7(aVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = e9.a;
        Objects.requireNonNull(null);
        return new h6(this, e9.a, 1);
    }

    @Override // j$.util.stream.LongStream
    public final d0 asDoubleStream() {
        return new s(this, b7.n, 5);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.a0 average() {
        long[] jArr = (long[]) collect(new g0(22), new g0(23), new g0(24));
        long j = jArr[0];
        return j > 0 ? new j$.util.a0(jArr[1] / j) : j$.util.a0.c;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new f1(this, b7.p | b7.n | b7.t, pVar, 0);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new q(this, 0, new g0(21), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        Objects.requireNonNull(null);
        return new u(this, b7.t, 5);
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(pVar);
        return z(new b4(c7.LONG_VALUE, pVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) z(new d4(0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d() {
        int i = e9.a;
        Objects.requireNonNull(null);
        return new h6(this, e9.b, 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((f5) boxed()).distinct().mapToLong(new g0(28));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 findAny() {
        return (j$.util.b0) z(i0.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) z(i0.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new p0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new p0(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final d0 h() {
        Objects.requireNonNull(null);
        return new s(this, b7.p | b7.n, 6);
    }

    @Override // j$.util.stream.g
    public final j$.util.n0 iterator() {
        j$.util.y0 y0VarSpliterator = spliterator();
        Objects.requireNonNull(y0VarSpliterator);
        return new j$.util.h1(y0VarSpliterator);
    }

    @Override // j$.util.stream.LongStream
    public final boolean l() {
        return ((Boolean) z(w3.W(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return w3.X(this, 0L, j);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new q(this, b7.p | b7.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 max() {
        return reduce(new g0(25));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 min() {
        return reduce(new g0(27));
    }

    @Override // j$.util.stream.LongStream
    public final boolean o() {
        return ((Boolean) z(w3.W(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new f1(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z(new x3(c7.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean s() {
        return ((Boolean) z(w3.W(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.X(this, j, -1L);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new h6(this, b7.q | b7.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.y0 spliterator() {
        return Q(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new g0(26));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j$.util.function.c(6), new g0(18), new g0(19));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) w3.M((d2) A(new g0(20))).b();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new t(this, b7.p | b7.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.b0) z(new z3(c7.LONG_VALUE, longBinaryOperator, 0));
    }
}
