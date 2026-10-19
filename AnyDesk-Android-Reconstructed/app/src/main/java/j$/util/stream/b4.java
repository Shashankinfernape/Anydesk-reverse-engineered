package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends w3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ b4(c7 c7Var, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.k;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new y3((Supplier) obj3, (ObjLongConsumer) obj2, (p) obj);
            case 1:
                return new e4((Supplier) obj3, (ObjDoubleConsumer) obj2, (p) obj);
            case 2:
                return new g4(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new k4((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new o4((Supplier) obj3, (ObjIntConsumer) obj2, (p) obj);
        }
    }
}
