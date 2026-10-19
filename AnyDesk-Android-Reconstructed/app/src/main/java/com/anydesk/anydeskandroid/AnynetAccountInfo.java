package com.anydesk.anydeskandroid;

import defpackage.g9;
import defpackage.nd0;

/* JADX INFO: loaded from: classes.dex */
public class AnynetAccountInfo {
    public final String mFirstName;
    public final String mLicense;
    public final String mOrganization;
    public final g9 mStatus;
    public final String mSurname;
    public final String mUrl;
    public final String mUsername;

    public AnynetAccountInfo(byte b, String str, String str2, String str3, String str4, String str5, String str6) {
        g9 g9Var;
        g9[] g9VarArrValues = g9.values();
        int length = g9VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                g9Var = g9.as_invalid_token;
                break;
            }
            g9Var = g9VarArrValues[i];
            if (g9Var.c == b) {
                break;
            } else {
                i++;
            }
        }
        this.mStatus = g9Var;
        this.mUsername = str == null ? "" : str;
        this.mFirstName = str2 == null ? "" : str2;
        this.mSurname = str3 == null ? "" : str3;
        this.mLicense = str4 == null ? "" : str4;
        this.mOrganization = str5 == null ? "" : str5;
        this.mUrl = str6 == null ? "" : str6;
    }

    public AnynetAccountInfo(byte b, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this(b, nd0.t(bArr), nd0.t(bArr2), nd0.t(bArr3), nd0.t(bArr4), nd0.t(bArr5), nd0.t(bArr6));
    }
}
