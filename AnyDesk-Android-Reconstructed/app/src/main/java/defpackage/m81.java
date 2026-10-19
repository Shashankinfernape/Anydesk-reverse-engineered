package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m81 extends iw0 {
    public List d = Collections.EMPTY_LIST;
    public ez0 e = null;
    public int f = 1;

    public m81() {
        h();
    }

    @Override // defpackage.iw0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.iw0
    public final long b(int i) {
        return ((n81) this.d.get(i)).a.hashCode();
    }

    @Override // defpackage.iw0
    public final int c(int i) {
        return 0;
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        n81 n81Var = (n81) this.d.get(i);
        TextView textView = ((l81) hx0Var).u;
        textView.setText(n81Var.a);
        if (this.f == 2) {
            textView.setTextSize(16.0f);
            textView.setPadding(12, 6, 12, 6);
        }
        textView.setActivated(n81Var.b);
        textView.setOnClickListener(new p(this, 18, n81Var));
        textView.setOnLongClickListener(new q(this, n81Var, 9));
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new l81(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abook_tag, viewGroup, false));
    }
}
