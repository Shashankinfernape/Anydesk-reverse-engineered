package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;

/* JADX INFO: loaded from: classes.dex */
public final class n61 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ GlowActivity c;

    public n61(o61 o61Var, GlowActivity glowActivity) {
        this.c = glowActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof SplashScreenView) {
            WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
            windowInsetsBuild.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == ((SplashScreenView) view2).getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.c.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
