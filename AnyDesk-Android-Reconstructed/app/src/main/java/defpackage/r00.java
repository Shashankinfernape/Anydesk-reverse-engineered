package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ s00 d;

    public /* synthetic */ r00(s00 s00Var, int i) {
        this.c = i;
        this.d = s00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        x00 x00Var;
        switch (this.c) {
            case 0:
                s00 s00Var = this.d;
                FileManagerFileListFragment fileManagerFileListFragment = s00Var.q0;
                if (fileManagerFileListFragment != null) {
                    int i2 = s00Var.t0;
                    int i3 = s00Var.s0;
                    if (i2 == 0 || i3 == 0 || (x00Var = fileManagerFileListFragment.b0) == null) {
                        return;
                    }
                    boolean z = fileManagerFileListFragment.c0;
                    synchronized (x00Var.d) {
                        try {
                            if (z) {
                                if (x00Var.U == i2 && x00Var.W == i3) {
                                    return;
                                }
                                x00Var.U = i2;
                                x00Var.W = i3;
                            } else {
                                if (x00Var.V == i2 && x00Var.X == i3) {
                                    return;
                                }
                                x00Var.V = i2;
                                x00Var.X = i3;
                            }
                            t70.c0(x00Var.O, z ? "fm_sort_type_local" : "fm_sort_type_remote", q51.r(i2));
                            t70.c0(x00Var.O, z ? "fm_sort_order_local" : "fm_sort_order_remote", gr0.d(i3));
                            Collections.sort(z ? x00Var.v : x00Var.w, x00Var.l(z));
                            JniAdExt.I0.post(new fb0(2, z));
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            default:
                Dialog dialog = this.d.k0;
                if (dialog != null) {
                    dialog.cancel();
                    return;
                }
                return;
        }
    }
}
