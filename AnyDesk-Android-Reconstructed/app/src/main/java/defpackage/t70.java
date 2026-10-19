package defpackage;

import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.TransactionTooLargeException;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.anydesk.anydeskandroid.AdStorageProviderDownloads;
import com.anydesk.anydeskandroid.AdStorageProviderRecordings;
import com.anydesk.anydeskandroid.AdVpnService;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class t70 {
    public static final Looper a;
    public static final Handler b;
    public static final Pattern c;

    static {
        Looper mainLooper = Looper.getMainLooper();
        a = mainLooper;
        mainLooper.getThread();
        b = new Handler(mainLooper);
        c = Pattern.compile("\\d+");
    }

    public static Serializable A(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, cls) : bundle.getSerializable(str);
    }

    public static String B() {
        StringBuilder sb = new StringBuilder();
        for (String str : Build.SUPPORTED_32_BIT_ABIS) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String C() {
        StringBuilder sb = new StringBuilder();
        for (String str : Build.SUPPORTED_64_BIT_ABIS) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static Uri D(Context context, File file) {
        File absoluteFile;
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (Throwable unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        String absolutePath = absoluteFile.getAbsolutePath();
        if (Build.VERSION.SDK_INT >= 24 && absolutePath.startsWith("/data/user_de")) {
            context = context.createDeviceProtectedStorageContext();
        }
        y00 y00VarC = FileProvider.c(context, context.getPackageName() + ".fileprovider", 0);
        try {
            String canonicalPath = absoluteFile.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : y00VarC.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                id.p(canonicalPath, "Failed to find configured root that contains ");
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(y00VarC.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused2) {
            id.p(absoluteFile, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public static Bitmap E(Context context, byte[] bArr, boolean z, boolean z2, Logging logging) {
        Bitmap bitmapI0;
        Rect rect;
        Bitmap bitmapCreateBitmap = null;
        if (!z || bArr == null) {
            bitmapI0 = null;
        } else {
            try {
                bitmapI0 = JniAdExt.decodeBitmap(bArr);
            } catch (IOException e) {
                logging.h("cannot decode user image: " + e.getMessage());
                bitmapI0 = null;
            }
        }
        if (bitmapI0 == null) {
            bitmapI0 = i0(context, R.drawable.unknown_user);
        }
        if (!z2) {
            return bitmapI0;
        }
        if (bitmapI0 != null) {
            int width = bitmapI0.getWidth();
            int height = bitmapI0.getHeight();
            int iMin = Math.min(width, height);
            bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float f = iMin / 2;
            canvas.drawCircle(f, f, f, paint);
            Rect rect2 = new Rect(0, 0, iMin, iMin);
            if (width > height) {
                int i = (width - height) / 2;
                rect = new Rect(i, 0, i + height, height);
            } else {
                int i2 = (height - width) / 2;
                rect = new Rect(0, i2, width, i2 + width);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapI0, rect, rect2, paint);
            bitmapI0.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Spanned F(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    public static boolean G(Context context, String str) {
        PowerManager powerManager;
        if (H() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
            return !powerManager.isIgnoringBatteryOptimizations(str);
        }
        return false;
    }

    public static boolean H() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean I() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean J(char[] cArr, boolean z) {
        if (cArr == null || cArr.length == 0) {
            return false;
        }
        if (z) {
            return JniAdExt.t3(cArr);
        }
        return Patterns.EMAIL_ADDRESS.matcher(CharBuffer.wrap(cArr)).matches();
    }

    public static boolean K() {
        return Build.VERSION.SDK_INT >= 37;
    }

    public static boolean L(PackageManager packageManager, String str) {
        return v(packageManager, str) >= 0;
    }

    public static GradientDrawable M(int i, int i2) {
        return new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, i2});
    }

    public static String N(String str) {
        String[] strArrSplit;
        if (str == null || (strArrSplit = str.split(File.separator)) == null || strArrSplit.length < 1) {
            return null;
        }
        String strReplaceAll = strArrSplit[strArrSplit.length - 1].replaceAll("[ \\(\\)]", "_").replaceAll("[^A-Za-z0-9_\\-.]", "").replaceAll("[.]+", ".");
        if (strReplaceAll.isEmpty()) {
            return null;
        }
        return strReplaceAll;
    }

    public static String O(long j) {
        long j2 = (j / 1000) % 60;
        long j3 = (j / 60000) % 60;
        return (((("" + (j / 3600000)).concat(":") + (j3 / 10)) + (j3 % 10)).concat(":") + (j2 / 10)) + (j2 % 10);
    }

    public static void P(Context context, Logging logging) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.anydesk.adcontrol.ad1", "com.anydesk.adcontrol.gui.activity.AdControlActivity"));
            context.startActivity(intent);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("unable to start plugin activity: "), logging);
        }
    }

    public static boolean Q(Context context, String str, boolean z) {
        if (context != null && str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                if (d(context, intent)) {
                    context.startActivity(intent);
                    return true;
                }
            } catch (Throwable unused) {
            }
            if (z) {
                try {
                    Intent intent2 = new Intent(context, (Class<?>) WebViewActivity.class);
                    intent2.setFlags(268435456);
                    intent2.putExtra("param_url", str);
                    context.startActivity(intent2);
                    return true;
                } catch (Throwable unused2) {
                }
            }
            g0(context, String.format(JniAdExt.n1("ad.menu.help.android.open_failed"), str), 1);
        }
        return false;
    }

    public static boolean R(Context context, String str, boolean z) {
        if (context != null && str != null && o(context) != null) {
            try {
                bc bcVarN = n(context, z);
                Intent intent = (Intent) bcVarN.d;
                intent.addFlags(268435456);
                intent.setData(Uri.parse(str));
                context.startActivity(intent, (Bundle) bcVarN.e);
                return true;
            } catch (Throwable unused) {
                g0(context, String.format(JniAdExt.n1("ad.menu.help.android.open_failed"), str), 1);
            }
        }
        return false;
    }

    public static boolean S(Context context, String str, String str2, String str3, Logging logging) {
        Intent intent = new Intent(str, Uri.parse("package:" + str3));
        intent.addFlags(268435456);
        try {
            if (d(context, intent)) {
                context.startActivity(intent);
                return true;
            }
            if (logging != null) {
                logging.a("cannot open " + str + " settings for AnyDesk: no handler found");
            }
            Intent intent2 = new Intent(str2);
            intent2.addFlags(268435456);
            if (d(context, intent2)) {
                context.startActivity(intent2);
                return true;
            }
            if (logging == null) {
                return false;
            }
            logging.a("cannot open " + str2 + " settings: no handler found");
            return false;
        } catch (Throwable th) {
            if (logging == null) {
                return false;
            }
            q51.o(th, q51.n("cannot open ", str, " settings: "), logging);
            return false;
        }
    }

    public static boolean T(Context context, Logging logging, Intent intent) {
        try {
            if (d(context, intent)) {
                context.startActivity(intent);
                return true;
            }
            if (logging == null) {
                return false;
            }
            logging.a("cannot open settings: no handler found");
            return false;
        } catch (Throwable th) {
            if (logging == null) {
                return false;
            }
            q51.o(th, new StringBuilder("cannot open settings: "), logging);
            return false;
        }
    }

    public static void U(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("param_url", str);
            context.startActivity(intent);
        } catch (Throwable unused) {
            g0(context, String.format(JniAdExt.n1("ad.menu.help.android.open_failed"), str), 1);
        }
    }

    public static void V(Runnable runnable) {
        b.post(runnable);
    }

    public static List W(PackageManager packageManager, Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r8.mkdir() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean X(java.io.File r7, java.io.File r8, com.anydesk.jnilib.Logging r9) {
        /*
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L8
            goto L51
        L8:
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L52
            boolean r0 = r8.exists()
            if (r0 != 0) goto L1b
            boolean r0 = r8.mkdir()
            if (r0 != 0) goto L32
            goto L51
        L1b:
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L51
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r7.getName()
            r0.<init>(r8, r2)
            boolean r8 = r0.mkdir()
            if (r8 != 0) goto L31
            goto L51
        L31:
            r8 = r0
        L32:
            java.lang.String[] r0 = r7.list()
            r2 = 1
            if (r0 == 0) goto L50
            int r3 = r0.length
        L3a:
            if (r1 >= r3) goto L50
            r4 = r0[r1]
            java.io.File r5 = new java.io.File
            r5.<init>(r7, r4)
            java.io.File r6 = new java.io.File
            r6.<init>(r8, r4)
            boolean r4 = X(r5, r6, r9)
            r2 = r2 & r4
            int r1 = r1 + 1
            goto L3a
        L50:
            return r2
        L51:
            return r1
        L52:
            boolean r7 = i(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t70.X(java.io.File, java.io.File, com.anydesk.jnilib.Logging):boolean");
    }

    public static void Y(Runnable runnable) {
        if (Looper.myLooper() == a) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }

    public static void Z(Runnable runnable, long j) {
        b.postDelayed(runnable, j);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void a0(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    public static void b(Context context, Uri uri, boolean z, String str, gq0 gq0Var, String str2, lk0 lk0Var) {
        String path;
        Uri uri2;
        if (uri == null) {
            lk0.C(context, null);
            return;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (AdStorageProviderDownloads.e(context).equals(uri.getAuthority()) || AdStorageProviderRecordings.e(context).equals(uri.getAuthority())) {
                path = l(DocumentsContract.getDocumentId(uri));
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + strArrSplit[1];
                } else {
                    path = null;
                }
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                try {
                    path = l(p(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null));
                } catch (NumberFormatException unused) {
                    path = null;
                }
            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = strArrSplit2[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    uri2 = "audio".equals(str3) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null;
                }
                if (uri2 == null) {
                    path = null;
                } else {
                    path = l(p(context, uri2, "_id=?", new String[]{strArrSplit2[1]}));
                }
            } else {
                path = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            path = l(p(context, uri, null, null));
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            path = uri.getPath();
        } else {
            path = null;
        }
        if (path != null) {
            lk0Var.D(path, z);
            return;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                lk0.C(context, null);
            } else {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                int columnIndex2 = cursorQuery.getColumnIndex("_size");
                cursorQuery.moveToFirst();
                String strE = lk0Var.E(cursorQuery.getString(columnIndex));
                long j = cursorQuery.getLong(columnIndex2);
                cursorQuery.close();
                if (strE != null) {
                    str = strE;
                }
                File file = new File(MainApplication.y(context));
                file.mkdirs();
                File file2 = new File(file, str);
                file2.delete();
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    lk0.C(context, null);
                } else {
                    w81.b.a(new wq(inputStreamOpenInputStream, file2, new ah(lk0Var, gq0Var, str2, context), j));
                }
            }
        } catch (Throwable th) {
            lk0.C(context, th.getMessage());
        }
    }

    public static void b0(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).commit();
    }

    public static String c(long j, String str, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str.equals("-") ? "" : str;
        if (j == 0 && str2.isEmpty()) {
            z = false;
        }
        String str5 = "(" + y(str2, j, str3);
        if (!z) {
            str5 = str5 + ", " + JniAdExt.n1("ad.status.sess.remote.identity_not_verified");
        }
        String strConcat = str5.concat(")");
        if (str4.isEmpty()) {
            return strConcat;
        }
        return str4 + " " + strConcat;
    }

    public static void c0(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    public static boolean d(Context context, Intent intent) {
        return t(context, intent).size() > 0;
    }

    public static boolean d0(Context context, String str, String str2, Logging logging) {
        if (str2.isEmpty()) {
            return h(context, str, logging);
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
                return true;
            } catch (Throwable th) {
                if (logging != null) {
                    StringBuilder sbN = q51.n("cannot set clipboard data '", str, "': ");
                    sbN.append(th.getMessage());
                    logging.h(sbN.toString());
                }
                if (th instanceof TransactionTooLargeException) {
                    g0(context, JniAdExt.n1("ad.msg.clipboard.data_too_large"), 0);
                }
            }
        } else if (logging != null) {
            logging.h("cannot set clipboard data '" + str + "'");
            return false;
        }
        return false;
    }

    public static boolean e(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void e0(qa qaVar, String str, String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.SEND");
        String str3 = String.format(JniAdExt.n1("ad.abook.item.share.subject"), str);
        String str4 = String.format(z ? JniAdExt.n1("ad.share.addr.text.android") : JniAdExt.n1("ad.abook.item.share.text"), str2, JniAdExt.o1("ad.abook.item.share.href"));
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str4);
        intent.putExtra("android.intent.extra.SUBJECT", str3);
        try {
            Intent intentCreateChooser = Intent.createChooser(intent, str3);
            if (intentCreateChooser != null) {
                qaVar.startActivity(intentCreateChooser);
            } else {
                qaVar.startActivity(intent);
            }
        } catch (Throwable th) {
            g0(qaVar, th.getMessage(), 1);
        }
    }

    public static String f(long j) {
        String strG = g(j);
        int length = strG.length();
        int i = length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(strG.charAt(i2));
            if (i > 0 && i % 3 == 0) {
                sb.append(" ");
            }
            i--;
        }
        return lg.c().e(sb.toString());
    }

    public static Toast f0(Context context, String str, int i, Toast toast) {
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
        if (context == null || str == null) {
            return null;
        }
        Toast toastMakeText = Toast.makeText(context, str, i);
        toastMakeText.setGravity(49, 0, (int) q51.h(66.0f, 160.0f));
        toastMakeText.show();
        return toastMakeText;
    }

    public static String g(long j) {
        return Long.toString(j & Long.MAX_VALUE);
    }

    public static void g0(Context context, String str, int i) {
        Y(new c6(i, 2, context, str));
    }

    public static boolean h(Context context, String str, Logging logging) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            if (Build.VERSION.SDK_INT < 28) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, ""));
                return true;
            }
            try {
                clipboardManager.clearPrimaryClip();
                return true;
            } catch (NullPointerException unused) {
                return true;
            }
        }
        if (logging == null) {
            return false;
        }
        logging.h("cannot clear clipboard data '" + str + "'");
        return false;
    }

    public static void h0(AdVpnService adVpnService) {
        if (Build.VERSION.SDK_INT >= 24) {
            adVpnService.stopForeground(1);
        } else {
            adVpnService.stopForeground(true);
        }
    }

    public static boolean i(File file, File file2, Logging logging) {
        try {
            if (file2.isDirectory()) {
                file2 = new File(file2, file.getName());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[65536];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            if (logging != null) {
                logging.a("cannot copy file from '" + file.getAbsolutePath() + "' to '" + file2.getAbsolutePath() + "': " + e.getMessage());
            }
            return false;
        }
    }

    public static Bitmap i0(Context context, int i) {
        Drawable drawableR = ec1.r(context, i);
        if (drawableR == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableR.getIntrinsicWidth(), drawableR.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableR.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableR.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void j(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                j(file2);
            }
        }
        file.delete();
    }

    public static Bitmap k(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String l(String str) {
        if (str == null || str.startsWith("http://") || str.startsWith("https://")) {
            return null;
        }
        return str;
    }

    public static Intent m(qa qaVar) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + qaVar.getPackageName())).addFlags(268435456);
    }

    public static bc n(Context context, boolean z) {
        ActivityOptions activityOptionsU;
        Intent intent = new Intent("android.intent.action.VIEW");
        int iL = uj.l(context, R.color.colorPrimary) | (-16777216);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iL);
        boolean z2 = false;
        if (z) {
            Point pointA = er0.a();
            int iMax = Math.max(pointA.x, pointA.y);
            int dimensionPixelSize = (int) (context.getResources().getDimensionPixelSize(R.dimen.partial_custom_tabs_side_sheet_breakpoint) / (er0.b() / 160.0f));
            bc bcVar = MainApplication.v().h0;
            if (bcVar != null) {
                intent.setPackage(((ComponentName) bcVar.e).getPackageName());
                vr vrVar = (vr) bcVar.d;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("android.support.customtabs.extra.SESSION", vrVar);
                intent.putExtras(bundle2);
            }
            if (iMax <= 0) {
                id.q("Invalid value for the initialWidthPx argument");
                return null;
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", iMax);
            if (iMax <= 0) {
                id.q("Invalid value for the initialHeightPx argument");
                return null;
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", iMax);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
            if (dimensionPixelSize <= 0) {
                id.q("Invalid value for the initialWidthPx argument");
                return null;
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", dimensionPixelSize);
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtras(bundle);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            String strF = jf.f();
            if (!TextUtils.isEmpty(strF)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strF);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i >= 34) {
            activityOptionsU = nd0.u();
            t3.i(activityOptionsU);
        } else {
            activityOptionsU = null;
        }
        if (i >= 36) {
            if (activityOptionsU == null) {
                activityOptionsU = nd0.u();
            }
            u3.e(activityOptionsU, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        return new bc(intent, activityOptionsU != null ? activityOptionsU.toBundle() : null, 16, z2);
    }

    public static String o(Context context) {
        if (context == null) {
            return null;
        }
        new ArrayList();
        return y90.x(context, (List) Collection$EL.stream(t(context, new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")))).map(new j0(1)).collect(Collectors.toList()));
    }

    public static String p(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    cursorQuery.close();
                    return string;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public static String q(Context context) {
        int i = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
        return "" + (((-65536) & i) >> 16) + "." + (i & 65535);
    }

    public static String r(int i, String str) {
        String strConcat = str.concat(" ");
        if (i == 2) {
            return strConcat.concat(JniAdExt.n1("ad.accept.connecting"));
        }
        return i == 4 ? strConcat.concat(JniAdExt.n1("ad.accept.connecting.vpn")) : strConcat.concat(JniAdExt.n1("ad.accept.connecting.filetransfer"));
    }

    public static String s(int i, String str, Logging logging) {
        if (i == 2) {
            return String.format(JniAdExt.n1("ad.accept.connected.android"), str);
        }
        if (i == 4) {
            return String.format(JniAdExt.n1("ad.accept.connected.vpn.android"), str);
        }
        if (i == 3) {
            return String.format(JniAdExt.n1("ad.accept.connected.file_transfer.android"), str);
        }
        if (logging == null) {
            return "";
        }
        logging.c("incoming connection type not recognised; no appropriate text found");
        return "";
    }

    public static List t(Context context, Intent intent) {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return arrayList;
        }
        List listW = W(packageManager, intent);
        ListIterator listIterator = listW.listIterator();
        while (listIterator.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) listIterator.next();
            if (resolveInfo == null || resolveInfo.activityInfo.packageName.contains("frameworkpackagestubs")) {
                listIterator.remove();
            }
        }
        return listW;
    }

    public static Intent u(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(new ComponentName("com.google.android.documentsui", "com.android.documentsui.files.FilesActivity"));
        intent.setPackage("com.google.android.documentsui");
        intent.setDataAndType(DocumentsContract.buildRootsUri(AdStorageProviderDownloads.e(context)), "vnd.android.document/root");
        if (d(context, intent)) {
            return intent;
        }
        String strN1 = JniAdExt.n1("ad.status.file_transfer.chooser.title");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setType("vnd.android.document/directory");
        intent2.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildRootsUri(AdStorageProviderDownloads.e(context)));
        if (d(context, intent2)) {
            return Intent.createChooser(intent2, strN1);
        }
        Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
        intent3.setType("*/*");
        intent3.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildRootsUri(AdStorageProviderDownloads.e(context)));
        return d(context, intent3) ? Intent.createChooser(intent3, strN1) : new Intent("android.intent.action.VIEW_DOWNLOADS");
    }

    public static long v(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfoB = d51.b(packageManager, str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfoB.getLongVersionCode() : packageInfoB.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1L;
        }
    }

    public static ArrayList w(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
    }

    public static Parcelable x(Intent intent, String str) {
        return Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra(str, Uri.class) : intent.getParcelableExtra(str);
    }

    public static String y(String str, long j, String str2) {
        if (str.isEmpty()) {
            return j != 0 ? f(j) : str2;
        }
        return str;
    }

    public static Intent z(MainActivity mainActivity) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildRootsUri(AdStorageProviderRecordings.e(mainActivity)));
        return Intent.createChooser(intent, JniAdExt.n1("ad.status.select_files.chooser.replay.msg"));
    }
}
