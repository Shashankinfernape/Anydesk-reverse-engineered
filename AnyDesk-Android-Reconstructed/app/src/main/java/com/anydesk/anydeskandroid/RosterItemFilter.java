package com.anydesk.anydeskandroid;

import defpackage.gr0;
import defpackage.nd0;
import j$.util.DesugarArrays;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RosterItemFilter extends gr0 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public RosterItemFilter(byte[] bArr, byte[] bArr2, int i, int i2) {
        Objects.requireNonNull(bArr);
        String strT = nd0.t(bArr);
        Objects.requireNonNull(bArr2);
        this(strT, DesugarArrays.stream(nd0.e(nd0.t(bArr2))).toList(), i, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RosterItemFilter)) {
            return false;
        }
        RosterItemFilter rosterItemFilter = (RosterItemFilter) obj;
        return this.c == rosterItemFilter.c && this.d == rosterItemFilter.d && Objects.equals(this.a, rosterItemFilter.a) && Objects.equals(this.b, rosterItemFilter.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + ((Objects.hashCode(this.a) + (((this.c * 31) + this.d) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)};
        String[] strArrSplit = "a;b;c;d".length() == 0 ? new String[0] : "a;b;c;d".split(";");
        StringBuilder sb = new StringBuilder("RosterItemFilter[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public RosterItemFilter(String str, List list, int i, int i2) {
        Objects.requireNonNull(str);
        this.a = str;
        Objects.requireNonNull(list);
        this.b = list;
        this.c = i;
        this.d = i2;
    }
}
