package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class j2 implements Iterator, yd0 {
    public final /* synthetic */ int c;
    public int d;
    public final Object e;

    public j2(Object[] objArr) {
        this.c = 1;
        objArr.getClass();
        this.e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return this.d < ((m2) obj).a();
            case 1:
                return this.d < ((Object[]) obj).length;
            case 2:
                return this.d < ((x51) obj).f();
            default:
                return this.d < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.d;
                this.d = i2 + 1;
                return ((m2) obj).get(i2);
            case 1:
                try {
                    int i3 = this.d;
                    this.d = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.d--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i4 = this.d;
                this.d = i4 + 1;
                return ((x51) obj).g(i4);
            default:
                int i5 = this.d;
                this.d = i5 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.e;
                int i = this.d - 1;
                this.d = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ j2(int i, Object obj) {
        this.c = i;
        this.e = obj;
    }
}
