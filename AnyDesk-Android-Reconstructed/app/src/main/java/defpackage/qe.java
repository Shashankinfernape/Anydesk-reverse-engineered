package defpackage;

import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.jni.JniAdExt;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qe implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public qe(te teVar, List list, List list2, int i) {
        this.g = teVar;
        this.e = list;
        this.f = list2;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((te) this.g).c.execute(new d3(this, 6, lk0.d(new pe(this))));
                return;
            default:
                z80 z80Var = (z80) JniAdExt.C0.get(Integer.valueOf(this.d));
                if (z80Var == null) {
                    JniAdExt.jniCloseIncomingConnection(this.d);
                    return;
                }
                String[] strArrE = nd0.e(nd0.t((byte[]) this.e));
                Hashtable hashtableF = JniAdExt.f((int[]) this.f);
                z80Var.l = (PermissionProfile) this.g;
                z80Var.m.clear();
                Collections.addAll(z80Var.m, strArrE);
                z80Var.n.clear();
                z80Var.n.putAll(hashtableF);
                if (z80Var.j) {
                    for (String str : strArrE) {
                        if (str.equals("_scam_protection")) {
                            JniAdExt.I0.post(new cb0(this.d, str, 0));
                        }
                    }
                }
                zd zdVar = JniAdExt.A;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            fd0 fd0Var = (fd0) tdVar.next();
                            if (fd0Var != null) {
                                fd0Var.d(this.d);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public qe(int i, byte[] bArr, PermissionProfile permissionProfile, int[] iArr) {
        this.d = i;
        this.e = bArr;
        this.f = iArr;
        this.g = permissionProfile;
    }
}
