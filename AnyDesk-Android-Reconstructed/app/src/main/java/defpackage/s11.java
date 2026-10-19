package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class s11 {
    public final String a;
    public final String b;
    public final String c;

    public s11(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": ");
        String strN1 = this.b;
        if (strN1.isEmpty()) {
            strN1 = JniAdExt.n1("ad.sys_info.not_available");
        }
        sb.append(strN1);
        return sb.toString();
    }

    public s11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
