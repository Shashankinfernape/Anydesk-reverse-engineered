package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends r1 {
    public final /* synthetic */ s1 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(s1 s1Var, Predicate predicate) {
        super(s1Var);
        this.c = s1Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        s1 s1Var = this.c;
        if (zTest == s1Var.a) {
            this.a = true;
            this.b = s1Var.b;
        }
    }
}
