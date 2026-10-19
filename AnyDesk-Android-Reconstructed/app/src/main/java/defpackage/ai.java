package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ai implements bs {
    public final ByteBuffer a;
    public final int b;

    public ai(ByteBuffer byteBuffer, boolean z) {
        this.a = z ? byteBuffer.slice() : byteBuffer;
        this.b = byteBuffer.remaining();
    }

    @Override // defpackage.bs
    public final ByteBuffer a(int i, long j) {
        ByteBuffer byteBufferSlice;
        long j2 = i;
        int i2 = this.b;
        if (j < 0) {
            id.i("offset: ", j);
            return null;
        }
        if (j2 < 0) {
            id.i("size: ", j2);
            return null;
        }
        long j3 = i2;
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + i2 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            id.d(j, ") + size (", j2, ") overflow");
            return null;
        }
        if (j4 > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + i2 + ")");
        }
        int i3 = (int) j;
        int i4 = i + i3;
        synchronized (this.a) {
            this.a.position(0);
            this.a.limit(i4);
            this.a.position(i3);
            byteBufferSlice = this.a.slice();
        }
        return byteBufferSlice;
    }

    @Override // defpackage.bs
    public final void b(long j, long j2, as asVar) {
        int i = this.b;
        if (j2 >= 0 && j2 <= i) {
            asVar.a(a((int) j2, j));
            return;
        }
        throw new IndexOutOfBoundsException("size: " + j2 + ", source size: " + i);
    }

    @Override // defpackage.bs
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        byteBuffer.put(a(i, j));
    }

    @Override // defpackage.bs
    public final long size() {
        return this.b;
    }
}
