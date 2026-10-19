package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ nf a;

    public kf(nf nfVar) {
        this.a = nfVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((fh) this.a).a;
        if (weakReference.get() == null || ((gh) weakReference.get()).m || !((gh) weakReference.get()).l) {
            return;
        }
        ((gh) weakReference.get()).f(new mg(i, charSequence));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((fh) this.a).a;
        if (weakReference.get() == null || !((gh) weakReference.get()).l) {
            return;
        }
        gh ghVar = (gh) weakReference.get();
        if (ghVar.s == null) {
            ghVar.s = new vm0();
        }
        gh.j(ghVar.s, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int iA;
        BiometricPrompt.CryptoObject cryptoObject;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null && sr.d(cryptoObject) == null && sr.f(cryptoObject) == null && sr.e(cryptoObject) == null && Build.VERSION.SDK_INT >= 30) {
            tr.b(cryptoObject);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = mf.a(authenticationResult);
            } else {
                iA = -1;
            }
        } else if (i == 29) {
            iA = -1;
        } else {
            iA = 2;
        }
        zg zgVar = new zg();
        WeakReference weakReference = ((fh) this.a).a;
        if (weakReference.get() == null || !((gh) weakReference.get()).l) {
            return;
        }
        if (iA == -1) {
            ((gh) weakReference.get()).e();
            zgVar = new zg();
        }
        gh ghVar = (gh) weakReference.get();
        if (ghVar.p == null) {
            ghVar.p = new vm0();
        }
        gh.j(ghVar.p, zgVar);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
