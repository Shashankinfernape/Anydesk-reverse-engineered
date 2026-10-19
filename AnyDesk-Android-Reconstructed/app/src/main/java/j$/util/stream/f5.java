package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f5 extends a implements Stream {
    @Override // j$.util.stream.a
    public final f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        return w3.B(aVar, e1Var, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final boolean D(j$.util.e1 e1Var, n5 n5Var) {
        boolean zE;
        do {
            zE = n5Var.e();
            if (zE) {
                break;
            }
        } while (e1Var.tryAdvance(n5Var));
        return zE;
    }

    @Override // j$.util.stream.a
    public final c7 E() {
        return c7.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final x1 F(long j, IntFunction intFunction) {
        return w3.z(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 M(a aVar, Supplier supplier, boolean z) {
        return new f8(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) z(w3.Y(s1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) z(w3.Y(s1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objZ;
        if (this.a.k && collector.characteristics().contains(h.CONCURRENT) && (!b7.ORDERED.d(this.f) || collector.characteristics().contains(h.UNORDERED))) {
            objZ = collector.supplier().get();
            forEach(new j$.util.concurrent.t(8, collector.accumulator(), objZ));
            collector2 = collector;
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            objZ = z(new i4(c7.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(h.IDENTITY_FINISH) ? objZ : collector2.finisher().apply(objZ);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) z(new d4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new n(this, b7.m | b7.t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = e9.a;
        Objects.requireNonNull(predicate);
        return new m8(this, e9.b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new q(this, b7.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) z(j0.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) z(j0.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        Objects.requireNonNull(function);
        return new b5(this, b7.p | b7.n | b7.t, function, 1);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new q0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new q0(consumer, true));
    }

    @Override // j$.util.stream.g
    public final Iterator iterator() {
        j$.util.e1 e1VarSpliterator = spliterator();
        Objects.requireNonNull(e1VarSpliterator);
        return new j$.util.f1(e1VarSpliterator);
    }

    @Override // j$.util.stream.Stream
    public final LongStream k(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new f1(this, b7.p | b7.n | b7.t, pVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return w3.Z(this, 0L, j);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new b5(this, b7.p | b7.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final d0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new w(this, b7.p | b7.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new v0(this, b7.p | b7.n, toIntFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new f1(this, b7.p | b7.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final d0 n(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new w(this, b7.p | b7.n | b7.t, pVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) z(w3.Y(s1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final IntStream p(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new v0(this, b7.p | b7.n | b7.t, pVar, 5);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return z(new b4(c7.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.Z(this, j, -1L);
        }
        i2.b(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new i6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = e9.a;
        Objects.requireNonNull(predicate);
        return new m8(this, e9.a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return w3.J(A(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new i6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new g2(8));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return z(new b4(c7.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) z(new z3(c7.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return z(new b4(c7.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }
}
