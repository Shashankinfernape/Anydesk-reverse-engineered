package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ba {
    public final int a;
    public final String b;
    public final Object[] c;

    public ba(String str, Object... objArr) {
        this.a = -1;
        this.b = str;
        this.c = objArr;
    }

    public Object[] a() {
        return this.c;
    }

    public String toString() {
        Object[] objArr = this.c;
        String str = this.b;
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb = new StringBuilder("mIssueId: ");
        sb.append(this.a);
        for (Object obj : objArr) {
            sb.append(", ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public ba(int i, Object... objArr) {
        this.a = i;
        this.b = null;
        this.c = objArr;
    }
}
