package com.anydesk.anydeskandroid;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;
import defpackage.gq0;
import defpackage.i7;
import defpackage.t70;

/* JADX INFO: loaded from: classes.dex */
public class DismissFileManagerSystemPermissionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = new gq0(context).c;
        if (notificationManager != null) {
            notificationManager.cancel(701);
        }
        Bitmap bitmap = JniAdExt.a;
        t70.V(new i7(19));
    }
}
