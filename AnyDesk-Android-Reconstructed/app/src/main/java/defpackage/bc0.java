package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentPermissions;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bc0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    private final void a() {
        Object obj;
        synchronized (((vm0) this.d).a) {
            obj = ((vm0) this.d).f;
            ((vm0) this.d).f = vm0.k;
        }
        ((vm0) this.d).l(obj);
    }

    private final void b() {
        v01 v01Var = (v01) this.d;
        synchronized (v01Var) {
            try {
                vy0 vy0Var = v01Var.c;
                if (vy0Var != null && vy0Var.a()) {
                    vy0Var.d();
                    ConnectionFragment connectionFragment = v01Var.a;
                    if (connectionFragment != null) {
                        connectionFragment.g1(v01Var.d);
                    }
                    Looper looper = t70.a;
                    v01Var.e = SystemClock.uptimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (((m11) this.d).d) {
            try {
                Hashtable hashtable = ((m11) this.d).e;
                for (l11 l11Var : DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable)) {
                    if (l11Var.c && l11Var.d) {
                        l11Var.c = false;
                        l11Var.d = false;
                        l11Var.b = false;
                        ((m11) this.d).d(l11Var.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        vn0 vn0VarF;
        int i = 0;
        switch (this.c) {
            case 0:
                cj0 cj0Var = MainApplication.v().u;
                sx0 sx0Var = (sx0) this.d;
                synchronized (cj0Var) {
                    cj0Var.f.l(sx0Var);
                }
                return;
            case 1:
                e7 e7Var = (e7) this.d;
                JniAdExt.jniOnMotion(e7Var.a.c, e7Var.b.c, e7Var.c, e7Var.d.c, e7Var.e, e7Var.f, e7Var.g, e7Var.h, e7Var.i, e7Var.j, e7Var.k, e7Var.l.c, e7Var.m, e7Var.n, e7Var.o);
                return;
            case 2:
                bc bcVar = JniAdExt.o0;
                yc0 yc0Var = (yc0) this.d;
                ArrayList arrayList = (ArrayList) bcVar.e;
                bcVar.d = yc0Var;
                if (yc0Var != null) {
                    for (int size = arrayList.size(); i < size; size = size) {
                        Object obj = arrayList.get(i);
                        i++;
                        du duVar = (du) obj;
                        yc0 yc0Var2 = (yc0) bcVar.d;
                        switch (q51.r(duVar.a)) {
                            case 0:
                                yc0Var2.f();
                                continue;
                                arrayList = arrayList;
                                break;
                            case 1:
                                yc0Var2.p();
                                continue;
                                arrayList = arrayList;
                                break;
                            case 2:
                                yc0Var2.y(duVar.e, duVar.b, duVar.m, duVar.n);
                                continue;
                                arrayList = arrayList;
                                break;
                            case 3:
                                yc0Var2.s(duVar.b, duVar.c, duVar.d, duVar.e, duVar.i, duVar.j);
                                continue;
                                arrayList = arrayList;
                                break;
                            case 4:
                                yc0Var2.l(duVar.b, duVar.c, duVar.d, duVar.f, duVar.g, duVar.h, duVar.i, duVar.k, duVar.l);
                                continue;
                                arrayList = arrayList;
                                break;
                            case 5:
                                yc0Var2.r();
                                break;
                            case 6:
                                yc0Var2.A(duVar.o, duVar.p);
                                break;
                            case 7:
                                yc0Var2.v();
                                break;
                            case 8:
                                yc0Var2.q(duVar.q);
                                break;
                            case 9:
                                yc0Var2.z();
                                break;
                            case 10:
                                yc0Var2.B();
                                break;
                            case 11:
                                yc0Var2.k();
                                break;
                            case 12:
                                yc0Var2.h();
                                break;
                            case 13:
                                yc0Var2.i();
                                break;
                            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                                yc0Var2.J();
                                break;
                            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                                yc0Var2.M();
                                break;
                            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                                yc0Var2.j();
                                break;
                            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                yc0Var2.E();
                                break;
                            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                yc0Var2.g(duVar.r, duVar.s, duVar.t);
                                break;
                            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                yc0Var2.D();
                                break;
                            default:
                                Logging logging = new Logging("DialogQueueItem");
                                switch (duVar.a) {
                                    case 1:
                                        str = "FileManagerSystemPermission";
                                        break;
                                    case 2:
                                        str = "FileManagerSystemPermissionClose";
                                        break;
                                    case 3:
                                        str = "FileManagerDelConfirm";
                                        break;
                                    case 4:
                                        str = "FileManagerDirConflict";
                                        break;
                                    case 5:
                                        str = "FileManagerFileConflict";
                                        break;
                                    case 6:
                                        str = "FileManagerConflictClose";
                                        break;
                                    case 7:
                                        str = "AbookNativeMsg";
                                        break;
                                    case 8:
                                        str = "AbookLogout";
                                        break;
                                    case 9:
                                        str = "AccountOAuthWaiting";
                                        break;
                                    case 10:
                                        str = "AccountOAuthWaitingClose";
                                        break;
                                    case 11:
                                        str = "AccountOtp";
                                        break;
                                    case 12:
                                        str = "AccountOtpClose";
                                        break;
                                    case 13:
                                        str = "SetupPrompt";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                                        str = "SetupPromptClose";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                                        str = "AccountVerificationPending";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                                        str = "AccountVerificationPendingClose";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                        str = "OverlayPermission";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                        str = "OverlayPermissionClose";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                        str = "RegisterLicenseResult";
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                        str = "LanguageChangeRestart";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                                logging.c("Unhandled dialog queue command: ".concat(str));
                                break;
                        }
                        arrayList = arrayList;
                    }
                    arrayList.clear();
                    return;
                }
                return;
            case 3:
                ui0 ui0Var = JniAdExt.m0;
                ld0 ld0Var = (ld0) this.d;
                ArrayList arrayList2 = (ArrayList) ui0Var.d;
                ui0Var.e = ld0Var;
                if (ld0Var != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        hr0 hr0Var = (hr0) obj2;
                        ld0 ld0Var2 = (ld0) ui0Var.e;
                        switch (q51.r(hr0Var.a)) {
                            case 0:
                                ld0Var2.x(hr0Var.b, hr0Var.c, hr0Var.d);
                                break;
                            case 1:
                                ld0Var2.H();
                                break;
                            case 2:
                                ld0Var2.c(hr0Var.e, hr0Var.f);
                                break;
                            case 3:
                                ld0Var2.w(hr0Var.b);
                                break;
                            case 4:
                                ld0Var2.L();
                                break;
                            case 5:
                                ld0Var2.G(hr0Var.b, hr0Var.g);
                                break;
                            case 6:
                                ld0Var2.o(hr0Var.g, hr0Var.b, hr0Var.h);
                                break;
                            case 7:
                                ld0Var2.u();
                                break;
                            default:
                                Logging logging2 = new Logging("OutgoingDialogQueueItem");
                                switch (hr0Var.a) {
                                    case 1:
                                        str2 = "Dialog";
                                        break;
                                    case 2:
                                        str2 = "TwoFactorAuthDialog";
                                        break;
                                    case 3:
                                        str2 = "PasswordDialog";
                                        break;
                                    case 4:
                                        str2 = "ErrorDialog";
                                        break;
                                    case 5:
                                        str2 = "ResolveTcpTunnelConflictsDialog";
                                        break;
                                    case 6:
                                        str2 = "TerminalStdDialog";
                                        break;
                                    case 7:
                                        str2 = "TerminalListDialog";
                                        break;
                                    case 8:
                                        str2 = "Hide";
                                        break;
                                    default:
                                        str2 = "null";
                                        break;
                                }
                                logging2.c("Unhandled outgoing dialog queue command: ".concat(str2));
                                break;
                        }
                    }
                    arrayList2.clear();
                    return;
                }
                return;
            case 4:
                bc bcVar2 = JniAdExt.n0;
                zc0 zc0Var = (zc0) this.d;
                ArrayList arrayList3 = (ArrayList) bcVar2.e;
                bcVar2.d = zc0Var;
                if (zc0Var != null) {
                    int size3 = arrayList3.size();
                    while (i < size3) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        y80 y80Var = (y80) obj3;
                        zc0 zc0Var2 = (zc0) bcVar2.d;
                        int iR = q51.r(y80Var.a);
                        if (iR == 0) {
                            zc0Var2.e(y80Var.b);
                        } else if (iR == 1) {
                            zc0Var2.n(y80Var.c);
                        } else if (iR != 2) {
                            Logging logging3 = new Logging("IncomingDialogQueueItem");
                            int i2 = y80Var.a;
                            if (i2 == 1) {
                                str3 = "IncomingConnection";
                            } else if (i2 != 2) {
                                str3 = i2 != 3 ? "null" : "HideIncomingDialogs";
                            } else {
                                str3 = "ScamWarning";
                            }
                            logging3.c("Unhandled incoming dialog queue command: ".concat(str3));
                        } else {
                            zc0Var2.d(y80Var.c);
                        }
                    }
                    arrayList3.clear();
                    return;
                }
                return;
            case 5:
                ListView listView = ((bg0) this.d).d0;
                listView.focusableViewAvailable(listView);
                return;
            case 6:
                a();
                return;
            case 7:
                fh0 fh0Var = (fh0) this.d;
                fh0Var.a.setText(fh0Var.b);
                ih0 ih0Var = (ih0) fh0Var.c.b;
                ih0Var.A0 = true;
                ih0.S0(ih0Var);
                return;
            case 8:
                vh0 vh0Var = (vh0) ((c9) this.d).b;
                vh0Var.q0 = 0L;
                r3.F(vh0Var.t0, vh0Var.r0);
                r3.C(vh0Var.t0, true);
                return;
            case 9:
                MainApplication mainApplication = ((ei0) this.d).d;
                if (JniAdExt.i3() || mainApplication.a0) {
                    return;
                }
                long j = mainApplication.P + 120000;
                Looper looper = t70.a;
                if (j < SystemClock.uptimeMillis() && mainApplication.Q.isEmpty() && mainApplication.o0 == 1 && mainApplication.n0 == 1) {
                    mainApplication.Q();
                    mainApplication.d.e("terminating app due to inactivity");
                    System.exit(0);
                    return;
                }
                return;
            case 10:
                MainFragment.W0((MainFragment) ((b3) this.d).d);
                return;
            case 11:
                bo0 bo0VarP = uj.p((Activity) this.d);
                if (bo0VarP == null || (vn0VarF = bo0VarP.b.f()) == null || vn0VarF.d.a == R.id.mainFragment) {
                    return;
                }
                bo0VarP.d();
                return;
            case 12:
                j01 j01Var = (j01) this.d;
                Button button = j01Var.a;
                button.setText(j01Var.b);
                button.setEnabled(true);
                qa qaVar = j01Var.c;
                if (qaVar != null) {
                    Looper looper2 = t70.a;
                    button.setTextColor(uj.l(qaVar, R.color.colorScamWarningPositiveButtonEnabled));
                    return;
                }
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.d;
                if (searchView$SearchAutoComplete.h) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.h = false;
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                b();
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                c();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                j21 j21Var = (j21) this.d;
                PermissionProfile[] permissionProfileArrF2 = JniAdExt.F2();
                j21Var.u0.clear();
                if (permissionProfileArrF2 != null) {
                    Collections.addAll(j21Var.u0, permissionProfileArrF2);
                }
                j21Var.z0.d();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                ((SettingsFragmentPermissions) this.d).O0();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                ((StaggeredGridLayoutManager) this.d).D0();
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                int[] iArr = new int[2];
                b9 b9Var = (b9) this.d;
                ViewGroup viewGroup = (ViewGroup) b9Var.e;
                t81 t81Var = (t81) b9Var.f;
                Rect rect = t81Var.s;
                Rect rect2 = ((p81) b9Var.d).e;
                if (rect2 == null) {
                    nh0.j("Requesting bounds that are not set! Make sure your target is ready");
                    return;
                }
                rect.set(rect2);
                t81Var.getLocationInWindow(iArr);
                t81Var.s.offset(-iArr[0], -iArr[1]);
                if (viewGroup != null) {
                    viewGroup.getLocationInWindow(new int[2]);
                    t81Var.f0 = viewGroup.getHeight();
                }
                BitmapDrawable bitmapDrawable = t81Var.r.f;
                if (!t81Var.F || bitmapDrawable == null) {
                    t81Var.g0 = null;
                } else if (t81Var.g0 == null) {
                    t81Var.g0 = Bitmap.createBitmap(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(t81Var.g0);
                    bitmapDrawable.setColorFilter(new PorterDuffColorFilter(t81Var.v.getColor(), PorterDuff.Mode.SRC_ATOP));
                    bitmapDrawable.draw(canvas);
                    bitmapDrawable.setColorFilter(null);
                }
                t81Var.requestFocus();
                t81Var.O = t81Var.getTextBounds();
                int[] outerCircleCenterPoint = t81Var.getOuterCircleCenterPoint();
                t81Var.S = outerCircleCenterPoint;
                int i3 = outerCircleCenterPoint[0];
                int i4 = outerCircleCenterPoint[1];
                Rect rect3 = t81Var.O;
                Rect rect4 = t81Var.s;
                int iCenterX = rect4.centerX();
                int iCenterY = rect4.centerY();
                int i5 = (int) (t81Var.g * 1.1f);
                Rect rect5 = new Rect(iCenterX, iCenterY, iCenterX, iCenterY);
                int i6 = -i5;
                rect5.inset(i6, i6);
                t81Var.R = Math.max(t81.e(i3, i4, rect3), t81.e(i3, i4, rect5)) + t81Var.m;
                if (t81Var.I) {
                    return;
                }
                t81Var.e = false;
                t81Var.k0.start();
                t81Var.I = true;
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.d).e.i;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 21:
                ((Toolbar) this.d).v();
                return;
            case 22:
                ra1 ra1Var = (ra1) this.d;
                Window.Callback callback = ra1Var.k;
                Menu menuE0 = ra1Var.e0();
                rk0 rk0Var = menuE0 instanceof rk0 ? (rk0) menuE0 : null;
                if (rk0Var != null) {
                    rk0Var.w();
                }
                try {
                    menuE0.clear();
                    if (!callback.onCreatePanelMenu(0, menuE0) || !callback.onPreparePanel(0, null, menuE0)) {
                        menuE0.clear();
                    }
                    if (rk0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (rk0Var != null) {
                        rk0Var.v();
                    }
                }
                break;
            default:
                ((qe1) this.d).q(0);
                return;
        }
    }
}
