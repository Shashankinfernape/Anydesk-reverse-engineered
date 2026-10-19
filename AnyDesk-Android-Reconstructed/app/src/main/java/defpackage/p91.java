package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p91 implements TextWatcher {
    public int c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ TextInputLayout e;

    public p91(TextInputLayout textInputLayout, EditText editText) {
        this.e = textInputLayout;
        this.d = editText;
        this.c = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.e;
        textInputLayout.u(!textInputLayout.C0, false);
        if (textInputLayout.m) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.u) {
            textInputLayout.v(editable);
        }
        EditText editText = this.d;
        int lineCount = editText.getLineCount();
        int i = this.c;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = oe1.a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.v0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.c = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
