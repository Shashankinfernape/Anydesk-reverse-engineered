package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentRecording;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class q31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentRecording b;

    public /* synthetic */ q31(SettingsFragmentRecording settingsFragmentRecording, int i) {
        this.a = i;
        this.b = settingsFragmentRecording;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        SettingsFragmentRecording settingsFragmentRecording = this.b;
        switch (i) {
            case 0:
                io ioVar = io.KEY_RECORD_INCOMING;
                JniAdExt.y4(ioVar, 0);
                if (z) {
                    r3.B(settingsFragmentRecording.c0, false);
                    if (er0.f() || r3.o(settingsFragmentRecording, settingsFragmentRecording.j0, settingsFragmentRecording.Z)) {
                        MainApplication.q(settingsFragmentRecording.a0());
                        r3.B(settingsFragmentRecording.c0, true);
                        JniAdExt.y4(ioVar, 1);
                    }
                }
                break;
            default:
                io ioVar2 = io.KEY_RECORD_OUTGOING;
                JniAdExt.y4(ioVar2, 0);
                if (z) {
                    r3.B(settingsFragmentRecording.g0, false);
                    if (er0.f() || r3.o(settingsFragmentRecording, settingsFragmentRecording.k0, settingsFragmentRecording.Z)) {
                        MainApplication.q(settingsFragmentRecording.a0());
                        r3.B(settingsFragmentRecording.g0, true);
                        JniAdExt.y4(ioVar2, 1);
                    }
                }
                break;
        }
    }
}
