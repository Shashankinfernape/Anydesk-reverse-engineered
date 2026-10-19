package j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1 implements LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    public /* synthetic */ k1(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream g(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof l1 ? ((l1) longStream).a : new k1(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ d0 asDoubleStream() {
        return b0.g(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.a0 average() {
        return j$.util.c.m(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b(j$.util.p pVar) {
        java.util.stream.LongStream longStream = this.a;
        j$.util.p pVar2 = new j$.util.p(8);
        pVar2.b = pVar;
        return g(longStream.flatMap(pVar2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return y6.g(this.a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream c() {
        return g(this.a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream d() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return g(this.a.distinct());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream e() {
        return g(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof k1) {
            obj = ((k1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.util.c.o(this.a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.util.c.o(this.a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ d0 h() {
        return b0.g(this.a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.g
    public final /* synthetic */ j$.util.n0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.m0 ? ((j$.util.m0) it).a : new j$.util.l0(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean l() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return y6.g(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 max() {
        return j$.util.c.o(this.a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 min() {
        return j$.util.c.o(this.a.min());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean o() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return g(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.c.o(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean s() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.g(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return g(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.g
    public final /* synthetic */ j$.util.y0 spliterator() {
        return j$.util.w0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.g(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.g
    public final /* synthetic */ LongStream parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.g
    public final /* synthetic */ LongStream sequential() {
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
