package defpackage;

import android.os.FileObserver;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class hb1 extends FileObserver {
    public final /* synthetic */ jb1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(jb1 jb1Var, File file) {
        super(file, 2);
        this.a = jb1Var;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 2) {
            this.a.a();
        }
    }
}
