package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class h30 implements qw {
    public final Context a;
    public final g30 b;
    public final fw c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public y90 h;

    public h30(Context context, g30 g30Var) {
        r71.i(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = g30Var;
        this.c = i30.d;
    }

    @Override // defpackage.qw
    public final void a(y90 y90Var) {
        synchronized (this.d) {
            this.h = y90Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fo("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new l(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r30 d() {
        try {
            fw fwVar = this.c;
            Context context = this.a;
            g30 g30Var = this.b;
            fwVar.getClass();
            Object[] objArr = {g30Var};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            v7 v7VarA = f30.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i = v7VarA.c;
            if (i != 0) {
                throw new RuntimeException(q51.k(i, "fetchFonts failed (", ")"));
            }
            r30[] r30VarArr = (r30[]) ((List) v7VarA.d).get(0);
            if (r30VarArr == null || r30VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return r30VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
