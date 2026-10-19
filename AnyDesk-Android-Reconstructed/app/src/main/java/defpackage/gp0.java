package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(fp0 fp0Var) {
        String strR = bu0.r(fp0Var.getClass());
        if (strR.length() <= 0) {
            id.q("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        fp0 fp0Var2 = (fp0) linkedHashMap.get(strR);
        if (y90.e(fp0Var2, fp0Var)) {
            return;
        }
        if (fp0Var2 != null && fp0Var2.b) {
            nh0.r("Navigator ", fp0Var, " is replacing an already attached ", fp0Var2);
        } else if (fp0Var.b) {
            nh0.t(fp0Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final fp0 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            id.q("navigator name cannot be an empty string");
            return null;
        }
        fp0 fp0Var = (fp0) this.a.get(str);
        if (fp0Var != null) {
            return fp0Var;
        }
        nh0.j(gr0.f("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
