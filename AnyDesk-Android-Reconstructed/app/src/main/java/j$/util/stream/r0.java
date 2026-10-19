package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 implements j8, k8 {
    public final boolean a;

    public r0(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j8
    public final int f() {
        if (this.a) {
            return 0;
        }
        return b7.r;
    }

    public final void g(a aVar, j$.util.e1 e1Var) {
        if (this.a) {
            new s0(aVar, e1Var, this).invoke();
        } else {
            new t0(aVar, e1Var, aVar.O(this)).invoke();
        }
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
    }
}
