package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g40 extends FrameLayout {
    public final ArrayList c;
    public final ArrayList d;
    public View.OnApplyWindowInsetsListener e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(Context context, AttributeSet attributeSet, t40 t40Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uv0.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        c40 c40VarA = t40Var.A(id);
        if (classAttribute != null && c40VarA == null) {
            if (id == -1) {
                nh0.j(gr0.f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            n40 n40VarE = t40Var.E();
            context.getClassLoader();
            c40 c40VarA2 = n40VarE.a(classAttribute);
            c40VarA2.getClass();
            c40VarA2.y = id;
            c40VarA2.z = id;
            c40VarA2.A = string;
            c40VarA2.u = t40Var;
            c40VarA2.v = t40Var.u;
            c40VarA2.w0(context, attributeSet, null);
            sf sfVar = new sf(t40Var);
            sfVar.p = true;
            c40VarA2.G = this;
            sfVar.e(getId(), c40VarA2, string, 1);
            if (sfVar.g) {
                nh0.j("This transaction is already being added to the back stack");
                throw null;
            }
            sfVar.h = false;
            t40 t40Var2 = sfVar.q;
            if (t40Var2.u != null && !t40Var2.H) {
                t40Var2.w(true);
                sfVar.a(t40Var2.J, t40Var2.K);
                t40Var2.b = true;
                try {
                    t40Var2.T(t40Var2.J, t40Var2.K);
                    t40Var2.d();
                    t40Var2.e0();
                    if (t40Var2.I) {
                        t40Var2.I = false;
                        t40Var2.c0();
                    }
                    ((HashMap) t40Var2.c.b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    t40Var2.d();
                    throw th;
                }
            }
        }
        ArrayList arrayListF = t40Var.c.f();
        int size = arrayListF.size();
        while (i < size) {
            Object obj = arrayListF.get(i);
            i++;
            i50 i50Var = (i50) obj;
            c40 c40Var = i50Var.c;
            if (c40Var.z == getId() && (view = c40Var.H) != null && view.getParent() == null) {
                c40Var.G = this;
                i50Var.b();
            }
        }
    }

    public final void a(View view) {
        if (this.d.contains(view)) {
            this.c.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof c40 ? (c40) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            nh0.t(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        gh1 gh1VarG;
        windowInsets.getClass();
        gh1 gh1VarG2 = gh1.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.e;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            gh1VarG = gh1.g(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = oe1.a;
            WindowInsets windowInsetsF = gh1VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = ee1.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    gh1VarG2 = gh1.g(windowInsetsB, this);
                }
            }
            gh1VarG = gh1VarG2;
        }
        if (!gh1VarG.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                oe1.b(getChildAt(i), gh1VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.d.remove(view);
        if (this.c.remove(view)) {
            this.f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends c40> F getFragment() {
        c40 c40Var;
        qa qaVar;
        t40 t40VarY;
        View view = this;
        while (true) {
            if (view == null) {
                c40Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            c40Var = tag instanceof c40 ? (c40) tag : null;
            if (c40Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (c40Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    qaVar = null;
                    break;
                }
                if (context instanceof qa) {
                    qaVar = (qa) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (qaVar == null) {
                nh0.o(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            t40VarY = qaVar.Y();
        } else {
            if (!c40Var.k0()) {
                throw new IllegalStateException("The Fragment " + c40Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            t40VarY = c40Var.Z();
        }
        return (F) t40VarY.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.e = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.d.add(view);
        }
        super.startViewTransition(view);
    }

    public g40(Context context) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = true;
    }
}
