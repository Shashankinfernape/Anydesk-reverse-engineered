package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uk extends AlertDialog {
    public final x6 c;

    public uk(Context context, x6 x6Var) {
        super(context);
        this.c = x6Var;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            window.setSoftInputMode(19);
            return;
        }
        Drawable background = window.getDecorView().getBackground();
        if (background == null) {
            window.setSoftInputMode(3);
            return;
        }
        if (!t70.I()) {
            if (i >= 35) {
                r3.q(window);
            } else if (i >= 30) {
                r3.p(window);
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
            }
        }
        window.setSoftInputMode(51);
        View decorView2 = window.getDecorView();
        tk tkVar = new tk(background);
        WeakHashMap weakHashMap = oe1.a;
        ge1.k(decorView2, tkVar);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c.o(Boolean.valueOf(z));
    }
}
