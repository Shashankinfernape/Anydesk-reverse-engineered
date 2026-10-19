package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class j31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentGeneral b;

    public /* synthetic */ j31(SettingsFragmentGeneral settingsFragmentGeneral, int i) {
        this.a = i;
        this.b = settingsFragmentGeneral;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        SettingsFragmentGeneral settingsFragmentGeneral = this.b;
        switch (i) {
            case 0:
                JniAdExt.y4(io.KEY_UI_NOTIFICATION_SOUND_INCOMING_CONN_REQUEST, z ? 1 : 0);
                r3.C(settingsFragmentGeneral.f0, z);
                r3.C(settingsFragmentGeneral.g0, z);
                settingsFragmentGeneral.S0();
                break;
            case 1:
                JniAdExt.y4(io.KEY_UI_NOTIFICATION_SOUND_SESS_CREATE, z ? 1 : 0);
                r3.C(settingsFragmentGeneral.j0, z);
                r3.C(settingsFragmentGeneral.k0, z);
                settingsFragmentGeneral.S0();
                break;
            default:
                JniAdExt.y4(io.KEY_UI_NOTIFICATION_SOUND_SESS_CLOSE, z ? 1 : 0);
                r3.C(settingsFragmentGeneral.n0, z);
                r3.C(settingsFragmentGeneral.o0, z);
                break;
        }
    }
}
