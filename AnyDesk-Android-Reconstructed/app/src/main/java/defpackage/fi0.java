package defpackage;

import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final class fi0 extends Thread {
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ MainApplication d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(MainApplication mainApplication, Runnable runnable) {
        super("terminate");
        this.d = mainApplication;
        this.c = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        java.lang.Thread.sleep(500);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
        L4:
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 + r0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L48
            com.anydesk.anydeskandroid.MainApplication r2 = r7.d
            m11 r2 = r2.Z
            java.lang.Object r3 = r2.d
            monitor-enter(r3)
            java.util.Hashtable r2 = r2.e     // Catch: java.lang.Throwable -> L39
            java.util.Collection r2 = defpackage.nh0.c(r2)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L20:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L39
            l11 r4 = (defpackage.l11) r4     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.e     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L37
            goto L4
        L37:
            goto L4
        L39:
            r0 = move-exception
            goto L46
        L3b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            com.anydesk.anydeskandroid.MainApplication r0 = r7.d
            com.anydesk.jnilib.Logging r0 = r0.d
            java.lang.String r1 = "no services running"
            r0.e(r1)
            goto L48
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r0
        L48:
            java.lang.Runnable r0 = r7.c
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.run():void");
    }
}
