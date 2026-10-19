package defpackage;

import android.os.Build;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    public /* synthetic */ bi0(MainActivity mainActivity, int i) {
        this.c = i;
        this.d = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                if (mainActivity.isInPictureInPictureMode()) {
                    mainActivity.finish();
                }
                break;
            default:
                int i2 = 1;
                try {
                    if (Build.VERSION.SDK_INT >= 26 && mainActivity.isInPictureInPictureMode()) {
                        t70.g0(mainActivity.getApplicationContext(), JniAdExt.n1("ad.accept.picture_in_picture.android"), 1);
                        t70.Y(new ai0(mainActivity, i2));
                    }
                    mainActivity.X.a(MainApplication.v().g.u.createScreenCaptureIntent());
                } catch (Throwable th) {
                    mainActivity.C.b("cannot start activity for screen capture intent: ", th);
                    t70.g0(mainActivity, JniAdExt.n1("ad.msg.capture_failed.android"), 1);
                }
                break;
        }
    }
}
