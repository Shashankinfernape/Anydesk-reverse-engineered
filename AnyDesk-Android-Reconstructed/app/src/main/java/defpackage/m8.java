package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends ds {
    public final Animatable A;
    public final /* synthetic */ int z;

    public /* synthetic */ m8(Animatable animatable, int i) {
        this.z = i;
        this.A = animatable;
    }

    @Override // defpackage.ds
    public final void D() {
        switch (this.z) {
            case 0:
                this.A.start();
                break;
            default:
                ((u8) this.A).start();
                break;
        }
    }

    @Override // defpackage.ds
    public final void E() {
        switch (this.z) {
            case 0:
                this.A.stop();
                break;
            default:
                ((u8) this.A).stop();
                break;
        }
    }
}
