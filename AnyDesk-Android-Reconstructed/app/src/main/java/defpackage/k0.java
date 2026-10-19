package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ec1 {
    public final /* synthetic */ int j;

    public /* synthetic */ k0(int i) {
        this.j = i;
    }

    public final boolean L(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((fz0) obj).equals((fz0) obj2);
            default:
                return Objects.equals((fl) obj, (fl) obj2);
        }
    }

    public final boolean M(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((fz0) obj).a.mId == ((fz0) obj2).a.mId;
            default:
                return ((fl) obj) == ((fl) obj2);
        }
    }
}
