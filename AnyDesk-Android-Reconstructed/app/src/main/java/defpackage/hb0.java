package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte[] e;

    public /* synthetic */ hb0(int i, int i2, byte[] bArr) {
        this.c = i2;
        this.d = i;
        this.e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        byte[] bArr = this.e;
        int i2 = this.d;
        switch (i) {
            case 0:
                JniAdExt.b.e("relay status changed to " + i2);
                JniAdExt.l = i2;
                JniAdExt.m = nd0.t(bArr);
                if (i2 == 2) {
                    JniAdExt.I0.removeMessages(q51.d(4));
                }
                MainFragment mainFragment = JniAdExt.y;
                if (mainFragment != null) {
                    t70.Y(new qi(mainFragment, i2, 5));
                }
                break;
            default:
                JniAdExt.m0.G(i2, nd0.t(bArr));
                break;
        }
    }
}
