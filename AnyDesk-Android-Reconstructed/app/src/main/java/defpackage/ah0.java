package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements as, Closeable {
    public final as c;
    public Inflater d = new Inflater(true);
    public byte[] e;
    public byte[] f;
    public long g;
    public boolean h;

    public ah0(as asVar) {
        this.c = asVar;
    }

    @Override // defpackage.as
    public final void a(ByteBuffer byteBuffer) throws IOException {
        if (this.h) {
            nh0.j("Closed");
            return;
        }
        if (byteBuffer.hasArray()) {
            d(byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (this.f == null) {
            this.f = new byte[65536];
        }
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(byteBuffer.remaining(), this.f.length);
            byteBuffer.get(this.f, 0, iMin);
            d(0, iMin, this.f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.f = null;
        this.e = null;
        Inflater inflater = this.d;
        if (inflater != null) {
            inflater.end();
            this.d = null;
        }
    }

    @Override // defpackage.as
    public final void d(int i, int i2, byte[] bArr) throws IOException {
        if (this.h) {
            nh0.j("Closed");
            return;
        }
        this.d.setInput(bArr, i, i2);
        if (this.e == null) {
            this.e = new byte[65536];
        }
        while (!this.d.finished()) {
            try {
                int iInflate = this.d.inflate(this.e);
                if (iInflate == 0) {
                    return;
                }
                this.c.d(0, iInflate, this.e);
                this.g += (long) iInflate;
            } catch (DataFormatException e) {
                throw new IOException("Failed to inflate data", e);
            }
        }
    }
}
