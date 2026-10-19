package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e8 implements n5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ e8(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        int i = this.a;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                ((x6) consumer).o(obj);
                break;
            default:
                consumer.o(obj);
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

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }
}
