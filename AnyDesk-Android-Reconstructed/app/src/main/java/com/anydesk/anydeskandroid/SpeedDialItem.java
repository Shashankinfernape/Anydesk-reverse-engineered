package com.anydesk.anydeskandroid;

import defpackage.nd0;
import defpackage.y60;

/* JADX INFO: loaded from: classes.dex */
public class SpeedDialItem extends y60 {
    public boolean mIsFavorite;

    public SpeedDialItem(int i, int i2, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z) {
        this(i, i2, j, j2, nd0.t(bArr), nd0.t(bArr2), nd0.t(bArr3), nd0.t(bArr4), z);
    }

    public SpeedDialItem(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, boolean z) {
        super(0, i, i2, j, j2, str, str2, str3, str4);
        this.mIsFavorite = z;
    }
}
