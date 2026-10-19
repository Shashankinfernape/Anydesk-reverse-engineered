package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class nx implements Map, Serializable, yd0, j$.util.Map {
    public static final nx c = new nx();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return px.c;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return px.c;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mx.c;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
