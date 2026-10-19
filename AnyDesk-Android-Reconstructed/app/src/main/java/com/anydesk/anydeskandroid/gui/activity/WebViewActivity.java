package com.anydesk.anydeskandroid.gui.activity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.dg1;
import defpackage.eg1;
import defpackage.fg1;
import defpackage.i4;
import defpackage.l40;
import defpackage.lb1;
import defpackage.mb;
import defpackage.p6;
import defpackage.t70;
import defpackage.us0;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivity extends lb1 {
    public WebView D;
    public final Logging C = new Logging("WebViewActivity");
    public final xt0 E = new xt0(this);
    public long F = -1;
    public final p6 G = (p6) V(new us0(25), new i4(1));
    public final l40 H = new l40(this, 3);
    public final mb I = new mb(2, this);

    public final void i0(WebView webView) {
        WebHistoryItem itemAtIndex;
        if (!webView.canGoBack()) {
            finish();
            return;
        }
        WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
        setTitle((webBackForwardListCopyBackForwardList.getCurrentIndex() <= 0 || (itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + (-1))) == null) ? "about:blank" : itemAtIndex.getUrl());
        webView.goBack();
    }

    @Override // defpackage.qa, defpackage.co, defpackage.bo, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_web_view);
        h0((Toolbar) findViewById(R.id.webview_toolbar));
        fg1 fg1Var = new fg1(this);
        int i = Build.VERSION.SDK_INT;
        mb mbVar = this.I;
        if (i >= 34) {
            registerReceiver(mbVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
        } else {
            registerReceiver(mbVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
        WebView webView = (WebView) findViewById(R.id.webview_content);
        this.D = webView;
        WebSettings settings = webView.getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        this.D.setWebViewClient(fg1Var);
        this.D.setDownloadListener(new dg1(this));
        this.D.addJavascriptInterface(new eg1(this), eg1.class.getSimpleName());
        T().a(this, this.H);
        if (bundle != null) {
            this.D.restoreState(bundle);
            setTitle(this.D.getUrl());
            return;
        }
        Intent intent = getIntent();
        WebView webView2 = this.D;
        if (webView2 == null || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("param_url", "about:blank");
        setTitle(string);
        webView2.loadUrl(string);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_webview_action_bar, menu);
        menu.findItem(R.id.action_copy_address).setTitle(JniAdExt.n1("ad.connect.share.clipboard"));
        menu.findItem(R.id.action_close).setTitle(JniAdExt.n1("ad.cfg.close"));
        return true;
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.I);
        this.D = null;
    }

    @Override // defpackage.qa, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView = this.D;
        if (webView == null) {
            finish();
        } else if (i == 4) {
            i0(webView);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.co, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bundle extras;
        super.onNewIntent(intent);
        WebView webView = this.D;
        if (webView == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("param_url", "about:blank");
        setTitle(string);
        webView.loadUrl(string);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_copy_address) {
            if (menuItem.getItemId() != R.id.action_close) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        WebView webView = this.D;
        if (webView != null && t70.d0(this, "AnyDesk", webView.getUrl(), null)) {
            this.E.u(this, JniAdExt.n1("ad.status.tooltip.clipboard_text.android"));
        }
        return true;
    }

    @Override // defpackage.co, defpackage.bo, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WebView webView = this.D;
        if (webView == null) {
            return;
        }
        webView.saveState(bundle);
    }
}
