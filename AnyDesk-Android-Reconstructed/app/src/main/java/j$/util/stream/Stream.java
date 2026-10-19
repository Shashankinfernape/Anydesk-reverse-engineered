package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.Comparator;
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
public interface Stream<T> extends g {
    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    long count();

    Stream<T> distinct();

    Stream dropWhile(Predicate predicate);

    Stream filter(Predicate predicate);

    Optional findAny();

    Optional findFirst();

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    LongStream k(j$.util.p pVar);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    d0 mapToDouble(ToDoubleFunction toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    d0 n(j$.util.p pVar);

    boolean noneMatch(Predicate predicate);

    IntStream p(j$.util.p pVar);

    Stream peek(Consumer consumer);

    Optional reduce(BinaryOperator binaryOperator);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    Stream skip(long j);

    Stream sorted();

    Stream<T> sorted(Comparator<? super T> comparator);

    Stream takeWhile(Predicate predicate);

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);

    List<T> toList();

    /* JADX INFO: renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
    public final /* synthetic */ class CC {
        public static <T> Stream<T> empty() {
            return w3.b0(j$.util.s1.a, false);
        }

        public static <T> Stream<T> of(T t) {
            i8 i8Var = new i8();
            i8Var.b = t;
            i8Var.a = -2;
            return w3.b0(i8Var, false);
        }

        public static <T> Stream<T> of(T... tArr) {
            return DesugarArrays.stream(tArr);
        }
    }
}
