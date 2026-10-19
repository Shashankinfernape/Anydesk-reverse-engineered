package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Looper;
import android.widget.CheckBox;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class pc1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ qc1 d;

    public /* synthetic */ pc1(qc1 qc1Var, int i) {
        this.c = i;
        this.d = qc1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        qc1 qc1Var = this.d;
        switch (i2) {
            case 0:
                Dialog dialog = qc1Var.k0;
                if (dialog != null) {
                    CheckBox checkBox = (CheckBox) dialog.findViewById(R.id.unattended_access_info_dialog_disable_checkbox);
                    MainApplication mainApplicationV = MainApplication.v();
                    boolean zIsChecked = checkBox.isChecked();
                    mainApplicationV.getClass();
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_UNATTENDED_ACCESS_INFO, !zIsChecked ? 1 : 0);
                }
                break;
            default:
                qa qaVarG0 = qc1Var.G0();
                Looper looper = t70.a;
                if (!t70.S(qaVarG0, "android.settings.action.MANAGE_OVERLAY_PERMISSION", "android.settings.action.MANAGE_OVERLAY_PERMISSION", qaVarG0.getPackageName(), null)) {
                    bc bcVar = qc1Var.w0;
                    if (bcVar == null) {
                        t70.g0(qc1Var.G0().getApplicationContext(), JniAdExt.n1("ad.msg.overlay_failed.android"), 1);
                    } else {
                        bcVar.q0(13, JniAdExt.n1("ad.dlg.overlay.title"), JniAdExt.n1("ad.dlg.overlay_failed.msg"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
                    }
                }
                break;
        }
    }
}
