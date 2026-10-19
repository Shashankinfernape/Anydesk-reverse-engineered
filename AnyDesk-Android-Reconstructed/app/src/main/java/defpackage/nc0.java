package defpackage;

import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public /* synthetic */ nc0(float f, float f2, int i, int i2) {
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = -300;
        int i3 = this.f;
        float f = this.e;
        float f2 = this.d;
        switch (i) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                if (i3 == 1) {
                    i2 = 300;
                } else if (i3 != -1) {
                    i2 = i3;
                }
                JniAdExt.jniOnVScroll(f2, f, i2);
                break;
            default:
                Bitmap bitmap2 = JniAdExt.a;
                if (i3 == 1) {
                    i2 = 300;
                } else if (i3 != -1) {
                    i2 = i3;
                }
                JniAdExt.jniOnHScroll(f2, f, i2);
                break;
        }
    }
}
