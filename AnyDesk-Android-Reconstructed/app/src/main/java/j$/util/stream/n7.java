package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n7 implements l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ n7(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.a;
        IntConsumer intConsumer = this.b;
        switch (i2) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                ((s6) intConsumer).accept(i);
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

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        switch (this.a) {
            case 0:
                w3.g(this, num);
                break;
            default:
                w3.g(this, num);
                break;
        }
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                w3.c();
                throw null;
            default:
                w3.c();
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
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
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
