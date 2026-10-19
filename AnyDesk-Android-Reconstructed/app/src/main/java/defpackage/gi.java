package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gi {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public gi(bo0 bo0Var) {
        Intent launchIntentForPackage;
        Context context = bo0Var.a;
        this.a = context;
        this.b = new yg(context, false);
        a10 a10Var = new a10(new b10(new o81(h11.c0(context, new a0(13)), new a0(14), 1), new a0(20), 0));
        Activity activity = (Activity) (!a10Var.hasNext() ? null : a10Var.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
        this.d = bo0Var.b.g();
    }

    public x81 a() {
        ArrayList arrayList = (ArrayList) this.e;
        Intent intent = (Intent) this.c;
        xn0 xn0Var = (xn0) this.d;
        if (xn0Var == null) {
            nh0.j("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            nh0.j("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        vn0 vn0Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tn0 tn0Var = (tn0) obj;
            int i2 = tn0Var.a;
            Bundle bundle = tn0Var.b;
            vn0 vn0VarB = b(i2);
            if (vn0VarB == null) {
                int i3 = vn0.h;
                nh0.k("Navigation destination ", ec1.q((yg) this.b, i2), " cannot be found in the navigation graph ", xn0Var);
                return null;
            }
            for (int i4 : vn0VarB.b(vn0Var)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            vn0Var = vn0VarB;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", tm.v0(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        x81 x81Var = new x81((Context) this.a);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(x81Var.d.getPackageManager());
        }
        if (component != null) {
            x81Var.a(component);
        }
        ArrayList arrayList4 = x81Var.c;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = (Intent) arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return x81Var;
    }

    public vn0 b(int i) {
        qd qdVar = new qd();
        xn0 xn0Var = (xn0) this.d;
        xn0Var.getClass();
        qdVar.addLast(xn0Var);
        while (!qdVar.isEmpty()) {
            vn0 vn0Var = (vn0) qdVar.removeFirst();
            if (vn0Var.d.a == i) {
                return vn0Var;
            }
            if (vn0Var instanceof xn0) {
                Iterator it = ((xn0) vn0Var).iterator();
                while (true) {
                    yn0 yn0Var = (yn0) it;
                    if (yn0Var.hasNext()) {
                        qdVar.addLast((vn0) yn0Var.next());
                    }
                }
            }
        }
        return null;
    }

    public synchronized Uri c(SharedPreferences sharedPreferences, String str) {
        Looper looper = t70.a;
        String string = null;
        try {
            string = sharedPreferences.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string == null) {
            return (Uri) this.a;
        }
        Uri uri = Uri.parse(string);
        if (uri != null) {
            return uri;
        }
        return (Uri) this.a;
    }

    public synchronized Uri d() {
        return (Uri) this.d;
    }

    public synchronized Uri e() {
        return (Uri) this.c;
    }

    public void f(int i) {
        new c81((Context) this.a).inflate(i, (rk0) this.b);
    }

    public void g(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        e71 e71Var = (e71) ((LinkedHashMap) this.c).get(str);
        if (e71Var != null) {
            e71Var.h(obj);
        }
        e71 e71Var2 = (e71) ((LinkedHashMap) this.d).get(str);
        if (e71Var2 != null) {
            e71Var2.h(obj);
        }
    }

    public synchronized void h(SharedPreferences sharedPreferences, String str, Uri uri) {
        String string = uri == null ? null : uri.toString();
        Looper looper = t70.a;
        sharedPreferences.edit().putString(str, string).commit();
    }

    public synchronized void i(Uri uri) {
        this.d = uri;
        h((SharedPreferences) this.e, "notification_sound_session_close", uri);
    }

    public synchronized void j(Uri uri) {
        this.c = uri;
        h((SharedPreferences) this.e, "notification_sound_session_creation", uri);
    }

    public void k() {
        cl0 cl0Var = (cl0) this.c;
        if (cl0Var.b()) {
            return;
        }
        if (cl0Var.e != null) {
            cl0Var.d(0, 0, false, false);
        } else {
            nh0.j("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((tn0) obj).a;
            if (b(i2) == null) {
                int i3 = vn0.h;
                nh0.n(q51.n("Navigation destination ", ec1.q((yg) this.b, i2), " cannot be found in the navigation graph "), (xn0) this.d);
                return;
            }
        }
    }

    public gi(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new k40(3, this);
    }

    public gi(t10 t10Var, nm nmVar) {
        t10Var.getClass();
        this.a = new y7();
        int i = 1;
        v41 v41VarA = bu0.a(1, Integer.MAX_VALUE, oh.c);
        this.b = v41VarA;
        rq rqVar = null;
        this.c = new v71(v41VarA, new af(this, null));
        z61 z61VarB = th1.B(nmVar, null, nr.d, new ih(t10Var, this, rqVar, 2), 1);
        z61VarB.N(new ue(i, this));
        this.d = z61VarB;
        this.e = new ji(5, new ih(this, rqVar, i));
    }

    public gi(SharedPreferences sharedPreferences) {
        this.a = RingtoneManager.getDefaultUri(2);
        this.e = sharedPreferences;
        synchronized (this) {
            this.b = c(sharedPreferences, "notification_sound_incoming_connection_request");
            this.c = c(sharedPreferences, "notification_sound_session_creation");
            this.d = c(sharedPreferences, "notification_sound_session_close");
        }
    }

    public gi(Context context, View view) {
        this.a = context;
        rk0 rk0Var = new rk0(context);
        this.b = rk0Var;
        rk0Var.e = new xt0(2, this);
        cl0 cl0Var = new cl0(context, rk0Var, view, false, R.attr.popupMenuStyle, 0);
        this.c = cl0Var;
        cl0Var.f = 0;
        cl0Var.j = new bl0(1, this);
    }
}
