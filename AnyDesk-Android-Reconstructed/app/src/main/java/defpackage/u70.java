package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u70 extends hg1 {
    @Override // defpackage.ht
    public final void a(ht htVar) {
        zf zfVar = (zf) this.b;
        int i = zfVar.s0;
        kt ktVar = this.h;
        ArrayList arrayList = ktVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i5 = ((kt) obj).g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            ktVar.d(i4 + zfVar.u0);
        } else {
            ktVar.d(i2 + zfVar.u0);
        }
    }

    @Override // defpackage.hg1
    public final void d() {
        bq bqVar = this.b;
        if (bqVar instanceof zf) {
            kt ktVar = this.h;
            ktVar.b = true;
            ArrayList arrayList = ktVar.l;
            zf zfVar = (zf) bqVar;
            int i = zfVar.s0;
            boolean z = zfVar.t0;
            int i2 = 0;
            if (i == 0) {
                ktVar.e = 4;
                while (i2 < zfVar.r0) {
                    bq bqVar2 = zfVar.q0[i2];
                    if (z || bqVar2.g0 != 8) {
                        kt ktVar2 = bqVar2.d.h;
                        ktVar2.k.add(ktVar);
                        arrayList.add(ktVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                ktVar.e = 5;
                while (i2 < zfVar.r0) {
                    bq bqVar3 = zfVar.q0[i2];
                    if (z || bqVar3.g0 != 8) {
                        kt ktVar3 = bqVar3.d.i;
                        ktVar3.k.add(ktVar);
                        arrayList.add(ktVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                ktVar.e = 6;
                while (i2 < zfVar.r0) {
                    bq bqVar4 = zfVar.q0[i2];
                    if (z || bqVar4.g0 != 8) {
                        kt ktVar4 = bqVar4.e.h;
                        ktVar4.k.add(ktVar);
                        arrayList.add(ktVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            ktVar.e = 7;
            while (i2 < zfVar.r0) {
                bq bqVar5 = zfVar.q0[i2];
                if (z || bqVar5.g0 != 8) {
                    kt ktVar5 = bqVar5.e.i;
                    ktVar5.k.add(ktVar);
                    arrayList.add(ktVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.hg1
    public final void e() {
        bq bqVar = this.b;
        if (bqVar instanceof zf) {
            int i = ((zf) bqVar).s0;
            kt ktVar = this.h;
            if (i == 0 || i == 1) {
                bqVar.Y = ktVar.g;
            } else {
                bqVar.Z = ktVar.g;
            }
        }
    }

    @Override // defpackage.hg1
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.hg1
    public final boolean k() {
        return false;
    }

    public final void m(kt ktVar) {
        kt ktVar2 = this.h;
        ktVar2.k.add(ktVar);
        ktVar.l.add(ktVar2);
    }
}
