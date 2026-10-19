package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anydesk.anydeskandroid.R;
import defpackage.a30;
import defpackage.ek0;
import defpackage.hl;
import defpackage.lk0;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.th1;
import defpackage.ul;
import defpackage.vl;
import defpackage.wl;
import defpackage.xl;
import defpackage.yl;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends a30 {
    public int g;
    public int h;
    public xl i;
    public final hl j;
    public final int k;
    public final yl l;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        Context contextN = lk0.N(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextN, attributeSet, i);
        this.e = false;
        TypedArray typedArrayObtainStyledAttributes = contextN.getTheme().obtainStyledAttributes(attributeSet, ov0.n, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hl hlVar = new hl();
        this.j = hlVar;
        yl ylVar = new yl(this);
        this.l = ylVar;
        TypedArray typedArrayE = th1.E(getContext(), attributeSet, ov0.i, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayE.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayE.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayE.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayE.getBoolean(5, false));
        setSingleSelection(typedArrayE.getBoolean(6, false));
        setSelectionRequired(typedArrayE.getBoolean(4, false));
        this.k = typedArrayE.getResourceId(0, -1);
        typedArrayE.recycle();
        hlVar.c = new ul(this);
        super.setOnHierarchyChangeListener(ylVar);
        WeakHashMap weakHashMap = oe1.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof vl);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new vl(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vl(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.j.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.j.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.g;
    }

    public int getChipSpacingVertical() {
        return this.h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.k;
        if (i != -1) {
            hl hlVar = this.j;
            ek0 ek0Var = (ek0) hlVar.a.get(Integer.valueOf(i));
            if (ek0Var != null && hlVar.a(ek0Var)) {
                hlVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.e ? getVisibleChipCount() : -1, false, this.j.d ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.g != i) {
            this.g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.h != i) {
            this.h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(wl wlVar) {
        if (wlVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new ul(this));
        }
    }

    public void setOnCheckedStateChangeListener(xl xlVar) {
        this.i = xlVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.l.c = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.j.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        hl hlVar = this.j;
        if (hlVar.d != z) {
            hlVar.d = z;
            boolean zIsEmpty = hlVar.b.isEmpty();
            Iterator it = hlVar.a.values().iterator();
            while (it.hasNext()) {
                hlVar.e((ek0) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            hlVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new vl(layoutParams);
    }

    @Override // defpackage.a30
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
