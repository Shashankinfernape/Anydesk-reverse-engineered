package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;

/* JADX INFO: loaded from: classes.dex */
public final class db1 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ TraceFragment d;

    public /* synthetic */ db1(TraceFragment traceFragment, int i) {
        this.c = i;
        this.d = traceFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        TraceFragment traceFragment = this.d;
        switch (i) {
            case 0:
                TraceFragment.R0(traceFragment, 1);
                break;
            default:
                TraceFragment.R0(traceFragment, 2);
                break;
        }
    }
}
