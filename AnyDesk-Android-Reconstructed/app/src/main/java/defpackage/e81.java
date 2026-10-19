package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class e81 extends ve1 {
    public static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat h = new SimpleDateFormat("HH:mm");
    public static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public String b = "";
    public final Calendar c = Calendar.getInstance();
    public final Calendar d = Calendar.getInstance();
    public boolean e = false;
    public boolean f = false;

    public final synchronized String e() {
        return i.format(this.d.getTime());
    }

    public final synchronized String f() {
        if (!this.e) {
            return "00-00-00";
        }
        return g.format(this.c.getTime());
    }

    public final synchronized int g() {
        return this.c.get(5);
    }

    public final synchronized int h() {
        return this.c.get(12);
    }

    public final synchronized int i() {
        return this.c.get(2);
    }

    public final synchronized String j() {
        return this.b;
    }

    public final synchronized String k() {
        return f() + " " + l();
    }

    public final synchronized String l() {
        if (!this.f) {
            return "00:00";
        }
        return h.format(this.c.getTime());
    }
}
