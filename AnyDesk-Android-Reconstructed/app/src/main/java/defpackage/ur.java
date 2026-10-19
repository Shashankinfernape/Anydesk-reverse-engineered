package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class ur extends sx {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur(rx rxVar, int i) {
        super(rxVar);
        this.e = i;
    }

    @Override // defpackage.sx
    public void q() {
        switch (this.e) {
            case 0:
                rx rxVar = this.b;
                rxVar.q = null;
                CheckableImageButton checkableImageButton = rxVar.i;
                checkableImageButton.setOnLongClickListener(null);
                ec1.H(checkableImageButton, null);
                break;
        }
    }
}
