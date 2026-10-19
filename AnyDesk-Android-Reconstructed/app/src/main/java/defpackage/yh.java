package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class yh {
    public final Context b;
    public final Intent c;
    public final int d;
    public final Executor i;
    public Messenger a = null;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public final ArrayDeque h = new ArrayDeque();
    public final xh j = new xh(this);

    public yh(ThreadPoolExecutor threadPoolExecutor, Context context, Intent intent) {
        if (threadPoolExecutor == null) {
            throw new NullPointerException("executor must not be null");
        }
        if (context == null) {
            throw new NullPointerException("context must not be null");
        }
        this.i = threadPoolExecutor;
        this.b = context;
        this.c = intent;
        this.d = 1;
    }

    public final void a(d11 d11Var) {
        try {
            Messenger messenger = this.a;
            d11Var.getClass();
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = d11Var.a;
            messenger.send(messageObtain);
            le0 le0Var = d11Var.b;
            if (le0Var != null) {
                le0Var.u(0, null);
            }
        } catch (TransactionTooLargeException e) {
            d11Var.a(2, e);
        } catch (RemoteException e2) {
            d11Var.a(1, e2);
        }
    }
}
