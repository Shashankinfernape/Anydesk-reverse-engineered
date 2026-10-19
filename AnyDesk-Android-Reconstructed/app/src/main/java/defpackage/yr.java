package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class yr extends zr {
    @Override // defpackage.hk0
    public final void f(Canvas canvas) {
        if (this.z.q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        xr xrVar = this.z;
        if (i >= 26) {
            canvas.clipOutRect(xrVar.q);
        } else {
            canvas.clipRect(xrVar.q, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
