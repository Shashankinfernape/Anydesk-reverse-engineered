package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e71 extends v2 implements t10, o60, c71, s41, v10 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e71.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long i = yi.a.objectFieldOffset(e71.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int g;

    public e71(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x003a, B:36:0x0097, B:38:0x009f, B:41:0x00a6, B:42:0x00aa, B:44:0x00ad, B:54:0x00ce, B:57:0x00de, B:58:0x00fa, B:64:0x010a, B:61:0x0101, B:63:0x0107, B:46:0x00b3, B:50:0x00ba, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x003a, B:36:0x0097, B:38:0x009f, B:41:0x00a6, B:42:0x00aa, B:44:0x00ad, B:54:0x00ce, B:57:0x00de, B:58:0x00fa, B:64:0x010a, B:61:0x0101, B:63:0x0107, B:46:0x00b3, B:50:0x00ba, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dd -> B:36:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.t10
    public final java.lang.Object a(defpackage.v10 r18, defpackage.rq r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.a(v10, rq):java.lang.Object");
    }

    @Override // defpackage.o60
    public final t10 b(br brVar, int i2, oh ohVar) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || ohVar != oh.d) ? bu0.n(this, brVar, i2, ohVar) : this;
    }

    @Override // defpackage.v2
    public final w2 d() {
        return new f71();
    }

    @Override // defpackage.v2
    public final w2[] e() {
        return new f71[2];
    }

    public final boolean g(Object obj, Object obj2) {
        bx bxVar = ec1.d;
        if (obj == null) {
            obj = bxVar;
        }
        if (obj2 == null) {
            obj2 = bxVar;
        }
        return j(obj, obj2);
    }

    @Override // defpackage.c71
    public final Object getValue() {
        bx bxVar = ec1.d;
        h.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, i);
        if (objectVolatile == bxVar) {
            return null;
        }
        return objectVolatile;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = ec1.d;
        }
        j(null, obj);
    }

    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        h(obj);
        return uc1.a;
    }

    public final boolean j(Object obj, Object obj2) {
        int i2;
        w2[] w2VarArr;
        bx bxVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !y90.e(obj3, obj)) {
                return false;
            }
            if (y90.e(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.g;
            if ((i3 & 1) != 0) {
                this.g = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.g = i4;
            w2[] w2VarArr2 = this.c;
            while (true) {
                f71[] f71VarArr = (f71[]) w2VarArr2;
                if (f71VarArr != null) {
                    for (f71 f71Var : f71VarArr) {
                        if (f71Var != null) {
                            AtomicReference atomicReference = f71Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (bxVar = ec1.g)) {
                                    break;
                                }
                                bx bxVar2 = ec1.f;
                                if (obj4 != bxVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, bxVar2)) {
                                            ((xi) obj4).g(uc1.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, bxVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.g;
                    if (i2 == i4) {
                        this.g = i4 + 1;
                        return true;
                    }
                    w2VarArr = this.c;
                }
                w2VarArr2 = w2VarArr;
                i4 = i2;
            }
        }
    }
}
