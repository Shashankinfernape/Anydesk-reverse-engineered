package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class tj {
    public static final he i = new he(3);
    public final short a;
    public final short b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    public tj(short s, short s2, long j, long j2, long j3, long j4, String str, int i2) {
        this.a = s;
        this.b = s2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = str;
        this.h = i2;
    }

    public static String a(int i2, int i3, ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset() + i2;
        } else {
            bArrArray = new byte[i3];
            int iPosition = byteBuffer.position();
            try {
                byteBuffer.position(i2);
                byteBuffer.get(bArrArray);
                byteBuffer.position(iPosition);
                iArrayOffset = 0;
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        }
        return new String(bArrArray, iArrayOffset, i3, StandardCharsets.UTF_8);
    }

    public static tj b(ByteBuffer byteBuffer) throws sh1 {
        bu0.e(byteBuffer);
        if (byteBuffer.remaining() < 46) {
            throw new sh1("Input too short. Need at least: 46 bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        int iPosition = byteBuffer.position();
        int i2 = byteBuffer.getInt();
        if (i2 != 33639248) {
            throw new sh1("Not a Central Directory record. Signature: 0x" + Long.toHexString(((long) i2) & 4294967295L));
        }
        byteBuffer.position(iPosition + 8);
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        long j = ((long) byteBuffer.getInt()) & 4294967295L;
        long j2 = ((long) byteBuffer.getInt()) & 4294967295L;
        long j3 = ((long) byteBuffer.getInt()) & 4294967295L;
        int i3 = byteBuffer.getShort() & 65535;
        int i4 = byteBuffer.getShort() & 65535;
        int i5 = byteBuffer.getShort() & 65535;
        byteBuffer.position(iPosition + 42);
        long j4 = ((long) byteBuffer.getInt()) & 4294967295L;
        byteBuffer.position(iPosition);
        int i6 = i3 + 46 + i4 + i5;
        if (i6 > byteBuffer.remaining()) {
            throw new sh1("Input too short. Need: " + i6 + " bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        String strA = a(iPosition + 46, i3, byteBuffer);
        byteBuffer.position(iPosition);
        int iLimit = byteBuffer.limit();
        int i7 = iPosition + i6;
        try {
            byteBuffer.limit(i7);
            byteBuffer.slice();
            byteBuffer.limit(iLimit);
            byteBuffer.position(i7);
            return new tj(s, s2, j, j2, j3, j4, strA, i3);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }
}
