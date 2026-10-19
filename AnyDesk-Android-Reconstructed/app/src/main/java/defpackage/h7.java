package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {
    public int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public h7(r71 r71Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = r71Var;
        int iY = r71Var.y();
        this.a = iY;
        int iX = r71Var.x();
        this.b = iX;
        this.c = true;
        fu fuVar = arrayList.isEmpty() ? null : (fu) arrayList.get(0);
        if (fuVar == null || fuVar.a != 0 || fuVar.b != 0) {
            arrayList.add(0, new fu(0, 0, 0));
        }
        arrayList.add(new fu(iY, iX, 0));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            fu fuVar2 = (fu) obj;
            for (int i4 = 0; i4 < fuVar2.c; i4++) {
                int i5 = fuVar2.a + i4;
                int i6 = fuVar2.b + i4;
                int i7 = r71Var.c(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.c) {
            int size2 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                fu fuVar3 = (fu) obj2;
                while (true) {
                    i = fuVar3.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size3 = arrayList.size();
                            int i10 = 0;
                            for (int i11 = 0; i11 < size3; i11++) {
                                fu fuVar4 = (fu) arrayList.get(i11);
                                while (true) {
                                    i2 = fuVar4.b;
                                    if (i10 < i2) {
                                        if (iArr2[i10] == 0 && r71Var.d(i8, i10)) {
                                            int i12 = r71Var.c(i8, i10) ? 8 : 4;
                                            iArr[i8] = (i10 << 4) | i12;
                                            iArr2[i10] = i12 | (i8 << 4);
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                i10 = fuVar4.c + i2;
                            }
                        }
                        i8++;
                    }
                }
                i8 = fuVar3.c + i;
            }
        }
    }

    public static d80 a(h7 h7Var) {
        int i;
        d80 d80Var;
        synchronized (h7Var) {
            while (true) {
                i = h7Var.b;
                if (i > 0 || h7Var.c) {
                    break;
                }
                try {
                    h7Var.wait();
                } catch (InterruptedException unused) {
                }
            }
            d80Var = null;
            if (!h7Var.c && i > 0) {
                d80[] d80VarArr = (d80[]) h7Var.d;
                int i2 = h7Var.a;
                d80 d80Var2 = d80VarArr[i2];
                h7Var.a = (i2 + 1) % d80VarArr.length;
                h7Var.b = i - 1;
                ((d80) h7Var.g).a(d80Var2);
                h7Var.notifyAll();
                d80Var = (d80) h7Var.g;
            }
        }
        return d80Var;
    }

    public static gu f(ArrayDeque arrayDeque, int i, boolean z) {
        gu guVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                guVar = null;
                break;
            }
            guVar = (gu) it.next();
            if (guVar.a == i && guVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            gu guVar2 = (gu) it.next();
            if (z) {
                guVar2.b--;
            } else {
                guVar2.b++;
            }
        }
        return guVar;
    }

    public synchronized void b() {
        this.b++;
        notifyAll();
    }

    public int c(int i) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            id.h("Index out of bounds - passed position = ", i, ", old list size = ", i2);
            return 0;
        }
        int i3 = ((int[]) this.e)[i];
        if ((i3 & 15) == 0) {
            return -1;
        }
        return i3 >> 4;
    }

    public void d(lg0 lg0Var) {
        int[] iArr;
        int[] iArr2 = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.a;
        r71 r71Var = (r71) this.g;
        ig igVar = lg0Var instanceof ig ? (ig) lg0Var : new ig(lg0Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = this.b;
        int size = arrayList.size() - 1;
        int i3 = i2;
        int i4 = i;
        while (size >= 0) {
            fu fuVar = (fu) arrayList.get(size);
            int i5 = fuVar.a;
            int i6 = fuVar.c;
            int i7 = i5 + i6;
            int i8 = fuVar.b;
            int i9 = i8 + i6;
            while (i4 > i7) {
                i4--;
                int i10 = iArr2[i4];
                if ((i10 & 12) != 0) {
                    iArr = iArr2;
                    int i11 = i10 >> 4;
                    gu guVarF = f(arrayDeque, i11, false);
                    if (guVarF != null) {
                        int i12 = (i - guVarF.b) - 1;
                        igVar.d(i4, i12);
                        if ((i10 & 4) != 0) {
                            igVar.b(r71Var.s(i4, i11), i12, 1);
                        }
                    } else {
                        arrayDeque.add(new gu(i4, (i - i4) - 1, true));
                    }
                } else {
                    iArr = iArr2;
                    igVar.c(i4, 1);
                    i--;
                }
                arrayList = arrayList;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            while (i3 > i9) {
                i3--;
                int i13 = ((int[]) this.f)[i3];
                if ((i13 & 12) != 0) {
                    int i14 = i13 >> 4;
                    gu guVarF2 = f(arrayDeque, i14, true);
                    if (guVarF2 == null) {
                        arrayDeque.add(new gu(i3, i - i4, false));
                    } else {
                        igVar.d((i - guVarF2.b) - 1, i4);
                        if ((i13 & 4) != 0) {
                            igVar.b(r71Var.s(i14, i3), i4, 1);
                        }
                    }
                } else {
                    igVar.n(i4, 1);
                    i++;
                }
            }
            int i15 = i8;
            int i16 = i5;
            for (int i17 = 0; i17 < i6; i17++) {
                if ((iArr3[i16] & 15) == 2) {
                    igVar.b(r71Var.s(i16, i15), i16, 1);
                }
                i16++;
                i15++;
            }
            size--;
            i3 = i8;
            i4 = i5;
            arrayList = arrayList2;
            iArr2 = iArr3;
        }
        igVar.a();
    }

    public synchronized d80 e() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        d80[] d80VarArr = (d80[]) this.d;
        return d80VarArr[((this.a + i) - 1) % d80VarArr.length];
    }

    public synchronized d80 g() {
        if (this.c) {
            return null;
        }
        do {
            int i = this.b;
            d80[] d80VarArr = (d80[]) this.d;
            if (i < d80VarArr.length) {
                return d80VarArr[(this.a + i) % d80VarArr.length];
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        } while (!this.c);
        return null;
    }

    public h7(int i, fw fwVar, g7 g7Var, String str) {
        d80[] d80VarArr;
        switch (fwVar.c) {
            case 21:
                d80VarArr = new a70[i];
                break;
            default:
                d80VarArr = new k90[i];
                break;
        }
        this.d = d80VarArr;
        for (int i2 = 0; i2 < i; i2++) {
            ((d80[]) this.d)[i2] = (d80) fwVar.b();
        }
        this.e = g7Var;
        f7 f7Var = new f7(this, str);
        this.f = f7Var;
        this.g = (d80) fwVar.b();
        this.c = false;
        this.a = 0;
        this.b = 0;
        f7Var.start();
    }
}
