package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ll0;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.vk0;
import defpackage.y6;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements qk0, ll0, AdapterView.OnItemClickListener {
    public static final int[] d = {R.attr.background, R.attr.divider};
    public rk0 c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        y6 y6VarC = y6.C(context, attributeSet, d, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(y6VarC.t(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(y6VarC.t(1));
        }
        y6VarC.F();
    }

    @Override // defpackage.qk0
    public final boolean a(vk0 vk0Var) {
        return this.c.q(vk0Var, null, 0);
    }

    @Override // defpackage.ll0
    public final void b(rk0 rk0Var) {
        this.c = rk0Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vk0) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
