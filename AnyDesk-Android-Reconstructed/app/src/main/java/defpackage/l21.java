package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class l21 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r21 b;

    public /* synthetic */ l21(r21 r21Var, int i) {
        this.a = i;
        this.b = r21Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        int i2 = 0;
        r21 r21Var = this.b;
        switch (i) {
            case 0:
                if (!r21Var.I0) {
                    JniAdExt.I0.post(new ab0(r21Var.r0, z, i2));
                    r21Var.T0();
                    r21Var.W0();
                    break;
                }
                break;
            case 1:
                if (!r21Var.I0) {
                    if (z) {
                        r21.S0(r21Var);
                    } else {
                        String str = r21Var.r0;
                        JniAdExt.I0.post(new d3(t01.e, str, 17, false));
                        r21Var.A0.setEnabled(false);
                    }
                    MainApplication.v().o();
                    break;
                }
                break;
            default:
                if (!r21Var.I0) {
                    PermissionProfile permissionProfile = r21Var.t0;
                    du0 du0Var = du0.pf_audio;
                    if (permissionProfile.b(du0Var)) {
                        JniAdExt.I0.post(new bb0(r21Var.r0, du0Var, z));
                    }
                }
                if (!r21Var.I0) {
                    r21Var.K0.a(r21Var, z);
                }
                break;
        }
    }
}
