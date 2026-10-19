package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x91 {
    public static final ThreadLocal a = new ThreadLocal();

    public static dy a() {
        ThreadLocal threadLocal = a;
        dy dyVar = (dy) threadLocal.get();
        if (dyVar != null) {
            return dyVar;
        }
        jh jhVar = new jh(Thread.currentThread());
        threadLocal.set(jhVar);
        return jhVar;
    }
}
