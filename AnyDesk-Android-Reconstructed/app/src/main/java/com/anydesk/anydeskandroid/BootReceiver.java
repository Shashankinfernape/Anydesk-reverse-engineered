package com.anydesk.anydeskandroid;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.q51;

/* JADX INFO: loaded from: classes.dex */
public class BootReceiver extends DeviceAdminReceiver {
    public final Logging a = new Logging("BootReceiver");

    @Override // android.app.admin.DeviceAdminReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.e("boot completed " + intent.getAction());
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV != null) {
            mainApplicationV.o();
            JniAdExt.I0.removeMessages(q51.d(15));
            JniAdExt.I0.sendEmptyMessageDelayed(q51.d(15), 10000L);
        }
    }
}
