package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.button.MaterialButton;
import defpackage.ad;
import defpackage.bu0;
import defpackage.ck0;
import defpackage.ec1;
import defpackage.fk0;
import defpackage.hd;
import defpackage.kk0;
import defpackage.lk0;
import defpackage.ov0;
import defpackage.qj0;
import defpackage.ra;
import defpackage.ta;
import defpackage.th1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends hd {
    @Override // defpackage.hd
    public final ra a(Context context, AttributeSet attributeSet) {
        return new qj0(context, attributeSet);
    }

    @Override // defpackage.hd
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.hd
    public final ta c(Context context, AttributeSet attributeSet) {
        return new ck0(context, attributeSet);
    }

    @Override // defpackage.hd
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        fk0 fk0Var = new fk0(lk0.N(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, R.attr.radioButtonStyle);
        Context context2 = fk0Var.getContext();
        TypedArray typedArrayE = th1.E(context2, attributeSet, ov0.v, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayE.hasValue(0)) {
            fk0Var.setButtonTintList(ec1.n(context2, typedArrayE, 0));
        }
        fk0Var.h = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return fk0Var;
    }

    @Override // defpackage.hd
    public final ad e(Context context, AttributeSet attributeSet) {
        kk0 kk0Var = new kk0(lk0.N(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = kk0Var.getContext();
        if (bu0.z(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = ov0.y;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iP = -1;
            for (int i = 0; i < 2 && iP < 0; i++) {
                iP = ec1.p(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iP == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ov0.x);
                    Context context3 = kk0Var.getContext();
                    int[] iArr3 = {1, 2};
                    int iP2 = -1;
                    for (int i2 = 0; i2 < 2 && iP2 < 0; i2++) {
                        iP2 = ec1.p(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iP2 >= 0) {
                        kk0Var.setLineHeight(iP2);
                    }
                }
            }
        }
        return kk0Var;
    }
}
