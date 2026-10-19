package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ g0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        Consumer consumer = this.b;
        switch (i2) {
            case 0:
                consumer.accept(Integer.valueOf(i));
                break;
            default:
                ((n5) consumer).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
