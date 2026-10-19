package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ f1 d;

    public /* synthetic */ b1(f1 f1Var, int i) {
        this.c = i;
        this.d = f1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        f1 f1Var = this.d;
        switch (i2) {
            case 0:
                AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = f1Var.q0;
                int size = f1Var.y0.size();
                String[] strArr = new String[size];
                for (int i3 = 0; i3 < size; i3++) {
                    strArr[i3] = (String) f1Var.y0.get(i3);
                }
                if (abookRosterItemDetailsFragment != null) {
                    long j = f1Var.w0;
                    if (abookRosterItemDetailsFragment.p0 != null) {
                        long jP2 = JniAdExt.P2();
                        RosterItem rosterItem = abookRosterItemDetailsFragment.p0;
                        if (j != rosterItem.mId) {
                            JniAdExt.b.h("invalid roster item id on updating tags");
                        } else {
                            JniAdExt.I0.post(new s70(rosterItem, strArr, jP2, j));
                        }
                        abookRosterItemDetailsFragment.r0 = strArr;
                        uj.E(abookRosterItemDetailsFragment);
                        break;
                    }
                }
                break;
            default:
                Dialog dialog = f1Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
