package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class z7 {
    public final int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public z7(y7 y7Var) throws a8 {
        long j;
        int iRemaining;
        this.e = new HashMap();
        ByteBuffer byteBuffer = (ByteBuffer) y7Var.d;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.order(byteBuffer.order());
        int iRemaining2 = byteBufferSlice.remaining();
        byteBufferSlice.position(8);
        if (byteBufferSlice.remaining() < 20) {
            throw new a8("XML chunk's header too short. Required at least 20 bytes. Available: " + byteBufferSlice.remaining() + " bytes");
        }
        long j2 = ((long) byteBufferSlice.getInt()) & 4294967295L;
        if (j2 > 2147483647L) {
            throw new a8("Too many strings: " + j2);
        }
        int i = (int) j2;
        this.a = i;
        long j3 = ((long) byteBufferSlice.getInt()) & 4294967295L;
        if (j3 > 2147483647L) {
            throw new a8("Too many styles: " + j3);
        }
        long j4 = byteBufferSlice.getInt();
        long j5 = ((long) byteBufferSlice.getInt()) & 4294967295L;
        long j6 = ((long) byteBufferSlice.getInt()) & 4294967295L;
        ByteBuffer byteBufferD = y7Var.d();
        if (i > 0) {
            long j7 = iRemaining2;
            j = 0;
            int i2 = (int) (j5 - j7);
            if (j3 <= 0) {
                iRemaining = byteBufferD.remaining();
            } else {
                if (j6 < j5) {
                    throw new a8("Styles offset (" + j6 + ") < strings offset (" + j5 + ")");
                }
                iRemaining = (int) (j6 - j7);
            }
            this.d = b8.f(i2, iRemaining, byteBufferD);
        } else {
            j = 0;
            this.d = ByteBuffer.allocate(0);
        }
        this.b = (256 & j4) != j;
        this.c = byteBufferD;
    }

    public boolean a() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!((ArrayList) this.e).isEmpty()) {
            return true;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((j9) obj).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!((ArrayList) this.d).isEmpty()) {
            return true;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((j9) obj).c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String c(long j) throws a8 {
        byte[] bArrArray;
        String str;
        byte[] bArrArray2;
        HashMap map = (HashMap) this.e;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        if (j < 0) {
            throw new a8("Unsuported string index: " + j);
        }
        int i = this.a;
        if (j >= i) {
            StringBuilder sb = new StringBuilder("Unsuported string index: ");
            sb.append(j);
            sb.append(", max: ");
            sb.append(i - 1);
            throw new a8(sb.toString());
        }
        int i2 = (int) j;
        String str2 = (String) map.get(Integer.valueOf(i2));
        if (str2 != null) {
            return str2;
        }
        long j2 = ((long) ((ByteBuffer) this.c).getInt(i2 * 4)) & 4294967295L;
        if (j2 >= byteBuffer.capacity()) {
            throw new a8("Offset of string idx " + i2 + " out of bounds: " + j2 + ", max: " + (byteBuffer.capacity() - 1));
        }
        byteBuffer.position((int) j2);
        int iArrayOffset = 0;
        if (this.b) {
            if ((byteBuffer.get() & 128) != 0) {
                byteBuffer.get();
            }
            byte b = byteBuffer.get();
            int i3 = b & 255;
            if ((b & 128) != 0) {
                i3 = (byteBuffer.get() & 255) | ((b & 127) << 8);
            }
            if (byteBuffer.hasArray()) {
                bArrArray2 = byteBuffer.array();
                iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i3);
            } else {
                bArrArray2 = new byte[i3];
                byteBuffer.get(bArrArray2);
            }
            if (bArrArray2[iArrayOffset + i3] != 0) {
                throw new a8("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                str = new String(bArrArray2, iArrayOffset, i3, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 character encoding not supported", e);
            }
        } else {
            short s = byteBuffer.getShort();
            int i4 = s & 65535;
            if ((Short.MIN_VALUE & s) != 0) {
                i4 = ((s & Short.MAX_VALUE) << 16) | (65535 & byteBuffer.getShort());
            }
            if (i4 > 1073741823) {
                throw new a8(q51.k(i4, "String too long: ", " uint16s"));
            }
            int i5 = i4 * 2;
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i5);
            } else {
                bArrArray = new byte[i5];
                byteBuffer.get(bArrArray);
            }
            int i6 = iArrayOffset + i5;
            if (bArrArray[i6] != 0 || bArrArray[i6 + 1] != 0) {
                throw new a8("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                str = new String(bArrArray, iArrayOffset, i5, "UTF-16LE");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e2);
            }
        }
        map.put(Integer.valueOf(i2), str);
        return str;
    }

    public z7(int i) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = i;
    }
}
