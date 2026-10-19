package com.anydesk.anydeskandroid;

import defpackage.nd0;

/* JADX INFO: loaded from: classes.dex */
public class AdCountryCode {
    public final String mCode;
    public final int mIdx;
    public final String mName;

    public AdCountryCode(int i, String str, String str2) {
        this.mIdx = i;
        this.mCode = str == null ? "" : str;
        this.mName = str2 == null ? "" : str2;
    }

    public AdCountryCode(int i, byte[] bArr, byte[] bArr2) {
        this(i, nd0.t(bArr), nd0.t(bArr2));
    }
}
