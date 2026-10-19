package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class g8 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Runnable b;

    public g8(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
            this.b.run();
        } catch (Throwable th) {
            try {
                this.b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
