package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class c4 implements r4, k5 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    public c4(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (!this.a) {
            this.b = this.c.applyAsDouble(this.b, d);
        } else {
            this.a = false;
            this.b = d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.a0.c : new j$.util.a0(this.b);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        c4 c4Var = (c4) r4Var;
        if (c4Var.a) {
            return;
        }
        accept(c4Var.b);
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
