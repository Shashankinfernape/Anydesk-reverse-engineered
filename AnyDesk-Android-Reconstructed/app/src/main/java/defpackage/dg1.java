package defpackage;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dg1 implements DownloadListener {
    public final /* synthetic */ WebViewActivity a;

    public dg1(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        WebViewActivity webViewActivity = this.a;
        if (t70.Q(webViewActivity, str, false)) {
            return;
        }
        if (er0.f() || r3.n(webViewActivity, webViewActivity.G, null)) {
            Logging logging = webViewActivity.C;
            xt0 xt0Var = webViewActivity.E;
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null || Objects.equals(t70.l(scheme), scheme)) {
                xt0Var.u(webViewActivity, JniAdExt.n1("ad.status.select_files.error.msg"));
                logging.a("URL scheme '" + scheme + "' is not accepted by DownloadManager");
                return;
            }
            String cookie = CookieManager.getInstance().getCookie(str);
            String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
            try {
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setMimeType(str4);
                request.addRequestHeader("cookie", cookie);
                request.addRequestHeader("User-Agent", str2);
                request.setDescription("Downloading File...");
                request.setTitle(strGuessFileName);
                if (Build.VERSION.SDK_INT < 29) {
                    request.allowScanningByMediaScanner();
                }
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                webViewActivity.F = ((DownloadManager) webViewActivity.getSystemService("download")).enqueue(request);
            } catch (Throwable th) {
                xt0Var.u(webViewActivity, JniAdExt.n1("ad.status.select_files.error.msg"));
                logging.b("error while downloading " + str, th);
            }
        }
    }
}
