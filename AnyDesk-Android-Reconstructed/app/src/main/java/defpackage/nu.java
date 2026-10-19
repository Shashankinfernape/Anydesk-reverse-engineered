package defpackage;

import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class nu extends z60 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final Bitmap f;
    public br0 g;

    public nu(int i, int i2, long j, int i3, String str, String str2, String str3, Bitmap bitmap) {
        super(4, i, i2);
        this.a = j;
        this.b = i3;
        this.c = str;
        this.d = str2.equals("-") ? "" : str2;
        this.e = str3;
        this.f = bitmap;
        if (JniAdExt.h2(io.KEY_ONLINE_STATUS_RECEIVE) != 0) {
            this.g = br0.os_unknown;
        } else {
            this.g = br0.os_unmonitored;
        }
    }

    @Override // defpackage.z60
    public final boolean matchesFilter(String str) {
        String str2;
        switch (q51.r(this.b)) {
            case 1:
                str2 = "Windows";
                break;
            case 2:
                str2 = "Linux";
                break;
            case 3:
                str2 = "FreeBSD";
                break;
            case 4:
                str2 = "macOS";
                break;
            case 5:
                str2 = "iOS";
                break;
            case 6:
                str2 = "Android";
                break;
            case 7:
                str2 = "tvOS";
                break;
            default:
                str2 = null;
                break;
        }
        if (t70.g(this.a).contains(str)) {
            return true;
        }
        String str3 = this.e;
        if (str3 != null && str3.toLowerCase().contains(str)) {
            return true;
        }
        String str4 = this.d;
        if ((str4 == null || !str4.toLowerCase().contains(str)) && !this.c.toLowerCase().contains(str)) {
            return str2 != null && str2.toLowerCase().contains(str);
        }
        return true;
    }
}
