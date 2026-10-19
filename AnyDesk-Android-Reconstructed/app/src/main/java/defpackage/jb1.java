package defpackage;

import android.os.FileObserver;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import com.anydesk.jnilib.Logging;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jb1 {
    public File b;
    public FileObserver c;
    public BufferedReader d;
    public TraceFragment g;
    public final Logging a = new Logging("TraceWatcher");
    public final ArrayList e = new ArrayList();
    public int f = 0;

    public final synchronized void a() {
        if (this.c == null) {
            return;
        }
        try {
            if (this.d == null || this.f == 10) {
                b();
                this.d = new BufferedReader(new FileReader(this.b));
                this.e.clear();
                this.f = 0;
            }
            if (this.d.ready()) {
                this.f = 0;
            } else {
                this.f++;
            }
            boolean z = false;
            while (true) {
                String line = this.d.readLine();
                if (line == null) {
                    break;
                }
                this.e.add(line);
                z = true;
            }
            if (z) {
                c(false);
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void b() {
        try {
            BufferedReader bufferedReader = this.d;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Throwable th) {
            this.a.b("Failed to close FileReader", th);
        }
    }

    public final synchronized void c(boolean z) {
        TraceFragment traceFragment = this.g;
        if (traceFragment != null) {
            t70.Y(new ap(traceFragment, 6, z));
        }
    }
}
