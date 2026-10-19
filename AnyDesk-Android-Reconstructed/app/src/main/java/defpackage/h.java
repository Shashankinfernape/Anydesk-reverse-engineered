package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends z00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ c40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, c40 c40Var) {
        super(0);
        this.d = i;
        this.e = c40Var;
    }

    @Override // defpackage.z00
    public final void c() {
        int i = this.d;
        c40 c40Var = this.e;
        switch (i) {
            case 0:
                s sVar = ((i) c40Var).t0;
                if (sVar != null) {
                    sVar.d();
                    break;
                }
                break;
            case 1:
                uz uzVar = ((FileManagerFileListFragment) c40Var).j0;
                if (uzVar != null) {
                    uzVar.d();
                    break;
                }
                break;
            case 2:
                k61 k61Var = ((MainFragment) c40Var).z0;
                if (k61Var != null) {
                    k61Var.d();
                }
                break;
            default:
                s sVar2 = ((j21) c40Var).t0;
                if (sVar2 != null) {
                    sVar2.d();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z00
    public final void d() {
        int i = this.d;
        ArrayList arrayList = this.c;
        c40 c40Var = this.e;
        switch (i) {
            case 0:
                arrayList.clear();
                a(((i) c40Var).u0);
                c();
                break;
            case 1:
                arrayList.clear();
                a(((FileManagerFileListFragment) c40Var).i0);
                c();
                break;
            case 2:
                ((MainFragment) c40Var).Y0();
                break;
            default:
                arrayList.clear();
                a(((j21) c40Var).u0);
                c();
                break;
        }
    }
}
