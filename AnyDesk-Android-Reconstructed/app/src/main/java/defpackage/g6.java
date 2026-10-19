package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements Application.ActivityLifecycleCallbacks {
    public Object c;
    public Activity d;
    public final int e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public g6(Activity activity) {
        this.d = activity;
        this.e = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.d == activity) {
            this.d = null;
            this.g = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.g || this.h || this.f) {
            return;
        }
        Object obj = this.c;
        try {
            Object obj2 = h6.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.e) {
                h6.g.postAtFrontOfQueue(new d3(h6.b.get(activity), obj2, 5, false));
                this.h = true;
                this.c = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.d == activity) {
            this.f = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
