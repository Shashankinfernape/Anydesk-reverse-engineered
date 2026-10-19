package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class gx implements TextWatcher {
    public final EditText c;
    public fx d;
    public boolean e = true;

    public gx(EditText editText) {
        this.c = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            rw rwVarA = rw.a();
            if (editableText == null) {
                length = 0;
            } else {
                rwVarA.getClass();
                length = editableText.length();
            }
            rwVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.c;
        if (editText.isInEditMode() || !this.e || rw.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = rw.a().b();
        if (iB != 0) {
            if (iB == 1) {
                rw.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        rw rwVarA = rw.a();
        if (this.d == null) {
            this.d = new fx(editText);
        }
        rwVarA.f(this.d);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
