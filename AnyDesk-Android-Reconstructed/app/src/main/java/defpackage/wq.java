package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class wq implements Runnable {
    public final InputStream c;
    public final File d;
    public final ah e;
    public final long f;
    public long g = 0;
    public String h = "";

    public wq(InputStream inputStream, File file, ah ahVar, long j) {
        this.c = inputStream;
        this.d = file;
        this.e = ahVar;
        this.f = j;
    }

    public final void a(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.g > 500) {
            this.g = jUptimeMillis;
            ah ahVar = this.e;
            t70.Y(new s70((gq0) ahVar.b, this.f, j, (String) ahVar.c));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file = this.d;
        InputStream inputStream = this.c;
        boolean z = false;
        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                a(0L);
                do {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    j += (long) i;
                    a(j);
                } while (!Thread.currentThread().isInterrupted());
                fileOutputStream.flush();
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.h = th.getMessage();
                    try {
                        inputStream.close();
                    } catch (Throwable unused3) {
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused5) {
                    }
                    if (fileOutputStream == null) {
                        throw th3;
                    }
                    try {
                        fileOutputStream.close();
                        throw th3;
                    } catch (Throwable unused6) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
        }
        String absolutePath = file.getAbsolutePath();
        String str = this.h;
        ah ahVar = this.e;
        lk0 lk0Var = (lk0) ahVar.a;
        t70.Y(new c(27, (gq0) ahVar.b));
        if (z) {
            lk0Var.D(absolutePath, true);
        } else {
            lk0.C((Context) ahVar.d, str);
        }
    }
}
