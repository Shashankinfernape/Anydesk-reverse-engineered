package j$.util.stream;

import java.util.Arrays;
import java.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w6 extends c implements Iterable {
    public Object e;
    public Object[] f;

    public w6(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) jCount);
        f(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void f(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > r(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, r(obj2));
            i += r(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    public void g(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            q(obj2, 0, r(obj2), obj);
        }
        q(this.e, 0, this.b, obj);
    }

    public abstract Object newArray(int i);

    public abstract void q(Object obj, int i, int i2, Object obj2);

    public abstract int r(Object obj);

    public final int s(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + ((long) r(this.f[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public abstract j$.util.e1 spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(spliterator());
    }

    public final void t(long j) {
        long jR;
        int i = this.c;
        if (i == 0) {
            jR = r(this.e);
        } else {
            jR = ((long) r(this.f[i])) + this.d[i];
        }
        if (j > jR) {
            if (this.f == null) {
                Object[] objArrU = u();
                this.f = objArrU;
                this.d = new long[8];
                objArrU[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > jR) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f[i2] = newArray(i3);
                long[] jArr = this.d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) r(this.f[i4]));
                jR += (long) i3;
                i2++;
            }
        }
    }

    public abstract Object[] u();

    public final void v() {
        long jR;
        if (this.b == r(this.e)) {
            if (this.f == null) {
                Object[] objArrU = u();
                this.f = objArrU;
                this.d = new long[8];
                objArrU[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jR = r(this.e);
                } else {
                    jR = ((long) r(objArr[i])) + this.d[i];
                }
                t(jR + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public w6() {
        this.e = newArray(16);
    }
}
