package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class m90 extends InputConnectionWrapper {
    public final /* synthetic */ tk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(InputConnection inputConnection, tk tkVar) {
        super(inputConnection, false);
        this.a = tkVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        tk tkVar = this.a;
        boolean zB = false;
        zB = false;
        zB = false;
        zB = false;
        if (bundle != null) {
            if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zB = tkVar.b(new ev(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zB ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zB) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
