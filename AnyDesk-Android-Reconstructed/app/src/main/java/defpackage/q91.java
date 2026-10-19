package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q91 extends o3 {
    public final TextInputLayout d;

    public q91(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.w0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        b71 b71Var = textInputLayout.d;
        View view2 = b71Var.d;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(view2);
            w3Var.r(view2);
        } else {
            w3Var.r(b71Var.f);
        }
        if (!zIsEmpty) {
            w3Var.q(text);
        } else if (!TextUtils.isEmpty(string)) {
            w3Var.q(string);
            if (!z && placeholderText != null) {
                w3Var.q(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            w3Var.q(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3Var.m(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                w3Var.q(string);
            }
            w3Var.p(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        ad adVar = textInputLayout.l.y;
        if (adVar != null) {
            accessibilityNodeInfo.setLabelFor(adVar);
        }
        textInputLayout.e.b().m(w3Var);
    }

    @Override // defpackage.o3
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.e.b().n(accessibilityEvent);
    }
}
