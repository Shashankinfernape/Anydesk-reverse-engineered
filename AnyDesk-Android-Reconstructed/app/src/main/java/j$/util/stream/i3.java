package j$.util.stream;

import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i3 extends k3 implements j$.util.b1 {
    @Override // j$.util.b1
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        j$.util.e1 e1Var = this.c;
        if (e1Var != null) {
            ((j$.util.b1) e1Var).forEachRemaining(obj);
            return;
        }
        Deque dequeB = b();
        while (true) {
            e2 e2Var = (e2) k3.a(dequeB);
            if (e2Var == null) {
                this.a = null;
                return;
            }
            e2Var.g(obj);
        }
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(Object obj) {
        e2 e2Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.b1) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (e2Var = (e2) k3.a(this.e)) != null) {
                j$.util.b1 b1VarSpliterator = e2Var.spliterator();
                this.d = b1VarSpliterator;
                return b1VarSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
