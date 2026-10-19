package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.ng0;

/* JADX INFO: loaded from: classes.dex */
public class ListenerScrollView extends ScrollView {
    public ng0 c;

    public ListenerScrollView(Context context) {
        super(context);
        this.c = null;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ng0 ng0Var = this.c;
        if (ng0Var != null) {
            ng0Var.a(this);
        }
    }

    public void setListener(ng0 ng0Var) {
        this.c = ng0Var;
    }

    public ListenerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = null;
    }

    public ListenerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = null;
    }
}
