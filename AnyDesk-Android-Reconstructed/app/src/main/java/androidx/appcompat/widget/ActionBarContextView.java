package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import defpackage.a2;
import defpackage.a6;
import defpackage.b;
import defpackage.df1;
import defpackage.ec1;
import defpackage.kf1;
import defpackage.ll0;
import defpackage.nh0;
import defpackage.oe1;
import defpackage.r5;
import defpackage.rk0;
import defpackage.w5;
import defpackage.yv0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final a2 c;
    public final Context d;
    public ActionMenuView e;
    public w5 f;
    public int g;
    public df1 h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public CharSequence l;
    public View m;
    public View n;
    public View o;
    public LinearLayout p;
    public TextView q;
    public TextView r;
    public final int s;
    public final int t;
    public boolean u;
    public final int v;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.c = new a2(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.d = context;
        } else {
            this.d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : ec1.r(context, resourceId));
        this.s = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.g = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(a6 a6Var) {
        View view = this.m;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.v, (ViewGroup) this, false);
            this.m = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.m);
        }
        View viewFindViewById = this.m.findViewById(R.id.action_mode_close_button);
        this.n = viewFindViewById;
        viewFindViewById.setOnClickListener(new b(8, a6Var));
        rk0 rk0VarC = a6Var.c();
        w5 w5Var = this.f;
        if (w5Var != null) {
            w5Var.d();
            r5 r5Var = w5Var.w;
            if (r5Var != null && r5Var.b()) {
                r5Var.i.dismiss();
            }
        }
        w5 w5Var2 = new w5(getContext());
        this.f = w5Var2;
        w5Var2.o = true;
        w5Var2.p = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        rk0VarC.b(this.f, this.d);
        w5 w5Var3 = this.f;
        ll0 ll0Var = w5Var3.j;
        if (ll0Var == null) {
            ll0 ll0Var2 = (ll0) w5Var3.f.inflate(w5Var3.h, (ViewGroup) this, false);
            w5Var3.j = ll0Var2;
            ll0Var2.b(w5Var3.e);
            w5Var3.h();
        }
        ll0 ll0Var3 = w5Var3.j;
        if (ll0Var != ll0Var3) {
            ((ActionMenuView) ll0Var3).setPresenter(w5Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ll0Var3;
        this.e = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.e, layoutParams);
    }

    public final void d() {
        if (this.p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.r = (TextView) this.p.findViewById(R.id.action_bar_subtitle);
            int i = this.s;
            if (i != 0) {
                this.q.setTextAppearance(getContext(), i);
            }
            int i2 = this.t;
            if (i2 != 0) {
                this.r.setTextAppearance(getContext(), i2);
            }
        }
        this.q.setText(this.k);
        this.r.setText(this.l);
        boolean zIsEmpty = TextUtils.isEmpty(this.k);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.l);
        this.r.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    public final void e() {
        removeAllViews();
        this.o = null;
        this.e = null;
        this.f = null;
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.h != null ? this.c.d : getVisibility();
    }

    public int getContentHeight() {
        return this.g;
    }

    public CharSequence getSubtitle() {
        return this.l;
    }

    public CharSequence getTitle() {
        return this.k;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            df1 df1Var = this.h;
            if (df1Var != null) {
                df1Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final df1 i(int i, long j) {
        df1 df1Var = this.h;
        if (df1Var != null) {
            df1Var.b();
        }
        a2 a2Var = this.c;
        if (i != 0) {
            df1 df1VarA = oe1.a(this);
            df1VarA.a(0.0f);
            df1VarA.c(j);
            ((ActionBarContextView) a2Var.e).h = df1VarA;
            a2Var.d = i;
            df1VarA.d(a2Var);
            return df1VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        df1 df1VarA2 = oe1.a(this);
        df1VarA2.a(1.0f);
        df1VarA2.c(j);
        ((ActionBarContextView) a2Var.e).h = df1VarA2;
        a2Var.d = i;
        df1VarA2.d(a2Var);
        return df1VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, yv0.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        w5 w5Var = this.f;
        if (w5Var != null) {
            Configuration configuration2 = w5Var.d.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            w5Var.s = i;
            rk0 rk0Var = w5Var.e;
            if (rk0Var != null) {
                rk0Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w5 w5Var = this.f;
        if (w5Var != null) {
            w5Var.d();
            r5 r5Var = this.f.w;
            if (r5Var == null || !r5Var.b()) {
                return;
            }
            r5Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.j = false;
        }
        if (!this.j) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.j = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.j = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = kf1.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.m, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.p, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.o;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            nh0.j(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            nh0.j(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.g;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.m;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.e, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null) {
            if (this.u) {
                this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.p.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.p.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.g > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.g = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        if (view != null && (linearLayout = this.p) != null) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.l = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        d();
        oe1.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.u) {
            requestLayout();
        }
        this.u = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
