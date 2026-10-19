package com.anydesk.anydeskandroid;

import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.ds;
import defpackage.gq0;
import defpackage.t70;
import defpackage.tb0;
import defpackage.ua0;

/* JADX INFO: loaded from: classes.dex */
public class AdVpnService extends VpnService {
    public static AdVpnService e;
    public final Logging c = new Logging("AdVpnService");
    public ParcelFileDescriptor d;

    public final boolean a() {
        try {
            new gq0(getApplicationContext());
            startForeground(500, gq0.h(getApplicationContext()));
            e = this;
            return true;
        } catch (SecurityException e2) {
            String str = "cannot start vpn service: " + e2.getMessage();
            int i = Build.VERSION.SDK_INT;
            Logging logging = this.c;
            if (i >= 26) {
                logging.c(str);
            } else {
                logging.a(str);
            }
            b(true);
            return false;
        }
    }

    public final void b(boolean z) {
        ds.e(this.d);
        this.d = null;
        t70.h0(this);
        e = null;
        if (z) {
            stopSelf();
        }
        MainApplication.v().E(getClass());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        b(false);
    }

    @Override // android.net.VpnService
    public final void onRevoke() {
        b(true);
        super.onRevoke();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String string;
        Logging logging = this.c;
        if (intent == null) {
            logging.a("missing start command");
            b(true);
            return 2;
        }
        if ("disconnect".equals(intent.getAction())) {
            logging.e("stopping service");
            b(true);
            return 2;
        }
        if ("start".equals(intent.getAction())) {
            if (a()) {
                JniAdExt.I0.post(new tb0(22));
                MainApplication.v().F(getClass());
                return 1;
            }
        } else {
            if (!"connect".equals(intent.getAction())) {
                if (!"incoming".equals(intent.getAction())) {
                    logging.a("got invalid command: " + intent.getAction());
                    b(true);
                    return 2;
                }
                int i3 = MainApplication.v().D;
                if (!a()) {
                    JniAdExt.P3(i3, false);
                    return 2;
                }
                JniAdExt.P3(i3, true);
                MainApplication.v().F(getClass());
                return 1;
            }
            if (a()) {
                Bundle extras = intent.getExtras();
                if (extras != null && (string = extras.getString("addr")) != null) {
                    JniAdExt.I0.post(new ua0(string, 7));
                }
                MainApplication.v().F(getClass());
                return 1;
            }
        }
        return 2;
    }
}
