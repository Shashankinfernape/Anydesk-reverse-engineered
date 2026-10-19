package defpackage;

import j$.util.DesugarArrays;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class yj implements bs {
    public final bs[] a;
    public final long b;

    public yj(bs... bsVarArr) {
        this.a = bsVarArr;
        this.b = DesugarArrays.stream(bsVarArr).mapToLong(new xj(0)).sum();
    }

    @Override // defpackage.bs
    public final ByteBuffer a(int i, long j) {
        long j2 = i;
        long j3 = j + j2;
        long j4 = this.b;
        if (j3 > j4) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        int i2 = 0;
        long size = j;
        while (true) {
            bs[] bsVarArr = this.a;
            if (i2 >= bsVarArr.length) {
                throw new IndexOutOfBoundsException("Access is out of bound, offset: " + j + ", totalSize: " + j4);
            }
            if (size < bsVarArr[i2].size()) {
                rt0 rt0Var = new rt0(Integer.valueOf(i2), Long.valueOf(size));
                int iIntValue = ((Integer) rt0Var.a).intValue();
                long jLongValue = ((Long) rt0Var.b).longValue();
                if (j2 + jLongValue <= bsVarArr[iIntValue].size()) {
                    return bsVarArr[iIntValue].a(i, jLongValue);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                while (iIntValue < bsVarArr.length && byteBufferAllocate.hasRemaining()) {
                    long jMin = Math.min(bsVarArr[iIntValue].size() - jLongValue, byteBufferAllocate.remaining());
                    bs bsVar = bsVarArr[iIntValue];
                    int i3 = (int) jMin;
                    if (jMin != i3) {
                        throw new ArithmeticException();
                    }
                    bsVar.c(jLongValue, i3, byteBufferAllocate);
                    iIntValue++;
                    jLongValue = 0;
                }
                byteBufferAllocate.rewind();
                return byteBufferAllocate;
            }
            size -= bsVarArr[i2].size();
            i2++;
        }
    }

    @Override // defpackage.bs
    public final void b(long j, long j2, as asVar) {
        as asVar2;
        if (j + j2 > this.b) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        bs[] bsVarArr = this.a;
        int length = bsVarArr.length;
        int i = 0;
        long size = j;
        long j3 = j2;
        while (i < length) {
            bs bsVar = bsVarArr[i];
            if (size >= bsVar.size()) {
                size -= bsVar.size();
                asVar2 = asVar;
            } else {
                long size2 = bsVar.size() - size;
                if (size2 >= j3) {
                    bsVar.b(size, j3, asVar);
                    return;
                }
                asVar2 = asVar;
                bsVar.b(size, size2, asVar2);
                j3 -= size2;
                size = 0;
            }
            i++;
            asVar = asVar2;
        }
    }

    @Override // defpackage.bs
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        b(j, i, new zh(1, byteBuffer));
    }

    @Override // defpackage.bs
    public final long size() {
        return this.b;
    }
}
