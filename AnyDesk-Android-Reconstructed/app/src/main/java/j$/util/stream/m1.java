package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ m1(s1 s1Var, int i) {
        this.a = i;
        this.b = s1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new p1(this.b);
            default:
                return new q1(this.b);
        }
    }
}
