package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class qa extends co implements sa {
    public qb B;
    public boolean y;
    public boolean z;
    public final ev w = new ev(10, new e40(this));
    public final if0 x = new if0(this);
    public boolean A = true;

    public qa() {
        ((ui0) this.f.d).s("android:support:lifecycle", new sn(this, 1));
        final int i = 0;
        this.l.add(new eq(this) { // from class: d40
            public final /* synthetic */ qa b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i2 = i;
                qa qaVar = this.b;
                switch (i2) {
                    case 0:
                        qaVar.w.n();
                        break;
                    default:
                        qaVar.w.n();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.n.add(new eq(this) { // from class: d40
            public final /* synthetic */ qa b;

            {
                this.b = this;
            }

            @Override // defpackage.eq
            public final void accept(Object obj) {
                int i3 = i2;
                qa qaVar = this.b;
                switch (i3) {
                    case 0:
                        qaVar.w.n();
                        break;
                    default:
                        qaVar.w.n();
                        break;
                }
            }
        });
        P(new tn(this, 1));
        ((ui0) this.f.d).s("androidx:appcompat", new oa(this));
        P(new pa(this));
    }

    public static boolean Z(t40 t40Var) {
        boolean Z = false;
        for (c40 c40Var : t40Var.c.h()) {
            if (c40Var != null) {
                e40 e40Var = c40Var.v;
                if ((e40Var == null ? null : e40Var.w) != null) {
                    Z |= Z(c40Var.Z());
                }
                m50 m50Var = c40Var.R;
                af0 af0Var = af0.f;
                af0 af0Var2 = af0.e;
                if (m50Var != null) {
                    m50Var.c();
                    if (m50Var.f.d.compareTo(af0Var) >= 0) {
                        c40Var.R.f.g(af0Var2);
                        Z = true;
                    }
                }
                if (c40Var.Q.d.compareTo(af0Var) >= 0) {
                    c40Var.Q.g(af0Var2);
                    Z = true;
                }
            }
        }
        return Z;
    }

    public final bb W() {
        if (this.B == null) {
            za zaVar = bb.c;
            this.B = new qb(this, null, this, this);
        }
        return this.B;
    }

    public final th1 X() {
        qb qbVar = (qb) W();
        qbVar.B();
        return qbVar.p;
    }

    public final t40 Y() {
        return ((e40) this.w.d).v;
    }

    public final void a0() {
        super.onDestroy();
        ((e40) this.w.d).v.k();
        this.x.d(ze0.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        qb qbVar = (qb) W();
        qbVar.w();
        ((ViewGroup) qbVar.B.findViewById(R.id.content)).addView(view, layoutParams);
        qbVar.o.a(qbVar.n.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:104:0x0182  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        qq qqVar;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        qb qbVar = (qb) W();
        qbVar.P = true;
        int i38 = qbVar.T;
        if (i38 == -100) {
            i38 = bb.d;
        }
        int iD = qbVar.D(context, i38);
        int i39 = 0;
        if (bb.c(context) && bb.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (bb.k) {
                    try {
                        kh0 kh0Var = bb.e;
                        if (kh0Var == null) {
                            if (bb.f == null) {
                                bb.f = kh0.b(bu0.x(context));
                            }
                            if (!bb.f.a.isEmpty()) {
                                bb.e = bb.f;
                            }
                        } else if (!kh0Var.equals(bb.f)) {
                            kh0 kh0Var2 = bb.e;
                            bb.f = kh0Var2;
                            bu0.w(context, kh0Var2.a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!bb.h) {
                bb.c.execute(new wa(context, i39));
            }
        }
        kh0 kh0VarP = qb.p(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(qb.t(context, iD, kh0VarP, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof qq) {
                    try {
                        ((qq) context).a(qb.t(context, iD, kh0VarP, null, false));
                    } catch (IllegalStateException unused2) {
                        if (qb.k0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 24) {
                                        gb.a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i6 = configuration.touchscreen;
                                    i7 = configuration2.touchscreen;
                                    if (i6 != i7) {
                                        configuration3.touchscreen = i7;
                                    }
                                    i8 = configuration.keyboard;
                                    i9 = configuration2.keyboard;
                                    if (i8 != i9) {
                                        configuration3.keyboard = i9;
                                    }
                                    i10 = configuration.keyboardHidden;
                                    i11 = configuration2.keyboardHidden;
                                    if (i10 != i11) {
                                        configuration3.keyboardHidden = i11;
                                    }
                                    i12 = configuration.navigation;
                                    i13 = configuration2.navigation;
                                    if (i12 != i13) {
                                        configuration3.navigation = i13;
                                    }
                                    i14 = configuration.navigationHidden;
                                    i15 = configuration2.navigationHidden;
                                    if (i14 != i15) {
                                        configuration3.navigationHidden = i15;
                                    }
                                    i16 = configuration.orientation;
                                    i17 = configuration2.orientation;
                                    if (i16 != i17) {
                                        configuration3.orientation = i17;
                                    }
                                    i18 = configuration.screenLayout & 15;
                                    i19 = configuration2.screenLayout & 15;
                                    if (i18 != i19) {
                                        configuration3.screenLayout |= i19;
                                    }
                                    i20 = configuration.screenLayout & 192;
                                    i21 = configuration2.screenLayout & 192;
                                    if (i20 != i21) {
                                        configuration3.screenLayout |= i21;
                                    }
                                    i22 = configuration.screenLayout & 48;
                                    i23 = configuration2.screenLayout & 48;
                                    if (i22 != i23) {
                                        configuration3.screenLayout |= i23;
                                    }
                                    i24 = configuration.screenLayout & 768;
                                    i25 = configuration2.screenLayout & 768;
                                    if (i24 != i25) {
                                        configuration3.screenLayout |= i25;
                                    }
                                    if (i5 >= 26) {
                                        hb.c(configuration, configuration2, configuration3);
                                    }
                                    i26 = configuration.uiMode & 15;
                                    i27 = configuration2.uiMode & 15;
                                    if (i26 != i27) {
                                        configuration3.uiMode |= i27;
                                    }
                                    i28 = configuration.uiMode & 48;
                                    i29 = configuration2.uiMode & 48;
                                    if (i28 != i29) {
                                        configuration3.uiMode |= i29;
                                    }
                                    i30 = configuration.screenWidthDp;
                                    i31 = configuration2.screenWidthDp;
                                    if (i30 != i31) {
                                        configuration3.screenWidthDp = i31;
                                    }
                                    i32 = configuration.screenHeightDp;
                                    i33 = configuration2.screenHeightDp;
                                    if (i32 != i33) {
                                        configuration3.screenHeightDp = i33;
                                    }
                                    i34 = configuration.smallestScreenWidthDp;
                                    i35 = configuration2.smallestScreenWidthDp;
                                    if (i34 != i35) {
                                        configuration3.smallestScreenWidthDp = i35;
                                    }
                                    i36 = configuration.densityDpi;
                                    i37 = configuration2.densityDpi;
                                    if (i36 != i37) {
                                        configuration3.densityDpi = i37;
                                    }
                                }
                            }
                            Configuration configurationT = qb.t(context, iD, kh0VarP, configuration3, true);
                            qqVar = new qq(context, com.anydesk.anydeskandroid.R.style.Theme_AppCompat_Empty);
                            qqVar.a(configurationT);
                            try {
                                if (context.getTheme() != null) {
                                    hq.L(qqVar.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = qqVar;
                        }
                    }
                } else if (qb.k0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 24) {
                                gb.a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i5 >= 26) {
                                hb.c(configuration, configuration2, configuration3);
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            i36 = configuration.densityDpi;
                            i37 = configuration2.densityDpi;
                            if (i36 != i37) {
                                configuration3.densityDpi = i37;
                            }
                        }
                    }
                    Configuration configurationT2 = qb.t(context, iD, kh0VarP, configuration3, true);
                    qqVar = new qq(context, com.anydesk.anydeskandroid.R.style.Theme_AppCompat_Empty);
                    qqVar.a(configurationT2);
                    if (context.getTheme() != null) {
                        hq.L(qqVar.getTheme());
                    }
                    context = qqVar;
                }
            }
        } else if (context instanceof qq) {
            ((qq) context).a(qb.t(context, iD, kh0VarP, null, false));
        } else if (qb.k0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 24) {
                        gb.a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i6 = configuration.touchscreen;
                    i7 = configuration2.touchscreen;
                    if (i6 != i7) {
                        configuration3.touchscreen = i7;
                    }
                    i8 = configuration.keyboard;
                    i9 = configuration2.keyboard;
                    if (i8 != i9) {
                        configuration3.keyboard = i9;
                    }
                    i10 = configuration.keyboardHidden;
                    i11 = configuration2.keyboardHidden;
                    if (i10 != i11) {
                        configuration3.keyboardHidden = i11;
                    }
                    i12 = configuration.navigation;
                    i13 = configuration2.navigation;
                    if (i12 != i13) {
                        configuration3.navigation = i13;
                    }
                    i14 = configuration.navigationHidden;
                    i15 = configuration2.navigationHidden;
                    if (i14 != i15) {
                        configuration3.navigationHidden = i15;
                    }
                    i16 = configuration.orientation;
                    i17 = configuration2.orientation;
                    if (i16 != i17) {
                        configuration3.orientation = i17;
                    }
                    i18 = configuration.screenLayout & 15;
                    i19 = configuration2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration3.screenLayout |= i19;
                    }
                    i20 = configuration.screenLayout & 192;
                    i21 = configuration2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 48;
                    i23 = configuration2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 768;
                    i25 = configuration2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    if (i5 >= 26) {
                        hb.c(configuration, configuration2, configuration3);
                    }
                    i26 = configuration.uiMode & 15;
                    i27 = configuration2.uiMode & 15;
                    if (i26 != i27) {
                        configuration3.uiMode |= i27;
                    }
                    i28 = configuration.uiMode & 48;
                    i29 = configuration2.uiMode & 48;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.screenWidthDp;
                    i31 = configuration2.screenWidthDp;
                    if (i30 != i31) {
                        configuration3.screenWidthDp = i31;
                    }
                    i32 = configuration.screenHeightDp;
                    i33 = configuration2.screenHeightDp;
                    if (i32 != i33) {
                        configuration3.screenHeightDp = i33;
                    }
                    i34 = configuration.smallestScreenWidthDp;
                    i35 = configuration2.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration3.smallestScreenWidthDp = i35;
                    }
                    i36 = configuration.densityDpi;
                    i37 = configuration2.densityDpi;
                    if (i36 != i37) {
                        configuration3.densityDpi = i37;
                    }
                }
            }
            Configuration configurationT3 = qb.t(context, iD, kh0VarP, configuration3, true);
            qqVar = new qq(context, com.anydesk.anydeskandroid.R.style.Theme_AppCompat_Empty);
            qqVar.a(configurationT3);
            if (context.getTheme() != null) {
                hq.L(qqVar.getTheme());
            }
            context = qqVar;
        }
        super.attachBaseContext(context);
    }

    public final boolean b0(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((e40) this.w.d).v.i();
        }
        return false;
    }

    public final void c0() {
        super.onPostResume();
        d0();
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        th1 th1VarX = X();
        if (getWindow().hasFeature(0)) {
            if (th1VarX == null || !th1VarX.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    public void d0() {
        this.x.d(ze0.ON_RESUME);
        t40 t40Var = ((e40) this.w.d).v;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(7);
    }

    @Override // defpackage.bo, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        th1 th1VarX = X();
        if (keyCode == 82 && th1VarX != null && th1VarX.I(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.y);
        printWriter.print(" mResumed=");
        printWriter.print(this.z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        if (getApplication() != null) {
            bf1 bf1VarK = K();
            bf1VarK.getClass();
            pr prVar = pr.b;
            prVar.getClass();
            ah ahVar = new ah(bf1VarK, yg0.c, prVar);
            fm fmVarA = nx0.a(yg0.class);
            String strU = y90.u(fmVarA);
            if (strU == null) {
                id.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            x51 x51Var = ((yg0) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU))).b;
            if (x51Var.f() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (x51Var.f() > 0) {
                    if (x51Var.g(0) != null) {
                        id.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(x51Var.d(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((e40) this.w.d).v.u(str, fileDescriptor, printWriter, strArr);
    }

    public final void e0() {
        ev evVar = this.w;
        evVar.n();
        e40 e40Var = (e40) evVar.d;
        super.onStart();
        this.A = false;
        if (!this.y) {
            this.y = true;
            t40 t40Var = e40Var.v;
            t40Var.F = false;
            t40Var.G = false;
            t40Var.M.g = false;
            t40Var.t(4);
        }
        e40Var.v.x(true);
        this.x.d(ze0.ON_START);
        t40 t40Var2 = e40Var.v;
        t40Var2.F = false;
        t40Var2.G = false;
        t40Var2.M.g = false;
        t40Var2.t(5);
    }

    public final void f0() {
        super.onStop();
        this.A = true;
        while (Z(Y())) {
        }
        t40 t40Var = ((e40) this.w.d).v;
        t40Var.G = true;
        t40Var.M.g = true;
        t40Var.t(4);
        this.x.d(ze0.ON_STOP);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        qb qbVar = (qb) W();
        qbVar.w();
        return qbVar.n.findViewById(i);
    }

    public boolean g0() {
        Intent intentY = y90.y(this);
        if (intentY == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentY)) {
            navigateUpTo(intentY);
            return true;
        }
        x81 x81Var = new x81(this);
        Intent intentY2 = y90.y(this);
        if (intentY2 == null) {
            intentY2 = y90.y(this);
        }
        if (intentY2 != null) {
            ComponentName component = intentY2.getComponent();
            if (component == null) {
                component = intentY2.resolveActivity(x81Var.d.getPackageManager());
            }
            x81Var.a(component);
            x81Var.c.add(intentY2);
        }
        x81Var.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        qb qbVar = (qb) W();
        if (qbVar.q == null) {
            qbVar.B();
            th1 th1Var = qbVar.p;
            qbVar.q = new c81(th1Var != null ? th1Var.u() : qbVar.m);
        }
        return qbVar.q;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = rd1.a;
        return super.getResources();
    }

    public final void h0(Toolbar toolbar) {
        qb qbVar = (qb) W();
        if (qbVar.l instanceof Activity) {
            qbVar.B();
            th1 th1Var = qbVar.p;
            if (th1Var instanceof ng1) {
                nh0.j("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            qbVar.q = null;
            if (th1Var != null) {
                th1Var.G();
            }
            qbVar.p = null;
            if (toolbar != null) {
                Object obj = qbVar.l;
                ra1 ra1Var = new ra1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : qbVar.r, qbVar.o);
                qbVar.p = ra1Var;
                qbVar.o.d = ra1Var.l;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                qbVar.o.d = null;
            }
            qbVar.b();
        }
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        W().b();
    }

    @Override // defpackage.co, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.w.n();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.co, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        qb qbVar = (qb) W();
        if (qbVar.G && qbVar.A) {
            qbVar.B();
            th1 th1Var = qbVar.p;
            if (th1Var != null) {
                th1Var.F();
            }
        }
        tb tbVarA = tb.a();
        Context context = qbVar.m;
        synchronized (tbVarA) {
            tbVarA.a.l(context);
        }
        qbVar.S = new Configuration(qbVar.m.getResources().getConfiguration());
        qbVar.m(false, false);
    }

    @Override // defpackage.co, defpackage.bo, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.d(ze0.ON_CREATE);
        t40 t40Var = ((e40) this.w.d).v;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((e40) this.w.d).v.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        a0();
        W().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.co, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (b0(i, menuItem)) {
            return true;
        }
        th1 th1VarX = X();
        if (menuItem.getItemId() != 16908332 || th1VarX == null || (th1VarX.r() & 4) == 0) {
            return false;
        }
        return g0();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.z = false;
        ((e40) this.w.d).v.t(5);
        this.x.d(ze0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((qb) W()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        c0();
        qb qbVar = (qb) W();
        qbVar.B();
        th1 th1Var = qbVar.p;
        if (th1Var != null) {
            th1Var.T(true);
        }
    }

    @Override // defpackage.co, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.w.n();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        ev evVar = this.w;
        evVar.n();
        super.onResume();
        this.z = true;
        ((e40) evVar.d).v.x(true);
    }

    @Override // android.app.Activity
    public void onStart() throws IllegalAccessException {
        e0();
        ((qb) W()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.w.n();
    }

    @Override // android.app.Activity
    public void onStop() {
        f0();
        qb qbVar = (qb) W();
        qbVar.B();
        th1 th1Var = qbVar.p;
        if (th1Var != null) {
            th1Var.T(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        W().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        th1 th1VarX = X();
        if (getWindow().hasFeature(0)) {
            if (th1VarX == null || !th1VarX.J()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        U();
        W().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((qb) W()).U = i;
    }

    @Override // defpackage.co, android.app.Activity
    public void setContentView(View view) {
        U();
        W().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        W().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((e40) this.w.d).v.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
