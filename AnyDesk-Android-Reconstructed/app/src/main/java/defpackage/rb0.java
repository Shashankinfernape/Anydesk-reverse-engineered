package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class rb0 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte[] f;

    public rb0(byte[] bArr, int i, int i2) {
        this.f = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                byte[] bArr = this.f;
                Bitmap bitmapDecodeByteArray = (bArr == null || bArr.length <= 0) ? null : BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray != null) {
                    zg0 zg0Var = JniAdExt.G0;
                    synchronized (zg0Var) {
                        zg0Var.g = bitmapDecodeByteArray;
                        zg0Var.d = this.d;
                        zg0Var.e = this.e;
                        JniAdExt.m1();
                        break;
                    }
                    ConnectionFragment connectionFragment = JniAdExt.T;
                    if (connectionFragment != null) {
                        connectionFragment.f1();
                        return;
                    }
                    return;
                }
                return;
            default:
                AccountLoggedInFragment accountLoggedInFragment = JniAdExt.Y;
                if (accountLoggedInFragment != null) {
                    t70.Y(new g4(accountLoggedInFragment, this.d, this.e, nd0.t(this.f)));
                    return;
                }
                return;
        }
    }

    public rb0(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }
}
