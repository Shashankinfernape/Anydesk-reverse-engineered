package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class bs0 {
    public final ts0 a;
    public final fw b;
    public final bc c = new bc(14);
    public final bc d = new bc(14);
    public final t10 e = lk0.J(new ih(this, (rq) null, 9));

    public bs0(ts0 ts0Var, fw fwVar) {
        this.a = ts0Var;
        this.b = fwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(bs0 bs0Var, h1 h1Var, sq sqVar) {
        zr0 zr0Var;
        if (sqVar instanceof zr0) {
            zr0Var = (zr0) sqVar;
            int i = zr0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                zr0Var.j = i - Integer.MIN_VALUE;
            } else {
                zr0Var = new zr0(bs0Var, sqVar);
            }
        } else {
            zr0Var = new zr0(bs0Var, sqVar);
        }
        Object objH = zr0Var.h;
        int i2 = zr0Var.j;
        boolean z = true;
        if (i2 == 0) {
            y90.V(objH);
            ts0 ts0Var = bs0Var.a;
            zr0Var.f = bs0Var;
            zr0Var.g = h1Var;
            zr0Var.j = 1;
            objH = ts0Var.h(zr0Var);
            lr lrVar = lr.c;
            if (objH == lrVar) {
                return lrVar;
            }
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h1Var = zr0Var.g;
            bs0Var = zr0Var.f;
            y90.V(objH);
        }
        bs0 bs0Var2 = bs0Var;
        h1 h1Var2 = (h1) objH;
        if (h1Var2 == h1Var) {
            nh0.j("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
            return null;
        }
        vq0 vq0Var = new vq0(0, bs0Var2, bs0.class, "invalidate", "invalidate()V", 0, 0, 3);
        h1Var2.getClass();
        ba0 ba0Var = h1Var2.a;
        ba0Var.getClass();
        if (ba0Var.c) {
            vq0Var.a();
        } else {
            ReentrantLock reentrantLock = ba0Var.a;
            try {
                reentrantLock.lock();
                if (!ba0Var.c) {
                    ba0Var.b.add(vq0Var);
                    z = false;
                }
                if (z) {
                    vq0Var.a();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (h1Var != null) {
            vq0 vq0Var2 = new vq0(0, bs0Var2, bs0.class, "invalidate", "invalidate()V", 0, 0, 4);
            ba0 ba0Var2 = h1Var.a;
            ReentrantLock reentrantLock2 = ba0Var2.a;
            try {
                reentrantLock2.lock();
                ba0Var2.b.remove(vq0Var2);
                reentrantLock2.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        }
        if (h1Var != null) {
            h1Var.c();
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Generated new PagingSource " + h1Var2, null);
        }
        return h1Var2;
    }
}
