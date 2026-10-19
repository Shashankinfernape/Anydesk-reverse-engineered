package defpackage;

import android.view.MotionEvent;
import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final class e8 extends d8 {
    @Override // defpackage.d8, defpackage.z70
    public final boolean c(MotionEvent motionEvent) {
        return MainApplication.v().U.g() ? this.d.c(motionEvent) : super.c(motionEvent);
    }

    @Override // defpackage.d8, defpackage.z70
    public final boolean f(MotionEvent[] motionEventArr) {
        return MainApplication.v().U.g() ? this.d.f(motionEventArr) : super.f(motionEventArr);
    }
}
