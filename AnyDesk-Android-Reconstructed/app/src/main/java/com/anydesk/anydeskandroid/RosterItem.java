package com.anydesk.anydeskandroid;

import defpackage.br0;
import defpackage.nd0;
import defpackage.y60;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class RosterItem extends y60 {
    public final String a;
    public final String[] b;
    public final String c;

    public RosterItem(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, String str5, String[] strArr) {
        super(5, i, i2, j, j2, str2, str, str3, str4);
        this.a = str5;
        this.b = strArr;
        String displayName = getDisplayName();
        if (displayName.length() > 0) {
            this.c = displayName.substring(0, 1).toUpperCase();
        } else {
            this.c = "";
        }
    }

    public final RosterItem a(String str, String str2, String[] strArr, br0 br0Var) {
        RosterItem rosterItem = new RosterItem(this.mColor1, this.mColor2, this.mCid, this.mId, this.mHostname, this.mAlias, str, str2, this.a, (String[]) strArr.clone());
        rosterItem.mOnlineState = br0Var;
        return rosterItem;
    }

    @Override // defpackage.y60, defpackage.z60
    public final boolean equals(Object obj) {
        if (obj instanceof RosterItem) {
            RosterItem rosterItem = (RosterItem) obj;
            if (super.equals(obj) && Objects.equals(this.a, rosterItem.a) && Arrays.equals(this.b, rosterItem.b) && Objects.equals(this.c, rosterItem.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y60, defpackage.z60
    public final int hashCode() {
        return Objects.hashCode(this.c) + ((((Objects.hashCode(this.a) + (super.hashCode() * 31)) * 31) + Arrays.hashCode(this.b)) * 31);
    }

    @Override // defpackage.y60, defpackage.z60
    public final boolean matchesFilter(String str) {
        String str2;
        if (super.matchesFilter(str) || ((str2 = this.a) != null && str2.toLowerCase().contains(str))) {
            return true;
        }
        String[] strArr = this.b;
        if (strArr != null) {
            for (String str3 : strArr) {
                if (str3 != null && str3.toLowerCase().contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public RosterItem(int i, int i2, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this(i, i2, j, j2, nd0.t(bArr), nd0.t(bArr2), nd0.t(bArr3), nd0.t(bArr4), nd0.t(bArr5), nd0.e(nd0.t(bArr6)));
    }
}
