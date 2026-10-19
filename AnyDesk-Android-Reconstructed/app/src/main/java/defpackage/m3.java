package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends ClickableSpan {
    public final int c;
    public final w3 d;
    public final int e;

    public m3(int i, w3 w3Var, int i2) {
        this.c = i;
        this.d = w3Var;
        this.e = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.c);
        this.d.a.performAction(this.e, bundle);
    }
}
