package j$.util.stream;

import j$.util.Optional;
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
public final /* synthetic */ class y6 implements Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    public /* synthetic */ y6(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream g(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof z6 ? ((z6) stream).a : new y6(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        java.util.stream.Collector jVar;
        java.util.stream.Stream stream = this.a;
        if (collector == null) {
            jVar = null;
        } else {
            jVar = collector instanceof i ? ((i) collector).a : new j(collector);
        }
        return stream.collect(jVar);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return g(this.a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return g(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.a;
        if (obj instanceof y6) {
            obj = ((y6) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return g(this.a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.util.c.l(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.util.c.l(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream flatMap(Function function) {
        return g(this.a.flatMap(w3.O(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream k(j$.util.p pVar) {
        return k1.g(this.a.flatMapToLong(w3.O(pVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return g(this.a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ d0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return b0.g(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return k1.g(this.a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.util.c.l(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.util.c.l(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ d0 n(j$.util.p pVar) {
        return b0.g(this.a.flatMapToDouble(w3.O(pVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream p(j$.util.p pVar) {
        return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(w3.O(pVar)));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.g(this.a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return g(this.a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.util.c.l(this.a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.g(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return g(this.a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ j$.util.e1 spliterator() {
        return j$.util.c1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return g(this.a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.g(this.a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return g(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }
}
