package defpackage;

import android.view.View;
import android.widget.TableLayout;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class c91 implements View.OnClickListener {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TableLayout d;
    public final /* synthetic */ e91 e;
    public final /* synthetic */ TcpTunnelFragment f;

    public c91(TcpTunnelFragment tcpTunnelFragment, boolean z, TableLayout tableLayout, e91 e91Var) {
        this.f = tcpTunnelFragment;
        this.c = z;
        this.d = tableLayout;
        this.e = e91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TableLayout tableLayout = this.d;
        int childCount = tableLayout.getChildCount();
        e91 e91Var = this.e;
        if (childCount > 2) {
            this.f.U0(JniAdExt.N3(tableLayout.indexOfChild(e91Var) - 1, this.c));
            tableLayout.removeView(e91Var);
        } else {
            e91Var.c.setText("localhost");
            e91Var.d.setText("");
            e91Var.e.setText("");
        }
    }
}
