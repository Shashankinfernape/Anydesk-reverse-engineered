package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nb1 implements Iterator, yd0 {
    public final /* synthetic */ int c;
    public Iterator d;
    public final Object e;

    public nb1(o81 o81Var) {
        this.c = 0;
        this.e = o81Var;
        this.d = o81Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((o81) obj).c.h(this.d.next());
            default:
                Object next = this.d.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                j2 j2Var = viewGroup != null ? new j2(3, viewGroup) : null;
                if (j2Var == null || !j2Var.hasNext()) {
                    while (!this.d.hasNext() && !arrayList.isEmpty()) {
                        this.d = (Iterator) tm.o0(arrayList);
                        zm.g0(arrayList);
                    }
                } else {
                    arrayList.add(this.d);
                    this.d = j2Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nb1(j2 j2Var) {
        this.c = 1;
        this.e = new ArrayList();
        this.d = j2Var;
    }
}
