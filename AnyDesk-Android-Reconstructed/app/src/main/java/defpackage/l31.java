package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentIdentity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class l31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentIdentity b;

    public /* synthetic */ l31(SettingsFragmentIdentity settingsFragmentIdentity, int i) {
        this.a = i;
        this.b = settingsFragmentIdentity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        SettingsFragmentIdentity settingsFragmentIdentity = this.b;
        io ioVar = io.KEY_BKGND_SHOW;
        switch (i) {
            case 0:
                if (z) {
                    JniAdExt.y4(ioVar, 1);
                    r3.B(settingsFragmentIdentity.k0, false);
                }
                break;
            default:
                if (z) {
                    JniAdExt.y4(ioVar, 2);
                    r3.B(settingsFragmentIdentity.i0, false);
                }
                break;
        }
    }
}
