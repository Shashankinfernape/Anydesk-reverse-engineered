package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 extends DataSetObserver {
    public final /* synthetic */ kg0 a;

    public hg0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        kg0 kg0Var = this.a;
        if (kg0Var.B.isShowing()) {
            kg0Var.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
