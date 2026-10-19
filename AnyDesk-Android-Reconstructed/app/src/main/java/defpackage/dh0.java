package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class dh0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ih0 d;

    public /* synthetic */ dh0(ih0 ih0Var, int i) {
        this.c = i;
        this.d = ih0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        io ioVar = io.KEY_UI_ENABLE_DIALOG_LOCAL_SCAM_WARNING;
        ih0 ih0Var = this.d;
        switch (i2) {
            case 0:
                MainApplication mainApplicationV = MainApplication.v();
                View view = ih0Var.w0;
                CheckBox checkBox = (CheckBox) (view != null ? view.findViewById(R.id.local_scam_warning_dialog_disable_checkbox) : null);
                boolean zIsChecked = checkBox != null ? checkBox.isChecked() : 0;
                mainApplicationV.getClass();
                JniAdExt.y4(ioVar, !zIsChecked);
                break;
            default:
                MainApplication mainApplicationV2 = MainApplication.v();
                View view2 = ih0Var.w0;
                CheckBox checkBox2 = (CheckBox) (view2 != null ? view2.findViewById(R.id.local_scam_warning_dialog_disable_checkbox) : null);
                boolean zIsChecked2 = checkBox2 != null ? checkBox2.isChecked() : 0;
                mainApplicationV2.getClass();
                JniAdExt.y4(ioVar, !zIsChecked2);
                Dialog dialog = ih0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                t70.U(ih0Var.Y(), JniAdExt.o1("ad.accept.warn.link.href"));
                break;
        }
    }
}
