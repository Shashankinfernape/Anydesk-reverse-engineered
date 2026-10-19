package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class mc1 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ah b;
    public volatile int c = 0;

    public mc1(ah ahVar, int i) {
        this.b = ahVar;
        this.a = i;
    }

    public final int a(int i) {
        pl0 pl0VarB = b();
        int iA = pl0VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) pl0VarB.f;
        int i2 = iA + pl0VarB.c;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final pl0 b() {
        ThreadLocal threadLocal = d;
        pl0 pl0Var = (pl0) threadLocal.get();
        if (pl0Var == null) {
            pl0Var = new pl0();
            threadLocal.set(pl0Var);
        }
        ql0 ql0Var = (ql0) this.b.a;
        int iA = ql0Var.a(6);
        if (iA != 0) {
            int i = iA + ql0Var.c;
            int i2 = (this.a * 4) + ((ByteBuffer) ql0Var.f).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ql0Var.f).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ql0Var.f;
            pl0Var.f = byteBuffer;
            if (byteBuffer != null) {
                pl0Var.c = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                pl0Var.d = i4;
                pl0Var.e = ((ByteBuffer) pl0Var.f).getShort(i4);
                return pl0Var;
            }
            pl0Var.c = 0;
            pl0Var.d = 0;
            pl0Var.e = 0;
        }
        return pl0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        pl0 pl0VarB = b();
        int iA = pl0VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) pl0VarB.f).getInt(iA + pl0VarB.c) : 0));
        sb.append(", codepoints:");
        pl0 pl0VarB2 = b();
        int iA2 = pl0VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + pl0VarB2.c;
            i = ((ByteBuffer) pl0VarB2.f).getInt(((ByteBuffer) pl0VarB2.f).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
