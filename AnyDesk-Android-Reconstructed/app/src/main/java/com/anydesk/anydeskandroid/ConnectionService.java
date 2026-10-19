package com.anydesk.anydeskandroid;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.anydesk.jnilib.Logging;
import defpackage.gq0;
import defpackage.t70;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionService extends Service {
    public final Logging c = new Logging("ConnectionService");

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        MainApplication.v().E(getClass());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        long j;
        byte[] byteArray;
        String str2;
        String str3;
        boolean z;
        Bundle extras;
        Logging logging = this.c;
        String str4 = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = "unknown";
            j = 0;
            byteArray = null;
            str2 = null;
            str3 = null;
            z = false;
        } else {
            String string = extras.getString("filename");
            String string2 = extras.getString("name", "unknown");
            long j2 = extras.getLong("cid", 0L);
            String string3 = extras.getString("alias", null);
            boolean z2 = extras.getBoolean("verified", false);
            String string4 = extras.getString("addr", null);
            byteArray = extras.getByteArray("imgdata");
            str3 = string4;
            str4 = string;
            str = string2;
            j = j2;
            z = z2;
            str2 = string3;
        }
        try {
            gq0 gq0Var = new gq0(getApplicationContext());
            if (str4 != null) {
                startForeground(300, gq0Var.g(new File(str4).getName()));
            } else {
                startForeground(300, gq0Var.d(t70.c(j, str, str2, str3, z), t70.E(getApplicationContext(), byteArray, z, true, logging)));
            }
        } catch (SecurityException e) {
            String str5 = "cannot start connection service: " + e.getMessage();
            if (Build.VERSION.SDK_INT >= 26) {
                logging.c(str5);
            } else {
                logging.a(str5);
            }
        }
        MainApplication.v().F(getClass());
        return 1;
    }
}
