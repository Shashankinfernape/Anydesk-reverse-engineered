package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aq0 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public final boolean d;
    public final Bundle e;
    public ArrayList f;
    public final boolean g;

    public aq0(IconCompat iconCompat, String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.d = true;
        this.g = true;
        this.a = iconCompat;
        this.b = dq0.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = true;
    }

    public final bq0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                tx0 tx0Var = (tx0) obj;
                tx0Var.getClass();
                arrayList2.add(tx0Var);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new bq0(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (tx0[]) arrayList2.toArray(new tx0[arrayList2.size()]), this.d, this.g);
    }
}
