package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class xd extends i51 implements Map, j$.util.Map {
    public sd f;
    public ud g;
    public wd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(i51 i51Var) {
        super(0);
        int i = i51Var.e;
        b(this.e + i);
        if (this.e != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(i51Var.f(i2), i51Var.i(i2));
            }
        } else if (i > 0) {
            ae.N(0, 0, i, i51Var.c, this.c);
            ae.O(i51Var.d, this.d, 0, 0, i << 1);
            this.e = i;
        }
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
    public final Set entrySet() {
        sd sdVar = this.f;
        if (sdVar != null) {
            return sdVar;
        }
        sd sdVar2 = new sd(this);
        this.f = sdVar2;
        return sdVar2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.e;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.e;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ud udVar = this.g;
        if (udVar != null) {
            return udVar;
        }
        ud udVar2 = new ud(this);
        this.g = udVar2;
        return udVar2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.e);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        wd wdVar = this.h;
        if (wdVar != null) {
            return wdVar;
        }
        wd wdVar2 = new wd(this);
        this.h = wdVar2;
        return wdVar2;
    }
}
