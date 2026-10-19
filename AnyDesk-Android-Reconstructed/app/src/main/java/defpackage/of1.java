package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class of1 extends us0 {
    public static boolean l = true;

    @Override // defpackage.us0
    public void s(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                nf1.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}
