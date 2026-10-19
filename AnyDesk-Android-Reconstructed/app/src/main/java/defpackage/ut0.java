package defpackage;

import android.animation.TimeAnimator;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements TimeAnimator.TimeListener {
    public final TimeAnimator c = new TimeAnimator();

    public final void a(boolean z) {
        this.c.cancel();
        JniAdExt.I0.post(new fb0(11, z));
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (j > 500) {
            a(false);
        } else {
            JniAdExt.I0.post(new va0(3, j));
        }
    }
}
