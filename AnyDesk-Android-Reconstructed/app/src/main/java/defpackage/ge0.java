package defpackage;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public final class ge0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ je0 c;

    public ge0(je0 je0Var, int i, int i2) {
        this.c = je0Var;
        this.a = i;
        this.b = i2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        je0 je0Var = this.c;
        ro roVar = je0Var.c;
        int i = this.b;
        int i2 = this.a;
        if (z) {
            if (roVar != null) {
                roVar.b(i2, je0Var.d);
            }
            je0Var.e |= i;
        } else {
            if (roVar != null) {
                roVar.d(i2, je0Var.d);
            }
            je0Var.e &= ~i;
        }
    }
}
