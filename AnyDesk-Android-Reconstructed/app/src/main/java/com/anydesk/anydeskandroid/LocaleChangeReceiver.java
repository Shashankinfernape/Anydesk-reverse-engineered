package com.anydesk.anydeskandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;
import defpackage.i7;
import defpackage.t70;

/* JADX INFO: loaded from: classes.dex */
public class LocaleChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            Bitmap bitmap = JniAdExt.a;
            t70.V(new i7(17));
        }
    }
}
