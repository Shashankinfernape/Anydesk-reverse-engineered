package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ List c;
    public final /* synthetic */ iz d;

    public fz(iz izVar, ArrayList arrayList) {
        this.d = izVar;
        this.c = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        iz izVar = this.d;
        izVar.w0 = i;
        iz.U0(izVar, (String) this.c.get(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
