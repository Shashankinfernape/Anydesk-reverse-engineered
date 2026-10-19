package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ ab0(String str, boolean z, int i) {
        this.c = i;
        this.e = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.d;
        String str = this.e;
        switch (i) {
            case 0:
                JniAdExt.jniSetProfileEnabled(nd0.T(str), z);
                break;
            case 1:
                JniAdExt.jniFileManagerChangeCurrentPath(z, nd0.T(str));
                break;
            case 2:
                JniAdExt.jniFileManagerCreateFolder(z, nd0.T(str));
                break;
            case 3:
                JniAdExt.jniHandleTerminal(nd0.T(str), z);
                break;
            default:
                JniAdExt.jniRegisterLicense(nd0.T(str), z);
                break;
        }
    }

    public /* synthetic */ ab0(boolean z, String str, int i) {
        this.c = i;
        this.d = z;
        this.e = str;
    }
}
