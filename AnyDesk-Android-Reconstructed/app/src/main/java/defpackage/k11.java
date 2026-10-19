package defpackage;

import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class k11 extends j11 {
    public final hf f;

    public k11() {
        hf hfVar;
        super(10704L, "com.anydesk.adcontrol.ad1", null, null, true);
        synchronized (jf.class) {
            try {
                if (jf.c == null) {
                    hf hfVar2 = new hf();
                    hfVar2.a = -1;
                    jf.c = hfVar2;
                }
                hfVar = jf.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = hfVar;
    }

    @Override // defpackage.j11
    public final boolean b(Signature signature) {
        String strG = d51.g(signature);
        if (strG != null) {
            hf hfVar = this.f;
            hfVar.getClass();
            if ("B186778D6198BFE42E744A385719751725754318BD4C1E49CCBC14D541D9271E".equals(strG)) {
                return true;
            }
            String[] strArr = jf.a;
            if (hfVar.a < 0) {
                synchronized (hfVar) {
                    try {
                        if (hfVar.a < 0) {
                            hfVar.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (int i = hfVar.a; i < 10; i++) {
                String str = strArr[i];
                if (str != null && str.equals(strG)) {
                    hfVar.c(i);
                    return true;
                }
            }
        }
        return false;
    }
}
