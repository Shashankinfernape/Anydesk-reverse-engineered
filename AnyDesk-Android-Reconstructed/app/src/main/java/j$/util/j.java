package j$.util;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;
    public final java.util.Map a;
    public final j b = this;
    public transient k c;
    public transient k d;
    public transient i e;

    public j(java.util.Map map) {
        this.a = (java.util.Map) Objects.requireNonNull(map);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj$default$compute;
        Object objApply;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (true) {
                        objApply = biFunction.apply(obj, objPutIfAbsent);
                        if (objApply == null) {
                            if (objPutIfAbsent != null && !concurrentMap.remove(obj, objPutIfAbsent)) {
                                break;
                            }
                            obj$default$compute = null;
                        } else {
                            if (objPutIfAbsent != null) {
                                if (!concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                    break;
                                }
                                break;
                            }
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        throw th;
                    }
                }
                obj$default$compute = objApply;
            } else {
                obj$default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj$default$computeIfAbsent;
        Object objApply;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                if (obj2 != null || (objApply = function.apply(obj)) == null) {
                    obj$default$computeIfAbsent = obj2;
                } else {
                    obj$default$computeIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                    if (obj$default$computeIfAbsent == null) {
                        obj$default$computeIfAbsent = objApply;
                    }
                }
            } else {
                obj$default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj$default$computeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj$default$computeIfPresent;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj$default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        obj$default$computeIfPresent = null;
                        break;
                    }
                    Object objApply = biFunction.apply(obj, obj2);
                    if (objApply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = objApply;
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, objApply)) {
                        obj$default$computeIfPresent = objApply;
                        break;
                    }
                }
            } else {
                obj$default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.b) {
            zContainsValue = this.a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        k kVar;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    this.d = new k(this.a.entrySet(), this.b);
                }
                kVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            c.t(this.a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object objV;
        synchronized (this.b) {
            objV = c.v(this.a, obj, obj2);
        }
        return objV;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = new k(this.a.keySet(), this.b);
                }
                kVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj2 = ((Map) map).merge(obj, obj2, biFunction);
            } else {
                if (map instanceof ConcurrentMap) {
                    ConcurrentMap concurrentMap = (ConcurrentMap) map;
                    Objects.requireNonNull(biFunction);
                    Objects.requireNonNull(obj2);
                    loop0: while (true) {
                        Object objPutIfAbsent = concurrentMap.get(obj);
                        while (objPutIfAbsent == null) {
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                        if (objApply != null) {
                            if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                obj2 = objApply;
                                break;
                            }
                        } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                            obj2 = null;
                            break;
                        }
                        throw th;
                    }
                }
                obj2 = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.b) {
            objPut = this.a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objW;
        synchronized (this.b) {
            objW = c.w(this.a, obj, obj2);
        }
        return objW;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                zRemove = ((Map) map).remove(obj, obj2);
            } else {
                Object obj3 = map.get(obj);
                if (!Objects.equals(obj3, obj2) || (obj3 == null && !map.containsKey(obj))) {
                    zRemove = false;
                } else {
                    map.remove(obj);
                    zRemove = true;
                }
            }
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof ConcurrentHashMap) {
                    ((ConcurrentHashMap) concurrentMap).forEach(tVar);
                } else {
                    j$.com.android.tools.r8.a.f(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar;
        synchronized (this.b) {
            try {
                if (this.e == null) {
                    this.e = new i(this.a.values(), this.b);
                }
                iVar = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.a.remove(obj);
        }
        return objRemove;
    }
}
