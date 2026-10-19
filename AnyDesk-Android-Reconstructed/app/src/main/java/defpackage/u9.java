package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u9 extends z7 {
    public h51 f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public u9(int i) {
        super(i);
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    @Override // defpackage.z7
    public final boolean a() {
        if (!this.i.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((t9) obj).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.z7
    public final boolean b() {
        if (!this.h.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((t9) obj).c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(ea eaVar, Object... objArr) {
        this.i.add(new fa(eaVar, objArr));
    }
}
