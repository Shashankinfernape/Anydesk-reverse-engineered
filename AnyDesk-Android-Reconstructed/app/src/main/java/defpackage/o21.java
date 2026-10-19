package defpackage;

import com.anydesk.anydeskandroid.PermissionProfile;

/* JADX INFO: loaded from: classes.dex */
public final class o21 extends q21 {
    public final /* synthetic */ int e;

    @Override // defpackage.q21
    public final boolean a(PermissionProfile permissionProfile) {
        switch (this.e) {
            case 0:
                return permissionProfile != null && permissionProfile.b(this.a);
            default:
                if (permissionProfile != null) {
                    return permissionProfile.m.contains(du0.pf_clipboard) && permissionProfile.b(this.a);
                }
                return false;
        }
    }

    @Override // defpackage.q21
    public final boolean b(PermissionProfile permissionProfile) {
        switch (this.e) {
            case 0:
                if (permissionProfile != null) {
                    return permissionProfile.m.contains(this.a);
                }
                return false;
            default:
                if (permissionProfile == null) {
                    return false;
                }
                if (permissionProfile.m.contains(du0.pf_clipboard)) {
                    return permissionProfile.m.contains(this.a);
                }
                return false;
        }
    }
}
