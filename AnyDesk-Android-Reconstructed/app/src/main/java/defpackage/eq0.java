package defpackage;

import android.app.Notification;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq0 {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, uj.f(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void b(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
