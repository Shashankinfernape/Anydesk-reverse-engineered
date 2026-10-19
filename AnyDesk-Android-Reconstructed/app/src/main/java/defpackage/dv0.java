package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class dv0 implements gf0 {
    public static final dv0 k = new dv0();
    public int c;
    public int d;
    public Handler g;
    public boolean e = true;
    public boolean f = true;
    public final if0 h = new if0(this);
    public final l i = new l(16, this);
    public final xt0 j = new xt0(3, this);

    @Override // defpackage.gf0
    public final if0 R() {
        return this.h;
    }

    public final void a() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            if (this.e) {
                this.h.d(ze0.ON_RESUME);
                this.e = false;
            } else {
                Handler handler = this.g;
                handler.getClass();
                handler.removeCallbacks(this.i);
            }
        }
    }
}
