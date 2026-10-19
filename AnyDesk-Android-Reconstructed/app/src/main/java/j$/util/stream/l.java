package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends j5 {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m8 m8Var, n5 n5Var) {
        super(n5Var);
        this.d = m8Var;
        this.c = true;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        int i = this.b;
        n5 n5Var = this.a;
        switch (i) {
            case 0:
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    n5Var.accept((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    n5Var.accept(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((b5) this.d).m.apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            j$.util.e1 e1VarSpliterator = ((Stream) stream.sequential()).spliterator();
                            while (!n5Var.e() && e1VarSpliterator.tryAdvance(n5Var)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(n5Var);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((m8) this.d).m.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        n5Var.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public boolean e() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.e();
            case 2:
                return !this.c || this.a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void m() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.m();
                break;
            default:
                super.m();
                break;
        }
    }

    public /* synthetic */ l(n5 n5Var) {
        super(n5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b5 b5Var, n5 n5Var) {
        super(n5Var);
        this.d = b5Var;
    }
}
