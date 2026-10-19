package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class zo implements TextWatcher {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zo(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.c) {
            case 0:
            case 1:
                break;
            default:
                ((rx) this.d).b().a();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.c) {
            case 0:
            case 1:
                break;
            default:
                ((rx) this.d).b().b();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.c;
        Object obj = this.d;
        switch (i4) {
            case 0:
                ConnectionFragment connectionFragment = (ConnectionFragment) obj;
                ConnectionFragment.A1(charSequence, connectionFragment.k1, connectionFragment.l1);
                break;
            case 1:
                ConnectionFragment connectionFragment2 = (ConnectionFragment) obj;
                ConnectionFragment.A1(charSequence, connectionFragment2.p1, connectionFragment2.q1);
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }
}
