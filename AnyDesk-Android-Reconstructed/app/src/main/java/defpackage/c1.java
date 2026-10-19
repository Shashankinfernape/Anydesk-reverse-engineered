package defpackage;

import android.view.View;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements View.OnClickListener {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f1 d;

    public c1(f1 f1Var, boolean z) {
        this.d = f1Var;
        this.c = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = ((Chip) view).getText().toString();
        boolean z = this.c;
        f1 f1Var = this.d;
        if (z) {
            f1.T0(f1Var, string);
        } else {
            f1Var.U0(string);
        }
    }
}
