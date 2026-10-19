package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ui0 implements wu0, ld0, oc1 {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;

    public ui0(int i) {
        this.c = i;
        switch (i) {
            case 4:
                this.d = new ArrayList();
                break;
            case 13:
                this.e = new ArrayList();
                this.d = new g71();
                break;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                this.e = new i51(0);
                this.d = new xh0();
                break;
            default:
                this.e = new Logging("MotionStateManager");
                this.d = new Hashtable();
                break;
        }
    }

    @Override // defpackage.ld0
    public void G(int i, String str) {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.G(i, str);
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 6;
        hr0Var.b = i;
        hr0Var.g = str;
        arrayList.add(hr0Var);
    }

    @Override // defpackage.ld0
    public void H() {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.H();
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 2;
        arrayList.add(hr0Var);
    }

    @Override // defpackage.ld0
    public void L() {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.L();
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 5;
        arrayList.add(hr0Var);
    }

    @Override // defpackage.oc1
    public void a() {
        ((bc) this.e).g0(uc1.a);
    }

    public void b(ValueAnimator valueAnimator) {
        us0 us0Var = new us0(14);
        valueAnimator.addListener((g71) this.d);
        ((ArrayList) this.e).add(us0Var);
    }

    @Override // defpackage.ld0
    public void c(boolean z, gf gfVar) {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.c(z, gfVar);
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 3;
        hr0Var.e = z;
        hr0Var.f = gfVar;
        arrayList.add(hr0Var);
    }

    public void d(hx0 hx0Var, vl0 vl0Var) {
        i51 i51Var = (i51) this.e;
        te1 te1VarA = (te1) i51Var.get(hx0Var);
        if (te1VarA == null) {
            te1VarA = te1.a();
            i51Var.put(hx0Var, te1VarA);
        }
        te1VarA.c = vl0Var;
        te1VarA.a |= 8;
    }

    public void e() {
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.d = null;
    }

    @Override // defpackage.oc1
    public void f() {
        ((bs0) this.d).c.g0(Boolean.TRUE);
    }

    public Bundle g(String str) {
        Bundle bundle;
        f01 f01Var = (f01) this.e;
        if (!f01Var.g) {
            nh0.j("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = f01Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                bu0.u(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            f01Var.f = null;
        }
        return bundle;
    }

    public void h(int i) {
        int[] iArr = (int[]) this.e;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.e;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View i(int i, int i2, int i3, int i4) {
        View viewU;
        ae1 ae1Var = (ae1) this.d;
        pw0 pw0Var = (pw0) this.e;
        int iD = pw0Var.d();
        int iC = pw0Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (pw0Var.a) {
                case 0:
                    viewU = pw0Var.b.u(i);
                    break;
                default:
                    viewU = pw0Var.b.u(i);
                    break;
            }
            int iB = pw0Var.b(viewU);
            int iA = pw0Var.a(viewU);
            ae1Var.b = iD;
            ae1Var.c = iC;
            ae1Var.d = iB;
            ae1Var.e = iA;
            if (i3 != 0) {
                ae1Var.a = i3;
                if (ae1Var.a()) {
                    return viewU;
                }
            }
            if (i4 != 0) {
                ae1Var.a = i4;
                if (ae1Var.a()) {
                    view = viewU;
                }
            }
            i += i5;
        }
        return view;
    }

    public e01 j() {
        e01 e01Var;
        f01 f01Var = (f01) this.e;
        synchronized (f01Var.c) {
            Iterator it = f01Var.d.entrySet().iterator();
            do {
                e01Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                e01 e01Var2 = (e01) entry.getValue();
                if (y90.e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    e01Var = e01Var2;
                }
            } while (e01Var == null);
        }
        return e01Var;
    }

    public void k() {
        int i;
        TypedValue typedValue = new TypedValue();
        GlowActivity glowActivity = (GlowActivity) this.e;
        Resources.Theme theme = glowActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        glowActivity.setTheme(i);
    }

    public boolean l(View view) {
        ae1 ae1Var = (ae1) this.d;
        pw0 pw0Var = (pw0) this.e;
        int iD = pw0Var.d();
        int iC = pw0Var.c();
        int iB = pw0Var.b(view);
        int iA = pw0Var.a(view);
        ae1Var.b = iD;
        ae1Var.c = iC;
        ae1Var.d = iB;
        ae1Var.e = iA;
        ae1Var.a = 24579;
        return ae1Var.a();
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.e;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        h(i3);
        int[] iArr2 = (int[]) this.e;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.e, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w61 w61Var = (w61) ((ArrayList) this.d).get(size);
            int i4 = w61Var.c;
            if (i4 >= i) {
                w61Var.c = i4 + i2;
            }
        }
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.e;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        h(i3);
        int[] iArr2 = (int[]) this.e;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.e;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w61 w61Var = (w61) ((ArrayList) this.d).get(size);
            int i4 = w61Var.c;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.d).remove(size);
                } else {
                    w61Var.c = i4 - i2;
                }
            }
        }
    }

    @Override // defpackage.ld0
    public void o(String str, int i, ArrayList arrayList) {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.o(str, i, arrayList);
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 7;
        hr0Var.b = i;
        hr0Var.g = str;
        hr0Var.h = arrayList;
        arrayList2.add(hr0Var);
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        Uri uri;
        switch (this.c) {
            case 0:
                dj djVar = (dj) this.d;
                MainFragment mainFragment = (MainFragment) djVar.d;
                SpeedDialItem speedDialItem = (SpeedDialItem) this.e;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.dial_alias) {
                    mainFragment.e1(speedDialItem.getAddr());
                } else if (itemId == R.id.dial_id) {
                    mainFragment.e1(t70.f(speedDialItem.mCid));
                } else if (itemId == R.id.dial_delete) {
                    JniAdExt.Z3(speedDialItem.mId);
                    mainFragment.d1();
                } else if (itemId == R.id.dial_rename) {
                    bc bcVar = mainFragment.d0;
                    if (bcVar != null) {
                        bcVar.v0(speedDialItem.mUserDefinedName, speedDialItem.mId);
                    }
                } else if (itemId == R.id.dial_favorite) {
                    djVar.i(speedDialItem);
                } else if (itemId == R.id.dial_install_shortcut) {
                    int i = speedDialItem.mColor1;
                    int i2 = speedDialItem.mColor2;
                    String prettyAddr = speedDialItem.getPrettyAddr();
                    String str = speedDialItem.mThumbnailPath;
                    String displayName = speedDialItem.getDisplayName();
                    m80 m80Var = mainFragment.a0;
                    if (m80Var != null) {
                        MainActivity mainActivity = (MainActivity) m80Var;
                        mainActivity.F.e(mainActivity, i, i2, prettyAddr, str, displayName);
                    }
                } else if (itemId == R.id.dial_browse_files) {
                    MainFragment.S0(mainFragment, speedDialItem.getAddr());
                } else if (itemId == R.id.dial_vpn) {
                    String addr = speedDialItem.getAddr();
                    m80 m80Var2 = mainFragment.a0;
                    if (m80Var2 != null) {
                        ((MainActivity) m80Var2).l0(addr);
                    }
                } else if (itemId == R.id.dial_tcp_tunneling) {
                    long j = speedDialItem.mCid;
                    String str2 = speedDialItem.mAlias;
                    String prettyAddr2 = speedDialItem.getPrettyAddr();
                    m80 m80Var3 = mainFragment.a0;
                    if (m80Var3 != null) {
                        TcpTunnelFragment.T0((MainActivity) m80Var3, false, j, str2, prettyAddr2);
                    }
                } else {
                    if (itemId != R.id.dial_chat_history) {
                        return false;
                    }
                    JniAdExt.I0.post(new ra0(speedDialItem.mCid));
                }
                return true;
            case 1:
                nu nuVar = (nu) this.e;
                String str3 = nuVar.e;
                long j2 = nuVar.a;
                MainFragment mainFragment2 = (MainFragment) ((dj) this.d).d;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.discovery_alias) {
                    mainFragment2.e1(str3);
                } else if (itemId2 == R.id.discovery_id) {
                    mainFragment2.e1(t70.f(j2));
                } else if (itemId2 == R.id.discovery_browse_files) {
                    MainFragment.S0(mainFragment2, "" + j2);
                } else if (itemId2 == R.id.discovery_vpn) {
                    String str4 = "" + j2;
                    m80 m80Var4 = mainFragment2.a0;
                    if (m80Var4 != null) {
                        ((MainActivity) m80Var4).l0(str4);
                    }
                } else {
                    if (itemId2 != R.id.discovery_tcp_tunneling) {
                        return false;
                    }
                    long j3 = nuVar.a;
                    String strY = t70.y(str3, j3, nuVar.c);
                    m80 m80Var5 = mainFragment2.a0;
                    if (m80Var5 != null) {
                        TcpTunnelFragment.T0((MainActivity) m80Var5, false, j3, str3, strY);
                    }
                }
                return true;
            case 9:
                PermissionProfile permissionProfile = (PermissionProfile) this.e;
                j21 j21Var = (j21) this.d;
                int itemId3 = menuItem.getItemId();
                if (itemId3 == R.id.permission_profile_action_rename) {
                    bc bcVar2 = j21Var.q0;
                    if (bcVar2 != null) {
                        String str5 = permissionProfile.a;
                        bcVar2.u0(str5, str5);
                    }
                } else {
                    if (itemId3 != R.id.permission_profile_action_remove) {
                        return false;
                    }
                    JniAdExt.W1(permissionProfile.a);
                }
                return true;
            default:
                if (menuItem.getItemId() != R.id.context_notificationsound_default) {
                    return false;
                }
                SettingsFragmentGeneral settingsFragmentGeneral = (SettingsFragmentGeneral) this.d;
                gi giVar = settingsFragmentGeneral.a0;
                if (giVar != null) {
                    View view = (View) this.e;
                    synchronized (giVar) {
                        uri = (Uri) giVar.a;
                    }
                    settingsFragmentGeneral.R0(view, uri);
                }
                return true;
        }
    }

    public void p(Bundle bundle) {
        f01 f01Var = (f01) this.e;
        g01 g01Var = f01Var.a;
        if (!f01Var.e) {
            f01Var.a();
        }
        if (g01Var.R().d.compareTo(af0.f) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + g01Var.R().d).toString());
        }
        if (f01Var.g) {
            nh0.j("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                bu0.u("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        f01Var.f = bundle2;
        f01Var.g = true;
    }

    public void q(Bundle bundle) {
        f01 f01Var = (f01) this.e;
        Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        Bundle bundle2 = f01Var.f;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (f01Var.c) {
            for (Map.Entry entry : f01Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((e01) entry.getValue()).a();
                str.getClass();
                bundleA.getClass();
                bundleG.putBundle(str, bundleA);
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    public vl0 r(hx0 hx0Var, int i) {
        te1 te1Var;
        vl0 vl0Var;
        i51 i51Var = (i51) this.e;
        int iD = i51Var.d(hx0Var);
        if (iD >= 0 && (te1Var = (te1) i51Var.i(iD)) != null) {
            int i2 = te1Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                te1Var.a = i3;
                if (i == 4) {
                    vl0Var = te1Var.b;
                } else if (i == 8) {
                    vl0Var = te1Var.c;
                } else {
                    id.q("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    i51Var.g(iD);
                    te1Var.a = 0;
                    te1Var.b = null;
                    te1Var.c = null;
                    te1.d.c(te1Var);
                }
                return vl0Var;
            }
        }
        return null;
    }

    public void s(String str, e01 e01Var) {
        e01Var.getClass();
        f01 f01Var = (f01) this.e;
        synchronized (f01Var.c) {
            if (f01Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            f01Var.d.put(str, e01Var);
        }
    }

    public void t(hx0 hx0Var) {
        te1 te1Var = (te1) ((i51) this.e).get(hx0Var);
        if (te1Var == null) {
            return;
        }
        te1Var.a &= -2;
    }

    public String toString() {
        switch (this.c) {
            case 6:
                String str = "[ ";
                if (((r51) this.e) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((r51) this.e).j[i] + " ";
                    }
                }
                return str + "] " + ((r51) this.e);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ld0
    public void u() {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.u();
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 8;
        arrayList.add(hr0Var);
    }

    public void v(hx0 hx0Var) {
        xh0 xh0Var = (xh0) this.d;
        for (int iH = xh0Var.h() - 1; iH >= 0; iH--) {
            if (hx0Var == xh0Var.i(iH)) {
                Object[] objArr = xh0Var.e;
                Object obj = objArr[iH];
                Object obj2 = y90.d;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                xh0Var.c = true;
                break;
            }
        }
        te1 te1Var = (te1) ((i51) this.e).remove(hx0Var);
        if (te1Var != null) {
            te1Var.a = 0;
            te1Var.b = null;
            te1Var.c = null;
            te1.d.c(te1Var);
        }
    }

    @Override // defpackage.ld0
    public void w(int i) {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.w(i);
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 4;
        hr0Var.b = i;
        arrayList.add(hr0Var);
    }

    @Override // defpackage.ld0
    public void x(int i, int i2, int i3) {
        ld0 ld0Var = (ld0) this.e;
        if (ld0Var != null) {
            ld0Var.x(i, i2, i3);
            return;
        }
        ArrayList arrayList = (ArrayList) this.d;
        hr0 hr0Var = new hr0();
        hr0Var.a = 1;
        hr0Var.b = i;
        hr0Var.c = i2;
        hr0Var.d = i3;
        arrayList.add(hr0Var);
    }

    public void y() {
        if (!((f01) this.e).h) {
            nh0.j("Can not perform this action after onSaveInstanceState");
            return;
        }
        oa oaVar = (oa) this.d;
        if (oaVar == null) {
            oaVar = new oa(this);
        }
        this.d = oaVar;
        try {
            ve0.class.getDeclaredConstructor(null);
            oa oaVar2 = (oa) this.d;
            if (oaVar2 != null) {
                ((LinkedHashSet) oaVar2.b).add(ve0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ve0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void z(tk tkVar) {
        this.d = tkVar;
        View viewFindViewById = ((GlowActivity) this.e).findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new m61(this, viewFindViewById, 0));
    }

    public /* synthetic */ ui0(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ ui0(int i, boolean z) {
        this.c = i;
    }

    public ui0(f01 f01Var, int i) {
        this.c = i;
        switch (i) {
            case 8:
                this.e = f01Var;
                this.d = new ui0(f01Var, 7);
                break;
            default:
                this.e = f01Var;
                break;
        }
    }

    public ui0(zu0 zu0Var) {
        this.c = 6;
        this.d = zu0Var;
    }

    public ui0(pw0 pw0Var) {
        this.c = 14;
        this.e = pw0Var;
        ae1 ae1Var = new ae1();
        ae1Var.a = 0;
        this.d = ae1Var;
    }

    public ui0(bs0 bs0Var, bc bcVar) {
        this.c = 5;
        bcVar.getClass();
        this.d = bs0Var;
        this.e = bcVar;
    }

    public ui0(GlowActivity glowActivity) {
        this.c = 11;
        this.e = glowActivity;
        this.d = new nh0();
    }
}
