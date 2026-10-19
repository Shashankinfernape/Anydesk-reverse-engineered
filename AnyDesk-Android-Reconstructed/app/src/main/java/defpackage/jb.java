package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, qb qbVar) {
        Objects.requireNonNull(qbVar);
        ib ibVar = new ib(0, qbVar);
        v.b(obj).registerOnBackInvokedCallback(1000000, ibVar);
        return ibVar;
    }

    public static void c(Object obj, Object obj2) {
        v.b(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
