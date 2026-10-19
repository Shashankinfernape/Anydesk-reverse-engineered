package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.bu0;
import defpackage.fv0;
import defpackage.jf;
import defpackage.uj;
import defpackage.xt0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            uj.L(context, new fv0(), new xt0(4, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                xt0 xt0Var = new xt0(4, this);
                try {
                    uj.y(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    xt0Var.i(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    xt0Var.i(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            xt0 xt0Var2 = new xt0(4, this);
            if (Build.VERSION.SDK_INT < 24) {
                xt0Var2.i(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                xt0Var2.i(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        xt0 xt0Var3 = new xt0(4, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            xt0Var3.i(16, null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            codeCacheDir = jf.d(context).getCacheDir();
        } else if (i >= 24) {
            codeCacheDir = jf.d(context).getCodeCacheDir();
        } else {
            codeCacheDir = i == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (bu0.j(codeCacheDir)) {
            xt0Var3.i(14, null);
        } else {
            xt0Var3.i(15, null);
        }
    }
}
