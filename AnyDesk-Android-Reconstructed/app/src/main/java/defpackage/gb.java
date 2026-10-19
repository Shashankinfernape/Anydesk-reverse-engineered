package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static kh0 b(Configuration configuration) {
        return kh0.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(kh0 kh0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(kh0Var.a.a()));
    }

    public static void d(Configuration configuration, kh0 kh0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(kh0Var.a.a()));
    }
}
