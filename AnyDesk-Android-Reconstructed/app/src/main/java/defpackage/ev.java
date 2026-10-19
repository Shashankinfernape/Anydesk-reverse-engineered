package defpackage;

import android.app.Dialog;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class ev implements w6, r6, wu0, g7, k80, as, j6, ku, w70 {
    public final /* synthetic */ int c;
    public Object d;

    public ev(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.c = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.d = new n90(uri, clipDescription, uri2);
        } else {
            this.d = new y6(uri, clipDescription, uri2, 13);
        }
    }

    @Override // defpackage.as
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        for (MessageDigest messageDigest : (MessageDigest[]) this.d) {
            byteBuffer.position(iPosition);
            messageDigest.update(byteBuffer);
        }
    }

    @Override // defpackage.ku
    public boolean b(float f) {
        if (f == 0.0f) {
            return false;
        }
        g();
        ((NestedScrollView) this.d).j((int) f);
        return true;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        if (r3.b(map.values())) {
            JniAdExt.k4();
        } else {
            if (JniAdExt.p3(io.KEY_AUDIO_TRANSMIT_MODE)) {
                return;
            }
            ((sl0) this.d).a();
            JniAdExt.k4();
        }
    }

    @Override // defpackage.as
    public void d(int i, int i2, byte[] bArr) {
        for (MessageDigest messageDigest : (MessageDigest[]) this.d) {
            messageDigest.update(bArr, 0, i2);
        }
    }

    @Override // defpackage.k80
    public void e(j11 j11Var, boolean z) {
        MainApplication mainApplication = (MainApplication) this.d;
        Logging logging = mainApplication.d;
        if (z) {
            mainApplication.l();
            logging.e("BOWL start");
            logging.e("BOWL res: " + mainApplication.S.e().j(mainApplication.getPackageName()));
            logging.e("GPRES start");
            logging.e("GPRES res: " + mainApplication.S.e().b(mainApplication.getPackageName()));
            logging.e("GPWES start");
            logging.e("GPWES res: " + mainApplication.S.e().g(mainApplication.getPackageName()));
            logging.e("GPMES start");
            logging.e("GPMES res: " + mainApplication.S.e().h(mainApplication.getPackageName()));
            logging.e("GPSAW start");
            logging.e("GPSAW res: " + mainApplication.S.e().k(mainApplication.getPackageName()));
        }
    }

    @Override // defpackage.ku
    public float f() {
        return -((NestedScrollView) this.d).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.ku
    public void g() {
        ((NestedScrollView) this.d).f.abortAnimation();
    }

    @Override // defpackage.r6
    public void h(String str) {
        switch (this.c) {
            case 4:
                ez.T0((ez) this.d, str);
                break;
            case 5:
                iz.T0((iz) this.d, str);
                break;
            default:
                xz.T0((xz) this.d, str);
                break;
        }
    }

    @Override // defpackage.g7
    public void i(d80 d80Var) {
        k90 k90Var = (k90) d80Var;
        ad0 ad0Var = (ad0) ((bc) this.d).d;
        if (ad0Var == null) {
            return;
        }
        switch (q51.r(k90Var.a)) {
            case 1:
                ad0Var.b(k90Var.b, k90Var.c, k90Var.d, k90Var.e);
                break;
            case 2:
                ad0Var.o(k90Var.f, k90Var.g, k90Var.h, k90Var.i);
                break;
            case 3:
                ad0Var.t();
                break;
            case 4:
                ad0Var.x();
                break;
            case 5:
                ad0Var.u(k90Var.k);
                break;
            case 6:
                ad0Var.c(k90Var.j);
                break;
        }
    }

    public synchronized void j() {
        this.d = null;
    }

    @Override // defpackage.r6
    public boolean k() {
        switch (this.c) {
            case 4:
                ez ezVar = (ez) this.d;
                Dialog dialog = ezVar.k0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                ez.S0(ezVar);
                break;
            case 5:
                iz izVar = (iz) this.d;
                Dialog dialog2 = izVar.k0;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                FileManagerFileListFragment fileManagerFileListFragment = izVar.r0;
                Button button = izVar.L0;
                if (fileManagerFileListFragment != null && button != null && button.isEnabled()) {
                    boolean z = izVar.s0;
                    String str = izVar.x0;
                    boolean z2 = fileManagerFileListFragment.c0;
                    if (z2 == z) {
                        fileManagerFileListFragment.T0(z2, str, false);
                    }
                }
                break;
            default:
                xz xzVar = (xz) this.d;
                Dialog dialog3 = xzVar.k0;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                xz.S0(xzVar);
                break;
        }
        return true;
    }

    @Override // defpackage.w70
    public void l(vf1 vf1Var) {
        ev evVar = ((ns0) this.d).f;
        evVar.getClass();
        ah ahVar = (ah) evVar.d;
        tf1 tf1Var = vf1Var instanceof tf1 ? (tf1) vf1Var : null;
        ReentrantLock reentrantLock = (ReentrantLock) ahVar.d;
        try {
            reentrantLock.lock();
            if (tf1Var != null) {
                ahVar.c = tf1Var;
            }
            bc bcVar = (bc) ahVar.a;
            bc bcVar2 = (bc) ahVar.b;
            bcVar.getClass();
            bcVar2.getClass();
            if (bu0.G(vf1Var, (vf1) bcVar.d, xg0.d)) {
                bcVar.j0(vf1Var);
            }
            if (bu0.G(vf1Var, (vf1) bcVar2.d, xg0.e)) {
                bcVar2.j0(vf1Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public v41 m(xg0 xg0Var) {
        ah ahVar = (ah) this.d;
        int iOrdinal = xg0Var.ordinal();
        if (iOrdinal == 1) {
            return (v41) ((bc) ahVar.a).e;
        }
        if (iOrdinal == 2) {
            return (v41) ((bc) ahVar.b).e;
        }
        id.q("invalid load type for hints");
        return null;
    }

    public void n() {
        ((e40) this.d).v.O();
    }

    public void o(int i, int i2) {
        kq0 kq0Var = (kq0) this.d;
        kq0Var.j = i;
        kq0Var.k = i2;
        int i3 = kq0Var.h;
        if (i3 > 0) {
            kq0Var.l = ((double) i) / ((double) i3);
        }
        int i4 = kq0Var.i;
        if (i4 > 0) {
            kq0Var.m = ((double) i2) / ((double) i4);
        }
        kq0Var.c.d1(i, i2);
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i;
        int i2 = 2;
        int i3 = 1;
        switch (this.c) {
            case 7:
                if (menuItem.getItemId() == R.id.menu_filemanager_overflow_search) {
                    FileManagerFileListFragment.Q0(((yz) this.d).d);
                    return true;
                }
                if (menuItem.getItemId() == R.id.menu_filemanager_overflow_refresh) {
                    JniAdExt.I0.post(new fb0(7, ((yz) this.d).d.c0));
                    return true;
                }
                if (menuItem.getItemId() == R.id.menu_filemanager_overflow_sort) {
                    FileManagerFileListFragment fileManagerFileListFragment = ((yz) this.d).d;
                    bc bcVar = fileManagerFileListFragment.e0;
                    x00 x00Var = fileManagerFileListFragment.b0;
                    if (bcVar == null || x00Var == null) {
                        return true;
                    }
                    boolean z = fileManagerFileListFragment.c0;
                    int iD = gr0.d(x00Var.o(z));
                    boolean z2 = fileManagerFileListFragment.c0;
                    synchronized (x00Var.d) {
                        try {
                            i = z2 ? x00Var.U : x00Var.V;
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    int iR = q51.r(i);
                    s00 s00Var = new s00();
                    Bundle bundle = new Bundle();
                    if (iD == 0 || iD == 1) {
                        if (iR >= 0 && iR < q51.s(3).length) {
                            bundle.putBoolean("skey_is_local", z);
                            bundle.putInt("skey_sort_order", iD);
                            bundle.putInt("skey_sort_type_local", iR);
                            s00Var.N0(bundle);
                            bcVar.p0(s00Var, "FileManagerSortFileListDialog", true);
                            return true;
                        }
                        id.q("invalid sort type");
                    } else {
                        id.q("invalid sort order");
                    }
                } else {
                    if (menuItem.getItemId() == R.id.menu_filemanager_overflow_delete) {
                        FileManagerFileListFragment fileManagerFileListFragment2 = ((yz) this.d).d;
                        x00 x00Var2 = fileManagerFileListFragment2.b0;
                        if (x00Var2 == null) {
                            return true;
                        }
                        v00 v00Var = (v00) (fileManagerFileListFragment2.c0 ? x00Var2.G : x00Var2.E).d();
                        if (v00Var == null) {
                            return true;
                        }
                        JniAdExt.I0.post(new fc0(fileManagerFileListFragment2.c0, v00Var.a, i3));
                        x00Var2.x(fileManagerFileListFragment2.c0, v00Var.b, false);
                        fileManagerFileListFragment2.a1(fileManagerFileListFragment2.c0, false);
                        x00Var2.h(fileManagerFileListFragment2.c0);
                        return true;
                    }
                    if (menuItem.getItemId() == R.id.menu_filemanager_overflow_dir_create) {
                        FileManagerFileListFragment fileManagerFileListFragment3 = ((yz) this.d).d;
                        bc bcVar2 = fileManagerFileListFragment3.e0;
                        if (bcVar2 == null) {
                            return true;
                        }
                        boolean z3 = fileManagerFileListFragment3.c0;
                        ez ezVar = new ez();
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("skey_is_local", z3);
                        bundle2.putString("skey_dir_name", JniAdExt.n1("ad.file_browser.new_folder"));
                        ezVar.N0(bundle2);
                        bcVar2.p0(ezVar, "FileManagerDirCreateDialog", true);
                        return true;
                    }
                    if (menuItem.getItemId() == R.id.menu_filemanager_overflow_properties) {
                        FileManagerFileListFragment fileManagerFileListFragment4 = ((yz) this.d).d;
                        x00 x00Var3 = fileManagerFileListFragment4.b0;
                        if (x00Var3 == null) {
                            return true;
                        }
                        v00 v00Var2 = (v00) (fileManagerFileListFragment4.c0 ? x00Var3.G : x00Var3.E).d();
                        if (v00Var2 == null) {
                            return true;
                        }
                        fileManagerFileListFragment4.b1(v00Var2.a, v00Var2.c, v00Var2.d, v00Var2.e);
                        return true;
                    }
                    if (menuItem.getItemId() == R.id.menu_filemanager_overflow_dir_goto) {
                        FileManagerFileListFragment fileManagerFileListFragment5 = ((yz) this.d).d;
                        bc bcVar3 = fileManagerFileListFragment5.e0;
                        x00 x00Var4 = fileManagerFileListFragment5.b0;
                        if (bcVar3 == null || x00Var4 == null) {
                            return true;
                        }
                        boolean z4 = fileManagerFileListFragment5.c0;
                        String strJ = x00Var4.j(z4);
                        iz izVar = new iz();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("skey_is_local", z4);
                        bundle3.putString("skey_current_path", strJ);
                        bundle3.putString("skey_new_path_manual_disp", strJ);
                        bundle3.putInt("skey_new_path_recents_sel_idx", 0);
                        bundle3.putInt("skey_radio_group_sel_idx", 0);
                        bundle3.putInt("skey_radio_group_child_count", 0);
                        izVar.N0(bundle3);
                        bcVar3.p0(izVar, "FileManagerDirGotoDialog", true);
                        return true;
                    }
                }
                return false;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                MainFragment mainFragment = ((qi0) this.d).d;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menu_incoming_permissions) {
                    m80 m80Var = mainFragment.a0;
                    if (m80Var == null) {
                        return true;
                    }
                    int i4 = MainApplication.v().D;
                    bc bcVar4 = ((MainActivity) m80Var).D;
                    if (bcVar4 == null) {
                        return true;
                    }
                    bcVar4.l0(i4, false);
                    return true;
                }
                if (itemId == R.id.menu_incoming_sync_clipboard) {
                    JniAdExt.v4();
                    return true;
                }
                if (itemId != R.id.menu_incoming_send_trace_file) {
                    return false;
                }
                JniAdExt.I0.post(new cb0(MainApplication.v().D, JniAdExt.w2(), i2));
                mainFragment.o1.u(mainFragment.a0(), JniAdExt.n1("ad.menu.incoming.send_trace_file.result"));
                return true;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                MainFragment mainFragment2 = ((qi0) this.d).d;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.context_addr_action_browse_files) {
                    MainFragment.S0(mainFragment2, mainFragment2.a1());
                    return true;
                }
                if (itemId2 != R.id.context_addr_action_vpn) {
                    return false;
                }
                String strA1 = mainFragment2.a1();
                m80 m80Var2 = mainFragment2.a0;
                if (m80Var2 == null) {
                    return true;
                }
                ((MainActivity) m80Var2).l0(strA1);
                return true;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                MainFragment mainFragment3 = ((si0) this.d).d;
                cj0 cj0Var = mainFragment3.c0;
                if (cj0Var == null) {
                    return false;
                }
                int itemId3 = menuItem.getItemId();
                if (itemId3 == R.id.dial_size_tile_big) {
                    cj0Var.p(1);
                } else if (itemId3 == R.id.dial_size_tile_small) {
                    cj0Var.p(2);
                } else if (itemId3 == R.id.dial_size_list) {
                    cj0Var.p(3);
                } else {
                    cj0Var.p(1);
                }
                mainFragment3.o1();
                return true;
            default:
                MainFragment mainFragment4 = ((si0) this.d).d;
                cj0 cj0Var2 = mainFragment4.c0;
                if (cj0Var2 == null) {
                    return false;
                }
                int itemId4 = menuItem.getItemId();
                if (itemId4 == R.id.dial_category_all) {
                    cj0Var2.o(1);
                } else if (itemId4 == R.id.dial_category_favorite) {
                    cj0Var2.o(2);
                } else if (itemId4 == R.id.dial_category_recent) {
                    cj0Var2.o(3);
                } else if (itemId4 == R.id.dial_category_discover) {
                    cj0Var2.o(4);
                } else {
                    cj0Var2.o(1);
                }
                mainFragment4.n1();
                return true;
        }
    }

    public synchronized void p(z80 z80Var) {
        this.d = z80Var;
    }

    @Override // defpackage.w6
    public boolean r() {
        kw kwVar = (kw) this.d;
        Dialog dialog = kwVar.k0;
        if (dialog != null) {
            dialog.dismiss();
        }
        kw.S0(kwVar);
        return true;
    }

    public ev(int i) {
        this.c = i;
        switch (i) {
            case 13:
                break;
            default:
                this.d = new ah(this);
                break;
        }
    }

    public ev(TextView textView) {
        this.c = 3;
        this.d = new ex(textView);
    }

    public ev(EditText editText) {
        this.c = 2;
        this.d = new bc(editText, 20);
    }

    public /* synthetic */ ev(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.w6
    public void t(t01 t01Var) {
    }
}
