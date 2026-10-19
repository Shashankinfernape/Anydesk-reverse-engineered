package defpackage;

import com.anydesk.anydeskandroid.PermissionProfile;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class z80 {
    public final int a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final byte[] g;
    public final n11 h;
    public final lo i;
    public final boolean j;
    public boolean k = false;
    public PermissionProfile l = null;
    public final ArrayList m = new ArrayList();
    public final Hashtable n = new Hashtable();

    public z80(int i, long j, String str, String str2, boolean z, String str3, byte[] bArr, n11 n11Var, lo loVar, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = bArr;
        this.h = n11Var;
        this.i = loVar;
        this.j = z2;
    }
}
