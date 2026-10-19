package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class tw extends y90 {
    public final /* synthetic */ y90 i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public tw(y90 y90Var, ThreadPoolExecutor threadPoolExecutor) {
        this.i = y90Var;
        this.j = threadPoolExecutor;
    }

    @Override // defpackage.y90
    public final void M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.y90
    public final void P(ah ahVar) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.P(ahVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
