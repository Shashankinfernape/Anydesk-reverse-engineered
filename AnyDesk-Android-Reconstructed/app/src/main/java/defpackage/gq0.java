package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.ChatDirectReplyReceiver;
import com.anydesk.anydeskandroid.DisconnectReceiver;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class gq0 {
    public static final int d;
    public static final Object e;
    public final Logging a = new Logging("NotificationTool");
    public Context b;
    public NotificationManager c;

    static {
        d = Build.VERSION.SDK_INT >= 31 ? 67108864 : 0;
        e = new Object();
    }

    public gq0(Context context) {
        this.b = context;
        this.c = (NotificationManager) context.getSystemService("notification");
        if (t70.a()) {
            synchronized (e) {
                try {
                    if (this.c.getNotificationChannel("anydesk") == null) {
                        NotificationChannel notificationChannel = new NotificationChannel("anydesk", "AnyDesk", 2);
                        notificationChannel.setDescription("AnyDesk notifications");
                        notificationChannel.setSound(null, null);
                        this.c.createNotificationChannel(notificationChannel);
                    }
                    if (this.c.getNotificationChannel("anydesk_headsup") == null) {
                        NotificationChannel notificationChannel2 = new NotificationChannel("anydesk_headsup", "AnyDesk Heads-up", 4);
                        notificationChannel2.setDescription("AnyDesk heads-up notifications");
                        notificationChannel2.setSound(null, null);
                        this.c.createNotificationChannel(notificationChannel2);
                    }
                    if (this.c.getNotificationChannel("anydesk_chat") == null) {
                        NotificationChannel notificationChannel3 = new NotificationChannel("anydesk_chat", "AnyDesk Chats", 4);
                        notificationChannel3.setDescription("AnyDesk chat notifications");
                        notificationChannel3.setSound(null, null);
                        this.c.createNotificationChannel(notificationChannel3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Notification f(Context context) {
        dq0 dq0Var = new dq0(context, "anydesk");
        dq0Var.o = "anydesk";
        dq0Var.w.icon = R.drawable.ic_notify_main_service;
        Looper looper = t70.a;
        dq0Var.q = uj.l(context, R.color.colorPrimary);
        dq0Var.f(JniAdExt.n1("ad.status.service.android.running.title"));
        dq0Var.g = PendingIntent.getActivity(context, bu0.s(), new Intent(context, (Class<?>) MainActivity.class), d);
        dq0Var.d(false);
        dq0Var.g(2, true);
        dq0Var.r = 1;
        Notification notificationB = dq0Var.b();
        notificationB.flags |= 96;
        return notificationB;
    }

    public static Notification h(Context context) {
        dq0 dq0Var = new dq0(context, "anydesk");
        dq0Var.o = "anydesk";
        dq0Var.w.icon = R.drawable.ic_notify_vpn;
        Looper looper = t70.a;
        dq0Var.q = uj.l(context, R.color.colorPrimary);
        dq0Var.f(JniAdExt.n1("ad.msg.vpn.started.android"));
        dq0Var.g = PendingIntent.getActivity(context, bu0.s(), new Intent(context, (Class<?>) MainActivity.class), d);
        dq0Var.j(true);
        dq0Var.d(false);
        dq0Var.g(2, true);
        dq0Var.r = 1;
        Notification notificationB = dq0Var.b();
        notificationB.flags |= 96;
        return notificationB;
    }

    public final void a(int i) {
        NotificationManager notificationManager = this.c;
        if (notificationManager != null) {
            notificationManager.cancel("" + i, 800);
        }
    }

    public final void b() {
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    public final dq0 c(int i, PendingIntent pendingIntent) {
        boolean z;
        byte[] bArr;
        dq0 dq0Var = new dq0(this.b, "anydesk_chat");
        dq0Var.o = "anydesk_chat";
        MainApplication mainApplicationV = MainApplication.v();
        if (i != 0) {
            z80 z80Var = (z80) JniAdExt.C0.get(Integer.valueOf(i));
            if (z80Var != null) {
                byte[] bArr2 = z80Var.g;
                z = z80Var.e;
                bArr = bArr2;
            } else {
                bArr = null;
                z = false;
            }
        } else if (mainApplicationV.n0 != 1) {
            bArr = mainApplicationV.i;
            z = mainApplicationV.l;
        } else {
            bArr = null;
            z = false;
        }
        dq0Var.h(t70.E(this.b, bArr, z, true, this.a));
        dq0Var.w.icon = R.drawable.ic_notify_chat;
        dq0Var.q = uj.l(this.b, R.color.colorPrimary);
        dq0Var.j(true);
        dq0Var.d(true);
        dq0Var.g = pendingIntent;
        return dq0Var;
    }

    public final Notification d(String str, Bitmap bitmap) {
        dq0 dq0Var = new dq0(this.b, "anydesk");
        dq0Var.o = "anydesk";
        dq0Var.w.icon = R.drawable.ic_notify_connected;
        dq0Var.h(bitmap);
        Context context = this.b;
        Looper looper = t70.a;
        dq0Var.q = uj.l(context, R.color.colorPrimary);
        dq0Var.f(JniAdExt.n1("ad.status.chat.connection.established"));
        dq0Var.e(String.format(JniAdExt.n1("ad.status.sess.connected"), str));
        dq0Var.g = PendingIntent.getActivity(this.b, bu0.s(), new Intent(this.b, (Class<?>) MainActivity.class), d);
        dq0Var.d(false);
        dq0Var.g(2, true);
        dq0Var.r = 1;
        Notification notificationB = dq0Var.b();
        notificationB.flags |= 96;
        return notificationB;
    }

    public final Notification e(Context context, int i, String str, long j, String str2, boolean z, String str3, byte[] bArr, n11 n11Var, boolean z2) {
        dq0 dq0Var = new dq0(context, "anydesk");
        dq0Var.o = "anydesk";
        dq0Var.w.icon = R.drawable.ic_notify_connected;
        Context context2 = this.b;
        Logging logging = this.a;
        dq0Var.h(t70.E(context2, bArr, z, true, logging));
        dq0Var.q = uj.l(context, R.color.colorPrimary);
        dq0Var.f(JniAdExt.n1("ad.status.chat.connection.established"));
        StringBuilder sb = new StringBuilder();
        sb.append(t70.s(q51.c(n11Var), t70.c(j, str, str2, str3, z), logging));
        if (JniAdExt.s2(21) == 0) {
            sb.append("\n");
            sb.append(JniAdExt.n1("ad.watermark.license.needs_review_by_legal.android"));
        }
        dq0Var.e(sb.toString());
        ui0 ui0Var = new ui0(3, false);
        ui0Var.d = dq0.c(sb.toString());
        dq0Var.l(ui0Var);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        int iS = bu0.s();
        int i2 = d;
        dq0Var.g = PendingIntent.getActivity(context, iS, intent, i2);
        Intent intent2 = new Intent(context, (Class<?>) DisconnectReceiver.class);
        intent2.putExtra("session_idx", i);
        dq0Var.a(new aq0(IconCompat.b(this.b, R.drawable.ic_notify_action_disconnect), JniAdExt.n1("ad.accept.btn.disconnect"), PendingIntent.getBroadcast(context, bu0.s(), intent2, i2)).a());
        if (z2) {
            Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
            intent3.putExtra("cmd", 11);
            dq0Var.a(new aq0(IconCompat.b(this.b, R.drawable.ic_notify_action_capture_restart), JniAdExt.n1("ad.msg.capture_restart.android"), PendingIntent.getActivity(context, bu0.s(), intent3, i2)).a());
        }
        dq0Var.d(false);
        dq0Var.g(2, true);
        dq0Var.r = 1;
        Notification notificationB = dq0Var.b();
        notificationB.flags |= 96;
        return notificationB;
    }

    public final Notification g(String str) {
        dq0 dq0Var = new dq0(this.b, "anydesk");
        dq0Var.o = "anydesk";
        dq0Var.w.icon = R.drawable.ic_notify_record;
        Context context = this.b;
        Looper looper = t70.a;
        dq0Var.q = uj.l(context, R.color.colorPrimary);
        dq0Var.f(JniAdExt.n1("ad.status.select_files.replay.title"));
        dq0Var.e(String.format(JniAdExt.n1("ad.status.sess.playback"), str));
        dq0Var.g = PendingIntent.getActivity(this.b, bu0.s(), new Intent(this.b, (Class<?>) MainActivity.class), d);
        dq0Var.d(false);
        dq0Var.g(2, true);
        dq0Var.r = 1;
        Notification notificationB = dq0Var.b();
        notificationB.flags |= 96;
        return notificationB;
    }

    public final boolean i(String str) {
        NotificationChannel notificationChannel;
        NotificationManager notificationManager = this.c;
        return (notificationManager == null || (notificationChannel = notificationManager.getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0) ? false : true;
    }

    public final PendingIntent j(int i) {
        Intent intent = new Intent(this.b, (Class<?>) MainActivity.class);
        intent.putExtra("cmd", 9);
        intent.putExtra("session_idx", i);
        return PendingIntent.getActivity(this.b, bu0.s(), intent, d | 134217728);
    }

    public final void k(int i, fl flVar, int i2, int i3, boolean z, String[] strArr) {
        if (this.c == null || this.b == null) {
            return;
        }
        PendingIntent pendingIntentJ = j(i);
        dq0 dq0VarC = c(i, pendingIntentJ);
        dq0VarC.f(i2 == 1 ? String.format(JniAdExt.n1("ad.chat.new_message"), flVar.c) : String.format(JniAdExt.n1("ad.chat.new_messages"), Integer.valueOf(i2), flVar.c));
        dq0VarC.i = 1;
        dq0VarC.k(RingtoneManager.getDefaultUri(2));
        if (i3 != 2 || z) {
            dq0VarC.s = dq0VarC.b();
        } else {
            dq0VarC.r = 1;
        }
        dq0VarC.e(flVar.d);
        dq0VarC.a(new aq0(IconCompat.b(this.b, R.drawable.ic_notify_action_chat), JniAdExt.n1("ad.chat.open"), pendingIntentJ).a());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            Intent intent = new Intent(this.b, (Class<?>) ChatDirectReplyReceiver.class);
            intent.putExtra("session_idx", i);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, bu0.s(), intent, 134217728 | (i4 >= 31 ? 33554432 : 0));
            tx0 tx0Var = new tx0(JniAdExt.n1("ad.chat.reply"), new Bundle(), new HashSet());
            aq0 aq0Var = new aq0(IconCompat.b(this.b, R.drawable.ic_notify_action_chat_reply), JniAdExt.n1("ad.chat.reply"), broadcast);
            ArrayList arrayList = new ArrayList();
            aq0Var.f = arrayList;
            arrayList.add(tx0Var);
            dq0VarC.a(aq0Var.a());
            if (strArr != null && strArr.length > 0) {
                dq0VarC.l = strArr;
            }
        }
        this.c.notify(gr0.e(i, ""), 800, dq0VarC.b());
    }
}
