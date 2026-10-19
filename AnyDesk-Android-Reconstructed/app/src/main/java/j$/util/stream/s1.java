package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public enum s1 {
    ANY(true, true),
    ALL(false, false),
    NONE(true, false);

    public final boolean a;
    public final boolean b;

    s1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
