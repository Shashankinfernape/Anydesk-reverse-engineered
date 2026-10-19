package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ mc0(float f, float f2, int i) {
        this.c = i;
        this.d = f;
        this.e = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniOnStartScroll(this.d, this.e);
                break;
            default:
                JniAdExt.jniOnScroll(this.d, this.e);
                break;
        }
    }
}
