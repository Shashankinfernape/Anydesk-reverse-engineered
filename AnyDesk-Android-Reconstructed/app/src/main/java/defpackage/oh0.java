package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class oh0 implements mh0 {
    public final LocaleList a;

    public oh0(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.mh0
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.mh0
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((mh0) obj).b());
    }

    @Override // defpackage.mh0
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.mh0
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.mh0
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
