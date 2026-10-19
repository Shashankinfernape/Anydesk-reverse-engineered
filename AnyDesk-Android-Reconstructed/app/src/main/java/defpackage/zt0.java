package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class zt0 extends sx {
    public final int e;
    public EditText f;
    public final m g;

    public zt0(rx rxVar, int i) {
        super(rxVar);
        this.e = R.drawable.design_password_eye;
        this.g = new m(6, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.sx
    public final void b() {
        p();
    }

    @Override // defpackage.sx
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.sx
    public final int d() {
        return this.e;
    }

    @Override // defpackage.sx
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.sx
    public final boolean j() {
        return true;
    }

    @Override // defpackage.sx
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.sx
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.sx
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.sx
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
