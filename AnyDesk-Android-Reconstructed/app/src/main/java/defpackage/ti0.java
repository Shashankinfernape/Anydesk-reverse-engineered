package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dj e;

    public /* synthetic */ ti0(dj djVar, String str, int i) {
        this.c = i;
        this.e = djVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.d;
        dj djVar = this.e;
        switch (i) {
            case 0:
                ((si0) djVar.d).d.g1(str);
                break;
            default:
                ((si0) djVar.d).d.g1(str);
                break;
        }
    }
}
