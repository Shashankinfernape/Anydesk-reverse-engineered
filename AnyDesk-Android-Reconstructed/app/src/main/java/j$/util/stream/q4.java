package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q4 implements r4, m5 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    public q4(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        if (!this.a) {
            this.b = this.c.applyAsLong(this.b, j);
        } else {
            this.a = false;
            this.b = j;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.b0.c : new j$.util.b0(this.b);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        q4 q4Var = (q4) r4Var;
        if (q4Var.a) {
            return;
        }
        accept(q4Var.b);
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
