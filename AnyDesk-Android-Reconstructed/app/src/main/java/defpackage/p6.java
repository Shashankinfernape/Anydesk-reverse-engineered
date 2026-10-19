package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;
    public final /* synthetic */ hq d;

    public /* synthetic */ p6(zn znVar, String str, hq hqVar, int i) {
        this.a = i;
        this.b = znVar;
        this.c = str;
        this.d = hqVar;
    }

    @Override // defpackage.k6
    public final void a(Object obj) throws Exception {
        int i = this.a;
        hq hqVar = this.d;
        String str = this.c;
        zn znVar = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = znVar.d;
                Object obj2 = znVar.b.get(str);
                if (obj2 == null) {
                    nh0.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", hqVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    znVar.b(iIntValue, hqVar, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = znVar.d;
                Object obj3 = znVar.b.get(str);
                if (obj3 == null) {
                    nh0.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", hqVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    znVar.b(iIntValue2, hqVar, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}
