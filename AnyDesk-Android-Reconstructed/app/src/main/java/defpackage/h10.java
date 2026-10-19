package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class h10 {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, g10 g10Var) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, g10Var, null);
    }

    public static FingerprintManager b(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public static boolean c(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static FingerprintManager.CryptoObject e(y6 y6Var) {
        if (y6Var == null) {
            return null;
        }
        Mac mac = (Mac) y6Var.f;
        Signature signature = (Signature) y6Var.d;
        Cipher cipher = (Cipher) y6Var.e;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
