package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class se implements Executor {
    public final /* synthetic */ int c;
    public final Handler d;

    public se(int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.d = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.d = new Handler(Looper.getMainLooper());
                break;
            default:
                this.d = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        Handler handler = this.d;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                handler.post(runnable);
                return;
            case 3:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public /* synthetic */ se(Handler handler, int i) {
        this.c = i;
        this.d = handler;
    }
}
