package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class aj {
    public boolean a;
    public zi b;
    public CancellationSignal c;
    public boolean d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                zi ziVar = this.b;
                CancellationSignal cancellationSignal = this.c;
                if (ziVar != null) {
                    try {
                        ziVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(zi ziVar) {
        synchronized (this) {
            while (this.d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == ziVar) {
                return;
            }
            this.b = ziVar;
            if (this.a) {
                ziVar.onCancel();
            }
        }
    }
}
