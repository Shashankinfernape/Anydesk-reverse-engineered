package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class u6 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ v6 d;

    public /* synthetic */ u6(v6 v6Var, int i) {
        this.c = i;
        this.d = v6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        v6 v6Var = this.d;
        switch (i) {
            case 0:
                if (v6Var.m && v6Var.f() && v6Var.m) {
                    int selectionStart = v6Var.d.getSelectionStart();
                    v6Var.setPasswordHidden(!(v6Var.f() ? !v6Var.m ? true : v6Var.d.getTransformationMethod() instanceof PasswordTransformationMethod : false));
                    Editable text = v6Var.d.getText();
                    if (text != null && selectionStart >= 0 && selectionStart <= text.toString().length()) {
                        v6Var.d.setSelection(selectionStart);
                        break;
                    }
                }
                break;
            case 1:
                EditText editText = v6Var.d;
                if (editText != null) {
                    editText.getText().clear();
                }
                break;
            default:
                Runnable runnable = v6Var.i;
                if (v6Var.d != null && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
