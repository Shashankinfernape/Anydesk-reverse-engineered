package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements DoubleConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ c0(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                consumer.accept(Double.valueOf(d));
                break;
            default:
                ((n5) consumer).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
