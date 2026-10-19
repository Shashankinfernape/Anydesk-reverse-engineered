package defpackage;

import android.net.Uri;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class h31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentGeneral d;

    public /* synthetic */ h31(SettingsFragmentGeneral settingsFragmentGeneral, int i) {
        this.c = i;
        this.d = settingsFragmentGeneral;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri uri;
        switch (this.c) {
            case 0:
                t70.U(this.d.a0(), JniAdExt.o1("ad.about.ver.privacy.href"));
                return;
            case 1:
                SettingsFragmentGeneral settingsFragmentGeneral = this.d;
                gi giVar = settingsFragmentGeneral.a0;
                if (giVar == null) {
                    return;
                }
                synchronized (giVar) {
                    uri = (Uri) giVar.b;
                }
                SettingsFragmentGeneral.O0(settingsFragmentGeneral, uri, settingsFragmentGeneral.z0);
                return;
            case 2:
                SettingsFragmentGeneral settingsFragmentGeneral2 = this.d;
                gi giVar2 = settingsFragmentGeneral2.a0;
                if (giVar2 == null) {
                    return;
                }
                SettingsFragmentGeneral.O0(settingsFragmentGeneral2, giVar2.e(), settingsFragmentGeneral2.A0);
                return;
            default:
                SettingsFragmentGeneral settingsFragmentGeneral3 = this.d;
                gi giVar3 = settingsFragmentGeneral3.a0;
                if (giVar3 == null) {
                    return;
                }
                SettingsFragmentGeneral.O0(settingsFragmentGeneral3, giVar3.d(), settingsFragmentGeneral3.B0);
                return;
        }
    }
}
