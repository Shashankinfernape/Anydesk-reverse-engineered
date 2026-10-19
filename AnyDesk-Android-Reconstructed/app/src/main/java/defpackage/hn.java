package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn implements d60 {
    public final /* synthetic */ int c;

    public /* synthetic */ hn(int i) {
        this.c = i;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        in inVar;
        switch (this.c) {
            case 0:
                String str = (String) obj;
                zq zqVar = (zq) obj2;
                str.getClass();
                zqVar.getClass();
                if (str.length() == 0) {
                    return zqVar.toString();
                }
                return str + ", " + zqVar;
            case 1:
                br brVar = (br) obj;
                zq zqVar2 = (zq) obj2;
                brVar.getClass();
                zqVar2.getClass();
                br brVarQ = brVar.q(zqVar2.getKey());
                kx kxVar = kx.c;
                if (brVarQ == kxVar) {
                    return zqVar2;
                }
                fw fwVar = fw.d;
                dr drVar = (dr) brVarQ.l(fwVar);
                if (drVar == null) {
                    inVar = new in(brVarQ, zqVar2);
                } else {
                    br brVarQ2 = brVarQ.q(fwVar);
                    if (brVarQ2 == kxVar) {
                        return new in(zqVar2, drVar);
                    }
                    inVar = new in(new in(brVarQ2, zqVar2), drVar);
                }
                return inVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return ((br) obj).j((zq) obj2);
            case 4:
                return ((br) obj).j((zq) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return obj;
            case 7:
                if (obj == null) {
                    return null;
                }
                id.c();
                return null;
            default:
                return (z91) obj;
        }
    }
}
