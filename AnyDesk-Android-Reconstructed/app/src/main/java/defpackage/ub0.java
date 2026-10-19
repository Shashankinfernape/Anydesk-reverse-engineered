package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ byte[] f;

    public /* synthetic */ ub0(boolean z, byte[] bArr, byte[] bArr2, int i) {
        this.c = i;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                b21 b21Var = JniAdExt.L;
                if (b21Var != null) {
                    boolean z = this.d;
                    nd0.t(this.e);
                    t70.Y(new c21(b21Var, z, nd0.t(this.f)));
                    return;
                }
                return;
            default:
                x00 x00Var = MainApplication.v().s;
                if (x00Var == null) {
                    return;
                }
                boolean z2 = this.d;
                if (z2 && x00Var.j) {
                    return;
                }
                x00Var.w(z2, nd0.t(this.e), nd0.t(this.f));
                x00Var.z(1, this.d);
                zd zdVar = JniAdExt.f0;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                            if (fileManagerFileListFragment != null) {
                                t70.Y(new b00(fileManagerFileListFragment, this.d, 5));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
