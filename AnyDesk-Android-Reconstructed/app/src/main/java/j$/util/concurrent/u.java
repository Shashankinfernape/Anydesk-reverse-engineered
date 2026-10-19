package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
