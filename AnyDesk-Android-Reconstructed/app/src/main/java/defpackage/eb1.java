package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;

/* JADX INFO: loaded from: classes.dex */
public final class eb1 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ TraceFragment d;

    public /* synthetic */ eb1(TraceFragment traceFragment, int i) {
        this.c = i;
        this.d = traceFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        TraceFragment traceFragment = this.d;
        switch (i) {
            case 0:
                traceFragment.V0();
                break;
            default:
                traceFragment.V0();
                break;
        }
    }
}
