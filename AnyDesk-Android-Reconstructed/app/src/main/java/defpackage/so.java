package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class so implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ z6 e;

    public /* synthetic */ so(z6 z6Var, Object obj, int i) {
        this.c = i;
        this.e = z6Var;
        this.d = obj;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        switch (this.c) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    lp lpVar = (lp) this.d;
                    synchronized (lpVar) {
                        lpVar.C.i(Boolean.FALSE);
                    }
                    t70.V(new c(13, this));
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num.intValue() < 0) {
                    return;
                }
                if (num.intValue() == 0) {
                    ((cj0) this.d).m(false);
                    return;
                } else {
                    ((MainFragment) this.e).o0.l(num.intValue());
                    return;
                }
        }
    }
}
