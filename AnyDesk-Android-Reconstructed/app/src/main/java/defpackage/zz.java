package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class zz implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ FileManagerFileListFragment d;

    public /* synthetic */ zz(FileManagerFileListFragment fileManagerFileListFragment, int i) {
        this.c = i;
        this.d = fileManagerFileListFragment;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.c;
        FileManagerFileListFragment fileManagerFileListFragment = this.d;
        switch (i) {
            case 0:
                v00 v00Var = (v00) obj;
                if (v00Var != null) {
                    if (!fileManagerFileListFragment.c0) {
                        FileManagerFileListFragment.R0(fileManagerFileListFragment, v00Var);
                        FileManagerFileListFragment.S0(fileManagerFileListFragment, v00Var.a);
                    } else {
                        fileManagerFileListFragment.i1(v00Var);
                    }
                    break;
                }
                break;
            default:
                v00 v00Var2 = (v00) obj;
                if (v00Var2 != null) {
                    if (!fileManagerFileListFragment.c0) {
                        fileManagerFileListFragment.i1(v00Var2);
                    } else {
                        FileManagerFileListFragment.R0(fileManagerFileListFragment, v00Var2);
                        FileManagerFileListFragment.S0(fileManagerFileListFragment, v00Var2.a);
                    }
                    break;
                }
                break;
        }
    }
}
