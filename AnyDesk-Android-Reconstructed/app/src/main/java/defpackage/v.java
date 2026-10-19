package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements j6 {
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher b(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void e(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) obj.toString());
        sb.append((Object) " must implement IMainControl");
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void f(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    @Override // defpackage.j6
    public void c(Object obj) {
    }
}
