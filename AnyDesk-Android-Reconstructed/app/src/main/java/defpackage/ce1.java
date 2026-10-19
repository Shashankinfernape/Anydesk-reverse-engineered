package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends ij0 {
    public final /* synthetic */ int g;

    public ce1(int i, Class cls, int i2, int i3, int i4) {
        this.g = i4;
        this.c = i;
        this.f = cls;
        this.e = i2;
        this.d = i3;
    }

    @Override // defpackage.ij0
    public final Object c(View view) {
        switch (this.g) {
            case 0:
                return Boolean.valueOf(je1.c(view));
            case 1:
                return je1.a(view);
            default:
                return Boolean.valueOf(je1.b(view));
        }
    }

    @Override // defpackage.ij0
    public final void d(View view, Object obj) {
        switch (this.g) {
            case 0:
                je1.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                je1.e(view, (CharSequence) obj);
                break;
            default:
                je1.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.ij0
    public final boolean g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
