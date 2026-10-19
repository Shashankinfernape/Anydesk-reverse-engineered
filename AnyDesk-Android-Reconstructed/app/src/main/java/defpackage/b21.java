package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class b21 implements r6 {
    public final /* synthetic */ e21 c;

    public /* synthetic */ b21(e21 e21Var) {
        this.c = e21Var;
    }

    @Override // defpackage.r6
    public void h(String str) {
        this.c.U0();
    }

    @Override // defpackage.r6
    public boolean k() {
        e21 e21Var = this.c;
        String strS0 = e21Var.S0();
        if (!e21.T0(strS0)) {
            e21Var.V0(2);
            return true;
        }
        e21Var.V0(5);
        JniAdExt.I0.post(new ua0(strS0, 4));
        return true;
    }
}
