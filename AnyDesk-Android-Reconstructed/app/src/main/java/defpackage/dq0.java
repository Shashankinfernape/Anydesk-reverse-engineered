package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dq0 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public ui0 k;
    public CharSequence[] l;
    public int m;
    public int n;
    public String o;
    public Bundle p;
    public Notification s;
    public final String t;
    public long u;
    public final boolean v;
    public final Notification w;
    public final ArrayList x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean j = true;
    public int q = 0;
    public int r = 0;

    public dq0(Context context, String str) {
        Notification notification = new Notification();
        this.w = notification;
        this.a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.x = new ArrayList();
        this.v = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(bq0 bq0Var) {
        this.b.add(bq0Var);
    }

    public final Notification b() {
        Notification notificationBuild;
        Bundle bundle;
        y6 y6Var = new y6(this);
        Notification.Builder builder = (Notification.Builder) y6Var.d;
        dq0 dq0Var = (dq0) y6Var.e;
        ui0 ui0Var = dq0Var.k;
        if (ui0Var != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) ui0Var.d);
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            builder.setExtras((Bundle) y6Var.f);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (ui0Var != null) {
            dq0Var.k.getClass();
        }
        if (ui0Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    public final void d(boolean z) {
        g(16, z);
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(int i, boolean z) {
        Notification notification = this.w;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void h(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void i(int i) {
        Notification notification = this.w;
        notification.ledARGB = i;
        notification.ledOnMS = 500;
        notification.ledOffMS = 500;
        notification.flags = (notification.flags & (-2)) | 1;
    }

    public final void j(boolean z) {
        g(8, z);
    }

    public final void k(Uri uri) {
        Notification notification = this.w;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = cq0.a(cq0.d(cq0.c(cq0.b(), 4), 5));
    }

    public final void l(ui0 ui0Var) {
        if (this.k != ui0Var) {
            this.k = ui0Var;
            if (((dq0) ui0Var.e) != this) {
                ui0Var.e = this;
                l(ui0Var);
            }
        }
    }
}
