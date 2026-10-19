package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends r1 implements l5 {
    public final /* synthetic */ s1 c;
    public final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, IntPredicate intPredicate) {
        super(s1Var);
        this.c = s1Var;
        this.d = intPredicate;
    }

    @Override // j$.util.stream.r1, j$.util.stream.n5
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        s1 s1Var = this.c;
        if (zTest == s1Var.a) {
            this.a = true;
            this.b = s1Var.b;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }
}
