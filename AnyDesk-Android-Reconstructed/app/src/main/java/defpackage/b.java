package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVideo;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentRecording;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentVideo;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.NavigationMenuItemView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String text;
        Message message;
        Message message2;
        Message message3;
        int i;
        int i2;
        Message messageObtain = null;
        messageObtain = null;
        int i3 = 1;
        switch (this.c) {
            case 0:
                String string = ((Chip) view).getText().toString();
                d dVar = (d) this.d;
                boolean zContains = dVar.q0.contains(string);
                HashSet hashSet = dVar.q0;
                if (zContains) {
                    hashSet.remove(string);
                    view.setActivated(false);
                    return;
                } else {
                    hashSet.add(string);
                    view.setActivated(true);
                    return;
                }
            case 1:
                i.S0((i) this.d);
                return;
            case 2:
                f1 f1Var = (f1) this.d;
                AdEditText adEditText = f1Var.s0;
                if (adEditText == null || (text = adEditText.getText()) == null || text.isEmpty()) {
                    return;
                }
                f1Var.U0(text);
                return;
            case 3:
                l3 l3Var = ((k3) this.d).u0;
                if (l3Var == null) {
                    return;
                }
                boolean z = !l3Var.e();
                synchronized (l3Var) {
                    l3Var.c = z;
                }
                ((k3) this.d).V0();
                return;
            case 4:
                AccountLoggedInFragment accountLoggedInFragment = (AccountLoggedInFragment) this.d;
                String strO1 = JniAdExt.o1("ad.account.delete_account.href");
                if (t70.R(accountLoggedInFragment.G0(), strO1, false)) {
                    return;
                }
                t70.Q(accountLoggedInFragment.a0(), strO1, true);
                return;
            case 5:
                t70.U(((s4) this.d).a0(), JniAdExt.o1("ad.account.register.not_possible.href"));
                return;
            case 6:
                c5.S0((c5) ((n4) this.d).b);
                return;
            case 7:
                String strO2 = JniAdExt.o1("ad.account.verify.resend.href");
                d5 d5Var = (d5) this.d;
                if (t70.R(d5Var.G0(), strO2, false)) {
                    return;
                }
                t70.Q(d5Var.a0(), strO2, true);
                return;
            case 8:
                ((a6) this.d).a();
                return;
            case 9:
                u7 u7Var = (u7) this.d;
                if (view == u7Var.i && (message3 = u7Var.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == u7Var.l && (message2 = u7Var.n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == u7Var.o && (message = u7Var.q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                u7Var.F.obtainMessage(1, u7Var.b).sendToTarget();
                return;
            case 10:
                e9 e9Var = (e9) this.d;
                int i4 = (int) e9Var.v0;
                int[] iArrS = q51.s(11);
                int length = iArrS.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        i = iArrS[i5];
                        switch (i) {
                            case 1:
                                i2 = 0;
                                break;
                            case 2:
                                i2 = 1;
                                break;
                            case 3:
                                i2 = 10;
                                break;
                            case 4:
                                i2 = 13;
                                break;
                            case 5:
                                i2 = 20;
                                break;
                            case 6:
                                i2 = 23;
                                break;
                            case 7:
                                i2 = 100;
                                break;
                            case 8:
                                i2 = 101;
                                break;
                            case 9:
                                i2 = 102;
                                break;
                            case 10:
                                i2 = 103;
                                break;
                            case 11:
                                i2 = 104;
                                break;
                            default:
                                throw null;
                        }
                        if (i2 != i4) {
                            i5++;
                        }
                    } else {
                        i = 0;
                    }
                }
                if (i != 0 && q51.r(i) == 6) {
                    String str = e9Var.r0;
                    m80 m80Var = e9Var.p0;
                    if (m80Var != null) {
                        ((MainActivity) m80Var).k0(str);
                    }
                }
                e9Var.O0(false, false);
                return;
            case 11:
                if (JniAdExt.s2(8) != 0) {
                    return;
                }
                ConnectionSettingsFragmentVideo connectionSettingsFragmentVideo = (ConnectionSettingsFragmentVideo) this.d;
                connectionSettingsFragmentVideo.c0.u(connectionSettingsFragmentVideo.a0(), JniAdExt.r2(1));
                return;
            case 12:
                t40 t40VarE0 = ((n4) this.d).b.e0();
                xk xkVar = new xk();
                Bundle bundle = new Bundle();
                bundle.putInt("session_idx", 0);
                xkVar.N0(bundle);
                t70.Y(new eu(t40VarE0, true, "ChatDialog", xkVar));
                return;
            case 13:
                CheckBox checkBox = ((az) this.d).y0;
                if (checkBox == null) {
                    return;
                }
                checkBox.setChecked(!checkBox.isChecked());
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                CheckBox checkBox2 = ((cz) this.d).A0;
                if (checkBox2 == null) {
                    return;
                }
                checkBox2.setChecked(!checkBox2.isChecked());
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                ((iz) ((n4) this.d).b).X0();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                s00 s00Var = (s00) this.d;
                s00Var.s0 = s00Var.s0 != 2 ? 2 : 1;
                s00Var.S0();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                t70.U(((ih0) this.d).a0(), JniAdExt.o1("ad.accept.warn.link.href"));
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                Runnable runnable = ((ol0) this.d).y0.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                yo0 yo0Var = (yo0) this.d;
                qo0 qo0Var = yo0Var.g;
                if (qo0Var != null) {
                    qo0Var.f = true;
                }
                vk0 itemData = navigationMenuItemView.getItemData();
                boolean zQ = yo0Var.e.q(itemData, yo0Var, 0);
                if (itemData != null && itemData.isCheckable() && zQ) {
                    yo0Var.g.j(itemData);
                } else {
                    i3 = 0;
                }
                qo0 qo0Var2 = yo0Var.g;
                if (qo0Var2 != null) {
                    qo0Var2.f = false;
                }
                if (i3 != 0) {
                    yo0Var.h();
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                t70.U(((l01) this.d).a0(), JniAdExt.o1("ad.accept.warn.link.href"));
                return;
            case 21:
                z11.S0((z11) this.d);
                return;
            case 22:
                j21.T0((j21) this.d);
                return;
            case 23:
                if (JniAdExt.s2(15) != 0) {
                    return;
                }
                SettingsFragmentRecording settingsFragmentRecording = (SettingsFragmentRecording) this.d;
                settingsFragmentRecording.i0.u(settingsFragmentRecording.a0(), JniAdExt.r2(9));
                return;
            case 24:
                if (JniAdExt.s2(14) != 0) {
                    return;
                }
                SettingsFragmentVideo settingsFragmentVideo = (SettingsFragmentVideo) this.d;
                settingsFragmentVideo.B0.u(settingsFragmentVideo.a0(), JniAdExt.r2(7));
                return;
            case 25:
                Context contextA0 = ((SetupFragment) this.d).a0();
                Looper looper = t70.a;
                t70.U(contextA0, JniAdExt.o1("ad.menu.help.android.href"));
                return;
            case 26:
                if (((k61) this.d).n != null) {
                    MainApplication.v().B(R.id.settingsFragmentGeneralWrapper, v11.d);
                    return;
                }
                return;
            case 27:
                t81 t81Var = (t81) this.d;
                Rect rect = t81Var.s;
                xt0 xt0Var = t81Var.h0;
                if (xt0Var == null || t81Var.S == null || !t81Var.e) {
                    return;
                }
                boolean z2 = t81.c(rect.centerX(), rect.centerY(), (int) t81Var.d0, (int) t81Var.e0) <= ((double) t81Var.W);
                int[] iArr = t81Var.S;
                i3 = t81.c(iArr[0], iArr[1], (int) t81Var.d0, (int) t81Var.e0) > ((double) t81Var.Q) ? 0 : 1;
                if (z2) {
                    t81Var.e = false;
                    xt0Var.g(t81Var);
                    return;
                } else if (i3 != 0) {
                    xt0Var.g(t81Var);
                    return;
                } else {
                    if (t81Var.H) {
                        t81Var.e = false;
                        xt0Var.d(t81Var);
                        return;
                    }
                    return;
                }
            case 28:
                ma1 ma1Var = ((Toolbar) this.d).O;
                vk0 vk0Var = ma1Var != null ? ma1Var.d : null;
                if (vk0Var != null) {
                    vk0Var.collapseActionView();
                    return;
                }
                return;
            default:
                t70.U(((qc1) this.d).a0(), JniAdExt.o1("ad.cfg.sec.access.info_link.href"));
                return;
        }
    }
}
