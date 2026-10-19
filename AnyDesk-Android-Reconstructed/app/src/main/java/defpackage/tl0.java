package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 {
    public final w30 a;

    public tl0(c40 c40Var, sl0 sl0Var) {
        this.a = (w30) c40Var.F0(new ev(24, sl0Var), new i4(1));
    }

    public void a(c40 c40Var, boolean z) {
        if (!z) {
            JniAdExt.k4();
        } else if (r3.m(c40Var, new String[]{"android.permission.RECORD_AUDIO"}, this.a)) {
            JniAdExt.k4();
        }
    }

    public tl0(c40 c40Var, x6 x6Var) {
        this.a = (w30) c40Var.F0(new tk(x6Var), new i4(2));
    }
}
