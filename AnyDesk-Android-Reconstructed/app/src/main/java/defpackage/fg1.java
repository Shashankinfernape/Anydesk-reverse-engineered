package defpackage;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import j$.util.Objects;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class fg1 extends WebViewClient {
    public final /* synthetic */ WebViewActivity a;

    public fg1(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    public final boolean a(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String string = uri.toString();
        boolean zEquals = "https".equals(scheme);
        WebViewActivity webViewActivity = this.a;
        if (!(zEquals && (host == null || host.contains("anydesk"))) && t70.Q(webViewActivity, string, false)) {
            return true;
        }
        webViewActivity.setTitle(string);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.evaluateJavascript(eg1.injectPrintSupport(), null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        if (primaryError != 3) {
            this.a.C.a("SSL error " + primaryError + " when receiving web certificate " + sslError.getCertificate());
            sslErrorHandler.cancel();
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            InputStream inputStreamOpenRawResource = webView.getContext().getResources().openRawResource(R.raw.isrg_root_x1);
            if (Objects.equals(t70.l("https://valid-isrgrootx1.letsencrypt.org"), "https://valid-isrgrootx1.letsencrypt.org")) {
                sslErrorHandler.cancel();
                return;
            }
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpenRawResource);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry("isrg_root_x1", certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL("https://valid-isrgrootx1.letsencrypt.org").openConnection();
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                w81.b.a(new c0(httpsURLConnection, 15, sslErrorHandler));
            } catch (Throwable th) {
                y90.h.b("failed to send web request", th);
                sslErrorHandler.cancel();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }
}
