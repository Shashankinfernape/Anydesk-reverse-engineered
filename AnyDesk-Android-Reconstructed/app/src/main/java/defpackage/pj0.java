package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ qj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(qj0 qj0Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = qj0Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        qj0 qj0Var = this.c;
        ColorStateList colorStateList2 = qj0Var.n;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (qj0Var.m != 0 && qj0Var.n != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{cn.b(qj0Var.n.getColorForState(iArr3, 0), qj0Var.m), cn.b(qj0Var.n.getColorForState(iArr2, 0), qj0Var.m), qj0Var.m});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            qj0 qj0Var = this.c;
            Drawable rippleDrawable = null;
            if (qj0Var.getText().toString().contentEquals(textView.getText()) && qj0Var.m != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(qj0Var.m);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = oe1.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
