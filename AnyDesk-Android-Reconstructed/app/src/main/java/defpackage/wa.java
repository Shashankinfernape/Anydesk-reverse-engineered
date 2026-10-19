package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ wa(Context context, int i) {
        this.c = i;
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        kh0 kh0Var;
        Object systemService;
        Context context;
        int i = this.c;
        Context context2 = this.d;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            zd zdVar = bb.i;
                            zdVar.getClass();
                            td tdVar = new td(zdVar);
                            while (true) {
                                if (tdVar.hasNext()) {
                                    bb bbVar = (bb) ((WeakReference) tdVar.next()).get();
                                    if (bbVar != null && (context = ((qb) bbVar).m) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                kh0Var = new kh0(new oh0(ya.a(systemService)));
                            } else {
                                kh0Var = kh0.b;
                            }
                        } else {
                            kh0Var = bb.e;
                            if (kh0Var == null) {
                                kh0Var = kh0.b;
                            }
                        }
                        if (kh0Var.a.isEmpty()) {
                            String strX = bu0.x(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                ya.b(systemService2, xa.a(strX));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                bb.h = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new wa(context2, 2));
                break;
            default:
                uj.L(context2, new fv0(), uj.d, false);
                break;
        }
    }
}
