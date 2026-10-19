package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class bz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ cz d;

    public /* synthetic */ bz(cz czVar, int i) {
        this.c = i;
        this.d = czVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        cz czVar = this.d;
        switch (i2) {
            case 0:
                Dialog dialog = czVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
            case 1:
                JniAdExt.I0.post(new hc0(czVar.q0, czVar.r0, 3, czVar.w0));
                break;
            default:
                JniAdExt.I0.post(new hc0(czVar.q0, czVar.r0, 2, czVar.w0));
                break;
        }
    }
}
