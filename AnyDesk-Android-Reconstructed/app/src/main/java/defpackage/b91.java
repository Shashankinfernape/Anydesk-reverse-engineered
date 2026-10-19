package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class b91 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ TcpTunnelFragment d;

    public /* synthetic */ b91(TcpTunnelFragment tcpTunnelFragment, int i) {
        this.c = i;
        this.d = tcpTunnelFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        TcpTunnelFragment tcpTunnelFragment = this.d;
        switch (i) {
            case 0:
                tcpTunnelFragment.S0(false);
                break;
            case 1:
                tcpTunnelFragment.S0(true);
                break;
            case 2:
                JniAdExt.s4();
                uj.x(tcpTunnelFragment.Y());
                break;
            default:
                uj.x(tcpTunnelFragment.Y());
                break;
        }
    }
}
