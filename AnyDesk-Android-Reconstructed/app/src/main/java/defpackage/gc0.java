package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ double k;
    public final /* synthetic */ byte[] l;
    public final /* synthetic */ byte[] m;
    public final /* synthetic */ byte[] n;

    public gc0(int i, byte b, byte b2, long j, long j2, int i2, int i3, int i4, double d, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.d = b;
        this.e = b2;
        this.f = j;
        this.g = j2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = d;
        this.l = bArr;
        this.m = bArr2;
        this.n = bArr3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x00 x00Var = MainApplication.v().s;
        if (x00Var == null) {
            return;
        }
        int i = this.c;
        n00 n00Var = new n00(i, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (float) this.k, nd0.t(this.l), nd0.t(this.m), nd0.t(this.n));
        synchronized (x00Var.L) {
            try {
                n00 n00Var2 = (n00) x00Var.L.get(Integer.valueOf(i));
                if (n00Var2 == null || !n00Var2.a()) {
                    x00Var.L.put(Integer.valueOf(i), n00Var);
                    x00Var.D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileManagerProgressListFragment fileManagerProgressListFragment = JniAdExt.g0;
        if (fileManagerProgressListFragment != null) {
            t70.Y(new c(23, fileManagerProgressListFragment));
        }
        MainApplication mainApplication = JniAdExt.j0;
        if (mainApplication != null) {
            t70.Y(new ei0(mainApplication, 4));
        }
    }
}
