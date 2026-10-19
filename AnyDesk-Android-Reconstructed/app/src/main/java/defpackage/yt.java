package defpackage;

import android.content.Context;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt extends xt {
    public m80 p0;

    public final void R0(w7 w7Var) {
        w7Var.h.d(-3, JniAdExt.n1("ad.chat.open"), null);
        w7Var.setOnShowListener(new n4(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xt, defpackage.c40
    public void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.p0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public void t0() {
        m80 m80Var = this.p0;
        if (m80Var != null) {
            ((MainActivity) m80Var).p0();
        }
        super.t0();
    }

    @Override // defpackage.xt, defpackage.c40
    public void u0() {
        super.u0();
        this.p0 = null;
    }
}
