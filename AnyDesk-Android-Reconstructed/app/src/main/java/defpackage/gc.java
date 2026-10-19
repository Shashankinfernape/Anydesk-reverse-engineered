package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc extends v30 {
    public final /* synthetic */ mc l;
    public final /* synthetic */ pc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(pc pcVar, pc pcVar2, mc mcVar) {
        super(pcVar2);
        this.m = pcVar;
        this.l = mcVar;
    }

    @Override // defpackage.v30
    public final b51 b() {
        return this.l;
    }

    @Override // defpackage.v30
    public final boolean c() {
        pc pcVar = this.m;
        if (pcVar.getInternalPopup().b()) {
            return true;
        }
        pcVar.h.n(pcVar.getTextDirection(), pcVar.getTextAlignment());
        return true;
    }
}
