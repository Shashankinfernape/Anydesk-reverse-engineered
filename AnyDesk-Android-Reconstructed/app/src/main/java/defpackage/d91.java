package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TableLayout;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class d91 implements TextWatcher {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TableLayout d;
    public final /* synthetic */ e91 e;
    public final /* synthetic */ TcpTunnelFragment f;

    public d91(TcpTunnelFragment tcpTunnelFragment, boolean z, TableLayout tableLayout, e91 e91Var) {
        this.f = tcpTunnelFragment;
        this.c = z;
        this.d = tableLayout;
        this.e = e91Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TableLayout tableLayout = this.d;
        e91 e91Var = this.e;
        this.f.U0(JniAdExt.O3(this.c, tableLayout.indexOfChild(e91Var) - 1, e91Var.c.getText().toString(), e91Var.d.getText().toString(), e91Var.e.getText().toString()));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
