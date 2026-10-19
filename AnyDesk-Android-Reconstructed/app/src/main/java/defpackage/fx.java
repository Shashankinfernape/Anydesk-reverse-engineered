package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class fx extends pw {
    public final WeakReference a;

    public fx(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.pw
    public final void a() {
        gx.a((EditText) this.a.get(), 1);
    }
}
