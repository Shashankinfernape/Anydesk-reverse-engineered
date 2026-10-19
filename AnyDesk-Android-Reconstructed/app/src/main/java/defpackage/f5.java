package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public enum f5 {
    d(JniAdExt.n1("ad.account.er.purpose.required")),
    e(JniAdExt.n1("ad.account.er.company_name.required")),
    f(JniAdExt.n1("ad.account.er.country.required")),
    g(JniAdExt.n1("ad.account.er.phone_number.required")),
    h(JniAdExt.n1("ad.account.register.phone_invalid")),
    i(JniAdExt.n1("ad.account.er.required")),
    j(JniAdExt.n1("ad.account.er.first_name.required")),
    k(JniAdExt.n1("ad.account.register.first_name_invalid")),
    l(JniAdExt.n1("ad.account.er.surname.required")),
    m(JniAdExt.n1("ad.account.register.last_name_invalid")),
    n(JniAdExt.n1("ad.account.er.email.required")),
    o(JniAdExt.n1("ad.account.register.email_invalid")),
    p(JniAdExt.n1("ad.account.er.pw.required")),
    q(JniAdExt.n1("ad.account.er.pw.same_as_user")),
    r(JniAdExt.n1("ad.account.er.pw.mismatch")),
    s(String.format(JniAdExt.n1("ad.account.er.tos_not_accepted"), JniAdExt.n1("ad.account.register.tos")));

    public final String c;

    f5(String str) {
        this.c = str;
    }
}
