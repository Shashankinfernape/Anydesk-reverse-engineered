package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ u7 c;
    public final /* synthetic */ r7 d;

    public q7(r7 r7Var, u7 u7Var) {
        this.d = r7Var;
        this.c = u7Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        r7 r7Var = this.d;
        DialogInterface.OnClickListener onClickListener = r7Var.p;
        u7 u7Var = this.c;
        onClickListener.onClick(u7Var.b, i);
        if (r7Var.r) {
            return;
        }
        u7Var.b.dismiss();
    }
}
