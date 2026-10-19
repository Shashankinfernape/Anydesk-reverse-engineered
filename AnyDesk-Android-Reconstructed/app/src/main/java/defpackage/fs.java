package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends fw {
    @Override // defpackage.fw
    public final Signature[] e(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
