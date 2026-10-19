package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.anydesk.anydeskandroid.IncomingConnectionService;
import com.anydesk.jnilib.Logging;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class m11 {
    public final Context b;
    public final Logging a = new Logging("ServiceManager");
    public final Object d = new Object();
    public final Hashtable e = new Hashtable();
    public final bc0 f = new bc0(15, this);
    public boolean c = false;

    public m11(Context context) {
        this.b = context;
    }

    public final boolean a() {
        synchronized (this.d) {
            try {
                l11 l11Var = (l11) this.e.get(IncomingConnectionService.class);
                if (l11Var == null) {
                    return false;
                }
                return l11Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(Class cls, Intent intent) {
        if (this.c) {
            return false;
        }
        try {
            synchronized (this.d) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    Context context = this.b;
                    if ((i >= 26 ? context.startForegroundService(intent) : context.startService(intent)) == null) {
                        this.a.a("cannot start service '" + cls.getSimpleName() + "'");
                        return false;
                    }
                    l11 l11Var = (l11) this.e.get(cls);
                    if (l11Var == null) {
                        l11Var = new l11();
                        l11Var.a = cls;
                        l11Var.b = false;
                        l11Var.c = false;
                        l11Var.d = false;
                        l11Var.e = true;
                        this.e.put(cls, l11Var);
                    }
                    l11Var.b = true;
                    l11Var.c = false;
                    l11Var.d = false;
                    l11Var.e = false;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.a.a("cannot start service '" + cls.getSimpleName() + "': " + th2.getMessage());
            return false;
        }
    }

    public final void c(Class cls) {
        synchronized (this.d) {
            try {
                l11 l11Var = (l11) this.e.get(cls);
                if (l11Var == null) {
                    d(cls);
                } else if (Build.VERSION.SDK_INT < 26) {
                    l11Var.b = false;
                    d(cls);
                } else if (l11Var.b) {
                    if (l11Var.c) {
                        l11Var.b = false;
                        d(cls);
                    } else {
                        l11Var.d = true;
                        t70.Z(this.f, 10000L);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Class cls) {
        Context context = this.b;
        Logging logging = this.a;
        try {
            logging.e("stopping service ".concat(cls.getSimpleName()));
            context.stopService(new Intent(context, (Class<?>) cls));
        } catch (Throwable th) {
            logging.a("cannot stop service '" + cls.getSimpleName() + "': " + th.getMessage());
        }
    }
}
