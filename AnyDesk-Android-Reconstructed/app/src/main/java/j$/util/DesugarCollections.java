package j$.util;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class DesugarCollections {
    public static <T> Collection<T> bridge_synchronizedCollection(Collection<T> collection, Object obj) {
        return new i(collection, obj);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new j(map);
    }

    public static <T> List<T> unmodifiableList(List<? extends T> list) {
        return list instanceof RandomAccess ? new u(list) : new o(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new t(map);
    }

    public static <T> Set<T> unmodifiableSet(Set<? extends T> set) {
        return new v(set);
    }
}
