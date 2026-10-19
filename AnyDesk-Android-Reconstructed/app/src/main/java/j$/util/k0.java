package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0 implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ k0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.a;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                consumer.accept(Long.valueOf(j));
                break;
            default:
                ((n5) consumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
