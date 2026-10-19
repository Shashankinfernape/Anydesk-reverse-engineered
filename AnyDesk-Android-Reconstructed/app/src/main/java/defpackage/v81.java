package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v81 extends u81 {
    public final Runnable e;

    public v81(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.e;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ds.s(runnable));
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
