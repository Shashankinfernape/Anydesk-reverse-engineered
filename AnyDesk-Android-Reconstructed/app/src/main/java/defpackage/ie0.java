package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ie0 {
    public static final HashMap c = new HashMap();
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public ie0(je0 je0Var, int i) {
        this.a = i;
        this.b = je0Var;
        HashMap map = c;
        map.put(71, 8192);
        map.put(78, 16384);
        map.put(73, 16);
        map.put(75, 32);
        map.put(59, 64);
        map.put(70, 128);
        map.put(72, 131072);
        map.put(76, 262144);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final ArrayList a(int i) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : c.entrySet()) {
            int iIntValue = ((Integer) entry.getValue()).intValue();
            int i2 = this.a;
            boolean z = false;
            je0 je0Var = this.b;
            switch (i2) {
                case 0:
                    if (t70.e(i, iIntValue) && !t70.e(je0Var.f, iIntValue)) {
                        z = true;
                    }
                    break;
                default:
                    if ((i == 0 || t70.e(i, iIntValue)) && t70.e(je0Var.f, iIntValue)) {
                        z = true;
                    }
                    break;
            }
            if (z) {
                arrayList.add((Integer) entry.getKey());
            }
        }
        return arrayList;
    }

    public final void b(int i) {
        int i2 = this.a;
        je0 je0Var = this.b;
        switch (i2) {
            case 0:
                je0Var.f = i | je0Var.f;
                break;
            default:
                je0Var.f = (~i) & je0Var.f;
                break;
        }
    }
}
