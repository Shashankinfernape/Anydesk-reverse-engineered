package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ListView;
import androidx.navigation.fragment.NavHostFragment;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class uj {
    public static final bx b;
    public static final bx e;
    public static Method i = null;
    public static boolean j = false;
    public static Method k = null;
    public static boolean l = false;
    public static boolean m = true;
    public static final rq[] a = new rq[0];
    public static final Object c = new Object();
    public static final us0 d = new us0(3);
    public static final hn f = new hn(6);
    public static final hn g = new hn(7);
    public static final hn h = new hn(8);

    static {
        int i2 = 2;
        b = new bx("RESUME_TOKEN", i2);
        e = new bx("NO_THREAD_ELEMENTS", i2);
    }

    public static final void B(br brVar, Object obj) {
        if (obj == e) {
            return;
        }
        if (!(obj instanceof z91)) {
            brVar.h(null, g).getClass();
            id.c();
            return;
        }
        xq[] xqVarArr = ((z91) obj).b;
        int length = xqVarArr.length - 1;
        if (length < 0) {
            return;
        }
        xq xqVar = xqVarArr[length];
        throw null;
    }

    public static void C(bg0 bg0Var, ListView listView, int i2, View view, boolean z, Logging logging) {
        int count = listView.getCount();
        if (count == 0) {
            return;
        }
        fg fgVar = (fg) listView.getItemAtPosition(i2);
        if (!(fgVar instanceof w11)) {
            if (i2 >= count - 1) {
                return;
            }
            i2++;
            fgVar = (fg) listView.getItemAtPosition(i2);
            if (!(fgVar instanceof w11)) {
                return;
            }
        }
        w11 w11Var = (w11) fgVar;
        Class cls = w11Var.d;
        if (view == null) {
            listView.setItemChecked(i2, true);
            if (z) {
                v(bg0Var.Y(), w11Var.e);
                return;
            }
            return;
        }
        try {
            t40 t40VarE0 = bg0Var.e0();
            Iterator it = t40VarE0.c.h().iterator();
            while (it.hasNext()) {
                if (((c40) it.next()).getClass().equals(cls)) {
                    listView.setItemChecked(i2, true);
                }
            }
            sf sfVar = new sf(t40VarE0);
            sfVar.h(view.getId(), (c40) cls.getDeclaredConstructor(null).newInstance(null), null);
            sfVar.f = 4099;
            sfVar.d(false);
            listView.setItemChecked(i2, true);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("cannot navigate to ");
            sb.append(cls);
            sb.append(": ");
            q51.o(th, sb, logging);
        }
    }

    public static boolean D(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return nd0.K(drawable, i2);
        }
        if (!j) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            j = true;
        }
        Method method = i;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                i = null;
            }
        }
        return false;
    }

    public static void E(c40 c40Var) {
        bo0 bo0VarO0;
        Boolean bool = Boolean.TRUE;
        Object obj = null;
        try {
            bo0VarO0 = NavHostFragment.O0(c40Var);
        } catch (IllegalStateException unused) {
            bo0VarO0 = null;
        }
        if (bo0VarO0 != null) {
            Iterator it = tm.s0(bo0VarO0.b.f).iterator();
            if (it.hasNext()) {
                it.next();
            }
            for (Object obj2 : (mp) h11.b0(it)) {
                if (!(((an0) obj2).d instanceof xn0)) {
                    obj = obj2;
                    break;
                }
            }
            an0 an0Var = (an0) obj;
            if (an0Var == null || R.id.abookFragment != an0Var.d.d.a) {
                return;
            }
            ((yz0) an0Var.k.getValue()).b(bool, "RESULT_ITEM_UPDATED");
        }
    }

    public static boolean F(qa qaVar, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 >= 32) {
            return nd0.S(qaVar, str);
        }
        if (i2 == 31) {
            return nd0.R(qaVar, str);
        }
        if (i2 >= 23) {
            return nd0.Q(qaVar, str);
        }
        return false;
    }

    public static void G(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            se1.b(viewGroup, z);
        } else if (m) {
            try {
                se1.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public static final Object H(br brVar) {
        Object objH = brVar.h(0, f);
        objH.getClass();
        return objH;
    }

    public static int I(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object J(br brVar, Object obj) {
        if (obj == null) {
            obj = H(brVar);
        }
        if (obj == 0) {
            return e;
        }
        if (obj instanceof Integer) {
            return brVar.h(new z91(((Number) obj).intValue(), brVar), h);
        }
        id.c();
        return null;
    }

    public static Drawable K(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof da1)) {
            return drawable;
        }
        nh1 nh1Var = new nh1();
        nh1Var.f = nh1Var.c();
        nh1Var.h(drawable);
        nh1.a();
        return nh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0193 A[Catch: all -> 0x0190, TRY_ENTER, TryCatch #29 {all -> 0x0190, blocks: (B:97:0x016e, B:99:0x017a, B:110:0x0193, B:111:0x0198), top: B:286:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a4 A[Catch: IllegalStateException -> 0x0189, IOException -> 0x018b, FileNotFoundException -> 0x018e, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018e, IOException -> 0x018b, IllegalStateException -> 0x0189, blocks: (B:95:0x0166, B:100:0x0184, B:118:0x01a4, B:116:0x01a1, B:115:0x019e), top: B:301:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #11 {all -> 0x01ec, blocks: (B:133:0x01d1, B:135:0x01dd, B:144:0x01ef), top: B:267:0x01d1, outer: #35 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef A[Catch: all -> 0x01ec, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x01ec, blocks: (B:133:0x01d1, B:135:0x01dd, B:144:0x01ef), top: B:267:0x01d1, outer: #35 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x020c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0214  */
    /* JADX WARN: Code duplicated, block: B:160:0x0218  */
    /* JADX WARN: Code duplicated, block: B:169:0x0238 A[Catch: all -> 0x0277, TryCatch #19 {all -> 0x0277, blocks: (B:167:0x0232, B:169:0x0238, B:170:0x023c, B:172:0x0242), top: B:277:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0242 A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #19 {all -> 0x0277, blocks: (B:167:0x0232, B:169:0x0238, B:170:0x023c, B:172:0x0242), top: B:277:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:242:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:249:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:277:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0247 A[EDGE_INSN: B:302:0x0247->B:174:0x0247 BREAK  A[LOOP:0: B:170:0x023c->B:303:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: all -> 0x0124, IllegalStateException -> 0x0127, IOException -> 0x0129, TRY_LEAVE, TryCatch #21 {IllegalStateException -> 0x0127, blocks: (B:54:0x0107, B:56:0x0111, B:67:0x012b, B:68:0x0130), top: B:279:0x0107, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012b A[Catch: all -> 0x0124, IllegalStateException -> 0x0127, IOException -> 0x0129, TRY_ENTER, TryCatch #21 {IllegalStateException -> 0x0127, blocks: (B:54:0x0107, B:56:0x0111, B:67:0x012b, B:68:0x0130), top: B:279:0x0107, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017a A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #29 {all -> 0x0190, blocks: (B:97:0x016e, B:99:0x017a, B:110:0x0193, B:111:0x0198), top: B:286:0x016e }] */
    public static void L(Context context, Executor executor, gv0 gv0Var, boolean z) {
        FileInputStream fileInputStreamA;
        rt[] rtVarArrI;
        rt[] rtVarArr;
        gv0 gv0Var2;
        rt[] rtVarArr2;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i2;
        boolean z3;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        qt qtVar;
        FileInputStream fileInputStreamA2;
        boolean z4;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                gv0Var.i(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    jv0.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = hq.p;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            qt qtVar2 = new qt(assets, executor, gv0Var, name, file2);
            byte[] bArr5 = qtVar2.c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            qtVar2.f = true;
                            fileInputStreamA = qtVar2.a(assets, "dexopt/baseline.prof");
                            if (fileInputStreamA != null) {
                                if (Arrays.equals(bArr4, r71.G(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                rtVarArrI = hq.I(fileInputStreamA, r71.G(fileInputStreamA, 4), qtVar2.e);
                                fileInputStreamA.close();
                                qtVar2.g = rtVarArrI;
                            }
                            rtVarArr = qtVar2.g;
                            if (rtVarArr != null) {
                                fileInputStreamA2 = qtVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    qtVar = null;
                                } else {
                                    if (Arrays.equals(hq.q, r71.G(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    qtVar2.g = hq.F(fileInputStreamA2, r71.G(fileInputStreamA2, 4), bArr5, rtVarArr);
                                    fileInputStreamA2.close();
                                    qtVar = qtVar2;
                                }
                                if (qtVar != null) {
                                    qtVar2 = qtVar;
                                }
                            }
                            gv0Var2 = qtVar2.b;
                            rtVarArr2 = qtVar2.g;
                            bArr = qtVar2.c;
                            if (rtVarArr2 != null) {
                                if (qtVar2.f) {
                                    nh0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (hq.W(byteArrayOutputStream, bArr, rtVarArr2)) {
                                    qtVar2.h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    qtVar2.g = null;
                                } else {
                                    gv0Var2.i(5, null);
                                    qtVar2.g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr2 = qtVar2.h;
                            if (bArr2 != null) {
                                if (qtVar2.f) {
                                    nh0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(qtVar2.d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i2);
                                        }
                                        qtVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        qtVar2.h = null;
                                        qtVar2.g = null;
                                        z2 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z2 = false;
                            if (z2) {
                                y(packageInfo, filesDir);
                            }
                            z3 = z2;
                        } else {
                            qtVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        qtVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    qtVar2.f = true;
                    try {
                        fileInputStreamA = qtVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        gv0Var.i(6, e2);
                        fileInputStreamA = null;
                    } catch (IOException e3) {
                        gv0Var.i(7, e3);
                        fileInputStreamA = null;
                    }
                    try {
                        if (fileInputStreamA != null) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, r71.G(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    rtVarArrI = hq.I(fileInputStreamA, r71.G(fileInputStreamA, 4), qtVar2.e);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e4) {
                                        gv0Var.i(7, e4);
                                    }
                                    qtVar2.g = rtVarArrI;
                                } catch (IllegalStateException e5) {
                                    gv0Var.i(8, e5);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e6) {
                                        gv0Var.i(7, e6);
                                    }
                                    rtVarArrI = null;
                                }
                            } catch (IOException e7) {
                                gv0Var.i(7, e7);
                                fileInputStreamA.close();
                                rtVarArrI = null;
                            }
                        }
                        rtVarArr = qtVar2.g;
                        if (rtVarArr != null && (i3 = Build.VERSION.SDK_INT) >= 24 && (i3 >= 31 || i3 == 24 || i3 == 25)) {
                            try {
                                fileInputStreamA2 = qtVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    try {
                                        if (Arrays.equals(hq.q, r71.G(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        qtVar2.g = hq.F(fileInputStreamA2, r71.G(fileInputStreamA2, 4), bArr5, rtVarArr);
                                        fileInputStreamA2.close();
                                        qtVar = qtVar2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamA2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    qtVar = null;
                                }
                            } catch (FileNotFoundException e8) {
                                gv0Var.i(9, e8);
                            } catch (IOException e9) {
                                gv0Var.i(7, e9);
                            } catch (IllegalStateException e10) {
                                qtVar2.g = null;
                                gv0Var.i(8, e10);
                            }
                            if (qtVar != null) {
                                qtVar2 = qtVar;
                            }
                        }
                        gv0Var2 = qtVar2.b;
                        rtVarArr2 = qtVar2.g;
                        bArr = qtVar2.c;
                        if (rtVarArr2 != null && bArr != null) {
                            if (qtVar2.f) {
                                nh0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (hq.W(byteArrayOutputStream, bArr, rtVarArr2)) {
                                        gv0Var2.i(5, null);
                                        qtVar2.g = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        qtVar2.h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        qtVar2.g = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e11) {
                                gv0Var2.i(7, e11);
                            } catch (IllegalStateException e12) {
                                gv0Var2.i(8, e12);
                            }
                        }
                        bArr2 = qtVar2.h;
                        if (bArr2 != null) {
                            z2 = false;
                        } else {
                            try {
                                if (qtVar2.f) {
                                    nh0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(qtVar2.d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i2);
                                                                                    }
                                                                                }
                                                                                qtVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                qtVar2.h = null;
                                                                                qtVar2.g = null;
                                                                                z2 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        qtVar2.b(6, e);
                                        qtVar2.h = null;
                                        qtVar2.g = null;
                                        z2 = false;
                                    } catch (IOException e14) {
                                        e = e14;
                                        qtVar2.b(7, e);
                                        qtVar2.h = null;
                                        qtVar2.g = null;
                                        z2 = false;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    qtVar2.b(6, e);
                                    qtVar2.h = null;
                                    qtVar2.g = null;
                                    z2 = false;
                                } catch (IOException e16) {
                                    e = e16;
                                    qtVar2.b(7, e);
                                    qtVar2.h = null;
                                    qtVar2.g = null;
                                    z2 = false;
                                }
                            } catch (Throwable th23) {
                                qtVar2.h = null;
                                qtVar2.g = null;
                                throw th23;
                            }
                        }
                        if (z2) {
                            y(packageInfo, filesDir);
                        }
                        z3 = z2;
                    } catch (Throwable th24) {
                        try {
                            fileInputStreamA.close();
                            throw th24;
                        } catch (IOException e17) {
                            gv0Var.i(7, e17);
                            throw th24;
                        }
                    }
                } else {
                    qtVar2.b(4, null);
                }
                if (z3 || !z) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                jv0.c(context, z4);
            }
            qtVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = false;
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            jv0.c(context, z4);
        } catch (PackageManager.NameNotFoundException e18) {
            gv0Var.i(7, e18);
            jv0.c(context, false);
        }
    }

    public static boolean a(int i2, String str, String str2, boolean z) {
        return (z || !(i2 == 3 || i2 == 4)) ? str.equalsIgnoreCase(str2) : str.equals(str2);
    }

    public static boolean c(au0[] au0VarArr, au0[] au0VarArr2) {
        if (au0VarArr == null || au0VarArr2 == null || au0VarArr.length != au0VarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < au0VarArr.length; i2++) {
            au0 au0Var = au0VarArr[i2];
            char c2 = au0Var.a;
            au0 au0Var2 = au0VarArr2[i2];
            if (c2 != au0Var2.a || au0Var.b.length != au0Var2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static int d(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new fq0(context).a() ? 0 : -1;
    }

    public static float e(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static int f(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static void g(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            g(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof nh1) {
            g(((nh1) drawable).h);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Drawable child = drawableContainerState.getChild(i2);
            if (child != null) {
                g(child);
            }
        }
    }

    public static float[] h(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[SYNTHETIC] */
    public static au0[] i(String str) {
        int i2;
        String strTrim;
        float[] fArrH;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i5, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrH = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = 1;
                                    int i7 = 0;
                                    while (i6 < length) {
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        for (int i8 = i6; i8 < strTrim.length(); i8++) {
                                            char cCharAt2 = strTrim.charAt(i8);
                                            if (cCharAt2 == ' ') {
                                                z = false;
                                                z3 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z = false;
                                                        z3 = true;
                                                        break;
                                                    case '-':
                                                        if (i8 == i6 || z) {
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                            z3 = true;
                                                            z4 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z2) {
                                                            z = false;
                                                            z3 = true;
                                                            z4 = true;
                                                        } else {
                                                            z = false;
                                                            z2 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z = false;
                                                        break;
                                                }
                                            } else {
                                                z = true;
                                            }
                                            if (z3) {
                                                if (i6 < i8) {
                                                    fArr[i7] = Float.parseFloat(strTrim.substring(i6, i8));
                                                    i7++;
                                                }
                                                if (z4) {
                                                    i6 = i8;
                                                } else {
                                                    i6 = i8 + 1;
                                                }
                                            }
                                        }
                                        if (i6 < i8) {
                                            fArr[i7] = Float.parseFloat(strTrim.substring(i6, i8));
                                            i7++;
                                        }
                                        if (z4) {
                                            i6 = i8;
                                        } else {
                                            i6 = i8 + 1;
                                        }
                                    }
                                    fArrH = h(fArr, i7);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    throw new RuntimeException(gr0.f("error in parsing \"", strTrim, "\""), e2);
                                }
                            }
                            arrayList.add(new au0(strTrim.charAt(i3), fArrH));
                        }
                        i5 = i4;
                        i4++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrH = new float[i3];
                } else {
                    fArrH = new float[i3];
                }
                arrayList.add(new au0(strTrim.charAt(i3), fArrH));
            }
            i5 = i4;
            i4++;
            i3 = 0;
        }
        if (i4 - i5 != 1 || i5 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new au0(str.charAt(i5), new float[0]));
        }
        return (au0[]) arrayList.toArray(new au0[i2]);
    }

    public static InputConnection j(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        tk tkVar = new tk(view);
        if (inputConnection == null) {
            throw new NullPointerException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return new l90(inputConnection, tkVar);
        }
        return hw.a(editorInfo).length == 0 ? inputConnection : new m90(inputConnection, tkVar);
    }

    public static au0[] k(au0[] au0VarArr) {
        au0[] au0VarArr2 = new au0[au0VarArr.length];
        for (int i2 = 0; i2 < au0VarArr.length; i2++) {
            au0VarArr2[i2] = new au0(au0VarArr[i2]);
        }
        return au0VarArr2;
    }

    public static int l(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? nd0.h(context, i2) : context.getResources().getColor(i2);
    }

    public static ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ky0 ky0Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ly0 ly0Var = new ly0(resources, theme);
        synchronized (my0.c) {
            try {
                SparseArray sparseArray = (SparseArray) my0.b.get(ly0Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (ky0Var = (ky0) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (ky0Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || ky0Var.c != 0) {
                            if (theme == null || ky0Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = ky0Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = my0.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = bn.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? nd0.i(resources, i2, theme) : resources.getColorStateList(i2);
        }
        my0.a(ly0Var, i2, colorStateListA, theme);
        return colorStateListA;
    }

    public static Annotation n(Class cls) {
        Objects.requireNonNull(cls);
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (ee.class.equals(annotation.annotationType())) {
                return (Annotation) ee.class.cast(annotation);
            }
        }
        return null;
    }

    public static int o(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return nd0.j(drawable);
        }
        if (!l) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            l = true;
        }
        Method method = k;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
            k = null;
            return 0;
        }
    }

    public static bo0 p(Activity activity) {
        try {
            return lk0.n(activity);
        } catch (Throwable unused) {
            new Logging("NavHelper").a("cannot find NavController");
            return null;
        }
    }

    public static Object q(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return s3.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (i6.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final w01 r(Object obj) {
        if (obj != ds.b) {
            return (w01) obj;
        }
        nh0.j("Does not contain segment");
        return null;
    }

    public static final void s(br brVar, Throwable th) {
        if (th instanceof ou) {
            th = ((ou) th).c;
        }
        try {
            j8 j8Var = (j8) brVar.l(fw.e);
            if (j8Var != null) {
                j8Var.e(th);
            } else {
                th1.v(brVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                th1.a(runtimeException, th);
                th = runtimeException;
            }
            th1.v(brVar, th);
        }
    }

    public static final boolean t(Object obj) {
        return obj == ds.b;
    }

    public static se0 u(ue0 ue0Var, o50 o50Var) {
        fw fwVar = fw.i;
        int iOrdinal = ue0Var.ordinal();
        if (iOrdinal == 0) {
            return new g81(o50Var);
        }
        if (iOrdinal == 1) {
            wz0 wz0Var = new wz0();
            wz0Var.c = o50Var;
            wz0Var.d = fwVar;
            return wz0Var;
        }
        if (iOrdinal != 2) {
            throw new pn();
        }
        yc1 yc1Var = new yc1();
        yc1Var.c = o50Var;
        yc1Var.d = fwVar;
        return yc1Var;
    }

    public static void v(Activity activity, int i2) {
        t70.Z(new qi(activity, i2, 6), 1L);
    }

    public static void w(Activity activity, int i2, Bundle bundle) {
        t70.Z(new c6(activity, i2, bundle, 7), 1L);
    }

    public static void x(Activity activity) {
        t70.Z(new bc0(11, activity), 1L);
    }

    public static void y(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public abstract void A(Typeface typeface);

    public void b(int i2) {
        new Handler(Looper.getMainLooper()).post(new ha0(this, i2, 2));
    }

    public abstract void z(int i2);
}
