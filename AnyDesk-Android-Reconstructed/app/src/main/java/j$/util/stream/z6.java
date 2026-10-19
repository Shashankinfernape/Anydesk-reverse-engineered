package j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
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
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z6 implements java.util.stream.Stream {
    public final /* synthetic */ Stream a;

    public /* synthetic */ z6(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ java.util.stream.Stream g(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof y6 ? ((y6) stream).a : new z6(stream);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(java.util.stream.Collector collector) {
        Collector iVar;
        Stream stream = this.a;
        if (collector == null) {
            iVar = null;
        } else {
            iVar = collector instanceof j ? ((j) collector).a : new i(collector);
        }
        return stream.collect(iVar);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream distinct() {
        return g(this.a.distinct());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream dropWhile(Predicate predicate) {
        return g(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.a;
        if (obj instanceof z6) {
            obj = ((z6) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
        return g(this.a.filter(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.util.c.p(this.a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.util.c.p(this.a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
        return g(this.a.flatMap(w3.O(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return c0.g(this.a.n(w3.O(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream flatMapToInt(Function function) {
        return IntStream.Wrapper.convert(this.a.p(w3.O(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream flatMapToLong(Function function) {
        return l1.g(this.a.k(w3.O(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream map(Function function) {
        return g(this.a.map(function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return c0.g(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.Wrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(ToLongFunction toLongFunction) {
        return l1.g(this.a.mapToLong(toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.util.c.p(this.a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.util.c.p(this.a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f.g(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f.g(this.a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
        return g(this.a.peek(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.util.c.p(this.a.reduce(binaryOperator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f.g(this.a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted() {
        return g(this.a.sorted());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream takeWhile(Predicate predicate) {
        return g(this.a.takeWhile(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f.g(this.a.unordered());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
        return g(this.a.sorted(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }
}
