package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dh implements j6 {
    public final /* synthetic */ int c;
    public t40 d;

    public /* synthetic */ dh(t40 t40Var, int i) {
        this.c = i;
        this.d = t40Var;
    }

    public static gh a(qa qaVar) {
        if (qaVar != null) {
            bf1 bf1VarK = qaVar.K();
            ze1 ze1VarS = qaVar.S();
            um0 um0VarT = qaVar.t();
            ze1VarS.getClass();
            ah ahVar = new ah(bf1VarK, ze1VarS, um0VarT);
            fm fmVarA = nx0.a(gh.class);
            String strU = y90.u(fmVarA);
            if (strU != null) {
                return (gh) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
            }
            id.q("Local and anonymous classes can not be ViewModels");
        }
        return null;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        switch (this.c) {
            case 1:
                Map map = (Map) obj;
                t40 t40Var = this.d;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                p40 p40Var = (p40) t40Var.D.pollFirst();
                if (p40Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = p40Var.c;
                    if (t40Var.c.d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 2:
                i6 i6Var = (i6) obj;
                t40 t40Var2 = this.d;
                p40 p40Var2 = (p40) t40Var2.D.pollLast();
                if (p40Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = p40Var2.c;
                    int i2 = p40Var2.d;
                    c40 c40VarD = t40Var2.c.d(str2);
                    if (c40VarD == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        c40VarD.o0(i2, i6Var.c, i6Var.d);
                    }
                }
                break;
            default:
                i6 i6Var2 = (i6) obj;
                t40 t40Var3 = this.d;
                p40 p40Var3 = (p40) t40Var3.D.pollFirst();
                if (p40Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = p40Var3.c;
                    int i3 = p40Var3.d;
                    c40 c40VarD2 = t40Var3.c.d(str3);
                    if (c40VarD2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        c40VarD2.o0(i3, i6Var2.c, i6Var2.d);
                    }
                }
                break;
        }
    }

    public /* synthetic */ dh() {
        this.c = 0;
    }
}
