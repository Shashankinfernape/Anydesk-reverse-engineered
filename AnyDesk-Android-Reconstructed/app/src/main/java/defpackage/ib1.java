package defpackage;

import android.os.FileObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ib1 extends FileObserver {
    public final /* synthetic */ jb1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(jb1 jb1Var, String str) {
        super(str, 2);
        this.a = jb1Var;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 2) {
            this.a.a();
        }
    }
}
