package j$.util.stream;

import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends k3 {
    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        j$.util.e1 e1Var = this.c;
        if (e1Var != null) {
            e1Var.forEachRemaining(consumer);
            return;
        }
        Deque dequeB = b();
        while (true) {
            f2 f2VarA = k3.a(dequeB);
            if (f2VarA == null) {
                this.a = null;
                return;
            }
            f2VarA.forEach(consumer);
        }
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        f2 f2VarA;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (f2VarA = k3.a(this.e)) != null) {
                j$.util.e1 e1VarSpliterator = f2VarA.spliterator();
                this.d = e1VarSpliterator;
                return e1VarSpliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }
}
