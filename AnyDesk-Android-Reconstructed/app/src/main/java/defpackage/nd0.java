package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class nd0 {
    public static y6 c;
    public static final Logging a = new Logging("JniHelper");
    public static final char[] b = new char[0];
    public static final String[] d = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] e = {"android.permission.ACCESS_LOCAL_NETWORK"};

    public static String A(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static ef B(Context context, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        try {
            ef efVar = new ef(i);
            ((AudioManager) context.getSystemService("audio")).registerAudioDeviceCallback(efVar, null);
            return efVar;
        } catch (IOException e2) {
            new Logging("AudioDeviceHelper").b("error when registering device callback for event fd", e2);
            return null;
        }
    }

    public static void C(qa qaVar, String[] strArr, int i) {
        qaVar.requestPermissions(strArr, i);
    }

    public static void D(ad adVar, int i) {
        adVar.setBreakStrategy(i);
    }

    public static void E(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void F(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void G(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            d6.B(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void H(ad adVar, int i) {
        adVar.setHyphenationFrequency(i);
    }

    public static void I(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static void J(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static boolean K(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static void L(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void M(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void N(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void O(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void P(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static boolean Q(qa qaVar, String str) {
        return qaVar.shouldShowRequestPermissionRationale(str);
    }

    public static boolean R(qa qaVar, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(qaVar.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return qaVar.shouldShowRequestPermissionRationale(str);
        }
    }

    public static boolean S(qa qaVar, String str) {
        return qaVar.shouldShowRequestPermissionRationale(str);
    }

    public static byte[] T(String str) {
        if (str == null) {
            return null;
        }
        return str.concat("\u0000").getBytes(StandardCharsets.UTF_8);
    }

    public static Icon U(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        int i;
        InputStream inputStreamOpenInputStream;
        int i2 = iconCompat.a;
        String strL = null;
        switch (i2) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                id.q("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.b;
                    if (i >= 28) {
                        strL = d6.l(obj);
                    } else {
                        try {
                            strL = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        id.l(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.j;
                    strL = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strL, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                int i3 = Build.VERSION.SDK_INT;
                Object obj2 = iconCompat.b;
                iconCreateWithBitmap = i3 < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) obj2, false)) : hb.b((Bitmap) obj2);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = r3.f(iconCompat.e());
                } else {
                    if (context == null) {
                        id.f(iconCompat.e(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriE = iconCompat.e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriE, e5);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException e6) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriE, e6);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        id.u(iconCompat.e(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = hb.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static void V(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }

    public static void W(Context context, Object obj) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        ((AudioManager) context.getSystemService("audio")).unregisterAudioDeviceCallback((AudioDeviceCallback) obj);
    }

    public static ActionMode.Callback X(ActionMode.Callback callback) {
        return (!(callback instanceof u91) || Build.VERSION.SDK_INT < 26) ? callback : ((u91) callback).a;
    }

    public static ActionMode.Callback Y(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof u91) || callback == null) ? callback : new u91(callback, textView);
    }

    public static InetAddress a(InetAddress inetAddress, InetAddress inetAddress2) {
        byte[] address = inetAddress.getAddress();
        byte[] address2 = inetAddress2.getAddress();
        if (address.length != address2.length) {
            return null;
        }
        int length = address.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) (address[i] & address2[i]);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(Activity activity) {
        if (Build.VERSION.SDK_INT < 33) {
            return new fq0(activity).a();
        }
        return new fq0(activity).a() && r3.c(activity, d);
    }

    public static byte[] c(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.encode(CharBuffer.wrap(cArr));
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        byte[] bArr = new byte[iLimit + 1];
        System.arraycopy(byteBufferEncode.array(), byteBufferEncode.position(), bArr, 0, iLimit);
        Arrays.fill(byteBufferEncode.array(), (byte) 0);
        bArr[iLimit] = 0;
        return bArr;
    }

    public static Notification.Action.Builder d(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static String[] e(String str) {
        if (str.isEmpty()) {
            return new String[0];
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit == null) {
            return new String[0];
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = t(hq.y(strArrSplit[i]));
        }
        return strArrSplit;
    }

    public static String f(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            byte[] bArrT = T(str);
            char[] cArr = new char[bArrT.length * 2];
            for (int i = 0; i < bArrT.length; i++) {
                byte b2 = bArrT[i];
                int i2 = i * 2;
                char[] cArr2 = hq.o;
                cArr[i2] = cArr2[(b2 & 255) >>> 4];
                cArr[i2 + 1] = cArr2[b2 & 15];
            }
            sb.append(new String(cArr));
        }
        return sb.toString();
    }

    public static Drawable g(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static int h(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList i(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }

    public static int j(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Uri k(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    public static int l(qa qaVar, gq0 gq0Var) {
        Boolean bool = Boolean.FALSE;
        if (bool.equals(s(qaVar, a41.g))) {
            return 3;
        }
        Boolean boolQ = q(a41.j);
        Boolean boolQ2 = q(a41.o);
        Boolean boolS = s(qaVar, a41.r);
        Boolean boolS2 = s(qaVar, a41.u);
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(boolQ) && bool.equals(boolS) && bool2.equals(boolQ2)) {
            return 2;
        }
        if (bool.equals(boolQ) && bool2.equals(boolS) && bool2.equals(boolS2)) {
            return 2;
        }
        if (bool.equals(boolQ) || bool.equals(boolQ2) || bool.equals(boolS) || bool.equals(boolS2)) {
            return 3;
        }
        return (bool.equals(s(qaVar, a41.h)) || bool.equals(s(qaVar, a41.c)) || bool.equals(r(qaVar, gq0Var, a41.d)) || bool.equals(r(qaVar, gq0Var, a41.e)) || bool.equals(r(qaVar, gq0Var, a41.f)) || bool.equals(q(a41.i)) || bool.equals(q(a41.p)) || bool.equals(s(qaVar, a41.v)) || bool.equals(s(qaVar, a41.w)) || bool.equals(s(qaVar, a41.x))) ? 2 : 1;
    }

    public static Object m(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static xu0 n(ad adVar) {
        int breakStrategy;
        int hyphenationFrequency;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new xu0(d6.r(adVar));
        }
        TextPaint textPaint = new TextPaint(adVar.getPaint());
        if (i >= 23) {
            breakStrategy = 1;
            hyphenationFrequency = 1;
        } else {
            breakStrategy = 0;
            hyphenationFrequency = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i >= 23) {
            breakStrategy = adVar.getBreakStrategy();
            hyphenationFrequency = adVar.getHyphenationFrequency();
        }
        if (adVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (adVar.getInputType() & 15) != 3) {
            boolean z = adVar.getLayoutDirection() == 1;
            switch (adVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(d6.i(jf.g(adVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new xu0(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static byte[] o(Context context) {
        ProxyInfo defaultProxy;
        String str = "";
        if (Build.VERSION.SDK_INT >= 23) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (defaultProxy = connectivityManager.getDefaultProxy()) != null) {
                String host = defaultProxy.getHost();
                int port = defaultProxy.getPort();
                if (host != null) {
                    str = host + ":" + port;
                }
            }
        } else {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property != null) {
                if (property2 != null) {
                    str = property + ":" + property2;
                } else {
                    str = property;
                }
            }
        }
        return T(str);
    }

    public static boolean p(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean q(a41 a41Var) {
        j11 j11VarL;
        j11 j11VarL2;
        j11 j11VarH;
        MainApplication mainApplicationV = MainApplication.v();
        k11 k11VarA = tq.a();
        int iOrdinal = a41Var.ordinal();
        a41 a41Var2 = a41.l;
        boolean z = false;
        switch (iOrdinal) {
            case 6:
                if (t70.H() && mainApplicationV != null) {
                    return Boolean.valueOf(!t70.G(mainApplicationV.getApplicationContext(), mainApplicationV.getPackageName()));
                }
                return null;
            case 7:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null) {
                    return Boolean.valueOf(!w(k11VarA));
                }
                return null;
            case 8:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA)) {
                    v(k11VarA);
                    return true;
                }
                return null;
            case 9:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA)) {
                    return Boolean.valueOf(!mainApplicationV.S.p());
                }
                return null;
            case 10:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA)) {
                    MainApplication mainApplicationV2 = MainApplication.v();
                    if (mainApplicationV2 != null && (j11VarL = mainApplicationV2.S.l()) != null && k11VarA.a().equals(j11VarL.a())) {
                        z = true;
                    }
                    return Boolean.valueOf(!z);
                }
                return null;
            case 11:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null) {
                    MainApplication mainApplicationV3 = MainApplication.v();
                    if (mainApplicationV3 == null) {
                        a41Var2 = null;
                    } else {
                        v(k11VarA);
                        if (!mainApplicationV3.S.p()) {
                            a41Var2 = a41.n;
                        }
                    }
                    return Boolean.valueOf(a41Var2 == a41Var);
                }
                return null;
            case 12:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA)) {
                    MainApplication mainApplicationV4 = MainApplication.v();
                    if (mainApplicationV4 == null) {
                        a41Var2 = null;
                    } else {
                        v(k11VarA);
                        if (!mainApplicationV4.S.p()) {
                            MainApplication mainApplicationV5 = MainApplication.v();
                            a41Var2 = (mainApplicationV5 == null || (j11VarL2 = mainApplicationV5.S.l()) == null || !k11VarA.a().equals(j11VarL2.a())) ? a41.o : a41.m;
                        }
                    }
                    return Boolean.valueOf(a41Var2 == a41Var);
                }
                return null;
            case 13:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA) && t70.H()) {
                    MainApplication mainApplicationV6 = MainApplication.v();
                    if (mainApplicationV6 != null && (j11VarH = mainApplicationV6.S.h()) != null && k11VarA.a().equals(j11VarH.a())) {
                        z = true;
                    }
                    return Boolean.valueOf(!z);
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                if (JniAdExt.L1() && k11VarA != null && mainApplicationV != null && !w(k11VarA)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public static Boolean r(Activity activity, gq0 gq0Var, a41 a41Var) {
        int iOrdinal = a41Var.ordinal();
        boolean z = false;
        if (iOrdinal == 1) {
            if (!t70.a()) {
                return null;
            }
            if (b(activity) && gq0Var != null && !gq0Var.i("anydesk")) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (iOrdinal == 2) {
            if (!t70.a()) {
                return null;
            }
            if (b(activity) && gq0Var != null && !gq0Var.i("anydesk_headsup")) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (iOrdinal != 3 || !t70.a()) {
            return null;
        }
        if (b(activity) && gq0Var != null && !gq0Var.i("anydesk_chat")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean s(Activity activity, a41 a41Var) {
        j11 j11VarO;
        j11 j11VarO2;
        j11 j11VarI;
        MainApplication mainApplicationV = MainApplication.v();
        j11 j11VarB = tq.b(activity.getApplicationContext().getPackageManager());
        int iOrdinal = a41Var.ordinal();
        if (iOrdinal == 0) {
            return Boolean.valueOf(new fq0(activity).a());
        }
        if (iOrdinal == 4) {
            return Boolean.valueOf(r3.d(activity));
        }
        boolean z = false;
        if (iOrdinal == 5) {
            return Boolean.valueOf(!t70.K() || r3.c(activity, e));
        }
        a41 a41Var2 = null;
        switch (iOrdinal) {
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                if (JniAdExt.L1() && j11VarB != null && mainApplicationV != null) {
                    return Boolean.valueOf(!x(j11VarB));
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                if (JniAdExt.L1() && j11VarB != null && mainApplicationV != null && !x(j11VarB)) {
                    MainApplication mainApplicationV2 = MainApplication.v();
                    if (mainApplicationV2 != null) {
                        mainApplicationV2.S.m();
                    }
                    return true;
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                if (JniAdExt.L1() && j11VarB != null && mainApplicationV != null && !x(j11VarB)) {
                    MainApplication mainApplicationV3 = MainApplication.v();
                    if (mainApplicationV3 != null && (j11VarO = mainApplicationV3.S.o()) != null && j11VarB.a().equals(j11VarO.a())) {
                        z = true;
                    }
                    return Boolean.valueOf(!z);
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                if (JniAdExt.L1() && j11VarB != null && mainApplicationV != null && !x(j11VarB)) {
                    if (MainApplication.v() != null) {
                        MainApplication mainApplicationV4 = MainApplication.v();
                        if (mainApplicationV4 != null) {
                            mainApplicationV4.S.m();
                        }
                        MainApplication mainApplicationV5 = MainApplication.v();
                        a41Var2 = (mainApplicationV5 == null || (j11VarO2 = mainApplicationV5.S.o()) == null || !j11VarB.a().equals(j11VarO2.a())) ? a41.u : a41.t;
                    }
                    return Boolean.valueOf(a41Var2 == a41Var);
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                if (JniAdExt.L1() && j11VarB != null && mainApplicationV != null && !x(j11VarB) && t70.H()) {
                    MainApplication mainApplicationV6 = MainApplication.v();
                    if (mainApplicationV6 != null && (j11VarI = mainApplicationV6.S.i()) != null && j11VarB.a().equals(j11VarI.a())) {
                        z = true;
                    }
                    return Boolean.valueOf(!z);
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                if (JniAdExt.L1()) {
                    Looper looper = t70.a;
                    if (Build.VERSION.SDK_INT < 23) {
                        return null;
                    }
                    return Boolean.valueOf(Settings.canDrawOverlays(activity));
                }
                return null;
            case 21:
                if (JniAdExt.L1()) {
                    io ioVar = io.KEY_AUDIO_TRANSMIT_MODE;
                    if (JniAdExt.p3(ioVar) && JniAdExt.h2(ioVar) == 0) {
                        return null;
                    }
                    return Boolean.valueOf(r3.c(activity, new String[]{"android.permission.RECORD_AUDIO"}));
                }
                return null;
            default:
                return null;
        }
    }

    public static String t(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        return str.length() > 0 ? str.substring(0, str.length() - 1) : str;
    }

    public static ActivityOptions u() {
        return ActivityOptions.makeBasic();
    }

    public static boolean v(k11 k11Var) {
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null) {
            return false;
        }
        mainApplicationV.S.j();
        return false;
    }

    public static boolean w(k11 k11Var) {
        j11 j11VarK;
        MainApplication mainApplicationV = MainApplication.v();
        return (mainApplicationV == null || (j11VarK = mainApplicationV.S.k()) == null || !k11Var.a().equals(j11VarK.a())) ? false : true;
    }

    public static boolean x(j11 j11Var) {
        j11 j11VarN;
        MainApplication mainApplicationV = MainApplication.v();
        return (mainApplicationV == null || (j11VarN = mainApplicationV.S.n()) == null || !j11Var.a().equals(j11VarN.a())) ? false : true;
    }

    public static InetAddress y(int i, boolean z) {
        byte[] bArr = new byte[z ? 16 : 4];
        int i2 = i / 8;
        for (int i3 = 0; i3 != i2; i3++) {
            bArr[i3] = -1;
        }
        int i4 = i % 8;
        if (i4 != 0) {
            bArr[i2] = (byte) (255 << (8 - i4));
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int z(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}
