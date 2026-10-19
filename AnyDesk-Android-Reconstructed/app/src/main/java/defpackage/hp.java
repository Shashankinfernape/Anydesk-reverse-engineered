package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVpn;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class hp implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public hp(ConnectionSettingsFragmentVpn connectionSettingsFragmentVpn, long j, long j2) {
        this.f = connectionSettingsFragmentVpn;
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((ConnectionSettingsFragmentVpn) obj).P0(this.d, this.e);
                break;
            default:
                RosterItem rosterItem = (RosterItem) obj;
                JniAdExt.jniUpdateRosterItem(this.d, this.e, rosterItem.mCid, nd0.T(rosterItem.mHostname), nd0.T(rosterItem.mAlias), nd0.T(rosterItem.mUserDefinedName), nd0.T(rosterItem.a));
                break;
        }
    }

    public hp(long j, long j2, RosterItem rosterItem) {
        this.d = j;
        this.e = j2;
        this.f = rosterItem;
    }
}
