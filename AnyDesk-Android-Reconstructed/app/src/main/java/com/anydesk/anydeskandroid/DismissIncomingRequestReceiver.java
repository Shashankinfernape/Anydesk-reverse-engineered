package com.anydesk.anydeskandroid;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.anydesk.jni.JniAdExt;
import defpackage.cp;
import defpackage.gq0;

/* JADX INFO: loaded from: classes.dex */
public class DismissIncomingRequestReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        JniAdExt.I0.post(new cp(intent.getExtras().getInt("session_idx", 0), 19));
        NotificationManager notificationManager = new gq0(context).c;
        if (notificationManager != null) {
            notificationManager.cancel(600);
        }
    }
}
