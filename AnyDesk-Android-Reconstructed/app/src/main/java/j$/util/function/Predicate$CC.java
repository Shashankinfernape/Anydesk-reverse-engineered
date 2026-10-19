package j$.util.function;

import j$.util.Objects;
import j$.util.p;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new i(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new p(2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new i(predicate, predicate2, 1);
    }
}
