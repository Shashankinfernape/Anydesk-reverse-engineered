package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 {
    public static final qq0 a = new qq0();

    public final OnBackInvokedCallback a(o50 o50Var) {
        o50Var.getClass();
        return new ib(3, o50Var);
    }

    public final void b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
