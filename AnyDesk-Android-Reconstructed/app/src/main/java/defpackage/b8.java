package defpackage;

import com.samsung.android.knox.EnterpriseDeviceManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b8 {
    public final ByteBuffer a;
    public z7 b;
    public v7 c;
    public int d;
    public int e = 1;
    public String f;
    public String g;
    public int h;
    public ArrayList i;
    public ByteBuffer j;
    public int k;

    public b8(ByteBuffer byteBuffer) throws a8 {
        y7 y7VarC;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        do {
            if (!byteBuffer.hasRemaining() || (y7VarC = y7.c(byteBuffer)) == null) {
                y7VarC = null;
                break;
            }
        } while (y7VarC.c != 3);
        if (y7VarC == null) {
            throw new a8("No XML chunk in file");
        }
        this.a = y7VarC.d();
    }

    public static ByteBuffer f(int i, int i2, ByteBuffer byteBuffer) {
        if (i < 0) {
            id.q(gr0.e(i, "start: "));
            return null;
        }
        if (i2 < i) {
            v.f("end < start: ", i2, " < ", i);
            return null;
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            v.f("end > capacity: ", i2, " > ", iCapacity);
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("start: " + j);
        }
        if (j2 < j) {
            throw new IllegalArgumentException("end < start: " + j2 + " < " + j);
        }
        int iCapacity = byteBuffer.capacity();
        if (j2 <= byteBuffer.capacity()) {
            return f((int) j, (int) j2, byteBuffer);
        }
        throw new IllegalArgumentException("end > capacity: " + j2 + " > " + iCapacity);
    }

    public final x7 a(int i) {
        if (this.e != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (i >= this.h) {
            throw new IndexOutOfBoundsException("index must be <= attr count (" + this.h + ")");
        }
        if (this.i == null) {
            this.i = new ArrayList(this.h);
            for (int i2 = 0; i2 < this.h; i2++) {
                int i3 = this.k;
                int i4 = i2 * i3;
                ByteBuffer byteBufferF = f(i4, i3 + i4, this.j);
                byteBufferF.getInt();
                long j = ((long) byteBufferF.getInt()) & 4294967295L;
                byteBufferF.position(byteBufferF.position() + 7);
                this.i.add(new x7(j, byteBufferF.get() & 255, (int) (((long) byteBufferF.getInt()) & 4294967295L), this.b, this.c));
            }
        }
        return (x7) this.i.get(i);
    }

    public final int b(int i) {
        x7 x7VarA = a(i);
        int i2 = x7VarA.b;
        if (i2 != 1) {
            switch (i2) {
                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                    break;
                default:
                    throw new a8(gr0.e(i2, "Cannot coerce to int: value type "));
            }
        }
        return x7VarA.c;
    }

    public final int c(int i) {
        x7 x7VarA = a(i);
        v7 v7Var = x7VarA.e;
        if (v7Var == null) {
            return 0;
        }
        long j = x7VarA.a;
        if (j < 0 || j >= v7Var.c) {
            return 0;
        }
        return ((ByteBuffer) v7Var.d).getInt(((int) j) * 4);
    }

    public final String d(int i) throws a8 {
        x7 x7VarA = a(i);
        int i2 = x7VarA.c;
        int i3 = x7VarA.b;
        if (i3 == 1) {
            return "@" + Integer.toHexString(i2);
        }
        if (i3 == 3) {
            return x7VarA.d.c(((long) i2) & 4294967295L);
        }
        switch (i3) {
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return Integer.toString(i2);
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return "0x" + Integer.toHexString(i2);
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return Boolean.toString(i2 != 0);
            default:
                throw new a8(gr0.e(i3, "Cannot coerce to string: value type "));
        }
    }

    public final int e() {
        y7 y7VarC;
        int i = 1;
        if (this.e == 4) {
            this.d--;
        }
        while (true) {
            ByteBuffer byteBuffer = this.a;
            if (!byteBuffer.hasRemaining() || (y7VarC = y7.c(byteBuffer)) == null) {
                break;
            }
            int i2 = y7VarC.c;
            if (i2 != i) {
                if (i2 != 384) {
                    if (i2 == 258) {
                        if (this.b == null) {
                            throw new a8("Named element encountered before string pool");
                        }
                        ByteBuffer byteBufferD = y7VarC.d();
                        if (byteBufferD.remaining() < 20) {
                            throw new a8("Start element chunk too short. Need at least 20 bytes. Available: " + byteBufferD.remaining() + " bytes");
                        }
                        long j = ((long) byteBufferD.getInt()) & 4294967295L;
                        long j2 = ((long) byteBufferD.getInt()) & 4294967295L;
                        int i3 = byteBufferD.getShort() & 65535;
                        int i4 = byteBufferD.getShort() & 65535;
                        int i5 = 65535 & byteBufferD.getShort();
                        long j3 = i3;
                        long j4 = (((long) i5) * ((long) i4)) + j3;
                        byteBufferD.position(0);
                        if (i3 > byteBufferD.remaining()) {
                            throw new a8("Attributes start offset out of bounds: " + i3 + ", max: " + byteBufferD.remaining());
                        }
                        if (j4 > byteBufferD.remaining()) {
                            throw new a8("Attributes end offset out of bounds: " + j4 + ", max: " + byteBufferD.remaining());
                        }
                        this.f = this.b.c(j2);
                        this.g = j == 4294967295L ? "" : this.b.c(j);
                        this.h = i5;
                        this.i = null;
                        this.k = i4;
                        this.j = g(byteBufferD, j3, j4);
                        this.d++;
                        this.e = 3;
                        return 3;
                    }
                    if (i2 == 259) {
                        if (this.b == null) {
                            throw new a8("Named element encountered before string pool");
                        }
                        ByteBuffer byteBufferD2 = y7VarC.d();
                        if (byteBufferD2.remaining() < 8) {
                            throw new a8("End element chunk too short. Need at least 8 bytes. Available: " + byteBufferD2.remaining() + " bytes");
                        }
                        long j5 = ((long) byteBufferD2.getInt()) & 4294967295L;
                        this.f = this.b.c(((long) byteBufferD2.getInt()) & 4294967295L);
                        this.g = j5 != 4294967295L ? this.b.c(j5) : "";
                        this.e = 4;
                        this.i = null;
                        this.j = null;
                        return 4;
                    }
                } else {
                    if (this.c != null) {
                        throw new a8("Multiple resource maps not supported");
                    }
                    this.c = new v7(y7VarC);
                }
            } else {
                if (this.b != null) {
                    throw new a8("Multiple string pools not supported");
                }
                this.b = new z7(y7VarC);
            }
            i = 1;
        }
        this.e = 2;
        return 2;
    }
}
