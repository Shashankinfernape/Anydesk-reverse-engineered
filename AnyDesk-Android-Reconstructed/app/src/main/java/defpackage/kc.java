package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class kc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kc(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                mc mcVar = (mc) obj;
                pc pcVar = mcVar.J;
                pcVar.setSelection(i);
                if (pcVar.getOnItemClickListener() != null) {
                    pcVar.performItemClick(view, i, mcVar.G.getItemId(i));
                }
                mcVar.dismiss();
                break;
            case 1:
                ((bg0) obj).P0((ListView) adapterView, i);
                break;
            default:
                qj0 qj0Var = (qj0) obj;
                kg0 kg0Var = qj0Var.g;
                if (i < 0) {
                    item = !kg0Var.B.isShowing() ? null : kg0Var.e.getSelectedItem();
                } else {
                    item = qj0Var.getAdapter().getItem(i);
                }
                qj0.a(qj0Var, item);
                AdapterView.OnItemClickListener onItemClickListener = qj0Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !kg0Var.B.isShowing() ? null : kg0Var.e.getSelectedView();
                        i = !kg0Var.B.isShowing() ? -1 : kg0Var.e.getSelectedItemPosition();
                        j = !kg0Var.B.isShowing() ? Long.MIN_VALUE : kg0Var.e.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(kg0Var.e, view, i, j);
                }
                kg0Var.dismiss();
                break;
        }
    }
}
