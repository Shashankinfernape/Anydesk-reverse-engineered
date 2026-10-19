package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 implements r4 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

    public h4(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        h4 h4Var = (h4) r4Var;
        if (h4Var.a) {
            return;
        }
        o(h4Var.b);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
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
