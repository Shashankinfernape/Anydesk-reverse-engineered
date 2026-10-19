package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class hd {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final i51 h = new i51(0);
    public final Object[] a = new Object[2];

    public ra a(Context context, AttributeSet attributeSet) {
        return new ra(context, attributeSet, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public ta c(Context context, AttributeSet attributeSet) {
        return new ta(context, attributeSet, com.anydesk.anydeskandroid.R.attr.checkboxStyle);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public ad e(Context context, AttributeSet attributeSet) {
        return new ad(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        i51 i51Var = h;
        Constructor constructor = (Constructor) i51Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            i51Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
