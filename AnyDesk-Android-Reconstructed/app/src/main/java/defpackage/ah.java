package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public ah(Typeface typeface, ql0 ql0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = ql0Var;
        this.c = new rl0(1024);
        int iA = ql0Var.a(6);
        if (iA != 0) {
            int i5 = iA + ql0Var.c;
            i = ((ByteBuffer) ql0Var.f).getInt(((ByteBuffer) ql0Var.f).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = ql0Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + ql0Var.c;
            i2 = ((ByteBuffer) ql0Var.f).getInt(((ByteBuffer) ql0Var.f).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            mc1 mc1Var = new mc1(this, i7);
            pl0 pl0VarB = mc1Var.b();
            int iA3 = pl0VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) pl0VarB.f).getInt(iA3 + pl0VarB.c) : 0, (char[]) this.b, i7 * 2);
            pl0 pl0VarB2 = mc1Var.b();
            int iA4 = pl0VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + pl0VarB2.c;
                i3 = ((ByteBuffer) pl0VarB2.f).getInt(((ByteBuffer) pl0VarB2.f).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                id.q("invalid metadata codepoint length");
                throw null;
            }
            rl0 rl0Var = (rl0) this.c;
            pl0 pl0VarB3 = mc1Var.b();
            int iA5 = pl0VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + pl0VarB3.c;
                i4 = ((ByteBuffer) pl0VarB3.f).getInt(((ByteBuffer) pl0VarB3.f).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            rl0Var.a(mc1Var, 0, i4 - 1);
        }
    }

    public static void k(Context context, PackageManager packageManager, j11 j11Var, boolean z) {
        boolean zQ;
        if (z || !t70.L(packageManager, j11Var.a)) {
            String str = "https://help.anydesk.com/" + JniAdExt.d2() + "/android-control-plugin?id=" + j11Var.a;
            if (TextUtils.isEmpty(str)) {
                zQ = false;
            } else {
                zQ = t70.R(context, str, false) ? true : t70.Q(context, str, true);
            }
            if (zQ) {
                return;
            }
            String str2 = j11Var.a;
            String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
            if (!strSubstring.isEmpty()) {
                str2 = strSubstring;
            }
            t70.g0(context, String.format(JniAdExt.n1("ad.menu.install.manual.msg.android"), str2), 1);
        }
    }

    public void a(Context context) {
        Logging logging = (Logging) this.a;
        if (p() && !t70.S(context, "android.settings.ACCESSIBILITY_SETTINGS", "android.settings.ACCESSIBILITY_SETTINGS", ((j11) this.c).a, logging)) {
            t70.g0(context, JniAdExt.n1("ad.menu.install.android.acc_service.error"), 1);
            t70.T(context, logging, new Intent("android.settings.SETTINGS").addFlags(268435456));
        }
    }

    public void b(c40 c40Var) {
        if (((ArrayList) this.a).contains(c40Var)) {
            id.l(c40Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(c40Var);
        }
        c40Var.m = true;
    }

    public c40 c(String str) {
        i50 i50Var = (i50) ((HashMap) this.b).get(str);
        if (i50Var != null) {
            return i50Var.c;
        }
        return null;
    }

    public c40 d(String str) {
        for (i50 i50Var : ((HashMap) this.b).values()) {
            if (i50Var != null) {
                c40 c40VarD = i50Var.c;
                if (!str.equals(c40VarD.g)) {
                    c40VarD = c40VarD.w.c.d(str);
                }
                if (c40VarD != null) {
                    return c40VarD;
                }
            }
        }
        return null;
    }

    public z71 e(a6 a6Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z71 z71Var = (z71) arrayList.get(i);
            if (z71Var != null && z71Var.b == a6Var) {
                return z71Var;
            }
        }
        z71 z71Var2 = new z71((Context) this.b, a6Var);
        arrayList.add(z71Var2);
        return z71Var2;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (i50 i50Var : ((HashMap) this.b).values()) {
            if (i50Var != null) {
                arrayList.add(i50Var);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (i50 i50Var : ((HashMap) this.b).values()) {
            if (i50Var != null) {
                arrayList.add(i50Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public ve1 i(fm fmVar, String str) {
        ve1 ve1Var;
        boolean zIsInstance;
        ve1 ve1VarA;
        synchronized (((us0) this.d)) {
            try {
                bf1 bf1Var = (bf1) this.a;
                bf1Var.getClass();
                ve1Var = (ve1) bf1Var.a.get(str);
                Class clsT = fmVar.a;
                clsT.getClass();
                Map map = fm.b;
                map.getClass();
                Integer num = (Integer) map.get(clsT);
                if (num != null) {
                    zIsInstance = ec1.x(num.intValue(), ve1Var);
                } else {
                    if (clsT.isPrimitive()) {
                        clsT = lk0.t(nx0.a(clsT));
                    }
                    zIsInstance = clsT.isInstance(ve1Var);
                }
                if (zIsInstance) {
                    ze1 ze1Var = (ze1) this.b;
                    if (ze1Var instanceof h01) {
                        h01 h01Var = (h01) ze1Var;
                        ve1Var.getClass();
                        if0 if0Var = h01Var.d;
                        if (if0Var != null) {
                            ui0 ui0Var = h01Var.e;
                            ui0Var.getClass();
                            hq.f(ve1Var, ui0Var, if0Var);
                        }
                    }
                    ve1Var.getClass();
                } else {
                    um0 um0Var = new um0((qr) this.c);
                    um0Var.a.put(af1.e, str);
                    ze1 ze1Var2 = (ze1) this.b;
                    ze1Var2.getClass();
                    try {
                        try {
                            ve1VarA = ze1Var2.c(fmVar, um0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = fmVar.a;
                            cls.getClass();
                            ve1VarA = ze1Var2.a(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = fmVar.a;
                        cls2.getClass();
                        ve1VarA = ze1Var2.b(cls2, um0Var);
                    }
                    ve1Var = ve1VarA;
                    bf1 bf1Var2 = (bf1) this.a;
                    bf1Var2.getClass();
                    ve1Var.getClass();
                    ve1 ve1Var2 = (ve1) bf1Var2.a.put(str, ve1Var);
                    if (ve1Var2 != null) {
                        ve1Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ve1Var;
    }

    public void j(Context context) {
        PackageManager packageManager;
        j11 j11Var;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || (j11Var = (j11) this.c) == null) {
            return;
        }
        k(context, packageManager, j11Var, false);
    }

    public j11 l() {
        PackageManager packageManager;
        j11 j11Var = (j11) this.c;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || j11Var == null) {
            return null;
        }
        String str = j11Var.a;
        if (t70.L(packageManager, str) && t70.G((Context) this.b, str)) {
            return j11Var;
        }
        return null;
    }

    public boolean m(uq uqVar) {
        boolean z;
        boolean z2 = false;
        if (uqVar == null) {
            return false;
        }
        String strConcat = "plugin ".concat(((j11) this.c).a());
        if (uqVar.e != null) {
            z = true;
        } else {
            ((Logging) this.a).e(strConcat.concat(" disabled: no connection"));
            z = false;
        }
        if (p()) {
            ((Logging) this.a).e(strConcat.concat(" disabled: no permission"));
        } else {
            z2 = z;
        }
        if (z2) {
            ((Logging) this.a).e(strConcat.concat(" enabled."));
        }
        return z2;
    }

    public void n(i50 i50Var) {
        c40 c40Var = i50Var.c;
        String str = c40Var.g;
        HashMap map = (HashMap) this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(c40Var.g, i50Var);
        if (t40.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + c40Var);
        }
    }

    public void o(i50 i50Var) {
        HashMap map = (HashMap) this.b;
        c40 c40Var = i50Var.c;
        if (c40Var.D) {
            ((w40) this.d).h(c40Var);
        }
        if (map.get(c40Var.g) == i50Var && ((i50) map.put(c40Var.g, null)) != null && t40.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + c40Var);
        }
    }

    public boolean p() {
        PackageManager packageManager;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        j11 j11Var = (j11) this.c;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || j11Var != tq.b || !t70.L(packageManager, j11Var.a)) {
            return false;
        }
        Context context = (Context) this.b;
        String str = j11Var.a;
        Logging logging = (Logging) this.a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) != null) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getResolveInfo().serviceInfo.packageName)) {
                    logging.e("acc service " + str + " is enabled");
                    return false;
                }
            }
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled") == 1) {
                TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
                if (string != null) {
                    simpleStringSplitter.setString(string);
                    String str2 = str + "/com.anydesk.adcontrol.AccService";
                    while (simpleStringSplitter.hasNext()) {
                        if (simpleStringSplitter.next().equalsIgnoreCase(str2)) {
                            logging.e("acc service " + str + " is enabled (fallback)");
                            return false;
                        }
                    }
                }
            }
        } catch (Settings.SettingNotFoundException e) {
            logging.a("error getting accessibility setting: " + e.getMessage());
        }
        logging.e("acc service " + str + " is disabled");
        return true;
    }

    public void q() {
        PackageManager packageManager;
        j11 j11Var;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || (j11Var = (j11) this.c) == null) {
            return;
        }
        t70.L(packageManager, j11Var.a);
    }

    public j11 r() {
        PackageManager packageManager;
        j11 j11Var = (j11) this.c;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || j11Var == null || t70.L(packageManager, j11Var.a)) {
            return null;
        }
        return j11Var;
    }

    public j11 s() {
        PackageManager packageManager;
        j11 j11Var = (j11) this.c;
        if (!JniAdExt.L1() || (packageManager = (PackageManager) this.d) == null || j11Var == null) {
            return null;
        }
        long j = j11Var.b;
        String str = j11Var.a;
        long jV = t70.v(packageManager, str);
        if (jV < 0 || jV >= j) {
            return null;
        }
        ((Logging) this.a).e("plugin " + str + " " + jV + " needs update to " + j);
        return j11Var;
    }

    public boolean t(a6 a6Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(e(a6Var), new zk0((Context) this.b, (d81) menuItem));
    }

    public boolean u(a6 a6Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        z71 z71VarE = e(a6Var);
        i51 i51Var = (i51) this.d;
        Menu ml0Var = (Menu) i51Var.get(menu);
        if (ml0Var == null) {
            ml0Var = new ml0((Context) this.b, (rk0) menu);
            i51Var.put(menu, ml0Var);
        }
        return callback.onCreateActionMode(z71VarE, ml0Var);
    }

    public Bundle v(String str, Bundle bundle) {
        HashMap map = (HashMap) this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public ah(int i) {
        switch (i) {
            case 7:
                this.a = new xd(0);
                this.b = new SparseArray();
                this.c = new xh0();
                this.d = new xd(0);
                break;
            default:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    public ah(bf1 bf1Var, ze1 ze1Var, qr qrVar) {
        bf1Var.getClass();
        ze1Var.getClass();
        qrVar.getClass();
        this.a = bf1Var;
        this.b = ze1Var;
        this.c = qrVar;
        this.d = new us0(17);
    }

    public ah(Context context, j11 j11Var) {
        this.a = new Logging("PluginHelper");
        this.b = context;
        this.c = j11Var;
        this.d = context.getPackageManager();
    }

    public ah(ev evVar) {
        this.a = new bc(26);
        this.b = new bc(26);
        this.d = new ReentrantLock();
    }

    public ah(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
        this.c = new ArrayList();
        this.d = new i51(0);
    }

    public ah(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
    }

    public ah(lk0 lk0Var, gq0 gq0Var, String str, Context context) {
        this.a = lk0Var;
        this.b = gq0Var;
        this.c = str;
        this.d = context;
    }
}
