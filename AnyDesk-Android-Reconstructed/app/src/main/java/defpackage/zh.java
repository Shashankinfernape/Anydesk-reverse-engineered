package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zh implements as {
    public final ByteBuffer c;

    public zh(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.c = byteBuffer;
                return;
            default:
                if (byteBuffer == null) {
                    throw new NullPointerException("buf == null");
                }
                this.c = byteBuffer;
                return;
        }
    }

    @Override // defpackage.as
    public void a(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            this.c.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new IOException(q51.k(iRemaining, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    public fj0 b() {
        int iPosition;
        int iPosition2;
        int i;
        byte b;
        ByteBuffer byteBuffer = this.c;
        int iPosition3 = byteBuffer.position();
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        byte b2 = byteBuffer.get();
        int i2 = b2 & 31;
        if (i2 == 31) {
            i2 = 0;
            do {
                if (!byteBuffer.hasRemaining()) {
                    throw new jg("Truncated tag number");
                }
                b = byteBuffer.get();
                if (i2 > 16777215) {
                    throw new jg("Tag number too large");
                }
                i2 = (i2 << 7) | (b & 127);
            } while ((b & 128) != 0);
        }
        boolean z = (b2 & 32) != 0;
        if (!byteBuffer.hasRemaining()) {
            throw new jg("Missing length");
        }
        byte b3 = byteBuffer.get();
        int i3 = b3 & 255;
        if ((b3 & 128) == 0) {
            i = b3 & 127;
            iPosition2 = byteBuffer.position() - iPosition3;
            c(i);
        } else {
            if (i3 != 128) {
                int i4 = b3 & 127;
                if (i4 > 4) {
                    throw new jg(q51.k(i4, "Length too large: ", " bytes"));
                }
                iPosition = 0;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (!byteBuffer.hasRemaining()) {
                        throw new jg("Truncated length");
                    }
                    byte b4 = byteBuffer.get();
                    if (iPosition > 8388607) {
                        throw new jg("Length too large");
                    }
                    iPosition = (iPosition << 8) | (b4 & 255);
                }
                iPosition2 = byteBuffer.position() - iPosition3;
                c(iPosition);
            } else {
                int iPosition4 = byteBuffer.position() - iPosition3;
                if (z) {
                    int iPosition5 = byteBuffer.position();
                    while (true) {
                        if (!byteBuffer.hasRemaining()) {
                            throw new jg("Truncated indefinite-length contents: " + (byteBuffer.position() - iPosition5) + " bytes read");
                        }
                        if (byteBuffer.remaining() > 1 && byteBuffer.getShort(byteBuffer.position()) == 0) {
                            iPosition = byteBuffer.position() - iPosition5;
                            byteBuffer.position(byteBuffer.position() + 2);
                            break;
                        }
                        b();
                    }
                } else {
                    int i6 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (!byteBuffer.hasRemaining()) {
                            throw new jg(q51.k(i6, "Truncated indefinite-length contents: ", " bytes read"));
                        }
                        byte b5 = byteBuffer.get();
                        int i7 = i6 + 1;
                        if (i7 < 0) {
                            throw new jg("Indefinite-length contents too long");
                        }
                        if (b5 != 0) {
                            z2 = false;
                        } else {
                            if (z2) {
                                iPosition = i6 - 1;
                                break;
                            }
                            z2 = true;
                        }
                        i6 = i7;
                    }
                }
                iPosition2 = iPosition4;
            }
            i = iPosition;
        }
        int iPosition6 = byteBuffer.position();
        byteBuffer.position(iPosition3);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(iPosition6);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(iLimit);
        byteBufferSlice.position(iPosition2);
        byteBufferSlice.limit(iPosition2 + i);
        ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
        byteBufferSlice.clear();
        return new fj0(byteBufferSlice, byteBufferSlice2, (b2 & 255) >> 6, i2);
    }

    public void c(int i) throws jg {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer.remaining() >= i) {
            byteBuffer.position(byteBuffer.position() + i);
            return;
        }
        throw new jg("Truncated contents. Need: " + i + " bytes, available: " + byteBuffer.remaining());
    }

    @Override // defpackage.as
    public void d(int i, int i2, byte[] bArr) throws IOException {
        try {
            this.c.put(bArr, 0, i2);
        } catch (BufferOverflowException e) {
            throw new IOException(q51.k(i2, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }
}
