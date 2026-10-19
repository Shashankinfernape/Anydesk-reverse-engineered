package defpackage;

import com.anydesk.anydeskandroid.PermissionProfile;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i21 implements r6 {
    public final /* synthetic */ j21 c;

    @Override // defpackage.r6
    public void h(String str) {
        this.c.z0.e(str);
    }

    @Override // defpackage.r6
    public boolean k() {
        j21 j21Var = this.c;
        ArrayList arrayList = j21Var.z0.c;
        if (arrayList.isEmpty()) {
            j21.T0(j21Var);
            return true;
        }
        PermissionProfile permissionProfile = (PermissionProfile) arrayList.get(0);
        if (permissionProfile == null) {
            return true;
        }
        j21.S0(j21Var, permissionProfile);
        return true;
    }
}
