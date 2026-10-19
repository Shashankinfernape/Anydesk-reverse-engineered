package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import defpackage.q6;
import defpackage.t01;
import defpackage.v6;
import defpackage.w6;

/* JADX INFO: loaded from: classes.dex */
public class AdEditTextSecure extends v6 {
    public static final /* synthetic */ int q = 0;
    public w6 p;

    public AdEditTextSecure(Context context) {
        super(context);
    }

    @Override // defpackage.v6
    public final void c() {
        EditText editText = this.d;
        if (editText != null) {
            editText.removeTextChangedListener(this.j);
            this.d.setOnEditorActionListener(null);
            this.d.setText(t01.d, 0, 0);
        }
        q6 q6Var = this.j;
        if (q6Var != null) {
            q6Var.d = null;
            this.j = null;
        }
    }

    @Override // defpackage.v6
    public final void d() {
        q6 q6Var = new q6(this, 1);
        this.j = q6Var;
        this.d.addTextChangedListener(q6Var);
        this.j.d = this.d;
    }

    @Override // defpackage.v6
    public final boolean g() {
        w6 w6Var = this.p;
        if (w6Var == null) {
            return false;
        }
        t01 text = getText();
        boolean zR = w6Var.r();
        text.b();
        return zR;
    }

    public t01 getText() {
        Editable text = this.d.getText();
        if (text == null) {
            return t01.e;
        }
        int length = text.length();
        char[] cArr = new char[length];
        text.getChars(0, length, cArr, 0);
        return t01.d(cArr);
    }

    @Override // defpackage.v6
    public final void h() {
        t01 text = getText();
        if (text != null) {
            k(text.c.length);
        }
        text.b();
    }

    public final void l(t01 t01Var, boolean z) {
        if (t01Var == null) {
            return;
        }
        char[] cArr = t01Var.c;
        int length = cArr.length;
        this.d.setText(cArr, 0, length);
        EditText editText = this.d;
        if (z) {
            editText.setSelection(0, length);
        } else {
            editText.setSelection(length);
        }
    }

    @Override // defpackage.v6
    public void setFilter(String str) {
        q6 q6Var = this.j;
        if (q6Var != null) {
            q6Var.c = str;
        }
    }

    public void setTextListener(w6 w6Var) {
        this.p = w6Var;
    }

    public AdEditTextSecure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdEditTextSecure(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
