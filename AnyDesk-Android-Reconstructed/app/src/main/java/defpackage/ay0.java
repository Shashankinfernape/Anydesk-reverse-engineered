package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ay0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, ze0 ze0Var) {
        if0 if0VarR;
        ze0Var.getClass();
        if (!(activity instanceof gf0) || (if0VarR = ((gf0) activity).R()) == null) {
            return;
        }
        if0VarR.d(ze0Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            cy0.a.Companion.getClass();
            by0.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new cy0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
