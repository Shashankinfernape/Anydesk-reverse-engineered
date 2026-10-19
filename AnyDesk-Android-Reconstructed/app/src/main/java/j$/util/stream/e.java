package j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements g {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ e(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ g g(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof f) {
            return ((f) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return b0.g((DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.LongStream) {
            return k1.g((java.util.stream.LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? y6.g((java.util.stream.Stream) baseStream) : new e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ j$.util.e1 spliterator() {
        return j$.util.c1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return g(this.a.unordered());
    }
}
