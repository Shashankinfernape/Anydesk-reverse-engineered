package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class k7 implements j$.util.e1, Consumer {
    public static final Object d = new Object();
    public final j$.util.e1 a;
    public final ConcurrentHashMap b;
    public Object c;

    public k7(j$.util.e1 e1Var, ConcurrentHashMap concurrentHashMap) {
        this.a = e1Var;
        this.b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        this.c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new j$.util.concurrent.t(9, this, consumer));
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        while (this.a.tryAdvance(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.f(obj, Boolean.TRUE, true) == null) {
                consumer.o(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.e1
    public final j$.util.e1 trySplit() {
        j$.util.e1 e1VarTrySplit = this.a.trySplit();
        if (e1VarTrySplit != null) {
            return new k7(e1VarTrySplit, this.b);
        }
        return null;
    }
}
