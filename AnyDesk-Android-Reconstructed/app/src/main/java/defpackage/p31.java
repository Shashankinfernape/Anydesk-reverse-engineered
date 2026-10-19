package defpackage;

import android.widget.CheckBox;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentRecording;
import com.anydesk.jni.JniAdExt;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p31 implements j6 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentRecording d;

    public /* synthetic */ p31(SettingsFragmentRecording settingsFragmentRecording, int i) {
        this.c = i;
        this.d = settingsFragmentRecording;
    }

    @Override // defpackage.j6
    public final void c(Object obj) {
        int i = this.c;
        SettingsFragmentRecording settingsFragmentRecording = this.d;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map != null) {
                    Collection collectionValues = map.values();
                    CheckBox checkBox = settingsFragmentRecording.c0;
                    if (checkBox != null && r3.b(collectionValues)) {
                        checkBox.setChecked(true);
                        JniAdExt.y4(io.KEY_RECORD_INCOMING, 1);
                        MainApplication.q(settingsFragmentRecording.a0());
                        JniAdExt.M4();
                        break;
                    }
                }
                break;
            default:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    Collection collectionValues2 = map2.values();
                    CheckBox checkBox2 = settingsFragmentRecording.g0;
                    if (checkBox2 != null && r3.b(collectionValues2)) {
                        checkBox2.setChecked(true);
                        JniAdExt.y4(io.KEY_RECORD_OUTGOING, 1);
                        MainApplication.q(settingsFragmentRecording.a0());
                        JniAdExt.M4();
                        break;
                    }
                }
                break;
        }
    }
}
