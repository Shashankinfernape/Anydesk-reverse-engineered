package j$.util.stream;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends d5 {
    public static l2 Q(a aVar, j$.util.e1 e1Var) {
        j$.util.function.c cVar = new j$.util.function.c(12);
        j$.util.function.c cVar2 = new j$.util.function.c(13);
        j$.util.function.c cVar3 = new j$.util.function.c(14);
        Objects.requireNonNull(cVar);
        Objects.requireNonNull(cVar2);
        Objects.requireNonNull(cVar3);
        return new l2((Collection) new b4(c7.REFERENCE, cVar3, cVar2, cVar, 3).b(aVar, e1Var));
    }

    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        if (b7.DISTINCT.d(aVar.f)) {
            return aVar.y(e1Var, false, intFunction);
        }
        if (b7.ORDERED.d(aVar.f)) {
            return Q(aVar, e1Var);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new q0(tVar, false).g(aVar, e1Var);
        Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new l2(setKeySet);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 H(a aVar, j$.util.e1 e1Var) {
        if (b7.DISTINCT.d(aVar.f)) {
            return aVar.P(e1Var);
        }
        return b7.ORDERED.d(aVar.f) ? Q(aVar, e1Var).spliterator() : new k7(aVar.P(e1Var), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.DISTINCT.d(i)) {
            return n5Var;
        }
        return b7.SORTED.d(i) ? new l(n5Var) : new m(n5Var);
    }
}
