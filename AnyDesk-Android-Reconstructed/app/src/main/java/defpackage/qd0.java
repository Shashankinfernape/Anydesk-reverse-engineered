package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class qd0 extends CancellationException {
    public final transient wd0 c;

    public qd0(String str, Throwable th, wd0 wd0Var) {
        super(str);
        this.c = wd0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        if (!y90.e(qd0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = qd0Var.c;
        if (obj2 == null) {
            obj2 = wp0.d;
        }
        Object obj3 = this.c;
        if (obj3 == null) {
            obj3 = wp0.d;
        }
        return y90.e(obj2, obj3) && y90.e(qd0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.c;
        if (obj == null) {
            obj = wp0.d;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.c;
        if (obj == null) {
            obj = wp0.d;
        }
        sb.append(obj);
        return sb.toString();
    }
}
