package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public abstract class gt extends X509Certificate {
    public final X509Certificate c;

    public gt(X509Certificate x509Certificate) {
        this.c = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.c.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.c.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.c.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() {
        return this.c.getExtendedKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.c.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return this.c.getIssuerAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return this.c.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.c.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        return this.c.getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.c.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.c.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.c.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.c.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.c.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.c.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.c.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.c.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.c.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.c.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return this.c.getSubjectAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return this.c.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.c.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        return this.c.getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.c.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.c.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.c.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        if (Build.VERSION.SDK_INT >= 24) {
            this.c.verify(publicKey, provider);
        } else {
            id.m("X509Certificate.verify() not supported before API level 24.");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.c.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.c.verify(publicKey, str);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.c.verify(publicKey);
    }
}
