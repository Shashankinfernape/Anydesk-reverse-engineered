package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class e91 extends LinearLayout {
    public final EditText c;
    public final EditText d;
    public final EditText e;

    public e91(Context context, int i) {
        super(context);
        View viewInflate = View.inflate(context, i, this);
        this.c = (EditText) viewInflate.findViewById(R.id.tcp_tunnel_host);
        this.d = (EditText) viewInflate.findViewById(R.id.tcp_tunnel_local_port);
        this.e = (EditText) viewInflate.findViewById(R.id.tcp_tunnel_remote_port);
    }
}
