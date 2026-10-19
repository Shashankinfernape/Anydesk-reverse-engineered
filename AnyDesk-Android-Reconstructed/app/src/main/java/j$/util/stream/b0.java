package j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements d0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ b0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ d0 g(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof c0 ? ((c0) doubleStream).a : new b0(doubleStream);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 average() {
        return j$.util.c.m(this.a.average());
    }

    @Override // j$.util.stream.d0
    public final d0 b(j$.util.p pVar) {
        DoubleStream doubleStream = this.a;
        j$.util.p pVar2 = new j$.util.p(6);
        pVar2.b = pVar;
        return g(doubleStream.flatMap(pVar2));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream boxed() {
        return y6.g(this.a.boxed());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 c() {
        return g(this.a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 d() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 distinct() {
        return g(this.a.distinct());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 e() {
        return g(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof b0) {
            obj = ((b0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 findAny() {
        return j$.util.c.m(this.a.findAny());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 findFirst() {
        return j$.util.c.m(this.a.findFirst());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.f0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.e0 ? ((j$.util.e0) it).a : new j$.util.d0(it);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean j() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return y6.g(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 max() {
        return j$.util.c.m(this.a.max());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 min() {
        return j$.util.c.m(this.a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.g(this.a.parallel());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 peek(DoubleConsumer doubleConsumer) {
        return g(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean q() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ LongStream r() {
        return k1.g(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.c.m(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.g(this.a.sequential());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 sorted() {
        return g(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.s0 spliterator() {
        return j$.util.q0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.d0
    public final j$.util.w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.g(this.a.unordered());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean v() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ j$.util.e1 spliterator() {
        return j$.util.c1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }
}
