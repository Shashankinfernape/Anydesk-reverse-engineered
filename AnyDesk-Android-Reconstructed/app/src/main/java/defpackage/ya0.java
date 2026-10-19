package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements Runnable {
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public ya0(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniDeleteRosterItem(this.c, this.d);
    }
}
