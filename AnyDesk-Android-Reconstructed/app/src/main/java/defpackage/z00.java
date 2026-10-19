package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z00 {
    public final /* synthetic */ int a;
    public String b;
    public final ArrayList c;

    public z00(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = "";
                this.c = new ArrayList();
                break;
            default:
                this.b = "";
                this.c = new ArrayList();
                break;
        }
    }

    public static boolean b(String str, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (!str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    public final void a(ArrayList arrayList) {
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList2 = this.c;
        switch (i) {
            case 0:
                String lowerCase = this.b.toLowerCase();
                if (lowerCase == null || lowerCase.isEmpty()) {
                    arrayList2.addAll(arrayList);
                } else {
                    String[] strArrSplit = lowerCase.split(" +");
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        j80 j80Var = (j80) obj;
                        if (j80Var.matchesFilter(strArrSplit)) {
                            arrayList2.add(j80Var);
                        }
                    }
                }
                break;
            default:
                String lowerCase2 = this.b.toLowerCase();
                if (lowerCase2 == null || lowerCase2.isEmpty()) {
                    arrayList2.addAll(arrayList);
                } else {
                    String[] strArrSplit2 = lowerCase2.split(" +");
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        String str = (String) obj2;
                        if (b(str.toLowerCase(), strArrSplit2)) {
                            arrayList2.add(str);
                        }
                    }
                }
                break;
        }
    }

    public abstract void c();

    public abstract void d();

    public final void e(String str) {
        String str2;
        String str3;
        int i = this.a;
        ArrayList arrayList = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                if (str != this.b) {
                    if (str == null || str.isEmpty() || ((str2 = this.b) != null && !str2.isEmpty() && !str.startsWith(this.b))) {
                        this.b = str;
                        d();
                    } else {
                        this.b = str;
                        String[] strArrSplit = str.toLowerCase().split(" +");
                        boolean z = false;
                        while (i2 < arrayList.size()) {
                            if (((j80) arrayList.get(i2)).matchesFilter(strArrSplit)) {
                                i2++;
                            } else {
                                arrayList.remove(i2);
                                z = true;
                            }
                        }
                        if (z) {
                            c();
                        }
                    }
                    break;
                }
                break;
            default:
                if (str != this.b) {
                    if (str == null || str.isEmpty() || ((str3 = this.b) != null && !str3.isEmpty() && !str.startsWith(this.b))) {
                        this.b = str;
                        d();
                    } else {
                        this.b = str;
                        String[] strArrSplit2 = str.toLowerCase().split(" +");
                        boolean z2 = false;
                        while (i2 < arrayList.size()) {
                            if (b(((String) arrayList.get(i2)).toLowerCase(), strArrSplit2)) {
                                i2++;
                            } else {
                                arrayList.remove(i2);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            c();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
