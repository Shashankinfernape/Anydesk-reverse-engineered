package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.navigation.NavigationView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 {
    public final TimeInterpolator a;
    public final NavigationView b;
    public final int c;
    public final int d;
    public final int e;
    public rf f;
    public final float g;
    public final float h;
    public final float i;

    public jk0(NavigationView navigationView) {
        this.b = navigationView;
        Context context = navigationView.getContext();
        this.a = lk0.H(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = lk0.G(context, R.attr.motionDurationMedium2, 300);
        this.d = lk0.G(context, R.attr.motionDurationShort3, 150);
        this.e = lk0.G(context, R.attr.motionDurationShort2, 100);
        Resources resources = navigationView.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f, boolean z, int i) {
        float interpolation = this.a.getInterpolation(f);
        WeakHashMap weakHashMap = oe1.a;
        NavigationView navigationView = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, navigationView.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = navigationView.getWidth();
        int height = navigationView.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            navigationView.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fA = x8.a(0.0f, f5, interpolation);
            float f7 = fA + 1.0f;
            navigationView.setScaleX(f7);
            float fA2 = 1.0f - x8.a(0.0f, f6, interpolation);
            navigationView.setScaleY(fA2);
            for (int i2 = 0; i2 < navigationView.getChildCount(); i2++) {
                View childAt = navigationView.getChildAt(i2);
                childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                childAt.setPivotY(-childAt.getTop());
                float f8 = z3 ? 1.0f - fA : 1.0f;
                float f9 = fA2 != 0.0f ? (f7 / fA2) * f8 : 1.0f;
                childAt.setScaleX(f8);
                childAt.setScaleY(f9);
            }
        }
    }
}
