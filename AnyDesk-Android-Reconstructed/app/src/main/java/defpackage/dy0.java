package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 extends Thread {
    public final int c;

    public dy0(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.c = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.c);
        super.run();
    }
}
