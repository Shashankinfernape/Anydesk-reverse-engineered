package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.LocaleList;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import j$.util.stream.IntStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf {
    public static final String[] a = {null, "C4F5781DF5C7F28E8167D7E69BEDE8AEA687DA8E8D0BA4BC5FB7B238CC0F8FF5", "14F8FCDE521F08F971A8B35C53A27E32BAE8C706918932D1FBCA635210433C15", "89A3BA1BCDB9DDBBFC9D5429F1ECBFBA9D08F56BBE83B7788BA8EA39FBFE306A", "9A23821CF7229B53641A971578BF98D9262439708F0669E6D6B2D17DDF8EAAA6", "3B70D121FF5078C593429F33CF419F8F63F5F409E222ED3313090682EBF98C93", "8FA7343CC4E090E2F96B9EE1975979FCDDFB446F78EE4120309693E691A7EDB3", "3D77374AACB0B3221C95F21948ACBE6376EE5B06368344205C044E719F11B33A", "EB20F9397E1374175E14D2DE97C785BD16FC420EE45A7CF2D82CA8503BEADD01", "13AF95775A9298A6F3E738484D6367869CFC6DFAE96F4C2A0C260D10DD49D3F3"};
    public static SharedPreferences b;
    public static hf c;

    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static IntStream c(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static Context d(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList e(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static String f() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }

    public static DecimalFormatSymbols g(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static String h(Resources resources) {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? resources.getConfiguration().getLocales().get(0) : resources.getConfiguration().locale;
        String language = locale.getLanguage();
        if (language == null || language.isEmpty()) {
            language = "en";
        } else {
            String country = locale.getCountry();
            if (country != null && !country.isEmpty()) {
                language = language + "-" + country;
            }
        }
        return language.toLowerCase();
    }

    public static synchronized void i(Context context) {
        try {
            if (b == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    b = ec1.o(context.createDeviceProtectedStorageContext());
                } else {
                    b = ec1.o(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void j(DragAndDropPermissions dragAndDropPermissions) {
        dragAndDropPermissions.release();
    }

    public static DragAndDropPermissions k(qa qaVar, DragEvent dragEvent) {
        return qaVar.requestDragAndDropPermissions(dragEvent);
    }

    public static void l(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void m(Notification.Builder builder, CharSequence[] charSequenceArr) {
        builder.setRemoteInputHistory(charSequenceArr);
    }
}
