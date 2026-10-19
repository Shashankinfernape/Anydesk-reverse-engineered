package com.anydesk.jni;

import android.app.NotificationManager;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.projection.MediaProjection;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.net.Uri;
import android.net.VpnService;
import android.os.Build;
import android.os.Environment;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.webkit.MimeTypeMap;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.anydeskandroid.AdVpnService;
import com.anydesk.anydeskandroid.AnynetAccountInfo;
import com.anydesk.anydeskandroid.FileInfo;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.anydeskandroid.gui.activity.HubActivity;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsCategoryFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.anydesk.jnilib.nativeconst.AdNetInterface;
import com.anydesk.jnilib.nativeconst.NetIdInfo;
import defpackage.a91;
import defpackage.ac0;
import defpackage.ap;
import defpackage.b00;
import defpackage.b21;
import defpackage.b7;
import defpackage.bc;
import defpackage.bc0;
import defpackage.bd0;
import defpackage.br0;
import defpackage.c;
import defpackage.c0;
import defpackage.c5;
import defpackage.c6;
import defpackage.cc0;
import defpackage.cd0;
import defpackage.cj0;
import defpackage.cp;
import defpackage.cu0;
import defpackage.d3;
import defpackage.db0;
import defpackage.dc0;
import defpackage.dd0;
import defpackage.de0;
import defpackage.dj;
import defpackage.du0;
import defpackage.e7;
import defpackage.eb0;
import defpackage.ec0;
import defpackage.ej;
import defpackage.em0;
import defpackage.er0;
import defpackage.ev;
import defpackage.fb0;
import defpackage.fd0;
import defpackage.fj;
import defpackage.fl;
import defpackage.g9;
import defpackage.gb0;
import defpackage.gc0;
import defpackage.gq0;
import defpackage.gr0;
import defpackage.h5;
import defpackage.ha0;
import defpackage.hb0;
import defpackage.hd0;
import defpackage.hm0;
import defpackage.hq;
import defpackage.i00;
import defpackage.i7;
import defpackage.i81;
import defpackage.ia0;
import defpackage.ib0;
import defpackage.id0;
import defpackage.ii0;
import defpackage.ij;
import defpackage.io;
import defpackage.ir0;
import defpackage.iz;
import defpackage.j81;
import defpackage.jb0;
import defpackage.jc0;
import defpackage.jm0;
import defpackage.jr0;
import defpackage.ka0;
import defpackage.kb0;
import defpackage.kd0;
import defpackage.km0;
import defpackage.kp;
import defpackage.lb0;
import defpackage.lc0;
import defpackage.lp;
import defpackage.mb;
import defpackage.mb0;
import defpackage.md0;
import defpackage.mj;
import defpackage.mz;
import defpackage.n9;
import defpackage.na0;
import defpackage.nb0;
import defpackage.nd0;
import defpackage.nm0;
import defpackage.oa0;
import defpackage.ob0;
import defpackage.oc0;
import defpackage.pb0;
import defpackage.q51;
import defpackage.qb0;
import defpackage.qe;
import defpackage.qi;
import defpackage.r3;
import defpackage.rb0;
import defpackage.s30;
import defpackage.s7;
import defpackage.sb0;
import defpackage.sc0;
import defpackage.sx0;
import defpackage.t01;
import defpackage.t70;
import defpackage.tb0;
import defpackage.td;
import defpackage.ua0;
import defpackage.ub0;
import defpackage.ui0;
import defpackage.va0;
import defpackage.vb0;
import defpackage.vm0;
import defpackage.wb0;
import defpackage.wc0;
import defpackage.wo;
import defpackage.x00;
import defpackage.xb0;
import defpackage.xc0;
import defpackage.xd;
import defpackage.xi0;
import defpackage.xj;
import defpackage.y6;
import defpackage.yb0;
import defpackage.za0;
import defpackage.za1;
import defpackage.zb0;
import defpackage.zd;
import defpackage.zg0;
import defpackage.zl;
import defpackage.zl0;
import j$.util.Collection$EL;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class JniAdExt {
    public static jc0 I0;
    public static final jr0 L0;
    public static final eb0 M0;
    public static Bitmap a;
    public static y6 k;
    public static final Logging b = new Logging("JniAdExt");
    public static boolean c = false;
    public static Context d = null;
    public static long e = 0;
    public static long f = 0;
    public static long g = 0;
    public static boolean h = false;
    public static boolean i = false;
    public static long j = 0;
    public static int l = 0;
    public static String m = "";
    public static MainApplication n = null;
    public static MainApplication o = null;
    public static final zd p = new zd(0);
    public static final zd q = new zd(0);
    public static final zd r = new zd(0);
    public static MainApplication s = null;
    public static MainApplication t = null;
    public static ConnectionFragment u = null;
    public static ConnectionFragment v = null;
    public static final zd w = new zd(0);
    public static ConnectionFragment x = null;
    public static MainFragment y = null;
    public static SettingsCategoryFragment z = null;
    public static final zd A = new zd(0);
    public static final zd B = new zd(0);
    public static final zd C = new zd(0);
    public static final zd D = new zd(0);
    public static MainApplication E = null;
    public static mj F = null;
    public static mj G = null;
    public static ev H = null;
    public static ConnectionFragment I = null;
    public static MainFragment J = null;
    public static final zd K = new zd(0);
    public static b21 L = null;
    public static ConnectionFragment M = null;
    public static dj N = null;
    public static MainApplication O = null;
    public static MainFragment P = null;
    public static MainFragment Q = null;
    public static MainActivity R = null;
    public static MainActivity S = null;
    public static ConnectionFragment T = null;
    public static ConnectionFragment U = null;
    public static final xd V = new xd(0);
    public static final zd W = new zd(0);
    public static final zd X = new zd(0);
    public static AccountLoggedInFragment Y = null;
    public static c5 Z = null;
    public static AccountRegistrationFragment a0 = null;
    public static final zd b0 = new zd(0);
    public static final zd c0 = new zd(0);
    public static final zd d0 = new zd(0);
    public static final zd e0 = new zd(0);
    public static final zd f0 = new zd(0);
    public static FileManagerProgressListFragment g0 = null;
    public static i00 h0 = null;
    public static final zd i0 = new zd(0);
    public static MainApplication j0 = null;
    public static iz k0 = null;
    public static FileManagerFragment l0 = null;
    public static final ui0 m0 = new ui0(4);
    public static final bc n0 = new bc(27);
    public static final bc o0 = new bc(18);
    public static final Hashtable p0 = new Hashtable();
    public static final Hashtable q0 = new Hashtable();
    public static final Object r0 = new Object();
    public static AdCountryCode[] s0 = null;
    public static final Object t0 = new Object();
    public static final LruCache u0 = new LruCache(500);
    public static final Set v0 = Collections.newSetFromMap(new ac0(250, 0.75f, false, 0));
    public static final Set w0 = Collections.newSetFromMap(new ac0(250, 0.75f, false, 1));
    public static final Object x0 = new Object();
    public static final LinkedHashMap y0 = new LinkedHashMap();
    public static final Object z0 = new Object();
    public static final TreeMap A0 = new TreeMap();
    public static final vm0 B0 = new vm0(new ir0());
    public static final Hashtable C0 = new Hashtable();
    public static boolean D0 = true;
    public static final Object E0 = new Object();
    public static RosterItem F0 = null;
    public static final zg0 G0 = new zg0(0);
    public static final HandlerThread H0 = new HandlerThread("nativeCaller");
    public static final Object J0 = new Object();
    public static boolean K0 = false;

    static {
        jr0 jr0Var = new jr0();
        jr0Var.a();
        L0 = jr0Var;
        M0 = new eb0();
    }

    public static void A1(id0 id0Var) {
        zd zdVar = p;
        synchronized (zdVar) {
            zdVar.add(id0Var);
        }
    }

    public static ArrayList A2() {
        ArrayList arrayList;
        synchronized (x0) {
            try {
                arrayList = new ArrayList();
                for (zl0 zl0Var : y0.values()) {
                    if (zl0Var.a()) {
                        arrayList.add(zl0Var);
                    }
                }
                Collections.reverse(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public static boolean A3() {
        return jniIsSasSupported();
    }

    public static void A4(ArrayList arrayList) {
        jniSetConfigMapKeys(nd0.T("ad.security.acl_list"), nd0.T(nd0.f(arrayList)), nd0.T("true"), q51.r(7));
    }

    public static void B1(md0 md0Var) {
        zd zdVar = e0;
        synchronized (zdVar) {
            zdVar.add(md0Var);
        }
    }

    public static String B2() {
        return nd0.t(jniGetOwnAddr());
    }

    public static boolean B3() {
        return jniIsSessionRecordingActive();
    }

    public static void B4(io ioVar, String str) {
        jniSetConfigString(nd0.T(ioVar.c), nd0.T(str), q51.r(ioVar.d));
    }

    public static void C1(ii0 ii0Var) {
        zd zdVar = w;
        synchronized (zdVar) {
            zdVar.add(ii0Var);
        }
    }

    public static String C2() {
        return nd0.t(jniGetOwnAlias());
    }

    public static boolean C3() {
        String strD2 = d2();
        return strD2.equals("zh-cn") || strD2.equals("zh") || strD2.equals("zh-sg");
    }

    public static void C4(t01 t01Var) {
        byte[] bArrC = nd0.c(t01Var.c);
        t01Var.b();
        jniSetConfigStringCrypted(nd0.T("ad.anynet.proxy.pass"), bArrC, q51.r(7));
        t70.a0(bArrC);
    }

    public static AnynetAccountInfo D1() {
        return jniAnynetAccountGetAccountInfo();
    }

    public static long D2() {
        if (j == 0) {
            j = jniGetOwnCid();
        }
        return j;
    }

    public static boolean D3() {
        return jniIsTcpTunnelingSupported();
    }

    public static void D4(int i2, du0 du0Var, boolean z2) {
        I0.post(new db0(i2, du0Var, z2));
    }

    public static String E1() {
        return nd0.t(jniAnynetAccountGetEmailPendingVerification());
    }

    public static String E2(String str) {
        byte[] bArrJniGetPermissionProfilePermissions = jniGetPermissionProfilePermissions(nd0.T(str));
        if (bArrJniGetPermissionProfilePermissions == null) {
            return null;
        }
        return nd0.t(bArrJniGetPermissionProfilePermissions);
    }

    public static String E3(String str) {
        return nd0.t(jniIsValidPermissionProfileName(nd0.T(str)));
    }

    public static void E4(long j2, boolean z2) {
        jniSetFavoriteSpeedDialItem(j2, z2);
    }

    public static t01 F1() {
        char[] cArr;
        byte[] bArrJniAnynetAccountGetRememberedUser = jniAnynetAccountGetRememberedUser();
        if (bArrJniAnynetAccountGetRememberedUser == null || bArrJniAnynetAccountGetRememberedUser.length == 0) {
            cArr = nd0.b;
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrJniAnynetAccountGetRememberedUser);
            CharBuffer charBufferDecode = StandardCharsets.UTF_8.decode(byteBufferWrap);
            Arrays.fill(byteBufferWrap.array(), (byte) 0);
            int iLimit = (charBufferDecode.limit() - charBufferDecode.position()) - 1;
            cArr = new char[iLimit];
            System.arraycopy(charBufferDecode.array(), charBufferDecode.position(), cArr, 0, iLimit);
            Arrays.fill(charBufferDecode.array(), (char) 0);
        }
        t70.a0(bArrJniAnynetAccountGetRememberedUser);
        return t01.d(cArr);
    }

    public static PermissionProfile[] F2() {
        return jniGetPermissionProfiles();
    }

    public static boolean F3() {
        return jniIsVpnSupported();
    }

    public static void F4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        jniSetGroupPolicies(nd0.T(nd0.f(arrayList)), nd0.T(nd0.f(arrayList2)), nd0.T(nd0.f(arrayList3)), nd0.T(nd0.f(arrayList4)));
    }

    public static String G1(byte[] bArr) {
        return nd0.t(jniBase322faKey(bArr));
    }

    public static boolean G2() {
        return jniGetPrivacyMode();
    }

    public static boolean G3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, String str9, String str10, int i4) {
        d = context;
        nd0.c = new y6(context, 22);
        try {
            System.loadLibrary("adext");
            HandlerThread handlerThread = H0;
            handlerThread.start();
            I0 = new jc0(handlerThread.getLooper());
            c = jniInit(nd0.T(str), nd0.T(str2), nd0.T(str3), nd0.T(str4), nd0.T(str5), nd0.T(str6), nd0.T(str7), nd0.T(str8), i2, i3, nd0.T(str9), nd0.T(str10), i4, 5, false);
            int i5 = 1;
            Logging.b = true;
            StringBuilder sb = new StringBuilder("* Android: Release=");
            sb.append(Build.VERSION.RELEASE);
            sb.append(" SDK=");
            int i6 = Build.VERSION.SDK_INT;
            sb.append(i6);
            String string = sb.toString();
            Logging logging = b;
            logging.e(string);
            logging.e("");
            logging.e("* Board: " + Build.BOARD);
            logging.e("* Brand: " + Build.BRAND);
            logging.e("* Device: " + Build.DEVICE);
            logging.e("* Display: " + Build.DISPLAY);
            logging.e("* Hardware: " + Build.HARDWARE);
            logging.e("* Manufacturer: " + Build.MANUFACTURER);
            logging.e("* Model: " + Build.MODEL);
            logging.e("* Product: " + Build.PRODUCT);
            logging.e("* 32bit ABIs: ".concat(t70.B()));
            logging.e("* 64bit ABIs: ".concat(t70.C()));
            logging.e("");
            Point pointA = er0.a();
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            logging.e("* GLES version: ".concat(t70.q(context)));
            logging.e("* Width: " + pointA.x);
            logging.e("* Height: " + pointA.y);
            logging.e("* DPI: " + er0.b());
            logging.e("* xDPI: " + er0.c());
            logging.e("* yDPI: " + er0.d());
            logging.e("* Android DPI: " + displayMetrics.densityDpi);
            logging.e("* Android xDPI: " + displayMetrics.xdpi);
            logging.e("* Android yDPI: " + displayMetrics.ydpi);
            logging.e("");
            if (!c) {
                logging.a("failed to initialize AdExt!");
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            y6 y6Var = new y6(d, 24);
            k = y6Var;
            y6Var.r(arrayList, arrayList2, arrayList3, arrayList4);
            logging.e("initialized AdExt.");
            Logging.f(7, "JniAdExt", "starting service...");
            jniStartService(nd0.T(nd0.f(arrayList)), nd0.T(nd0.f(arrayList2)), nd0.T(nd0.f(arrayList3)), nd0.T(nd0.f(arrayList4)));
            Logging.f(7, "JniAdExt", "started service.");
            logging.e("* ID: " + t70.g(D2()));
            logging.e("* Alias: ".concat(C2()));
            y6 y6Var2 = k;
            if (y6Var2 != null) {
                if (((mb) y6Var2.f) == null) {
                    mb mbVar = new mb(i5, y6Var2);
                    y6Var2.f = mbVar;
                    ((Context) y6Var2.e).registerReceiver(mbVar, new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"));
                }
                ((Logging) y6Var2.d).e("applying initial restrictions");
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                y6Var2.r(arrayList5, arrayList6, arrayList7, arrayList8);
                F4(arrayList5, arrayList6, arrayList7, arrayList8);
            }
            ((ClipboardManager) context.getSystemService("clipboard")).addPrimaryClipChangedListener(M0);
            if (i6 < 28) {
                d.registerReceiver(new lc0(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) d.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(new oc0());
                return true;
            }
            logging.h("cannot get connectivity service");
            return true;
        } catch (Throwable unused) {
        }
    }

    public static void G4(boolean z2) {
        jniSetInjectPermission(z2);
    }

    public static void H1() {
        jniBenchmark();
    }

    public static boolean H2() {
        return jniGetPrivacyStatus();
    }

    public static void H3(String str, long j2) {
        jniLoadTcpTunnelConfig(j2, nd0.T(str));
    }

    public static void H4(MainFragment mainFragment) {
        synchronized (t0) {
            try {
                MainFragment mainFragment2 = J;
                boolean z2 = (mainFragment2 != null && mainFragment == null) || (mainFragment2 == null && mainFragment != null);
                J = mainFragment;
                if (z2) {
                    i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U1();
    }

    public static boolean I1() {
        return jniCanAddCustomProfile();
    }

    public static long I2() {
        return jniGetRemoteCaps();
    }

    public static byte[] I3() {
        return jniMake2faKey();
    }

    public static int I4(String str, String str2) {
        int iJniSetPermissionProfilePermissions = jniSetPermissionProfilePermissions(nd0.T(str), nd0.T(str2));
        for (int i2 : q51.s(5)) {
            if (q51.r(i2) == iJniSetPermissionProfilePermissions) {
                return i2;
            }
        }
        return 2;
    }

    public static boolean J1() {
        return jniCanClipbrdFiles();
    }

    public static int J2() {
        return jniGetRemoteOsType();
    }

    public static String[] J3(long j2, byte[] bArr) {
        return nd0.e(nd0.t(jniMake2faShiftedOtps(bArr, j2)));
    }

    public static void J4(int i2, boolean z2) {
        jniSetSessionConfigBool(gr0.c(i2), z2);
    }

    public static boolean K1() {
        return jniCanClipbrdText();
    }

    public static String K2() {
        byte[] bArrJniGetResourceDevList = jniGetResourceDevList();
        return bArrJniGetResourceDevList != null ? nd0.t(bArrJniGetResourceDevList) : "";
    }

    public static int K3(t01 t01Var) {
        int iJniGetPwdStrength;
        int length = t01Var.c.length;
        t01 t01VarA = t01.a(t01Var);
        if (t01VarA.isEmpty()) {
            iJniGetPwdStrength = 0;
        } else {
            byte[] bArrC = nd0.c(t01VarA.c);
            t01VarA.b();
            iJniGetPwdStrength = jniGetPwdStrength(bArrC);
            t70.a0(bArrC);
        }
        t01Var.b();
        if (length < 10 || iJniGetPwdStrength <= 30) {
            return (length < 8 || iJniGetPwdStrength < 20) ? 0 : 1;
        }
        return 2;
    }

    public static void K4(int i2, int i3) {
        jniSetSessionConfigInt(gr0.c(i2), i3);
    }

    public static boolean L1() {
        if (g2(io.KEY_LOGIN_ENABLED) && g2(io.KEY_FEATURE_ACCEPT)) {
            return h2(io.KEY_INTERACTIVE_ACCESS) != 2 || jniHasPwd();
        }
        return false;
    }

    public static String L2() {
        byte[] bArrJniGetResourceFoss = jniGetResourceFoss();
        return bArrJniGetResourceFoss != null ? nd0.t(bArrJniGetResourceFoss) : "";
    }

    public static int L3(String str) {
        int iJniNewPermissionProfile = jniNewPermissionProfile(nd0.T(str));
        for (int i2 : q51.s(4)) {
            if (q51.r(i2) == iJniNewPermissionProfile) {
                return i2;
            }
        }
        return 2;
    }

    public static void L4(int i2, String str) {
        jniSetSessionConfigString(gr0.c(i2), nd0.T(str));
    }

    public static boolean M1(int i2) {
        return jniCanModifyForbiddenWindows(i2);
    }

    public static String M2(int i2, int i3) {
        byte[] bArrJniGetResultString = jniGetResultString(i2, i3);
        return bArrJniGetResultString != null ? nd0.t(bArrJniGetResultString) : "";
    }

    public static void M3(Surface surface) {
        Point pointA = er0.a();
        jniOnSurfaceChanged(surface, pointA.y > pointA.x);
    }

    public static void M4() {
        I0.post(new i7(16));
    }

    public static boolean N1() {
        return jniCanRemoveLicense();
    }

    public static String[] N2() {
        return nd0.e(nd0.t(jniGetRosterTags()));
    }

    public static y6 N3(int i2, boolean z2) {
        return new y6(jniOnTcpTunnelDeleted(z2, i2));
    }

    public static void N4() {
        synchronized (t0) {
            try {
                I0.removeMessages(q51.d(8));
                I0.removeMessages(q51.d(9));
                long j2 = 4000;
                long jUptimeMillis = (g + 4000) - SystemClock.uptimeMillis();
                if (jUptimeMillis <= 4000) {
                    j2 = jUptimeMillis;
                }
                if (j2 > 0) {
                    I0.sendEmptyMessageDelayed(q51.d(8), j2);
                } else {
                    f4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean O1(int i2) {
        return jniCanSessionConfig(gr0.c(i2));
    }

    public static Roster[] O2() {
        return jniGetRosters();
    }

    public static y6 O3(boolean z2, int i2, String str, String str2, String str3) {
        return new y6(jniOnTcpTunnelEdited(z2, i2, nd0.T(str), nd0.T(str2), nd0.T(str3)));
    }

    public static void O4() {
        synchronized (t0) {
            I0.removeMessages(q51.d(8));
            I0.removeMessages(q51.d(9));
            I0.sendEmptyMessageDelayed(q51.d(9), 4000L);
        }
    }

    public static boolean P1() {
        return jniCanToggleSessionRecording();
    }

    public static long P2() {
        return jniGetSelectedRosterId();
    }

    public static void P3(int i2, boolean z2) {
        I0.post(new nb0(i2, z2));
    }

    public static void P4() {
        jniSetFrontendRunning(m3());
        S1();
        U1();
    }

    public static void Q1(int i2, ByteBuffer byteBuffer) {
        jniCaptureAudioPlaybackFrame(i2, byteBuffer);
    }

    public static RosterItem Q2() {
        RosterItem rosterItem;
        synchronized (E0) {
            rosterItem = F0;
        }
        return rosterItem;
    }

    public static void Q3() {
        I0.removeMessages(q51.d(4));
        I0.sendEmptyMessageDelayed(q51.d(4), 2000L);
    }

    public static void Q4(boolean z2) {
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV != null) {
            cj0 cj0Var = mainApplicationV.u;
            if (cj0Var != null) {
                cj0Var.n(A2().size());
                if (z2) {
                    cj0Var.m(true);
                }
            }
            MainFragment mainFragment = P;
            if (mainFragment != null) {
                t70.Y(new xi0(7, mainFragment));
            }
        }
    }

    public static boolean R1(int i2, ByteBuffer byteBuffer, int i3, int i4, int i5) {
        return jniCaptureFrame(i2, byteBuffer, 0, i3, i4, i5, q51.r(3), false);
    }

    public static int R2() {
        int iJniGetSelectedRosterType = jniGetSelectedRosterType();
        for (int i2 : q51.s(3)) {
            if (q51.r(i2) == iJniGetSelectedRosterType) {
                return i2;
            }
        }
        return 1;
    }

    public static void R3(bd0 bd0Var) {
        boolean zContains;
        synchronized (t0) {
            try {
                zd zdVar = K;
                synchronized (zdVar) {
                    zContains = zdVar.contains(bd0Var);
                    zdVar.remove(bd0Var);
                }
                if (zContains) {
                    i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U1();
    }

    public static void S1() {
        if (SystemClock.uptimeMillis() > f) {
            jniEnableAutoDiscovery(m3());
        }
    }

    public static boolean S2(int i2) {
        return jniGetSessionConfigBool(gr0.c(i2));
    }

    public static void S3(wc0 wc0Var) {
        zd zdVar = W;
        synchronized (zdVar) {
            try {
                zdVar.remove(wc0Var);
                if (zdVar.isEmpty()) {
                    I0.sendEmptyMessageDelayed(q51.d(11), 4000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void T1() {
        x4(io.KEY_LOGIN_ENABLED, jniHasPwd() || (h2(io.KEY_INTERACTIVE_ACCESS) != 2));
        t70.V(new i7(14));
    }

    public static int T2(int i2) {
        return jniGetSessionConfigInt(gr0.c(i2));
    }

    public static void T3(xc0 xc0Var) {
        zd zdVar = X;
        synchronized (zdVar) {
            zdVar.remove(xc0Var);
        }
    }

    public static void U1() {
        synchronized (t0) {
            try {
                if (!m3() || (J == null && K.isEmpty())) {
                    O4();
                } else {
                    if (h) {
                        I0.removeMessages(q51.d(9));
                    }
                    if (!h || i) {
                        N4();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String U2(int i2) {
        return nd0.t(jniGetSessionConfigString(gr0.c(i2)));
    }

    public static void U3(cd0 cd0Var) {
        zd zdVar = q;
        synchronized (zdVar) {
            zdVar.remove(cd0Var);
        }
    }

    public static void V1() {
        I0.post(new tb0(14));
    }

    public static PermissionProfile V2(int i2, String str) {
        return jniGetSessionPermissionProfile(i2, nd0.T(str));
    }

    public static void V3(FileManagerFileListFragment fileManagerFileListFragment) {
        zd zdVar = i0;
        synchronized (zdVar) {
            zdVar.remove(fileManagerFileListFragment);
        }
    }

    public static int W1(String str) {
        int iJniDeletePermissionProfile = jniDeletePermissionProfile(nd0.T(str));
        for (int i2 : q51.s(4)) {
            if (q51.r(i2) == iJniDeletePermissionProfile) {
                return i2;
            }
        }
        return 2;
    }

    public static int W2() {
        return jniGetSetupListenPort();
    }

    public static void W3(fd0 fd0Var) {
        zd zdVar = A;
        synchronized (zdVar) {
            zdVar.remove(fd0Var);
        }
    }

    public static boolean X1() {
        return MainApplication.v().o0 == 2 && MainApplication.v().z != D2();
    }

    public static SpeedDialItem[] X2() {
        boolean z2;
        SpeedDialItem[] speedDialItemArrJniGetSpeedDialItems = jniGetSpeedDialItems();
        boolean z3 = h2(io.KEY_ONLINE_STATUS_RECEIVE) != 0;
        synchronized (t0) {
            try {
                z2 = false;
                for (SpeedDialItem speedDialItem : speedDialItemArrJniGetSpeedDialItems) {
                    speedDialItem.mOnlineState = (br0) Objects.requireNonNullElse((br0) u0.get(Long.valueOf(speedDialItem.mCid)), z3 ? br0.os_unknown : br0.os_unmonitored);
                    long j2 = speedDialItem.mCid;
                    if (j2 != 0 && v0.add(Long.valueOf(j2))) {
                        i = true;
                        z2 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            U1();
        }
        return speedDialItemArrJniGetSpeedDialItems;
    }

    public static void X3(hd0 hd0Var) {
        zd zdVar = c0;
        synchronized (zdVar) {
            zdVar.remove(hd0Var);
        }
    }

    public static boolean Y1() {
        return jniDoesLicenseAllowAccountRegistration();
    }

    public static a91[] Y2(boolean z2) {
        String[] strArrE = nd0.e(nd0.t(jniGetTcpTunnelConfig(z2)));
        int length = strArrE.length / 3;
        a91[] a91VarArr = new a91[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = i2 * 3;
            a91VarArr[i2] = new a91(strArrE[i3], strArrE[i3 + 1], strArrE[i3 + 2]);
        }
        return a91VarArr;
    }

    public static void Y3(id0 id0Var) {
        zd zdVar = p;
        synchronized (zdVar) {
            zdVar.remove(id0Var);
        }
    }

    public static boolean Z1() {
        return jniDoesLicenseAllowAddressBook();
    }

    public static boolean Z2() {
        return jniGetTelemetryConsent();
    }

    public static void Z3(long j2) {
        jniRemoveSpeedDialItem(j2);
    }

    public static y6 a2() {
        return new y6(jniEncodeTcpTunnelConfigStatus());
    }

    public static int a3() {
        return jniGetVersionBuild();
    }

    public static void a4(kd0 kd0Var) {
        zd zdVar = r;
        synchronized (zdVar) {
            zdVar.remove(kd0Var);
        }
    }

    public static void abookOnAddedAddressList(long[] jArr) {
        I0.post(new tb0(jArr));
    }

    public static void abookOnRosterItemsReceived(final long j2, final RosterItemFilter rosterItemFilter, final RosterItem[] rosterItemArr, final int i2) {
        I0.post(new Runnable() { // from class: ta0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                boolean z2;
                RosterItem[] rosterItemArr2 = rosterItemArr;
                long j3 = j2;
                RosterItemFilter rosterItemFilter2 = rosterItemFilter;
                int i3 = i2;
                boolean z3 = JniAdExt.h2(io.KEY_ONLINE_STATUS_RECEIVE) != 0;
                Object obj = JniAdExt.t0;
                synchronized (obj) {
                    try {
                        try {
                            try {
                                synchronized (JniAdExt.E0) {
                                    try {
                                        RosterItem rosterItem = JniAdExt.F0;
                                        int length = rosterItemArr2.length;
                                        int i4 = 0;
                                        boolean z4 = false;
                                        while (i4 < length) {
                                            RosterItem rosterItem2 = rosterItemArr2[i4];
                                            Object obj2 = obj;
                                            br0 br0Var = (br0) Objects.requireNonNullElse((br0) JniAdExt.u0.get(Long.valueOf(rosterItem2.mCid)), z3 ? br0.os_unknown : br0.os_unmonitored);
                                            rosterItem2.mOnlineState = br0Var;
                                            if (rosterItem != null) {
                                                z2 = z3;
                                                if (rosterItem2.mId == rosterItem.mId) {
                                                    JniAdExt.F0 = rosterItem2.a(rosterItem2.mUserDefinedName, rosterItem2.mThumbnailPath, rosterItem2.b, br0Var);
                                                    z4 = true;
                                                }
                                            } else {
                                                z2 = z3;
                                            }
                                            i4++;
                                            obj = obj2;
                                            z3 = z2;
                                        }
                                        zd zdVar = JniAdExt.W;
                                        synchronized (zdVar) {
                                            try {
                                                wc0[] wc0VarArr = (wc0[]) Collection$EL.toArray(zdVar, new dl(1));
                                                int length2 = wc0VarArr.length;
                                                int i5 = 0;
                                                while (i5 < length2) {
                                                    boolean z5 = z4;
                                                    wc0VarArr[i5].S(j3, rosterItemFilter2, rosterItemArr2, i3, z5);
                                                    i5++;
                                                    z4 = z5;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                throw th;
            }
        });
    }

    public static void abook_on_roster_added(long j2) {
        I0.post(new tb0(j2));
    }

    public static void abook_on_roster_item_list_server_update() {
        I0.post(new tb0(4));
    }

    public static void abook_on_roster_list_client_update() {
        I0.post(new tb0(2));
    }

    public static void abook_on_roster_selected() {
        I0.post(new tb0(6));
    }

    public static void abook_on_roster_tag_list_client_update() {
        I0.post(new tb0(3));
    }

    public static void abook_on_roster_tag_list_server_update() {
        I0.post(new ia0(3));
    }

    public static void abook_show_dialog(byte[] bArr, byte[] bArr2) {
        t70.V(new c0(bArr, 8, bArr2));
    }

    public static void abook_show_message(int i2, byte[] bArr) {
        t70.Y(new c(29, bArr));
    }

    public static void appendChatMessage(int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, byte[] bArr4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        Bitmap bitmapCreateBitmap = null;
        if (bArr4 != null) {
            int[] iArrS = q51.s(6);
            int length = iArrS.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i9 = 1;
                    break;
                }
                i9 = iArrS[i10];
                if (q51.r(i9) == i6) {
                    break;
                } else {
                    i10++;
                }
            }
            int iR = q51.r(i9);
            Bitmap.Config config = iR != 1 ? iR != 5 ? null : Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
            if (config != null) {
                IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr4).order(ByteOrder.nativeOrder()).asIntBuffer();
                int[] iArr = new int[intBufferAsIntBuffer.remaining()];
                intBufferAsIntBuffer.get(iArr);
                bitmapCreateBitmap = Bitmap.createBitmap(iArr, i4, i5, config);
            }
        }
        Bitmap bitmap = bitmapCreateBitmap;
        for (int i11 : q51.s(19)) {
            if (q51.r(i11) == i3) {
                i8 = i11;
                t70.V(new qi(i2, new fl(i8, nd0.t(bArr), nd0.t(bArr2), nd0.t(bArr3), z2, bitmap, i7)));
            }
        }
        i8 = 1;
        t70.V(new qi(i2, new fl(i8, nd0.t(bArr), nd0.t(bArr2), nd0.t(bArr3), z2, bitmap, i7)));
    }

    public static boolean b2(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > 300000) {
            j2 = 300000;
        }
        I0.removeMessages(q51.d(7));
        if (j2 == 0) {
            f = 0L;
            S1();
            return false;
        }
        f = SystemClock.uptimeMillis() + j2;
        boolean zJniEnableAutoDiscovery = jniEnableAutoDiscovery(true);
        I0.sendEmptyMessageDelayed(q51.d(7), j2);
        return zJniEnableAutoDiscovery;
    }

    public static String b3() {
        byte[] bArrJniGetVersionCommit = jniGetVersionCommit();
        return bArrJniGetVersionCommit != null ? nd0.t(bArrJniGetVersionCommit) : "";
    }

    public static int b4(String str, String str2) {
        int iJniRenamePermissionProfile = jniRenamePermissionProfile(nd0.T(str), nd0.T(str2));
        for (int i2 : q51.s(5)) {
            if (q51.r(i2) == iJniRenamePermissionProfile) {
                return i2;
            }
        }
        return 2;
    }

    public static Bitmap c2(byte[] bArr) {
        byte[] bArrJniGet2faQrCode = jniGet2faQrCode(bArr);
        if (bArrJniGet2faQrCode != null && bArrJniGet2faQrCode.length > 0) {
            return BitmapFactory.decodeByteArray(bArrJniGet2faQrCode, 0, bArrJniGet2faQrCode.length);
        }
        return null;
    }

    public static int c3() {
        return jniGetVersionMajor();
    }

    public static void c4(String str, long j2) {
        jniRenameSpeedDialItem(j2, nd0.T(str));
    }

    public static void cmdInitPermissionProfiles(int i2, byte[] bArr, PermissionProfile permissionProfile, int[] iArr) {
        t70.V(new qe(i2, bArr, permissionProfile, iArr));
    }

    public static void cmdPermissionsUpdated(int i2, PermissionProfile permissionProfile, int[] iArr) {
        t70.V(new c6(i2, permissionProfile, iArr));
    }

    private static void createGlowSurface(Object obj, int i2, int i3, int i4, int i5, int i6) {
        t70.V(new na0(obj, i2, i3, i4, i5, i6, 0));
    }

    public static String d2() {
        return nd0.t(jniGetAdLanguage());
    }

    public static int d3() {
        return jniGetVersionMinor();
    }

    public static void d4(int i2, int i3) {
        boolean z2;
        synchronized (x0) {
            try {
                LinkedHashMap linkedHashMap = y0;
                zl0 zl0Var = (zl0) linkedHashMap.get(Integer.valueOf(i2));
                if (zl0Var == null) {
                    return;
                }
                if (zl0Var.a()) {
                    int iR = q51.r(i3);
                    z2 = true;
                    if (iR != 0) {
                        if (iR != 1) {
                            if (iR == 2 && linkedHashMap.remove(Integer.valueOf(i2)) != null) {
                            }
                        } else if ((zl0Var.b.c & 1) != 1 || linkedHashMap.remove(Integer.valueOf(i2)) == null) {
                        }
                    } else if (zl0Var.j) {
                        return;
                    } else {
                        zl0Var.j = true;
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jniSuspendMotdMessage(i2);
                    Q4(false);
                }
                I0.post(new wo(i3, zl0Var, i2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Bitmap decodeBitmap(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    private static void destroyGlowSurface(Object obj, int i2) {
        t70.V(new ha0(obj, i2, 1));
    }

    public static void e() {
        zd zdVar = W;
        synchronized (zdVar) {
            try {
                if (zdVar.isEmpty() && !D0) {
                    I0.post(new i7(11));
                    D0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AdCountryCode[] e2() {
        AdCountryCode[] adCountryCodeArr;
        synchronized (r0) {
            try {
                if (s0 == null) {
                    s0 = jniGetAllCountries();
                }
                adCountryCodeArr = s0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return adCountryCodeArr;
    }

    public static Date e3() {
        long jJniGetVersionTimestamp = jniGetVersionTimestamp();
        int i2 = (int) (jJniGetVersionTimestamp % 100);
        long j2 = jJniGetVersionTimestamp / 100;
        int i3 = (int) (j2 % 100);
        long j3 = j2 / 100;
        int i4 = (int) (j3 % 100);
        long j4 = j3 / 100;
        int i5 = (int) (j4 % 100);
        long j5 = j4 / 100;
        Calendar calendar = Calendar.getInstance();
        calendar.set((int) (j5 / 100), ((int) (j5 % 100)) - 1, i5, i4, i3, i2);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static void e4(long j2, RosterItemFilter rosterItemFilter) {
        jniReqRosterItems(j2, nd0.T(rosterItemFilter.a), nd0.T(nd0.f(rosterItemFilter.b)), rosterItemFilter.c, rosterItemFilter.d);
    }

    public static byte[] encodeBitmapARGB8888(int[] iArr, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] encodeBitmapRGB565(int[] iArr, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.RGB_565);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Hashtable f(int[] iArr) {
        s30 s30Var;
        du0 du0Var;
        Hashtable hashtable = new Hashtable();
        du0[] du0VarArr = (du0[]) Arrays.copyOfRange(du0.values(), 0, du0.values().length - 1);
        int length = iArr.length;
        int length2 = du0VarArr.length;
        Logging logging = b;
        if (length != length2) {
            logging.c("inconsistent permission features");
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            du0[] du0VarArrValues = du0.values();
            int length3 = du0VarArrValues.length;
            int i3 = 0;
            while (true) {
                s30Var = null;
                if (i3 >= length3) {
                    du0Var = null;
                    break;
                }
                du0Var = du0VarArrValues[i3];
                if (du0Var.c == i2) {
                    break;
                }
                i3++;
            }
            if (du0Var == null) {
                logging.c("invalid permission feature " + i2);
            } else {
                int i4 = iArr[i2];
                for (s30 s30Var2 : s30.values()) {
                    if (s30Var2.c == i4) {
                        s30Var = s30Var2;
                        break;
                    }
                }
                if (s30Var == null) {
                    logging.c("invalid forced permission " + iArr[i2]);
                } else {
                    hashtable.put(du0Var, s30Var);
                }
            }
        }
        return hashtable;
    }

    public static boolean f2(boolean z2) {
        boolean z3;
        synchronized (J0) {
            z3 = K0;
            K0 = z2;
        }
        return z3;
    }

    public static String f3(int i2, int i3, boolean z2) {
        String strN1;
        int i4;
        int i5 = 4;
        for (int i6 : q51.s(4)) {
            if (q51.r(i6) == i2) {
                i5 = i6;
                break;
            }
        }
        int iR = q51.r(i5);
        if (iR == 0) {
            strN1 = n1("ad.vpn.state.offline");
        } else if (iR == 1) {
            strN1 = n1("ad.vpn.state.connecting");
        } else if (iR != 2) {
            strN1 = "";
            if (iR == 3) {
                int[] iArrS = q51.s(10);
                int length = iArrS.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        i4 = 1;
                        break;
                    }
                    i4 = iArrS[i7];
                    if (q51.r(i4) == i3) {
                        break;
                    }
                    i7++;
                }
                switch (q51.r(i4)) {
                    case 1:
                        strN1 = n1("ad.vpn.error.no_ip_found");
                        break;
                    case 2:
                        strN1 = n1("ad.vpn.error.tun_device");
                        break;
                    case 3:
                        strN1 = z2 ? n1("ad.vpn.error.not_supported_tun_local") : n1("ad.vpn.error.not_supported_tun_remote");
                        break;
                    case 4:
                        strN1 = n1("ad.vpn.error.not_supported_client");
                        break;
                    case 5:
                        strN1 = n1("ad.vpn.error.remote_error");
                        break;
                    case 6:
                        strN1 = n1("ad.vpn.error.ip_rejected");
                        break;
                    case 7:
                        strN1 = z2 ? n1("ad.vpn.error.preparation_failed_local") : n1("ad.vpn.error.preparation_failed_remote");
                        break;
                    case 8:
                        strN1 = n1("ad.vpn.error.already_in_use");
                        break;
                    case 9:
                        strN1 = n1("ad.vpn.error.mixed_ipv4_ipv6");
                        break;
                }
                strN1 = String.format(n1("ad.vpn.state.error"), strN1);
            }
        } else {
            strN1 = n1("ad.vpn.state.connected");
        }
        return n1("ad.vpn.status") + " " + strN1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public static void f4() {
        Long lValueOf;
        synchronized (t0) {
            try {
                g = SystemClock.uptimeMillis();
                int i2 = 1;
                boolean z2 = J != null;
                boolean zIsEmpty = K.isEmpty();
                RosterItem rosterItemQ2 = Q2();
                if (rosterItemQ2 != null) {
                    long j2 = rosterItemQ2.mCid;
                    if (j2 != 0) {
                        lValueOf = Long.valueOf(j2);
                    } else {
                        lValueOf = null;
                    }
                } else {
                    lValueOf = null;
                }
                I0.post(new c(28, Stream.CC.of((Object[]) new Stream[]{z2 ? Collection$EL.stream(v0) : Stream.CC.empty(), (zIsEmpty || lValueOf == null) ? Stream.CC.empty() : Stream.CC.of(lValueOf), !zIsEmpty ? Collection$EL.stream(w0) : Stream.CC.empty()}).flatMap(Function$CC.identity()).distinct().limit(250L).mapToLong(new xj(i2)).toArray()));
                h = true;
                i = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void fm_add_file(boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, long j2, byte[] bArr4, long j3) {
        I0.post(new ib0(z2, bArr, bArr2, bArr3, i2, i3, j2, bArr4, j3, 1));
    }

    public static void fm_new_list(boolean z2, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3, int[] iArr, int[] iArr2, long[] jArr, byte[] bArr4, long[] jArr2) {
        I0.post(new dc0(z2, bArr, i2, bArr2, bArr3, iArr, iArr2, jArr, bArr4, jArr2));
    }

    public static void fm_properties_failure(boolean z2, int i2) {
        I0.post(new nb0(i2, 1, z2));
    }

    public static void fm_properties_success(boolean z2, int i2, int i3, byte[] bArr, int i4) {
        I0.post(new ec0(z2, i2, i3, bArr, i4));
    }

    public static void fm_remote_clear() {
        I0.post(new ia0(0));
    }

    public static void fm_remote_perm(boolean z2) {
        I0.post(new fb0(8, z2));
    }

    public static void fm_remove_file(boolean z2, byte[] bArr, byte[] bArr2) {
        I0.post(new ub0(z2, bArr, bArr2, 1));
    }

    public static void fm_show_file_error(int i2) {
        I0.post(new cp(i2, 14));
    }

    public static void fm_update_file(boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, long j2, byte[] bArr4, long j3) {
        I0.post(new ib0(z2, bArr, bArr2, bArr3, i2, i3, j2, bArr4, j3, 2));
    }

    public static void fm_update_file_op_progress(int i2, byte b2, byte b3, long j2, long j3, int i3, int i4, int i5, double d2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        I0.post(new gc0(i2, b2, b3, j2, j3, i3, i4, i5, d2, bArr, bArr2, bArr3));
    }

    public static void g(int i2, boolean z2) {
        gq0 gq0Var = new gq0(d);
        NotificationManager notificationManager = gq0Var.c;
        if (notificationManager != null) {
            notificationManager.cancel(600);
        }
        NotificationManager notificationManager2 = gq0Var.c;
        if (notificationManager2 != null) {
            notificationManager2.cancel(701);
        }
        gq0Var.a(i2);
        NotificationManager notificationManager3 = gq0Var.c;
        if (notificationManager3 != null) {
            notificationManager3.cancel(103);
        }
        n0.d(i2);
        bc bcVar = o0;
        bcVar.p();
        bcVar.E();
        zd zdVar = D;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    dd0 dd0Var = (dd0) tdVar.next();
                    if (dd0Var != null) {
                        dd0Var.b(i2, z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0.remove(Integer.valueOf(i2));
    }

    public static boolean g2(io ioVar) {
        return jniGetConfigBool(nd0.T(ioVar.c), q51.r(ioVar.d));
    }

    public static boolean g3(long j2) {
        return jniHasChatHistory(j2);
    }

    public static void g4() {
        jniRequestServerTime();
    }

    private static byte[] getClipboardText(Object obj) {
        ClipData primaryClip;
        ClipData.Item itemAt;
        Context context = (Context) obj;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        String string = null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null) {
            string = itemAt.coerceToText(context).toString();
        }
        if (string == null) {
            string = "";
        }
        return nd0.T(string);
    }

    public static Bitmap getCursor() {
        Bitmap bitmap = a;
        if (bitmap != null) {
            return bitmap;
        }
        Context context = d;
        if (context == null) {
            return null;
        }
        Bitmap bitmapI0 = t70.i0(context, R.drawable.ic_pointer);
        a = bitmapI0;
        if (bitmapI0 == null) {
            return null;
        }
        int width = bitmapI0.getWidth() / 2;
        int height = a.getHeight() / 2;
        if (width > 0 && height > 0) {
            a = Bitmap.createScaledBitmap(a, width, height, true);
        }
        return a;
    }

    public static int[] getDisplayInfo() {
        Point pointA = er0.a();
        return new int[]{pointA.x, pointA.y};
    }

    private static byte[] getHubParams(Object obj) {
        return nd0.T(((HubActivity) obj).j.d);
    }

    private static int getKeyEventUnicodeChar(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        KeyEvent keyEvent = new KeyEvent(j2, j3, i2, i3, i4, i5, i6, i7, i8, i9);
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar == 0) {
            switch (keyEvent.getKeyCode()) {
                case 144:
                    return 48;
                case 145:
                    return 49;
                case 146:
                    return 50;
                case 147:
                    return 51;
                case 148:
                    return 52;
                case 149:
                    return 53;
                case 150:
                    return 54;
                case 151:
                    return 55;
                case 152:
                    return 56;
                case 153:
                    return 57;
                case 154:
                    return 47;
                case 155:
                    return 42;
                case 156:
                    return 45;
                case 157:
                    return 43;
                case 158:
                    return 46;
                case 159:
                    return 44;
                case 161:
                    return 61;
                case 162:
                    return 40;
                case 163:
                    return 41;
            }
        }
        return unicodeChar;
    }

    public static Object[] getNetIdInfo() {
        String hostAddress;
        byte[] address;
        String strX;
        InetAddress inetAddressA;
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null || mainApplicationV.C()) {
            return null;
        }
        Context context = d;
        ArrayList arrayList = new ArrayList();
        y6 y6Var = nd0.c;
        if (y6Var != null) {
            synchronized (y6Var) {
                try {
                    arrayList = new ArrayList();
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    ArrayList arrayList2 = (ArrayList) y6Var.f;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        LinkProperties linkProperties = connectivityManager.getLinkProperties((Network) obj);
                        Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
                        while (it.hasNext()) {
                            InetAddress gateway = it.next().getGateway();
                            if (gateway != null && (hostAddress = gateway.getHostAddress()) != null && (address = gateway.getAddress()) != null && !gateway.isAnyLocalAddress() && (strX = y6Var.x(hostAddress)) != null) {
                                byte[] bArrY = hq.y(strX.replace(":", ""));
                                int length = bArrY.length;
                                long j2 = 0;
                                int i3 = 0;
                                while (i3 < length) {
                                    j2 = (j2 * 256) + (((long) bArrY[i3]) & 255);
                                    i3++;
                                    connectivityManager = connectivityManager;
                                }
                                ConnectivityManager connectivityManager2 = connectivityManager;
                                NetIdInfo netIdInfo = new NetIdInfo();
                                netIdInfo.mGatewayIp = address;
                                netIdInfo.mGatewayMac = j2;
                                arrayList.add(netIdInfo);
                                List<InetAddress> dnsServers = linkProperties.getDnsServers();
                                if (dnsServers != null) {
                                    Iterator<InetAddress> it2 = dnsServers.iterator();
                                    InetAddress next = null;
                                    while (it2.hasNext()) {
                                        next = it2.next();
                                        if (next.getAddress() != null && !next.isAnyLocalAddress()) {
                                            break;
                                        }
                                    }
                                    if (next != null && !next.isAnyLocalAddress()) {
                                        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                                            InetAddress address2 = linkAddress.getAddress();
                                            if (address2 != null && address2.getAddress() != null) {
                                                int prefixLength = linkAddress.getPrefixLength();
                                                InetAddress inetAddressY = nd0.y(prefixLength, address.length == 16);
                                                InetAddress inetAddressA2 = nd0.a(gateway, inetAddressY);
                                                if (!address2.isAnyLocalAddress() && (inetAddressA = nd0.a(address2, inetAddressY)) != null && inetAddressA.equals(inetAddressA2)) {
                                                    netIdInfo.mNetAddr = inetAddressA.getAddress();
                                                    netIdInfo.mPrefixLength = (byte) prefixLength;
                                                    netIdInfo.mDnsIp = next.getAddress();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                connectivityManager = connectivityManager2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList.toArray();
    }

    public static Object[] getNetworkInterfaceInfo() {
        byte[] address;
        String string;
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null || mainApplicationV.C()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback()) {
                    String name = networkInterfaceNextElement.getName();
                    byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                    StringBuilder sb = new StringBuilder();
                    for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                        InetAddress address2 = interfaceAddress.getAddress();
                        if (address2 != null && (address = address2.getAddress()) != null) {
                            if (address.length == 4) {
                                StringBuilder sb2 = new StringBuilder();
                                for (byte b2 : address) {
                                    int i2 = b2 & 255;
                                    if (sb2.length() > 0) {
                                        sb2.append(".");
                                    }
                                    sb2.append(i2);
                                }
                                string = sb2.toString();
                            } else {
                                if (address.length > 4) {
                                    hq.h(2, address);
                                }
                                string = null;
                            }
                            if (string != null) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(string);
                                sb.append("/");
                                sb.append((int) interfaceAddress.getNetworkPrefixLength());
                            }
                        }
                    }
                    if (name != null && !name.isEmpty() && sb.length() > 0) {
                        String strH = hardwareAddress != null ? hq.h(1, hardwareAddress) : "";
                        arrayList.add(nd0.T(name));
                        arrayList.add(nd0.T(strH));
                        arrayList.add(nd0.T(sb.toString()));
                    }
                }
            }
        } catch (SocketException e2) {
            nd0.a.b("error getting network info: ", e2);
        }
        return arrayList.toArray();
    }

    public static Object[] getNetworkInterfaces() {
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null || mainApplicationV.C()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback()) {
                    int index = networkInterfaceNextElement.getIndex();
                    String name = networkInterfaceNextElement.getName();
                    String displayName = networkInterfaceNextElement.getDisplayName();
                    byte[] bArr = new byte[4];
                    byte[] address = {-1, -1, -1, -1};
                    byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                    long j2 = 0;
                    if (hardwareAddress != null) {
                        for (byte b2 : hardwareAddress) {
                            j2 = (j2 * 256) + (((long) b2) & 255);
                        }
                    }
                    for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                        byte[] address2 = interfaceAddress.getAddress().getAddress();
                        if (address2 != null) {
                            address = nd0.y(interfaceAddress.getNetworkPrefixLength(), address2.length == 16).getAddress();
                            bArr = address2;
                            break;
                        }
                    }
                    arrayList.add(new AdNetInterface(index, j2, bArr, address, name, displayName));
                }
            }
        } catch (SocketException e2) {
            nd0.a.b("error getting network interfaces: ", e2);
        }
        return arrayList.toArray();
    }

    public static byte[] getOsDescription() {
        String str = "Android " + Build.VERSION.RELEASE;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            String str2 = Build.VERSION.BASE_OS;
            if (!str2.isEmpty()) {
                str = str + " (on " + str2 + ")";
            }
        }
        if (i2 >= 23) {
            str = str + ", security patch level " + Build.VERSION.SECURITY_PATCH;
        }
        return nd0.T(str);
    }

    public static Bitmap getWallpaper() {
        WallpaperManager wallpaperManager;
        PackageManager packageManager;
        Context context = d;
        if (context == null || (wallpaperManager = WallpaperManager.getInstance(context)) == null) {
            return null;
        }
        try {
            WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
            Drawable drawableLoadThumbnail = (wallpaperInfo == null || er0.e("samsung") || (packageManager = d.getPackageManager()) == null) ? null : wallpaperInfo.loadThumbnail(packageManager);
            if (drawableLoadThumbnail == null) {
                drawableLoadThumbnail = wallpaperManager.getDrawable();
            }
            return t70.k(drawableLoadThumbnail);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot retrieve wallpaper: "), b);
            return null;
        }
    }

    private static Object get_default_display() {
        DisplayManager displayManager = (DisplayManager) d.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return displayManager.getDisplay(0);
    }

    private static int get_display_rotation_angle(Object obj) {
        Display display = (Display) obj;
        if (display == null) {
            return 0;
        }
        int rotation = display.getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static byte[] get_proxy() {
        return nd0.o(d);
    }

    public static int h2(io ioVar) {
        return jniGetConfigInt(nd0.T(ioVar.c), q51.r(ioVar.d));
    }

    public static boolean h3() {
        return jniHasFilesToAccept();
    }

    public static boolean h4() {
        return jniRequestSystemInfo();
    }

    public static void handle_server_info(byte[] bArr, byte[] bArr2) {
        I0.post(new vb0(bArr, bArr2, 0));
    }

    private static boolean hasClipboardText(Object obj) {
        ClipDescription description;
        ClipData primaryClip = ((ClipboardManager) ((Context) obj).getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || (description = primaryClip.getDescription()) == null) {
            return false;
        }
        return description.getMimeType(0).startsWith("text");
    }

    private static boolean hasClipboardUris(Object obj) {
        ClipData primaryClip = ((ClipboardManager) ((Context) obj).getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            int itemCount = primaryClip.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                if (primaryClip.getItemAt(i2).getUri() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean has_camera_permission() {
        return r3.c(d, new String[]{"android.permission.CAMERA"});
    }

    private static boolean has_microphone_permission() {
        return r3.c(d, new String[]{"android.permission.RECORD_AUDIO"});
    }

    public static void hideDialog() {
        t70.V(new i7(26));
    }

    private static void hideInputMethodEditor(Object obj) {
        t70.V(new ka0(2, obj));
    }

    public static String i2(io ioVar) {
        byte[] bArrJniGetConfigIpString = jniGetConfigIpString(nd0.T(ioVar.c), q51.r(ioVar.d));
        if (bArrJniGetConfigIpString != null) {
            return nd0.t(bArrJniGetConfigIpString);
        }
        return null;
    }

    public static boolean i3() {
        if (hq.p(h2(io.KEY_INTERACTIVE_ACCESS)) == 1) {
            return true;
        }
        return jniHasPwd();
    }

    public static void i4() {
        jniResetRosters();
    }

    public static boolean injectMotion(byte b2, byte b3, int i2, byte b4, int i3, int i4, byte b5, int i5, int i6, float f2, float f3, int i7, int[] iArr, float[] fArr, float[] fArr2) {
        dj djVar;
        km0 km0Var;
        jm0 jm0Var;
        hm0 hm0Var;
        em0 em0Var;
        if (!X1() || (djVar = N) == null) {
            return false;
        }
        km0[] km0VarArrValues = km0.values();
        int length = km0VarArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                km0Var = km0.msrcc_none;
                break;
            }
            km0Var = km0VarArrValues[i8];
            if (km0Var.c == b2) {
                break;
            }
            i8++;
        }
        km0 km0Var2 = km0Var;
        jm0[] jm0VarArrValues = jm0.values();
        int length2 = jm0VarArrValues.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length2) {
                jm0Var = jm0.msrc_unknown;
                break;
            }
            jm0Var = jm0VarArrValues[i9];
            if (jm0Var.c == b3) {
                break;
            }
            i9++;
        }
        jm0 jm0Var2 = jm0Var;
        hm0[] hm0VarArrValues = hm0.values();
        int length3 = hm0VarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length3) {
                hm0Var = hm0.mop_none;
                break;
            }
            hm0Var = hm0VarArrValues[i10];
            if (hm0Var.c == b4) {
                break;
            }
            i10++;
        }
        hm0 hm0Var2 = hm0Var;
        em0[] em0VarArrValues = em0.values();
        int length4 = em0VarArrValues.length;
        for (int i11 = 0; i11 < length4; i11++) {
            em0Var = em0VarArrValues[i11];
            if (em0Var.c == i7) {
                return djVar.u(new e7(km0Var2, jm0Var2, i2, hm0Var2, i3, i4, b5, i5, i6, f2, f3, em0Var, iArr, fArr, fArr2));
            }
        }
        em0Var = em0.mbtn_none;
        return djVar.u(new e7(km0Var2, jm0Var2, i2, hm0Var2, i3, i4, b5, i5, i6, f2, f3, em0Var, iArr, fArr, fArr2));
    }

    public static boolean inject_key_input(byte b2, int i2, int i3, int i4) {
        dj djVar;
        if (X1() && (djVar = N) != null) {
            return djVar.o(b2, i2, new de0(i3), i4);
        }
        return false;
    }

    public static boolean inject_mouse_input(int i2, int i3, int i4, int i5) {
        dj djVar;
        b7 b7Var;
        if (!X1() || (djVar = N) == null) {
            return false;
        }
        ConnectionFragment connectionFragment = M;
        if (connectionFragment != null && (b7Var = connectionFragment.l0) != null) {
            b7Var.j();
        }
        return djVar.b(i2, i3, new nm0(i4), i5);
    }

    public static boolean inject_string_input(byte[] bArr) {
        dj djVar;
        if (X1() && (djVar = N) != null) {
            return djVar.c(nd0.t(bArr));
        }
        return false;
    }

    public static String[] j2() {
        return nd0.e(nd0.t(jniGetConfigMapKeys(nd0.T("ad.security.acl_list"), q51.r(7))));
    }

    public static boolean j3() {
        return jniHasOverridePwd();
    }

    public static void j4() {
        jniResetTcpTunnelConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAcceptBackendFiles(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAddRoster(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAddRosterItem(long j2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountAbortOAuth();

    private static native AnynetAccountInfo jniAnynetAccountGetAccountInfo();

    private static native byte[] jniAnynetAccountGetEmailPendingVerification();

    private static native byte[] jniAnynetAccountGetRememberedUser();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountLogin(boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountLogout();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountOtpLogin(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountRegister(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountRegisterProfessional(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z2, long j2, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountRequestSsoAuthInfo(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniAnynetAccountResetPassword(byte[] bArr);

    private static native byte[] jniBase322faKey(byte[] bArr);

    private static native void jniBenchmark();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniBrowseFiles(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniBrowseFilesFromOngoingConnection();

    private static native boolean jniCanAddCustomProfile();

    private static native boolean jniCanClipbrdFiles();

    private static native boolean jniCanClipbrdText();

    private static native boolean jniCanModifyForbiddenWindows(int i2);

    private static native boolean jniCanRemoveLicense();

    private static native boolean jniCanSessionConfig(int i2);

    private static native boolean jniCanToggleSessionRecording();

    private static native void jniCaptureAudioPlaybackFrame(int i2, ByteBuffer byteBuffer);

    private static native boolean jniCaptureFrame(int i2, ByteBuffer byteBuffer, int i3, int i4, int i5, int i6, int i7, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniClearPreviousSessionProfiles();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniCloseIncomingConnection(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniClosePanel();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniConnect(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniConnectVpn(byte[] bArr);

    private static native int jniDeletePermissionProfile(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniDeleteRoster(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniDeleteRosterItem(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniDeleteRosterItemTag(long j2, byte[] bArr);

    private static native boolean jniDoesLicenseAllowAccountRegistration();

    private static native boolean jniDoesLicenseAllowAddressBook();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniEnableAnyDeskOne(boolean z2);

    private static native boolean jniEnableAutoDiscovery(boolean z2);

    private static native int[] jniEncodeTcpTunnelConfigStatus();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerAbortRequestForFileProperties(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerChangeCurrentPath(boolean z2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerConflictDialogCancel(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerConflictDialogResolve(int i2, int i3, int i4, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerCreateFolder(boolean z2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerDeleteConfirmDialogCancel(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerDeleteConfirmDialogResolve(int i2, int i3, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerDeleteFiles(boolean z2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerOnHomeClicked(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerOnRefreshClicked(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerRemoveProgressItem(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerRenameFile(boolean z2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerRequestFileProperties(boolean z2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniFileManagerTransferFiles(boolean z2, byte[] bArr);

    private static native byte[] jniGet2faQrCode(byte[] bArr);

    private static native byte[] jniGetAdLanguage();

    private static native AdCountryCode[] jniGetAllCountries();

    private static native boolean jniGetConfigBool(byte[] bArr, int i2);

    private static native int jniGetConfigInt(byte[] bArr, int i2);

    private static native byte[] jniGetConfigIpString(byte[] bArr, int i2);

    private static native byte[] jniGetConfigMapKeys(byte[] bArr, int i2);

    private static native byte[] jniGetConfigString(byte[] bArr, int i2);

    private static native int jniGetCurrentMonitor();

    private static native byte[] jniGetCustomData(byte[] bArr);

    private static native FileInfo jniGetFileInfo(byte[] bArr);

    private static native byte[] jniGetFileSizeString(long j2);

    private static native byte jniGetLicenseBannerType();

    private static native byte[] jniGetLicenseConfigDisallowedString(byte[] bArr);

    private static native int jniGetLicenseConfigInt(byte[] bArr);

    private static native byte[] jniGetLicenseConfigString(byte[] bArr);

    private static native byte[] jniGetLicenseName();

    private static native byte[] jniGetLogFilePath();

    private static native int jniGetMonitorCount();

    private static native byte[] jniGetOwnAddr();

    private static native byte[] jniGetOwnAlias();

    private static native long jniGetOwnCid();

    private static native byte[] jniGetPermissionProfilePermissions(byte[] bArr);

    private static native PermissionProfile[] jniGetPermissionProfiles();

    private static native boolean jniGetPrivacyMode();

    private static native boolean jniGetPrivacyStatus();

    private static native int jniGetPwdStrength(byte[] bArr);

    private static native long jniGetRemoteCaps();

    private static native int jniGetRemoteOsType();

    private static native byte[] jniGetResourceDevList();

    private static native byte[] jniGetResourceFoss();

    private static native byte[] jniGetResultString(int i2, int i3);

    private static native byte[] jniGetRosterTags();

    private static native Roster[] jniGetRosters();

    private static native long jniGetSelectedRosterId();

    private static native int jniGetSelectedRosterType();

    private static native boolean jniGetSessionConfigBool(int i2);

    private static native int jniGetSessionConfigInt(int i2);

    private static native byte[] jniGetSessionConfigString(int i2);

    private static native PermissionProfile jniGetSessionPermissionProfile(int i2, byte[] bArr);

    private static native int jniGetSetupListenPort();

    private static native SpeedDialItem[] jniGetSpeedDialItems();

    private static native byte[] jniGetStringResource(byte[] bArr);

    private static native byte[] jniGetTcpTunnelConfig(boolean z2);

    private static native boolean jniGetTelemetryConsent();

    private static native byte[] jniGetUrlResource(byte[] bArr);

    private static native int jniGetVersionBuild();

    private static native byte[] jniGetVersionCommit();

    private static native int jniGetVersionMajor();

    private static native int jniGetVersionMinor();

    private static native long jniGetVersionTimestamp();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniHandleAuthenticationCode(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniHandlePassword(byte[] bArr, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniHandleTerminal(byte[] bArr, boolean z2);

    private static native boolean jniHasChatHistory(long j2);

    private static native boolean jniHasFilesToAccept();

    private static native boolean jniHasOverridePwd();

    private static native boolean jniHasPwd();

    private static native boolean jniInit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i2, int i3, byte[] bArr9, byte[] bArr10, int i4, int i5, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniInjectChats(int i2);

    private static native boolean jniIs2faEnabled();

    private static native boolean jniIsAddressValid(byte[] bArr);

    private static native boolean jniIsClipboardSplit();

    private static native boolean jniIsConfigOverridden(byte[] bArr);

    private static native boolean jniIsFreeLicense();

    private static native boolean jniIsIpAddress(byte[] bArr);

    private static native boolean jniIsMotionInputSupported();

    private static native boolean jniIsNaiveEmailAddress(byte[] bArr);

    private static native boolean jniIsPrivacySupported();

    private static native boolean jniIsProfileUsingPwd(byte[] bArr);

    private static native boolean jniIsRemoteRestartSupported();

    private static native boolean jniIsRemoteRestartWithCredentialsAvailable();

    private static native boolean jniIsRequestElevationSupported();

    private static native boolean jniIsRequestElevationWithCredentialsSupported();

    private static native boolean jniIsSasSupported();

    private static native boolean jniIsSessionRecordingActive();

    private static native boolean jniIsTcpTunnelingSupported();

    private static native byte[] jniIsValidPermissionProfileName(byte[] bArr);

    private static native boolean jniIsVpnSupported();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniKickoutIncomingConnection(int i2);

    private static native void jniLoadTcpTunnelConfig(long j2, byte[] bArr);

    private static native byte[] jniMake2faKey();

    private static native byte[] jniMake2faShiftedOtps(byte[] bArr, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniMonitorOnlineStates(long[] jArr);

    private static native int jniNewPermissionProfile(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniNotifyReadyForBackendFileOperations();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniNotifyScreenCaptureStateChanged(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnAcceptFiles();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnAcceptSession(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnAddressBookClose();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnAddressBookOpen();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnClipboardTextChanged(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnEndPanZoom();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnEndScroll();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnHScroll(float f2, float f3, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnKey(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnMotion(byte b2, byte b3, int i2, byte b4, int i3, int i4, byte b5, int i5, int i6, float f2, float f3, int i7, int[] iArr, float[] fArr, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnMouse(int i2, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnMouseRelative(int i2, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnMouseRelativeStart();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnPanZoom(float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnPanZoomCorrectionStep(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnPrivacyMode(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnRejectSession(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnRemoteRestart(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnRemoteRestartWithCredentials(byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnRequestElevation();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnRequestElevationWithCredentials(byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnSaveScreenshot();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnScroll(float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnSendSas();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStartPanZoom(float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStartScroll(float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStartSessionRecording();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStopSessionRecording();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStringInput(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnStringInputFallback(byte[] bArr, int i2, int i3);

    private static native void jniOnSurfaceChanged(Surface surface, boolean z2);

    private static native int[] jniOnTcpTunnelDeleted(boolean z2, int i2);

    private static native int[] jniOnTcpTunnelEdited(boolean z2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnVScroll(float f2, float f3, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnVpnPrepareResult(int i2, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOpenChatHistory(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOpenChatLog(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniPlayback(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniQueryAlias(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniReconnectService();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRefreshLicense();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRegisterAlias(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRegisterLicense(byte[] bArr, boolean z2);

    private static native void jniRemoveSpeedDialItem(long j2);

    private static native int jniRenamePermissionProfile(byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRenameRosterItemTag(long j2, byte[] bArr, byte[] bArr2);

    private static native void jniRenameSpeedDialItem(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniReportMotdEvent(byte b2, long j2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native void jniReqRosterItems(long j2, byte[] bArr, byte[] bArr2, int i2, int i3);

    private static native void jniRequestServerTime();

    private static native boolean jniRequestSystemInfo();

    private static native void jniResetRosters();

    private static native void jniResetTcpTunnelConfig();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRestartAudioCapture();

    private static native void jniRevokeTokens();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniRewindPlayback();

    private static native void jniSafelyReleaseAllFrames();

    private static native void jniSave2faKey(byte[] bArr);

    private static native void jniSavePwd(byte[] bArr);

    private static native int jniSavePwdForProfile(byte[] bArr, byte[] bArr2);

    private static native int jniSavePwdHashForProfile(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native void jniSaveTcpTunnelConfig();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSeekPlayback(double d2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSelectMonitor(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSelectPermissionProfile(int i2, byte[] bArr);

    private static native void jniSelectRosterId(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSendBackendFileOffer(int i2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSendChatMessage(int i2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSendFileOffer(byte[] bArr);

    private static native void jniSetConfigBool(byte[] bArr, boolean z2, int i2);

    private static native void jniSetConfigInt(byte[] bArr, int i2, int i3);

    private static native void jniSetConfigIpString(byte[] bArr, byte[] bArr2, int i2);

    private static native void jniSetConfigMapKeys(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2);

    private static native void jniSetConfigString(byte[] bArr, byte[] bArr2, int i2);

    private static native void jniSetConfigStringCrypted(byte[] bArr, byte[] bArr2, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetCurrentProfilePermission(int i2, int i3, boolean z2);

    private static native void jniSetFavoriteSpeedDialItem(long j2, boolean z2);

    private static native void jniSetFrontendRunning(boolean z2);

    private static native void jniSetGroupPolicies(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native void jniSetInjectPermission(boolean z2);

    private static native int jniSetPermissionProfilePermissions(byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetPlaybackPaused(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetPlaybackSpeed(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetProfileEnabled(byte[] bArr, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetProfilePermission(byte[] bArr, int i2, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetProfilePwd(byte[] bArr, byte[] bArr2);

    private static native void jniSetSessionConfigBool(int i2, boolean z2);

    private static native void jniSetSessionConfigInt(int i2, int i3);

    private static native void jniSetSessionConfigString(int i2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSetTelemetryConsent(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniStartPanZoomCorrection(long j2);

    private static native void jniStartService(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniStartVpn();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniStopPanZoomCorrection(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniStopVpn();

    private static native void jniSuspendMotdMessage(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniSyncInstallationId();

    private static native void jniTriggerViewRectUpdate();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniUpdateRoster(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniUpdateRosterItem(long j2, long j3, long j4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniUpdateRosterItemTags(long j2, long j3, byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniWolReconnect();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniWolWake();

    // -------------------------------------------------------------------------
    // DeskRT Capability Override (added by DeskRT codec integration)
    // Stores a capability bitmask applied at session negotiation time.
    // Bit 33 (0x0000000200000000) = lossless_codec (disables DCT quantization).
    // Call DeskRTCaptureBridge.getInstance().setLossless(true) to activate.
    // -------------------------------------------------------------------------
    private static volatile long sCapabilityOverride = 0L;

    public static void setCapabilityOverride(long capMask) {
        sCapabilityOverride = capMask;
    }

    public static long getCapabilityOverride() {
        return sCapabilityOverride;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    public static void k1(int i2, int i3) {
        h5 h5Var;
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null || (h5Var = mainApplicationV.w) == null) {
            return;
        }
        int i4 = 4;
        String strN1 = null;
        if (i2 == 1) {
            if (i3 == 32) {
                strN1 = n1("ad.account.er.invalid_login");
            } else if (i3 == 38) {
                strN1 = n1("ad.account.er.email.unverified");
            } else if (i3 == 36) {
                strN1 = n1("ad.account.er.license_conflict");
            } else if (i3 == 7) {
                strN1 = n1("ad.account.er.internal_error");
            } else if (i3 != 1) {
                strN1 = String.format(n1("ad.account.er.generic"), M2(i2, i3));
            }
        } else if (i2 != 0) {
            strN1 = String.format(n1("ad.account.er.generic"), M2(i2, i3));
        } else if (i3 == 2 || i3 == 4) {
            strN1 = n1("ad.account.er.timeout");
        } else if (i3 != 1) {
            strN1 = String.format(n1("ad.account.er.generic"), M2(i2, i3));
        }
        boolean z2 = strN1 == null || (i2 == 1 && i3 == 32);
        AnynetAccountInfo anynetAccountInfoJniAnynetAccountGetAccountInfo = jniAnynetAccountGetAccountInfo();
        if (z2) {
            h5Var.L(t01.e);
        }
        h5Var.J(strN1);
        h5Var.M(strN1 == null && anynetAccountInfoJniAnynetAccountGetAccountInfo.mStatus == g9.as_logged_in);
        h5Var.N(false);
        t70.V(new i7(i4));
        t70.V(new i7(6));
        if (anynetAccountInfoJniAnynetAccountGetAccountInfo.mStatus != g9.as_verification_pending) {
            t70.V(new i7(10));
        }
    }

    public static String k2(io ioVar) {
        byte[] bArrJniGetConfigString = jniGetConfigString(nd0.T(ioVar.c), q51.r(ioVar.d));
        if (bArrJniGetConfigString != null) {
            return nd0.t(bArrJniGetConfigString);
        }
        return null;
    }

    public static boolean k3() {
        return jniHasPwd();
    }

    public static void k4() {
        I0.post(new tb0(15));
    }

    public static void l1(zl0 zl0Var, boolean z2) {
        boolean zA = zl0Var.a();
        synchronized (x0) {
            if (!z2) {
                try {
                    zl0 zl0Var2 = (zl0) y0.get(Integer.valueOf(zl0Var.a));
                    if (zl0Var2 != null && zl0Var2.a() && TextUtils.equals(zl0Var2.d, zl0Var.d) && zl0Var2.j) {
                        zl0Var.j = true;
                        zA = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = y0;
            linkedHashMap.remove(Integer.valueOf(zl0Var.a));
            linkedHashMap.put(Integer.valueOf(zl0Var.a), zl0Var);
        }
        if (zA) {
            Q4(true);
        }
    }

    public static int l2() {
        return jniGetCurrentMonitor();
    }

    public static boolean l3() {
        return jniIs2faEnabled();
    }

    public static void l4() {
        jniRevokeTokens();
    }

    private static void launchHubActivityFromHub(Object obj, byte[] bArr) {
        t70.V(new c0(obj, 9, nd0.e(nd0.t(bArr))));
    }

    private static void launchMainActivityFromHub(final Object obj, byte[] bArr, final boolean z2) {
        final String strT = nd0.t(bArr);
        t70.V(new Runnable() { // from class: ja0
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap = JniAdExt.a;
                HubActivity hubActivity = (HubActivity) obj;
                hubActivity.getClass();
                Intent intent = new Intent(hubActivity, (Class<?>) MainActivity.class);
                intent.setFlags(268435456);
                String str = strT;
                if (!str.isEmpty()) {
                    intent.putExtra("cmd", z2 ? 2 : 1);
                    intent.putExtra("connect_addr", str);
                }
                hubActivity.startActivity(intent);
            }
        });
    }

    public static Bitmap loadBitmap(byte[] bArr) {
        return BitmapFactory.decodeFile(nd0.t(bArr));
    }

    public static void m1() {
        zg0 zg0Var = G0;
        synchronized (zg0Var) {
            int width = (int) (((Bitmap) zg0Var.g).getWidth() * zg0Var.f);
            int height = (int) (((Bitmap) zg0Var.g).getHeight() * zg0Var.f);
            if (width < 1) {
                width = 1;
            }
            if (height < 1) {
                height = 1;
            }
            zg0Var.h = Bitmap.createScaledBitmap((Bitmap) zg0Var.g, width, height, true);
        }
    }

    public static byte[] m2() {
        return jniGetCustomData(nd0.T("custom_logo"));
    }

    public static boolean m3() {
        MainApplication mainApplicationV = MainApplication.v();
        return (mainApplicationV == null || mainApplicationV.Q.isEmpty()) ? false : true;
    }

    public static void m4() {
        jniSafelyReleaseAllFrames();
    }

    private static void minimizeGlowActivity(Object obj) {
        t70.V(new ka0(0, obj));
    }

    public static String n1(String str) {
        Hashtable hashtable = p0;
        String str2 = (String) hashtable.get(str);
        if (str2 != null) {
            return str2;
        }
        byte[] bArrJniGetStringResource = jniGetStringResource(nd0.T(str));
        if (bArrJniGetStringResource == null) {
            return "";
        }
        String strT = nd0.t(bArrJniGetStringResource);
        hashtable.put(str, strT);
        return strT;
    }

    public static ArrayList n2() {
        ArrayList arrayList;
        synchronized (z0) {
            arrayList = new ArrayList(A0.values());
        }
        return arrayList;
    }

    public static boolean n3(String str) {
        if (str == null || str.length() > 1000) {
            return false;
        }
        String strReplace = str.replace("\\", "/");
        int iIndexOf = strReplace.indexOf(47);
        if (iIndexOf >= 0) {
            strReplace = strReplace.substring(0, iIndexOf);
        }
        return jniIsAddressValid(nd0.T(strReplace));
    }

    public static void n4(byte[] bArr) {
        jniSave2faKey(bArr);
    }

    private static void notifyImeSelectionChanged(Object obj, int i2, int i3) {
        t70.V(new ej(obj, i2, i3, 1));
    }

    private static void notifyImeTextChanged(Object obj, byte[] bArr) {
        t70.V(new c0(obj, 10, bArr));
    }

    public static String o1(String str) {
        Hashtable hashtable = q0;
        String str2 = (String) hashtable.get(str);
        if (str2 != null) {
            return str2;
        }
        byte[] bArrJniGetUrlResource = jniGetUrlResource(nd0.T(str));
        if (bArrJniGetUrlResource == null) {
            return "";
        }
        String strT = nd0.t(bArrJniGetUrlResource);
        hashtable.put(str, strT);
        return strT;
    }

    public static FileInfo o2(String str) {
        return jniGetFileInfo(nd0.T(str));
    }

    public static boolean o3() {
        return jniIsClipboardSplit();
    }

    public static void o4(String str, Bitmap bitmap) throws IOException {
        OutputStream fileOutputStream;
        if (!str.isEmpty()) {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
            fileOutputStream2.close();
            return;
        }
        Logging logging = b;
        String str2 = "anydesk_" + new SimpleDateFormat("yyyyMMdd-HHmmss-SSS").format(new Date()) + ".png";
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str2);
                contentValues.put("mime_type", "image/png");
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                ContentResolver contentResolver = d.getContentResolver();
                fileOutputStream = contentResolver.openOutputStream(contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
            } else {
                int i3 = MainApplication.p0;
                fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath(), str2));
            }
            if (fileOutputStream != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    if (i2 < 29) {
                        try {
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(Uri.fromFile(new File(str2)));
                            d.sendBroadcast(intent);
                        } catch (Throwable unused) {
                        }
                    }
                    t70.g0(d, n1("ad.msg.screenshot_saved.android"), 0);
                    logging.e("screenshot saved to ".concat(str2));
                    return;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            }
        } catch (Throwable unused2) {
        }
        t70.g0(d, n1("ad.msg.screenshot_failed.android"), 0);
        logging.a("failed to save screenshot to ".concat(str2));
    }

    public static void onActiveMonitorChanged(int i2) {
        I0.post(new cp(i2, 3));
    }

    public static void onAliasRegistered(boolean z2, byte[] bArr, byte[] bArr2) {
        I0.post(new ub0(z2, bArr, bArr2, 0));
    }

    public static void onAutoDiscoverItemConnected(int i2, int i3, long j2, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        I0.post(new zb0(i2, i3, j2, i4, bArr4, bArr, bArr2, bArr3));
    }

    public static void onAutoDiscoverItemDisconnected(long j2) {
    }

    public static void onConnectionEstablished(int i2, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z2, long j3) {
        I0.post(new qb0(i2, j2, bArr, bArr2, bArr3, bArr4, z2, j3));
    }

    public static void onDisconnect() {
        int i2 = MainApplication.v().n0;
        int i3 = 1;
        char c2 = 1;
        if (i2 == 2 || i2 == 4 || i2 == 5) {
            f2(true);
        }
        L0.a();
        zg0 zg0Var = G0;
        zg0Var.b = -1.0f;
        zg0Var.c = -1.0f;
        zg0Var.d = 0.0f;
        zg0Var.e = 0.0f;
        zg0Var.g = null;
        zg0Var.f = 1.0f;
        zg0Var.h = null;
        I0.post(new fb0(i3, c2 == true ? 1 : 0));
    }

    public static void onFileOffer(long j2) {
        I0.post(new va0(1, j2));
    }

    public static void onFileOfferBackend(int i2, long j2) {
        I0.post(new cp(j2, i2, 9));
    }

    public static void onFileProgress(int i2) {
        I0.post(new cp(i2, 8));
    }

    public static void onFileProgressBackend(int i2, long j2) {
        I0.post(new cp(j2, i2, 10));
    }

    public static boolean onIncomingConnection(int i2, long j2, byte[] bArr, byte[] bArr2, boolean z2, byte[] bArr3, byte[] bArr4, long j3, int i3, long j4) {
        if (!L1()) {
            return false;
        }
        t70.Y(new ib0(i2, j2, bArr, bArr2, z2, bArr3, bArr4, j3, i3, j4));
        return true;
    }

    public static void onIncomingConnectionClosed(int i2) {
        t70.V(new cp(i2, 6));
    }

    public static void onIncomingConnectionStart(int i2) {
        t70.V(new cp(i2, 5));
    }

    public static void onKeyboardHint(boolean z2, int i2, int i3) {
        I0.post(new fb0(i2, i3, z2));
    }

    public static void onLocalCursorChanged(float f2, float f3, float f4) {
        t70.V(new sb0(f2, f3, f4, 0));
    }

    public static void onMonitorInfoChanged(int i2, int i3, int i4) {
        I0.post(new gb0(i2, i3, i4, 0));
    }

    public static void onMotdCombined(int i2, boolean z2, long j2, long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i3, int i4, int i5, int i6) {
        I0.post(new yb0(i2, z2, j2, j3, bArr5, bArr, bArr2, bArr3, bArr4, bArr6, bArr7, i3, i4, i5, i6));
    }

    public static void onMotdExpired(int i2) {
        I0.post(new cp(i2, 12));
    }

    public static void onMotdImage(int i2, boolean z2, long j2, long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i3, int i4) {
        I0.post(new xb0(i2, z2, j2, j3, bArr5, bArr, bArr2, bArr3, bArr4, i3, i4));
    }

    public static void onMotdNotFound(int i2) {
        I0.post(new cp(i2, 13));
    }

    public static void onMotdText(int i2, boolean z2, long j2, long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, byte[] bArr6, int i5, int i6, int i7, int i8) {
        I0.post(new wb0(i2, z2, j2, j3, bArr, bArr2, bArr3, bArr4, i3, i4, bArr5, bArr6, i5, i6, i7, i8));
    }

    public static void onOnlineStatesChanged(long[] jArr, byte[] bArr) {
        I0.post(new d3(jArr, bArr, 20, false));
    }

    public static void onOutgoingDisconnectState() {
        I0.post(new i7(27));
    }

    public static void onOutgoingPermissionChanged(int i2, int i3) {
        du0 du0Var;
        du0[] du0VarArrValues = du0.values();
        int length = du0VarArrValues.length;
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                du0Var = null;
                break;
            }
            du0Var = du0VarArrValues[i4];
            if (du0Var.c == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (du0Var == null || du0Var == du0.pf_feature_count) {
            return;
        }
        I0.post(new d3(du0Var, new cu0(i3), 19, z2));
    }

    public static void onPlaybackInfo(int i2, long j2) {
        I0.post(new kb0(j2, i2, 1));
    }

    public static void onPrepareReconnect() {
        L0.a();
        zg0 zg0Var = G0;
        zg0Var.b = -1.0f;
        zg0Var.c = -1.0f;
        zg0Var.d = 0.0f;
        zg0Var.e = 0.0f;
        zg0Var.g = null;
        zg0Var.f = 1.0f;
        zg0Var.h = null;
        I0.post(new fb0(1, false));
    }

    public static void onPrivacyStatusChanged(boolean z2) {
        lp lpVar = MainApplication.v().r;
        synchronized (lpVar) {
            lpVar.z.i(Boolean.valueOf(z2));
        }
        t70.V(new fb0(4, z2));
    }

    public static void onProgramStateChanged(int i2, byte[] bArr) {
        I0.post(new hb0(i2, 0, bArr));
    }

    public static void onQueryAliasResult(boolean z2, byte[] bArr) {
        I0.post(new ap(z2, bArr));
    }

    public static void onReadyForOnlineStateRequests() {
        I0.post(new tb0(0));
    }

    public static void onRelayConnected() {
        I0.post(new i7(29));
    }

    public static void onRemoteCursorShapeChanged(byte[] bArr, int i2, int i3) {
        t70.V(new rb0(bArr, i2, i3));
    }

    public static void onScamWarning(int i2) {
        t70.V(new kb0(D2(), i2, 0));
    }

    public static void onTouchModeChanged(int i2) {
        I0.post(new cp(i2, 2));
    }

    public static void onUserInfoChanged() {
        I0.post(new i7(18));
    }

    public static void onVpnBytes(long j2, long j3) {
        jr0 jr0Var = L0;
        jr0Var.f += j2;
        jr0Var.g += j3;
        I0.post(new i7(21));
    }

    public static void onVpnIp(byte[] bArr, byte[] bArr2) {
        String strT = nd0.t(bArr);
        String strT2 = nd0.t(bArr2);
        jr0 jr0Var = L0;
        jr0Var.d = strT;
        jr0Var.e = strT2;
        I0.post(new d3(strT, strT2, 18, false));
    }

    public static void onVpnStatus(int i2, int i3, boolean z2) {
        jr0 jr0Var = L0;
        int i4 = jr0Var.a;
        int i5 = 0;
        if (i4 != 2 && i2 == 2) {
            t70.g0(d, n1("ad.msg.vpn.started.android"), 0);
        } else if (i4 == 2 && i2 != 2) {
            t70.g0(d, n1("ad.msg.vpn.stopped.android"), 0);
        }
        jr0Var.a = i2;
        jr0Var.b = i3;
        jr0Var.c = z2;
        I0.post(new jb0(i2, i3, i5, z2));
    }

    public static void onVpnStop() {
        I0.post(new i7(20));
    }

    public static void on_account_login(int i2, int i3) {
        I0.post(new mb0(i2, i3, 1));
    }

    public static void on_account_logout(int i2, int i3, byte[] bArr) {
        I0.post(new rb0(i2, i3, bArr));
    }

    public static void on_account_register(int i2, int i3) {
        I0.post(new mb0(i2, i3, 2));
    }

    public static void on_account_sso_auth_info(int i2, int i3, byte b2, byte[] bArr, byte[] bArr2) {
        I0.post(new cc0(i2, i3, b2, bArr, bArr2));
    }

    public static void on_account_user_action_oauth(byte[] bArr, byte[] bArr2) {
        I0.post(new vb0(bArr, bArr2, 1));
    }

    public static void on_account_user_action_otp() {
        I0.post(new tb0(8));
    }

    public static void on_feature_hub_changed(boolean z2) {
        t70.V(new ia0(2));
    }

    public static void on_license_changed() {
        I0.post(new i7(28));
    }

    public static void on_permission_profile_update() {
        I0.post(new tb0(9));
    }

    public static void on_register_license_result(int i2, int i3, boolean z2) {
        t70.V(new jb0(i2, i3, 1, z2));
    }

    public static void on_server_time_received(long j2) {
        I0.post(new va0(2, j2));
    }

    public static void on_thumbnail_updated(long j2, byte[] bArr, byte[] bArr2) {
        I0.post(new za0(j2, bArr, bArr2));
    }

    public static void on_view_rect_changed(int i2, int i3, int i4, int i5) {
        I0.post(new tb0(1));
    }

    private static void openSupportFragment() {
        t70.V(new ia0(1));
    }

    public static void p1(bd0 bd0Var) {
        boolean zContains;
        synchronized (t0) {
            try {
                zd zdVar = K;
                synchronized (zdVar) {
                    zContains = zdVar.contains(bd0Var);
                    zdVar.add(bd0Var);
                }
                if (!zContains) {
                    i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U1();
    }

    public static String p2(long j2) {
        return nd0.t(jniGetFileSizeString(j2));
    }

    public static boolean p3(io ioVar) {
        return jniIsConfigOverridden(nd0.T(ioVar.c));
    }

    public static void p4(t01 t01Var) {
        byte[] bArrC = nd0.c(t01Var.c);
        t01Var.b();
        jniSavePwd(bArrC);
        t70.a0(bArrC);
        T1();
    }

    private static void postChoreographerFrameCallback_pre24(Object obj, int i2) {
        t70.V(new ha0(obj, i2, 0));
    }

    public static void prepareVpn(int i2) {
        I0.post(new cp(i2, 4));
    }

    public static void q1(wc0 wc0Var) {
        zd zdVar = W;
        synchronized (zdVar) {
            try {
                I0.removeMessages(q51.d(11));
                zdVar.add(wc0Var);
                if (D0) {
                    I0.post(new sc0(3));
                    D0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int q2() {
        byte bJniGetLicenseBannerType = jniGetLicenseBannerType();
        int[] iArrS = q51.s(4);
        int length = iArrS.length;
        int i2 = 0;
        while (true) {
            byte b2 = 1;
            if (i2 >= length) {
                return 1;
            }
            int i3 = iArrS[i2];
            if (i3 == 1) {
                b2 = 0;
            } else if (i3 != 2) {
                b2 = 3;
                if (i3 == 3) {
                    b2 = 2;
                } else if (i3 != 4) {
                    throw null;
                }
            }
            if (b2 == bJniGetLicenseBannerType) {
                return i3;
            }
            i2++;
        }
    }

    public static boolean q3() {
        return jniIsFreeLicense();
    }

    public static int q4(String str, t01 t01Var) {
        byte[] bArrC = nd0.c(t01Var.c);
        t01Var.b();
        int iJniSavePwdForProfile = jniSavePwdForProfile(nd0.T(str), bArrC);
        t70.a0(bArrC);
        for (int i2 : q51.s(5)) {
            if (q51.r(i2) == iJniSavePwdForProfile) {
                return i2;
            }
        }
        return 2;
    }

    public static void r1(xc0 xc0Var) {
        zd zdVar = X;
        synchronized (zdVar) {
            zdVar.add(xc0Var);
        }
    }

    public static String r2(int i2) {
        String str;
        switch (i2) {
            case 1:
                str = "ad.license.feature.privacy.disallowed_str";
                break;
            case 2:
                str = "ad.license.feature.remote_restart.disallowed_str";
                break;
            case 3:
                str = "ad.license.feature.alias.disallowed_str";
                break;
            case 4:
                str = "ad.license.feature.invitation.disallowed_str";
                break;
            case 5:
                str = "ad.license.feature.file_manager.disallowed_str";
                break;
            case 6:
                str = "ad.license.feature.chat.disallowed_str";
                break;
            case 7:
                str = "ad.license.feature.individual_session_settings.disallowed_str";
                break;
            case 8:
                str = "ad.license.info.amount_of_custom_perm_profiles.disallowed_str";
                break;
            case 9:
                str = "ad.license.feature.session_recording.disallowed_str";
                break;
            default:
                throw null;
        }
        byte[] bArrJniGetLicenseConfigDisallowedString = jniGetLicenseConfigDisallowedString(nd0.T(str));
        if (bArrJniGetLicenseConfigDisallowedString != null) {
            return nd0.t(bArrJniGetLicenseConfigDisallowedString);
        }
        return null;
    }

    public static boolean r3(String str) {
        return jniIsIpAddress(nd0.T(str));
    }

    public static int r4(String str, t01 t01Var, t01 t01Var2) {
        byte[] bArrC = nd0.c(t01Var.c);
        t01Var.b();
        byte[] bArrC2 = nd0.c(t01Var2.c);
        t01Var2.b();
        int iJniSavePwdHashForProfile = jniSavePwdHashForProfile(nd0.T(str), bArrC, bArrC2);
        t70.a0(bArrC);
        t70.a0(bArrC2);
        for (int i2 : q51.s(5)) {
            if (q51.r(i2) == iJniSavePwdHashForProfile) {
                return i2;
            }
        }
        return 2;
    }

    private static Object register_audio_device_callback_for_event_fd(int i2) {
        return nd0.B(d, i2);
    }

    public static void releaseFrame(int i2) {
        n9 n9Var;
        mj mjVar = F;
        if (mjVar == null || (n9Var = mjVar.l) == null) {
            return;
        }
        n9Var.c(i2);
    }

    public static void release_keys() {
        dj djVar;
        if (X1() && (djVar = N) != null) {
            djVar.t();
        }
    }

    public static void reportNetworkInfo(int i2, boolean z2, int i3, byte[] bArr, int i4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12) {
        int i5;
        String[] strArrE = nd0.e(nd0.t(bArr5));
        String[] strArrE2 = nd0.e(nd0.t(bArr6));
        int i6 = 0;
        xd xdVar = new xd(0);
        for (int i7 = 0; i7 < strArrE.length; i7++) {
            xdVar.put(strArrE[i7], strArrE2[i7]);
        }
        int[] iArrS = q51.s(5);
        int length = iArrS.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i5 = 4;
                break;
            }
            i5 = iArrS[i8];
            if (q51.r(i5) == i2) {
                break;
            } else {
                i8++;
            }
        }
        for (int i9 : q51.s(8)) {
            if (q51.r(i9) == i3) {
                t70.V(new bc0(i6, new sx0(i5, z2, i9, nd0.t(bArr), nd0.e(nd0.t(bArr2)), nd0.e(nd0.t(bArr3)), nd0.e(nd0.t(bArr4)), DesugarCollections.unmodifiableMap(xdVar), nd0.t(bArr7), nd0.t(bArr8), nd0.t(bArr9), nd0.t(bArr10), nd0.t(bArr11), nd0.t(bArr12))));
            }
        }
        i9 = 8;
        t70.V(new bc0(i6, new sx0(i5, z2, i9, nd0.t(bArr), nd0.e(nd0.t(bArr2)), nd0.e(nd0.t(bArr3)), nd0.e(nd0.t(bArr4)), DesugarCollections.unmodifiableMap(xdVar), nd0.t(bArr7), nd0.t(bArr8), nd0.t(bArr9), nd0.t(bArr10), nd0.t(bArr11), nd0.t(bArr12))));
    }

    public static void reportSystemInfo(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, int[] iArr, int[] iArr2, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[] bArr13, byte[] bArr14, byte[] bArr15, byte[] bArr16, byte[] bArr17, byte[] bArr18, byte[] bArr19, byte[] bArr20) {
        String[] strArrE = nd0.e(nd0.t(bArr9));
        n9[] n9VarArr = new n9[strArrE.length];
        for (int i3 = 0; i3 != strArrE.length; i3++) {
            n9VarArr[i3] = new n9(strArrE[i3], iArr[i3], iArr2[i3]);
        }
        String[] strArrE2 = nd0.e(nd0.t(bArr10));
        String[] strArrE3 = nd0.e(nd0.t(bArr11));
        String[] strArrE4 = nd0.e(nd0.t(bArr12));
        String[] strArrE5 = nd0.e(nd0.t(bArr13));
        String[] strArrE6 = nd0.e(nd0.t(bArr14));
        String[] strArrE7 = nd0.e(nd0.t(bArr15));
        String[] strArrE8 = nd0.e(nd0.t(bArr16));
        za1[] za1VarArr = new za1[strArrE2.length];
        for (int i4 = 0; i4 != strArrE2.length; i4++) {
            za1VarArr[i4] = new za1(strArrE2[i4], strArrE3[i4], strArrE4[i4], strArrE5[i4], strArrE6[i4], strArrE7[i4], strArrE8[i4]);
        }
        String[] strArrE9 = nd0.e(nd0.t(bArr17));
        String[] strArrE10 = nd0.e(nd0.t(bArr18));
        String[] strArrE11 = nd0.e(nd0.t(bArr19));
        String[] strArrE12 = nd0.e(nd0.t(bArr20));
        String strT = nd0.t(bArr);
        String strT2 = nd0.t(bArr2);
        String strT3 = nd0.t(bArr3);
        String strT4 = nd0.t(bArr4);
        String strT5 = nd0.t(bArr5);
        String strT6 = nd0.t(bArr6);
        String strT7 = nd0.t(bArr7);
        String strT8 = nd0.t(bArr8);
        lp lpVar = MainApplication.v().r;
        i81 i81Var = new i81(new j81(i2), n9VarArr, za1VarArr, strArrE9, strArrE10, strArrE11, strArrE12, strT, strT2, strT3, strT4, strT5, strT6, strT7, strT8);
        synchronized (lpVar) {
            lpVar.G.i(i81Var);
        }
    }

    private static void requestClipboardUrisAsTempFilePaths(Object obj) {
        t70.V(new ka0(4, obj));
    }

    public static void requestIncomingFileManagerSystemPermission() {
        t70.V(new ia0(4));
    }

    public static void requestStartAudioPlaybackCapture(final int i2, final int i3, final int i4, final int i5, final int i6) {
        I0.post(new Runnable() { // from class: ma0
            @Override // java.lang.Runnable
            public final void run() {
                int i7;
                MediaProjection mediaProjection;
                mj mjVar = JniAdExt.G;
                if (mjVar != null) {
                    int[] iArrS = q51.s(3);
                    int length = iArrS.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            i7 = 1;
                            break;
                        }
                        int i9 = iArrS[i8];
                        if (q51.r(i9) == i2) {
                            i7 = i9;
                            break;
                        }
                        i8++;
                    }
                    if (mjVar.n != null) {
                        mjVar.a.a("called onRequestStartAudioPlaybackCapture when already started");
                        return;
                    }
                    ff ffVar = new ff(i7, i3, i4, i5, i6);
                    mjVar.n = ffVar;
                    Context context = mjVar.y;
                    if (context == null || (mediaProjection = mjVar.w) == null) {
                        return;
                    }
                    ffVar.a(context, mediaProjection);
                }
            }
        });
    }

    public static void requestStopAudioPlaybackCapture() {
        I0.post(new ia0(6));
    }

    private static void request_camera_permission(Object obj) {
        t70.V(new ka0(1, obj));
    }

    private static void request_microphone_permission(Object obj) {
        t70.V(new ka0(3, obj));
    }

    public static void s1(cd0 cd0Var) {
        zd zdVar = q;
        synchronized (zdVar) {
            zdVar.add(cd0Var);
        }
    }

    public static int s2(int i2) {
        return jniGetLicenseConfigInt(nd0.T(q51.g(i2)));
    }

    public static boolean s3() {
        return jniIsMotionInputSupported();
    }

    public static void s4() {
        jniSaveTcpTunnelConfig();
    }

    public static void saveBitmapARGB8888(byte[] bArr, int[] iArr, int i2, int i3, int i4) throws IOException {
        o4(nd0.t(bArr), Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.ARGB_8888));
    }

    public static void saveBitmapRGB565(byte[] bArr, int[] iArr, int i2, int i3, int i4) throws IOException {
        o4(nd0.t(bArr), Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.RGB_565));
    }

    public static Bitmap scaleBitmapARGB8888(int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        if (i5 < 1 || i6 < 1) {
            return null;
        }
        return Bitmap.createScaledBitmap(Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.ARGB_8888), i5, i6, true);
    }

    public static Bitmap scaleBitmapRGB565(int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        if (i5 < 1 || i6 < 1) {
            return null;
        }
        return Bitmap.createScaledBitmap(Bitmap.createBitmap(iArr, 0, i4, i2, i3, Bitmap.Config.RGB_565), i5, i6, true);
    }

    public static void setClipboardTextUtf16Le(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_16LE);
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        t70.Y(new ua0(str, 6));
    }

    public static void setClipboardTextUtf8(byte[] bArr) {
        t70.Y(new ua0(nd0.t(bArr), 6));
    }

    private static void setGlowActivityFullscreen(Object obj, boolean z2) {
        t70.V(new fj(obj, 2, z2));
    }

    private static void setGlowSurfaceBounds(Object obj, int i2, int i3, int i4, int i5, int i6) {
        t70.V(new na0(obj, i2, i3, i4, i5, i6, 1));
    }

    private static void setGlowSurfaceMouseCapture(Object obj, int i2, boolean z2) {
        t70.V(new oa0(obj, i2, z2, 0));
    }

    private static void setGlowSurfaceVisibility(Object obj, int i2, boolean z2) {
        t70.V(new oa0(obj, i2, z2, 1));
    }

    public static int setupVpn(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        InetAddress byAddress;
        AdVpnService adVpnService = AdVpnService.e;
        if (adVpnService == null) {
            b.a("no VPN service running");
            return -1;
        }
        InetAddress byAddress2 = null;
        try {
            byAddress = InetAddress.getByAddress(bArr);
        } catch (Throwable unused) {
            byAddress = null;
        }
        try {
            InetAddress.getByAddress(bArr2);
        } catch (Throwable unused2) {
        }
        try {
            byAddress2 = InetAddress.getByAddress(bArr3);
        } catch (Throwable unused3) {
        }
        int iNumberOfLeadingZeros = 0;
        for (byte b2 : byAddress2.getAddress()) {
            iNumberOfLeadingZeros += Integer.numberOfLeadingZeros(~b2) - 24;
        }
        VpnService.Builder builder = new VpnService.Builder(adVpnService);
        builder.addAddress(byAddress, iNumberOfLeadingZeros);
        builder.addRoute(nd0.a(byAddress, byAddress2), iNumberOfLeadingZeros);
        builder.setSession(n1("ad.vpn.session.notification.android"));
        ParcelFileDescriptor parcelFileDescriptorEstablish = builder.establish();
        adVpnService.d = parcelFileDescriptorEstablish;
        return parcelFileDescriptorEstablish.getFd();
    }

    public static void showDialog(int i2, int i3, int i4) {
        t70.V(new gb0(i2, i3, i4, 1));
    }

    public static void showErrorDialog(int i2) {
        t70.V(new cp(i2, 7));
    }

    public static void showFileManagerDelConfirmDialog(int i2, int i3, int i4, byte[] bArr) {
        t70.V(new lb0(i2, i3, i4, bArr));
    }

    public static void showFileManagerDirConflictDialog(int i2, int i3, long j2, byte[] bArr, long j3, byte[] bArr2) {
        t70.V(new ob0(i2, i3, j2, bArr, j3, bArr2));
    }

    public static void showFileManagerFileConflictDialog(int i2, int i3, long j2, byte[] bArr, long j3, byte[] bArr2, long j4, long j5, byte[] bArr3) {
        t70.V(new pb0(i2, i3, j2, bArr, j3, bArr2, j4, j5, bArr3));
    }

    private static void showInputMethodEditor(final Object obj, final long j2) {
        t70.V(new Runnable() { // from class: sa0
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap = JniAdExt.a;
                ((GlowActivity) obj).k(new gw(j2));
            }
        });
    }

    public static void showPasswordDialog(boolean z2, int i2) {
        t70.V(new nb0(i2, 0, z2));
    }

    public static void showPointer(int i2, int i3, int i4, byte[] bArr, int i5) {
        I0.post(new lb0(i2, i3, i4, bArr, i5));
    }

    public static void showResolveTcpTunnelConflictsDialog() {
        t70.V(new i7(25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void showTerminalListDialog(byte[] bArr, int i2, byte[] bArr2) {
        t70.V(new c6((Object) new ArrayList(Arrays.asList(nd0.e(nd0.t(bArr)))), i2, (Cloneable) bArr2, 3));
    }

    public static void showTerminalStdDialog(int i2, byte[] bArr) {
        t70.V(new hb0(i2, 1, bArr));
    }

    public static void showTwoFactorAuthDialog() {
        t70.V(new i7(24));
    }

    public static void show_error_help(int i2, int i3) {
        t70.V(new mb0(i2, i3, 0));
    }

    public static void startCapture() {
        I0.post(new i7(23));
    }

    private static boolean startUrl(byte[] bArr) {
        String strT = nd0.t(bArr);
        if (!strT.startsWith("file://")) {
            return t70.R(d, strT, true) || t70.Q(d, strT, true);
        }
        Context context = d;
        Looper looper = t70.a;
        try {
            File file = new File(strT.replaceFirst("file://", ""));
            if (file.isDirectory()) {
                return false;
            }
            Uri uriD = t70.D(context, file);
            Intent intent = new Intent("android.intent.action.VIEW");
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strT));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "*/*";
            }
            intent.setDataAndType(uriD, mimeTypeFromExtension);
            intent.setFlags(268435457);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            t70.g0(context, String.format(n1("ad.menu.help.android.open_failed"), strT), 1);
            return false;
        }
    }

    public static void stopCapture() {
        MainApplication mainApplication = E;
        if (mainApplication != null) {
            mj mjVar = mainApplication.g;
            mjVar.i(4);
            s7 s7Var = mjVar.v;
            if (s7Var != null) {
                s7Var.post(new ij(mjVar, 2));
            } else {
                mjVar.a.h("cannot stop projection");
            }
        }
    }

    public static void t1(FileManagerFileListFragment fileManagerFileListFragment) {
        zd zdVar = f0;
        synchronized (zdVar) {
            zdVar.add(fileManagerFileListFragment);
        }
    }

    public static String t2(int i2) {
        byte[] bArrJniGetLicenseConfigString = jniGetLicenseConfigString(nd0.T(q51.g(i2)));
        if (bArrJniGetLicenseConfigString != null) {
            return nd0.t(bArrJniGetLicenseConfigString);
        }
        return null;
    }

    public static boolean t3(char[] cArr) {
        byte[] bArrC = nd0.c(cArr);
        boolean zJniIsNaiveEmailAddress = jniIsNaiveEmailAddress(bArrC);
        t70.a0(bArrC);
        return zJniIsNaiveEmailAddress;
    }

    public static void t4(long j2) {
        jniSelectRosterId(j2);
    }

    public static void u1(x00 x00Var, mz mzVar) {
        x00Var.b(mzVar);
        x00Var.z(1, mzVar.a);
        zd zdVar = f0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                    if (fileManagerFileListFragment != null) {
                        t70.Y(new b00(fileManagerFileListFragment, mzVar.a, 3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String u2() {
        byte[] bArrJniGetLicenseName = jniGetLicenseName();
        return bArrJniGetLicenseName != null ? nd0.t(bArrJniGetLicenseName) : "";
    }

    public static boolean u3() {
        return jniIsPrivacySupported();
    }

    public static void u4(RosterItem rosterItem) {
        RosterItem rosterItemA;
        synchronized (E0) {
            if (rosterItem == null) {
                rosterItemA = null;
            } else {
                rosterItemA = rosterItem.a(rosterItem.mUserDefinedName, rosterItem.mThumbnailPath, rosterItem.b, rosterItem.mOnlineState);
            }
            F0 = rosterItemA;
        }
        zd zdVar = W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.k();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void unregister_audio_device_callback(Object obj) {
        nd0.W(d, obj);
    }

    public static void updateCipherInfo(byte[] bArr, byte[] bArr2) {
        String strT = nd0.t(bArr);
        String strT2 = nd0.t(bArr2);
        lp lpVar = MainApplication.v().r;
        zl zlVar = new zl(strT, strT2);
        synchronized (lpVar) {
            lpVar.w.i(zlVar);
        }
    }

    public static void updateHddBusyStatus(boolean z2) {
        lp lpVar = MainApplication.v().r;
        synchronized (lpVar) {
            lpVar.B.i(Boolean.valueOf(z2));
        }
    }

    public static void updateLicenseBannerCountdown(int i2) {
        t70.Y(new cp(i2, 11));
    }

    public static void updateNetworkBusyStatus(boolean z2) {
        lp lpVar = MainApplication.v().r;
        synchronized (lpVar) {
            lpVar.A.i(Boolean.valueOf(z2));
        }
    }

    public static void updateSessionStatus(int i2, int i3) {
        int i4;
        int[] iArrS = q51.s(7);
        int length = iArrS.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i4 = 1;
                break;
            }
            i4 = iArrS[i5];
            if (q51.r(i4) == i2) {
                break;
            } else {
                i5++;
            }
        }
        for (kp kpVar : kp.values()) {
            if (kpVar.c == i3) {
                B0.i(new ir0(i4, kpVar));
            }
        }
        kpVar = kp.no_conn;
        B0.i(new ir0(i4, kpVar));
    }

    public static void updateSessionTime(byte[] bArr) {
        String strT = nd0.t(bArr);
        lp lpVar = MainApplication.v().r;
        synchronized (lpVar) {
            lpVar.v.i(strT);
        }
    }

    public static void v1(dd0 dd0Var) {
        zd zdVar = D;
        synchronized (zdVar) {
            zdVar.add(dd0Var);
        }
    }

    public static zg0 v2() {
        zg0 zg0VarC;
        zg0 zg0Var = G0;
        synchronized (zg0Var) {
            zg0VarC = zg0Var.c();
        }
        return zg0VarC;
    }

    public static boolean v3(t01 t01Var) {
        byte[] bArrC = nd0.c(t01Var.c);
        t01Var.b();
        boolean zJniIsProfileUsingPwd = jniIsProfileUsingPwd(bArrC);
        t70.a0(bArrC);
        return zJniIsProfileUsingPwd;
    }

    public static void v4() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        Context context = d;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        String string = null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null) {
            string = itemAt.coerceToText(context).toString();
        }
        if (string != null) {
            I0.post(new ua0(string, 12));
        }
    }

    public static void w1(MainApplication mainApplication) {
        zd zdVar = B;
        synchronized (zdVar) {
            zdVar.add(mainApplication);
        }
    }

    public static String w2() {
        byte[] bArrJniGetLogFilePath = jniGetLogFilePath();
        if (bArrJniGetLogFilePath != null) {
            return nd0.t(bArrJniGetLogFilePath);
        }
        return null;
    }

    public static boolean w3() {
        return jniIsRemoteRestartSupported();
    }

    public static void w4(b21 b21Var) {
        L = b21Var;
        if (b21Var != null) {
            jniTriggerViewRectUpdate();
        }
    }

    public static void x1(fd0 fd0Var) {
        zd zdVar = A;
        synchronized (zdVar) {
            zdVar.add(fd0Var);
        }
    }

    public static int x2() {
        return jniGetMonitorCount();
    }

    public static boolean x3() {
        return jniIsRemoteRestartWithCredentialsAvailable();
    }

    public static void x4(io ioVar, boolean z2) {
        jniSetConfigBool(nd0.T(ioVar.c), z2, q51.r(ioVar.d));
    }

    public static void y1(MainApplication mainApplication) {
        zd zdVar = C;
        synchronized (zdVar) {
            zdVar.add(mainApplication);
        }
    }

    public static ArrayList y2() {
        ArrayList arrayList;
        synchronized (x0) {
            try {
                arrayList = new ArrayList();
                for (zl0 zl0Var : y0.values()) {
                    if (zl0Var.a == 100) {
                        arrayList.add(zl0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public static boolean y3() {
        return jniIsRequestElevationSupported();
    }

    public static void y4(io ioVar, int i2) {
        jniSetConfigInt(nd0.T(ioVar.c), i2, q51.r(ioVar.d));
        if (ioVar == io.KEY_INTERACTIVE_ACCESS) {
            T1();
        }
    }

    public static void z1(hd0 hd0Var) {
        zd zdVar = c0;
        synchronized (zdVar) {
            zdVar.add(hd0Var);
        }
    }

    public static ArrayList z2() {
        ArrayList arrayList;
        synchronized (x0) {
            try {
                arrayList = new ArrayList();
                for (zl0 zl0Var : y0.values()) {
                    if (zl0Var.a == 101) {
                        arrayList.add(zl0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public static boolean z3() {
        return jniIsRequestElevationWithCredentialsSupported();
    }

    public static void z4(io ioVar, String str) {
        jniSetConfigIpString(nd0.T(ioVar.c), nd0.T(str), q51.r(ioVar.d));
    }
}
