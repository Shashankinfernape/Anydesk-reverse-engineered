package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb {
    public static final za c = new za(new ab());
    public static final int d = -100;
    public static kh0 e = null;
    public static kh0 f = null;
    public static Boolean g = null;
    public static boolean h = false;
    public static final zd i = new zd(0);
    public static final Object j = new Object();
    public static final Object k = new Object();

    public static boolean c(Context context) {
        if (g == null) {
            try {
                int i2 = kd.c;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) kd.class), Build.VERSION.SDK_INT >= 24 ? jd.a() | 128 : 640).metaData;
                if (bundle != null) {
                    g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                g = Boolean.FALSE;
            }
        }
        return g.booleanValue();
    }

    public static void g(qb qbVar) {
        synchronized (j) {
            try {
                zd zdVar = i;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    bb bbVar = (bb) ((WeakReference) tdVar.next()).get();
                    if (bbVar == qbVar || bbVar == null) {
                        tdVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
