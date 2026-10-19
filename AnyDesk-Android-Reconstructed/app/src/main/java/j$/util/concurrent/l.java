package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class l implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile l d;

    public l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public l a(int i, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.a == i && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.d;
        } while (lVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.c;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.h(this.b, this.c);
    }

    public l(int i, Object obj, Object obj2, l lVar) {
        this(i, obj, obj2);
        this.d = lVar;
    }
}
