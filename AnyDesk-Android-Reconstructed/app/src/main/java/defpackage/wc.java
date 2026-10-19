package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wc {
    public final TextView a;
    public fa1 b;
    public fa1 c;
    public fa1 d;
    public fa1 e;
    public fa1 f;
    public fa1 g;
    public fa1 h;
    public final fd i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public wc(TextView textView) {
        this.a = textView;
        this.i = new fd(textView);
    }

    public static fa1 c(Context context, tb tbVar, int i) {
        ColorStateList colorStateListI;
        synchronized (tbVar) {
            colorStateListI = tbVar.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        fa1 fa1Var = new fa1();
        fa1Var.d = true;
        fa1Var.a = colorStateListI;
        return fa1Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            r3.v(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            r3.v(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            hw.c(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            hw.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            hw.c(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        hw.c(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, fa1 fa1Var) {
        if (drawable == null || fa1Var == null) {
            return;
        }
        tb.e(drawable, fa1Var, this.a.getDrawableState());
    }

    public final void b() {
        fa1 fa1Var = this.b;
        TextView textView = this.a;
        if (fa1Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        fa1 fa1Var = this.h;
        if (fa1Var != null) {
            return fa1Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        fa1 fa1Var = this.h;
        if (fa1Var != null) {
            return fa1Var.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0460  */
    /* JADX WARN: Code duplicated, block: B:281:0x0465  */
    /* JADX WARN: Code duplicated, block: B:284:0x046c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x046e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0473  */
    /* JADX WARN: Code duplicated, block: B:289:0x0479  */
    /* JADX WARN: Code duplicated, block: B:291:0x047d  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i) {
        String string;
        boolean z;
        boolean z2;
        ColorStateList colorStateListS;
        ColorStateList colorStateListS2;
        ColorStateList colorStateListS3;
        String string2;
        tb tbVar;
        int i2;
        int i3;
        float dimensionPixelSize;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int i5;
        TextView textView = this.a;
        Context context = textView.getContext();
        tb tbVarA = tb.a();
        int[] iArr = yv0.h;
        y6 y6VarC = y6.C(context, attributeSet, iArr, i);
        oe1.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, tbVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, tbVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, tbVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, tbVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, tbVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, tbVarA, typedArray.getResourceId(6, 0));
        }
        y6VarC.F();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = yv0.w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            y6 y6Var = new y6(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            n(context, y6Var);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 23) {
                colorStateListS = typedArrayObtainStyledAttributes.hasValue(3) ? y6Var.s(3) : null;
                colorStateListS2 = typedArrayObtainStyledAttributes.hasValue(4) ? y6Var.s(4) : null;
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    colorStateListS3 = y6Var.s(5);
                    i5 = 15;
                } else {
                    i5 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i5);
                } else {
                    string2 = null;
                }
                if (i6 >= 26 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                y6Var.F();
            } else {
                i5 = 15;
                colorStateListS = null;
                colorStateListS2 = null;
            }
            colorStateListS3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                string2 = typedArrayObtainStyledAttributes.getString(i5);
            } else {
                string2 = null;
            }
            if (i6 >= 26) {
                string = null;
            } else {
                string = null;
            }
            y6Var.F();
        } else {
            string = null;
            z = false;
            z2 = false;
            colorStateListS = null;
            colorStateListS2 = null;
            colorStateListS3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        y6 y6Var2 = new y6(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListS = y6Var2.s(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListS2 = y6Var2.s(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListS3 = y6Var2.s(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListS;
        ColorStateList colorStateList3 = colorStateListS2;
        ColorStateList colorStateList4 = colorStateListS3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i7 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i7 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            tbVar = tbVarA;
        } else {
            tbVar = tbVarA;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        n(context, y6Var2);
        y6Var2.F();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            uc.d(textView, string);
        }
        if (str == null) {
            i2 = 0;
        } else if (i7 >= 24) {
            tc.b(textView, tc.a(str));
            i2 = 0;
        } else {
            i2 = 0;
            textView.setTextLocale(sc.a(str.split(",")[0]));
        }
        fd fdVar = this.i;
        Context context2 = fdVar.j;
        int[] iArr3 = yv0.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, i2);
        TextView textView2 = fdVar.i;
        oe1.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            fdVar.a = typedArrayObtainStyledAttributes3.getInt(5, i2);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                fdVar.f = fd.b(iArr4);
                fdVar.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!fdVar.j()) {
            fdVar.a = 0;
        } else if (fdVar.a == 1) {
            if (!fdVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                fdVar.k(dimension2, f, dimension);
            }
            fdVar.h();
        }
        if (kf1.c && fdVar.a != 0) {
            int[] iArr5 = fdVar.f;
            if (iArr5.length > 0) {
                if (uc.a(textView) != -1.0f) {
                    uc.b(textView, Math.round(fdVar.d), Math.round(fdVar.e), Math.round(fdVar.c), 0);
                } else {
                    uc.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        tb tbVar2 = tbVar;
        Drawable drawableB = resourceId4 != -1 ? tbVar2.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? tbVar2.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? tbVar2.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? tbVar2.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? tbVar2.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? tbVar2.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = uj.m(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                nd0.E(textView, colorStateList);
            } else if (textView instanceof ia1) {
                ((ia1) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeB = av.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                nd0.F(textView, modeB);
            } else if (textView instanceof ia1) {
                ((ia1) textView).setSupportCompoundDrawablesTintMode(modeB);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i3 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i9 = typedValuePeekValue.data;
                int i10 = i9 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i9);
                i4 = i10;
                i3 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i3) {
                nd0.G(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i3) {
                nd0.J(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i4 == i3) {
                    nd0.L(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    t3.h(textView, i4, dimensionPixelSize);
                } else {
                    nd0.L(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i3 = -1;
        dimensionPixelSize = -1.0f;
        i4 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
            nd0.G(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            nd0.J(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == i3) {
                nd0.L(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                t3.h(textView, i4, dimensionPixelSize);
            } else {
                nd0.L(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        ColorStateList colorStateListS;
        ColorStateList colorStateListS2;
        ColorStateList colorStateListS3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, yv0.w);
        y6 y6Var = new y6(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListS3 = y6Var.s(3)) != null) {
                textView.setTextColor(colorStateListS3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListS2 = y6Var.s(5)) != null) {
                textView.setLinkTextColor(colorStateListS2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListS = y6Var.s(4)) != null) {
                textView.setHintTextColor(colorStateListS);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, y6Var);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            uc.d(textView, string);
        }
        y6Var.F();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        fd fdVar = this.i;
        if (fdVar.j()) {
            DisplayMetrics displayMetrics = fdVar.j.getResources().getDisplayMetrics();
            fdVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (fdVar.h()) {
                fdVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        fd fdVar = this.i;
        if (fdVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = fdVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                fdVar.f = fd.b(iArrCopyOf);
                if (!fdVar.i()) {
                    id.f(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                fdVar.g = false;
            }
            if (fdVar.h()) {
                fdVar.a();
            }
        }
    }

    public final void k(int i) {
        fd fdVar = this.i;
        if (fdVar.j()) {
            if (i == 0) {
                fdVar.a = 0;
                fdVar.d = -1.0f;
                fdVar.e = -1.0f;
                fdVar.c = -1.0f;
                fdVar.f = new int[0];
                fdVar.b = false;
                return;
            }
            if (i != 1) {
                id.q(gr0.e(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = fdVar.j.getResources().getDisplayMetrics();
            fdVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (fdVar.h()) {
                fdVar.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new fa1();
        }
        fa1 fa1Var = this.h;
        fa1Var.a = colorStateList;
        fa1Var.d = colorStateList != null;
        this.b = fa1Var;
        this.c = fa1Var;
        this.d = fa1Var;
        this.e = fa1Var;
        this.f = fa1Var;
        this.g = fa1Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new fa1();
        }
        fa1 fa1Var = this.h;
        fa1Var.b = mode;
        fa1Var.c = mode != null;
        this.b = fa1Var;
        this.c = fa1Var;
        this.d = fa1Var;
        this.e = fa1Var;
        this.f = fa1Var;
        this.g = fa1Var;
    }

    public final void n(Context context, y6 y6Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) y6Var.e;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceV = y6Var.v(i5, this.j, new rc(this, i6, i7, new WeakReference(this.a)));
                if (typefaceV != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceV;
                    } else {
                        this.l = vc.a(Typeface.create(typefaceV, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = vc.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
