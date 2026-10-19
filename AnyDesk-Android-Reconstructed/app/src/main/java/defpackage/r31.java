package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentVideo;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class r31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentVideo b;

    public /* synthetic */ r31(SettingsFragmentVideo settingsFragmentVideo, int i) {
        this.a = i;
        this.b = settingsFragmentVideo;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        io ioVar = io.KEY_QUALITY;
        io ioVar2 = io.KEY_SHOW_REMOTE_CURSOR_OPTION;
        SettingsFragmentVideo settingsFragmentVideo = this.b;
        switch (i) {
            case 0:
                if (z) {
                    JniAdExt.y4(ioVar, 0);
                    r3.B(settingsFragmentVideo.e0, false);
                    r3.B(settingsFragmentVideo.g0, false);
                }
                break;
            case 1:
                if (z) {
                    JniAdExt.y4(ioVar, 1);
                    r3.B(settingsFragmentVideo.c0, false);
                    r3.B(settingsFragmentVideo.g0, false);
                }
                break;
            case 2:
                if (z) {
                    JniAdExt.y4(ioVar, 2);
                    r3.B(settingsFragmentVideo.c0, false);
                    r3.B(settingsFragmentVideo.e0, false);
                }
                break;
            case 3:
                if (z) {
                    JniAdExt.y4(ioVar2, 0);
                    r3.B(settingsFragmentVideo.o0, false);
                    r3.B(settingsFragmentVideo.q0, false);
                }
                break;
            case 4:
                if (z) {
                    JniAdExt.y4(ioVar2, 1);
                    r3.B(settingsFragmentVideo.m0, false);
                    r3.B(settingsFragmentVideo.q0, false);
                }
                break;
            default:
                if (z) {
                    JniAdExt.y4(ioVar2, 2);
                    r3.B(settingsFragmentVideo.m0, false);
                    r3.B(settingsFragmentVideo.o0, false);
                }
                break;
        }
    }
}
