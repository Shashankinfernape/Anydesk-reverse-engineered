package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class kb1 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ lb1 c;

    public kb1(lb1 lb1Var) {
        this.c = lb1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsetsController insetsController;
        lb1 lb1Var = this.c;
        View viewFindViewById = lb1Var.findViewById(R.id.android15_statusbar_placeholder);
        View viewFindViewById2 = lb1Var.findViewById(R.id.android15_camera_cutoff_placeholder);
        View viewFindViewById3 = lb1Var.findViewById(R.id.android15_navigationbar_placeholder_right);
        View viewFindViewById4 = lb1Var.findViewById(R.id.android15_navigationbar_placeholder_bottom);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById3 == null || viewFindViewById4 == null) {
            return WindowInsets.CONSUMED;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = insets.top;
        viewFindViewById.setLayoutParams(layoutParams);
        boolean z = lb1Var.getResources().getBoolean(R.bool.is_rtl);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        layoutParams2.width = z ? insets.right : insets.left;
        viewFindViewById2.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
        layoutParams3.width = z ? insets.left : insets.right;
        viewFindViewById3.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = viewFindViewById4.getLayoutParams();
        layoutParams4.height = insets.bottom;
        viewFindViewById4.setLayoutParams(layoutParams4);
        Window window = lb1Var.getWindow();
        if (window != null && (insetsController = window.getInsetsController()) != null) {
            insetsController.setSystemBarsAppearance(0, 8);
        }
        return WindowInsets.CONSUMED;
    }
}
