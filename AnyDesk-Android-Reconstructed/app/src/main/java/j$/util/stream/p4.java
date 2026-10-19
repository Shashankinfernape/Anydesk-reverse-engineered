package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p4 implements r4, m5 {
    public long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ LongBinaryOperator c;

    public p4(long j, LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        accept(((p4) r4Var).a);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
    }
}
