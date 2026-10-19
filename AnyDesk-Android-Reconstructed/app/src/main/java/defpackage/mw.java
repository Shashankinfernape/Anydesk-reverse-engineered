package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mw extends y90 {
    public final /* synthetic */ nw i;

    public mw(nw nwVar) {
        this.i = nwVar;
    }

    @Override // defpackage.y90
    public final void M(Throwable th) {
        this.i.a.d(th);
    }

    @Override // defpackage.y90
    public final void P(ah ahVar) {
        nw nwVar = this.i;
        nwVar.c = ahVar;
        ah ahVar2 = nwVar.c;
        rw rwVar = nwVar.a;
        nwVar.b = new y6(ahVar2, rwVar.g, rwVar.i, Build.VERSION.SDK_INT >= 34 ? vw.a() : lk0.r());
        rw rwVar2 = nwVar.a;
        ArrayList arrayList = new ArrayList();
        rwVar2.a.writeLock().lock();
        try {
            rwVar2.c = 1;
            arrayList.addAll(rwVar2.b);
            rwVar2.b.clear();
            rwVar2.a.writeLock().unlock();
            rwVar2.d.post(new qi(arrayList, rwVar2.c, (Throwable) null));
        } catch (Throwable th) {
            rwVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
