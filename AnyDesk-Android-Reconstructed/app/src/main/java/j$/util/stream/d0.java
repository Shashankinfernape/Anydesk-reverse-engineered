package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public interface d0 extends g {
    d0 a();

    j$.util.a0 average();

    d0 b(j$.util.p pVar);

    Stream boxed();

    d0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    d0 d();

    d0 distinct();

    d0 e();

    j$.util.a0 findAny();

    j$.util.a0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.g
    j$.util.f0 iterator();

    boolean j();

    d0 limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.a0 max();

    j$.util.a0 min();

    @Override // j$.util.stream.g
    d0 parallel();

    d0 peek(DoubleConsumer doubleConsumer);

    boolean q();

    LongStream r();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.g
    d0 sequential();

    d0 skip(long j);

    d0 sorted();

    @Override // j$.util.stream.g
    j$.util.s0 spliterator();

    double sum();

    j$.util.w summaryStatistics();

    IntStream t();

    double[] toArray();

    boolean v();
}
