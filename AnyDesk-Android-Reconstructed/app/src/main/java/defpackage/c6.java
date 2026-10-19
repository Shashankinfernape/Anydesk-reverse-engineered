package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class c6 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public c6(MainFragment mainFragment, String str, int i) {
        this.c = 6;
        this.f = mainFragment;
        this.e = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vn0 vn0VarF;
        switch (this.c) {
            case 0:
                String[] strArr = (String[]) this.e;
                int[] iArr = new int[strArr.length];
                qa qaVar = (qa) this.f;
                PackageManager packageManager = qaVar.getPackageManager();
                String packageName = qaVar.getPackageName();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                }
                qaVar.onRequestPermissionsResult(this.d, strArr, iArr);
                return;
            case 1:
                ((TextView) this.e).setTypeface((Typeface) this.f, this.d);
                return;
            case 2:
                t70.f0((Context) this.e, (String) this.f, this.d, null);
                return;
            case 3:
                JniAdExt.m0.o(nd0.t((byte[]) this.f), this.d, (ArrayList) this.e);
                return;
            case 4:
                z80 z80Var = (z80) JniAdExt.C0.get(Integer.valueOf(this.d));
                if (z80Var != null) {
                    Hashtable hashtableF = JniAdExt.f((int[]) this.e);
                    z80Var.l = (PermissionProfile) this.f;
                    z80Var.n.clear();
                    z80Var.n.putAll(hashtableF);
                    zd zdVar = JniAdExt.A;
                    synchronized (zdVar) {
                        try {
                            td tdVar = new td(zdVar);
                            while (tdVar.hasNext()) {
                                fd0 fd0Var = (fd0) tdVar.next();
                                if (fd0Var != null) {
                                    fd0Var.D(this.d);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 5:
                JniAdExt.jniOnStringInputFallback(nd0.T((String) this.e), ((de0) this.f).c, q51.r(this.d));
                return;
            case 6:
                MainFragment mainFragment = (MainFragment) this.f;
                mainFragment.p1((String) this.e);
                int i2 = this.d;
                ImageView imageView = mainFragment.S0;
                if (imageView == null) {
                    return;
                }
                if (i2 == 2) {
                    imageView.setImageResource(R.drawable.ic_btn_vpn_connected);
                    return;
                } else {
                    imageView.setImageResource(R.drawable.ic_btn_vpn_disconnected);
                    return;
                }
            default:
                bo0 bo0VarP = uj.p((Activity) this.e);
                if (bo0VarP == null || (vn0VarF = bo0VarP.b.f()) == null) {
                    return;
                }
                int i3 = vn0VarF.d.a;
                int i4 = this.d;
                if (i3 != i4) {
                    bo0VarP.c(i4, (Bundle) this.f);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c6(Object obj, int i, Cloneable cloneable, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
        this.f = cloneable;
    }

    public /* synthetic */ c6(int i, int i2, Object obj, Object obj2) {
        this.c = i2;
        this.e = obj;
        this.f = obj2;
        this.d = i;
    }

    public c6(int i, PermissionProfile permissionProfile, int[] iArr) {
        this.c = 4;
        this.d = i;
        this.e = iArr;
        this.f = permissionProfile;
    }
}
