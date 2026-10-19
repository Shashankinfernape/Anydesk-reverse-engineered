package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 extends f2 {
    public final /* synthetic */ y6 c;

    public oj0(y6 y6Var) {
        this.c = y6Var;
    }

    @Override // defpackage.f2
    public final int a() {
        return ((Matcher) this.c.d).groupCount() + 1;
    }

    public final nj0 b(int i) {
        Matcher matcher = (Matcher) this.c.d;
        w90 w90VarY = th1.Y(matcher.start(i), matcher.end(i));
        if (w90VarY.c < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new nj0(strGroup, w90VarY);
    }

    @Override // defpackage.f2, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof nj0) {
            return super.contains((nj0) obj);
        }
        return false;
    }

    @Override // defpackage.f2, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nb1(new o81(new an(0, new w90(0, a() - 1, 1)), new z(4, this), 1));
    }
}
