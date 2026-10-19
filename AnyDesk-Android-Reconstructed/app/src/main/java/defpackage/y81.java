package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class y81 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final fw f;

    static {
        String property;
        int i = k81.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = hq.O("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = k81.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = hq.P(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        d = hq.P(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        e = TimeUnit.SECONDS.toNanos(hq.O("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = fw.g;
    }
}
