package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class en0 {
    public final xb a;

    public en0(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(en0.class.getClassLoader());
        bundle.getClass();
        xb xbVar = new xb();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            bu0.u("nav-entry-state:id");
            throw null;
        }
        xbVar.d = string;
        xbVar.c = lk0.s("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            bu0.u("nav-entry-state:args");
            throw null;
        }
        xbVar.e = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 == null) {
            bu0.u("nav-entry-state:saved-state");
            throw null;
        }
        xbVar.f = bundle3;
        this.a = xbVar;
    }

    public en0(an0 an0Var) {
        int i = an0Var.d.d.a;
        xb xbVar = new xb();
        xbVar.d = an0Var.h;
        xbVar.c = i;
        dn0 dn0Var = an0Var.j;
        xbVar.e = dn0Var.b();
        Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        xbVar.f = bundleG;
        ((ui0) dn0Var.k).q(bundleG);
        this.a = xbVar;
    }
}
