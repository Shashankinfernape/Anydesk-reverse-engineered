package defpackage;

import android.widget.CheckBox;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class k21 implements sl0 {
    public final /* synthetic */ r21 c;

    public /* synthetic */ k21(r21 r21Var) {
        this.c = r21Var;
    }

    @Override // defpackage.sl0
    public void a() {
        r21 r21Var = this.c;
        CheckBox checkBox = r21Var.D0[1].d;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        bc bcVar = r21Var.s0;
        if (bcVar != null) {
            bcVar.t0(12, JniAdExt.n1("ad.setup.microphone.title"));
        }
    }
}
