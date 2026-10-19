package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ wa0(long j, String str, int i) {
        this.c = i;
        this.d = j;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.e;
        long j = this.d;
        switch (i) {
            case 0:
                JniAdExt.jniUpdateRoster(j, nd0.T(str));
                break;
            default:
                JniAdExt.jniDeleteRosterItemTag(j, nd0.T(str));
                break;
        }
    }
}
