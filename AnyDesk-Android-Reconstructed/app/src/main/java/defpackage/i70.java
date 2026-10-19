package defpackage;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i70 extends gt {
    public final byte[] d;
    public int e;

    public i70(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.e = -1;
        this.d = (byte[]) bArr.clone();
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (this.e == -1) {
            try {
                this.e = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.e = 0;
            }
        }
        return this.e;
    }
}
