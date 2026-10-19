package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class zy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ az d;

    public /* synthetic */ zy(az azVar, int i) {
        this.c = i;
        this.d = azVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        az azVar = this.d;
        switch (i2) {
            case 0:
                Dialog dialog = azVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
            case 1:
                JniAdExt.I0.post(new jb0(azVar.q0, 3, 2, azVar.u0));
                break;
            default:
                JniAdExt.I0.post(new jb0(azVar.q0, 2, 2, azVar.u0));
                break;
        }
    }
}
