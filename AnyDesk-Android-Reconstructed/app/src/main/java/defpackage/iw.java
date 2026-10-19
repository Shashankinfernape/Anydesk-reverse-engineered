package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class iw implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ kw f;

    public /* synthetic */ iw(kw kwVar, TextView textView, TextView textView2, int i) {
        this.c = i;
        this.f = kwVar;
        this.d = textView;
        this.e = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        TextView textView = this.e;
        kw kwVar = this.f;
        TextView textView2 = this.d;
        switch (i) {
            case 0:
                textView2.setVisibility(8);
                kwVar.y0.setVisibility(8);
                textView.setVisibility(8);
                kwVar.z0.setVisibility(8);
                break;
            default:
                textView2.setVisibility(0);
                kwVar.y0.setVisibility(0);
                textView.setVisibility(0);
                kwVar.z0.setVisibility(0);
                break;
        }
    }
}
