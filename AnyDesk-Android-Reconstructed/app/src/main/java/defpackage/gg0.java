package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ kg0 d;

    public /* synthetic */ gg0(kg0 kg0Var, int i) {
        this.c = i;
        this.d = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        kg0 kg0Var = this.d;
        switch (i) {
            case 0:
                uv uvVar = kg0Var.e;
                if (uvVar != null) {
                    uvVar.setListSelectionHidden(true);
                    uvVar.requestLayout();
                }
                break;
            default:
                uv uvVar2 = kg0Var.e;
                if (uvVar2 != null && uvVar2.isAttachedToWindow() && kg0Var.e.getCount() > kg0Var.e.getChildCount() && kg0Var.e.getChildCount() <= kg0Var.o) {
                    kg0Var.B.setInputMethodMode(2);
                    kg0Var.d();
                    break;
                }
                break;
        }
    }
}
