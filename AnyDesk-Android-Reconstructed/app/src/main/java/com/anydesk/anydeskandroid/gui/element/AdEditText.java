package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import defpackage.q6;
import defpackage.r6;
import defpackage.v6;

/* JADX INFO: loaded from: classes.dex */
public class AdEditText extends v6 {
    public static final /* synthetic */ int q = 0;
    public r6 p;

    public AdEditText(Context context) {
        super(context);
    }

    @Override // defpackage.v6
    public final void c() {
        EditText editText = this.d;
        if (editText != null) {
            editText.removeTextChangedListener(this.j);
            this.d.setOnEditorActionListener(null);
        }
        q6 q6Var = this.j;
        if (q6Var != null) {
            q6Var.d = null;
            this.j = null;
        }
    }

    @Override // defpackage.v6
    public final void d() {
        q6 q6Var = new q6(this, 0);
        this.j = q6Var;
        this.d.addTextChangedListener(q6Var);
        this.j.d = this.d;
    }

    @Override // defpackage.v6
    public final boolean g() {
        r6 r6Var = this.p;
        if (r6Var == null) {
            return false;
        }
        getText();
        return r6Var.k();
    }

    public String getText() {
        Editable text = this.d.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    @Override // defpackage.v6
    public final void h() {
        String text = getText();
        if (text != null) {
            k(text.length());
        }
    }

    public final void l(String str, boolean z) {
        this.d.setText("");
        this.d.append(str);
        if (z) {
            EditText editText = this.d;
            editText.setSelection(0, editText.getText().length());
        }
    }

    @Override // defpackage.v6
    public void setFilter(String str) {
        q6 q6Var = this.j;
        if (q6Var != null) {
            q6Var.c = str;
        }
    }

    public void setTextListener(r6 r6Var) {
        this.p = r6Var;
    }

    public AdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
