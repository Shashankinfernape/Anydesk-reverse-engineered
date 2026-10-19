package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mb1 {
    public static final mb1 d = new mb1(0, mx.c);
    public final int[] a;
    public final List b;
    public final int c;

    public mb1(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.a = iArr;
        this.b = list;
        this.c = i;
        if (iArr.length != 0) {
            return;
        }
        id.q("originalPageOffsets cannot be empty when constructing TransformablePage");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mb1.class != obj.getClass()) {
            return false;
        }
        mb1 mb1Var = (mb1) obj;
        return Arrays.equals(this.a, mb1Var.a) && y90.e(this.b, mb1Var.b) && this.c == mb1Var.c;
    }

    public final int hashCode() {
        return (((this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31) + this.c) * 31;
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.a) + ", data=" + this.b + ", hintOriginalPageOffset=" + this.c + ", hintOriginalIndices=null)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mb1(int i, List list) {
        this(new int[]{i}, list, i);
        list.getClass();
    }
}
