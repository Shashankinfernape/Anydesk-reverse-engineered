package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;

/* JADX INFO: loaded from: classes.dex */
public final class i31 implements j6 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentGeneral d;

    public /* synthetic */ i31(SettingsFragmentGeneral settingsFragmentGeneral, int i) {
        this.c = i;
        this.d = settingsFragmentGeneral;
    }

    @Override // defpackage.j6
    public final void c(Object obj) {
        int i = this.c;
        SettingsFragmentGeneral settingsFragmentGeneral = this.d;
        switch (i) {
            case 0:
                i6 i6Var = (i6) obj;
                if (i6Var != null) {
                    SettingsFragmentGeneral.P0(settingsFragmentGeneral, settingsFragmentGeneral.f0, i6Var.c, i6Var.d);
                    break;
                }
                break;
            case 1:
                i6 i6Var2 = (i6) obj;
                if (i6Var2 != null) {
                    SettingsFragmentGeneral.P0(settingsFragmentGeneral, settingsFragmentGeneral.j0, i6Var2.c, i6Var2.d);
                    break;
                }
                break;
            default:
                i6 i6Var3 = (i6) obj;
                if (i6Var3 != null) {
                    SettingsFragmentGeneral.P0(settingsFragmentGeneral, settingsFragmentGeneral.n0, i6Var3.c, i6Var3.d);
                    break;
                }
                break;
        }
    }
}
