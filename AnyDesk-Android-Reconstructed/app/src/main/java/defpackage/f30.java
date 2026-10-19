package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f30 {
    public static final yh0 a = new yh0(2);
    public static final x9 b = new x9(3);

    public static v7 a(Context context, List list) {
        String str;
        Typeface typefaceC;
        ec1.h("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                g30 g30Var = (g30) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = fc1.c((str = g30Var.e))) == null || fc1.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), g30Var, context.getResources());
                    if (providerInfoB == null) {
                        return new v7();
                    }
                    arrayList.add(c(context, g30Var, providerInfoB.authority));
                } else {
                    arrayList.add(new r30[]{new r30(str, g30Var.f)});
                }
            }
            return new v7(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, g30 g30Var, Resources resources) {
        x9 x9Var = b;
        yh0 yh0Var = a;
        ec1.h("FontProvider.getProvider");
        try {
            List listM = g30Var.d;
            String str = g30Var.a;
            String str2 = g30Var.b;
            if (listM == null) {
                listM = th1.M(resources, 0);
            }
            e30 e30Var = new e30();
            e30Var.a = str;
            e30Var.b = str2;
            e30Var.c = listM;
            ProviderInfo providerInfo = (ProviderInfo) yh0Var.f(e30Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, x9Var);
            for (int i = 0; i < listM.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM.get(i));
                Collections.sort(arrayList2, x9Var);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            yh0Var.j(e30Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[Catch: all -> 0x00dd, TryCatch #4 {all -> 0x00dd, blocks: (B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c, B:10:0x0065, B:13:0x0074, B:17:0x007d, B:20:0x0083, B:21:0x0087, B:25:0x0090, B:28:0x0096), top: B:80:0x004c, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[Catch: all -> 0x00dd, TryCatch #4 {all -> 0x00dd, blocks: (B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c, B:10:0x0065, B:13:0x0074, B:17:0x007d, B:20:0x0083, B:21:0x0087, B:25:0x0090, B:28:0x0096), top: B:80:0x004c, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[Catch: all -> 0x00dd, TryCatch #4 {all -> 0x00dd, blocks: (B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c, B:10:0x0065, B:13:0x0074, B:17:0x007d, B:20:0x0083, B:21:0x0087, B:25:0x0090, B:28:0x0096), top: B:80:0x004c, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8 A[Catch: all -> 0x00dd, TryCatch #4 {all -> 0x00dd, blocks: (B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c, B:10:0x0065, B:13:0x0074, B:17:0x007d, B:20:0x0083, B:21:0x0087, B:25:0x0090, B:28:0x0096), top: B:80:0x004c, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103 A[Catch: all -> 0x00dd, TryCatch #4 {all -> 0x00dd, blocks: (B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c, B:10:0x0065, B:13:0x0074, B:17:0x007d, B:20:0x0083, B:21:0x0087, B:25:0x0090, B:28:0x0096), top: B:80:0x004c, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126 A[Catch: all -> 0x0146, TRY_ENTER, TryCatch #1 {all -> 0x0146, blocks: (B:3:0x000b, B:5:0x0040, B:60:0x0126, B:61:0x0129, B:68:0x013f, B:69:0x0142, B:70:0x0145, B:6:0x0046, B:8:0x004c, B:29:0x0099, B:31:0x009e, B:33:0x00a4, B:34:0x00cd, B:38:0x00d6, B:43:0x00e3, B:46:0x00ee, B:50:0x0103, B:53:0x0110, B:57:0x011b, B:48:0x00f8, B:65:0x0139, B:66:0x013c), top: B:76:0x000b, inners: #4 }] */
    public static r30[] c(Context context, g30 g30Var, String str) {
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int i;
        int i2;
        Uri uriWithAppendedId;
        int i3;
        boolean z;
        ec1.h("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            c30 c30Var = Build.VERSION.SDK_INT < 24 ? new c30(context, uriBuild, 0) : new c30(context, uriBuild, 1);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ec1.h("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {g30Var.c};
                    switch (c30Var.a) {
                        case 0:
                            ContentProviderClient contentProviderClient = c30Var.b;
                            if (contentProviderClient != null) {
                                try {
                                    cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e);
                                }
                                break;
                            }
                            Trace.endSection();
                            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                                columnIndex = cursorQuery.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                columnIndex2 = cursorQuery.getColumnIndex("_id");
                                columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                while (cursorQuery.moveToNext()) {
                                    if (columnIndex != -1) {
                                        i = cursorQuery.getInt(columnIndex);
                                    } else {
                                        i = 0;
                                    }
                                    if (columnIndex4 != -1) {
                                        i2 = cursorQuery.getInt(columnIndex4);
                                    } else {
                                        i2 = 0;
                                    }
                                    if (columnIndex3 == -1) {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                    } else {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                    }
                                    Uri uri = uriWithAppendedId;
                                    if (columnIndex5 != -1) {
                                        i3 = cursorQuery.getInt(columnIndex5);
                                    } else {
                                        i3 = 400;
                                    }
                                    if (columnIndex6 == -1 && cursorQuery.getInt(columnIndex6) == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    arrayList.add(new r30(uri, i2, i3, z, i));
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            c30Var.a();
                            r30[] r30VarArr = (r30[]) arrayList.toArray(new r30[0]);
                            Trace.endSection();
                            return r30VarArr;
                        default:
                            ContentProviderClient contentProviderClient2 = c30Var.b;
                            if (contentProviderClient2 != null) {
                                try {
                                    cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e2) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                                }
                                break;
                            }
                            Trace.endSection();
                            if (cursorQuery != null) {
                                columnIndex = cursorQuery.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                columnIndex2 = cursorQuery.getColumnIndex("_id");
                                columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                while (cursorQuery.moveToNext()) {
                                    if (columnIndex != -1) {
                                        i = cursorQuery.getInt(columnIndex);
                                    } else {
                                        i = 0;
                                    }
                                    if (columnIndex4 != -1) {
                                        i2 = cursorQuery.getInt(columnIndex4);
                                    } else {
                                        i2 = 0;
                                    }
                                    if (columnIndex3 == -1) {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                    } else {
                                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                    }
                                    Uri uri2 = uriWithAppendedId;
                                    if (columnIndex5 != -1) {
                                        i3 = cursorQuery.getInt(columnIndex5);
                                    } else {
                                        i3 = 400;
                                    }
                                    if (columnIndex6 == -1) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    arrayList.add(new r30(uri2, i2, i3, z, i));
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            c30Var.a();
                            r30[] r30VarArr2 = (r30[]) arrayList.toArray(new r30[0]);
                            Trace.endSection();
                            return r30VarArr2;
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                c30Var.a();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
