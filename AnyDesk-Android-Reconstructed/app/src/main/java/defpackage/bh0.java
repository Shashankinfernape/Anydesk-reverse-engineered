package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh0 {
    static {
        ByteBuffer.allocate(0);
    }

    public static byte[] a(bs bsVar, tj tjVar, long j) {
        long j2 = tjVar.e;
        String str = tjVar.g;
        if (j2 > 2147483647L) {
            throw new IOException(str + " too large: " + j2);
        }
        try {
            byte[] bArr = new byte[(int) j2];
            b(bsVar, tjVar, j, new zh(1, ByteBuffer.wrap(bArr)));
            return bArr;
        } catch (OutOfMemoryError e) {
            throw new IOException(str + " too large: " + j2, e);
        }
    }

    public static void b(bs bsVar, tj tjVar, long j, as asVar) throws Throwable {
        ah0 ah0Var;
        String str = tjVar.g;
        int i = tjVar.h;
        int i2 = i + 30;
        long j2 = tjVar.f;
        long j3 = ((long) i2) + j2;
        if (j3 > j) {
            id.j("Local File Header of ", str, " extends beyond start of Central Directory. LFH end: ", j3, ", CD start: ", j);
            return;
        }
        try {
            ByteBuffer byteBufferA = bsVar.a(i2, j2);
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            int i3 = byteBufferA.getInt();
            if (i3 != 67324752) {
                StringBuilder sbN = q51.n("Not a Local File Header record for entry ", str, ". Signature: 0x");
                sbN.append(Long.toHexString(((long) i3) & 4294967295L));
                throw new sh1(sbN.toString());
            }
            boolean z = (byteBufferA.getShort(6) & 8) != 0;
            boolean z2 = (tjVar.a & 8) != 0;
            if (z != z2) {
                throw new sh1("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + str + ". LFH: " + z + ", CD: " + z2);
            }
            long j4 = tjVar.c;
            long j5 = tjVar.d;
            long j6 = tjVar.e;
            if (!z) {
                long j7 = ((long) byteBufferA.getInt(14)) & 4294967295L;
                if (j7 != j4) {
                    id.j("CRC-32 mismatch between Local File Header and Central Directory for entry ", str, ". LFH: ", j7, ", CD: ", j4);
                    return;
                }
                long j8 = ((long) byteBufferA.getInt(18)) & 4294967295L;
                if (j8 != j5) {
                    id.j("Compressed size mismatch between Local File Header and Central Directory for entry ", str, ". LFH: ", j8, ", CD: ", j5);
                    return;
                }
                long j9 = ((long) byteBufferA.getInt(22)) & 4294967295L;
                if (j9 != j6) {
                    id.j("Uncompressed size mismatch between Local File Header and Central Directory for entry ", str, ". LFH: ", j9, ", CD: ", j6);
                    return;
                }
            }
            int i4 = byteBufferA.getShort(26) & 65535;
            if (i4 > i) {
                throw new sh1("Name mismatch between Local File Header and Central Directory for entry" + str + ". LFH: " + i4 + " bytes, CD: " + i + " bytes");
            }
            String strA = tj.a(30, i4, byteBufferA);
            if (!str.equals(strA)) {
                throw new sh1("Name mismatch between Local File Header and Central Directory. LFH: \"" + strA + "\", CD: \"" + str + "\"");
            }
            int i5 = byteBufferA.getShort(28) & 65535;
            long j10 = j2 + 30 + ((long) i4) + ((long) i5);
            boolean z3 = tjVar.b != 0;
            long j11 = z3 ? j5 : j6;
            long j12 = j10 + j11;
            if (j12 > j) {
                throw new sh1("Local File Header data of " + str + " overlaps with Central Directory. LFH data start: " + j10 + ", LFH data end: " + j12 + ", CD start: " + j);
            }
            long j13 = j2 + ((long) (i4 + 30 + i5));
            try {
                if (!z3) {
                    bsVar.b(j13, j11, asVar);
                    return;
                }
                try {
                    ah0 ah0Var2 = new ah0(asVar);
                    try {
                        bsVar.b(j13, j11, ah0Var2);
                        ah0Var = ah0Var2;
                        try {
                            long j14 = ah0Var.g;
                            if (j14 == j6) {
                                ah0Var.close();
                                return;
                            }
                            throw new sh1("Unexpected size of uncompressed data of " + str + ". Expected: " + j6 + " bytes, actual: " + j14 + " bytes");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                ah0Var.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ah0Var = ah0Var2;
                    }
                } catch (IOException e) {
                    if (!(e.getCause() instanceof DataFormatException)) {
                        throw e;
                    }
                    throw new sh1("Data of entry " + str + " malformed", e);
                }
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("Failed to read data of ");
                sb.append(z3 ? "compressed" : "uncompressed");
                sb.append(" entry ");
                sb.append(str);
                throw new IOException(sb.toString(), e2);
            }
        } catch (IOException e3) {
            throw new IOException("Failed to read Local File Header of ".concat(str), e3);
        }
    }
}
