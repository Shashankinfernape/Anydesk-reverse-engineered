package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x81 implements Iterable {
    public final ArrayList c = new ArrayList();
    public final Context d;

    public x81(Context context) {
        this.d = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.d;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        try {
            for (Intent intentZ = y90.z(context, componentName); intentZ != null; intentZ = y90.z(context, intentZ.getComponent())) {
                arrayList.add(size, intentZ);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            nh0.j("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.d.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.c.iterator();
    }
}
