package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends iw0 {
    public ArrayList d = new ArrayList();

    @Override // defpackage.iw0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        sp0 sp0Var = (sp0) hx0Var;
        qp0 qp0Var = (qp0) this.d.get(i);
        View view = sp0Var.u;
        TextView textView = sp0Var.w;
        TextView textView2 = sp0Var.v;
        boolean z = qp0Var.a;
        String str = qp0Var.c;
        view.setVisibility(z ? 0 : 4);
        textView2.setText(qp0Var.b);
        textView2.setTypeface(null, qp0Var.a ? 1 : 0);
        if (str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new sp0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.network_info_busy_item, viewGroup, false));
    }
}
