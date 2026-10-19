package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends a5 implements r6, w6 {
    @Override // defpackage.r6
    public void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e();
    }

    @Override // defpackage.r6
    public boolean k() {
        t70.Y((Runnable) this.d);
        return true;
    }

    @Override // defpackage.w6
    public boolean r() {
        t70.Y((Runnable) this.d);
        return true;
    }

    @Override // defpackage.w6
    public void t(t01 t01Var) {
        if (t01Var.isEmpty()) {
            return;
        }
        e();
    }
}
