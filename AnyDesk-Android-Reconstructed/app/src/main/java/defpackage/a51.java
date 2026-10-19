package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import j$.util.Collection$EL;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a51 {
    public final Logging a = new Logging("ShortcutTool");
    public final xt0 b;

    public a51(xt0 xt0Var) {
        this.b = xt0Var;
    }

    public static void a(a51 a51Var, Context context, SpeedDialItem[] speedDialItemArr) {
        Logging logging = a51Var.a;
        try {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            List list = (List) DesugarArrays.stream(speedDialItemArr).sorted(Comparator$EL.reversed(Comparator$CC.comparing(new j0(2)))).limit(shortcutManager.getMaxShortcutCountPerActivity()).collect(Collectors.toList());
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                SpeedDialItem speedDialItem = (SpeedDialItem) list.get(i);
                String prettyAddr = speedDialItem.getPrettyAddr();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("anydesk", prettyAddr, null));
                int i2 = speedDialItem.mColor1;
                int i3 = speedDialItem.mColor2;
                String str = speedDialItem.mThumbnailPath;
                String displayName = speedDialItem.getDisplayName();
                String strI = i(prettyAddr);
                boolean z = speedDialItem.mIsFavorite;
                Context context2 = context;
                arrayList.add(c(context2, shortcutManager, intent, i2, i3, str, displayName, strI, z, i));
                i++;
                context = context2;
            }
            if (shortcutManager.setDynamicShortcuts(arrayList)) {
                return;
            }
            logging.a("failed to set shortcuts: call to ShortcutManager::setDynamicShortcuts was rate-limited");
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("failed to update shortcuts: "), logging);
        }
    }

    public static void b(a51 a51Var, Context context, String str, int i, int i2, String str2, String str3) {
        Logging logging = a51Var.a;
        try {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("anydesk", str, null));
            String strI = i(str);
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            ShortcutInfo shortcutInfoC = c(context, shortcutManager, intent, i, i2, str2, str3, strI, true, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                shortcutManager.pushDynamicShortcut(shortcutInfoC);
                return;
            }
            int maxShortcutCountPerActivity = shortcutManager.getMaxShortcutCountPerActivity();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManager.removeDynamicShortcuts((List) Collection$EL.stream(dynamicShortcuts.subList(maxShortcutCountPerActivity - 1, dynamicShortcuts.size())).map(new j0(3)).collect(Collectors.toList()));
            }
            Object[] objArr = {shortcutInfoC};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            if (shortcutManager.addDynamicShortcuts(DesugarCollections.unmodifiableList(arrayList))) {
                return;
            }
            logging.a("failed to push shortcut: call to ShortcutManager::addDynamicShortcuts was rate-limited");
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("failed to push shortcut: "), logging);
        }
    }

    public static ShortcutInfo c(Context context, ShortcutManager shortcutManager, Intent intent, int i, int i2, String str, String str2, String str3, boolean z, int i3) {
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, str3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            builder.setLongLived(true);
        }
        Bitmap bitmapD = d(context, i, i2, str, shortcutManager.getIconMaxWidth(), shortcutManager.getIconMaxHeight(), false);
        zd zdVar = new zd(0);
        zdVar.add("com.anydesk.anydeskandroid.CATEGORY_SHARE_TARGET");
        if (z) {
            zdVar.add("com.anydesk.anydeskandroid.CATEGORY_PRIORITIZED_SHORTCUT");
        }
        return builder.setShortLabel(str2).setLongLabel(str2).setIcon(i4 >= 26 ? Icon.createWithAdaptiveBitmap(bitmapD) : Icon.createWithBitmap(bitmapD)).setCategories(zdVar).setIntent(intent).setRank(i3).build();
    }

    public static Bitmap d(Context context, int i, int i2, String str, int i3, int i4, boolean z) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null && (bitmapDecodeFile = t70.i0(context, R.drawable.unknown_desktop)) == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        int iMax = Math.max(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        GradientDrawable gradientDrawableM = t70.M(i, i2);
        gradientDrawableM.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        gradientDrawableM.draw(canvas);
        canvas.drawBitmap(bitmapDecodeFile, width < iMax ? (iMax - width) / 2 : 0, height < iMax ? (iMax - height) / 2 : 0, (Paint) null);
        if (z) {
            int i5 = iMax / 3;
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher), i5, i5, true), (iMax * 2.0f) / 3.0f, 0.0f, (Paint) null);
        }
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, i3, i4, true);
    }

    public static void f(MainActivity mainActivity, Intent intent, int i, int i2, String str, String str2) {
        Bitmap bitmapD = d(mainActivity, i, i2, str, 250, 250, true);
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent2.putExtra("android.intent.extra.shortcut.ICON", bitmapD);
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        intent2.putExtra("duplicate", true);
        mainActivity.getApplicationContext().sendBroadcast(intent2);
    }

    public static String i(String str) {
        StringBuilder sb = new StringBuilder("anydesk_");
        if (t70.c.matcher(str).matches()) {
            str = t70.f(Long.parseLong(str));
        }
        sb.append(str);
        return sb.toString();
    }

    public final void e(MainActivity mainActivity, int i, int i2, String str, String str2, String str3) {
        xt0 xt0Var = this.b;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("anydesk", str, null));
            if (Build.VERSION.SDK_INT < 26) {
                f(mainActivity, intent, i, i2, str2, str3);
                return;
            }
            ShortcutManager shortcutManager = (ShortcutManager) mainActivity.getSystemService(ShortcutManager.class);
            ShortcutInfo shortcutInfoC = c(mainActivity, shortcutManager, intent, i, i2, str2, str3, i(str), true, 0);
            if (shortcutManager.isRequestPinShortcutSupported()) {
                shortcutManager.requestPinShortcut(shortcutInfoC, null);
            } else {
                xt0Var.u(mainActivity, JniAdExt.n1("ad.msg.create_link.unsupported.android"));
            }
        } catch (Throwable th) {
            this.a.a("failed to install shortcut: " + th.getMessage());
            xt0Var.u(mainActivity, JniAdExt.n1("ad.msg.create_link.error.android"));
        }
    }

    public final void g(Context context, String str) {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        try {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            Object[] objArr = {i(str)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            shortcutManager.removeDynamicShortcuts(DesugarCollections.unmodifiableList(arrayList));
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("failed to remove shortcut: "), this.a);
        }
    }

    public final void h(MainActivity mainActivity, String str) {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        try {
            ((ShortcutManager) mainActivity.getSystemService(ShortcutManager.class)).reportShortcutUsed(i(str));
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("failed to report shortcut use: "), this.a);
        }
    }
}
