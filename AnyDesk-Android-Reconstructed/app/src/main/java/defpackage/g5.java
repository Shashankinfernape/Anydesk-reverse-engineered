package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public enum g5 {
    NONE("", JniAdExt.n1("ad.account.register.select")),
    /* JADX INFO: Fake field, exist only in values array */
    SINGLE("1", "1"),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_SMALL("2-9", "2-9"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("10-20", "10-20"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("21-50", "21-50"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE("51+", "51+");

    public final String c;
    public final String d;

    g5(String str, String str2) {
        this.c = str;
        this.d = str2;
    }
}
