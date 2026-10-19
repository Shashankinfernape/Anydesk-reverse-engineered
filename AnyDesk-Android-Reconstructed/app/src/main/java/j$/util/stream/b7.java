package j$.util.stream;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b7 {
    public static final b7 DISTINCT;
    public static final b7 ORDERED;
    public static final b7 SHORT_CIRCUIT;
    public static final b7 SIZED;
    public static final b7 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ b7[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        a7 a7Var = a7.SPLITERATOR;
        j$.util.p pVarE = e(a7Var);
        a7 a7Var2 = a7.STREAM;
        pVarE.a(a7Var2);
        a7 a7Var3 = a7.OP;
        ((EnumMap) ((Map) pVarE.b)).put(a7Var3, 3);
        b7 b7Var = new b7("DISTINCT", 0, 0, pVarE);
        DISTINCT = b7Var;
        j$.util.p pVarE2 = e(a7Var);
        pVarE2.a(a7Var2);
        ((EnumMap) ((Map) pVarE2.b)).put(a7Var3, 3);
        b7 b7Var2 = new b7("SORTED", 1, 1, pVarE2);
        SORTED = b7Var2;
        j$.util.p pVarE3 = e(a7Var);
        pVarE3.a(a7Var2);
        ((EnumMap) ((Map) pVarE3.b)).put(a7Var3, 3);
        a7 a7Var4 = a7.TERMINAL_OP;
        ((EnumMap) ((Map) pVarE3.b)).put(a7Var4, 2);
        a7 a7Var5 = a7.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) pVarE3.b)).put(a7Var5, 2);
        b7 b7Var3 = new b7("ORDERED", 2, 2, pVarE3);
        ORDERED = b7Var3;
        j$.util.p pVarE4 = e(a7Var);
        pVarE4.a(a7Var2);
        ((EnumMap) ((Map) pVarE4.b)).put(a7Var3, 2);
        b7 b7Var4 = new b7("SIZED", 3, 3, pVarE4);
        SIZED = b7Var4;
        j$.util.p pVarE5 = e(a7Var3);
        pVarE5.a(a7Var4);
        int i2 = 0;
        b7 b7Var5 = new b7("SHORT_CIRCUIT", 4, 12, pVarE5);
        SHORT_CIRCUIT = b7Var5;
        v = new b7[]{b7Var, b7Var2, b7Var3, b7Var4, b7Var5};
        f = b(a7Var);
        g = b(a7Var2);
        h = b(a7Var3);
        b(a7Var4);
        b(a7Var5);
        for (b7 b7Var6 : values()) {
            i2 |= b7Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        b7 b7Var7 = DISTINCT;
        m = b7Var7.c;
        n = b7Var7.d;
        b7 b7Var8 = SORTED;
        o = b7Var8.c;
        p = b7Var8.d;
        b7 b7Var9 = ORDERED;
        q = b7Var9.c;
        r = b7Var9.d;
        b7 b7Var10 = SIZED;
        s = b7Var10.c;
        t = b7Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public b7(String str, int i2, int i3, j$.util.p pVar) {
        super(str, i2);
        for (a7 a7Var : a7.values()) {
            j$.util.c.w((Map) pVar.b, a7Var, 0);
        }
        this.a = (Map) pVar.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int a(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int b(a7 a7Var) {
        int iIntValue = 0;
        for (b7 b7Var : values()) {
            iIntValue |= ((Integer) b7Var.a.get(a7Var)).intValue() << b7Var.b;
        }
        return iIntValue;
    }

    public static int c(j$.util.e1 e1Var) {
        int iCharacteristics = e1Var.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || e1Var.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static j$.util.p e(a7 a7Var) {
        j$.util.p pVar = new j$.util.p(11, new EnumMap(a7.class));
        pVar.a(a7Var);
        return pVar;
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) v.clone();
    }

    public final boolean d(int i2) {
        return (i2 & this.e) == this.c;
    }
}
