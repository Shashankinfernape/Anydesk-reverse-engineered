package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 implements Runnable {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ int[] h;
    public final /* synthetic */ int[] i;
    public final /* synthetic */ long[] j;
    public final /* synthetic */ long[] k;
    public final /* synthetic */ int l;

    public dc0(boolean z, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int[] iArr, int[] iArr2, long[] jArr, byte[] bArr4, long[] jArr2) {
        this.c = z;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = iArr;
        this.i = iArr2;
        this.j = jArr;
        this.k = jArr2;
        this.l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        x00 x00Var = MainApplication.v().s;
        if (x00Var == null) {
            return;
        }
        if (this.c && x00Var.j) {
            return;
        }
        String strT = nd0.t(this.d);
        x00Var.y(strT, this.c);
        String[] strArrE = nd0.e(nd0.t(this.e));
        String[] strArrE2 = nd0.e(nd0.t(this.f));
        String[] strArrE3 = nd0.e(nd0.t(this.g));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = strArrE.length;
            z = this.c;
            if (i >= length) {
                break;
            }
            ArrayList arrayList2 = arrayList;
            int i2 = i;
            arrayList2.add(new mz(z, strArrE[i2], strArrE2[i2], strT, new xy(this.h[i2]), new wy(this.i[i2]), this.j[i2], strArrE3[i2], this.k[i2]));
            i = i2 + 1;
            arrayList = arrayList2;
            strArrE2 = strArrE2;
            strArrE = strArrE;
        }
        x00Var.d(arrayList, z);
        x00Var.z(q51.b(this.l), this.c);
        zd zdVar = JniAdExt.f0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                    if (fileManagerFileListFragment != null) {
                        t70.Y(new b00(fileManagerFileListFragment, this.c, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
