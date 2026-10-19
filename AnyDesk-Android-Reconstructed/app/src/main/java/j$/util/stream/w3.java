package j$.util.stream;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w3 implements j8 {
    public static final z2 a = new z2();
    public static final x2 b = new x2();
    public static final y2 c = new y2();
    public static final w2 d = new w2();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static long A(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        long jC = aVar.C(e1Var);
        if (jC < 0 || !e1Var.hasCharacteristics(16384)) {
            m0 m0Var = new m0();
            m0Var.a = intFunction;
            f2 f2Var = (f2) new m2(aVar, e1Var, m0Var, new g2(7), 3).invoke();
            return z ? J(f2Var, intFunction) : f2Var;
        }
        if (jC >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jC);
        new r3(e1Var, aVar, objArr).invoke();
        return new k2(objArr);
    }

    public static z1 C(a aVar, j$.util.e1 e1Var, boolean z) {
        long jC = aVar.C(e1Var);
        if (jC < 0 || !e1Var.hasCharacteristics(16384)) {
            z1 z1Var = (z1) new m2(aVar, e1Var, new g2(1), new g2(2), 0).invoke();
            return z ? K(z1Var) : z1Var;
        }
        if (jC >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jC];
        new o3(e1Var, aVar, dArr).invoke();
        return new t2(dArr);
    }

    public static b2 D(a aVar, j$.util.e1 e1Var, boolean z) {
        long jC = aVar.C(e1Var);
        if (jC < 0 || !e1Var.hasCharacteristics(16384)) {
            b2 b2Var = (b2) new m2(aVar, e1Var, new g2(3), new g2(4), 1).invoke();
            return z ? L(b2Var) : b2Var;
        }
        if (jC >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jC];
        new p3(e1Var, aVar, iArr).invoke();
        return new c3(iArr);
    }

    public static d2 E(a aVar, j$.util.e1 e1Var, boolean z) {
        long jC = aVar.C(e1Var);
        if (jC < 0 || !e1Var.hasCharacteristics(16384)) {
            d2 d2Var = (d2) new m2(aVar, e1Var, new g2(5), new g2(6), 2).invoke();
            return z ? M(d2Var) : d2Var;
        }
        if (jC >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jC];
        new q3(e1Var, aVar, jArr).invoke();
        return new l3(jArr);
    }

    public static j2 F(c7 c7Var, f2 f2Var, f2 f2Var2) {
        int i = h2.a[c7Var.ordinal()];
        if (i == 1) {
            return new s2(f2Var, f2Var2);
        }
        if (i == 2) {
            return new p2((b2) f2Var, (b2) f2Var2);
        }
        if (i == 3) {
            return new q2((d2) f2Var, (d2) f2Var2);
        }
        if (i == 4) {
            return new o2((z1) f2Var, (z1) f2Var2);
        }
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static u1 G(long j) {
        return (j < 0 || j >= 2147483639) ? new v2() : new u2(j);
    }

    public static a3 H(c7 c7Var) {
        int i = h2.a[c7Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static int I(long j) {
        return (j != -1 ? b7.u : 0) | b7.t;
    }

    public static f2 J(f2 f2Var, IntFunction intFunction) {
        if (f2Var.p() <= 0) {
            return f2Var;
        }
        long jCount = f2Var.count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new v3(f2Var, objArr, 1).invoke();
        return new k2(objArr);
    }

    public static z1 K(z1 z1Var) {
        if (z1Var.p() <= 0) {
            return z1Var;
        }
        long jCount = z1Var.count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jCount];
        new u3(z1Var, dArr, 0).invoke();
        return new t2(dArr);
    }

    public static b2 L(b2 b2Var) {
        if (b2Var.p() <= 0) {
            return b2Var;
        }
        long jCount = b2Var.count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jCount];
        new u3(b2Var, iArr, 0).invoke();
        return new c3(iArr);
    }

    public static d2 M(d2 d2Var) {
        if (d2Var.p() <= 0) {
            return d2Var;
        }
        long jCount = d2Var.count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jCount];
        new u3(d2Var, jArr, 0).invoke();
        return new l3(jArr);
    }

    public static Set N(Set set) {
        h hVar;
        java.util.stream.Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    h hVar2 = (h) it.next();
                    if (hVar2 == null) {
                        characteristics = null;
                    } else if (hVar2 == h.CONCURRENT) {
                        characteristics = java.util.stream.Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = hVar2 == h.UNORDERED ? java.util.stream.Collector.Characteristics.UNORDERED : java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e2) {
                    j$.util.h.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.util.stream.Collector.Characteristics)) {
                j$.util.h.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    java.util.stream.Collector.Characteristics characteristics2 = (java.util.stream.Collector.Characteristics) it2.next();
                    if (characteristics2 == null) {
                        hVar = null;
                    } else if (characteristics2 == java.util.stream.Collector.Characteristics.CONCURRENT) {
                        hVar = h.CONCURRENT;
                    } else {
                        hVar = characteristics2 == java.util.stream.Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH;
                    }
                    hashSet.add(hVar);
                } catch (ClassCastException e3) {
                    j$.util.h.a("java.util.stream.Collector.Characteristics", e3);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static j$.util.p O(Function function) {
        j$.util.p pVar = new j$.util.p(7);
        pVar.b = function;
        return pVar;
    }

    public static v1 P(long j) {
        return (j < 0 || j >= 2147483639) ? new e3() : new d3(j);
    }

    public static y0 Q(j$.util.v0 v0Var) {
        return new y0(v0Var, b7.c(v0Var), false);
    }

    public static w1 R(long j) {
        return (j < 0 || j >= 2147483639) ? new n3() : new m3(j);
    }

    public static j$.util.concurrent.t S(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(c7.DOUBLE_VALUE, s1Var, new m1(s1Var, 1));
    }

    public static v5 T(a0 a0Var, long j, long j2) {
        if (j >= 0) {
            return new v5(a0Var, I(j2), j, j2);
        }
        i2.a(j);
        return null;
    }

    public static j$.util.concurrent.t U(s1 s1Var, IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(c7.INT_VALUE, s1Var, new j$.util.concurrent.t(5, s1Var, intPredicate));
    }

    public static r5 V(b1 b1Var, long j, long j2) {
        if (j >= 0) {
            return new r5(b1Var, I(j2), j, j2);
        }
        i2.a(j);
        return null;
    }

    public static j$.util.concurrent.t W(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(c7.LONG_VALUE, s1Var, new m1(s1Var, 0));
    }

    public static t5 X(j1 j1Var, long j, long j2) {
        if (j >= 0) {
            return new t5(j1Var, I(j2), j, j2);
        }
        i2.a(j);
        return null;
    }

    public static j$.util.concurrent.t Y(s1 s1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(c7.REFERENCE, s1Var, new j$.util.concurrent.t(6, s1Var, predicate));
    }

    public static p5 Z(f5 f5Var, long j, long j2) {
        if (j >= 0) {
            return new p5(f5Var, I(j2), j, j2);
        }
        i2.a(j);
        return null;
    }

    public static c5 b0(j$.util.e1 e1Var, boolean z) {
        Objects.requireNonNull(e1Var);
        return new c5(e1Var, b7.c(e1Var), z);
    }

    public static void c() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void d(k5 k5Var, Double d2) {
        if (l8.a) {
            l8.a(k5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        k5Var.accept(d2.doubleValue());
    }

    public static void g(l5 l5Var, Integer num) {
        if (l8.a) {
            l8.a(l5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        l5Var.accept(num.intValue());
    }

    public static void i(m5 m5Var, Long l) {
        if (l8.a) {
            l8.a(m5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        m5Var.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(e2 e2Var, IntFunction intFunction) {
        if (l8.a) {
            l8.a(e2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e2Var.count() >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e2Var.count());
        e2Var.k(objArr, 0);
        return objArr;
    }

    public static void n(z1 z1Var, Double[] dArr, int i) {
        if (l8.a) {
            l8.a(z1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) z1Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(b2 b2Var, Integer[] numArr, int i) {
        if (l8.a) {
            l8.a(b2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) b2Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(d2 d2Var, Long[] lArr, int i) {
        if (l8.a) {
            l8.a(d2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(z1 z1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            z1Var.g((DoubleConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(z1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.s0) z1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(b2 b2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b2Var.g((IntConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(b2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.v0) b2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(d2 d2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d2Var.g((LongConsumer) consumer);
        } else {
            if (l8.a) {
                l8.a(d2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.y0) d2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static z1 t(z1 z1Var, long j, long j2) {
        if (j == 0 && j2 == z1Var.count()) {
            return z1Var;
        }
        long j3 = j2 - j;
        j$.util.s0 s0Var = (j$.util.s0) z1Var.spliterator();
        u1 u1VarG = G(j3);
        u1VarG.c(j3);
        int i = 0;
        for (int i2 = 0; i2 < j && s0Var.tryAdvance((DoubleConsumer) new y1(i)); i2++) {
        }
        if (j2 == z1Var.count()) {
            s0Var.forEachRemaining((DoubleConsumer) u1VarG);
        } else {
            while (i < j3 && s0Var.tryAdvance((DoubleConsumer) u1VarG)) {
                i++;
            }
        }
        u1VarG.m();
        return u1VarG.build();
    }

    public static b2 u(b2 b2Var, long j, long j2) {
        if (j == 0 && j2 == b2Var.count()) {
            return b2Var;
        }
        long j3 = j2 - j;
        j$.util.v0 v0Var = (j$.util.v0) b2Var.spliterator();
        v1 v1VarP = P(j3);
        v1VarP.c(j3);
        int i = 0;
        for (int i2 = 0; i2 < j && v0Var.tryAdvance((IntConsumer) new a2(i)); i2++) {
        }
        if (j2 == b2Var.count()) {
            v0Var.forEachRemaining((IntConsumer) v1VarP);
        } else {
            while (i < j3 && v0Var.tryAdvance((IntConsumer) v1VarP)) {
                i++;
            }
        }
        v1VarP.m();
        return v1VarP.build();
    }

    public static d2 v(d2 d2Var, long j, long j2) {
        if (j == 0 && j2 == d2Var.count()) {
            return d2Var;
        }
        long j3 = j2 - j;
        j$.util.y0 y0Var = (j$.util.y0) d2Var.spliterator();
        w1 w1VarR = R(j3);
        w1VarR.c(j3);
        int i = 0;
        for (int i2 = 0; i2 < j && y0Var.tryAdvance((LongConsumer) new c2(i)); i2++) {
        }
        if (j2 == d2Var.count()) {
            y0Var.forEachRemaining((LongConsumer) w1VarR);
        } else {
            while (i < j3 && y0Var.tryAdvance((LongConsumer) w1VarR)) {
                i++;
            }
        }
        w1VarR.m();
        return w1VarR.build();
    }

    public static f2 w(f2 f2Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == f2Var.count()) {
            return f2Var;
        }
        j$.util.e1 e1VarSpliterator = f2Var.spliterator();
        long j3 = j2 - j;
        x1 x1VarZ = z(j3, intFunction);
        x1VarZ.c(j3);
        for (int i = 0; i < j && e1VarSpliterator.tryAdvance(new g0(29)); i++) {
        }
        if (j2 == f2Var.count()) {
            e1VarSpliterator.forEachRemaining(x1VarZ);
        } else {
            for (int i2 = 0; i2 < j3 && e1VarSpliterator.tryAdvance(x1VarZ); i2++) {
            }
        }
        x1VarZ.m();
        return x1VarZ.build();
    }

    public static long x(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static j$.util.e1 y(c7 c7Var, j$.util.e1 e1Var, long j, long j2) {
        long jA = A(j, j2);
        int i = w5.a[c7Var.ordinal()];
        if (i == 1) {
            return new v7(e1Var, j, jA);
        }
        if (i == 2) {
            return new s7((j$.util.v0) e1Var, j, jA);
        }
        if (i == 3) {
            return new t7((j$.util.y0) e1Var, j, jA);
        }
        if (i == 4) {
            return new r7((j$.util.s0) e1Var, j, jA);
        }
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static x1 z(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new t3() : new b3(j, intFunction);
    }

    @Override // j$.util.stream.j8
    public Object a(a aVar, j$.util.e1 e1Var) {
        r4 r4VarA0 = a0();
        aVar.N(e1Var, r4VarA0);
        return r4VarA0.get();
    }

    public abstract r4 a0();

    @Override // j$.util.stream.j8
    public Object b(a aVar, j$.util.e1 e1Var) {
        return ((r4) new y4(this, aVar, e1Var).invoke()).get();
    }

    @Override // j$.util.stream.j8
    public /* synthetic */ int f() {
        return 0;
    }
}
