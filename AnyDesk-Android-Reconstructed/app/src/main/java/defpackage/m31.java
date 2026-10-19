package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentInput;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class m31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentInput b;

    public /* synthetic */ m31(SettingsFragmentInput settingsFragmentInput, int i) {
        this.a = i;
        this.b = settingsFragmentInput;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        SettingsFragmentInput settingsFragmentInput = this.b;
        io ioVar = io.KEY_TOUCH_MODE;
        switch (i) {
            case 0:
                if (z) {
                    JniAdExt.y4(ioVar, 1);
                    r3.B(settingsFragmentInput.f0, false);
                }
                break;
            default:
                if (z) {
                    JniAdExt.y4(ioVar, 2);
                    r3.B(settingsFragmentInput.d0, false);
                }
                break;
        }
    }
}
