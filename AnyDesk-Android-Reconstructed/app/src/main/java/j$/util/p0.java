package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends q1 {
    public final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(SortedSet sortedSet, Collection collection) {
        super(21, collection);
        this.f = sortedSet;
    }

    @Override // j$.util.q1, j$.util.e1
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
