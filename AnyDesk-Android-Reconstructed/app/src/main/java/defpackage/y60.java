package defpackage;

import android.os.Looper;
import com.anydesk.jni.JniAdExt;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class y60 extends z60 {
    public final String mAlias;
    public final long mCid;
    public final String mHostname;
    public final long mId;
    public br0 mOnlineState;
    public final String mThumbnailPath;
    public final String mUserDefinedName;

    public y60(int i, int i2, int i3, long j, long j2, String str, String str2, String str3, String str4) {
        super(i, i2, i3);
        this.mCid = j;
        this.mId = j2;
        this.mAlias = str;
        this.mHostname = str2;
        this.mUserDefinedName = str3;
        this.mThumbnailPath = str4;
        if (JniAdExt.h2(io.KEY_ONLINE_STATUS_RECEIVE) != 0) {
            this.mOnlineState = br0.os_unknown;
        } else {
            this.mOnlineState = br0.os_unmonitored;
        }
    }

    @Override // defpackage.z60
    public boolean equals(Object obj) {
        if (obj instanceof y60) {
            y60 y60Var = (y60) obj;
            if (super.equals(obj) && this.mCid == y60Var.mCid && this.mId == y60Var.mId && Objects.equals(this.mAlias, y60Var.mAlias) && Objects.equals(this.mHostname, y60Var.mHostname) && Objects.equals(this.mUserDefinedName, y60Var.mUserDefinedName) && Objects.equals(this.mThumbnailPath, y60Var.mThumbnailPath) && this.mOnlineState == y60Var.mOnlineState) {
                return true;
            }
        }
        return false;
    }

    public String getAddr() {
        String str = this.mAlias;
        long j = this.mCid;
        String str2 = this.mHostname;
        Looper looper = t70.a;
        if (str.isEmpty()) {
            return j != 0 ? t70.g(j) : str2;
        }
        return str;
    }

    public String getAltDisplayName() {
        String str = this.mUserDefinedName;
        String str2 = this.mAlias;
        long j = this.mCid;
        String str3 = this.mHostname;
        Looper looper = t70.a;
        boolean zIsEmpty = str.isEmpty();
        boolean z = !zIsEmpty;
        boolean z2 = true;
        if (!str2.isEmpty()) {
            if (!zIsEmpty) {
                return str2;
            }
            z = true;
        }
        if (j == 0) {
            z2 = z;
        } else if (z) {
            return t70.f(j);
        }
        return z2 ? str3 : "";
    }

    public String getDisplayName() {
        String str = this.mUserDefinedName;
        String str2 = this.mAlias;
        long j = this.mCid;
        String str3 = this.mHostname;
        Looper looper = t70.a;
        if (!str.isEmpty()) {
            return str;
        }
        if (str2.isEmpty()) {
            return j != 0 ? t70.f(j) : str3;
        }
        return str2;
    }

    public String getPrettyAddr() {
        return t70.y(this.mAlias, this.mCid, this.mHostname);
    }

    @Override // defpackage.z60
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j = this.mCid;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.mId;
        return Objects.hashCode(this.mOnlineState) + ((Objects.hashCode(this.mThumbnailPath) + ((Objects.hashCode(this.mUserDefinedName) + ((Objects.hashCode(this.mHostname) + ((Objects.hashCode(this.mAlias) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.z60
    public boolean matchesFilter(String str) {
        String str2;
        String str3;
        if (str == null || str.isEmpty()) {
            return true;
        }
        String str4 = this.mAlias;
        return (str4 != null && str4.toLowerCase().contains(str)) || ((str2 = this.mHostname) != null && str2.toLowerCase().contains(str)) || (((str3 = this.mUserDefinedName) != null && str3.toLowerCase().contains(str)) || t70.g(this.mCid).contains(str));
    }
}
