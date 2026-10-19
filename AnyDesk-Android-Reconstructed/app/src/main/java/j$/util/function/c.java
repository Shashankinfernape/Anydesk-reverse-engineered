package j$.util.function;

import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.Objects;
import j$.util.StringJoiner;
import j$.util.a0;
import j$.util.stream.Collectors;
import j$.util.stream.f0;
import j$.util.w;
import j$.util.x;
import j$.util.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function, IntFunction, Supplier, BiConsumer, BinaryOperator, DoubleFunction, ToDoubleFunction, DoubleBinaryOperator, ObjDoubleConsumer, Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                ((List) obj).add(obj2);
                break;
            case 9:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
            case 13:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                ((w) obj).a((w) obj2);
                break;
            case 22:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            default:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 4:
                break;
            case 9:
                break;
            case 13:
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                break;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                break;
            case 22:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                List list = (List) obj;
                Set set = Collectors.a;
                list.addAll((List) obj2);
                return list;
            default:
                StringJoiner stringJoiner = (StringJoiner) obj;
                StringJoiner stringJoiner2 = (StringJoiner) obj2;
                stringJoiner.getClass();
                Objects.requireNonNull(stringJoiner2);
                if (stringJoiner2.d == null) {
                    return stringJoiner;
                }
                stringJoiner2.a();
                return stringJoiner.add(stringJoiner2.d[0]);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return Math.max(d, d2);
            default:
                return Math.min(d, d2);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 8:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return new w();
            case 3:
                return new ArrayList();
            case 5:
                return new x();
            case 6:
                return new z();
            case 12:
                return new LinkedHashSet();
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return new double[3];
            case 24:
                return new double[4];
            default:
                return new f0();
        }
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return ((a0) obj).a;
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 7:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, function);
    }

    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m10andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 8:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                Set set = Collectors.a;
            case 0:
                return obj;
            default:
                return ((StringJoiner) obj).toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 1:
                return new Object[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 21:
                double[] dArr = (double[]) obj;
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            case 25:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
            default:
                ((w) obj).accept(d);
                break;
        }
    }
}
