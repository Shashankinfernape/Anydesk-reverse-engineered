package defpackage;

import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements ToIntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((n81) obj).a.length();
            case 1:
                return ((t9) obj).l;
            case 2:
                return ((q9) obj).a;
            default:
                return ((q9) obj).a;
        }
    }
}
