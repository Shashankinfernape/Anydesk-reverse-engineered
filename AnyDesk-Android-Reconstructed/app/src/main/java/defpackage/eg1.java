package defpackage;

import android.webkit.JavascriptInterface;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class eg1 {
    public final /* synthetic */ WebViewActivity a;

    public eg1(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    public static String injectPrintSupport() {
        return gr0.f("window.print=function(){", eg1.class.getSimpleName(), ".print();}");
    }

    @JavascriptInterface
    public void print() {
        t70.Y(new l(20, this));
    }
}
