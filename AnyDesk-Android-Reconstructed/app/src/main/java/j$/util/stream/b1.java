package j$.util.stream;

import j$.util.Objects;
import j$.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b1 extends a implements IntStream {
    public static j$.util.v0 Q(j$.util.e1 e1Var) {
        if (e1Var instanceof j$.util.v0) {
            return (j$.util.v0) e1Var;
        }
        if (!l8.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        l8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        return w3.D(aVar, e1Var, z);
    }

    @Override // j$.util.stream.a
    public final boolean D(j$.util.e1 e1Var, n5 n5Var) {
        IntConsumer g0Var;
        boolean zE;
        j$.util.v0 v0VarQ = Q(e1Var);
        if (n5Var instanceof IntConsumer) {
            g0Var = (IntConsumer) n5Var;
        } else {
            if (l8.a) {
                l8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            g0Var = new j$.util.g0(n5Var, 1);
        }
        do {
            zE = n5Var.e();
            if (zE) {
                break;
            }
        } while (v0VarQ.tryAdvance(g0Var));
        return zE;
    }

    @Override // j$.util.stream.a
    public final c7 E() {
        return c7.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final x1 F(long j, IntFunction intFunction) {
        return w3.P(j);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 M(a aVar, Supplier supplier, boolean z) {
        return new o7(aVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) z(w3.U(s1.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) z(w3.U(s1.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final d0 asDoubleStream() {
        return new s(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new u(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 average() {
        long[] jArr = (long[]) collect(new g0(13), new g0(14), new g0(15));
        long j = jArr[0];
        return j > 0 ? new j$.util.a0(jArr[1] / j) : j$.util.a0.c;
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new q(this, 0, new g0(17), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(pVar);
        return z(new b4(c7.INT_VALUE, pVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) z(new d4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((f5) boxed()).distinct().mapToInt(new g0(16));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i = e9.a;
        Objects.requireNonNull(intPredicate);
        return new p8(this, e9.b, intPredicate, 1);
    }

    @Override // j$.util.stream.IntStream
    public final d0 f() {
        Objects.requireNonNull(null);
        return new s(this, b7.p | b7.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        return new v0(this, b7.t, intPredicate, 3);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) z(h0.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) z(h0.c);
    }

    @Override // j$.util.stream.IntStream
    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new o0(intConsumer, false));
    }

    @Override // j$.util.stream.IntStream
    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new o0(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream i() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, 2);
    }

    @Override // j$.util.stream.g
    public final j$.util.j0 iterator() {
        j$.util.v0 v0VarSpliterator = spliterator();
        Objects.requireNonNull(v0VarSpliterator);
        return new j$.util.g1(v0VarSpliterator);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return w3.V(this, 0L, j);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream m(m0 m0Var) {
        Objects.requireNonNull(m0Var);
        return new v0(this, b7.p | b7.n | b7.t, m0Var, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new v0(this, b7.p | b7.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new q(this, b7.p | b7.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new g0(12));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new g0(8));
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) z(w3.U(s1.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new v0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) z(new m4(c7.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.V(this, j, -1L);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new g6(this, b7.q | b7.o);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.v0 spliterator() {
        return Q(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new g0(11));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.util.function.c(5), new g0(9), new g0(10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i = e9.a;
        Objects.requireNonNull(intPredicate);
        return new p8(this, e9.a, intPredicate, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) w3.L((b2) A(new g0(7))).b();
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (OptionalInt) z(new z3(c7.INT_VALUE, intBinaryOperator, 3));
    }
}
