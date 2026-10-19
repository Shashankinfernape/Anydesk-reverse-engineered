package j$.util.concurrent;

import j$.util.e1;
import j$.util.function.Consumer$CC;
import j$.util.stream.b7;
import j$.util.stream.c7;
import j$.util.stream.j8;
import j$.util.stream.k7;
import j$.util.stream.n1;
import j$.util.stream.o1;
import j$.util.stream.r1;
import j$.util.stream.s1;
import j$.util.stream.t1;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, j8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // j$.util.stream.j8
    public Object a(j$.util.stream.a aVar, e1 e1Var) {
        r1 r1Var = (r1) ((Supplier) this.c).get();
        aVar.N(e1Var, r1Var);
        return Boolean.valueOf(r1Var.b);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 3:
                ((Consumer) obj3).accept(obj);
                ((Consumer) obj2).accept(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.f(obj, Boolean.TRUE, true);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 8:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
            default:
                Consumer consumer = (Consumer) obj2;
                if (((k7) obj3).b.f(obj != null ? obj : k7.d, Boolean.TRUE, true) == null) {
                    consumer.accept(obj);
                }
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 3:
                break;
            case 4:
                break;
            case 8:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.j8
    public Object b(j$.util.stream.a aVar, e1 e1Var) {
        return (Boolean) new t1(this, aVar, e1Var).invoke();
    }

    @Override // j$.util.stream.j8
    public int f() {
        return b7.u | b7.r;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 5:
                return new o1((s1) this.b, (IntPredicate) this.c);
            default:
                return new n1((s1) this.b, (Predicate) this.c);
        }
    }

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public t(c7 c7Var, s1 s1Var, Supplier supplier) {
        this.a = 7;
        this.b = s1Var;
        this.c = supplier;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }
}
