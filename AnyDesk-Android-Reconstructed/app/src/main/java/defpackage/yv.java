package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yv implements Comparable {
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        int i = zv.a;
        c = hq.o(4611686018427387903L);
        d = hq.o(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return hq.o(th1.i(j4));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = zv.a;
        return j5;
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            strValueOf.getClass();
            if (i3 < 0) {
                id.q(q51.k(i3, "Desired length ", " is less than zero."));
                return;
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    public static final boolean c(long j) {
        return j == c || j == d;
    }

    public static final long d(long j, aw awVar) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return awVar.c.convert(j >> 1, ((((int) j) & 1) == 0 ? aw.NANOSECONDS : aw.MILLISECONDS).c);
    }

    public static String e(long j) {
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = ((long) (((int) j) & 1)) + ((-(j >> 1)) << 1);
            int i3 = zv.a;
        }
        long jD = d(j, aw.DAYS);
        int iD = c(j) ? 0 : (int) (d(j, aw.HOURS) % 24);
        int iD2 = c(j) ? 0 : (int) (d(j, aw.MINUTES) % 60);
        int iD3 = c(j) ? 0 : (int) (d(j, aw.SECONDS) % 60);
        if (c(j)) {
            i = 0;
        } else {
            i = (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
        }
        boolean z2 = jD != 0;
        boolean z3 = iD != 0;
        boolean z4 = iD2 != 0;
        boolean z5 = (iD3 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(jD);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iD);
            sb.append('h');
            i2 = i4;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iD2);
            sb.append('m');
            i2 = i5;
        }
        if (z5) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iD3 != 0 || z2 || z3 || z4) {
                b(sb, iD3, i, 9, "s", false);
            } else if (i >= 1000000) {
                b(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                b(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i2 = i6;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
