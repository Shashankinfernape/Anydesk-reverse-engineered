package defpackage;

import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends pp {
    public int j;
    public int k;
    public zf l;

    @Override // defpackage.pp
    public final void g(AttributeSet attributeSet) {
        zf zfVar = new zf();
        zfVar.s0 = 0;
        zfVar.t0 = true;
        zfVar.u0 = 0;
        zfVar.v0 = false;
        this.l = zfVar;
        this.f = zfVar;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.l.t0;
    }

    public int getMargin() {
        return this.l.u0;
    }

    public int getType() {
        return this.j;
    }

    @Override // defpackage.pp
    public final void h(bq bqVar, boolean z) {
        int i = this.j;
        this.k = i;
        if (z) {
            if (i == 5) {
                this.k = 1;
            } else if (i == 6) {
                this.k = 0;
            }
        } else if (i == 5) {
            this.k = 0;
        } else if (i == 6) {
            this.k = 1;
        }
        if (bqVar instanceof zf) {
            ((zf) bqVar).s0 = this.k;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.t0 = z;
    }

    public void setDpMargin(int i) {
        this.l.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.u0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }
}
