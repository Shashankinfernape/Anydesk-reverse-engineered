package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends bb implements pk0, LayoutInflater.Factory2 {
    public static final i51 i0 = new i51(0);
    public static final int[] j0 = {R.attr.windowBackground};
    public static final boolean k0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public pb[] M;
    public pb N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public lb X;
    public lb Y;
    public boolean Z;
    public int a0;
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public hd f0;
    public OnBackInvokedDispatcher g0;
    public OnBackInvokedCallback h0;
    public final Object l;
    public final Context m;
    public Window n;
    public kb o;
    public th1 p;
    public c81 q;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public db t;
    public db u;
    public a6 v;
    public ActionBarContextView w;
    public PopupWindow x;
    public cb y;
    public df1 z = null;
    public final cb b0 = new cb(this, 0);

    public qb(Context context, Window window, sa saVar, Object obj) {
        qa qaVar = null;
        this.T = -100;
        this.m = context;
        this.l = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof qa)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    qaVar = (qa) context;
                    break;
                }
            }
            if (qaVar != null) {
                this.T = ((qb) qaVar.W()).T;
            }
        }
        if (this.T == -100) {
            String name = this.l.getClass().getName();
            i51 i51Var = i0;
            Integer num = (Integer) i51Var.get(name);
            if (num != null) {
                this.T = num.intValue();
                i51Var.remove(this.l.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        tb.d();
    }

    public static kh0 p(Context context) {
        kh0 kh0Var;
        kh0 kh0VarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (kh0Var = bb.e) == null) {
            return null;
        }
        mh0 mh0Var = kh0Var.a;
        kh0 kh0VarZ = z(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i < 24) {
            kh0VarB = mh0Var.isEmpty() ? kh0.b : kh0.b(fb.b(mh0Var.get(0)));
        } else if (mh0Var.isEmpty()) {
            kh0VarB = kh0.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < kh0VarZ.a.size() + mh0Var.size()) {
                Locale locale = i2 < mh0Var.size() ? mh0Var.get(i2) : kh0VarZ.a.get(i2 - mh0Var.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            kh0VarB = kh0.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return kh0VarB.a.isEmpty() ? kh0VarZ : kh0VarB;
    }

    public static Configuration t(Context context, int i, kh0 kh0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (kh0Var != null) {
            mh0 mh0Var = kh0Var.a;
            if (Build.VERSION.SDK_INT >= 24) {
                gb.d(configuration2, kh0Var);
                return configuration2;
            }
            configuration2.setLocale(mh0Var.get(0));
            configuration2.setLayoutDirection(mh0Var.get(0));
        }
        return configuration2;
    }

    public static kh0 z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? gb.b(configuration) : kh0.b(fb.b(configuration.locale));
    }

    public final pb A(int i) {
        pb[] pbVarArr = this.M;
        if (pbVarArr == null || pbVarArr.length <= i) {
            pb[] pbVarArr2 = new pb[i + 1];
            if (pbVarArr != null) {
                System.arraycopy(pbVarArr, 0, pbVarArr2, 0, pbVarArr.length);
            }
            this.M = pbVarArr2;
            pbVarArr = pbVarArr2;
        }
        pb pbVar = pbVarArr[i];
        if (pbVar != null) {
            return pbVar;
        }
        pb pbVar2 = new pb();
        pbVar2.a = i;
        pbVar2.n = false;
        pbVarArr[i] = pbVar2;
        return pbVar2;
    }

    public final void B() {
        w();
        if (this.G && this.p == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                this.p = new ng1((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.p = new ng1((Dialog) obj);
            }
            th1 th1Var = this.p;
            if (th1Var != null) {
                th1Var.P(this.c0);
            }
        }
    }

    public final void C(int i) {
        this.a0 = (1 << i) | this.a0;
        if (this.Z) {
            return;
        }
        View decorView = this.n.getDecorView();
        WeakHashMap weakHashMap = oe1.a;
        decorView.postOnAnimation(this.b0);
        this.Z = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            nh0.j("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.Y == null) {
                            this.Y = new lb(this, context);
                        }
                        return this.Y.g();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.O;
        this.O = false;
        pb pbVarA = A(0);
        if (!pbVarA.m) {
            a6 a6Var = this.v;
            if (a6Var != null) {
                a6Var.a();
                return true;
            }
            B();
            th1 th1Var = this.p;
            if (th1Var == null || !th1Var.j()) {
                return false;
            }
        } else if (!z) {
            s(pbVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.h.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.pb r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.F(pb, android.view.KeyEvent):void");
    }

    public final boolean G(pb pbVar, int i, KeyEvent keyEvent) {
        rk0 rk0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pbVar.k || H(pbVar, keyEvent)) && (rk0Var = pbVar.h) != null) {
            return rk0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    public final boolean H(pb pbVar, KeyEvent keyEvent) {
        rk0 rk0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.R) {
            boolean z = pbVar.k;
            int i = pbVar.a;
            if (z) {
                return true;
            }
            pb pbVar2 = this.N;
            if (pbVar2 != null && pbVar2 != pbVar) {
                s(pbVar2, false);
            }
            Window.Callback callback = this.n.getCallback();
            if (callback != null) {
                pbVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.s) != null) {
                actionBarOverlayLayout4.k();
                ((va1) actionBarOverlayLayout4.g).l = true;
            }
            if (pbVar.g == null && (!z2 || !(this.p instanceof ra1))) {
                rk0 rk0Var2 = pbVar.h;
                if (rk0Var2 == null || pbVar.o) {
                    if (rk0Var2 == null) {
                        Context context = this.m;
                        if ((i == 0 || i == 108) && this.s != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.anydesk.anydeskandroid.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.anydesk.anydeskandroid.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.anydesk.anydeskandroid.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                qq qqVar = new qq(context, 0);
                                qqVar.getTheme().setTo(themeNewTheme);
                                context = qqVar;
                            }
                        }
                        rk0 rk0Var3 = new rk0(context);
                        rk0Var3.e = this;
                        rk0 rk0Var4 = pbVar.h;
                        if (rk0Var3 != rk0Var4) {
                            if (rk0Var4 != null) {
                                rk0Var4.r(pbVar.i);
                            }
                            pbVar.h = rk0Var3;
                            dg0 dg0Var = pbVar.i;
                            if (dg0Var != null) {
                                rk0Var3.b(dg0Var, rk0Var3.a);
                            }
                        }
                        if (pbVar.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.s) != null) {
                                if (this.t == null) {
                                    this.t = new db(this, 2);
                                }
                                actionBarOverlayLayout2.l(pbVar.h, this.t);
                            }
                            pbVar.h.w();
                            if (callback.onCreatePanelMenu(i, pbVar.h)) {
                                pbVar.o = false;
                            } else {
                                rk0Var = pbVar.h;
                                if (rk0Var != null) {
                                    if (rk0Var != null) {
                                        rk0Var.r(pbVar.i);
                                    }
                                    pbVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.s) != null) {
                                    actionBarOverlayLayout.l(null, this.t);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.t == null) {
                                this.t = new db(this, 2);
                            }
                            actionBarOverlayLayout2.l(pbVar.h, this.t);
                        }
                        pbVar.h.w();
                        if (callback.onCreatePanelMenu(i, pbVar.h)) {
                            rk0Var = pbVar.h;
                            if (rk0Var != null) {
                                if (rk0Var != null) {
                                    rk0Var.r(pbVar.i);
                                }
                                pbVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.t);
                            }
                        } else {
                            pbVar.o = false;
                        }
                    }
                }
                pbVar.h.w();
                Bundle bundle = pbVar.p;
                if (bundle != null) {
                    pbVar.h.s(bundle);
                    pbVar.p = null;
                }
                if (!callback.onPreparePanel(0, pbVar.g, pbVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.s) != null) {
                        actionBarOverlayLayout3.l(null, this.t);
                    }
                    pbVar.h.v();
                    return false;
                }
                pbVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                pbVar.h.v();
            }
            pbVar.k = true;
            pbVar.l = false;
            this.N = pbVar;
            return true;
        }
        return false;
    }

    public final void I() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.g0 != null && (A(0).m || this.v != null)) {
                z = true;
            }
            if (z && this.h0 == null) {
                this.h0 = jb.b(this.g0, this);
            } else {
                if (z || (onBackInvokedCallback = this.h0) == null) {
                    return;
                }
                jb.c(this.g0, onBackInvokedCallback);
                this.h0 = null;
            }
        }
    }

    @Override // defpackage.bb
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.m);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof qb) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.bb
    public final void b() {
        if (this.p != null) {
            B();
            if (this.p.z()) {
                return;
            }
            C(0);
        }
    }

    @Override // defpackage.bb
    public final void d() throws IllegalAccessException {
        String strA;
        this.P = true;
        m(false, true);
        x();
        Object obj = this.l;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strA = y90.A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strA = null;
            }
            if (strA != null) {
                th1 th1Var = this.p;
                if (th1Var == null) {
                    this.c0 = true;
                } else {
                    th1Var.P(true);
                }
            }
            synchronized (bb.j) {
                bb.g(this);
                bb.i.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.m.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.bb
    public final void e() {
        if (this.l instanceof Activity) {
            synchronized (bb.j) {
                bb.g(this);
            }
        }
        if (this.Z) {
            this.n.getDecorView().removeCallbacks(this.b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.l;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                i0.put(this.l.getClass().getName(), Integer.valueOf(this.T));
            } else {
                i0.remove(this.l.getClass().getName());
            }
        } else {
            i0.remove(this.l.getClass().getName());
        }
        th1 th1Var = this.p;
        if (th1Var != null) {
            th1Var.G();
        }
        lb lbVar = this.X;
        if (lbVar != null) {
            lbVar.d();
        }
        lb lbVar2 = this.Y;
        if (lbVar2 != null) {
            lbVar2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.pk0
    public final boolean f(rk0 rk0Var, MenuItem menuItem) {
        pb pbVar;
        Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.R) {
            rk0 rk0VarK = rk0Var.k();
            pb[] pbVarArr = this.M;
            int length = pbVarArr != null ? pbVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                pbVar = pbVarArr[i];
                if (pbVar != null && pbVar.h == rk0VarK) {
                    if (pbVar != null) {
                        return callback.onMenuItemSelected(pbVar.a, menuItem);
                    }
                }
            }
            pbVar = null;
            if (pbVar != null) {
                return callback.onMenuItemSelected(pbVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.bb
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i == 1) {
            I();
            this.K = true;
            return true;
        }
        if (i == 2) {
            I();
            this.E = true;
            return true;
        }
        if (i == 5) {
            I();
            this.F = true;
            return true;
        }
        if (i == 10) {
            I();
            this.I = true;
            return true;
        }
        if (i == 108) {
            I();
            this.G = true;
            return true;
        }
        if (i != 109) {
            return this.n.requestFeature(i);
        }
        I();
        this.H = true;
        return true;
    }

    @Override // defpackage.bb
    public final void i(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.m).inflate(i, viewGroup);
        this.o.a(this.n.getCallback());
    }

    @Override // defpackage.bb
    public final void j(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.o.a(this.n.getCallback());
    }

    @Override // defpackage.bb
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.o.a(this.n.getCallback());
    }

    @Override // defpackage.bb
    public final void l(CharSequence charSequence) {
        this.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        th1 th1Var = this.p;
        if (th1Var != null) {
            th1Var.U(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z, boolean z2) throws IllegalAccessException {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        Map map;
        boolean z6;
        Object obj;
        Object obj2;
        int i2;
        if (this.R) {
            return false;
        }
        int i3 = this.T;
        if (i3 == -100) {
            i3 = bb.d;
        }
        Context context = this.m;
        int iD = D(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        Object obj3 = null;
        kh0 kh0VarP = i4 < 33 ? p(context) : null;
        if (!z2 && kh0VarP != null) {
            kh0VarP = z(context.getResources().getConfiguration());
        }
        Configuration configurationT = t(context, iD, kh0VarP, null, false);
        boolean z7 = this.W;
        Object obj4 = this.l;
        if (z7 || !(obj4 instanceof Activity)) {
            this.W = true;
            i = this.V;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i4 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i4 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i2);
                    if (activityInfo != null) {
                        this.V = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.V = 0;
                }
                this.W = true;
                i = this.V;
            }
        }
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationT.uiMode & 48;
        kh0 kh0VarZ = z(configuration);
        kh0 kh0VarZ2 = kh0VarP == null ? null : z(configurationT);
        int i7 = i5 != i6 ? 512 : 0;
        if (kh0VarZ2 != null && !kh0VarZ.equals(kh0VarZ2)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.P && ((k0 || this.Q) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationT.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new l(2, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z4 = z3;
        } else {
            boolean z8 = (i & i7) == i7;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (kh0VarZ2 != null) {
                mh0 mh0Var = kh0VarZ2.a;
                if (Build.VERSION.SDK_INT >= 24) {
                    gb.d(configuration2, kh0VarZ2);
                } else {
                    configuration2.setLocale(mh0Var.get(0));
                    configuration2.setLayoutDirection(mh0Var.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (i9 >= 24) {
                    if (!ds.y) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            ds.x = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                        }
                        ds.y = true;
                    }
                    Field field = ds.x;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!ds.s) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    ds.r = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                }
                                ds.s = true;
                            }
                            Field field2 = ds.r;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                }
                            }
                            if (obj3 != null) {
                                ds.o(obj3);
                            }
                        }
                    }
                } else if (i9 >= 23) {
                    if (!ds.s) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            ds.r = declaredField3;
                            z6 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException e6) {
                                e = e6;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e7) {
                            e = e7;
                            z6 = true;
                        }
                        ds.s = z6;
                    }
                    Field field3 = ds.r;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException e8) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e8);
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        ds.o(obj);
                    }
                } else {
                    if (!ds.s) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            ds.r = declaredField4;
                            z5 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e9) {
                                e = e9;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e10) {
                            e = e10;
                            z5 = true;
                        }
                        ds.s = z5;
                    }
                    Field field4 = ds.r;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                            map = null;
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i10 = this.U;
            if (i10 != 0) {
                context.setTheme(i10);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.U, true);
                }
            }
            if (z8 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof gf0) {
                    if (((gf0) activity2).R().d.compareTo(af0.e) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.Q && !this.R) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z4 = true;
        }
        if (kh0VarZ2 != null) {
            kh0 kh0VarZ3 = z(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                gb.c(kh0VarZ3);
            } else {
                Locale.setDefault(kh0VarZ3.a.get(0));
            }
        }
        if (i3 == 0) {
            y(context).o();
        } else {
            lb lbVar = this.X;
            if (lbVar != null) {
                lbVar.d();
            }
        }
        lb lbVar2 = this.Y;
        if (i3 == 3) {
            if (lbVar2 == null) {
                this.Y = new lb(this, context);
            }
            this.Y.o();
        } else if (lbVar2 != null) {
            lbVar2.d();
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void n(Window window) {
        Drawable drawableG;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.n != null) {
            nh0.j("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof kb) {
            nh0.j("AppCompat has already installed itself into the Window");
            return;
        }
        kb kbVar = new kb(this, callback);
        this.o = kbVar;
        window.setCallback(kbVar);
        Context context = this.m;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableG = null;
        } else {
            tb tbVarA = tb.a();
            synchronized (tbVarA) {
                drawableG = tbVarA.a.g(context, resourceId, true);
            }
        }
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.n = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.g0) != null) {
            return;
        }
        Object obj = this.l;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.h0) != null) {
            jb.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.h0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.g0 = jb.a(activity);
            } else {
                this.g0 = null;
            }
        } else {
            this.g0 = null;
        }
        J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.rk0 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.o(rk0):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View ccVar;
        View view2 = null;
        if (this.f0 == null) {
            int[] iArr = yv0.j;
            Context context2 = this.m;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f0 = new hd();
            } else {
                try {
                    this.f0 = (hd) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f0 = new hd();
                }
            }
        }
        hd hdVar = this.f0;
        int i = rd1.a;
        hdVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yv0.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context qqVar = (resourceId == 0 || ((context instanceof qq) && ((qq) context).a == resourceId)) ? context : new qq(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ccVar = new cc(qqVar, attributeSet);
                break;
            case 1:
                ccVar = new ua(qqVar, attributeSet);
                break;
            case 2:
                ccVar = new zb(qqVar, attributeSet);
                break;
            case 3:
                ccVar = hdVar.e(qqVar, attributeSet);
                break;
            case 4:
                ccVar = new AppCompatImageButton(qqVar, attributeSet);
                break;
            case 5:
                ccVar = new ec(qqVar, attributeSet);
                break;
            case 6:
                ccVar = new pc(qqVar, attributeSet);
                break;
            case 7:
                ccVar = hdVar.d(qqVar, attributeSet);
                break;
            case 8:
                ccVar = new AppCompatToggleButton(qqVar, attributeSet);
                break;
            case 9:
                ccVar = new yb(qqVar, attributeSet, 0);
                break;
            case 10:
                ccVar = hdVar.a(qqVar, attributeSet);
                break;
            case 11:
                ccVar = hdVar.c(qqVar, attributeSet);
                break;
            case 12:
                ccVar = new vb(qqVar, attributeSet);
                break;
            case 13:
                ccVar = hdVar.b(qqVar, attributeSet);
                break;
            default:
                ccVar = null;
                break;
        }
        if (ccVar != null || context == qqVar) {
            view2 = ccVar;
        } else {
            Object[] objArr = hdVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = qqVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = hd.g;
                        if (i2 < 3) {
                            View viewF = hdVar.f(qqVar, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = hdVar.f(qqVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, hd.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new gd(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = qqVar.obtainStyledAttributes(attributeSet, hd.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = oe1.a;
                    new ce1(com.anydesk.anydeskandroid.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(view2, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = qqVar.obtainStyledAttributes(attributeSet, hd.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    oe1.o(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = qqVar.obtainStyledAttributes(attributeSet, hd.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = oe1.a;
                    new ce1(com.anydesk.anydeskandroid.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    public final void q(int i, pb pbVar, rk0 rk0Var) {
        if (rk0Var == null) {
            if (pbVar == null && i >= 0) {
                pb[] pbVarArr = this.M;
                if (i < pbVarArr.length) {
                    pbVar = pbVarArr[i];
                }
            }
            if (pbVar != null) {
                rk0Var = pbVar.h;
            }
        }
        if ((pbVar == null || pbVar.m) && !this.R) {
            kb kbVar = this.o;
            Window.Callback callback = this.n.getCallback();
            kbVar.getClass();
            try {
                kbVar.g = true;
                callback.onPanelClosed(i, rk0Var);
            } finally {
                kbVar.g = false;
            }
        }
    }

    public final void r(rk0 rk0Var) {
        w5 w5Var;
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((va1) actionBarOverlayLayout.g).a.c;
        if (actionMenuView != null && (w5Var = actionMenuView.v) != null) {
            w5Var.d();
            r5 r5Var = w5Var.w;
            if (r5Var != null && r5Var.b()) {
                r5Var.i.dismiss();
            }
        }
        Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, rk0Var);
        }
        this.L = false;
    }

    public final void s(pb pbVar, boolean z) {
        ob obVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && pbVar.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.k();
            if (((va1) actionBarOverlayLayout.g).a.p()) {
                r(pbVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.m.getSystemService("window");
        if (windowManager != null && pbVar.m && (obVar = pbVar.e) != null) {
            windowManager.removeView(obVar);
            if (z) {
                q(pbVar.a, pbVar, null);
            }
        }
        pbVar.k = false;
        pbVar.l = false;
        pbVar.m = false;
        pbVar.f = null;
        pbVar.n = true;
        if (this.N == pbVar) {
            this.N = null;
        }
        if (pbVar.a == 0) {
            J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        pb pbVarA;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zV;
        boolean zH;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        w5 w5Var;
        pb pbVarA2;
        Object obj = this.l;
        if ((!(obj instanceof ce0) && !(obj instanceof w7)) || (decorView = this.n.getDecorView()) == null || !r71.o(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                kb kbVar = this.o;
                Window.Callback callback = this.n.getCallback();
                kbVar.getClass();
                try {
                    kbVar.f = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    kbVar.f = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.O = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    pbVarA2 = A(0);
                                    if (!pbVarA2.m) {
                                        H(pbVarA2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.v == null) {
                                    pbVarA = A(0);
                                    actionBarOverlayLayout = this.s;
                                    context = this.m;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((va1) actionBarOverlayLayout.g).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.c) == null || !actionMenuView.u || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = pbVarA.m;
                                            if (!z || pbVarA.l) {
                                                s(pbVarA, true);
                                                zV = z;
                                            } else {
                                                if (pbVarA.k) {
                                                    if (pbVarA.o) {
                                                        pbVarA.k = false;
                                                        zH = H(pbVarA, keyEvent);
                                                    } else {
                                                        zH = true;
                                                    }
                                                    if (zH) {
                                                        F(pbVarA, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                                            actionBarOverlayLayout2.k();
                                            if (((va1) actionBarOverlayLayout2.g).a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((va1) actionBarOverlayLayout3.g).a.c;
                                                if (actionMenuView2 != null && (w5Var = actionMenuView2.v) != null && w5Var.d()) {
                                                    zV = true;
                                                }
                                            } else if (!this.R && H(pbVarA, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                                                actionBarOverlayLayout4.k();
                                                zV = ((va1) actionBarOverlayLayout4.g).a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z = pbVarA.m;
                                        if (z) {
                                        }
                                        s(pbVarA, true);
                                        zV = z;
                                    }
                                    if (zV) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (E()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    kbVar.f = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.O = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            pbVarA2 = A(0);
                            if (!pbVarA2.m) {
                                H(pbVarA2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.v == null) {
                            pbVarA = A(0);
                            actionBarOverlayLayout = this.s;
                            context = this.m;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((va1) actionBarOverlayLayout.g).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = pbVarA.m;
                                    if (z) {
                                    }
                                    s(pbVarA, true);
                                    zV = z;
                                } else {
                                    z = pbVarA.m;
                                    if (z) {
                                    }
                                    s(pbVarA, true);
                                    zV = z;
                                }
                            } else {
                                z = pbVarA.m;
                                if (z) {
                                }
                                s(pbVarA, true);
                                zV = z;
                            }
                            if (zV) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (E()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void v(int i) {
        pb pbVarA = A(i);
        if (pbVarA.h != null) {
            Bundle bundle = new Bundle();
            pbVarA.h.t(bundle);
            if (bundle.size() > 0) {
                pbVarA.p = bundle;
            }
            pbVarA.h.w();
            pbVarA.h.clear();
        }
        pbVarA.o = true;
        pbVarA.n = true;
        if ((i == 108 || i == 0) && this.s != null) {
            pb pbVarA2 = A(0);
            pbVarA2.k = false;
            H(pbVarA2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        Context context = this.m;
        int[] iArr = yv0.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            nh0.j("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.n.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(com.anydesk.anydeskandroid.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.anydesk.anydeskandroid.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.anydesk.anydeskandroid.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.anydesk.anydeskandroid.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new qq(context, typedValue.resourceId) : context).inflate(com.anydesk.anydeskandroid.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.anydesk.anydeskandroid.R.id.decor_content_parent);
            this.s = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.n.getCallback());
            if (this.H) {
                this.s.j(109);
            }
            if (this.E) {
                this.s.j(2);
            }
            if (this.F) {
                this.s.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        db dbVar = new db(this, i);
        WeakHashMap weakHashMap = oe1.a;
        ge1.k(viewGroup, dbVar);
        if (this.s == null) {
            this.C = (TextView) viewGroup.findViewById(com.anydesk.anydeskandroid.R.id.title);
        }
        boolean z = kf1.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.anydesk.anydeskandroid.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.n.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.n.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new db(this, i2));
        this.B = viewGroup;
        Object obj = this.l;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.r;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                th1 th1Var = this.p;
                if (th1Var != null) {
                    th1Var.U(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.n.getDecorView();
        contentFrameLayout2.i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        pb pbVarA = A(0);
        if (this.R || pbVarA.h != null) {
            return;
        }
        C(108);
    }

    public final void x() {
        if (this.n == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.n != null) {
            return;
        }
        nh0.j("We have not been given a Window");
    }

    public final nb y(Context context) {
        if (this.X == null) {
            if (y6.j == null) {
                Context applicationContext = context.getApplicationContext();
                y6.j = new y6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new lb(this, y6.j);
        }
        return this.X;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
