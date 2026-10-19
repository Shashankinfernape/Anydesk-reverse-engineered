package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.AccountLoginFragment;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountLoginFragment d;

    public /* synthetic */ h4(AccountLoginFragment accountLoginFragment, int i) {
        this.c = i;
        this.d = accountLoginFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        AccountLoginFragment accountLoginFragment = this.d;
        switch (i) {
            case 0:
                accountLoginFragment.Y0(false);
                accountLoginFragment.T0();
                break;
            case 1:
                accountLoginFragment.S0(false);
                break;
            default:
                accountLoginFragment.Y0(false);
                accountLoginFragment.T0();
                break;
        }
    }
}
