package j$.util;

import j$.util.stream.c5;
import j$.util.stream.w3;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static void a(s0 s0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            s0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(s0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            s0Var.forEachRemaining((DoubleConsumer) new c0(consumer, 0));
        }
    }

    public static void b(v0 v0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            v0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(v0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v0Var.forEachRemaining((IntConsumer) new g0(consumer, 0));
        }
    }

    public static void c(y0 y0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            y0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(y0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y0Var.forEachRemaining((LongConsumer) new k0(consumer, 0));
        }
    }

    public static long d(e1 e1Var) {
        if ((e1Var.characteristics() & 64) == 0) {
            return -1L;
        }
        return e1Var.estimateSize();
    }

    public static boolean e(e1 e1Var, int i) {
        return (e1Var.characteristics() & i) == i;
    }

    public static c5 f(Collection collection) {
        return w3.b0(Collection$EL.c(collection), true);
    }

    public static c5 g(Collection collection) {
        return w3.b0(Collection$EL.c(collection), false);
    }

    public static Object[] h(Collection collection, IntFunction intFunction) {
        return collection.toArray((Object[]) intFunction.apply(0));
    }

    public static boolean i(s0 s0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return s0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (u1.a) {
            u1.a(s0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return s0Var.tryAdvance((DoubleConsumer) new c0(consumer, 0));
    }

    public static boolean j(v0 v0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return v0Var.tryAdvance((IntConsumer) consumer);
        }
        if (u1.a) {
            u1.a(v0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v0Var.tryAdvance((IntConsumer) new g0(consumer, 0));
    }

    public static boolean k(y0 y0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return y0Var.tryAdvance((LongConsumer) consumer);
        }
        if (u1.a) {
            u1.a(y0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y0Var.tryAdvance((LongConsumer) new k0(consumer, 0));
    }

    public static Optional l(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static a0 m(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new a0(optionalDouble.getAsDouble()) : a0.c;
    }

    public static OptionalInt n(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? OptionalInt.of(optionalInt.getAsInt()) : OptionalInt.empty();
    }

    public static b0 o(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? new b0(optionalLong.getAsLong()) : b0.c;
    }

    public static java.util.Optional p(Optional optional) {
        if (optional == null) {
            return null;
        }
        Object obj = optional.a;
        if (obj == null) {
            return java.util.Optional.empty();
        }
        if (obj != null) {
            return java.util.Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalDouble q(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        boolean z = a0Var.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(a0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static java.util.OptionalInt r(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? java.util.OptionalInt.of(optionalInt.getAsInt()) : java.util.OptionalInt.empty();
    }

    public static OptionalLong s(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z = b0Var.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(b0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static /* synthetic */ void t(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            j$.com.android.tools.r8.a.f((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static void u(Iterator it, Consumer consumer) {
        if (it instanceof y) {
            ((y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Object v(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static /* synthetic */ Object w(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public e1 trySplit() {
        return null;
    }
}
