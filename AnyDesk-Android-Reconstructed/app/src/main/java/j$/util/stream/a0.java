package j$.util.stream;

import j$.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends a implements d0 {
    public static j$.util.s0 Q(j$.util.e1 e1Var) {
        if (e1Var instanceof j$.util.s0) {
            return (j$.util.s0) e1Var;
        }
        if (!l8.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        l8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        return w3.C(aVar, e1Var, z);
    }

    @Override // j$.util.stream.a
    public final boolean D(j$.util.e1 e1Var, n5 n5Var) {
        DoubleConsumer c0Var;
        boolean zE;
        j$.util.s0 s0VarQ = Q(e1Var);
        if (n5Var instanceof DoubleConsumer) {
            c0Var = (DoubleConsumer) n5Var;
        } else {
            if (l8.a) {
                l8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            c0Var = new j$.util.c0(n5Var, 1);
        }
        do {
            zE = n5Var.e();
            if (zE) {
                break;
            }
        } while (s0VarQ.tryAdvance(c0Var));
        return zE;
    }

    @Override // j$.util.stream.a
    public final c7 E() {
        return c7.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final x1 F(long j, IntFunction intFunction) {
        return w3.G(j);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 M(a aVar, Supplier supplier, boolean z) {
        return new m7(aVar, supplier, z);
    }

    @Override // j$.util.stream.d0
    public final d0 a() {
        int i = e9.a;
        Objects.requireNonNull(null);
        return new f6(this, e9.a, 1);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 average() {
        double[] dArr = (double[]) collect(new j$.util.function.c(24), new j$.util.function.c(25), new j$.util.function.c(26));
        if (dArr[2] <= 0.0d) {
            return j$.util.a0.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.a0(d / dArr[2]);
    }

    @Override // j$.util.stream.d0
    public final d0 b(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new w(this, b7.p | b7.n | b7.t, pVar, 0);
    }

    @Override // j$.util.stream.d0
    public final Stream boxed() {
        return new q(this, 0, new j$.util.function.c(16), 0);
    }

    @Override // j$.util.stream.d0
    public final d0 c() {
        Objects.requireNonNull(null);
        return new s(this, b7.t, 2);
    }

    @Override // j$.util.stream.d0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(pVar);
        return z(new b4(c7.DOUBLE_VALUE, pVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.d0
    public final long count() {
        return ((Long) z(new d4(1))).longValue();
    }

    @Override // j$.util.stream.d0
    public final d0 d() {
        int i = e9.a;
        Objects.requireNonNull(null);
        return new f6(this, e9.b, 2);
    }

    @Override // j$.util.stream.d0
    public final d0 distinct() {
        return ((f5) boxed()).distinct().mapToDouble(new j$.util.function.c(17));
    }

    @Override // j$.util.stream.d0
    public final d0 e() {
        Objects.requireNonNull(null);
        return new s(this, b7.p | b7.n, 0);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 findAny() {
        return (j$.util.a0) z(f0.d);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) z(f0.c);
    }

    @Override // j$.util.stream.d0
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new n0(doubleConsumer, false));
    }

    @Override // j$.util.stream.d0
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new n0(doubleConsumer, true));
    }

    @Override // j$.util.stream.g
    public final j$.util.f0 iterator() {
        j$.util.s0 s0VarSpliterator = spliterator();
        Objects.requireNonNull(s0VarSpliterator);
        return new j$.util.i1(s0VarSpliterator);
    }

    @Override // j$.util.stream.d0
    public final boolean j() {
        return ((Boolean) z(w3.S(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final d0 limit(long j) {
        if (j >= 0) {
            return w3.T(this, 0L, j);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.d0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new q(this, b7.p | b7.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 max() {
        return reduce(new j$.util.function.c(19));
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 min() {
        return reduce(new j$.util.function.c(23));
    }

    @Override // j$.util.stream.d0
    public final d0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new w(this, doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final boolean q() {
        return ((Boolean) z(w3.S(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final LongStream r() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, 0);
    }

    @Override // j$.util.stream.d0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z(new f4(c7.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.d0
    public final d0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.T(this, j, -1L);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.d0
    public final d0 sorted() {
        return new f6(this, b7.q | b7.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.s0 spliterator() {
        return Q(super.spliterator());
    }

    @Override // j$.util.stream.d0
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.util.function.c(20), new j$.util.function.c(21), new j$.util.function.c(22));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.d0
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j$.util.function.c(2), new j$.util.function.c(27), new j$.util.function.c(15));
    }

    @Override // j$.util.stream.d0
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new t(this, b7.p | b7.n, 0);
    }

    @Override // j$.util.stream.d0
    public final double[] toArray() {
        return (double[]) w3.K((z1) A(new j$.util.function.c(18))).b();
    }

    @Override // j$.util.stream.d0
    public final boolean v() {
        return ((Boolean) z(w3.S(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.a0) z(new z3(c7.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
