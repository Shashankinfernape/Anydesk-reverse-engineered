package defpackage;

import android.widget.CompoundButton;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final du0 b;
    public final /* synthetic */ yt c;

    public /* synthetic */ j3(yt ytVar, du0 du0Var, int i) {
        this.a = i;
        this.c = ytVar;
        this.b = du0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        l3 l3Var;
        z80 z80Var;
        int i = this.a;
        yt ytVar = this.c;
        du0 du0Var = this.b;
        switch (i) {
            case 0:
                k3 k3Var = (k3) ytVar;
                if (!k3Var.I0 && (l3Var = k3Var.u0) != null && (z80Var = l3Var.b) != null && z80Var.l != null) {
                    JniAdExt.D4(z80Var.a, du0Var, z);
                }
                break;
            default:
                r21 r21Var = (r21) ytVar;
                if (!r21Var.I0 && r21Var.t0.b(du0Var)) {
                    JniAdExt.I0.post(new bb0(r21Var.r0, du0Var, z));
                }
                break;
        }
    }
}
