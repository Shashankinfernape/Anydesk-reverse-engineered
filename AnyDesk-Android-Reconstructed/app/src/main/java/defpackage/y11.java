package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y11 extends z00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ c40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y11(int i, c40 c40Var) {
        super(1);
        this.d = i;
        this.e = c40Var;
    }

    @Override // defpackage.z00
    public final void c() {
        int i = this.d;
        c40 c40Var = this.e;
        switch (i) {
            case 0:
                s sVar = ((z11) c40Var).u0;
                if (sVar != null) {
                    sVar.d();
                    break;
                }
                break;
            default:
                gb1 gb1Var = ((TraceFragment) c40Var).e0;
                if (gb1Var != null) {
                    gb1Var.d();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z00
    public final void d() {
        int i = this.d;
        c40 c40Var = this.e;
        ArrayList arrayList = this.c;
        switch (i) {
            case 0:
                arrayList.clear();
                a(((z11) c40Var).v0);
                c();
                break;
            default:
                arrayList.clear();
                a(((TraceFragment) c40Var).d0);
                c();
                break;
        }
    }
}
