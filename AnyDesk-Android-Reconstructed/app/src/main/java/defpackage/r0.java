package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbookRosterItemDetailsFragment d;

    public /* synthetic */ r0(AbookRosterItemDetailsFragment abookRosterItemDetailsFragment, int i) {
        this.c = i;
        this.d = abookRosterItemDetailsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bc bcVar;
        int i = this.c;
        AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = this.d;
        switch (i) {
            case 0:
                RosterItem rosterItem = abookRosterItemDetailsFragment.p0;
                if (rosterItem != null) {
                    t70.e0(abookRosterItemDetailsFragment.Y(), rosterItem.getDisplayName(), rosterItem.getAddr(), false);
                    break;
                }
                break;
            case 1:
                RosterItem rosterItem2 = abookRosterItemDetailsFragment.p0;
                if (rosterItem2 != null && (bcVar = abookRosterItemDetailsFragment.a0) != null) {
                    bcVar.k0(rosterItem2);
                }
                break;
            default:
                RosterItem rosterItemQ2 = JniAdExt.Q2();
                if (rosterItemQ2 != null) {
                    AbookRosterItemDetailsFragment.O0(abookRosterItemDetailsFragment, rosterItemQ2.getAddr());
                }
                break;
        }
    }
}
