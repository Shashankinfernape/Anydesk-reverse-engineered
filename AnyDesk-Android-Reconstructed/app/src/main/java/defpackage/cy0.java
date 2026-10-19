package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class cy0 extends Fragment {
    public static final /* synthetic */ int d = 0;
    public xt0 c;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final by0 Companion = new by0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            by0.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = cy0.d;
            ay0.a(activity, ze0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void a(ze0 ze0Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            ay0.a(activity, ze0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(ze0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(ze0.ON_DESTROY);
        this.c = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(ze0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        xt0 xt0Var = this.c;
        if (xt0Var != null) {
            ((dv0) xt0Var.d).a();
        }
        a(ze0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        xt0 xt0Var = this.c;
        if (xt0Var != null) {
            dv0 dv0Var = (dv0) xt0Var.d;
            int i = dv0Var.c + 1;
            dv0Var.c = i;
            if (i == 1 && dv0Var.f) {
                dv0Var.h.d(ze0.ON_START);
                dv0Var.f = false;
            }
        }
        a(ze0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(ze0.ON_STOP);
    }
}
