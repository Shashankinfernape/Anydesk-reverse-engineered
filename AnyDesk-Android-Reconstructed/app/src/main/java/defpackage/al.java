package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class al extends ve1 {
    public final int b;
    public final yk c = new dd0() { // from class: yk
        @Override // defpackage.dd0
        public final void b(int i, boolean z) {
            al alVar = this.c;
            if (alVar.b == i) {
                alVar.h.i(Boolean.FALSE);
            }
        }
    };
    public final zk d = new zk(this);
    public int e = 0;
    public ArrayList f;
    public final vm0 g;
    public final vm0 h;
    public final nk0 i;
    public final yz0 j;

    /* JADX WARN: Type inference failed for: r0v0, types: [yk] */
    public al(yz0 yz0Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = new vm0(arrayList);
        vm0 vm0Var = new vm0(Boolean.FALSE);
        this.h = vm0Var;
        this.j = yz0Var;
        Integer num = (Integer) yz0Var.a("session_idx");
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        this.b = iIntValue;
        this.i = th1.D(iIntValue == 0 ? MainApplication.v().r.x : vm0Var, new a0(2));
    }
}
