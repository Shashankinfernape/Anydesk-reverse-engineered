package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.cf0;
import defpackage.cv0;
import defpackage.df0;
import defpackage.dv0;
import defpackage.h90;
import defpackage.mx;
import defpackage.nh0;
import defpackage.y6;
import defpackage.ze0;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements h90 {
    @Override // defpackage.h90
    public final List a() {
        return mx.c;
    }

    @Override // defpackage.h90
    public final Object b(Context context) {
        context.getClass();
        y6 y6VarW = y6.w(context);
        y6VarW.getClass();
        if (!((HashSet) y6VarW.e).contains(ProcessLifecycleInitializer.class)) {
            nh0.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!df0.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new cf0());
        }
        dv0 dv0Var = dv0.k;
        dv0Var.getClass();
        dv0Var.g = new Handler();
        dv0Var.h.d(ze0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new cv0(dv0Var));
        return dv0Var;
    }
}
