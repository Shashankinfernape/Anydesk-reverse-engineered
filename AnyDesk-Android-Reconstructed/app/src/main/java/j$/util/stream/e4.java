package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class e4 extends s4 implements r4, k5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ p d;

    public e4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, p pVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = pVar;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        this.a = this.d.apply(this.a, ((e4) r4Var).a);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        w3.d(this, d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
    }
}
