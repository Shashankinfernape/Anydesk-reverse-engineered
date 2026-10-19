package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class vh implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ xh d;

    public /* synthetic */ vh(xh xhVar, int i) {
        this.c = i;
        this.d = xhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        xh xhVar = this.d;
        switch (i) {
            case 0:
                yh yhVar = xhVar.a;
                ArrayDeque arrayDeque = yhVar.h;
                while (!arrayDeque.isEmpty()) {
                    le0 le0Var = ((d11) arrayDeque.poll()).b;
                    if (le0Var != null) {
                        le0Var.u(0, null);
                    }
                }
                yhVar.f = true;
                break;
            default:
                yh yhVar2 = xhVar.a;
                yhVar2.e = true;
                yhVar2.a = null;
                break;
        }
    }
}
