package com.anydesk.anydeskandroid;

import defpackage.az0;
import defpackage.j80;
import defpackage.nd0;

/* JADX INFO: loaded from: classes.dex */
public class Roster implements j80 {
    public final az0 mFlags;
    public final long mId;
    public final String mName;

    public Roster(long j, byte[] bArr, int i) {
        this(j, nd0.t(bArr), new az0((short) i));
    }

    private boolean matchesFilter(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return this.mName.toLowerCase().contains(str);
    }

    public boolean isPersonal() {
        return (this.mFlags.c & 1) == 1;
    }

    public String toString() {
        return this.mName;
    }

    public Roster(long j, String str, az0 az0Var) {
        this.mId = j;
        this.mName = str;
        this.mFlags = az0Var;
    }

    @Override // defpackage.j80
    public boolean matchesFilter(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!matchesFilter(str)) {
                return false;
            }
        }
        return true;
    }
}
