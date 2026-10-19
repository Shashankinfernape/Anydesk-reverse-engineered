package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.h90;
import defpackage.us0;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements h90 {
    @Override // defpackage.h90
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.h90
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new us0(5);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: hv0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? d6.d(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new wa(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new us0(5);
    }
}
