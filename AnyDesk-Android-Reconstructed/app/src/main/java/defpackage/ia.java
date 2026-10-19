package defpackage;

import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements IntPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        int i = this.a;
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        int i = this.a;
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return i == -1029262406;
            default:
                return i == -1029262406;
        }
    }
}
