package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class v90 extends t90 {
    public final int c;
    public final int d;
    public boolean e;
    public int f;

    public v90(int i, int i2, int i3) {
        this.c = i3;
        this.d = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.e = z;
        this.f = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // defpackage.t90
    public final int nextInt() {
        int i = this.f;
        if (i != this.d) {
            this.f = this.c + i;
            return i;
        }
        if (!this.e) {
            throw new NoSuchElementException();
        }
        this.e = false;
        return i;
    }
}
