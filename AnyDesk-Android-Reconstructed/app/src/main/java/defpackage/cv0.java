package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class cv0 extends jx {
    final /* synthetic */ dv0 this$0;

    public static final class a extends jx {
        final /* synthetic */ dv0 this$0;

        public a(dv0 dv0Var) {
            this.this$0 = dv0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            dv0 dv0Var = this.this$0;
            int i = dv0Var.c + 1;
            dv0Var.c = i;
            if (i == 1 && dv0Var.f) {
                dv0Var.h.d(ze0.ON_START);
                dv0Var.f = false;
            }
        }
    }

    public cv0(dv0 dv0Var) {
        this.this$0 = dv0Var;
    }

    @Override // defpackage.jx, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = cy0.d;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((cy0) fragmentFindFragmentByTag).c = this.this$0.j;
        }
    }

    @Override // defpackage.jx, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        dv0 dv0Var = this.this$0;
        int i = dv0Var.d - 1;
        dv0Var.d = i;
        if (i == 0) {
            Handler handler = dv0Var.g;
            handler.getClass();
            handler.postDelayed(dv0Var.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ld.k(activity, new a(this.this$0));
    }

    @Override // defpackage.jx, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        dv0 dv0Var = this.this$0;
        int i = dv0Var.c - 1;
        dv0Var.c = i;
        if (i == 0 && dv0Var.e) {
            dv0Var.h.d(ze0.ON_STOP);
            dv0Var.f = true;
        }
    }
}
