package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class he implements Comparator {
    public static final he b = new he(0);
    public final /* synthetic */ int a;

    public /* synthetic */ he(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCharValue;
        int iCharValue2;
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < iMin; i++) {
                    int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                    if (i2 != 0) {
                        return i2;
                    }
                }
                return bArr.length - bArr2.length;
            case 1:
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) obj).toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) obj2).toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase == lowerCase2) {
                    return 0;
                }
                return lowerCase.compareTo(lowerCase2);
            case 2:
                iCharValue = ((Character) ((rt0) obj).a).charValue();
                iCharValue2 = ((Character) ((rt0) obj2).a).charValue();
                break;
            case 3:
                long j = ((tj) obj).f;
                long j2 = ((tj) obj2).f;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 4:
                iCharValue = ((fu) obj).a;
                iCharValue2 = ((fu) obj2).a;
                break;
            case 5:
                q60 q60Var = (q60) obj;
                q60 q60Var2 = (q60) obj2;
                RecyclerView recyclerView = q60Var.d;
                if ((recyclerView == null) == (q60Var2.d == null)) {
                    boolean z = q60Var.a;
                    if (z == q60Var2.a) {
                        int i3 = q60Var2.b - q60Var.b;
                        if (i3 != 0) {
                            return i3;
                        }
                        int i4 = q60Var.c - q60Var2.c;
                        if (i4 != 0) {
                            return i4;
                        }
                        return 0;
                    }
                    if (z) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 6:
                iCharValue = ((r51) obj).d;
                iCharValue2 = ((r51) obj2).d;
                break;
            default:
                iCharValue = ((Integer) ((rt0) obj).a).intValue();
                iCharValue2 = ((Integer) ((rt0) obj2).a).intValue();
                break;
        }
        return iCharValue - iCharValue2;
    }
}
