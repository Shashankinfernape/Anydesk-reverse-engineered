package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentPermissions;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVpn;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ c3(int i, c40 c40Var) {
        this.a = i;
        this.b = c40Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        l3 l3Var;
        z80 z80Var;
        int i = this.a;
        c40 c40Var = this.b;
        switch (i) {
            case 0:
                k3 k3Var = (k3) c40Var;
                if (!k3Var.I0 && (l3Var = k3Var.u0) != null && (z80Var = l3Var.b) != null && z80Var.l != null) {
                    JniAdExt.D4(z80Var.a, du0.pf_audio, z);
                }
                if (!k3Var.I0) {
                    k3Var.M0.a(k3Var, z);
                }
                break;
            case 1:
                eu0 eu0Var = z ? new eu0(2 & (-5)) : new eu0(4);
                boolean zO3 = JniAdExt.o3();
                JniAdExt.K4(zO3 ? 19 : 2, eu0Var.c);
                ((ConnectionSettingsFragmentPermissions) c40Var).R0(zO3, z);
                break;
            case 2:
                JniAdExt.J4(10, z);
                ((ConnectionSettingsFragmentVpn) c40Var).O0(JniAdExt.L0.a, z);
                break;
            case 3:
                ((az) c40Var).u0 = z;
                break;
            case 4:
                ((cz) c40Var).w0 = z;
                break;
            case 5:
                ((lz) c40Var).z0 = z;
                break;
            case 6:
                ((x60) c40Var).w0 = z;
                break;
            default:
                ih0.S0((ih0) c40Var);
                break;
        }
    }
}
