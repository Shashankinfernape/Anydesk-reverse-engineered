package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: loaded from: classes.dex */
public abstract class mf {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
