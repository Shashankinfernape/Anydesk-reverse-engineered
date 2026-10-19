package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ f1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(f1 f1Var, int i) {
        super(1);
        this.d = i;
        this.e = f1Var;
    }

    @Override // defpackage.z00
    public final void c() {
        int i = this.d;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                f1.S0(f1Var, false);
                break;
            default:
                f1.S0(f1Var, true);
                break;
        }
    }

    @Override // defpackage.z00
    public final void d() {
        int i = this.d;
        f1 f1Var = this.e;
        ArrayList arrayList = this.c;
        switch (i) {
            case 0:
                arrayList.clear();
                a(f1Var.z0);
                c();
                break;
            default:
                arrayList.clear();
                a(f1Var.y0);
                c();
                break;
        }
    }
}
