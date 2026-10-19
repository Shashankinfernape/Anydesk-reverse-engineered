package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dr extends h2 implements zq {
    public static final cr d = new cr(fw.d, new a0(5));

    public dr() {
        super(fw.d);
    }

    public abstract void e(br brVar, Runnable runnable);

    public void f(br brVar, Runnable runnable) {
        r71.L(this, brVar, runnable);
    }

    public boolean g(br brVar) {
        return !(this instanceof rc1);
    }

    public dr k(int i) {
        ds.d(i);
        return new kf0(this, i);
    }

    @Override // defpackage.h2, defpackage.br
    public final zq l(ar arVar) {
        zq zqVar;
        arVar.getClass();
        if (!(arVar instanceof cr)) {
            if (fw.d == arVar) {
                return this;
            }
            return null;
        }
        cr crVar = (cr) arVar;
        ar arVar2 = this.c;
        if ((arVar2 == crVar || crVar.d == arVar2) && (zqVar = (zq) crVar.c.h(this)) != null) {
            return zqVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (((defpackage.zq) r3.c.h(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (defpackage.fw.d == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        return defpackage.kx.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return r2;
     */
    @Override // defpackage.h2, defpackage.br
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.br q(defpackage.ar r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.cr
            if (r0 == 0) goto L1e
            cr r3 = (defpackage.cr) r3
            ar r0 = r2.c
            if (r0 == r3) goto L13
            ar r1 = r3.d
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            z50 r3 = r3.c
            java.lang.Object r3 = r3.h(r2)
            zq r3 = (defpackage.zq) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            fw r0 = defpackage.fw.d
            if (r0 != r3) goto L25
        L22:
            kx r3 = defpackage.kx.c
            return r3
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.q(ar):br");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ds.s(this);
    }
}
