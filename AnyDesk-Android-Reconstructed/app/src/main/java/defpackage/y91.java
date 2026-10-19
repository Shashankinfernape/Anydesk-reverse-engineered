package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class y91 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(y91.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public gy[] a;

    public final void a(gy gyVar) {
        gyVar.e((hy) this);
        gy[] gyVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (gyVarArr == null) {
            gyVarArr = new gy[4];
            this.a = gyVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= gyVarArr.length) {
            gyVarArr = (gy[]) Arrays.copyOf(gyVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = gyVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        gyVarArr[i] = gyVar;
        gyVar.d = i;
        d(i);
    }

    public final void b(gy gyVar) {
        synchronized (this) {
            if (gyVar.a() != null) {
                c(gyVar.d);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final gy c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            e(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                gy gyVar = objArr2[i];
                gyVar.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (gyVar.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        gy gyVar2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        gyVar2.getClass();
        gyVar2.e(null);
        gyVar2.d = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return gyVar2;
    }

    public final void d(int i) {
        while (i > 0) {
            gy[] gyVarArr = this.a;
            gyVarArr.getClass();
            int i2 = (i - 1) / 2;
            gy gyVar = gyVarArr[i2];
            gyVar.getClass();
            gy gyVar2 = gyVarArr[i];
            gyVar2.getClass();
            if (gyVar.compareTo(gyVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        gy[] gyVarArr = this.a;
        gyVarArr.getClass();
        gy gyVar = gyVarArr[i2];
        gyVar.getClass();
        gy gyVar2 = gyVarArr[i];
        gyVar2.getClass();
        gyVarArr[i] = gyVar;
        gyVarArr[i2] = gyVar2;
        gyVar.d = i;
        gyVar2.d = i2;
    }
}
