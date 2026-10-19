package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends q6 implements z1, u1 {
    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w6, j$.util.stream.e2
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        clear();
        t(j);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.w6, j$.util.stream.e2
    public final void f(int i, Object obj) {
        super.f(i, (double[]) obj);
    }

    @Override // j$.util.stream.w6, j$.util.stream.e2
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.t(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        w3.d(this, d);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.q6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    public final j$.util.b1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.q6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    public final j$.util.e1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ f2 a(int i) {
        a(i);
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    @Override // j$.util.stream.u1, j$.util.stream.x1
    public final z1 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void m() {
    }
}
