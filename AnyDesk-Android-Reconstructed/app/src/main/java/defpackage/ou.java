package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou extends Exception {
    public final Throwable c;

    public ou(Throwable th, dr drVar, br brVar) {
        super("Coroutine dispatcher " + drVar + " threw an exception, context = " + brVar, th);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }
}
