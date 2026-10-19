package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t61 {
    public static final /* synthetic */ int a = 0;

    static {
        Object py0Var;
        Object py0Var2;
        Exception exc = new Exception();
        String simpleName = th1.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            py0Var = ag.class.getCanonicalName();
        } catch (Throwable th) {
            py0Var = new py0(th);
        }
        if (qy0.a(py0Var) != null) {
            py0Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            py0Var2 = t61.class.getCanonicalName();
        } catch (Throwable th2) {
            py0Var2 = new py0(th2);
        }
        if (qy0.a(py0Var2) != null) {
            py0Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
