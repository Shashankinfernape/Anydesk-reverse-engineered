package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class sc0 implements Runnable {
    public final /* synthetic */ int c;

    public /* synthetic */ sc0(int i) {
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniBrowseFilesFromOngoingConnection();
                break;
            case 1:
                JniAdExt.jniAnynetAccountLogout();
                break;
            case 2:
                JniAdExt.jniAnynetAccountAbortOAuth();
                break;
            default:
                JniAdExt.jniOnAddressBookOpen();
                break;
        }
    }
}
