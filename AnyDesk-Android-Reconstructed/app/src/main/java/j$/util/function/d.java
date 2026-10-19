package j$.util.function;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ d(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
