package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class et extends ds {
    public volatile Handler A;
    public final Object z = new Object();

    public et() {
        Executors.newFixedThreadPool(4, new dt());
    }

    public static Handler K(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d6.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
