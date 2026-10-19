package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends j5 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, n5 n5Var, int i) {
        super(n5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        n5 n5Var = this.a;
        switch (i) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    n5Var.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((q) this.c).m).accept(obj);
                n5Var.accept(obj);
                break;
            case 2:
                if (((Predicate) ((q) this.c).m).test(obj)) {
                    n5Var.accept(obj);
                }
                break;
            case 3:
                n5Var.accept(((b5) this.c).m.apply(obj));
                break;
            case 4:
                n5Var.accept(((ToIntFunction) ((v0) this.c).m).applyAsInt(obj));
                break;
            case 5:
                n5Var.accept(((ToLongFunction) ((f1) this.c).m).applyAsLong(obj));
                break;
            default:
                n5Var.accept(((ToDoubleFunction) ((w) this.c).m).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.a.c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void m() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.m();
                break;
            default:
                super.m();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n5 n5Var) {
        super(n5Var);
        this.b = 0;
    }
}
