package j$.util;

import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.a7;
import j$.util.stream.f8;
import j$.util.stream.m7;
import j$.util.stream.n5;
import j$.util.stream.o7;
import j$.util.stream.q7;
import j$.util.stream.y6;
import j$.util.stream.z6;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Consumer, IntPredicate, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(a7 a7Var) {
        ((EnumMap) ((java.util.Map) this.b)).put(a7Var, 1);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept(new q((java.util.Map.Entry) obj));
                break;
            case 9:
                ((n5) this.b).accept(obj);
                break;
            default:
                ((ArrayList) ((List) this.b)).add(obj);
                break;
        }
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 9:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return z6.g((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return y6.g((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.d0) {
            return j$.util.stream.c0.g((j$.util.stream.d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.b0.g((DoubleStream) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.l1.g((LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.k1.g((java.util.stream.LongStream) objApply);
        }
        h.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).K(0);
            case 4:
                return (e1) this.b;
            default:
                CharSequence charSequence = (CharSequence) this.b;
                Set set = Collectors.a;
                return new StringJoiner(charSequence, 0);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 12:
                m7 m7Var = (m7) this.b;
                return m7Var.d.tryAdvance(m7Var.e);
            case 13:
                o7 o7Var = (o7) this.b;
                return o7Var.d.tryAdvance(o7Var.e);
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                q7 q7Var = (q7) this.b;
                return q7Var.d.tryAdvance(q7Var.e);
            default:
                f8 f8Var = (f8) this.b;
                return f8Var.d.tryAdvance(f8Var.e);
        }
    }

    public /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate m11negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.d0) {
            return j$.util.stream.c0.g((j$.util.stream.d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.b0.g((DoubleStream) objApply);
        }
        h.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.l1.g((LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.k1.g((java.util.stream.LongStream) objApply);
        }
        h.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }
}
