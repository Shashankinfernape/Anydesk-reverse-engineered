package defpackage;

import com.anydesk.anydeskandroid.gui.element.FileManagerAttrsTab;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class b00 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ FileManagerFileListFragment e;

    public /* synthetic */ b00(FileManagerFileListFragment fileManagerFileListFragment, boolean z, int i) {
        this.c = i;
        this.e = fileManagerFileListFragment;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.d;
        FileManagerFileListFragment fileManagerFileListFragment = this.e;
        switch (i) {
            case 0:
                fileManagerFileListFragment.a1(z, true);
                break;
            case 1:
                fileManagerFileListFragment.a1(z, false);
                break;
            case 2:
                if (!fileManagerFileListFragment.d0) {
                    fileManagerFileListFragment.a1(z, false);
                } else {
                    FileManagerAttrsTab fileManagerAttrsTab = fileManagerFileListFragment.c0 ? fileManagerFileListFragment.o0 : fileManagerFileListFragment.n0;
                    if (fileManagerAttrsTab != null) {
                        fileManagerAttrsTab.setBadge(0);
                    }
                }
                break;
            case 3:
                fileManagerFileListFragment.a1(z, false);
                break;
            case 4:
                fileManagerFileListFragment.a1(z, false);
                break;
            default:
                fileManagerFileListFragment.a1(z, false);
                break;
        }
    }
}
