package defpackage;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    public /* synthetic */ ai0(MainActivity mainActivity, int i) {
        this.c = i;
        this.d = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 3;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                l lVar = mainActivity.h0;
                InputMethodManager inputMethodManager = (InputMethodManager) mainActivity.getSystemService("input_method");
                View currentFocus = mainActivity.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
                View decorView = mainActivity.getWindow().getDecorView();
                lVar.run();
                decorView.post(lVar);
                decorView.postDelayed(lVar, 100L);
                break;
            case 1:
                mainActivity.moveTaskToBack(false);
                break;
            case 2:
                if (!mainActivity.H && mainActivity.G) {
                    Bitmap bitmap = JniAdExt.a;
                    t70.Y(new bc0(2, mainActivity));
                    t70.Y(new bc0(3, mainActivity));
                    t70.Y(new bc0(4, mainActivity));
                    break;
                }
                break;
            case 3:
                if (!r3.d(mainActivity)) {
                    NotificationManager notificationManager = mainActivity.E.c;
                    if (notificationManager != null) {
                        notificationManager.cancel(701);
                    }
                    t70.Y(new qi(mainActivity, 1, i2));
                } else if (r3.n(mainActivity, mainActivity.c0, mainActivity.C)) {
                    MainApplication.q(mainActivity.getApplicationContext());
                    JniAdExt.I0.post(new tb0(29));
                }
                break;
            case 4:
                bc bcVar = mainActivity.D;
                if (bcVar != null) {
                    bcVar.F("OutgoingDialog");
                }
                mainActivity.p0();
                break;
            default:
                zd zdVar = MainActivity.j0;
                mainActivity.j0();
                mainActivity.A0();
                dj djVar = mainActivity.U;
                if (djVar != null) {
                    djVar.n();
                    mainActivity.U.p();
                }
                break;
        }
    }
}
