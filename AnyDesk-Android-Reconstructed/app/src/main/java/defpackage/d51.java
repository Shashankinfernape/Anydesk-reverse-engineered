package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
public abstract class d51 {
    public static Signature c;
    public static String d;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String[] b = {"android"};
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public static final us0 f = new us0(11);

    public static void a(PackageManager packageManager, int i) {
        String strG;
        if (d == null && packageManager != null && (strG = g(f(packageManager))) != null) {
            d = strG;
        }
        if (packageManager == null || f == null) {
            throw new SecurityException("not authorized");
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length < 1) {
            throw new SecurityException(q51.k(i, "not authorized (no packages for uid ", ")"));
        }
        for (String str : packagesForUid) {
            if (str == null) {
                throw new SecurityException(q51.k(i, "not authorized (null package for uid=", ")"));
            }
            ConcurrentHashMap concurrentHashMap = e;
            c51 c51Var = (c51) concurrentHashMap.get(str);
            try {
                long j = b(packageManager, str, 0).lastUpdateTime;
                if (c51Var == null) {
                    Signature signatureE = e(packageManager, str);
                    c51 c51Var2 = new c51();
                    c51Var2.a = signatureE;
                    c51Var2.b = j;
                    concurrentHashMap.put(str, c51Var2);
                    c51Var = c51Var2;
                } else if (j > c51Var.b) {
                    c51Var.a = e(packageManager, str);
                    c51Var.b = j;
                }
                String strG2 = g(c51Var.a);
                String str2 = d;
                if (!(str2 == null ? false : str2.matches(strG2))) {
                    throw new SecurityException(gr0.f("not authorized (signature mismatch for package='", str, ")"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new SecurityException("package manager could not find name");
            }
        }
    }

    public static PackageInfo b(PackageManager packageManager, String str, int i) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i)) : packageManager.getPackageInfo(str, i);
    }

    public static Signature c(PackageManager packageManager, String str) {
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        ApplicationInfo applicationInfo;
        Throwable th;
        RandomAccessFile randomAccessFile;
        if (packageManager != null && str != null) {
            if (Build.VERSION.SDK_INT < 33) {
                try {
                    PackageInfo packageInfoB = b(packageManager, str, 0);
                    if (packageInfoB != null && (applicationInfo = packageInfoB.applicationInfo) != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(new File(applicationInfo.sourceDir), "r");
                            try {
                                long length = randomAccessFile.length();
                                FileChannel channel = randomAccessFile.getChannel();
                                channel.getClass();
                                la laVarG = ma.g(new vy(channel, 0L, length));
                                randomAccessFile.close();
                                if (laVarG.n) {
                                    ja jaVar = (ja) laVarG.h.get(0);
                                    if (jaVar.b.isEmpty()) {
                                        return new Signature(jaVar.a().getEncoded());
                                    }
                                } else if (laVarG.m) {
                                    ja jaVar2 = (ja) laVarG.g.get(0);
                                    if (jaVar2.b.isEmpty()) {
                                        return new Signature(jaVar2.a().getEncoded());
                                    }
                                } else if (laVarG.l) {
                                    ha haVar = (ha) laVarG.f.get(0);
                                    if (haVar.c.isEmpty()) {
                                        return new Signature(haVar.a().getEncoded());
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                randomAccessFile.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = null;
                        }
                    }
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                }
            } else {
                PackageInfo packageInfoB2 = b(packageManager, str, 134217728);
                if (packageInfoB2 != null && (signingInfo = packageInfoB2.signingInfo) != null && (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) != null && signingCertificateHistory.length > 0) {
                    return signingCertificateHistory[signingCertificateHistory.length - 1];
                }
            }
        }
        return null;
    }

    public static String d(Signature signature) {
        X509Certificate x509Certificate;
        try {
            x509Certificate = X509Certificate.getInstance(signature.toByteArray());
        } catch (CertificateException unused) {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return "version=" + x509Certificate.getVersion() + " issuerDN='" + x509Certificate.getIssuerDN() + "' subjectDN='" + x509Certificate.getSubjectDN() + "' hash='" + g(signature) + "'";
    }

    public static Signature e(PackageManager packageManager, String str) {
        Signature signatureC = c(packageManager, str);
        if (signatureC != null) {
            return signatureC;
        }
        throw new SecurityException(gr0.f("not authorized (null signature for package='", str, ")"));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0029 -> B:30:0x0044). Please report as a decompilation issue!!! */
    public static Signature f(PackageManager packageManager) {
        Signature signature;
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        Signature[] signatureArr;
        Signature signature2 = c;
        if (signature2 != null) {
            return signature2;
        }
        if (packageManager != null) {
            String str = b[0];
            if (str != null) {
                try {
                    if (Build.VERSION.SDK_INT < 28) {
                        PackageInfo packageInfoB = b(packageManager, str, 64);
                        if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length != 1) {
                            signature = null;
                        } else {
                            signature = signatureArr[0];
                        }
                    } else {
                        PackageInfo packageInfoB2 = b(packageManager, str, 134217728);
                        if (packageInfoB2 == null || (signingInfo = packageInfoB2.signingInfo) == null || (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) == null || signingCertificateHistory.length != 1) {
                            signature = null;
                        } else {
                            signature = signingCertificateHistory[0];
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } else {
                signature = null;
            }
            if (signature != null) {
                c = signature;
                return signature;
            }
        }
        return null;
    }

    public static String g(Signature signature) {
        byte[] byteArray;
        if (signature != null && (byteArray = signature.toByteArray()) != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = new char[bArrDigest.length * 2];
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b2 = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = a;
                    cArr[i2] = cArr2[(b2 & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b2 & 15];
                }
                return new String(cArr);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
