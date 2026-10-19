package j$.com.android.tools.r8;

import j$.util.Objects;
import j$.util.concurrent.l;
import j$.util.concurrent.t;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.function.h;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static t a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    public static t b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.c(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.d(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.h] */
    public static h e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.h
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }
        };
    }

    public static void f(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static /* synthetic */ boolean g(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static String h(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
