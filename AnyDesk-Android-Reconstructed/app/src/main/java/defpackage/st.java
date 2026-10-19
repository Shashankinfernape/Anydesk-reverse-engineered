package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st extends RuntimeException {
    public final transient br c;

    public st(br brVar) {
        this.c = brVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.c);
    }
}
