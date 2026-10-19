package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import defpackage.nv0;
import defpackage.r3;
import defpackage.yy;

/* JADX INFO: loaded from: classes.dex */
public class FileManagerAttrsTab extends yy {
    public final Logging u;
    public ConstraintLayout v;

    public FileManagerAttrsTab(Context context) {
        super(context);
        this.u = new Logging("FileManagerAttrsTab");
        o(null, 0);
    }

    @Override // defpackage.yy
    public int getLayoutId() {
        return R.layout.filemanager_attrs_tab;
    }

    public final void n() {
        this.s = null;
        this.t = null;
        setLayoutOnClickListener(null);
        setLayoutOnDragListener(null);
        this.v = null;
    }

    public final void o(AttributeSet attributeSet, int i) {
        int i2;
        this.v = (ConstraintLayout) findViewById(R.id.filemanager_attrs_layout);
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.c, i, 0);
                setLayoutEnabled(typedArrayObtainStyledAttributes.getBoolean(2, true));
                setDir(typedArrayObtainStyledAttributes.getString(0));
                TypedValue typedValue = new TypedValue();
                if (typedArrayObtainStyledAttributes.getValue(1, typedValue) && (i2 = typedValue.type) >= 28 && i2 <= 31) {
                    setTextColor(typedValue.data);
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                this.u.d(th);
            }
        }
    }

    public void setLayoutBackground(Drawable drawable) {
        ConstraintLayout constraintLayout = this.v;
        if (constraintLayout != null) {
            constraintLayout.setBackground(drawable);
        }
    }

    public void setLayoutEnabled(boolean z) {
        r3.C(this.v, z);
    }

    public void setLayoutOnClickListener(View.OnClickListener onClickListener) {
        ConstraintLayout constraintLayout = this.v;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setOnClickListener(onClickListener);
    }

    public void setLayoutOnDragListener(View.OnDragListener onDragListener) {
        ConstraintLayout constraintLayout = this.v;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setOnDragListener(onDragListener);
    }

    public FileManagerAttrsTab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Logging("FileManagerAttrsTab");
        o(attributeSet, 0);
    }

    public FileManagerAttrsTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Logging("FileManagerAttrsTab");
        o(attributeSet, i);
    }
}
