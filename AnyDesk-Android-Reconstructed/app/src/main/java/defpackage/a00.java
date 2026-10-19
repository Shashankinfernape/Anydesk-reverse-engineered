package defpackage;

import android.content.Intent;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class a00 implements j6, vu0, r6 {
    public final /* synthetic */ FileManagerFileListFragment c;

    public /* synthetic */ a00(FileManagerFileListFragment fileManagerFileListFragment) {
        this.c = fileManagerFileListFragment;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        Intent intent;
        i6 i6Var = (i6) obj;
        if (i6Var == null || i6Var.c != -1 || (intent = i6Var.d) == null) {
            return;
        }
        FileManagerFileListFragment.P0(this.c, intent.getData());
    }

    @Override // defpackage.r6
    public void h(String str) {
        this.c.Q0.e(str);
        this.c.j1();
        this.c.l1();
        FileManagerFileListFragment fileManagerFileListFragment = this.c;
        x00 x00Var = fileManagerFileListFragment.b0;
        if (x00Var == null) {
            return;
        }
        boolean z = fileManagerFileListFragment.c0;
        synchronized (x00Var.b) {
            try {
                if (z) {
                    x00Var.p = str;
                } else {
                    x00Var.q = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r6
    public boolean k() {
        this.c.X0();
        return true;
    }

    @Override // defpackage.vu0
    public void onDismiss() {
        FileManagerFileListFragment fileManagerFileListFragment = this.c;
        g00 g00Var = fileManagerFileListFragment.m0;
        if (g00Var != null && g00Var.e) {
            fileManagerFileListFragment.c1();
        }
    }
}
