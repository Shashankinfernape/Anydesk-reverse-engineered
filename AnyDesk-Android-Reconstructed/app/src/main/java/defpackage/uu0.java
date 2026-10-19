package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu0 {
    public final Object[] a;
    public int b;

    public uu0(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            id.q("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(yd ydVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = ydVar;
            this.b = i + 1;
        }
    }

    public void c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 < objArr.length) {
                    objArr[i3] = obj;
                    this.b = i3 + 1;
                    return;
                }
                return;
            }
            if (objArr[i2] == obj) {
                nh0.j("Already in the pool!");
                return;
            }
            i2++;
        }
    }

    public uu0() {
        this.a = new Object[256];
    }
}
