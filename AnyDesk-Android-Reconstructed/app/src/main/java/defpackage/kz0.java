package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 {
    public hg1 a;
    public ArrayList b;

    public static long a(kt ktVar, long j) {
        hg1 hg1Var = ktVar.d;
        ArrayList arrayList = ktVar.k;
        if (hg1Var instanceof u70) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ht htVar = (ht) arrayList.get(i);
            if (htVar instanceof kt) {
                kt ktVar2 = (kt) htVar;
                if (ktVar2.d != hg1Var) {
                    jMin = Math.min(jMin, a(ktVar2, ((long) ktVar2.f) + j));
                }
            }
        }
        kt ktVar3 = hg1Var.i;
        kt ktVar4 = hg1Var.h;
        if (ktVar != ktVar3) {
            return jMin;
        }
        long j2 = j - hg1Var.j();
        return Math.min(Math.min(jMin, a(ktVar4, j2)), j2 - ((long) ktVar4.f));
    }

    public static long b(kt ktVar, long j) {
        hg1 hg1Var = ktVar.d;
        ArrayList arrayList = ktVar.k;
        if (hg1Var instanceof u70) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ht htVar = (ht) arrayList.get(i);
            if (htVar instanceof kt) {
                kt ktVar2 = (kt) htVar;
                if (ktVar2.d != hg1Var) {
                    jMax = Math.max(jMax, b(ktVar2, ((long) ktVar2.f) + j));
                }
            }
        }
        kt ktVar3 = hg1Var.h;
        kt ktVar4 = hg1Var.i;
        if (ktVar != ktVar3) {
            return jMax;
        }
        long j2 = hg1Var.j() + j;
        return Math.max(Math.max(jMax, b(ktVar4, j2)), j2 - ((long) ktVar4.f));
    }
}
