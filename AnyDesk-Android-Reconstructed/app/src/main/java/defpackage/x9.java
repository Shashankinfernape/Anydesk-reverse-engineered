package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x9 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ x9(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.compare(((y9) obj).a.c, ((y9) obj2).a.c);
            case 1:
                return ((ce) obj).b.index() - ((ce) obj2).b.index();
            case 2:
                return ((ge) obj).c.index() - ((ge) obj2).c.index();
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}
