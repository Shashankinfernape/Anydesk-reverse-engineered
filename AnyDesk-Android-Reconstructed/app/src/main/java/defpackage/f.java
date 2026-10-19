package defpackage;

import android.os.Process;
import android.os.UserHandle;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((i) obj).q0;
            case 1:
                return ((u) obj).q0;
            case 2:
                return ((AbookRosterFragment) obj).j0;
            case 3:
                return ((w0) obj).x0;
            case 4:
                return ((z0) obj).u0;
            case 5:
                return ((f1) obj).s0;
            case 6:
                return ((c5) obj).C0;
            case 7:
                return ((ez) obj).u0;
            case 8:
                return ((iz) obj).H0;
            case 9:
                return ((xz) obj).v0;
            case 10:
                return ((FileManagerFileListFragment) obj).E0;
            case 11:
                return ((MainFragment) obj).W0;
            case 12:
                pt ptVar = (pt) obj;
                try {
                    return Optional.of(Boolean.valueOf(Process.myUserHandle().equals((UserHandle) UserHandle.class.getField("OWNER").get(null))));
                } catch (Throwable th) {
                    ptVar.a.i("Can't check for system user by UserHandle#OWNER", th);
                    return Optional.empty();
                }
            case 13:
                return ((ju0) obj).t0;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return ((dz0) obj).t0;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return ((z11) obj).s0;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return ((e21) obj).w0;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return ((j21) obj).r0;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return ((t21) obj).v0;
            default:
                return ((TraceFragment) obj).h0;
        }
    }
}
