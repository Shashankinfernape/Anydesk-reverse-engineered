package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra0 implements Runnable {
    public final /* synthetic */ long c;

    public /* synthetic */ ra0(long j) {
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniOpenChatHistory(this.c);
    }
}
