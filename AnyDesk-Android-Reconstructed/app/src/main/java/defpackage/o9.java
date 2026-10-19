package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class o9 implements Supplier {
    public final bs[] a;
    public final int[] b;
    public final int c;
    public final AtomicInteger d;

    public o9(bs[] bsVarArr) {
        this.a = bsVarArr;
        this.b = new int[bsVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bsVarArr.length; i2++) {
            long size = (bsVarArr[i2].size() + 1048575) / 1048576;
            if (size > 2147483647L) {
                throw new RuntimeException(String.format("Number of chunks in dataSource[%d] is greater than max int.", Integer.valueOf(i2)));
            }
            this.b[i2] = (int) size;
            i = (int) (((long) i) + size);
        }
        this.c = i;
        this.d = new AtomicInteger(0);
    }

    @Override // java.util.function.Supplier
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n9 get() {
        bs[] bsVarArr;
        int andIncrement = this.d.getAndIncrement();
        if (andIncrement < 0 || andIncrement >= this.c) {
            return null;
        }
        long j = andIncrement;
        int i = 0;
        while (true) {
            bsVarArr = this.a;
            if (i >= bsVarArr.length) {
                break;
            }
            long j2 = this.b[i];
            if (j < j2) {
                break;
            }
            j -= j2;
            i++;
        }
        long j3 = j * 1048576;
        int iMin = (int) Math.min(bsVarArr[i].size() - j3, 1048576L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin);
        try {
            bsVarArr[i].c(j3, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            return new n9(andIncrement, iMin, byteBufferAllocate);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read chunk", e);
        }
    }
}
