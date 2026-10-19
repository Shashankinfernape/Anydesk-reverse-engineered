package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public final ba0 a = new ba0();

    public abstract boolean a();

    public abstract Object b(pt0 pt0Var);

    public final void c() {
        boolean z;
        ba0 ba0Var = this.a;
        ArrayList arrayList = ba0Var.b;
        if (ba0Var.c) {
            z = false;
        } else {
            ReentrantLock reentrantLock = ba0Var.a;
            try {
                reentrantLock.lock();
                if (ba0Var.c) {
                    reentrantLock.unlock();
                    z = false;
                } else {
                    ba0Var.c = true;
                    List<o50> listW0 = tm.w0(arrayList);
                    arrayList.clear();
                    reentrantLock.unlock();
                    for (o50 o50Var : listW0) {
                        o50Var.getClass();
                        o50Var.a();
                    }
                    z = true;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (z) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object d(lt0 lt0Var, sq sqVar);
}
