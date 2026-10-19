package j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ i(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.test(obj) && this.c.test(obj);
            default:
                return this.b.test(obj) || this.c.test(obj);
        }
    }
}
