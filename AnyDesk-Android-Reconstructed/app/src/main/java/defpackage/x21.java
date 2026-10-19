package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class x21 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ y21 d;

    public /* synthetic */ x21(y21 y21Var, int i) {
        this.c = i;
        this.d = y21Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        y21 y21Var = this.d;
        switch (i2) {
            case 0:
                if (y21Var.y0) {
                    JniAdExt.n4(y21Var.v0);
                }
                SettingsFragmentAccess settingsFragmentAccess = y21Var.q0;
                if (settingsFragmentAccess != null) {
                    t70.Y(new b31(settingsFragmentAccess, 1));
                }
                break;
            default:
                Dialog dialog = y21Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
