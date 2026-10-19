package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 implements k8 {
    public boolean a;
    public Object b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
    }
}
