package com.anydesk.anydeskandroid;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import defpackage.k7;
import defpackage.q51;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class AdStorageProviderRecordings extends k7 {
    public static String e(Context context) {
        return context.getPackageName() + ".documents.recordings";
    }

    @Override // defpackage.k7
    public final String a() {
        return e(getContext());
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryRoots(String[] strArr) {
        if (strArr == null) {
            strArr = k7.d;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        Context context = getContext();
        int i = MainApplication.p0;
        StringBuilder sb = new StringBuilder();
        sb.append(MainApplication.w(context));
        File file = new File(q51.m(sb, File.separator, "recordings"));
        rowBuilderNewRow.add("root_id", file.getAbsolutePath());
        rowBuilderNewRow.add("document_id", file.getAbsolutePath());
        rowBuilderNewRow.add("title", "AnyDesk Recordings");
        rowBuilderNewRow.add("flags", 3);
        rowBuilderNewRow.add("icon", Integer.valueOf(R.mipmap.ic_storage_recordings));
        rowBuilderNewRow.add("available_bytes", Long.valueOf(file.getFreeSpace()));
        return matrixCursor;
    }
}
