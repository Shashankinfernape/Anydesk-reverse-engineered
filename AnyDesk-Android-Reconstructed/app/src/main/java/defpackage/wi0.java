package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class wi0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ MainFragment e;

    public /* synthetic */ wi0(MainFragment mainFragment, String str, int i) {
        this.c = i;
        this.e = mainFragment;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.d;
        MainFragment mainFragment = this.e;
        switch (i) {
            case 0:
                mainFragment.e1(str);
                break;
            default:
                mainFragment.g1(str);
                break;
        }
    }
}
