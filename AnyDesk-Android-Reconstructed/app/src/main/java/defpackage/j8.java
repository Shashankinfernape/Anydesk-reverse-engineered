package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class j8 extends h2 implements zq {
    private volatile Object _preHandler;

    public j8() {
        super(fw.e);
        this._preHandler = this;
    }

    public final void e(Throwable th) {
        Method declaredMethod;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
