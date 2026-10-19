package com.anydesk.anydeskandroid.gui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import defpackage.bx;
import defpackage.io;
import defpackage.nd0;
import defpackage.r3;

/* JADX INFO: loaded from: classes.dex */
public final class HubActivity extends GlowActivity {
    public bx j;
    public boolean k;
    public boolean l;

    private static native void jniHandleCameraPermissionResult(boolean z);

    private static native void jniHandleMicrophonePermissionResult(boolean z);

    private static native void jniNavigate(byte[] bArr);

    public final void m() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 0);
        }
    }

    @Override // com.anydesk.anydeskandroid.gui.activity.GlowActivity, android.app.NativeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.j = new bx(getIntent());
        super.onCreate(bundle);
        MainApplication.v().g0 = this;
        if (JniAdExt.g2(io.KEY_FEATURE_HUB_LOCAL)) {
            this.k = r3.c(this, new String[]{"android.permission.RECORD_AUDIO"});
            this.l = r3.c(this, new String[]{"android.permission.CAMERA"});
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(268500992);
        startActivity(intent);
        finish();
    }

    @Override // com.anydesk.anydeskandroid.gui.activity.GlowActivity, android.app.NativeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MainApplication.v().g0 = null;
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("nav");
        if (stringExtra != null) {
            jniNavigate(nd0.T(stringExtra));
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        }
        if (i == 0) {
            this.k = z;
            jniHandleMicrophonePermissionResult(z);
        } else {
            if (i != 1) {
                return;
            }
            this.l = z;
            jniHandleCameraPermissionResult(z);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zC = r3.c(this, new String[]{"android.permission.RECORD_AUDIO"});
        if (this.k != zC) {
            this.k = zC;
            jniHandleMicrophonePermissionResult(zC);
        }
        boolean zC2 = r3.c(this, new String[]{"android.permission.CAMERA"});
        if (this.l != zC2) {
            this.l = zC2;
            jniHandleCameraPermissionResult(zC2);
        }
    }
}
