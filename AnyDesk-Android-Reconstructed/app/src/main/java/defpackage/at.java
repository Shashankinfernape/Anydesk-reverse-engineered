package defpackage;

import android.content.Context;
import android.view.View;
import com.anydesk.anydeskandroid.SpeedDialItem;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ at(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ct ctVar = (ct) this.d;
                View view = (View) this.e;
                xs xsVar = (xs) this.f;
                ctVar.a.endViewTransition(view);
                xsVar.e();
                return;
            case 1:
                yg ygVar = (yg) this.d;
                y90 y90Var = (y90) this.e;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f;
                try {
                    i30 i30VarH = lk0.h(ygVar.a);
                    if (i30VarH == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    h30 h30Var = (h30) ((qw) i30VarH.b);
                    synchronized (h30Var.d) {
                        h30Var.f = threadPoolExecutor;
                        break;
                    }
                    ((qw) i30VarH.b).a(new tw(y90Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    y90Var.M(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                a51.a((a51) this.d, (Context) this.e, (SpeedDialItem[]) this.f);
                return;
        }
    }
}
