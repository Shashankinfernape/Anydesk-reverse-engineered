package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yn(int i, int i2, Object obj, Object obj2) {
        this.c = i2;
        this.d = obj;
        this.e = i;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.f;
        int i2 = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                zn znVar = (zn) obj2;
                Object obj3 = ((v3) obj).a;
                String str = (String) znVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    m6 m6Var = (m6) znVar.e.get(str);
                    if ((m6Var != null ? m6Var.a : null) != null) {
                        j6 j6Var = m6Var.a;
                        if (znVar.d.remove(str)) {
                            j6Var.c(obj3);
                        }
                    } else {
                        znVar.g.remove(str);
                        znVar.f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((zn) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((qt) obj2).b.i(i2, obj);
                break;
        }
    }
}
