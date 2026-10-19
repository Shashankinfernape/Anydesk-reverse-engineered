package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vd1 implements AutoCloseable {
    public static final int f = Math.min(32, Runtime.getRuntime().availableProcessors());
    public final byte[] c;
    public final MessageDigest d;
    public final ThreadPoolExecutor e;

    public vd1(byte[] bArr) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        int i = f;
        this.e = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue, callerRunsPolicy);
        this.c = bArr;
        this.d = MessageDigest.getInstance("SHA-256");
    }

    public static ByteBuffer c(int i, int i2, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.limit(i2);
        byteBufferDuplicate.position(i);
        return byteBufferDuplicate.slice();
    }

    public final void a(bs bsVar, zh zhVar) throws IOException {
        long size = bsVar.size();
        long j = 4095;
        long j2 = 4096;
        int i = (int) ((size + 4095) / 4096);
        final byte[][] bArr = new byte[i][];
        final Phaser phaser = new Phaser(1);
        long j3 = 0;
        final int i2 = 0;
        while (j3 < size) {
            int iMin = (int) (Math.min(4194304 + j3, size) - j3);
            long j4 = j;
            long j5 = iMin;
            long j6 = j2;
            int i3 = (int) ((j5 + j4) / j6);
            final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3 * 4096);
            bsVar.c(j3, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            Runnable runnable = new Runnable() { // from class: ud1
                @Override // java.lang.Runnable
                public final void run() {
                    MessageDigest messageDigest;
                    vd1 vd1Var = this.c;
                    try {
                        try {
                            messageDigest = (MessageDigest) vd1Var.d.clone();
                        } catch (NoSuchAlgorithmException e) {
                            throw new IllegalStateException("Failed to obtain an instance of a previously available message digest", e);
                        }
                    } catch (CloneNotSupportedException unused) {
                        messageDigest = MessageDigest.getInstance("SHA-256");
                    }
                    ByteBuffer byteBuffer = byteBufferAllocate;
                    int iCapacity = byteBuffer.capacity();
                    int i4 = i2;
                    int i5 = 0;
                    while (i5 < iCapacity) {
                        int i6 = i5 + 4096;
                        ByteBuffer byteBufferC = vd1.c(i5, i6, byteBuffer);
                        messageDigest.reset();
                        byte[] bArr2 = vd1Var.c;
                        if (bArr2 != null) {
                            messageDigest.update(bArr2);
                        }
                        messageDigest.update(byteBufferC);
                        bArr[i4] = messageDigest.digest();
                        i4++;
                        i5 = i6;
                    }
                    phaser.arriveAndDeregister();
                }
            };
            phaser.register();
            this.e.execute(runnable);
            i2 += i3;
            j3 += j5;
            j = j4;
            j2 = j6;
        }
        phaser.arriveAndAwaitAdvance();
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr2 = bArr[i4];
            zhVar.d(0, bArr2.length, bArr2);
        }
    }

    public final byte[] b(bs bsVar, bs bsVar2, ai aiVar) throws IOException {
        long j;
        long j2;
        bs aiVar2;
        int i = aiVar.b;
        long j3 = 4096;
        if (bsVar.size() % 4096 != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + bsVar.size());
        }
        long size = bsVar.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        aiVar.c(0L, i, byteBufferAllocate);
        byteBufferAllocate.flip();
        bu0.F(byteBufferAllocate, size);
        yj yjVar = new yj(bsVar, bsVar2, new ai(byteBufferAllocate, true));
        MessageDigest messageDigest = this.d;
        int digestLength = messageDigest.getDigestLength();
        ArrayList arrayList = new ArrayList();
        long j4 = yjVar.b;
        do {
            j = 4095;
            j2 = digestLength;
            j4 = ((j4 + 4095) / 4096) * j2;
            arrayList.add(Long.valueOf(((j4 + 4095) / 4096) * 4096));
        } while (j4 > 4096);
        int size2 = arrayList.size();
        int[] iArr = new int[size2 + 1];
        iArr[0] = 0;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            long j5 = j3;
            long jLongValue = ((Long) arrayList.get((arrayList.size() - i2) - 1)).longValue();
            int i5 = (int) jLongValue;
            long j6 = j;
            if (jLongValue != i5) {
                throw new ArithmeticException();
            }
            iArr[i3] = i4 + i5;
            j = j6;
            i2 = i3;
            j3 = j5;
        }
        long j7 = j3;
        long j8 = j;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iArr[size2]);
        int i6 = size2 - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            int i8 = i7 + 1;
            zh zhVar = new zh(1, c(iArr[i7], iArr[i8], byteBufferAllocate2));
            if (i7 == i6) {
                a(yjVar, zhVar);
                aiVar2 = yjVar;
            } else {
                ByteBuffer byteBufferC = c(iArr[i8], iArr[i7 + 2], byteBufferAllocate2.asReadOnlyBuffer());
                byteBufferC.getClass();
                aiVar2 = new ai(byteBufferC, true);
                a(aiVar2, zhVar);
            }
            int size3 = (int) ((((aiVar2.size() + j8) / j7) * j2) % j7);
            if (size3 > 0) {
                int i9 = 4096 - size3;
                zhVar.d(0, i9, new byte[i9]);
            }
        }
        ByteBuffer byteBufferC2 = c(0, 4096, byteBufferAllocate2.asReadOnlyBuffer());
        messageDigest.reset();
        byte[] bArr = this.c;
        if (bArr != null) {
            messageDigest.update(bArr);
        }
        messageDigest.update(byteBufferC2);
        return messageDigest.digest();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.shutdownNow();
    }
}
