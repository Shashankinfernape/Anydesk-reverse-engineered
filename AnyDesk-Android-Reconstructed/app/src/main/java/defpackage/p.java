package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.anydesk.anydeskandroid.AnynetAccountInfo;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class p implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final Object d;
    public final /* synthetic */ Object e;

    public p(va1 va1Var) {
        this.c = 19;
        this.e = va1Var;
        Context context = va1Var.a.getContext();
        CharSequence charSequence = va1Var.h;
        o5 o5Var = new o5();
        o5Var.e = 4096;
        o5Var.g = 4096;
        o5Var.l = null;
        o5Var.m = null;
        o5Var.n = false;
        o5Var.o = false;
        o5Var.p = 16;
        o5Var.i = context;
        o5Var.a = charSequence;
        this.d = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                g gVar = (g) ((s) obj2).f;
                if (gVar != null) {
                    i iVar = gVar.c;
                    JniAdExt.u4(null);
                    JniAdExt.t4(((Roster) obj).mId);
                    Dialog dialog = iVar.k0;
                    if (dialog != null) {
                        dialog.cancel();
                    }
                }
                break;
            case 1:
                AbookRosterFragment abookRosterFragment = ((m0) obj2).j;
                if (abookRosterFragment != null) {
                    JniAdExt.u4(((fz0) obj).a);
                    c40 c40Var = abookRosterFragment.x;
                    if (c40Var != null && (view2 = c40Var.H) != null && view2.findViewById(R.id.abookRosterItemDetails) == null) {
                        uj.v(abookRosterFragment.Y(), R.id.abookRosterItemDetailsWrapper);
                    }
                }
                view.requestFocus();
                break;
            case 2:
                h3 h3Var = (h3) obj;
                if (!h3Var.b.g) {
                    h3Var.a();
                } else {
                    ((Runnable) obj2).run();
                }
                break;
            case 3:
                AccountLoggedInFragment accountLoggedInFragment = (AccountLoggedInFragment) obj2;
                String str = ((AnynetAccountInfo) obj).mUrl;
                if (!t70.R(accountLoggedInFragment.G0(), str, false)) {
                    t70.Q(accountLoggedInFragment.a0(), str, true);
                }
                break;
            case 4:
                t70.U(((e9) obj2).a0(), (String) obj);
                break;
            case 5:
                FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) ((s) obj2).f;
                if (fileManagerFileListFragment != null) {
                    fileManagerFileListFragment.X0();
                    fileManagerFileListFragment.T0(fileManagerFileListFragment.c0, (String) obj, false);
                }
                break;
            case 6:
                FileManagerFileListFragment fileManagerFileListFragment2 = ((uz) obj2).f;
                if (fileManagerFileListFragment2 != null) {
                    mz mzVar = (mz) obj;
                    fileManagerFileListFragment2.X0();
                    if (mzVar != null && mzVar.c()) {
                        fileManagerFileListFragment2.T0(fileManagerFileListFragment2.c0, mzVar.b(mzVar.b), mzVar.d());
                        break;
                    }
                }
                break;
            case 7:
                FileManagerFileListFragment fileManagerFileListFragment3 = ((uz) obj2).f;
                if (fileManagerFileListFragment3 != null) {
                    fileManagerFileListFragment3.X0();
                }
                ((tz) obj).B.requestFocus();
                break;
            case 8:
                t70.U(((vh0) obj2).a0(), (String) obj);
                break;
            case 9:
                i21 i21Var = (i21) ((s) obj2).f;
                if (i21Var != null) {
                    j21.S0(i21Var.c, (PermissionProfile) obj);
                }
                break;
            case 10:
                du0 du0Var = (du0) obj;
                r21 r21Var = (r21) obj2;
                if (!r21Var.I0 && r21Var.t0.b(du0Var)) {
                    JniAdExt.I0.post(new bb0(r21Var.r0, du0Var, !r21Var.t0.m.contains(du0Var)));
                }
                break;
            case 11:
                a41 a41Var = (a41) obj;
                bc bcVar = ((SetupFragment) obj2).d0;
                if (bcVar != null && a41Var != null) {
                    bcVar.p0(z31.V0(a41Var, 0), "SetupInfoDialog", true);
                    break;
                }
                break;
            case 12:
                dj djVar = ((k61) obj2).n;
                if (djVar != null) {
                    MainFragment.X0((MainFragment) djVar.d, t70.g(((nu) obj).a));
                }
                break;
            case 13:
                dj djVar2 = ((k61) obj2).n;
                if (djVar2 != null) {
                    MainFragment.X0((MainFragment) djVar2.d, ((RosterItem) obj).getAddr());
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                dj djVar3 = ((k61) obj2).n;
                if (djVar3 != null) {
                    String str2 = ((we0) obj).d;
                    if (!TextUtils.isEmpty(str2)) {
                        t70.U(((MainFragment) djVar3.d).a0(), str2);
                    }
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                dj djVar4 = ((k61) obj2).n;
                if (djVar4 != null) {
                    am0 am0Var = (am0) obj;
                    djVar4.j(am0Var.a, am0Var.g);
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                dj djVar5 = ((k61) obj2).n;
                if (djVar5 != null) {
                    yl0 yl0Var = (yl0) obj;
                    djVar5.j(yl0Var.a, yl0Var.g);
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                dj djVar6 = ((k61) obj2).n;
                if (djVar6 != null) {
                    wl0 wl0Var = (wl0) obj;
                    djVar6.j(wl0Var.a, wl0Var.g);
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                ez0 ez0Var = ((m81) obj2).e;
                if (ez0Var != null) {
                    ez0Var.m(((n81) obj).a);
                }
                break;
            default:
                va1 va1Var = (va1) obj2;
                Window.Callback callback = va1Var.k;
                if (callback != null && va1Var.l) {
                    callback.onMenuItemSelected(0, (o5) obj);
                    break;
                }
                break;
        }
    }

    public p(uz uzVar, mz mzVar, tz tzVar) {
        this.c = 7;
        this.e = uzVar;
        this.d = tzVar;
    }

    public /* synthetic */ p(Object obj, int i, Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public p(h3 h3Var, Runnable runnable) {
        this.c = 2;
        this.d = h3Var;
        this.e = runnable;
    }
}
