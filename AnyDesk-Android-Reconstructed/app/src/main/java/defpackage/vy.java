package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class vy implements bs {
    public final FileChannel a;
    public final long b;
    public final long c;

    public vy(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            id.i("offset: ", j2);
            throw null;
        }
        if (j2 < 0) {
            id.i("size: ", j2);
            throw null;
        }
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    public static void d(long j, long j2, long j3) {
        if (j < 0) {
            id.i("offset: ", j);
            return;
        }
        if (j2 < 0) {
            id.i("size: ", j2);
            return;
        }
        if (j > j3) {
            id.d(j, ") > source size (", j3, ")");
            return;
        }
        long j4 = j + j2;
        if (j4 < j) {
            id.d(j, ") + size (", j2, ") overflow");
            return;
        }
        if (j4 <= j3) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
    }

    @Override // defpackage.bs
    public final ByteBuffer a(int i, long j) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(gr0.e(i, "size: "));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        c(j, i, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override // defpackage.bs
    public final void b(long j, long j2, as asVar) {
        d(j, j2, size());
        if (j2 == 0) {
            return;
        }
        long j3 = this.b + j;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) Math.min(j2, 1048576L));
        long j4 = j3;
        long j5 = j2;
        while (j5 > 0) {
            int iMin = (int) Math.min(j5, byteBufferAllocateDirect.capacity());
            byteBufferAllocateDirect.limit(iMin);
            synchronized (this.a) {
                try {
                    this.a.position(j4);
                    int i = iMin;
                    while (i > 0) {
                        int i2 = this.a.read(byteBufferAllocateDirect);
                        if (i2 < 0) {
                            throw new IOException("Unexpected EOF encountered");
                        }
                        i -= i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            byteBufferAllocateDirect.flip();
            asVar.a(byteBufferAllocateDirect);
            byteBufferAllocateDirect.clear();
            long j6 = iMin;
            j4 += j6;
            j5 -= j6;
        }
    }

    @Override // defpackage.bs
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        int i2;
        d(j, i, size());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.b + j;
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.a) {
                    this.a.position(j2);
                    i2 = this.a.read(byteBuffer);
                }
                j2 += (long) i2;
                i -= i2;
            }
            byteBuffer.limit(iLimit);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public final bs e(long j, long j2) {
        long size = size();
        d(j, j2, size);
        if (j == 0 && j2 == size) {
            return this;
        }
        return new vy(this.a, this.b + j, j2);
    }

    @Override // defpackage.bs
    public final long size() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }
}
