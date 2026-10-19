package defpackage;

import com.anydesk.anydeskandroid.gui.element.SetupItem;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;
import com.anydesk.jni.JniAdExt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w31 implements j6, sl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SetupFragment d;

    public /* synthetic */ w31(SetupFragment setupFragment, int i) {
        this.c = i;
        this.d = setupFragment;
    }

    @Override // defpackage.sl0
    public void a() {
        SetupFragment setupFragment = this.d;
        setupFragment.i1(setupFragment.v0, a41.x);
        SetupItem setupItem = setupFragment.v0;
        io ioVar = io.KEY_AUDIO_TRANSMIT_MODE;
        r3.I(setupItem, (JniAdExt.p3(ioVar) && JniAdExt.h2(ioVar) == 0) ? 8 : 0);
        String strN1 = JniAdExt.n1("ad.setup.microphone.title");
        bc bcVar = setupFragment.d0;
        if (bcVar == null) {
            return;
        }
        bcVar.t0(12, strN1);
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        int i = this.c;
        SetupFragment setupFragment = this.d;
        switch (i) {
            case 0:
                setupFragment.g1();
                if (!r3.b(((Map) obj).values())) {
                    String strN1 = JniAdExt.n1("ad.setup.notifications.title");
                    bc bcVar = setupFragment.d0;
                    if (bcVar != null) {
                        bcVar.t0(10, strN1);
                        break;
                    }
                }
                break;
            case 1:
                setupFragment.i1(setupFragment.j0, a41.g);
                if (!r3.b(((Map) obj).values())) {
                    String strN2 = JniAdExt.n1("ad.dlg.perm.all_files.title");
                    bc bcVar2 = setupFragment.d0;
                    if (bcVar2 != null) {
                        bcVar2.t0(11, strN2);
                        break;
                    }
                }
                break;
            default:
                setupFragment.i1(setupFragment.k0, a41.h);
                break;
        }
    }
}
