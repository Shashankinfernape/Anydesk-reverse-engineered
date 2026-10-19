package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yg implements qw {
    public final Context a;

    public yg(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.qw
    public void a(y90 y90Var) {
        fo foVar = new fo("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), foVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new at(this, y90Var, threadPoolExecutor, 1));
    }

    public void b(y6 y6Var, aj ajVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager fingerprintManagerB;
        if (ajVar != null) {
            synchronized (ajVar) {
                try {
                    if (ajVar.c == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        ajVar.c = cancellationSignal2;
                        if (ajVar.a) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = ajVar.c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (fingerprintManagerB = h10.b(this.a)) == null) {
            return;
        }
        h10.a(fingerprintManagerB, h10.e(y6Var), cancellationSignal, new g10());
    }

    public /* synthetic */ yg(Context context, boolean z) {
        this.a = context;
    }

    public yg(ContextWrapper contextWrapper) {
        this.a = contextWrapper.getApplicationContext();
    }
}
