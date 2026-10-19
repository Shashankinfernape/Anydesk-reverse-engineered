package defpackage;

import android.content.ClipboardManager;
import android.os.Looper;
import android.os.SystemClock;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class eb0 implements ClipboardManager.OnPrimaryClipChangedListener {
    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        Looper looper = t70.a;
        if (SystemClock.uptimeMillis() - JniAdExt.e > 100) {
            JniAdExt.v4();
        }
    }
}
