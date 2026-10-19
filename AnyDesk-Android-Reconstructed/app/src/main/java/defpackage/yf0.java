package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class yf0 implements Iterator, yd0 {
    public final String c;
    public int d;
    public int e;
    public int f;
    public int g;

    public yf0(String str) {
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.d;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.g < 0) {
            this.d = 2;
            return false;
        }
        String str = this.c;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.e; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.d = 1;
                this.g = i;
                this.f = length;
                return true;
            }
        }
        i = -1;
        this.d = 1;
        this.g = i;
        this.f = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = 0;
        int i = this.f;
        int i2 = this.e;
        this.e = this.g + i;
        return this.c.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
