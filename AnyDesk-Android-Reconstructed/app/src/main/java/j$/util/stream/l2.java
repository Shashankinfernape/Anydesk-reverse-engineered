package j$.util.stream;

import j$.util.Collection$EL;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 implements f2 {
    public final Collection a;

    public l2(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        Collection$EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void k(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.f2
    public final Object[] n(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        return Collection$EL.stream(this.a).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
    }
}
