package defpackage;

import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public class j11 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public j11(long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final String a() {
        String str = this.a;
        return str.startsWith("com.anydesk.adcontrol.") ? str.substring(22) : str;
    }

    public boolean b(Signature signature) {
        String strG = d51.g(signature);
        String str = this.c;
        if (str != null) {
            return str.equals(strG);
        }
        return false;
    }
}
