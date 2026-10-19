package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class jq implements kq, mq {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public jq(ClipData clipData, int i) {
        this.b = iq.b(clipData, i);
    }

    @Override // defpackage.mq
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.mq
    public int b() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.kq
    public nq build() {
        return new nq(new jq(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.mq
    public ContentInfo c() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.kq
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.mq
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.kq
    public void f(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.kq
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public jq(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }
}
