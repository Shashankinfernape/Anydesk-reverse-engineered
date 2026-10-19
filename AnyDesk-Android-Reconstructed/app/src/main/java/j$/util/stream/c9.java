package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class c9 extends d9 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(j$.util.e1 e1Var, c9 c9Var, int i) {
        super(e1Var, c9Var);
        this.g = i;
        this.e = c9Var.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d9
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        switch (this.g) {
            case 0:
                return new c9(e1Var, this, 0);
            default:
                return new c9(e1Var, this, 1);
        }
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        int i = this.g;
        Predicate predicate = this.e;
        j$.util.e1 e1Var = this.a;
        boolean z = false;
        switch (i) {
            case 0:
                if (!this.c) {
                    return e1Var.tryAdvance(consumer);
                }
                this.c = false;
                while (true) {
                    zTryAdvance = e1Var.tryAdvance(this);
                    if (zTryAdvance && a() && predicate.test(this.f)) {
                        z = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z) {
                    this.b.set(true);
                }
                consumer.accept(this.f);
                return zTryAdvance;
            default:
                if (this.c && a() && e1Var.tryAdvance(this)) {
                    zTest = predicate.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public j$.util.e1 trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(j$.util.e1 e1Var, Predicate predicate, int i) {
        super(e1Var);
        this.g = i;
        this.e = predicate;
    }
}
