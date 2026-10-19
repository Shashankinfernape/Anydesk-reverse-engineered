package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 implements Runnable {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    public bb0(boolean z, String str, String str2) {
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.f;
        String str = this.e;
        boolean z = this.d;
        switch (i) {
            case 0:
                JniAdExt.jniSetProfilePermission(nd0.T(str), ((du0) obj).c, z);
                break;
            default:
                JniAdExt.jniFileManagerRenameFile(z, nd0.T(str), nd0.T((String) obj));
                break;
        }
    }

    public bb0(String str, du0 du0Var, boolean z) {
        this.e = str;
        this.f = du0Var;
        this.d = z;
    }
}
