package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.FileManagerFragment;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ FileManagerFragment d;

    public /* synthetic */ l00(FileManagerFragment fileManagerFragment, int i) {
        this.c = i;
        this.d = fileManagerFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        FileManagerFragment fileManagerFragment = this.d;
        switch (i) {
            case 0:
                r3.I(fileManagerFragment.f0, 0);
                break;
            default:
                r3.I(fileManagerFragment.f0, 4);
                break;
        }
    }
}
