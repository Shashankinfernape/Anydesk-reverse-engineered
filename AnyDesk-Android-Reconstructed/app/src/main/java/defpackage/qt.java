package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qt {
    public final Executor a;
    public final gv0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public rt[] g;
    public byte[] h;

    public qt(AssetManager assetManager, Executor executor, gv0 gv0Var, String str, File file) {
        this.a = executor;
        this.b = gv0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = ds.n;
                        break;
                    case 26:
                        bArr = ds.m;
                        break;
                    case 27:
                        bArr = ds.l;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = ds.k;
                        break;
                }
            } else {
                bArr = ds.j;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.e();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new yn(i, 2, this, serializable));
    }
}
