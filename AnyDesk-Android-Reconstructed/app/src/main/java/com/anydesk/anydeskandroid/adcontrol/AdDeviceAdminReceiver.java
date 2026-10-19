package com.anydesk.anydeskandroid.adcontrol;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import com.anydesk.jnilib.Logging;
import defpackage.ay;
import defpackage.yw0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdDeviceAdminReceiver extends DeviceAdminReceiver {
    public static final ArrayList b = new ArrayList();
    public final Logging a = new Logging("AdDeviceAdminReceiver");

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onDisabled(Context context, Intent intent) {
        this.a.e("device admin disabled");
        ArrayList arrayList = b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yw0 yw0Var = ((ay) obj).a.i;
            if (yw0Var.a < 11) {
                yw0Var.e();
            }
        }
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onEnabled(Context context, Intent intent) {
        this.a.e("device admin enabled");
        ArrayList arrayList = b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ay) obj).a.i.a();
        }
    }
}
