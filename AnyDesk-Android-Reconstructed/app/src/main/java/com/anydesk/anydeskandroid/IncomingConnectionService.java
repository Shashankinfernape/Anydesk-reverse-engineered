package com.anydesk.anydeskandroid;

import android.animation.TimeAnimator;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.ev;
import defpackage.gq0;
import defpackage.mr0;
import defpackage.n11;
import defpackage.nm0;
import defpackage.su0;
import defpackage.t70;

/* JADX INFO: loaded from: classes.dex */
public class IncomingConnectionService extends Service {
    public mr0 d;
    public nm0 e;
    public Handler f;
    public boolean h;
    public final Logging c = new Logging("IncomingConnectionService");
    public final PointF g = new PointF(0.0f, 0.0f);
    public ev i = new ev(12, this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new Handler(Looper.getMainLooper());
        this.d = new mr0(this);
        JniAdExt.H = this.i;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f = null;
        JniAdExt.H = null;
        this.i = null;
        mr0 mr0Var = this.d;
        this.d = null;
        if (mr0Var != null) {
            mr0Var.b();
            su0 su0Var = mr0Var.d;
            mr0Var.d = null;
            if (su0Var != null) {
                su0Var.n = null;
                TimeAnimator timeAnimator = su0Var.f;
                if (timeAnimator != null) {
                    timeAnimator.cancel();
                }
                TimeAnimator timeAnimator2 = su0Var.f;
                su0Var.f = null;
                if (timeAnimator2 != null) {
                    timeAnimator2.setTimeListener(null);
                }
            }
        }
        MainApplication.v().E(getClass());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        n11 n11Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Bundle extras;
        long j = 0;
        if (intent == null || (extras = intent.getExtras()) == null) {
            n11Var = n11.d;
            str = "unknown";
            str2 = null;
            str3 = null;
            bArr = null;
            i3 = 0;
            i4 = 0;
            z = false;
            z2 = false;
        } else {
            int i5 = extras.getInt("session_idx", 0);
            String string = extras.getString("name", "unknown");
            j = extras.getLong("cid", 0L);
            String string2 = extras.getString("alias", null);
            boolean z3 = extras.getBoolean("verified", false);
            String string3 = extras.getString("addr", null);
            byte[] byteArray = extras.getByteArray("imgdata");
            n11Var = (n11) t70.A(extras, "features", n11.class);
            int i6 = extras.getInt("fgs_type", 0);
            str = string;
            str3 = string3;
            z2 = extras.getBoolean("screen_capture_lost", false);
            i4 = i5;
            str2 = string2;
            z = z3;
            bArr = byteArray;
            i3 = i6;
        }
        long j2 = j;
        n11 n11Var2 = n11Var;
        MainApplication mainApplicationV = MainApplication.v();
        try {
            Notification notificationE = new gq0(getApplicationContext()).e(getApplicationContext(), i4, str, j2, str2, z, str3, bArr, n11Var2, z2);
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(200, notificationE, i3);
            } else {
                startForeground(200, notificationE);
            }
        } catch (SecurityException e) {
            String str4 = "cannot start capture service: " + e.getMessage();
            int i7 = Build.VERSION.SDK_INT;
            Logging logging = this.c;
            if (i7 >= 26) {
                logging.c(str4);
            } else {
                logging.a(str4);
            }
        }
        this.h = false;
        this.e = nm0.d;
        mainApplicationV.F(getClass());
        return 1;
    }
}
