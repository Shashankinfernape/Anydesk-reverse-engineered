package defpackage;

import android.app.Instrumentation;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class g8 extends lk0 {
    public final Instrumentation k = new Instrumentation();

    @Override // defpackage.z70
    public final boolean a(KeyEvent keyEvent) {
        this.k.sendKeySync(vx.b(keyEvent));
        return true;
    }

    @Override // defpackage.z70
    public final boolean c(MotionEvent motionEvent) {
        this.k.sendPointerSync(motionEvent);
        return true;
    }

    @Override // defpackage.z70
    public final boolean e(String str) {
        this.k.sendStringSync(str);
        return true;
    }
}
