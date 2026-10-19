package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.Button;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class hz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ iz d;

    public /* synthetic */ hz(iz izVar, int i) {
        this.c = i;
        this.d = izVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        iz izVar = this.d;
        switch (i2) {
            case 0:
                FileManagerFileListFragment fileManagerFileListFragment = izVar.r0;
                Button button = izVar.L0;
                if (fileManagerFileListFragment != null && button != null && button.isEnabled()) {
                    boolean z = izVar.s0;
                    String str = izVar.x0;
                    boolean z2 = fileManagerFileListFragment.c0;
                    if (z2 == z) {
                        fileManagerFileListFragment.T0(z2, str, false);
                    }
                    break;
                }
                break;
            default:
                Dialog dialog = izVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
