package defpackage;

import android.app.Dialog;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class g implements r6 {
    public final /* synthetic */ i c;

    public /* synthetic */ g(i iVar) {
        this.c = iVar;
    }

    @Override // defpackage.r6
    public void h(String str) {
        this.c.z0.e(str);
    }

    @Override // defpackage.r6
    public boolean k() {
        i iVar = this.c;
        h hVar = iVar.z0;
        if (hVar.c.isEmpty()) {
            i.S0(iVar);
            return true;
        }
        Roster roster = (Roster) hVar.c.get(0);
        if (roster == null) {
            return true;
        }
        JniAdExt.u4(null);
        JniAdExt.t4(roster.mId);
        Dialog dialog = iVar.k0;
        if (dialog == null) {
            return true;
        }
        dialog.cancel();
        return true;
    }
}
