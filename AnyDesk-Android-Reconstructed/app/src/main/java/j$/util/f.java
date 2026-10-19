package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Comparator comparator, Object obj, int i) {
        this.a = i;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparator comparator = this.b;
                Comparator comparator2 = (Comparator) this.c;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.b;
                Function function = (Function) this.c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
