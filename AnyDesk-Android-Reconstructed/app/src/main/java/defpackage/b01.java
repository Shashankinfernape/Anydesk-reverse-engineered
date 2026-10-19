package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b01 implements e01 {
    public final ui0 a;
    public boolean b;
    public Bundle c;
    public final g81 d;

    public b01(ui0 ui0Var, cf1 cf1Var) {
        ui0Var.getClass();
        this.a = ui0Var;
        this.d = new g81(new y(7, cf1Var));
    }

    @Override // defpackage.e01
    public final Bundle a() {
        Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : ((c01) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((k40) ((yz0) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleG.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleG;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleG = this.a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleG2 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG2.putAll(bundle);
        }
        if (bundleG != null) {
            bundleG2.putAll(bundleG);
        }
        this.c = bundleG2;
        this.b = true;
    }
}
