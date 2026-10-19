package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ cb0(int i, String str, int i2) {
        this.c = i2;
        this.d = i;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniSelectPermissionProfile(this.d, nd0.T(this.e));
                break;
            case 1:
                JniAdExt.jniSendChatMessage(this.d, nd0.T(this.e));
                break;
            default:
                JniAdExt.jniSendBackendFileOffer(this.d, nd0.T(this.e));
                break;
        }
    }
}
