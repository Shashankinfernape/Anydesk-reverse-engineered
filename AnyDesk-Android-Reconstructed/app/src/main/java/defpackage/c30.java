package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c30 {
    public final /* synthetic */ int a;
    public final ContentProviderClient b;

    public c30(Context context, Uri uri, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws Exception {
        int i = this.a;
        ContentProviderClient contentProviderClient = this.b;
        switch (i) {
            case 0:
                if (contentProviderClient != 0) {
                    contentProviderClient.release();
                }
                break;
            default:
                if (contentProviderClient != 0) {
                    if (contentProviderClient instanceof AutoCloseable) {
                        contentProviderClient.close();
                    } else if (!(contentProviderClient instanceof ExecutorService)) {
                        contentProviderClient.release();
                    } else {
                        d30.a((ExecutorService) contentProviderClient);
                    }
                }
                break;
        }
    }
}
