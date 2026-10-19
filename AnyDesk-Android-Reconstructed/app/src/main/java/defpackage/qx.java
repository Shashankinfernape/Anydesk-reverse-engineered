package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final /* synthetic */ rx a;

    public qx(rx rxVar) {
        this.a = rxVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        rx rxVar = this.a;
        zo zoVar = rxVar.x;
        if (rxVar.u == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = rxVar.u;
        if (editText != null) {
            editText.removeTextChangedListener(zoVar);
            if (rxVar.u.getOnFocusChangeListener() == rxVar.b().e()) {
                rxVar.u.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        rxVar.u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(zoVar);
        }
        rxVar.b().l(rxVar.u);
        rxVar.j(rxVar.b());
    }
}
