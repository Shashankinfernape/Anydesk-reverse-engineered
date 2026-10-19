package defpackage;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class z21 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentAccess b;

    public /* synthetic */ z21(SettingsFragmentAccess settingsFragmentAccess, int i) {
        this.a = i;
        this.b = settingsFragmentAccess;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        io ioVar = io.KEY_TWO_FACTOR_AUTH_FLAGS;
        io ioVar2 = io.KEY_INTERACTIVE_ACCESS;
        SettingsFragmentAccess settingsFragmentAccess = this.b;
        switch (i) {
            case 0:
                if (!settingsFragmentAccess.V0) {
                    int iH2 = JniAdExt.h2(ioVar);
                    JniAdExt.y4(ioVar, (z ? new dc1(iH2 | 2) : new dc1(iH2 & (-3))).c);
                    break;
                }
                break;
            case 1:
                if (!settingsFragmentAccess.V0) {
                    JniAdExt.x4(io.KEY_ACL_ENABLED, z);
                    break;
                }
                break;
            case 2:
                if (!settingsFragmentAccess.V0) {
                    io ioVar3 = io.KEY_DISCOVERY_ENABLED;
                    if (z && r3.j(settingsFragmentAccess.G0())) {
                        r3.B(settingsFragmentAccess.H0, false);
                        JniAdExt.x4(ioVar3, false);
                        r3.k(settingsFragmentAccess, settingsFragmentAccess.a0, settingsFragmentAccess.W0, 1);
                    } else {
                        r3.B(settingsFragmentAccess.H0, z);
                        JniAdExt.x4(ioVar3, z);
                    }
                    settingsFragmentAccess.Q0();
                    break;
                }
                break;
            case 3:
                if (!settingsFragmentAccess.V0) {
                    io ioVar4 = io.KEY_DISCOVERY_HIDDEN;
                    if (!z && r3.j(settingsFragmentAccess.G0())) {
                        r3.B(settingsFragmentAccess.J0, true);
                        JniAdExt.x4(ioVar4, true);
                        r3.k(settingsFragmentAccess, settingsFragmentAccess.a0, settingsFragmentAccess.X0, 2);
                    } else {
                        r3.B(settingsFragmentAccess.J0, z);
                        JniAdExt.x4(ioVar4, z);
                    }
                    break;
                }
                break;
            case 4:
                if (!settingsFragmentAccess.V0) {
                    JniAdExt.y4(io.KEY_AUTO_DISCONNECT_MODE, q51.r(z ? 2 : 1));
                    break;
                }
                break;
            case 5:
                if (!settingsFragmentAccess.V0) {
                    JniAdExt.y4(io.KEY_KICKOUT, q51.r(z ? 2 : 1));
                    break;
                }
                break;
            case 6:
                if (!settingsFragmentAccess.V0) {
                    if (!z) {
                        JniAdExt.y4(io.KEY_SETTINGS_PROTECTION, 0);
                    } else {
                        SettingsFragmentAccess.O0(settingsFragmentAccess);
                    }
                    break;
                }
                break;
            case 7:
                if (!settingsFragmentAccess.V0 && z) {
                    JniAdExt.y4(ioVar2, 0);
                    settingsFragmentAccess.j0.setChecked(false);
                    settingsFragmentAccess.l0.setChecked(false);
                    MainApplication.v().o();
                }
                break;
            case 8:
                if (!settingsFragmentAccess.V0 && z) {
                    JniAdExt.y4(ioVar2, 1);
                    settingsFragmentAccess.h0.setChecked(false);
                    settingsFragmentAccess.l0.setChecked(false);
                    MainApplication.v().o();
                }
                break;
            case 9:
                if (!settingsFragmentAccess.V0 && z) {
                    JniAdExt.y4(ioVar2, 2);
                    settingsFragmentAccess.h0.setChecked(false);
                    settingsFragmentAccess.j0.setChecked(false);
                    MainApplication.v().o();
                }
                break;
            case 10:
                if (!settingsFragmentAccess.V0) {
                    JniAdExt.x4(io.KEY_ALLOW_TOKEN, z);
                    break;
                }
                break;
            case 11:
                if (!settingsFragmentAccess.V0) {
                    if (z) {
                        bc bcVar = settingsFragmentAccess.a0;
                        if (bcVar != null) {
                            y21 y21Var = new y21();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("skey_enable_auth", true);
                            bundle.putString("skey_code", "");
                            bundle.putByteArray("skey_2fa_key", JniAdExt.I3());
                            y21Var.N0(bundle);
                            bcVar.p0(y21Var, "TwoFactorAuthSettingsDialog", false);
                        }
                    } else {
                        JniAdExt.n4(null);
                    }
                    settingsFragmentAccess.S0();
                    break;
                }
                break;
            default:
                if (!settingsFragmentAccess.V0) {
                    int iH3 = JniAdExt.h2(ioVar);
                    JniAdExt.y4(ioVar, (z ? new dc1(iH3 | 1) : new dc1(iH3 & (-2))).c);
                    break;
                }
                break;
        }
    }
}
