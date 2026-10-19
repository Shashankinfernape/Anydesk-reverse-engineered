package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class bq0 {
    public final Bundle a;
    public IconCompat b;
    public final tx0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public bq0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, tx0[] tx0VarArr, boolean z, boolean z2) {
        int i;
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int iIntValue = iconCompat.a;
            if (iIntValue == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
                Object obj = iconCompat.b;
                if (i >= 28) {
                    iIntValue = d6.s(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        iIntValue = -1;
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f = iconCompat.d();
            }
        }
        this.g = dq0.c(charSequence);
        this.h = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = tx0VarArr;
        this.d = z;
        this.e = z2;
    }
}
