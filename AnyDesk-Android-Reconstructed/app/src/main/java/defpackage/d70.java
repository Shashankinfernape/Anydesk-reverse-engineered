package defpackage;

import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d70 implements Predicate {
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = GlowActivity.i;
        return ((e70) obj).getVisibility() == 8;
    }
}
