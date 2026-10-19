package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public enum e5 {
    d(JniAdExt.n1("ad.account.er.some_fields.required")),
    e(JniAdExt.n1("ad.account.er.email.in_use")),
    f(JniAdExt.n1("ad.account.er.timeout")),
    g(JniAdExt.n1("ad.account.er.pw.too_weak")),
    h(JniAdExt.n1("ad.account.er.internal_error")),
    i(JniAdExt.n1("ad.account.er.license_conflict")),
    j("");

    public String c;

    e5(String str) {
        this.c = str;
    }
}
