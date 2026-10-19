package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
public abstract class qh1 {
    public static volatile CertificateFactory a;
    public static final byte[] b = "-----BEGIN CERTIFICATE-----".getBytes();
    public static final byte[] c = "-----END CERTIFICATE-----".getBytes();

    public static X509Certificate a(byte[] bArr) {
        if (a == null) {
            synchronized (qh1.class) {
                try {
                    if (a == null) {
                        try {
                            a = CertificateFactory.getInstance("X.509");
                        } catch (CertificateException e) {
                            throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b(bArr, a);
    }

    public static X509Certificate b(byte[] bArr, CertificateFactory certificateFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (CertificateException unused) {
                ByteBuffer byteBufferC = c(ByteBuffer.wrap(bArr));
                byteBufferC.position();
                try {
                    if (d6.w(byteBufferC, uj.class) != null) {
                        throw new ClassCastException();
                    }
                    ie.b(null);
                    throw null;
                } catch (CertificateException e) {
                    e = e;
                    throw new CertificateException("Failed to parse certificate", e);
                } catch (je e2) {
                    e = e2;
                    throw new CertificateException("Failed to parse certificate", e);
                }
            }
        } catch (fe | CertificateException | je e3) {
            e = e3;
            throw new CertificateException("Failed to parse certificate", e);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) throws CertificateException {
        char c2;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = b;
        if (iRemaining < bArr.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        for (byte b2 : bArr) {
            if (byteBuffer.get() != b2) {
                byteBuffer.reset();
                return byteBuffer;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c2 = (char) byteBuffer.get()) != '-') {
            if (!Character.isWhitespace(c2)) {
                sb.append(c2);
            }
        }
        int i = 1;
        while (true) {
            byte[] bArr2 = c;
            if (i >= bArr2.length) {
                byte[] bArrDecode = Base64.decode(sb.toString(), 2);
                int iPosition = byteBuffer.position();
                while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
                    iPosition++;
                }
                byteBuffer.position(iPosition);
                return ByteBuffer.wrap(bArrDecode);
            }
            if (!byteBuffer.hasRemaining()) {
                throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
            }
            if (byteBuffer.get() != bArr2[i]) {
                throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
            }
            i++;
        }
    }
}
