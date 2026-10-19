package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kt implements ht {
    public final hg1 d;
    public int f;
    public int g;
    public hg1 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public mu i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public kt(hg1 hg1Var) {
        this.d = hg1Var;
    }

    @Override // defpackage.ht
    public final void a(ht htVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((kt) obj).j) {
                return;
            }
        }
        this.c = true;
        hg1 hg1Var = this.a;
        if (hg1Var != null) {
            hg1Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        kt ktVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            kt ktVar2 = (kt) obj2;
            if (!(ktVar2 instanceof mu)) {
                i++;
                ktVar = ktVar2;
            }
        }
        if (ktVar != null && i == 1 && ktVar.j) {
            mu muVar = this.i;
            if (muVar != null) {
                if (!muVar.j) {
                    return;
                } else {
                    this.f = this.h * muVar.g;
                }
            }
            d(ktVar.g + this.f);
        }
        hg1 hg1Var2 = this.a;
        if (hg1Var2 != null) {
            hg1Var2.a(this);
        }
    }

    public final void b(hg1 hg1Var) {
        this.k.add(hg1Var);
        if (this.j) {
            hg1Var.a(hg1Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ht htVar = (ht) obj;
            htVar.a(htVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
