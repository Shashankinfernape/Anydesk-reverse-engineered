package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.anydesk.anydeskandroid.FileInfo;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends lk0 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ d00(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.lk0
    public final void D(String str, boolean z) {
        String strP;
        int i = this.k;
        Object obj = this.l;
        switch (i) {
            case 0:
                FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) obj;
                if (z) {
                    strP = E(str);
                } else {
                    String[] strArrSplit = str.split("/");
                    if (strArrSplit.length >= 1) {
                        strP = P(strArrSplit[strArrSplit.length - 1], false);
                    }
                }
                if (!TextUtils.isEmpty(strP)) {
                    x00 x00Var = fileManagerFileListFragment.b0;
                    if (x00Var != null) {
                        t70.X(new File(str), new File(x00Var.j(fileManagerFileListFragment.c0) + "/" + strP), fileManagerFileListFragment.Z);
                    }
                } else {
                    lk0.C(fileManagerFileListFragment.a0(), null);
                }
                break;
            case 1:
                t70.V(new c0(this, 11, str));
                break;
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                zd zdVar = MainActivity.j0;
                mainActivity.p0();
                if (str != null && new File(str).exists()) {
                    if (MainApplication.v().n0 != 1) {
                        t70.g0(mainActivity, JniAdExt.n1("ad.msg.connect_multi.android"), 1);
                        uj.v(mainActivity, R.id.connectionFragment);
                    } else if (!JniAdExt.g2(io.KEY_FEATURE_SESSION_PLAYBACK)) {
                        t70.g0(mainActivity, JniAdExt.n1("ad.dlg.availability.title"), 0);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("file", str);
                        uj.w(mainActivity, R.id.connectionFragment, bundle);
                    }
                    break;
                }
                break;
            default:
                MainApplication mainApplication = (MainApplication) obj;
                FileInfo fileInfoO2 = JniAdExt.o2(str);
                if (fileInfoO2 == null) {
                    mainApplication.d.a("Could not obtain file info for pending share file with URI path " + str);
                } else {
                    String str2 = fileInfoO2.path;
                    String str3 = fileInfoO2.name;
                    String str4 = fileInfoO2.directory;
                    xy xyVar = fileInfoO2.flags;
                    wy wyVar = fileInfoO2.attributes;
                    long j = fileInfoO2.size;
                    mz mzVar = new mz(true, str2, str3, str4, xyVar, wyVar, j, JniAdExt.p2(j), fileInfoO2.writeTime);
                    JniAdExt.u1(mainApplication.s, mzVar);
                    mainApplication.s.A(true, mzVar.a(), true);
                }
                break;
        }
    }

    @Override // defpackage.lk0
    public String E(String str) {
        switch (this.k) {
            case 0:
                return P(t70.N(str), true);
            default:
                return super.E(str);
        }
    }

    public String P(String str, boolean z) {
        FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) this.l;
        if (str == null || str.isEmpty()) {
            return null;
        }
        x00 x00Var = fileManagerFileListFragment.b0;
        if (x00Var == null || !x00Var.i(str, fileManagerFileListFragment.c0)) {
            return str;
        }
        String str2 = z ? "__%d_" : " (%d)";
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            String strConcat = str.concat(String.format(str2, 1));
            int i = 1;
            while (true) {
                x00 x00Var2 = fileManagerFileListFragment.b0;
                if (x00Var2 == null || !x00Var2.i(strConcat, fileManagerFileListFragment.c0)) {
                    break;
                }
                i++;
                strConcat = str.concat(String.format(str2, Integer.valueOf(i)));
            }
            return strConcat;
        }
        String string = str.substring(0, iLastIndexOf) + String.format(str2, 1) + str.substring(iLastIndexOf);
        int i2 = 1;
        while (true) {
            x00 x00Var3 = fileManagerFileListFragment.b0;
            if (x00Var3 == null || !x00Var3.i(string, fileManagerFileListFragment.c0)) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, iLastIndexOf));
            i2++;
            sb.append(String.format(str2, Integer.valueOf(i2)));
            sb.append(str.substring(iLastIndexOf));
            string = sb.toString();
        }
        return string;
    }
}
