package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.t;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new t(3, consumer, consumer2);
    }
}
