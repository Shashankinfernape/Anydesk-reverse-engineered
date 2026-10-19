package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.anydesk.jnilib.Logging;
import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class zc1 {
    public final Logging a;

    public zc1(fw fwVar, Logging logging) {
        this.a = logging;
    }

    public final Optional a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return Optional.empty();
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        Logging logging = this.a;
        if (userManager == null) {
            logging.h("USER_SERVICE is not available to call isManagedProfile()");
            return Optional.empty();
        }
        try {
            return Optional.of(Boolean.valueOf(userManager.isManagedProfile()));
        } catch (SecurityException unused) {
            return Optional.empty();
        } catch (Throwable th) {
            logging.i("USER_SERVICE isManagedProfile() throws unexpectedly", th);
            return Optional.empty();
        }
    }

    public final Optional b(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return Optional.empty();
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        Logging logging = this.a;
        if (userManager == null) {
            logging.h("USER_SERVICE is not available to call isProfile()");
            return Optional.empty();
        }
        try {
            return Optional.of(Boolean.valueOf(userManager.isProfile()));
        } catch (Throwable th) {
            logging.i("USER_SERVICE isProfile() throws unexpectedly", th);
            return Optional.empty();
        }
    }

    public final Optional c(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return Optional.empty();
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        Logging logging = this.a;
        if (userManager == null) {
            logging.h("USER_SERVICE is not available to call isSystemUser()");
            return Optional.empty();
        }
        try {
            return Optional.of(Boolean.valueOf(userManager.isSystemUser()));
        } catch (Throwable th) {
            logging.i("USER_SERVICE isSystemUser() throws unexpectedly", th);
            return Optional.empty();
        }
    }
}
