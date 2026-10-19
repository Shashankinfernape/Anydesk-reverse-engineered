package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class u30 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ v30 d;

    public /* synthetic */ u30(v30 v30Var, int i) {
        this.c = i;
        this.d = v30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        v30 v30Var = this.d;
        switch (i) {
            case 0:
                ViewParent parent = v30Var.f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                v30Var.a();
                View view = v30Var.f;
                if (view.isEnabled() && !view.isLongClickable() && v30Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    v30Var.i = true;
                    break;
                }
                break;
        }
    }
}
