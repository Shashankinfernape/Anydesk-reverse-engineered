package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ie1 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static boolean b(View view) {
        return view.restoreDefaultFocus();
    }

    public static void c(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void d(View view, int i) {
        view.setImportantForAutofill(i);
    }
}
