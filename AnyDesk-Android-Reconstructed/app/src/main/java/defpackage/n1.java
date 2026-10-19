package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements wc0 {
    public final /* synthetic */ long c;
    public final /* synthetic */ RosterItemFilter d;
    public final /* synthetic */ q1 e;
    public final /* synthetic */ kr f;
    public final /* synthetic */ xi g;

    public n1(long j, RosterItemFilter rosterItemFilter, q1 q1Var, kr krVar, xi xiVar) {
        this.c = j;
        this.d = rosterItemFilter;
        this.e = q1Var;
        this.f = krVar;
        this.g = xiVar;
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.wc0
    public final void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
        rosterItemFilter.getClass();
        rosterItemArr.getClass();
        if (j == this.c && rosterItemFilter.equals(this.d)) {
            Logging.f(7, this.e.g.a, "RES roster " + j + " filter " + rosterItemFilter + " items " + rosterItemArr.length + " total " + i);
            JniAdExt.S3(this);
            pd0 pd0Var = (pd0) this.f.f().l(fw.f);
            if (pd0Var != null ? pd0Var.a() : true) {
                this.g.g(new j1(i, ae.V(rosterItemArr)));
            }
        }
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void w() {
    }
}
