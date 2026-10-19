package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends h3 {
    public final /* synthetic */ int i;
    public final /* synthetic */ k3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(k3 k3Var, int i) {
        super(k3Var, 0);
        this.i = i;
        this.j = k3Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    @Override // defpackage.h3
    public final void a() {
        String strN1;
        String strN2;
        int i;
        int i2 = this.i;
        k3 k3Var = this.j;
        switch (i2) {
            case 0:
                if (JniAdExt.p3(io.KEY_AUDIO_TRANSMIT_MODE)) {
                    k3Var.L0.u(k3Var.a0(), JniAdExt.n1("ad.gen.feature.override"));
                    break;
                } else {
                    bc bcVar = k3Var.K0;
                    if (bcVar != null) {
                        bcVar.q0(0, JniAdExt.n1("ad.dlg.closed.no_capture_permissions.title"), "AnyDesk " + JniAdExt.n1("ad.menu.settings") + " (" + JniAdExt.n1("ad.cfg.audio.title") + "): " + JniAdExt.n1("ad.cfg.audio.transmission.active"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
                        break;
                    }
                }
                break;
            default:
                Boolean boolQ = nd0.q(a41.j);
                xt0 xt0Var = k3Var.L0;
                Boolean boolS = nd0.s(k3Var.G0(), a41.r);
                if (boolQ == null && boolS == null) {
                    xt0Var.u(k3Var.a0(), JniAdExt.n1("ad.msg.control.not_available.android"));
                    break;
                } else {
                    bc bcVar2 = k3Var.K0;
                    if (bcVar2 != null) {
                        Boolean bool = Boolean.TRUE;
                        int i3 = 0;
                        if (bool.equals(boolQ) || bool.equals(boolS)) {
                            strN1 = null;
                            strN2 = null;
                        } else {
                            k11 k11VarA = tq.a();
                            j11 j11VarB = tq.b(k3Var.G0().getApplicationContext().getPackageManager());
                            strN1 = JniAdExt.n1("ad.menu.install.android.title");
                            String strN3 = JniAdExt.n1("ad.menu.install.android.msg.main");
                            String strA = "";
                            if (Boolean.FALSE.equals(boolS)) {
                                if (j11VarB != null) {
                                    strA = j11VarB.a();
                                }
                            } else if (k11VarA != null) {
                                strA = k11VarA.a();
                            }
                            strN2 = String.format(strN3, strA);
                            i3 = 4;
                        }
                        if (i3 == 0) {
                            Boolean boolQ2 = nd0.q(a41.k);
                            Boolean boolS2 = nd0.s(k3Var.G0(), a41.s);
                            Boolean bool2 = Boolean.FALSE;
                            if (bool2.equals(boolQ2) || bool2.equals(boolS2)) {
                                strN1 = JniAdExt.n1("ad.menu.activate_plugin.consent.query_all_packages.android.title");
                                strN2 = JniAdExt.n1("ad.about.plugin.consent");
                                i3 = 5;
                            }
                        }
                        if (i3 == 0 && Boolean.FALSE.equals(nd0.q(a41.l))) {
                            strN1 = JniAdExt.n1("ad.menu.activate_plugin.android.title");
                            strN2 = JniAdExt.n1("ad.about.plugin.activation");
                            i3 = 6;
                        }
                        if (i3 == 0) {
                            Boolean boolQ3 = nd0.q(a41.m);
                            Boolean boolS3 = nd0.s(k3Var.G0(), a41.t);
                            Boolean bool3 = Boolean.FALSE;
                            if (bool3.equals(boolQ3) || bool3.equals(boolS3)) {
                                strN1 = JniAdExt.n1("ad.menu.update.android.title");
                                strN2 = JniAdExt.n1("ad.about.plugin.update");
                                i = 7;
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = strN1;
                        if (i == 0) {
                            xt0Var.u(k3Var.a0(), JniAdExt.n1("ad.menu.install.android.msg.suffix.google_play.needs_review_by_legal"));
                        } else {
                            bcVar2.q0(i, str, i == 4 ? "AnyDesk " + JniAdExt.n1("ad.menu.setup") + " (" + JniAdExt.n1("ad.setup.incoming.title") + "): " + strN2 : "AnyDesk " + JniAdExt.n1("ad.menu.setup") + " (" + JniAdExt.n1("ad.setup.incoming.title") + " - " + JniAdExt.n1("ad.menu.plugin") + "): " + strN2, null, true, JniAdExt.n1("ad.dlg.ok"), null);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
