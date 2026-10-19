package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.gui.element.PermissionIcon;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class m21 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ r21 d;

    public /* synthetic */ m21(r21 r21Var, int i) {
        this.c = i;
        this.d = r21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q21 q21Var;
        PermissionIcon permissionIcon;
        int i = this.c;
        r21 r21Var = this.d;
        switch (i) {
            case 0:
                bc bcVar = r21Var.s0;
                if (bcVar != null) {
                    bcVar.w0();
                }
                break;
            default:
                if (!r21Var.I0 && (q21Var = r21Var.D0[1]) != null && (permissionIcon = q21Var.b) != null) {
                    r21Var.K0.a(r21Var, !permissionIcon.f);
                }
                if (!r21Var.I0) {
                    PermissionProfile permissionProfile = r21Var.t0;
                    du0 du0Var = du0.pf_audio;
                    if (permissionProfile.b(du0Var)) {
                        JniAdExt.I0.post(new bb0(r21Var.r0, du0Var, !r21Var.t0.m.contains(du0Var)));
                        break;
                    }
                }
                break;
        }
    }
}
