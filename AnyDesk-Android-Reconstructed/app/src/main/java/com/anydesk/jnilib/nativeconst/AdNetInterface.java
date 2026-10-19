package com.anydesk.jnilib.nativeconst;

import defpackage.nd0;

/* JADX INFO: loaded from: classes.dex */
public class AdNetInterface {
    public final byte[] mDescription;
    public final int mIndex;
    public final byte[] mIpAddress;
    public final long mMacAddress;
    public final byte[] mName;
    public final byte[] mSubnetMask;

    public AdNetInterface(int i, long j, byte[] bArr, byte[] bArr2, String str, String str2) {
        this.mIndex = i;
        this.mMacAddress = j;
        this.mIpAddress = bArr;
        this.mSubnetMask = bArr2;
        this.mName = nd0.T(str);
        this.mDescription = nd0.T(str2);
    }
}
