package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o4 extends s4 implements r4, l5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ p d;

    public o4(Supplier supplier, ObjIntConsumer objIntConsumer, p pVar) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = pVar;
    }

    @Override // j$.util.stream.n5
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        this.a = this.d.apply(this.a, ((o4) r4Var).a);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
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
