package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class k51 extends CancellationException {
    public final xt0 c;

    public k51(xt0 xt0Var) {
        super("Cancelled isolated runner");
        this.c = xt0Var;
    }
}
