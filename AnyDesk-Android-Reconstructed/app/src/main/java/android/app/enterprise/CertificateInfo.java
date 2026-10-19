package android.app.enterprise;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.Key;
import java.security.cert.Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CertificateInfo implements Parcelable {
    public static final Parcelable.Creator<CertificateInfo> CREATOR = new Parcelable.Creator<CertificateInfo>() { // from class: android.app.enterprise.CertificateInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CertificateInfo createFromParcel(Parcel parcel) {
            return new CertificateInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CertificateInfo[] newArray(int i) {
            return new CertificateInfo[i];
        }
    };
    private String mAlias;
    Certificate mCertificate;
    private boolean mEnabled;
    private boolean mHasPrivateKey;
    Key mKey;
    private int mKeystore;
    private boolean mSystemPreloaded;

    public CertificateInfo(Parcel parcel) {
        this.mCertificate = null;
        this.mKey = null;
        this.mAlias = "";
        this.mKeystore = -1;
        this.mSystemPreloaded = false;
        this.mEnabled = true;
        this.mHasPrivateKey = false;
        readFromParcel(parcel);
    }

    private boolean compareKeys(Key key, Key key2) {
        if (key == key2) {
            return true;
        }
        if (key == null || key2 == null) {
            return false;
        }
        return Arrays.equals(key.getEncoded(), key2.getEncoded());
    }

    private void readFromParcel(Parcel parcel) {
        this.mCertificate = (Certificate) parcel.readSerializable();
        this.mKey = (Key) parcel.readSerializable();
        this.mAlias = (String) parcel.readSerializable();
        this.mKeystore = ((Integer) parcel.readSerializable()).intValue();
        this.mSystemPreloaded = ((Boolean) parcel.readSerializable()).booleanValue();
        this.mEnabled = ((Boolean) parcel.readSerializable()).booleanValue();
        this.mHasPrivateKey = ((Boolean) parcel.readSerializable()).booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof CertificateInfo)) {
            CertificateInfo certificateInfo = (CertificateInfo) obj;
            Certificate certificate = this.mCertificate;
            if (certificate != null && certificate.equals(certificateInfo.mCertificate) && compareKeys(this.mKey, certificateInfo.mKey)) {
                return true;
            }
        }
        return this == obj;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public Certificate getCertificate() {
        return this.mCertificate;
    }

    public boolean getEnabled() {
        return this.mEnabled;
    }

    public boolean getHasPrivateKey() {
        return this.mHasPrivateKey;
    }

    public int getKeystore() {
        return this.mKeystore;
    }

    public Key getPrivateKey() {
        return this.mKey;
    }

    public boolean getSystemPreloaded() {
        return this.mSystemPreloaded;
    }

    public void setAlias(String str) {
        this.mAlias = str;
    }

    public void setCertificate(Certificate certificate) {
        this.mCertificate = certificate;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setHasPrivateKey(boolean z) {
        this.mHasPrivateKey = z;
    }

    public void setKeystore(int i) {
        this.mKeystore = i;
    }

    public void setPrivateKey(Key key) {
        this.mKey = key;
    }

    public void setSystemPreloaded(boolean z) {
        this.mSystemPreloaded = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mCertificate);
        parcel.writeSerializable(this.mKey);
        parcel.writeSerializable(this.mAlias);
        parcel.writeSerializable(Integer.valueOf(this.mKeystore));
        parcel.writeSerializable(Boolean.valueOf(this.mSystemPreloaded));
        parcel.writeSerializable(Boolean.valueOf(this.mEnabled));
        parcel.writeSerializable(Boolean.valueOf(this.mHasPrivateKey));
    }

    public CertificateInfo() {
        this.mCertificate = null;
        this.mKey = null;
        this.mAlias = "";
        this.mKeystore = -1;
        this.mSystemPreloaded = false;
        this.mEnabled = true;
        this.mHasPrivateKey = false;
    }

    public CertificateInfo(Certificate certificate) {
        this.mKey = null;
        this.mAlias = "";
        this.mKeystore = -1;
        this.mSystemPreloaded = false;
        this.mEnabled = true;
        this.mHasPrivateKey = false;
        this.mCertificate = certificate;
    }
}
