package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class oa implements e01 {
    public final /* synthetic */ int a;
    public final Object b;

    public oa(ui0 ui0Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        ui0Var.s("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.e01
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((qa) obj).W().getClass();
                return bundle;
            default:
                Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                ec1.E(bundleG, "classes_to_restore", tm.w0((LinkedHashSet) obj));
                return bundleG;
        }
    }

    public oa(qa qaVar) {
        this.a = 0;
        this.b = qaVar;
    }
}
