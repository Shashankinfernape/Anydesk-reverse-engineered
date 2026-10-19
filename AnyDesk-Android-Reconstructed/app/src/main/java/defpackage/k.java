package defpackage;

import android.content.DialogInterface;
import android.widget.Button;
import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt b;

    public /* synthetic */ k(yt ytVar, int i) {
        this.a = i;
        this.b = ytVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        yt ytVar = this.b;
        switch (i) {
            case 0:
                ((w7) dialogInterface).d(-1).setOnClickListener(new m(0, (o) ytVar));
                break;
            default:
                tp0 tp0Var = (tp0) ytVar;
                w7 w7Var = tp0Var.q0;
                if (w7Var != null) {
                    Button buttonD = w7Var.d(-3);
                    tp0Var.r0 = buttonD;
                    buttonD.setOnClickListener(new m(5, tp0Var));
                }
                cj0 cj0Var = MainApplication.v().u;
                cj0Var.f.e(tp0Var, new y2(6, tp0Var));
                break;
        }
    }
}
