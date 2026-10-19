package defpackage;

import j$.util.Objects;
import j$.util.function.IntUnaryOperator$CC;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class el {
    public final int a;
    public final ArrayList b = new ArrayList();

    public el(int i) {
        this.a = i;
    }

    public final synchronized void a(String str) {
        if (!str.isEmpty()) {
            this.b.add(str);
        }
    }

    public final synchronized String[] b() {
        IntStream map;
        final ArrayList arrayList;
        final int size = this.b.size() - 1;
        map = IntStream.CC.rangeClosed(0, size).map(new IntUnaryOperator() { // from class: bl
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return size - i;
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
            }
        });
        arrayList = this.b;
        Objects.requireNonNull(arrayList);
        return (String[]) map.mapToObj(new IntFunction() { // from class: cl
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return (String) arrayList.get(i);
            }
        }).toArray(new dl(0));
    }
}
