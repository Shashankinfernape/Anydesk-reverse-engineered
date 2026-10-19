package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public final g01 a;
    public final y b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final us0 c = new us0(16);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public f01(g01 g01Var, y yVar) {
        this.a = g01Var;
        this.b = yVar;
    }

    public final void a() {
        g01 g01Var = this.a;
        if (g01Var.R().d != af0.d) {
            nh0.j("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                nh0.j("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            g01Var.R().a(new x40(2, this));
            this.e = true;
        }
    }
}
