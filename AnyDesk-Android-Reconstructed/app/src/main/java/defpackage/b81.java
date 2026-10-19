package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class b81 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ c81 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public wk0 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public b81(c81 c81Var, Menu menu) {
        this.E = c81Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        c81 c81Var = this.E;
        Context context = c81Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                nh0.j("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (c81Var.d == null) {
                c81Var.d = c81.a(context);
            }
            Object obj = c81Var.d;
            String str = this.y;
            a81 a81Var = new a81();
            a81Var.b = obj;
            Class<?> cls = obj.getClass();
            try {
                a81Var.c = cls.getMethod(str, a81.d);
                menuItem.setOnMenuItemClickListener(a81Var);
            } catch (Exception e) {
                StringBuilder sbN = q51.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof vk0) {
                ((vk0) menuItem).f(true);
            } else if (menuItem instanceof zk0) {
                zk0 zk0Var = (zk0) menuItem;
                d81 d81Var = zk0Var.c;
                try {
                    if (zk0Var.d == null) {
                        zk0Var.d = d81Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    zk0Var.d.invoke(d81Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, c81.e, c81Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        wk0 wk0Var = this.z;
        if (wk0Var != null) {
            if (menuItem instanceof d81) {
                ((d81) menuItem).a(wk0Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof d81;
        if (z2) {
            ((d81) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hb.i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((d81) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hb.q(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((d81) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hb.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((d81) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hb.m(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((d81) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                hb.l(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            hq.M(menuItem, colorStateList);
        }
    }
}
