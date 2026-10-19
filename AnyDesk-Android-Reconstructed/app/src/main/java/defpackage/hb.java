package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void f(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void g(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void j(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void k(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void l(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void m(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void n(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void o(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void p(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
