package defpackage;

import android.widget.CheckBox;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c31 implements j6, ot {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentAccess d;

    public /* synthetic */ c31(SettingsFragmentAccess settingsFragmentAccess, int i) {
        this.c = i;
        this.d = settingsFragmentAccess;
    }

    @Override // defpackage.ot
    public void a(boolean z) {
        if (z) {
            JniAdExt.y4(io.KEY_SETTINGS_PROTECTION, 2);
        }
        SettingsFragmentAccess settingsFragmentAccess = this.d;
        boolean z2 = settingsFragmentAccess.V0;
        settingsFragmentAccess.V0 = true;
        CheckBox checkBox = settingsFragmentAccess.T0;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
        settingsFragmentAccess.V0 = z2;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        int i = this.c;
        SettingsFragmentAccess settingsFragmentAccess = this.d;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map != null) {
                    Collection collectionValues = map.values();
                    CheckBox checkBox = settingsFragmentAccess.H0;
                    if (checkBox != null && r3.b(collectionValues)) {
                        checkBox.setChecked(true);
                        JniAdExt.x4(io.KEY_DISCOVERY_ENABLED, true);
                        break;
                    }
                }
                break;
            default:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    Collection collectionValues2 = map2.values();
                    CheckBox checkBox2 = settingsFragmentAccess.J0;
                    if (checkBox2 != null && r3.b(collectionValues2)) {
                        checkBox2.setChecked(false);
                        JniAdExt.x4(io.KEY_DISCOVERY_HIDDEN, false);
                        break;
                    }
                }
                break;
        }
    }
}
