package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends eg {
    public int h;
    public int i;
    public boolean j;
    public int k;

    @Override // defpackage.eg
    public final void a() {
        super.a();
        if (this.k < 0) {
            id.q("Stop indicator size must be >= 0.");
            return;
        }
        if (this.h == 0) {
            if (this.b > 0 && this.g == 0) {
                id.q("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.c.length >= 3) {
                    return;
                }
                id.q("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
