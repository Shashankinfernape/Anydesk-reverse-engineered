package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ya1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ya1 m;
    public static ya1 n;
    public final View c;
    public final CharSequence d;
    public final int e;
    public final xa1 f;
    public final xa1 g;
    public int h;
    public int i;
    public za1 j;
    public boolean k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r0v0, types: [xa1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xa1] */
    public ya1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f = new Runnable(this) { // from class: xa1
            public final /* synthetic */ ya1 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ya1 ya1Var = this.d;
                switch (i2) {
                    case 0:
                        ya1Var.c(false);
                        break;
                    default:
                        ya1Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.g = new Runnable(this) { // from class: xa1
            public final /* synthetic */ ya1 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ya1 ya1Var = this.d;
                switch (i3) {
                    case 0:
                        ya1Var.c(false);
                        break;
                    default:
                        ya1Var.a();
                        break;
                }
            }
        };
        this.c = view;
        this.d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = pe1.a;
        this.e = Build.VERSION.SDK_INT >= 28 ? d6.q(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.l = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ya1 ya1Var) {
        ya1 ya1Var2 = m;
        if (ya1Var2 != null) {
            ya1Var2.c.removeCallbacks(ya1Var2.f);
        }
        m = ya1Var;
        if (ya1Var != null) {
            ya1Var.c.postDelayed(ya1Var.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ya1 ya1Var = n;
        View view = this.c;
        if (ya1Var == this) {
            n = null;
            za1 za1Var = this.j;
            if (za1Var != null) {
                View view2 = (View) za1Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) za1Var.a).getSystemService("window")).removeView(view2);
                }
                this.j = null;
                this.l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (m == this) {
            b(null);
        }
        view.removeCallbacks(this.g);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        char c;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.c;
        if (view.isAttachedToWindow()) {
            b(null);
            ya1 ya1Var = n;
            if (ya1Var != null) {
                ya1Var.a();
            }
            n = this;
            this.k = z;
            za1 za1Var = new za1(view.getContext());
            View view2 = (View) za1Var.b;
            Context context = (Context) za1Var.a;
            this.j = za1Var;
            int width = this.h;
            int i3 = this.i;
            boolean z2 = this.k;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) za1Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) za1Var.c).setText(this.d);
            int[] iArr = (int[]) za1Var.g;
            int[] iArr2 = (int[]) za1Var.f;
            Rect rect = (Rect) za1Var.e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i4 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    c = 1;
                } else {
                    Resources resources = context.getResources();
                    c = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[c] = iArr2[c] - iArr[c];
                layoutParams.x = (i5 + i4) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[c];
                int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.k) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = oe1.a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            xa1 xa1Var = this.g;
            view.removeCallbacks(xa1Var);
            view.postDelayed(xa1Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j == null || !this.k) {
            View view2 = this.c;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.l = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.j == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.l) {
                        this.h = x;
                        this.i = y;
                        this.l = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.h);
                        int i = this.e;
                        if (iAbs > i || Math.abs(y - this.i) > i) {
                            this.h = x;
                            this.i = y;
                            this.l = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
