package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements BaseStream {
    public final /* synthetic */ g a;

    public /* synthetic */ f(g gVar) {
        this.a = gVar;
    }

    public static /* synthetic */ BaseStream g(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar instanceof e) {
            return ((e) gVar).a;
        }
        if (gVar instanceof d0) {
            return c0.g((d0) gVar);
        }
        if (gVar instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) gVar);
        }
        if (gVar instanceof LongStream) {
            return l1.g((LongStream) gVar);
        }
        return gVar instanceof Stream ? z6.g((Stream) gVar) : new f(gVar);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        g gVar = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return g(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return g(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return g(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return g(this.a.unordered());
    }
}
