package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class qf1 extends of1 {
    public static boolean m = true;

    @Override // defpackage.us0
    public void u(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.u(view, i);
        } else if (m) {
            try {
                pf1.a(view, i);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
