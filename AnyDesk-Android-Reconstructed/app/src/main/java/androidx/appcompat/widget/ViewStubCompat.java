package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.gf1;
import defpackage.id;
import defpackage.nh0;
import defpackage.yv0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int c;
    public int d;
    public WeakReference e;
    public LayoutInflater f;

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.A, i, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.c = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            nh0.j("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.c == 0) {
            id.q("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.c, viewGroup, false);
        int i = this.d;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.e = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f;
    }

    public int getLayoutResource() {
        return this.c;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.d = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                nh0.j("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOnInflateListener(gf1 gf1Var) {
    }
}
