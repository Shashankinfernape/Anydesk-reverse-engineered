package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b71 extends LinearLayout {
    public final TextInputLayout c;
    public final ad d;
    public CharSequence e;
    public final CheckableImageButton f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public ImageView.ScaleType j;
    public View.OnLongClickListener k;
    public boolean l;

    public b71(TextInputLayout textInputLayout, y6 y6Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4.0f, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = zy0.a;
            checkableImageButton.setBackground(yy0.b(context, iApplyDimension));
        }
        ad adVar = new ad(getContext(), null);
        this.d = adVar;
        if (ec1.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        ec1.H(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        ec1.H(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) y6Var.e;
        if (typedArray.hasValue(69)) {
            this.g = ec1.m(getContext(), y6Var, 69);
        }
        if (typedArray.hasValue(70)) {
            this.h = ds.z(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(y6Var.t(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            id.q("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.i) {
            this.i = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeJ = ec1.j(typedArray.getInt(68, -1));
            this.j = scaleTypeJ;
            checkableImageButton.setScaleType(scaleTypeJ);
        }
        adVar.setVisibility(8);
        adVar.setId(R.id.textinput_prefix_text);
        adVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = oe1.a;
        adVar.setAccessibilityLiveRegion(1);
        nd0.O(adVar, typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            adVar.setTextColor(y6Var.s(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.e = TextUtils.isEmpty(text2) ? null : text2;
        adVar.setText(text2);
        e();
        addView(checkableImageButton);
        addView(adVar);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = oe1.a;
        return this.d.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.g;
            PorterDuff.Mode mode = this.h;
            TextInputLayout textInputLayout = this.c;
            ec1.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            ec1.G(textInputLayout, checkableImageButton, this.g);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        ec1.H(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        ec1.H(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.f;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.c.f;
        if (editText == null) {
            return;
        }
        if (this.f.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = oe1.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = oe1.a;
        this.d.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.e == null || this.l) ? 8 : 0;
        setVisibility((this.f.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.d.setVisibility(i);
        this.c.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
