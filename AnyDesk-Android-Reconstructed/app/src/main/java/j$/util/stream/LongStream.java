package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public interface LongStream extends g {
    LongStream a();

    d0 asDoubleStream();

    j$.util.a0 average();

    LongStream b(j$.util.p pVar);

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d();

    LongStream distinct();

    LongStream e();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    d0 h();

    @Override // j$.util.stream.g
    j$.util.n0 iterator();

    boolean l();

    LongStream limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    boolean o();

    @Override // j$.util.stream.g
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.b0 reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.g
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.g
    j$.util.y0 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    long[] toArray();

    IntStream u();
}
