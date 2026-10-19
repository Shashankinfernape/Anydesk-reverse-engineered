package j$.util.stream;

import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g2 implements IntFunction, LongFunction, BinaryOperator, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ g2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void o(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 2:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            default:
                return new Double[i];
            case 8:
                return new Object[i];
            case 9:
                return new Integer[i];
            case 10:
                return new Long[i];
            case 11:
                return new Double[i];
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return new Integer[i];
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return new Integer[i];
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return new Long[i];
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return new Long[i];
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return new Double[i];
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 12:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 1:
                return w3.G(j);
            case 2:
            default:
                return w3.R(j);
            case 3:
                return w3.P(j);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new o2((z1) obj, (z1) obj2);
            case 3:
            case 5:
            default:
                return new s2((f2) obj, (f2) obj2);
            case 4:
                return new p2((b2) obj, (b2) obj2);
            case 6:
                return new q2((d2) obj, (d2) obj2);
        }
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(Object obj) {
    }
}
