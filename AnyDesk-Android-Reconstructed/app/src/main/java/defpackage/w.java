package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.jni.JniAdExt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ u1 d;

    public /* synthetic */ w(u1 u1Var, int i) {
        this.c = i;
        this.d = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object value;
        v1 v1Var;
        RosterItem rosterItemQ2;
        v1 v1Var2;
        v1 v1VarA;
        v1 v1Var3;
        v1 v1VarA2;
        int i = this.c;
        u1 u1Var = this.d;
        switch (i) {
            case 0:
                e71 e71Var = u1Var.d;
                do {
                    value = e71Var.getValue();
                    v1Var = (v1) value;
                    rosterItemQ2 = JniAdExt.Q2();
                } while (!e71Var.g(value, v1.a(v1Var, null, false, null, null, rosterItemQ2 != null ? Long.valueOf(rosterItemQ2.mId) : null, false, false, false, null, null, 1007)));
                break;
            case 1:
                e71 e71Var2 = u1Var.d;
                do {
                    v1Var2 = (v1) e71Var2.getValue();
                    long jP2 = JniAdExt.P2();
                    Long lValueOf = jP2 != 0 ? Long.valueOf(jP2) : null;
                    boolean zE = y90.e(lValueOf, v1Var2.a);
                    v1VarA = v1.a(v1Var2, lValueOf, v1Var2.b || !zE, null, !zE ? px.c : v1Var2.d, null, false, false, false, null, null, 1012);
                } while (!e71Var2.g(v1Var2, v1VarA));
                if (y90.e(v1VarA.a, v1Var2.a) && v1VarA.i == null) {
                    u1Var.e(false);
                } else {
                    u1Var.e(true);
                }
                break;
            case 2:
                u1Var.e(false);
                break;
            case 3:
                u1Var.e(false);
                break;
            case 4:
                u1Var.e(false);
                break;
            case 5:
                u1Var.e(false);
                break;
            default:
                e71 e71Var3 = u1Var.d;
                do {
                    v1Var3 = (v1) e71Var3.getValue();
                    Set set = v1Var3.d;
                    List listV = ae.V(JniAdExt.N2());
                    set.getClass();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                    linkedHashSet.retainAll(listV);
                    v1VarA2 = v1.a(v1Var3, null, false, null, linkedHashSet, null, false, false, false, null, null, 1015);
                } while (!e71Var3.g(v1Var3, v1VarA2));
                if (v1VarA2.d.size() != v1Var3.d.size()) {
                    u1Var.e(true);
                }
                break;
        }
    }
}
