package defpackage;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class xg {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
