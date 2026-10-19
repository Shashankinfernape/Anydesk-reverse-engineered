package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public abstract class bj {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
