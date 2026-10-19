package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class kq0 implements View.OnGenericMotionListener, View.OnTouchListener {
    public final ConnectionFragment c;
    public final ConnectionFragment d;
    public final iq0 e;
    public final hq0 f;
    public boolean g = false;
    public int h;
    public int i;
    public int j;
    public int k;
    public double l;
    public double m;
    public long n;

    public kq0(ConnectionFragment connectionFragment, ConnectionFragment connectionFragment2, int i, int i2, double d, double d2) {
        jq0 jq0Var = new jq0(this);
        ev evVar = new ev(27, this);
        this.c = connectionFragment;
        this.d = connectionFragment2;
        this.h = i;
        this.i = i2;
        this.l = 1.0d;
        this.m = 0.5d;
        this.j = (int) (1.0d * ((double) i));
        this.k = (int) (0.5d * ((double) i2));
        this.e = new iq0(jq0Var);
        this.f = new hq0(evVar, d, d2);
        this.n = 0L;
    }

    public final void a(double d, double d2) {
        int i;
        this.l = d;
        this.m = d2;
        hq0 hq0Var = this.f;
        hq0Var.b(true);
        int i2 = this.h;
        if (i2 <= 0 || (i = this.i) <= 0) {
            return;
        }
        int i3 = (int) (((double) i2) * d);
        int i4 = (int) (((double) i) * d2);
        hq0Var.f = i3;
        hq0Var.g = i4;
        hq0Var.h = i3;
        hq0Var.i = i4;
        hq0Var.j = i3;
        hq0Var.k = i4;
        hq0Var.p.o(i3, i4);
        this.f.a(this.j, this.k, this.h, this.i, 0.0f, 0.0f);
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        this.e.onTouch(view, motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.e.onTouch(view, motionEvent);
        return true;
    }
}
