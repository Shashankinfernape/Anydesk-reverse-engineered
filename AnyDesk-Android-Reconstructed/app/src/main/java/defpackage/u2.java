package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u2 implements Future {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g = Logger.getLogger(u2.class.getName());
    public static final r71 h;
    public static final Object i;
    public volatile Object c;
    public volatile q2 d;
    public volatile t2 e;

    static {
        r71 s2Var;
        try {
            s2Var = new r2(AtomicReferenceFieldUpdater.newUpdater(t2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t2.class, t2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, t2.class, "e"), AtomicReferenceFieldUpdater.newUpdater(u2.class, q2.class, "d"), AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            s2Var = new s2();
        }
        h = s2Var;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i = new Object();
    }

    public static void b(u2 u2Var) {
        t2 t2Var;
        q2 q2Var;
        do {
            t2Var = u2Var.e;
        } while (!h.h(u2Var, t2Var, t2.c));
        while (t2Var != null) {
            Thread thread = t2Var.a;
            if (thread != null) {
                t2Var.a = null;
                LockSupport.unpark(thread);
            }
            t2Var = t2Var.b;
        }
        do {
            q2Var = u2Var.d;
        } while (!h.f(u2Var, q2Var));
        q2 q2Var2 = null;
        while (q2Var != null) {
            q2 q2Var3 = q2Var.a;
            q2Var.a = q2Var2;
            q2Var2 = q2Var;
            q2Var = q2Var3;
        }
        while (q2Var2 != null) {
            q2Var2 = q2Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                g.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof o2) {
            Throwable th = ((o2) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p2) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == i) {
            return null;
        }
        return obj;
    }

    public static Object d(u2 u2Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = u2Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        o2 o2Var;
        Object obj = this.c;
        if (obj != null) {
            return false;
        }
        if (f) {
            o2Var = new o2(new CancellationException("Future.cancel() was called."), z);
        } else {
            o2Var = z ? o2.b : o2.c;
        }
        if (!h.g(this, obj, o2Var)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(t2 t2Var) {
        t2Var.a = null;
        while (true) {
            t2 t2Var2 = this.e;
            if (t2Var2 == t2.c) {
                return;
            }
            t2 t2Var3 = null;
            while (t2Var2 != null) {
                t2 t2Var4 = t2Var2.b;
                if (t2Var2.a != null) {
                    t2Var3 = t2Var2;
                } else if (t2Var3 != null) {
                    t2Var3.b = t2Var4;
                    if (t2Var3.a == null) {
                    }
                } else if (!h.h(this, t2Var2, t2Var4)) {
                }
                t2Var2 = t2Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        t2 t2Var = t2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t2 t2Var2 = this.e;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                while (true) {
                    r71 r71Var = h;
                    r71Var.E(t2Var3, t2Var2);
                    if (r71Var.h(this, t2Var2, t2Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(t2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                e(t2Var3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        t2Var2 = this.e;
                        if (t2Var2 == t2Var) {
                        }
                    }
                }
            }
            return c(this.c);
        }
        while (nanos > 0) {
            Object obj3 = this.c;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof o2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.c instanceof o2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        t2 t2Var = t2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if (obj2 != null) {
                return c(obj2);
            }
            t2 t2Var2 = this.e;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                do {
                    r71 r71Var = h;
                    r71Var.E(t2Var3, t2Var2);
                    if (r71Var.h(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                e(t2Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    t2Var2 = this.e;
                } while (t2Var2 != t2Var);
            }
            return c(this.c);
        }
        throw new InterruptedException();
    }
}
