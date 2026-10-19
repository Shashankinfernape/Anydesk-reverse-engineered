package com.anydesk.anydeskandroid;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.anydesk.jnilib.Logging;
import defpackage.bj0;
import defpackage.gq0;

/* JADX INFO: loaded from: classes.dex */
public class MainService extends Service {
    public final Logging c = new Logging("MainService");
    public final bj0 d = new bj0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        MainApplication.v().a0 = true;
        return this.d;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        MainApplication.v().E(getClass());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            new gq0(getApplicationContext());
            startForeground(400, gq0.f(getApplicationContext()));
        } catch (SecurityException e) {
            String str = "cannot start main service: " + e.getMessage();
            int i3 = Build.VERSION.SDK_INT;
            Logging logging = this.c;
            if (i3 >= 26) {
                logging.c(str);
            } else {
                logging.a(str);
            }
        }
        MainApplication.v().F(getClass());
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        MainApplication.v().a0 = false;
        return false;
    }
}
