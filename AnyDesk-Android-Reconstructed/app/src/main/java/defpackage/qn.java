package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ qa d;

    public /* synthetic */ qn(qa qaVar, int i) {
        this.c = i;
        this.d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        qa qaVar = this.d;
        switch (i) {
            case 0:
                qaVar.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!y90.e(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!y90.e(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
