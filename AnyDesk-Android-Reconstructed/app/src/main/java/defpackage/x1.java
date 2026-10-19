package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends CancellationException {
    public final transient Object c;

    public x1(v10 v10Var) {
        super("Flow was aborted, no more elements needed");
        this.c = v10Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
