package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.navigation.NavigationView;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y2(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        View childAt;
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                k3 k3Var = (k3) obj2;
                Integer num = (Integer) obj;
                if (k3Var.A0 != null) {
                    r3.J(k3Var.B0, num.intValue());
                    break;
                }
                break;
            case 1:
                xk xkVar = (xk) obj2;
                Boolean bool = (Boolean) obj;
                xkVar.s0.setHint(bool.booleanValue() ? JniAdExt.n1("ad.status.chat.session.closed") : JniAdExt.n1("ad.chat.message"));
                xkVar.s0.setEnabled(!bool.booleanValue());
                if (bool.booleanValue()) {
                    xkVar.s0.setText("");
                }
                xkVar.t0.setEnabled(true ^ bool.booleanValue());
                xkVar.v0.setVisibility(bool.booleanValue() ? 0 : 8);
                break;
            case 2:
                List list = (List) obj;
                te teVar = (te) ((s) obj2).e;
                af1 af1Var = teVar.a;
                int i2 = teVar.g + 1;
                teVar.g = i2;
                List list2 = teVar.e;
                if (list != list2) {
                    List list3 = teVar.f;
                    if (list == null) {
                        int size = list2.size();
                        teVar.e = null;
                        teVar.f = Collections.EMPTY_LIST;
                        af1Var.c(0, size);
                        teVar.a(list3);
                    } else if (list2 != null) {
                        ((Executor) teVar.b.d).execute(new qe(teVar, list2, list, i2));
                    } else {
                        teVar.e = list;
                        teVar.f = DesugarCollections.unmodifiableList(list);
                        af1Var.n(0, list.size());
                        teVar.a(list3);
                    }
                    break;
                }
                break;
            case 3:
                ConnectionFragment connectionFragment = (ConnectionFragment) obj2;
                Integer num2 = (Integer) obj;
                int iIntValue = num2.intValue();
                if (connectionFragment.z1 != null && iIntValue > 0) {
                    connectionFragment.v1(0);
                }
                r3.J(connectionFragment.z1, iIntValue);
                r3.J(connectionFragment.A1, num2.intValue());
                break;
            case 4:
                FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) obj2;
                List list4 = (List) obj;
                x00 x00Var = fileManagerFileListFragment.b0;
                if (x00Var != null && x00Var.j && !list4.isEmpty()) {
                    if (!x00Var.k && fileManagerFileListFragment.d0) {
                        int i3 = 9;
                        if (fileManagerFileListFragment.c0) {
                            t70.V(new l(i3, fileManagerFileListFragment));
                        } else {
                            t70.V(new l(i3, fileManagerFileListFragment));
                            t70.V(new l(i3, fileManagerFileListFragment));
                        }
                    }
                    x00Var.k = true;
                    v00 v00Var = (v00) x00Var.E.d();
                    if (v00Var != null) {
                        x00Var.x(false, v00Var.b, false);
                    }
                    fileManagerFileListFragment.j1();
                    fileManagerFileListFragment.h1();
                }
                break;
            case 5:
                sx0 sx0Var = (sx0) obj;
                NavigationView navigationView = ((MainActivity) obj2).M;
                if (navigationView != null && (childAt = navigationView.k.d.getChildAt(0)) != null) {
                    int i4 = R.drawable.ic_online_na;
                    if (sx0Var != null) {
                        int iR = q51.r(sx0Var.a);
                        if (iR == 3) {
                            i4 = R.drawable.ic_online_off;
                        } else if (iR == 4) {
                            i4 = R.drawable.ic_online_on;
                        }
                    }
                    ((ImageView) childAt.findViewById(R.id.nav_header_network_info)).setImageResource(i4);
                }
                break;
            default:
                tp0 tp0Var = (tp0) obj2;
                sx0 sx0Var2 = (sx0) obj;
                vy0 vy0Var = tp0Var.I0;
                if (sx0Var2 != null) {
                    if (!vy0Var.a()) {
                        tp0Var.S0(sx0Var2);
                        vy0Var.c(300L, 300L);
                    } else {
                        tp0Var.G0.addLast(sx0Var2);
                    }
                    break;
                }
                break;
        }
    }
}
