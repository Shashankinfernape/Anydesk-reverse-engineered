package com.anydesk.anydeskandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.anydesk.jni.JniAdExt;
import defpackage.q51;
import defpackage.tb0;

/* JADX INFO: loaded from: classes.dex */
public class RemovableStorageReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        action.getClass();
        switch (action) {
            case "android.hardware.usb.action.USB_DEVICE_ATTACHED":
            case "android.hardware.usb.action.USB_DEVICE_DETACHED":
                JniAdExt.I0.removeMessages(q51.d(14));
                JniAdExt.I0.sendEmptyMessageDelayed(q51.d(14), 5000L);
                break;
            case "android.intent.action.MEDIA_REMOVED":
            case "android.intent.action.MEDIA_MOUNTED":
            case "android.intent.action.MEDIA_UNMOUNTED":
            case "android.intent.action.MEDIA_EJECT":
            case "android.intent.action.MEDIA_BAD_REMOVAL":
                JniAdExt.I0.post(new tb0(10));
                break;
        }
    }
}
