package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us extends jy {
    public static final us f;
    public jr e;

    static {
        int i = y81.c;
        int i2 = y81.d;
        long j = y81.e;
        String str = y81.a;
        us usVar = new us();
        usVar.e = new jr(i, i2, j, str);
        f = usVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        jr.c(this.e, runnable, 6);
    }

    @Override // defpackage.dr
    public final void f(br brVar, Runnable runnable) {
        jr.c(this.e, runnable, 2);
    }

    @Override // defpackage.dr
    public final String toString() {
        return "Dispatchers.Default";
    }
}
