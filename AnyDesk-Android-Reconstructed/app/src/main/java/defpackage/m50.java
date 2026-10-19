package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m50 implements q70, g01, cf1 {
    public final c40 c;
    public final bf1 d;
    public final l e;
    public if0 f = null;
    public ui0 g = null;

    public m50(c40 c40Var, bf1 bf1Var, l lVar) {
        this.c = c40Var;
        this.d = bf1Var;
        this.e = lVar;
    }

    @Override // defpackage.cf1
    public final bf1 K() {
        c();
        return this.d;
    }

    @Override // defpackage.gf0
    public final if0 R() {
        c();
        return this.f;
    }

    public final void a(ze0 ze0Var) {
        this.f.d(ze0Var);
    }

    @Override // defpackage.g01
    public final ui0 b() {
        c();
        return (ui0) this.g.d;
    }

    public final void c() {
        if (this.f == null) {
            this.f = new if0(this);
            f01 f01Var = new f01(this, new y(8, this));
            this.g = new ui0(f01Var, 8);
            f01Var.a();
            this.e.run();
        }
    }

    @Override // defpackage.q70
    public final um0 t() {
        Application application;
        c40 c40Var = this.c;
        Context applicationContext = c40Var.I0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        um0 um0Var = new um0(0);
        LinkedHashMap linkedHashMap = um0Var.a;
        if (application != null) {
            linkedHashMap.put(ye1.e, application);
        }
        linkedHashMap.put(lk0.h, c40Var);
        linkedHashMap.put(lk0.i, this);
        Bundle bundle = c40Var.h;
        if (bundle != null) {
            linkedHashMap.put(lk0.j, bundle);
        }
        return um0Var;
    }
}
