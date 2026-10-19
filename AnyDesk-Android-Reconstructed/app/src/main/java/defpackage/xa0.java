package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 implements Runnable {
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public xa0(long j, String str, String str2, String str3) {
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniAddRosterItem(this.c, nd0.T(this.d), nd0.T(this.e), nd0.T(this.f));
    }
}
