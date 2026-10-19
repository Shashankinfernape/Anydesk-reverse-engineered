package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends u6 implements d2, w1 {
    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final e2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w6, j$.util.stream.e2
    public final Object b() {
        return (long[]) super.b();
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
        super.f(i, (long[]) obj);
    }

    @Override // j$.util.stream.w6, j$.util.stream.e2
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ f2 j(long j, long j2, IntFunction intFunction) {
        return w3.v(this, j, j2);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        w3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.u6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
    public final j$.util.b1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.u6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2, j$.util.stream.f2
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
        l((Long) obj);
    }

    @Override // j$.util.stream.w1, j$.util.stream.x1
    public final d2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final void m() {
    }
}
