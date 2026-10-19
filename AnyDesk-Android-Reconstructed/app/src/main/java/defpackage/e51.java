package defpackage;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class e51 {
    public static final /* synthetic */ e51[] i;
    public final int c;
    public final String d;
    public final fq e;
    public final rt0 f;
    public final int g;
    public final int h;

    /* JADX INFO: Fake field, exist only in values array */
    e51 EF0;

    static {
        rt0 rt0Var = new rt0("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
        fq fqVar = fq.CHUNKED_SHA256;
        e51 e51Var = new e51("RSA_PSS_WITH_SHA256", 0, 257, fqVar, "RSA", rt0Var, 24, 23);
        rt0 rt0Var2 = new rt0("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
        fq fqVar2 = fq.CHUNKED_SHA512;
        e51 e51Var2 = new e51("RSA_PSS_WITH_SHA512", 1, 258, fqVar2, "RSA", rt0Var2, 24, 23);
        e51 e51Var3 = new e51("RSA_PKCS1_V1_5_WITH_SHA256", 2, 259, fqVar, "RSA", new rt0("SHA256withRSA", null), 24, 1);
        e51 e51Var4 = new e51("RSA_PKCS1_V1_5_WITH_SHA512", 3, 260, fqVar2, "RSA", new rt0("SHA512withRSA", null), 24, 1);
        e51 e51Var5 = new e51("ECDSA_WITH_SHA256", 4, 513, fqVar, "EC", new rt0("SHA256withECDSA", null), 24, 11);
        e51 e51Var6 = new e51("ECDSA_WITH_SHA512", 5, 514, fqVar2, "EC", new rt0("SHA512withECDSA", null), 24, 11);
        e51 e51Var7 = new e51("DSA_WITH_SHA256", 6, 769, fqVar, "DSA", new rt0("SHA256withDSA", null), 24, 1);
        e51 e51Var8 = new e51("DETDSA_WITH_SHA256", 7, 769, fqVar, "DSA", new rt0("SHA256withDetDSA", null), 24, 1);
        rt0 rt0Var3 = new rt0("SHA256withRSA", null);
        fq fqVar3 = fq.VERITY_CHUNKED_SHA256;
        i = new e51[]{e51Var, e51Var2, e51Var3, e51Var4, e51Var5, e51Var6, e51Var7, e51Var8, new e51("VERITY_RSA_PKCS1_V1_5_WITH_SHA256", 8, 1057, fqVar3, "RSA", rt0Var3, 28, 1), new e51("VERITY_ECDSA_WITH_SHA256", 9, 1059, fqVar3, "EC", new rt0("SHA256withECDSA", null), 28, 11), new e51("VERITY_DSA_WITH_SHA256", 10, 1061, fqVar3, "DSA", new rt0("SHA256withDSA", null), 28, 1)};
    }

    public e51(String str, int i2, int i3, fq fqVar, String str2, rt0 rt0Var, int i4, int i5) {
        super(str, i2);
        this.c = i3;
        this.e = fqVar;
        this.d = str2;
        this.f = rt0Var;
        this.g = i4;
        this.h = i5;
    }

    public static e51 a(int i2) {
        for (e51 e51Var : values()) {
            if (e51Var.c == i2) {
                return e51Var;
            }
        }
        return null;
    }

    public static e51 valueOf(String str) {
        return (e51) Enum.valueOf(e51.class, str);
    }

    public static e51[] values() {
        return (e51[]) i.clone();
    }
}
