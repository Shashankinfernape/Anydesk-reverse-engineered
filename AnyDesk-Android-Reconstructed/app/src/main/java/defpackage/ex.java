package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends bu0 {
    public final dx m;

    public ex(TextView textView) {
        this.m = new dx(textView);
    }

    @Override // defpackage.bu0
    public final void A(boolean z) {
        if (rw.k != null) {
            this.m.A(z);
        }
    }

    @Override // defpackage.bu0
    public final void B(boolean z) {
        boolean z2 = rw.k != null;
        dx dxVar = this.m;
        if (z2) {
            dxVar.B(z);
        } else {
            dxVar.o = z;
        }
    }

    @Override // defpackage.bu0
    public final InputFilter[] q(InputFilter[] inputFilterArr) {
        return !(rw.k != null) ? inputFilterArr : this.m.q(inputFilterArr);
    }
}
