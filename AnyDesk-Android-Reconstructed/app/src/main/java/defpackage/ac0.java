package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 extends LinkedHashMap {
    public final /* synthetic */ int c;

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        switch (this.c) {
            case 0:
                return size() > 250;
            case 1:
                return size() > 250;
            default:
                return super.removeEldestEntry(entry);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac0(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.c = i2;
    }
}
