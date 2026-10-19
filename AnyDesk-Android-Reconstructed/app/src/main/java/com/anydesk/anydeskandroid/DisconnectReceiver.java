package com.anydesk.anydeskandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.anydesk.jni.JniAdExt;
import defpackage.cp;

/* JADX INFO: loaded from: classes.dex */
public class DisconnectReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        JniAdExt.I0.post(new cp(extras.getInt("session_idx", 0), 20));
    }
}
