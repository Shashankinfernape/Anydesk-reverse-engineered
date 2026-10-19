package defpackage;

import com.anydesk.anydeskandroid.PermissionProfile;

/* JADX INFO: loaded from: classes.dex */
public final class p21 extends q21 {
    public final /* synthetic */ r21 e;

    public p21(r21 r21Var) {
        this.e = r21Var;
    }

    @Override // defpackage.q21
    public final boolean a(PermissionProfile permissionProfile) {
        if (!c(permissionProfile)) {
            return false;
        }
        synchronized (this.e.L0) {
            try {
                zd zdVar = this.e.L0;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    du0 du0Var = (du0) tdVar.next();
                    if (!PermissionProfile.d(du0Var) && !permissionProfile.b(du0Var)) {
                        return false;
                    }
                }
                return permissionProfile.b(this.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q21
    public final boolean b(PermissionProfile permissionProfile) {
        if (c(permissionProfile)) {
            return permissionProfile.m.contains(this.a);
        }
        return false;
    }

    public final boolean c(PermissionProfile permissionProfile) {
        if (permissionProfile == null) {
            return false;
        }
        synchronized (this.e.L0) {
            try {
                zd zdVar = this.e.L0;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    du0 du0Var = (du0) tdVar.next();
                    if (!PermissionProfile.d(du0Var) && !permissionProfile.m.contains(du0Var)) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
