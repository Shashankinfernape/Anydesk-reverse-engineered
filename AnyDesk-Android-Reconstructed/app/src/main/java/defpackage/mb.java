package defpackage;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mb extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((nb) obj).l();
                break;
            case 1:
                y6 y6Var = (y6) obj;
                ((Logging) y6Var.d).e("restrictions update received");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                y6Var.r(arrayList, arrayList2, arrayList3, arrayList4);
                JniAdExt.F4(arrayList, arrayList2, arrayList3, arrayList4);
                break;
            default:
                WebViewActivity webViewActivity = (WebViewActivity) obj;
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                if (longExtra >= 0 && longExtra == webViewActivity.F) {
                    DownloadManager downloadManager = (DownloadManager) webViewActivity.getSystemService("download");
                    Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(longExtra));
                    if (cursorQuery.moveToFirst()) {
                        if (cursorQuery.getInt(cursorQuery.getColumnIndex("status")) != 8) {
                            cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                        } else {
                            try {
                                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                intent2.setData(downloadManager.getUriForDownloadedFile(longExtra));
                                webViewActivity.startActivity(intent2);
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
