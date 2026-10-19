package j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public interface y0 extends b1 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.b1, j$.util.e1
    y0 trySplit();
}
