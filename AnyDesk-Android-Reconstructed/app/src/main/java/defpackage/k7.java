package defpackage;

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.DocumentsProvider;
import android.webkit.MimeTypeMap;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k7 extends DocumentsProvider {
    public static final String[] d = {"root_id", "flags", "title", "document_id", "icon", "available_bytes"};
    public static final String[] e = {"document_id", "_display_name", "flags", "mime_type", "_size", "last_modified", "icon"};
    public final Logging c = new Logging("AdStorageProvider");

    public abstract String a();

    public final void b(MatrixCursor matrixCursor, File file) {
        int i = 0;
        boolean z = !file.isDirectory() && file.getName().endsWith(".anydesk") && file.getName().length() > 8;
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("document_id", file.getAbsolutePath());
        rowBuilderNewRow.add("_display_name", file.getName());
        String documentType = z ? "application/anydesk" : getDocumentType(file.getAbsolutePath());
        rowBuilderNewRow.add("mime_type", documentType);
        if (file.canWrite()) {
            i = file.isDirectory() ? 78 : 70;
        }
        if (documentType.startsWith("image/")) {
            i |= 1;
        }
        rowBuilderNewRow.add("flags", Integer.valueOf(i));
        rowBuilderNewRow.add("_size", Long.valueOf(file.length()));
        rowBuilderNewRow.add("last_modified", Long.valueOf(file.lastModified()));
        if (z) {
            rowBuilderNewRow.add("icon", Integer.valueOf(R.mipmap.ic_launcher));
        }
    }

    public final void c(String str) {
        getContext().getContentResolver().notifyChange(DocumentsContract.buildDocumentUri(a(), str), null);
    }

    @Override // android.provider.DocumentsProvider
    public final String createDocument(String str, String str2, String str3) {
        boolean zEquals = "vnd.android.document/directory".equals(str2);
        File file = new File(str, str3);
        try {
            if (zEquals) {
                file.mkdir();
            } else {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            c(absolutePath);
            d(str);
            return absolutePath;
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder("Error creating new ");
            sb.append(zEquals ? "directory" : "file");
            sb.append(" ");
            sb.append(file);
            this.c.a(sb.toString());
            return null;
        }
    }

    public final void d(String str) {
        getContext().getContentResolver().notifyChange(DocumentsContract.buildChildDocumentsUri(a(), str), null);
    }

    @Override // android.provider.DocumentsProvider
    public final void deleteDocument(String str) {
        File file = new File(str);
        t70.j(file);
        c(str);
        d(file.getParent());
    }

    @Override // android.provider.DocumentsProvider
    public final String getDocumentType(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            return "vnd.android.document/directory";
        }
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.provider.DocumentsProvider
    public final ParcelFileDescriptor openDocument(String str, String str2, CancellationSignal cancellationSignal) {
        return ParcelFileDescriptor.open(new File(str), ParcelFileDescriptor.parseMode(str2));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[SYNTHETIC] */
    @Override // android.provider.DocumentsProvider
    public final AssetFileDescriptor openDocumentThumbnail(String str, Point point, CancellationSignal cancellationSignal) throws Throwable {
        Throwable th;
        IOException iOException;
        FileOutputStream fileOutputStream;
        Logging logging = this.c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = point.y * 2;
        int i2 = point.x * 2;
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        options.inSampleSize = 1;
        if (i3 > i || i4 > i2) {
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            while (true) {
                int i7 = options.inSampleSize;
                if (i5 / i7 <= i && i6 / i7 <= i2) {
                    break;
                }
                options.inSampleSize = i7 * 2;
            }
        }
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        FileOutputStream fileOutputStream2 = null;
        if (bitmapDecodeFile == null) {
            return null;
        }
        try {
            File fileCreateTempFile = File.createTempFile("thumbnail", null, getContext().getCacheDir());
            fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        logging.b("Error closing thumbnail", e2);
                    }
                    return new AssetFileDescriptor(ParcelFileDescriptor.open(fileCreateTempFile, 268435456), 0L, -1L);
                } catch (IOException e3) {
                    iOException = e3;
                    logging.b("Error writing thumbnail", iOException);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            logging.b("Error closing thumbnail", e4);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    throw th;
                }
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (IOException e5) {
                    logging.b("Error closing thumbnail", e5);
                    throw th;
                }
            }
        } catch (IOException e6) {
            iOException = e6;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream2 != null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryChildDocuments(String str, String[] strArr, String str2) {
        File[] fileArrListFiles;
        if (strArr == null) {
            strArr = e;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        matrixCursor.setNotificationUri(getContext().getContentResolver(), DocumentsContract.buildChildDocumentsUri(a(), str));
        File file = new File(str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(matrixCursor, file2);
            }
        }
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryDocument(String str, String[] strArr) {
        if (strArr == null) {
            strArr = e;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        matrixCursor.setNotificationUri(getContext().getContentResolver(), DocumentsContract.buildDocumentUri(a(), str));
        if (new File(str).exists()) {
            b(matrixCursor, new File(str));
        }
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final String renameDocument(String str, String str2) {
        File file = new File(str);
        String parent = file.getParent();
        File file2 = new File(parent, str2);
        String absolutePath = file2.getAbsolutePath();
        boolean zRenameTo = false;
        if (parent != null) {
            try {
                zRenameTo = file.renameTo(file2);
            } catch (Throwable unused) {
            }
        }
        if (!zRenameTo) {
            return null;
        }
        c(str);
        c(absolutePath);
        d(file.getParent());
        return str2;
    }
}
