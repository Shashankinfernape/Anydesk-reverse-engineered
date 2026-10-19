package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentConnection;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class f31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentConnection b;

    public /* synthetic */ f31(SettingsFragmentConnection settingsFragmentConnection, int i) {
        this.a = i;
        this.b = settingsFragmentConnection;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        io ioVar = io.KEY_PROXY_MODE;
        SettingsFragmentConnection settingsFragmentConnection = this.b;
        switch (i) {
            case 0:
                if (!settingsFragmentConnection.C0) {
                    io ioVar2 = io.KEY_ALLOW_DIRECT;
                    if (z && r3.j(settingsFragmentConnection.G0())) {
                        r3.B(settingsFragmentConnection.f0, false);
                        JniAdExt.x4(ioVar2, false);
                        r3.k(settingsFragmentConnection, settingsFragmentConnection.B0, settingsFragmentConnection.D0, 1);
                    } else {
                        r3.B(settingsFragmentConnection.f0, z);
                        JniAdExt.x4(ioVar2, z);
                    }
                    break;
                }
                break;
            case 1:
                if (z) {
                    r3.B(settingsFragmentConnection.k0, false);
                    r3.B(settingsFragmentConnection.m0, false);
                    if (!settingsFragmentConnection.C0 && JniAdExt.h2(ioVar) != 0) {
                        JniAdExt.y4(ioVar, 0);
                        JniAdExt.Q3();
                        break;
                    }
                }
                break;
            case 2:
                if (z) {
                    r3.B(settingsFragmentConnection.i0, false);
                    r3.B(settingsFragmentConnection.m0, false);
                    if (!settingsFragmentConnection.C0 && JniAdExt.h2(ioVar) != 1) {
                        JniAdExt.y4(ioVar, 1);
                        JniAdExt.Q3();
                        break;
                    }
                }
                break;
            case 3:
                if (z) {
                    r3.B(settingsFragmentConnection.i0, false);
                    r3.B(settingsFragmentConnection.k0, false);
                    if (!settingsFragmentConnection.C0 && JniAdExt.h2(ioVar) != 2) {
                        JniAdExt.y4(ioVar, 2);
                        JniAdExt.Q3();
                        break;
                    }
                }
                break;
            default:
                if (!settingsFragmentConnection.C0) {
                    io ioVar3 = io.KEY_PROXY_AUTH;
                    if (JniAdExt.g2(ioVar3) != z) {
                        JniAdExt.x4(ioVar3, z);
                        JniAdExt.Q3();
                    }
                }
                break;
        }
    }
}
