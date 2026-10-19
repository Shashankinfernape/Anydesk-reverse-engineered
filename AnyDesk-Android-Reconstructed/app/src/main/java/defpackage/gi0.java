package defpackage;

import com.anydesk.anydeskandroid.MainApplication;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends ec1 {
    public final /* synthetic */ ot j;
    public final /* synthetic */ MainApplication k;

    public gi0(MainApplication mainApplication, ot otVar) {
        this.k = mainApplication;
        this.j = otVar;
    }

    @Override // defpackage.ec1
    public final void A(int i, CharSequence charSequence) {
        this.k.d.e("biometric auth error (" + i + "): " + ((Object) charSequence));
        this.j.a(false);
    }

    @Override // defpackage.ec1
    public final void B() {
        this.k.d.e("biometric auth failed");
        this.j.a(false);
    }

    @Override // defpackage.ec1
    public final void C() {
        this.k.d.e("biometric auth succeeded");
        this.j.a(true);
    }
}
