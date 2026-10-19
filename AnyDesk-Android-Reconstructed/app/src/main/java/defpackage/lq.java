package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lq implements kq, mq {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public lq(lq lqVar) {
        ClipData clipData = lqVar.b;
        clipData.getClass();
        this.b = clipData;
        int i = lqVar.c;
        if (i < 0) {
            Locale locale = Locale.US;
            id.q("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            id.q("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = lqVar.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = lqVar.e;
            this.f = lqVar.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.mq
    public ClipData a() {
        return this.b;
    }

    @Override // defpackage.mq
    public int b() {
        return this.d;
    }

    @Override // defpackage.kq
    public nq build() {
        return new nq(new lq(this));
    }

    @Override // defpackage.mq
    public ContentInfo c() {
        return null;
    }

    @Override // defpackage.kq
    public void d(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.mq
    public int e() {
        return this.c;
    }

    @Override // defpackage.kq
    public void f(int i) {
        this.d = i;
    }

    @Override // defpackage.kq
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return q51.m(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lq() {
    }
}
