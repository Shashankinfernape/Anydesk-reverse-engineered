package j$.util;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements java.util.Map.Entry {
    public final java.util.Map.Entry a;

    public q(java.util.Map.Entry entry) {
        this.a = (java.util.Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                Object key = this.a.getKey();
                Object key2 = entry.getKey();
                if (key == null) {
                    zEquals = key2 == null;
                } else {
                    zEquals = key.equals(key2);
                }
                if (zEquals) {
                    Object value = this.a.getValue();
                    Object value2 = entry.getValue();
                    if (value == null) {
                        zEquals2 = value2 == null;
                    } else {
                        zEquals2 = value.equals(value2);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
