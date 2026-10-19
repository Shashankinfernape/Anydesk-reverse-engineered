package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ ni0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        MainFragment mainFragment = this.d;
        switch (i) {
            case 0:
                if (mainFragment.a0() != null) {
                    LinearLayout linearLayout = mainFragment.h1;
                    Resources resourcesF0 = mainFragment.f0();
                    Looper looper = t70.a;
                    int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.card_layout_max_width);
                    if (linearLayout != null && linearLayout.getWidth() > dimensionPixelSize) {
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        layoutParams.width = dimensionPixelSize;
                        linearLayout.setLayoutParams(layoutParams);
                    }
                    mainFragment.c1();
                    break;
                }
                break;
            default:
                mainFragment.l1();
                break;
        }
    }
}
