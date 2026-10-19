package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbookRosterItemDetailsFragment d;

    public /* synthetic */ q0(AbookRosterItemDetailsFragment abookRosterItemDetailsFragment, int i) {
        this.c = i;
        this.d = abookRosterItemDetailsFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.c;
        AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = this.d;
        switch (i) {
            case 0:
                abookRosterItemDetailsFragment.P0();
                break;
            case 1:
                RosterItem rosterItem = abookRosterItemDetailsFragment.p0;
                if (rosterItem != null && ((str = abookRosterItemDetailsFragment.q0) != null || abookRosterItemDetailsFragment.r0 != null)) {
                    JniAdExt.u4(rosterItem.a((String) Objects.requireNonNullElse(str, rosterItem.mUserDefinedName), rosterItem.mThumbnailPath, (String[]) Objects.requireNonNullElse(abookRosterItemDetailsFragment.r0, abookRosterItemDetailsFragment.p0.b), rosterItem.mOnlineState));
                }
                abookRosterItemDetailsFragment.q0 = null;
                abookRosterItemDetailsFragment.r0 = null;
                break;
            case 2:
                abookRosterItemDetailsFragment.q0 = null;
                abookRosterItemDetailsFragment.r0 = null;
                abookRosterItemDetailsFragment.P0();
                break;
            case 3:
                abookRosterItemDetailsFragment.q0 = null;
                abookRosterItemDetailsFragment.r0 = null;
                abookRosterItemDetailsFragment.P0();
                break;
            default:
                abookRosterItemDetailsFragment.q0 = null;
                abookRosterItemDetailsFragment.r0 = null;
                abookRosterItemDetailsFragment.P0();
                break;
        }
    }
}
