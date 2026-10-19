package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends qe0 implements o50 {
    public static final o6 e;
    public static final o6 f;
    public static final o6 g;
    public static final o6 h;
    public final /* synthetic */ int d;

    static {
        int i = 0;
        e = new o6(i, 0);
        f = new o6(i, 1);
        g = new o6(i, 2);
        h = new o6(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // defpackage.o50
    public final Object a() {
        switch (this.d) {
            case 0:
                zv0 zv0Var = aw0.c;
                return Integer.valueOf(aw0.d.a().nextInt(2147418112) + 65536);
            case 1:
                return new Handler(Looper.getMainLooper());
            case 2:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new u80(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return t80.a;
                }
            default:
                return null;
        }
    }
}
