package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l7 implements k5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ l7(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
        DoubleConsumer doubleConsumer = this.b;
        switch (i) {
            case 0:
                doubleConsumer.accept(d);
                break;
            default:
                ((q6) doubleConsumer).accept(d);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
        int i = this.a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        switch (this.a) {
            case 0:
                w3.d(this, d);
                break;
            default:
                w3.d(this, d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                w3.k();
                throw null;
            default:
                w3.k();
                throw null;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                w3.l();
                throw null;
            default:
                w3.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.a) {
            case 0:
                o((Double) obj);
                break;
            default:
                o((Double) obj);
                break;
        }
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }
}
