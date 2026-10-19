package defpackage;

import android.graphics.Rect;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends a5 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ConnectionFragment h;

    public /* synthetic */ bp(ConnectionFragment connectionFragment, int i) {
        this.g = i;
        this.h = connectionFragment;
    }

    @Override // defpackage.a5
    public final p81 b(int i) {
        hf1 hf1Var;
        switch (this.g) {
            case 0:
                ConnectionFragment connectionFragment = this.h;
                switch (i) {
                    case 0:
                        connectionFragment.b1();
                        hf1Var = new hf1(connectionFragment.v1, JniAdExt.n1("ad.tutorial.nubsi.title"), JniAdExt.n1("ad.tutorial.nubsi.desc"));
                        return hf1Var;
                    case 1:
                        connectionFragment.r1();
                        Rect rectS0 = ConnectionFragment.S0(connectionFragment, connectionFragment.X0);
                        if (rectS0 == null) {
                            a5.j();
                            break;
                        } else {
                            p81 p81VarB = p81.b(rectS0, JniAdExt.n1("ad.tutorial.input.title"), JniAdExt.n1("ad.tutorial.input.desc"));
                            p81VarB.d = 25;
                            return p81VarB;
                        }
                    case 2:
                        connectionFragment.r1();
                        Rect rectS1 = ConnectionFragment.S0(connectionFragment, connectionFragment.V0);
                        if (rectS1 == null) {
                            a5.j();
                            break;
                        } else {
                            p81 p81VarB2 = p81.b(rectS1, JniAdExt.n1("ad.tutorial.monitor.title"), JniAdExt.n1("ad.tutorial.monitor.desc"));
                            p81VarB2.d = 25;
                            return p81VarB2;
                        }
                    case 3:
                        connectionFragment.r1();
                        Rect rectS2 = ConnectionFragment.S0(connectionFragment, connectionFragment.T0);
                        if (rectS2 == null) {
                            a5.j();
                            break;
                        } else {
                            p81 p81VarB3 = p81.b(rectS2, JniAdExt.n1("ad.file_manager.short_title"), JniAdExt.n1("ad.tutorial.news.android.filemanager"));
                            p81VarB3.d = 25;
                            return p81VarB3;
                        }
                    case 4:
                        connectionFragment.r1();
                        Rect rectS3 = ConnectionFragment.S0(connectionFragment, connectionFragment.U0);
                        if (rectS3 == null) {
                            a5.j();
                            break;
                        } else {
                            p81 p81VarB4 = p81.b(rectS3, JniAdExt.n1("ad.chat.tooltip"), JniAdExt.n1("ad.tutorial.news.android.chat.connection"));
                            p81VarB4.d = 25;
                            return p81VarB4;
                        }
                    case 5:
                        connectionFragment.r1();
                        Rect rectS4 = ConnectionFragment.S0(connectionFragment, connectionFragment.e1);
                        if (rectS4 == null) {
                            a5.j();
                            break;
                        } else {
                            p81 p81VarB5 = p81.b(rectS4, JniAdExt.n1("ad.tutorial.close.title"), null);
                            p81VarB5.d = 25;
                            return p81VarB5;
                        }
                    case 6:
                        connectionFragment.b1();
                        hf1Var = new hf1(connectionFragment.w1, JniAdExt.n1("ad.tutorial.screen_end.title"), JniAdExt.n1("ad.tutorial.screen_end.desc"));
                        return hf1Var;
                    default:
                        return null;
                }
                break;
            default:
                String.format(JniAdExt.n1("ad.tutorial.news.title"), "9.0.2");
                return null;
        }
    }

    @Override // defpackage.a5
    public final void f(boolean z) {
        qa qaVarY;
        int i = this.g;
        int i2 = 0;
        ConnectionFragment connectionFragment = this.h;
        switch (i) {
            case 0:
                connectionFragment.b1();
                t70.b0(MainApplication.v().T, "tutorial_conn_finished", true);
                if (!z) {
                    try {
                        i2 = MainApplication.v().T.getInt("tutorial_conn_news_version", 0);
                        break;
                    } catch (Throwable unused) {
                    }
                    if (i2 != 90002 && (qaVarY = connectionFragment.Y()) != null) {
                        connectionFragment.M1.g(qaVarY);
                        break;
                    }
                } else {
                    t70.c0(MainApplication.v().T, "tutorial_conn_news_version", 90002);
                    t70.b0(MainApplication.v().T, "tutorial_conn_requested", false);
                    break;
                }
                break;
            default:
                connectionFragment.b1();
                t70.c0(MainApplication.v().T, "tutorial_conn_news_version", 90002);
                t70.b0(MainApplication.v().T, "tutorial_conn_requested", false);
                break;
        }
    }
}
