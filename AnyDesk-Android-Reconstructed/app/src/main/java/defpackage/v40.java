package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class v40 implements ze1 {
    public static v40 b;
    public final /* synthetic */ int a;

    public /* synthetic */ v40(int i) {
        this.a = i;
    }

    @Override // defpackage.ze1
    public ve1 a(Class cls) {
        switch (this.a) {
            case 0:
                return new w40(true);
            case 1:
                return new yg0();
            case 2:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return bu0.h(cls);
        }
    }

    @Override // defpackage.ze1
    public ve1 b(Class cls, um0 um0Var) {
        switch (this.a) {
            case 0:
                return a(cls);
            case 1:
                return a(cls);
            case 2:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }

    @Override // defpackage.ze1
    public final ve1 c(fm fmVar, um0 um0Var) {
        switch (this.a) {
            case 0:
                Class cls = fmVar.a;
                cls.getClass();
                return b(cls, um0Var);
            case 1:
                Class cls2 = fmVar.a;
                cls2.getClass();
                return b(cls2, um0Var);
            case 2:
                return new c01();
            default:
                Class cls3 = fmVar.a;
                cls3.getClass();
                return b(cls3, um0Var);
        }
    }
}
