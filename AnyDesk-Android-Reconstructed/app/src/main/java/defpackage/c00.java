package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.element.FileManagerAttrsDetailed;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class c00 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ FileManagerFileListFragment d;

    public /* synthetic */ c00(FileManagerFileListFragment fileManagerFileListFragment, int i) {
        this.c = i;
        this.d = fileManagerFileListFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        FileManagerFileListFragment fileManagerFileListFragment = this.d;
        switch (i) {
            case 0:
                x00 x00Var = fileManagerFileListFragment.b0;
                if (x00Var != null) {
                    fileManagerFileListFragment.W0(x00Var.u());
                    break;
                }
                break;
            case 1:
                if (!fileManagerFileListFragment.d0 && !fileManagerFileListFragment.c0) {
                    MainApplication mainApplicationV = MainApplication.v();
                    FileManagerAttrsDetailed fileManagerAttrsDetailed = fileManagerFileListFragment.p0;
                    if (fileManagerAttrsDetailed != null) {
                        fileManagerAttrsDetailed.setAddr(mainApplicationV.j + " (" + t70.f(mainApplicationV.m) + ")");
                    }
                    break;
                }
                break;
            default:
                fileManagerFileListFragment.c1();
                fileManagerFileListFragment.V0();
                fileManagerFileListFragment.Y0();
                break;
        }
    }
}
