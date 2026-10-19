package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t01 implements Serializable, CharSequence {
    public static final char[] d = new char[0];
    public static final t01 e = new t01();
    public final char[] c;

    public t01(t01 t01Var) {
        char[] cArr = t01Var.c;
        this.c = Arrays.copyOf(cArr, cArr.length);
    }

    public static t01 a(t01 t01Var) {
        return (t01Var == null || t01Var.isEmpty()) ? e : new t01(t01Var);
    }

    public static t01 d(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? e : new t01(cArr);
    }

    public final void b() {
        Arrays.fill(this.c, (char) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final t01 c() {
        char[] cArrCopyOfRange;
        char[] cArr = this.c;
        if (cArr == null) {
            cArrCopyOfRange = null;
        } else {
            int length = cArr.length;
            char[] cArr2 = d;
            if (length == 0) {
                cArrCopyOfRange = cArr2;
            } else {
                boolean zIsWhitespace = Character.isWhitespace(cArr[0]);
                int i = length - 1;
                boolean zIsWhitespace2 = Character.isWhitespace(cArr[i]);
                if (zIsWhitespace || zIsWhitespace2) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = 0;
                            break;
                        }
                        if (!Character.isWhitespace(cArr[i2])) {
                            break;
                        }
                        i2++;
                    }
                    if (zIsWhitespace && i2 == 0) {
                        cArrCopyOfRange = cArr2;
                    } else if (zIsWhitespace2) {
                        int i3 = i;
                        while (true) {
                            if (i3 <= i2) {
                                i3 = i;
                                break;
                            }
                            if (!Character.isWhitespace(cArr[i3])) {
                                break;
                            }
                            i3--;
                        }
                        cArrCopyOfRange = i3 == i ? new char[]{cArr[i2]} : Arrays.copyOfRange(cArr, i2, i3 + 1);
                    } else {
                        cArrCopyOfRange = Arrays.copyOfRange(cArr, i2, length);
                    }
                } else {
                    cArrCopyOfRange = Arrays.copyOf(cArr, length);
                }
            }
        }
        return d(cArrCopyOfRange);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t01) {
            return Arrays.equals(this.c, ((t01) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final boolean isEmpty() {
        return this.c.length == 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return "***";
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return "***";
    }

    public t01(char[] cArr) {
        this.c = cArr;
    }

    public t01() {
        this.c = d;
    }
}
