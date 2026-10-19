package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class lb1 extends qa {
    @Override // defpackage.qa, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        View viewFindViewById;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 35 && (viewFindViewById = findViewById(R.id.main_layout)) != null) {
            viewFindViewById.setOnApplyWindowInsetsListener(new kb1(this));
        }
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onStop() {
        WindowInsetsController insetsController;
        super.onStop();
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        View viewFindViewById = findViewById(R.id.main_layout);
        if (viewFindViewById != null) {
            viewFindViewById.setOnApplyWindowInsetsListener(null);
        }
        Window window = getWindow();
        if (window == null || (insetsController = window.getInsetsController()) == null) {
            return;
        }
        insetsController.setSystemBarsAppearance(8, 8);
    }
}
